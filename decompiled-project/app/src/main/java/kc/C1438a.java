package kc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.v;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1438a extends Thread {

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19076w = AtomicIntegerFieldUpdater.newUpdater(C1438a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final l f19077a;

    /* renamed from: b, reason: collision with root package name */
    public final v f19078b;

    /* renamed from: c, reason: collision with root package name */
    public int f19079c;

    /* renamed from: d, reason: collision with root package name */
    public long f19080d;

    /* renamed from: e, reason: collision with root package name */
    public long f19081e;

    /* renamed from: f, reason: collision with root package name */
    public int f19082f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19083u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ExecutorC1439b f19084v;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public C1438a(ExecutorC1439b executorC1439b, int i7) {
        this.f19084v = executorC1439b;
        setDaemon(true);
        this.f19077a = new l();
        this.f19078b = new Object();
        this.f19079c = 4;
        this.nextParkedWorker = ExecutorC1439b.f19088y;
        Vb.d.f10239a.getClass();
        this.f19082f = Vb.d.f10240b.a().nextInt();
        f(i7);
    }

    public final h a(boolean z8) {
        h e2;
        h e10;
        ExecutorC1439b executorC1439b;
        long j;
        int i7 = this.f19079c;
        h hVar = null;
        l lVar = this.f19077a;
        ExecutorC1439b executorC1439b2 = this.f19084v;
        if (i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1439b.f19086w;
            do {
                executorC1439b = this.f19084v;
                j = atomicLongFieldUpdater.get(executorC1439b);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f19112b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.f19102b.f1468a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i10 = l.f19114d.get(lVar);
                    int i11 = l.f19113c.get(lVar);
                    while (true) {
                        if (i10 == i11 || l.f19115e.get(lVar) == 0) {
                            break;
                        }
                        i11--;
                        h c10 = lVar.c(i11, true);
                        if (c10 != null) {
                            hVar = c10;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) executorC1439b2.f19094f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!ExecutorC1439b.f19086w.compareAndSet(executorC1439b, j, j - 4398046511104L));
            this.f19079c = 1;
        }
        if (z8) {
            boolean z10 = d(executorC1439b2.f19089a * 2) == 0;
            if (z10 && (e10 = e()) != null) {
                return e10;
            }
            lVar.getClass();
            h hVar4 = (h) l.f19112b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z10 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e11 = e();
            if (e11 != null) {
                return e11;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i10 = this.f19082f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f19082f = i13;
        int i14 = i7 - 1;
        return (i14 & i7) == 0 ? i13 & i14 : (i13 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i7;
    }

    public final h e() {
        int d10 = d(2);
        ExecutorC1439b executorC1439b = this.f19084v;
        if (d10 == 0) {
            h hVar = (h) executorC1439b.f19093e.d();
            return hVar != null ? hVar : (h) executorC1439b.f19094f.d();
        }
        h hVar2 = (h) executorC1439b.f19094f.d();
        return hVar2 != null ? hVar2 : (h) executorC1439b.f19093e.d();
    }

    public final void f(int i7) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19084v.f19092d);
        sb2.append("-worker-");
        sb2.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb2.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i7) {
        int i10 = this.f19079c;
        boolean z8 = i10 == 1;
        if (z8) {
            ExecutorC1439b.f19086w.addAndGet(this.f19084v, 4398046511104L);
        }
        if (i10 != i7) {
            this.f19079c = i7;
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i7) {
        int i10;
        h hVar;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1439b.f19086w;
        ExecutorC1439b executorC1439b = this.f19084v;
        int i11 = (int) (atomicLongFieldUpdater.get(executorC1439b) & 2097151);
        h hVar2 = null;
        if (i11 < 2) {
            return null;
        }
        int d10 = d(i11);
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        while (i12 < i11) {
            int i13 = d10 + 1;
            if (i13 > i11) {
                i13 = 1;
            }
            C1438a c1438a = (C1438a) executorC1439b.f19095u.b(i13);
            if (c1438a == null || c1438a == this) {
                i10 = i13;
            } else {
                l lVar = c1438a.f19077a;
                if (i7 == 3) {
                    hVar = lVar.b();
                } else {
                    lVar.getClass();
                    int i14 = l.f19114d.get(lVar);
                    int i15 = l.f19113c.get(lVar);
                    boolean z8 = i7 == 1;
                    while (i14 != i15 && (!z8 || l.f19115e.get(lVar) != 0)) {
                        int i16 = i14 + 1;
                        hVar = lVar.c(i14, z8);
                        if (hVar != null) {
                            break;
                        }
                        i14 = i16;
                    }
                    hVar = hVar2;
                }
                v vVar = this.f19078b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f19112b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f19102b.f1468a == 1 ? 1 : 2) & i7) == 0) {
                            break;
                        }
                        j.f19109f.getClass();
                        i10 = i13;
                        long nanoTime = System.nanoTime() - hVar3.f19101a;
                        long j11 = j.f19105b;
                        if (nanoTime < j11) {
                            j = j11 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar3, null)) {
                                vVar.f19134a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar3);
                        i13 = i10;
                        hVar2 = null;
                    }
                } else {
                    vVar.f19134a = hVar;
                    i10 = i13;
                }
                j = -1;
                if (j == -1) {
                    h hVar4 = (h) vVar.f19134a;
                    vVar.f19134a = hVar2;
                    return hVar4;
                }
                if (j > 0) {
                    j10 = Math.min(j10, j);
                }
            }
            i12++;
            d10 = i10;
            hVar2 = null;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        this.f19081e = j10;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i7;
        loop0: while (true) {
            boolean z8 = false;
            while (true) {
                ExecutorC1439b executorC1439b = this.f19084v;
                executorC1439b.getClass();
                int i10 = 5;
                if (ExecutorC1439b.f19087x.get(executorC1439b) == 0 && this.f19079c != 5) {
                    h a9 = a(this.f19083u);
                    int i11 = 3;
                    if (a9 != null) {
                        this.f19081e = 0L;
                        int i12 = a9.f19102b.f1468a;
                        this.f19080d = 0L;
                        if (this.f19079c == 3) {
                            this.f19079c = 2;
                        }
                        ExecutorC1439b executorC1439b2 = this.f19084v;
                        if (i12 != 0 && h(2) && !executorC1439b2.T() && !executorC1439b2.P(ExecutorC1439b.f19086w.get(executorC1439b2))) {
                            executorC1439b2.T();
                        }
                        executorC1439b2.getClass();
                        try {
                            a9.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i12 != 0) {
                            ExecutorC1439b.f19086w.addAndGet(executorC1439b2, -2097152L);
                            if (this.f19079c != 5) {
                                this.f19079c = 4;
                            }
                        }
                    } else {
                        this.f19083u = false;
                        if (this.f19081e == 0) {
                            Object obj = this.nextParkedWorker;
                            R7.a aVar = ExecutorC1439b.f19088y;
                            if (obj != aVar) {
                                f19076w.set(this, -1);
                                while (this.nextParkedWorker != ExecutorC1439b.f19088y) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19076w;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        ExecutorC1439b executorC1439b3 = this.f19084v;
                                        executorC1439b3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC1439b.f19087x;
                                        if (atomicIntegerFieldUpdater2.get(executorC1439b3) == 0 && this.f19079c != i10) {
                                            h(i11);
                                            Thread.interrupted();
                                            if (this.f19080d == 0) {
                                                this.f19080d = System.nanoTime() + this.f19084v.f19091c;
                                            }
                                            LockSupport.parkNanos(this.f19084v.f19091c);
                                            if (System.nanoTime() - this.f19080d >= 0) {
                                                this.f19080d = 0L;
                                                ExecutorC1439b executorC1439b4 = this.f19084v;
                                                synchronized (executorC1439b4.f19095u) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(executorC1439b4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC1439b.f19086w;
                                                            if (((int) (atomicLongFieldUpdater2.get(executorC1439b4) & 2097151)) > executorC1439b4.f19089a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i13 = this.indexInArray;
                                                                    f(0);
                                                                    executorC1439b4.K(this, i13, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(executorC1439b4) & 2097151);
                                                                    if (andDecrement != i13) {
                                                                        Object b2 = executorC1439b4.f19095u.b(andDecrement);
                                                                        kotlin.jvm.internal.l.b(b2);
                                                                        C1438a c1438a = (C1438a) b2;
                                                                        executorC1439b4.f19095u.c(i13, c1438a);
                                                                        c1438a.f(i13);
                                                                        executorC1439b4.K(c1438a, andDecrement, i13);
                                                                    }
                                                                    executorC1439b4.f19095u.c(andDecrement, null);
                                                                    this.f19079c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i10 = 5;
                                            i11 = 3;
                                        }
                                    }
                                }
                            } else {
                                ExecutorC1439b executorC1439b5 = this.f19084v;
                                executorC1439b5.getClass();
                                if (this.nextParkedWorker == aVar) {
                                    do {
                                        atomicLongFieldUpdater = ExecutorC1439b.f19085v;
                                        j = atomicLongFieldUpdater.get(executorC1439b5);
                                        i7 = this.indexInArray;
                                        this.nextParkedWorker = executorC1439b5.f19095u.b((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(executorC1439b5, j, ((j + 2097152) & (-2097152)) | i7));
                                }
                            }
                        } else {
                            if (z8) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f19081e);
                                this.f19081e = 0L;
                                break;
                            }
                            z8 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
