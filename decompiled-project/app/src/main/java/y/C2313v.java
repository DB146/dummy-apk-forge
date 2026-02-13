package y;

import A0.InterfaceC0026o;
import l0.C1443b;
import l0.InterfaceC1445d;

/* renamed from: y.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313v extends c0.l implements InterfaceC0026o {

    /* renamed from: C, reason: collision with root package name */
    public final A.i f26529C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f26530D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26531E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26532F;

    public C2313v(A.i iVar) {
        this.f26529C = iVar;
    }

    @Override // c0.l
    public final void h0() {
        cc.F.B(d0(), null, 0, new C2312u(this, null), 3);
    }

    @Override // A0.InterfaceC0026o
    public final void t(A0.N n6) {
        n6.a();
        boolean z8 = this.f26530D;
        C1443b c1443b = n6.f90a;
        if (z8) {
            InterfaceC1445d.s(n6, j0.n.b(j0.n.f18548b, 0.3f), c1443b.v(), 0.0f, null, 122);
        } else if (this.f26531E || this.f26532F) {
            InterfaceC1445d.s(n6, j0.n.b(j0.n.f18548b, 0.1f), c1443b.v(), 0.0f, null, 122);
        }
    }
}
