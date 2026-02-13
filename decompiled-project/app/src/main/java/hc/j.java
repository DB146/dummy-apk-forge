package hc;

import cc.C0944m;
import cc.H;
import cc.I0;
import cc.K;
import cc.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class j extends cc.A implements K {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17950v = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final cc.A f17951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f17953e;

    /* renamed from: f, reason: collision with root package name */
    public final l f17954f;
    private volatile int runningWorkers;

    /* renamed from: u, reason: collision with root package name */
    public final Object f17955u;

    /* JADX WARN: Multi-variable type inference failed */
    public j(cc.A a9, int i7) {
        this.f17951c = a9;
        this.f17952d = i7;
        K k = a9 instanceof K ? (K) a9 : null;
        this.f17953e = k == null ? H.f14482a : k;
        this.f17954f = new l();
        this.f17955u = new Object();
    }

    @Override // cc.K
    public final S K(long j, I0 i02, Hb.i iVar) {
        return this.f17953e.K(j, i02, iVar);
    }

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        Runnable X10;
        this.f17954f.a(runnable);
        if (f17950v.get(this) >= this.f17952d || !Y() || (X10 = X()) == null) {
            return;
        }
        this.f17951c.T(this, new i(0, this, X10));
    }

    @Override // cc.A
    public final void U(Hb.i iVar, Runnable runnable) {
        Runnable X10;
        this.f17954f.a(runnable);
        if (f17950v.get(this) >= this.f17952d || !Y() || (X10 = X()) == null) {
            return;
        }
        this.f17951c.U(this, new i(0, this, X10));
    }

    @Override // cc.A
    public final cc.A W(int i7) {
        AbstractC1273a.a(1);
        return 1 >= this.f17952d ? this : super.W(1);
    }

    public final Runnable X() {
        while (true) {
            Runnable runnable = (Runnable) this.f17954f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f17955u) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17950v;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f17954f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean Y() {
        synchronized (this.f17955u) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17950v;
            if (atomicIntegerFieldUpdater.get(this) >= this.f17952d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // cc.K
    public final void l(long j, C0944m c0944m) {
        this.f17953e.l(j, c0944m);
    }
}
