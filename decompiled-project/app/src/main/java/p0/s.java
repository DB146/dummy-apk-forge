package p0;

import A0.J;
import Q.C0480b;
import Q.C0481b0;
import Q.C0487e0;
import Q.E0;
import a0.AbstractC0688o;
import ia.C1358d;
import l0.InterfaceC1445d;
import o0.AbstractC1775c;

/* loaded from: classes.dex */
public final class s extends AbstractC1775c {

    /* renamed from: e, reason: collision with root package name */
    public final C0487e0 f23028e = C0480b.o(new i0.e(0));

    /* renamed from: f, reason: collision with root package name */
    public final C0487e0 f23029f = C0480b.o(Boolean.FALSE);
    public final o g;

    /* renamed from: h, reason: collision with root package name */
    public final C0481b0 f23030h;

    /* renamed from: i, reason: collision with root package name */
    public float f23031i;
    public j0.i j;
    public int k;

    public s(b bVar) {
        o oVar = new o(bVar);
        oVar.f23020f = new J(this, 19);
        this.g = oVar;
        this.f23030h = new C0481b0(0);
        this.f23031i = 1.0f;
        this.k = -1;
    }

    @Override // o0.AbstractC1775c
    public final void a(float f4) {
        this.f23031i = f4;
    }

    @Override // o0.AbstractC1775c
    public final void b(j0.i iVar) {
        this.j = iVar;
    }

    @Override // o0.AbstractC1775c
    public final long e() {
        return ((i0.e) this.f23028e.getValue()).f18185a;
    }

    @Override // o0.AbstractC1775c
    public final void f(InterfaceC1445d interfaceC1445d) {
        j0.i iVar = this.j;
        o oVar = this.g;
        if (iVar == null) {
            iVar = (j0.i) oVar.g.getValue();
        }
        if (((Boolean) this.f23029f.getValue()).booleanValue() && interfaceC1445d.getLayoutDirection() == V0.l.f9983b) {
            long D10 = interfaceC1445d.D();
            Q7.h u3 = interfaceC1445d.u();
            long D11 = u3.D();
            u3.x().i();
            try {
                ((C1358d) u3.f8695b).t(-1.0f, 1.0f, D10);
                oVar.e(interfaceC1445d, this.f23031i, iVar);
            } finally {
                u3.x().g();
                u3.U(D11);
            }
        } else {
            oVar.e(interfaceC1445d, this.f23031i, iVar);
        }
        C0481b0 c0481b0 = this.f23030h;
        this.k = ((E0) AbstractC0688o.t(c0481b0.f8377b, c0481b0)).f8301c;
    }
}
