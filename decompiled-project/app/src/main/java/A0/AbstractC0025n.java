package A0;

import u.C2041D;
import x0.AbstractC2256a;

/* renamed from: A0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0025n extends c0.l {

    /* renamed from: C, reason: collision with root package name */
    public final int f268C = o0.e(this);

    /* renamed from: D, reason: collision with root package name */
    public c0.l f269D;

    @Override // c0.l
    public final void f0() {
        super.f0();
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.o0(this.f14120v);
            if (!lVar.f14112B) {
                lVar.f0();
            }
        }
    }

    @Override // c0.l
    public final void g0() {
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.g0();
        }
        super.g0();
    }

    @Override // c0.l
    public final void k0() {
        super.k0();
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.k0();
        }
    }

    @Override // c0.l
    public final void l0() {
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.l0();
        }
        super.l0();
    }

    @Override // c0.l
    public final void m0() {
        super.m0();
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.m0();
        }
    }

    @Override // c0.l
    public final void n0(c0.l lVar) {
        this.f14113a = lVar;
        for (c0.l lVar2 = this.f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
            lVar2.n0(lVar);
        }
    }

    @Override // c0.l
    public final void o0(n0 n0Var) {
        this.f14120v = n0Var;
        for (c0.l lVar = this.f269D; lVar != null; lVar = lVar.f14118f) {
            lVar.o0(n0Var);
        }
    }

    public final InterfaceC0024m p0(InterfaceC0024m interfaceC0024m) {
        c0.l lVar = ((c0.l) interfaceC0024m).f14113a;
        if (lVar != interfaceC0024m) {
            c0.l lVar2 = interfaceC0024m instanceof c0.l ? (c0.l) interfaceC0024m : null;
            c0.l lVar3 = lVar2 != null ? lVar2.f14117e : null;
            if (lVar == this.f14113a && kotlin.jvm.internal.l.a(lVar3, this)) {
                return interfaceC0024m;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (lVar.f14112B) {
            AbstractC2256a.b("Cannot delegate to an already attached node");
        }
        lVar.n0(this.f14113a);
        int i7 = this.f14115c;
        int f4 = o0.f(lVar);
        lVar.f14115c = f4;
        int i10 = this.f14115c;
        int i11 = f4 & 2;
        if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof InterfaceC0035y)) {
            AbstractC2256a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lVar);
        }
        lVar.f14118f = this.f269D;
        this.f269D = lVar;
        lVar.f14117e = this;
        r0(f4 | this.f14115c, false);
        if (this.f14112B) {
            if (i11 == 0 || (i7 & 2) != 0) {
                o0(this.f14120v);
            } else {
                C0018g0 c0018g0 = AbstractC0017g.t(this).f60S;
                this.f14113a.o0(null);
                c0018g0.h();
            }
            lVar.f0();
            lVar.l0();
            if (!lVar.f14112B) {
                AbstractC2256a.b("autoInvalidateInsertedNode called on unattached node");
            }
            o0.a(lVar, -1, 1);
        }
        return interfaceC0024m;
    }

    public final void q0(InterfaceC0024m interfaceC0024m) {
        c0.l lVar = null;
        for (c0.l lVar2 = this.f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
            if (lVar2 == interfaceC0024m) {
                boolean z8 = lVar2.f14112B;
                if (z8) {
                    C2041D c2041d = o0.f294a;
                    if (!z8) {
                        AbstractC2256a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    o0.a(lVar2, -1, 2);
                    lVar2.m0();
                    lVar2.g0();
                }
                lVar2.n0(lVar2);
                lVar2.f14116d = 0;
                if (lVar == null) {
                    this.f269D = lVar2.f14118f;
                } else {
                    lVar.f14118f = lVar2.f14118f;
                }
                lVar2.f14118f = null;
                lVar2.f14117e = null;
                int i7 = this.f14115c;
                int f4 = o0.f(this);
                r0(f4, true);
                if (this.f14112B && (i7 & 2) != 0 && (f4 & 2) == 0) {
                    C0018g0 c0018g0 = AbstractC0017g.t(this).f60S;
                    this.f14113a.o0(null);
                    c0018g0.h();
                    return;
                }
                return;
            }
            lVar = lVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0024m).toString());
    }

    public final void r0(int i7, boolean z8) {
        c0.l lVar;
        int i10 = this.f14115c;
        this.f14115c = i7;
        if (i10 != i7) {
            c0.l lVar2 = this.f14113a;
            if (lVar2 == this) {
                this.f14116d = i7;
            }
            if (this.f14112B) {
                c0.l lVar3 = this;
                while (lVar3 != null) {
                    i7 |= lVar3.f14115c;
                    lVar3.f14115c = i7;
                    if (lVar3 == lVar2) {
                        break;
                    } else {
                        lVar3 = lVar3.f14117e;
                    }
                }
                if (z8 && lVar3 == lVar2) {
                    i7 = o0.f(lVar2);
                    lVar2.f14115c = i7;
                }
                int i11 = i7 | ((lVar3 == null || (lVar = lVar3.f14118f) == null) ? 0 : lVar.f14116d);
                while (lVar3 != null) {
                    i11 |= lVar3.f14115c;
                    lVar3.f14116d = i11;
                    lVar3 = lVar3.f14117e;
                }
            }
        }
    }
}
