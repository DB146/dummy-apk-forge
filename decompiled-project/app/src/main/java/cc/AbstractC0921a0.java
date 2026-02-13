package cc;

import hc.AbstractC1273a;

/* renamed from: cc.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0921a0 extends A {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14515f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f14516c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14517d;

    /* renamed from: e, reason: collision with root package name */
    public Eb.l f14518e;

    @Override // cc.A
    public final A W(int i7) {
        AbstractC1273a.a(1);
        return this;
    }

    public final void X(boolean z8) {
        long j = this.f14516c - (z8 ? 4294967296L : 1L);
        this.f14516c = j;
        if (j <= 0 && this.f14517d) {
            shutdown();
        }
    }

    public final void Y(N n6) {
        Eb.l lVar = this.f14518e;
        if (lVar == null) {
            lVar = new Eb.l();
            this.f14518e = lVar;
        }
        lVar.addLast(n6);
    }

    public abstract Thread Z();

    public final void a0(boolean z8) {
        this.f14516c = (z8 ? 4294967296L : 1L) + this.f14516c;
        if (z8) {
            return;
        }
        this.f14517d = true;
    }

    public final boolean b0() {
        return this.f14516c >= 4294967296L;
    }

    public abstract long c0();

    public final boolean d0() {
        Eb.l lVar = this.f14518e;
        if (lVar == null) {
            return false;
        }
        N n6 = (N) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (n6 == null) {
            return false;
        }
        n6.run();
        return true;
    }

    public void e0(long j, X x2) {
        G.f14479x.i0(j, x2);
    }

    public abstract void shutdown();
}
