package cc;

import hc.C1271A;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class Z extends AbstractC0921a0 implements K {

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14511u = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_queue");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14512v = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_delayed");

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14513w = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public S K(long j, I0 i02, Hb.i iVar) {
        return H.f14482a.K(j, i02, iVar);
    }

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        f0(runnable);
    }

    @Override // cc.AbstractC0921a0
    public final long c0() {
        Runnable runnable;
        X x2;
        X b2;
        if (d0()) {
            return 0L;
        }
        Y y10 = (Y) f14512v.get(this);
        if (y10 != null && C1271A.f17923b.get(y10) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (y10) {
                    try {
                        X[] xArr = y10.f17924a;
                        X x10 = xArr != null ? xArr[0] : null;
                        if (x10 == null) {
                            b2 = null;
                        } else {
                            b2 = ((nanoTime - x10.f14508a) > 0L ? 1 : ((nanoTime - x10.f14508a) == 0L ? 0 : -1)) >= 0 ? g0(x10) : false ? y10.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (b2 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14511u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof hc.n)) {
                if (obj == F.f14473c) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop1;
            }
            hc.n nVar = (hc.n) obj;
            Object d10 = nVar.d();
            if (d10 != hc.n.g) {
                runnable = (Runnable) d10;
                break;
            }
            hc.n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        Eb.l lVar = this.f14518e;
        if (((lVar == null || lVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f14511u.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof hc.n)) {
                if (obj2 != F.f14473c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j = hc.n.f17962f.get((hc.n) obj2);
            if (!(((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
        }
        Y y11 = (Y) f14512v.get(this);
        if (y11 != null) {
            synchronized (y11) {
                X[] xArr2 = y11.f17924a;
                x2 = xArr2 != null ? xArr2[0] : null;
            }
            if (x2 != null) {
                return h3.H.g(x2.f14508a - System.nanoTime(), 0L);
            }
        }
        return Long.MAX_VALUE;
    }

    public void f0(Runnable runnable) {
        if (!g0(runnable)) {
            G.f14479x.f0(runnable);
            return;
        }
        Thread Z7 = Z();
        if (Thread.currentThread() != Z7) {
            LockSupport.unpark(Z7);
        }
    }

    public final boolean g0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14511u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f14513w.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof hc.n)) {
                if (obj == F.f14473c) {
                    return false;
                }
                hc.n nVar = new hc.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            hc.n nVar2 = (hc.n) obj;
            int a9 = nVar2.a(runnable);
            if (a9 == 0) {
                return true;
            }
            if (a9 == 1) {
                hc.n c10 = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a9 == 2) {
                return false;
            }
        }
    }

    public final boolean h0() {
        Eb.l lVar = this.f14518e;
        if (!(lVar != null ? lVar.isEmpty() : true)) {
            return false;
        }
        Y y10 = (Y) f14512v.get(this);
        if (y10 != null && C1271A.f17923b.get(y10) != 0) {
            return false;
        }
        Object obj = f14511u.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof hc.n) {
            long j = hc.n.f17962f.get((hc.n) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == F.f14473c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [cc.Y, java.lang.Object] */
    public final void i0(long j, X x2) {
        int a9;
        Thread Z7;
        boolean z8 = f14513w.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14512v;
        if (z8) {
            a9 = 1;
        } else {
            Y y10 = (Y) atomicReferenceFieldUpdater.get(this);
            if (y10 == null) {
                ?? obj = new Object();
                obj.f14510c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.l.b(obj2);
                y10 = (Y) obj2;
            }
            a9 = x2.a(j, y10, this);
        }
        if (a9 != 0) {
            if (a9 == 1) {
                e0(j, x2);
                return;
            } else {
                if (a9 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        Y y11 = (Y) atomicReferenceFieldUpdater.get(this);
        if (y11 != null) {
            synchronized (y11) {
                X[] xArr = y11.f17924a;
                r4 = xArr != null ? xArr[0] : null;
            }
        }
        if (r4 != x2 || Thread.currentThread() == (Z7 = Z())) {
            return;
        }
        LockSupport.unpark(Z7);
    }

    @Override // cc.K
    public final void l(long j, C0944m c0944m) {
        long j10 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            V v10 = new V(this, j10 + nanoTime, c0944m);
            i0(nanoTime, v10);
            c0944m.u(new C0938j(v10, 1));
        }
    }

    @Override // cc.AbstractC0921a0
    public void shutdown() {
        X b2;
        G0.f14481a.set(null);
        f14513w.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14511u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            R7.a aVar = F.f14473c;
            if (obj != null) {
                if (!(obj instanceof hc.n)) {
                    if (obj != aVar) {
                        hc.n nVar = new hc.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((hc.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (c0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            Y y10 = (Y) f14512v.get(this);
            if (y10 == null) {
                return;
            }
            synchronized (y10) {
                b2 = C1271A.f17923b.get(y10) > 0 ? y10.b(0) : null;
            }
            if (b2 == null) {
                return;
            } else {
                e0(nanoTime, b2);
            }
        }
    }
}
