package kc;

import A9.C0154x0;
import cc.F;
import h3.o;
import hc.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC1439b implements Executor, Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19085v = AtomicLongFieldUpdater.newUpdater(ExecutorC1439b.class, "parkedWorkersStack");

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19086w = AtomicLongFieldUpdater.newUpdater(ExecutorC1439b.class, "controlState");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19087x = AtomicIntegerFieldUpdater.newUpdater(ExecutorC1439b.class, "_isTerminated");

    /* renamed from: y, reason: collision with root package name */
    public static final R7.a f19088y = new R7.a("NOT_IN_STACK", 28);
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f19089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19090b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19091c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f19092d;

    /* renamed from: e, reason: collision with root package name */
    public final e f19093e;

    /* renamed from: f, reason: collision with root package name */
    public final e f19094f;
    private volatile long parkedWorkersStack;

    /* renamed from: u, reason: collision with root package name */
    public final s f19095u;

    /* JADX WARN: Type inference failed for: r4v10, types: [hc.l, kc.e] */
    /* JADX WARN: Type inference failed for: r4v9, types: [hc.l, kc.e] */
    public ExecutorC1439b(int i7, int i10, long j, String str) {
        this.f19089a = i7;
        this.f19090b = i10;
        this.f19091c = j;
        this.f19092d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(A3.c.f(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(X.c.e(i10, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(A3.c.f(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f19093e = new hc.l();
        this.f19094f = new hc.l();
        this.f19095u = new s((i7 + 1) * 2);
        this.controlState = i7 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void F(ExecutorC1439b executorC1439b, Runnable runnable, int i7) {
        executorC1439b.n(runnable, j.g, (i7 & 4) == 0);
    }

    public final void K(C1438a c1438a, int i7, int i10) {
        while (true) {
            long j = f19085v.get(this);
            int i11 = (int) (2097151 & j);
            long j10 = (2097152 + j) & (-2097152);
            if (i11 == i7) {
                if (i10 == 0) {
                    Object c10 = c1438a.c();
                    while (true) {
                        if (c10 == f19088y) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        C1438a c1438a2 = (C1438a) c10;
                        int b2 = c1438a2.b();
                        if (b2 != 0) {
                            i11 = b2;
                            break;
                        }
                        c10 = c1438a2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f19085v.compareAndSet(this, j, i11 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean P(long j) {
        int i7 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.f19089a;
        if (i7 < i10) {
            int l10 = l();
            if (l10 == 1 && i10 > 1) {
                l();
            }
            if (l10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean T() {
        R7.a aVar;
        int i7;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19085v;
            long j = atomicLongFieldUpdater.get(this);
            C1438a c1438a = (C1438a) this.f19095u.b((int) (2097151 & j));
            if (c1438a == null) {
                c1438a = null;
            } else {
                long j10 = (2097152 + j) & (-2097152);
                Object c10 = c1438a.c();
                while (true) {
                    aVar = f19088y;
                    if (c10 == aVar) {
                        i7 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i7 = 0;
                        break;
                    }
                    C1438a c1438a2 = (C1438a) c10;
                    i7 = c1438a2.b();
                    if (i7 != 0) {
                        break;
                    }
                    c10 = c1438a2.c();
                }
                if (i7 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j10 | i7)) {
                    c1438a.g(aVar);
                }
            }
            if (c1438a == null) {
                return false;
            }
            if (C1438a.f19076w.compareAndSet(c1438a, -1, 0)) {
                LockSupport.unpark(c1438a);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i7;
        h hVar;
        if (f19087x.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C1438a c1438a = currentThread instanceof C1438a ? (C1438a) currentThread : null;
            if (c1438a == null || !kotlin.jvm.internal.l.a(c1438a.f19084v, this)) {
                c1438a = null;
            }
            synchronized (this.f19095u) {
                i7 = (int) (f19086w.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i10 = 1;
                while (true) {
                    Object b2 = this.f19095u.b(i10);
                    kotlin.jvm.internal.l.b(b2);
                    C1438a c1438a2 = (C1438a) b2;
                    if (c1438a2 != c1438a) {
                        while (c1438a2.isAlive()) {
                            LockSupport.unpark(c1438a2);
                            c1438a2.join(10000L);
                        }
                        l lVar = c1438a2.f19077a;
                        e eVar = this.f19094f;
                        lVar.getClass();
                        h hVar2 = (h) l.f19112b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b10 = lVar.b();
                            if (b10 == null) {
                                break;
                            } else {
                                eVar.a(b10);
                            }
                        }
                    }
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f19094f.b();
            this.f19093e.b();
            while (true) {
                if (c1438a != null) {
                    hVar = c1438a.a(true);
                }
                hVar = (h) this.f19093e.d();
                if (hVar == null && (hVar = (h) this.f19094f.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (c1438a != null) {
                c1438a.h(5);
            }
            f19085v.set(this, 0L);
            f19086w.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        F(this, runnable, 6);
    }

    public final int l() {
        synchronized (this.f19095u) {
            try {
                if (f19087x.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f19086w;
                long j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j & 2097151);
                int i10 = i7 - ((int) ((j & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f19089a) {
                    return 0;
                }
                if (i7 >= this.f19090b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f19095u.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C1438a c1438a = new C1438a(this, i11);
                this.f19095u.c(i11, c1438a);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                c1438a.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, C0154x0 c0154x0, boolean z8) {
        h iVar;
        int i7;
        j.f19109f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f19101a = nanoTime;
            iVar.f19102b = c0154x0;
        } else {
            iVar = new i(runnable, nanoTime, c0154x0);
        }
        boolean z10 = false;
        boolean z11 = iVar.f19102b.f1468a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19086w;
        long addAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        C1438a c1438a = currentThread instanceof C1438a ? (C1438a) currentThread : null;
        if (c1438a == null || !kotlin.jvm.internal.l.a(c1438a.f19084v, this)) {
            c1438a = null;
        }
        if (c1438a != null && (i7 = c1438a.f19079c) != 5 && (iVar.f19102b.f1468a != 0 || i7 != 2)) {
            c1438a.f19083u = true;
            l lVar = c1438a.f19077a;
            if (z8) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f19112b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f19102b.f1468a == 1 ? this.f19094f.a(iVar) : this.f19093e.a(iVar))) {
                throw new RejectedExecutionException(o.p(new StringBuilder(), this.f19092d, " was terminated"));
            }
        }
        if (z8 && c1438a != null) {
            z10 = true;
        }
        if (z11) {
            if (z10 || T() || P(addAndGet)) {
                return;
            }
            T();
            return;
        }
        if (z10 || T() || P(atomicLongFieldUpdater.get(this))) {
            return;
        }
        T();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f19095u;
        int a9 = sVar.a();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a9; i14++) {
            C1438a c1438a = (C1438a) sVar.b(i14);
            if (c1438a != null) {
                l lVar = c1438a.f19077a;
                lVar.getClass();
                int i15 = l.f19112b.get(lVar) != null ? (l.f19113c.get(lVar) - l.f19114d.get(lVar)) + 1 : l.f19113c.get(lVar) - l.f19114d.get(lVar);
                int b2 = P.c.b(c1438a.f19079c);
                if (b2 == 0) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (b2 == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (b2 == 2) {
                    i11++;
                } else if (b2 == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (b2 == 4) {
                    i13++;
                }
            }
        }
        long j = f19086w.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f19092d);
        sb5.append('@');
        sb5.append(F.q(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f19089a;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f19090b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i7);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f19093e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f19094f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
