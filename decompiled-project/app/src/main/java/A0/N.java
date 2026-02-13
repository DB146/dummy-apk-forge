package A0;

import a.AbstractC0672a;
import j0.AbstractC1362A;
import j0.C1368f;
import l0.AbstractC1444c;
import l0.C1443b;
import l0.InterfaceC1445d;
import m0.C1533b;

/* loaded from: classes.dex */
public final class N implements InterfaceC1445d {

    /* renamed from: a, reason: collision with root package name */
    public final C1443b f90a = new C1443b();

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0026o f91b;

    @Override // V0.c
    public final int B(float f4) {
        return this.f90a.B(f4);
    }

    @Override // l0.InterfaceC1445d
    public final long D() {
        return this.f90a.D();
    }

    @Override // l0.InterfaceC1445d
    public final void F(long j, long j10, long j11, float f4, AbstractC1444c abstractC1444c, j0.i iVar, int i7) {
        this.f90a.F(j, j10, j11, f4, abstractC1444c, iVar, i7);
    }

    @Override // V0.c
    public final long G(long j) {
        return this.f90a.G(j);
    }

    @Override // V0.c
    public final float J(long j) {
        return this.f90a.J(j);
    }

    @Override // V0.c
    public final long P(float f4) {
        return this.f90a.P(f4);
    }

    @Override // V0.c
    public final float W(int i7) {
        return this.f90a.W(i7);
    }

    public final void a() {
        C1443b c1443b = this.f90a;
        j0.l x2 = c1443b.f19142b.x();
        InterfaceC0024m interfaceC0024m = this.f91b;
        if (interfaceC0024m == null) {
            throw X.c.c("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        c0.l lVar = (c0.l) interfaceC0024m;
        c0.l lVar2 = lVar.f14113a.f14118f;
        if (lVar2 != null && (lVar2.f14116d & 4) != 0) {
            while (lVar2 != null) {
                int i7 = lVar2.f14115c;
                if ((i7 & 2) != 0) {
                    break;
                } else if ((i7 & 4) != 0) {
                    break;
                } else {
                    lVar2 = lVar2.f14118f;
                }
            }
        }
        lVar2 = null;
        if (lVar2 == null) {
            n0 r10 = AbstractC0017g.r(interfaceC0024m, 4);
            if (r10.t0() == lVar.f14113a) {
                r10 = r10.f274A;
                kotlin.jvm.internal.l.b(r10);
            }
            r10.I0(x2, (C1533b) c1443b.f19142b.f8696c);
            return;
        }
        S.e eVar = null;
        while (lVar2 != null) {
            if (lVar2 instanceof InterfaceC0026o) {
                InterfaceC0026o interfaceC0026o = (InterfaceC0026o) lVar2;
                C1533b c1533b = (C1533b) c1443b.f19142b.f8696c;
                n0 r11 = AbstractC0017g.r(interfaceC0026o, 4);
                long u3 = AbstractC0672a.u(r11.f26556c);
                L l10 = r11.f293z;
                l10.getClass();
                ((B0.D) O.a(l10)).getSharedDrawScope().b(x2, u3, r11, interfaceC0026o, c1533b);
            } else if ((lVar2.f14115c & 4) != 0 && (lVar2 instanceof AbstractC0025n)) {
                int i10 = 0;
                for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                    if ((lVar3.f14115c & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            lVar2 = lVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new S.e(new c0.l[16]);
                            }
                            if (lVar2 != null) {
                                eVar.b(lVar2);
                                lVar2 = null;
                            }
                            eVar.b(lVar3);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            lVar2 = AbstractC0017g.e(eVar);
        }
    }

    @Override // V0.c
    public final float a0(float f4) {
        return f4 / this.f90a.k();
    }

    public final void b(j0.l lVar, long j, n0 n0Var, InterfaceC0026o interfaceC0026o, C1533b c1533b) {
        InterfaceC0026o interfaceC0026o2 = this.f91b;
        this.f91b = interfaceC0026o;
        V0.l lVar2 = n0Var.f293z.f54M;
        C1443b c1443b = this.f90a;
        V0.c y10 = c1443b.f19142b.y();
        Q7.h hVar = c1443b.f19142b;
        V0.l B10 = hVar.B();
        j0.l x2 = hVar.x();
        long D10 = hVar.D();
        C1533b c1533b2 = (C1533b) hVar.f8696c;
        hVar.Q(n0Var);
        hVar.S(lVar2);
        hVar.P(lVar);
        hVar.U(j);
        hVar.f8696c = c1533b;
        lVar.i();
        try {
            interfaceC0026o.t(this);
            lVar.g();
            hVar.Q(y10);
            hVar.S(B10);
            hVar.P(x2);
            hVar.U(D10);
            hVar.f8696c = c1533b2;
            this.f91b = interfaceC0026o2;
        } catch (Throwable th) {
            lVar.g();
            hVar.Q(y10);
            hVar.S(B10);
            hVar.P(x2);
            hVar.U(D10);
            hVar.f8696c = c1533b2;
            throw th;
        }
    }

    public final void c(C1368f c1368f, long j, AbstractC1444c abstractC1444c) {
        C1443b c1443b = this.f90a;
        c1443b.f19141a.f19139c.k(c1368f, C1443b.a(c1443b, j, abstractC1444c, 1.0f, null, 3));
    }

    @Override // V0.c
    public final float f() {
        return this.f90a.f();
    }

    @Override // l0.InterfaceC1445d
    public final void g(j0.z zVar, AbstractC1362A abstractC1362A, float f4, AbstractC1444c abstractC1444c, int i7) {
        this.f90a.g(zVar, abstractC1362A, f4, abstractC1444c, i7);
    }

    @Override // l0.InterfaceC1445d
    public final V0.l getLayoutDirection() {
        return this.f90a.f19141a.f19138b;
    }

    @Override // V0.c
    public final float k() {
        return this.f90a.k();
    }

    @Override // V0.c
    public final long n(float f4) {
        return this.f90a.n(f4);
    }

    @Override // l0.InterfaceC1445d
    public final void o(R7.b bVar, long j, long j10, long j11, float f4, j0.i iVar, int i7) {
        this.f90a.o(bVar, j, j10, j11, f4, iVar, i7);
    }

    @Override // V0.c
    public final float p(float f4) {
        return this.f90a.k() * f4;
    }

    @Override // l0.InterfaceC1445d
    public final Q7.h u() {
        return this.f90a.f19142b;
    }

    @Override // l0.InterfaceC1445d
    public final long v() {
        return this.f90a.v();
    }

    @Override // V0.c
    public final float y(long j) {
        return this.f90a.y(j);
    }
}
