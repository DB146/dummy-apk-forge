package y;

import A0.A0;
import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0018g0;
import A0.E0;
import A0.InterfaceC0023l;
import A0.InterfaceC0027p;
import A0.n0;
import A0.p0;
import B0.C0204u;
import B0.C0206v;
import cc.InterfaceC0937i0;
import h0.C1229p;
import hc.C1277e;
import x0.AbstractC2256a;

/* renamed from: y.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2281C extends AbstractC0025n implements A0, InterfaceC0027p, InterfaceC0023l, p0, E0 {
    public static final C2285G L = new C2285G(4);

    /* renamed from: E, reason: collision with root package name */
    public A.i f26392E;

    /* renamed from: F, reason: collision with root package name */
    public final C0204u f26393F;

    /* renamed from: G, reason: collision with root package name */
    public A.d f26394G;

    /* renamed from: H, reason: collision with root package name */
    public F.z f26395H;

    /* renamed from: I, reason: collision with root package name */
    public n0 f26396I;

    /* renamed from: J, reason: collision with root package name */
    public final C1229p f26397J;

    /* renamed from: K, reason: collision with root package name */
    public A0.J f26398K;

    public C2281C(A.i iVar, C0204u c0204u) {
        this.f26392E = iVar;
        this.f26393F = c0204u;
        C1229p c1229p = new C1229p(0, new C0206v(2, this, C2281C.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 4);
        p0(c1229p);
        this.f26397J = c1229p;
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        boolean a9 = this.f26397J.r0().a();
        Yb.h[] hVarArr = H0.s.f4563a;
        H0.t tVar = H0.q.k;
        Yb.h hVar = H0.s.f4563a[4];
        tVar.a(iVar, Boolean.valueOf(a9));
        if (this.f26398K == null) {
            this.f26398K = new A0.J(this, 24);
        }
        iVar.z(H0.h.f4488u, new H0.a(null, this.f26398K));
    }

    @Override // A0.InterfaceC0027p
    public final void i(n0 n0Var) {
        C2282D t02;
        this.f26396I = n0Var;
        if (this.f26397J.r0().a()) {
            if (!n0Var.t0().f14112B) {
                C2282D t03 = t0();
                if (t03 != null) {
                    t03.p0(null);
                    return;
                }
                return;
            }
            n0 n0Var2 = this.f26396I;
            if (n0Var2 == null || !n0Var2.t0().f14112B || (t02 = t0()) == null) {
                return;
            }
            t02.p0(this.f26396I);
        }
    }

    @Override // A0.E0
    public final Object j() {
        return L;
    }

    @Override // c0.l
    public final void j0() {
        F.z zVar = this.f26395H;
        if (zVar != null) {
            zVar.b();
        }
        this.f26395H = null;
    }

    public final void s0(A.i iVar, A.h hVar) {
        if (!this.f14112B) {
            iVar.b(hVar);
            return;
        }
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) ((C1277e) d0()).f17939a.get(cc.B.f14467b);
        cc.F.B(d0(), null, 0, new z(iVar, hVar, interfaceC0937i0 != null ? interfaceC0937i0.invokeOnCompletion(new C2279A(0, iVar, hVar)) : null, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final C2282D t0() {
        E0 e02;
        C0018g0 c0018g0;
        if (!this.f14112B) {
            return null;
        }
        C2285G c2285g = C2282D.f26399D;
        if (!this.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar = this.f14113a.f14117e;
        A0.L t5 = AbstractC0017g.t(this);
        loop0: while (true) {
            if (t5 == null) {
                e02 = null;
                break;
            }
            if ((((c0.l) t5.f60S.f229f).f14116d & 262144) != 0) {
                while (lVar != null) {
                    if ((lVar.f14115c & 262144) != 0) {
                        ?? r62 = 0;
                        AbstractC0025n abstractC0025n = lVar;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof E0) {
                                e02 = (E0) abstractC0025n;
                                if (c2285g.equals(e02.j())) {
                                    break loop0;
                                }
                            } else if ((abstractC0025n.f14115c & 262144) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar2 = abstractC0025n.f269D;
                                int i7 = 0;
                                abstractC0025n = abstractC0025n;
                                r62 = r62;
                                while (lVar2 != null) {
                                    if ((lVar2.f14115c & 262144) != 0) {
                                        i7++;
                                        r62 = r62;
                                        if (i7 == 1) {
                                            abstractC0025n = lVar2;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r62.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r62.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r62 = r62;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r62);
                        }
                    }
                    lVar = lVar.f14117e;
                }
            }
            t5 = t5.t();
            lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        if (e02 instanceof C2282D) {
            return (C2282D) e02;
        }
        return null;
    }

    public final void u0(A.i iVar) {
        A.d dVar;
        if (kotlin.jvm.internal.l.a(this.f26392E, iVar)) {
            return;
        }
        A.i iVar2 = this.f26392E;
        if (iVar2 != null && (dVar = this.f26394G) != null) {
            iVar2.b(new A.e(dVar));
        }
        this.f26394G = null;
        this.f26392E = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // A0.p0
    public final void z() {
        ?? obj = new Object();
        AbstractC0017g.q(this, new A0.K((kotlin.jvm.internal.v) obj, this, 17));
        F.z zVar = (F.z) obj.f19134a;
        if (this.f26397J.r0().a()) {
            F.z zVar2 = this.f26395H;
            if (zVar2 != null) {
                zVar2.b();
            }
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f26395H = zVar;
        }
    }
}
