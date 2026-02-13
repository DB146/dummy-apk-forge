package y;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.InterfaceC0023l;
import A0.InterfaceC0024m;
import A0.p0;
import z.C2565l;

/* loaded from: classes.dex */
public final class X extends AbstractC0025n implements InterfaceC0023l, p0 {

    /* renamed from: E, reason: collision with root package name */
    public E.A f26438E;

    /* renamed from: F, reason: collision with root package name */
    public z.V f26439F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f26440G;

    /* renamed from: H, reason: collision with root package name */
    public C2565l f26441H;

    /* renamed from: I, reason: collision with root package name */
    public A.i f26442I;

    /* renamed from: J, reason: collision with root package name */
    public C2305m f26443J;

    /* renamed from: K, reason: collision with root package name */
    public z.p0 f26444K;
    public InterfaceC0024m L;

    /* renamed from: M, reason: collision with root package name */
    public C2306n f26445M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f26446N;

    @Override // A0.InterfaceC0024m
    public final void Z() {
        boolean t02 = t0();
        if (this.f26446N != t02) {
            this.f26446N = t02;
            E.A a9 = this.f26438E;
            z.V v10 = this.f26439F;
            C2305m c2305m = this.f26443J;
            boolean z8 = this.f26440G;
            u0(this.f26442I, a9, c2305m, this.f26441H, v10, z8);
        }
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // c0.l
    public final void h0() {
        this.f26446N = t0();
        s0();
        if (this.f26444K == null) {
            z.p0 p0Var = new z.p0(this.f26442I, this.f26438E, this.f26443J, this.f26441H, this.f26439F, this.f26440G, this.f26446N);
            p0(p0Var);
            this.f26444K = p0Var;
        }
    }

    @Override // c0.l
    public final void i0() {
        InterfaceC0024m interfaceC0024m = this.L;
        if (interfaceC0024m != null) {
            q0(interfaceC0024m);
        }
    }

    public final void s0() {
        InterfaceC0024m interfaceC0024m = this.L;
        if (interfaceC0024m != null) {
            if (((c0.l) interfaceC0024m).f14113a.f14112B) {
                return;
            }
            p0(interfaceC0024m);
            return;
        }
        C2305m c2305m = this.f26443J;
        if (c2305m != null) {
            AbstractC0025n abstractC0025n = c2305m.f26493i;
            if (abstractC0025n.f14113a.f14112B) {
                return;
            }
            p0(abstractC0025n);
            this.L = abstractC0025n;
        }
    }

    public final boolean t0() {
        V0.l lVar = V0.l.f9982a;
        if (this.f14112B) {
            lVar = AbstractC0017g.t(this).f54M;
        }
        return lVar != V0.l.f9983b || this.f26439F == z.V.f27943a;
    }

    public final void u0(A.i iVar, E.A a9, C2305m c2305m, C2565l c2565l, z.V v10, boolean z8) {
        this.f26438E = a9;
        this.f26439F = v10;
        if (!kotlin.jvm.internal.l.a(this.f26443J, c2305m)) {
            this.f26443J = c2305m;
            InterfaceC0024m interfaceC0024m = this.L;
            if (interfaceC0024m != null) {
                q0(interfaceC0024m);
            }
            this.L = null;
            s0();
        }
        this.f26440G = z8;
        this.f26441H = c2565l;
        this.f26442I = iVar;
        boolean t02 = t0();
        this.f26446N = t02;
        z.p0 p0Var = this.f26444K;
        if (p0Var != null) {
            p0Var.w0(iVar, a9, this.f26443J, c2565l, v10, z8, t02);
        }
    }

    @Override // A0.p0
    public final void z() {
        C2306n c2306n = (C2306n) AbstractC0017g.h(this, W.f26437a);
        if (kotlin.jvm.internal.l.a(c2306n, this.f26445M)) {
            return;
        }
        this.f26445M = c2306n;
        InterfaceC0024m interfaceC0024m = this.L;
        if (interfaceC0024m != null) {
            q0(interfaceC0024m);
        }
        this.L = null;
        s0();
        z.p0 p0Var = this.f26444K;
        if (p0Var != null) {
            E.A a9 = this.f26438E;
            z.V v10 = this.f26439F;
            C2305m c2305m = this.f26443J;
            boolean z8 = this.f26440G;
            boolean z10 = this.f26446N;
            p0Var.w0(this.f26442I, a9, c2305m, this.f26441H, v10, z8, z10);
        }
    }
}
