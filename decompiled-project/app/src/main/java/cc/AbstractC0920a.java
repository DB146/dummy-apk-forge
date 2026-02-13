package cc;

import hc.AbstractC1273a;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0920a extends w0 implements Hb.d, E {

    /* renamed from: c, reason: collision with root package name */
    public final Hb.i f14514c;

    public AbstractC0920a(Hb.i iVar, boolean z8, boolean z10) {
        super(z10);
        if (z8) {
            G((InterfaceC0937i0) iVar.get(B.f14467b));
        }
        this.f14514c = iVar.plus(this);
    }

    @Override // cc.w0
    public final void E(Db.d dVar) {
        F.t(this.f14514c, dVar);
    }

    @Override // cc.w0
    public final void O(Object obj) {
        if (!(obj instanceof C0955v)) {
            X(obj);
            return;
        }
        C0955v c0955v = (C0955v) obj;
        W(C0955v.f14582b.get(c0955v) != 0, c0955v.f14583a);
    }

    public void W(boolean z8, Throwable th) {
    }

    public void X(Object obj) {
    }

    public final void Y(int i7, AbstractC0920a abstractC0920a, Rb.e eVar) {
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            E6.b.B(eVar, abstractC0920a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                kotlin.jvm.internal.l.e(eVar, "<this>");
                com.bumptech.glide.c.F(com.bumptech.glide.c.m(abstractC0920a, this, eVar)).resumeWith(Db.q.f3365a);
                return;
            }
            if (b2 != 3) {
                throw new Db.d(1);
            }
            try {
                Hb.i iVar = this.f14514c;
                Object m10 = AbstractC1273a.m(iVar, null);
                try {
                    kotlin.jvm.internal.y.b(2, eVar);
                    Object invoke = eVar.invoke(abstractC0920a, this);
                    if (invoke != Ib.a.f5345a) {
                        resumeWith(invoke);
                    }
                } finally {
                    AbstractC1273a.g(iVar, m10);
                }
            } catch (Throwable th) {
                resumeWith(com.bumptech.glide.c.n(th));
            }
        }
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f14514c;
    }

    @Override // cc.E
    public final Hb.i l() {
        return this.f14514c;
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        Throwable a9 = Db.m.a(obj);
        if (a9 != null) {
            obj = new C0955v(false, a9);
        }
        Object K10 = K(obj);
        if (K10 == F.f14475e) {
            return;
        }
        m(K10);
    }

    @Override // cc.w0
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
