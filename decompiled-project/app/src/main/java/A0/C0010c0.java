package A0;

import java.util.List;
import x0.AbstractC2256a;
import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* renamed from: A0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010c0 extends AbstractC2323H implements y0.z, InterfaceC0007b, InterfaceC0014e0 {

    /* renamed from: B, reason: collision with root package name */
    public Rb.c f170B;

    /* renamed from: C, reason: collision with root package name */
    public float f171C;

    /* renamed from: E, reason: collision with root package name */
    public Object f173E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f174F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f175G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f176H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f177I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f178J;

    /* renamed from: N, reason: collision with root package name */
    public boolean f181N;

    /* renamed from: R, reason: collision with root package name */
    public float f185R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f186S;

    /* renamed from: T, reason: collision with root package name */
    public Rb.c f187T;

    /* renamed from: V, reason: collision with root package name */
    public float f189V;

    /* renamed from: X, reason: collision with root package name */
    public boolean f191X;

    /* renamed from: f, reason: collision with root package name */
    public final P f192f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f193u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f196x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f197y;

    /* renamed from: v, reason: collision with root package name */
    public int f194v = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: w, reason: collision with root package name */
    public int f195w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: z, reason: collision with root package name */
    public H f198z = H.f32c;

    /* renamed from: A, reason: collision with root package name */
    public long f169A = 0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f172D = true;

    /* renamed from: K, reason: collision with root package name */
    public final M f179K = new M(this, 0);
    public final S.e L = new S.e(new C0010c0[16]);

    /* renamed from: M, reason: collision with root package name */
    public boolean f180M = true;

    /* renamed from: O, reason: collision with root package name */
    public long f182O = V0.b.b(0, 0, 15);

    /* renamed from: P, reason: collision with root package name */
    public final C0008b0 f183P = new C0008b0(this, 1);

    /* renamed from: Q, reason: collision with root package name */
    public final C0008b0 f184Q = new C0008b0(this, 0);

    /* renamed from: U, reason: collision with root package name */
    public long f188U = 0;

    /* renamed from: W, reason: collision with root package name */
    public final C0008b0 f190W = new C0008b0(this, 2);

    public C0010c0(P p10) {
        this.f192f = p10;
    }

    @Override // A0.InterfaceC0007b
    public final void C(C0005a c0005a) {
        S.e x2 = this.f192f.f93a.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            c0005a.invoke(((L) objArr[i10]).f61T.f105p);
        }
    }

    @Override // A0.InterfaceC0007b
    public final void E() {
        L.S(this.f192f.f93a, false, 7);
    }

    @Override // y0.AbstractC2323H
    public final int H() {
        return this.f192f.a().H();
    }

    @Override // y0.AbstractC2323H
    public final int I() {
        return this.f192f.a().I();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    @Override // y0.AbstractC2323H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(long j, float f4, Rb.c cVar) {
        boolean z8;
        Y y10;
        AbstractC2322G placementScope;
        boolean z10;
        this.f175G = true;
        boolean a9 = V0.i.a(j, this.f169A);
        P p10 = this.f192f;
        if (!a9 || this.f191X) {
            if (p10.k || p10.j || this.f191X) {
                this.f177I = true;
                this.f191X = false;
            }
            U();
        }
        Y y11 = p10.f106q;
        if (y11 != null) {
            P p11 = y11.f145f;
            if (AbstractC0017g.p(p11.f93a)) {
                z10 = true;
            } else {
                if (y11.f137D == V.f127c && !p11.f94b) {
                    p11.f95c = true;
                }
                z10 = p11.f95c;
            }
            if (z10) {
                z8 = true;
                if (z8) {
                    n0 n0Var = p10.a().f275B;
                    L l10 = p10.f93a;
                    if (n0Var == null || (placementScope = n0Var.f116w) == null) {
                        placementScope = ((B0.D) O.a(l10)).getPlacementScope();
                    }
                    Y y12 = p10.f106q;
                    kotlin.jvm.internal.l.b(y12);
                    L t5 = l10.t();
                    if (t5 != null) {
                        t5.f61T.f99h = 0;
                    }
                    y12.f148w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    placementScope.d(y12, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                }
                y10 = p10.f106q;
                if (y10 == null && !y10.f150y) {
                    AbstractC2256a.b("Error: Placement happened before lookahead.");
                }
                Z(j, f4, cVar);
            }
        }
        z8 = false;
        if (z8) {
        }
        y10 = p10.f106q;
        if (y10 == null && !y10.f150y) {
        }
        Z(j, f4, cVar);
    }

    public final List R() {
        P p10 = this.f192f;
        p10.f93a.a0();
        boolean z8 = this.f180M;
        S.e eVar = this.L;
        if (!z8) {
            return eVar.f();
        }
        L l10 = p10.f93a;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (eVar.f8961c <= i10) {
                eVar.b(l11.f61T.f105p);
            } else {
                C0010c0 c0010c0 = l11.f61T.f105p;
                Object[] objArr2 = eVar.f8959a;
                Object obj = objArr2[i10];
                objArr2[i10] = c0010c0;
            }
        }
        eVar.m(((S.b) l10.n()).f8953a.f8961c, eVar.f8961c);
        this.f180M = false;
        return eVar.f();
    }

    public final void S() {
        boolean z8 = this.f174F;
        this.f174F = true;
        L l10 = this.f192f.f93a;
        if (!z8) {
            ((C0031u) l10.f60S.f226c).G0();
            if (l10.q()) {
                L.S(l10, true, 6);
            } else if (l10.f61T.f97e) {
                L.Q(l10, true, 6);
            }
        }
        C0018g0 c0018g0 = l10.f60S;
        n0 n0Var = ((C0031u) c0018g0.f226c).f274A;
        for (n0 n0Var2 = (n0) c0018g0.f227d; !kotlin.jvm.internal.l.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f274A) {
            if (n0Var2.f291S) {
                n0Var2.A0();
            }
        }
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (l11.u() != Integer.MAX_VALUE) {
                l11.f61T.f105p.S();
                L.T(l11);
            }
        }
    }

    public final void T() {
        if (this.f174F) {
            this.f174F = false;
            P p10 = this.f192f;
            C0018g0 c0018g0 = p10.f93a.f60S;
            n0 n0Var = ((C0031u) c0018g0.f226c).f274A;
            for (n0 n0Var2 = (n0) c0018g0.f227d; !kotlin.jvm.internal.l.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f274A) {
                c0.l v02 = n0Var2.v0(o0.g(1048576));
                if (v02 != null && (v02.f14113a.f14116d & 1048576) != 0) {
                    boolean g = o0.g(1048576);
                    c0.l t02 = n0Var2.t0();
                    if (g || (t02 = t02.f14117e) != null) {
                        for (c0.l v03 = n0Var2.v0(g); v03 != null && (v03.f14116d & 1048576) != 0; v03 = v03.f14118f) {
                            if ((v03.f14115c & 1048576) != 0) {
                                c0.l lVar = v03;
                                S.e eVar = null;
                                while (lVar != null) {
                                    if ((lVar.f14115c & 1048576) != 0 && (lVar instanceof AbstractC0025n)) {
                                        int i7 = 0;
                                        for (c0.l lVar2 = ((AbstractC0025n) lVar).f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
                                            if ((lVar2.f14115c & 1048576) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    lVar = lVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new S.e(new c0.l[16]);
                                                    }
                                                    if (lVar != null) {
                                                        eVar.b(lVar);
                                                        lVar = null;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    lVar = AbstractC0017g.e(eVar);
                                }
                            }
                            if (v03 == t02) {
                                break;
                            }
                        }
                    }
                }
                if (n0Var2.f292T != null) {
                    n0Var2.M0(null, false);
                    n0Var2.f293z.R(false);
                }
            }
            S.e x2 = p10.f93a.x();
            Object[] objArr = x2.f8959a;
            int i10 = x2.f8961c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((L) objArr[i11]).f61T.f105p.T();
            }
        }
    }

    public final void U() {
        P p10 = this.f192f;
        if (p10.f101l > 0) {
            S.e x2 = p10.f93a.x();
            Object[] objArr = x2.f8959a;
            int i7 = x2.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                L l10 = (L) objArr[i10];
                P p11 = l10.f61T;
                boolean z8 = p11.j;
                C0010c0 c0010c0 = p11.f105p;
                if ((z8 || p11.k) && !c0010c0.f177I) {
                    l10.R(false);
                }
                c0010c0.U();
            }
        }
    }

    public final void V() {
        this.f186S = true;
        P p10 = this.f192f;
        L t5 = p10.f93a.t();
        float f4 = i().L;
        L l10 = p10.f93a;
        C0018g0 c0018g0 = l10.f60S;
        for (n0 n0Var = (n0) c0018g0.f227d; n0Var != ((C0031u) c0018g0.f226c); n0Var = n0Var.f274A) {
            kotlin.jvm.internal.l.c(n0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f4 += ((A) n0Var).L;
        }
        if (f4 != this.f185R) {
            this.f185R = f4;
            if (t5 != null) {
                t5.L();
            }
            if (t5 != null) {
                t5.A();
            }
        }
        if (this.f174F) {
            ((C0031u) l10.f60S.f226c).G0();
        } else {
            if (t5 != null) {
                t5.A();
            }
            S();
            if (this.f193u && t5 != null) {
                t5.R(false);
            }
        }
        if (t5 == null) {
            this.f195w = 0;
        } else if (!this.f193u) {
            P p11 = t5.f61T;
            if (p11.f96d == F.f22c) {
                if (this.f195w != Integer.MAX_VALUE) {
                    AbstractC2256a.b("Place was called on a node which was placed already");
                }
                int i7 = p11.f100i;
                this.f195w = i7;
                p11.f100i = i7 + 1;
            }
        }
        l();
    }

    public final void Z(long j, float f4, Rb.c cVar) {
        P p10 = this.f192f;
        if (p10.f93a.f73c0) {
            AbstractC2256a.a("place is called on a deactivated node");
        }
        p10.f96d = F.f22c;
        boolean z8 = !this.f197y;
        this.f169A = j;
        this.f171C = f4;
        this.f170B = cVar;
        this.f197y = true;
        this.f186S = false;
        L l10 = p10.f93a;
        B0.D d10 = (B0.D) O.a(l10);
        d10.getRectManager().f(l10, j, z8);
        if (this.f177I || !this.f174F) {
            this.f179K.f87e = false;
            p10.d(false);
            this.f187T = cVar;
            this.f188U = j;
            this.f189V = f4;
            v0 snapshotObserver = d10.getSnapshotObserver();
            snapshotObserver.a(l10, snapshotObserver.f319f, this.f190W);
        } else {
            n0 a9 = p10.a();
            a9.J0(V0.i.c(j, a9.f26558e), f4, cVar);
            V();
        }
        p10.f96d = F.f24e;
    }

    @Override // A0.InterfaceC0007b
    public final M a() {
        return this.f179K;
    }

    @Override // y0.z
    public final AbstractC2323H b(long j) {
        H h10;
        P p10 = this.f192f;
        L l10 = p10.f93a;
        H h11 = l10.f57P;
        H h12 = H.f32c;
        if (h11 == h12) {
            l10.c();
        }
        if (AbstractC0017g.p(p10.f93a)) {
            Y y10 = p10.f106q;
            kotlin.jvm.internal.l.b(y10);
            y10.f149x = h12;
            y10.b(j);
        }
        L l11 = p10.f93a;
        L t5 = l11.t();
        if (t5 != null) {
            if (this.f198z != h12 && !l11.f59R) {
                AbstractC2256a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            P p11 = t5.f61T;
            int ordinal = p11.f96d.ordinal();
            if (ordinal == 0) {
                h10 = H.f30a;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + p11.f96d);
                }
                h10 = H.f31b;
            }
            this.f198z = h10;
        } else {
            this.f198z = h12;
        }
        b0(j);
        return this;
    }

    public final boolean b0(long j) {
        P p10 = this.f192f;
        if (p10.f93a.f73c0) {
            AbstractC2256a.a("measure is called on a deactivated node");
        }
        L l10 = p10.f93a;
        t0 a9 = O.a(l10);
        L t5 = l10.t();
        boolean z8 = true;
        l10.f59R = l10.f59R || (t5 != null && t5.f59R);
        if (!l10.q() && V0.a.b(this.f26557d, j)) {
            ((B0.D) a9).k(l10, false);
            l10.U();
            return false;
        }
        this.f179K.f86d = false;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((L) objArr[i10]).f61T.f105p.f179K.getClass();
        }
        this.f196x = true;
        long j10 = p10.a().f26556c;
        O(j);
        F f4 = p10.f96d;
        F f10 = F.f24e;
        if (f4 != f10) {
            AbstractC2256a.b("layout state is not idle before measure starts");
        }
        this.f182O = j;
        F f11 = F.f20a;
        p10.f96d = f11;
        this.f176H = false;
        v0 snapshotObserver = ((B0.D) O.a(l10)).getSnapshotObserver();
        snapshotObserver.a(l10, snapshotObserver.f316c, this.f183P);
        if (p10.f96d == f11) {
            this.f177I = true;
            this.f178J = true;
            p10.f96d = f10;
        }
        if (V0.k.a(p10.a().f26556c, j10) && p10.a().f26554a == this.f26554a && p10.a().f26555b == this.f26555b) {
            z8 = false;
        }
        N((p10.a().f26555b & 4294967295L) | (p10.a().f26554a << 32));
        return z8;
    }

    @Override // y0.AbstractC2323H, y0.z
    public final Object d() {
        return this.f173E;
    }

    @Override // A0.InterfaceC0014e0
    public final void h(boolean z8) {
        P p10 = this.f192f;
        if (z8 != p10.a().f113f) {
            p10.a().f113f = z8;
            this.f191X = true;
        }
    }

    @Override // A0.InterfaceC0007b
    public final C0031u i() {
        return (C0031u) this.f192f.f93a.f60S.f226c;
    }

    @Override // A0.InterfaceC0007b
    public final InterfaceC0007b j() {
        P p10;
        L t5 = this.f192f.f93a.t();
        if (t5 == null || (p10 = t5.f61T) == null) {
            return null;
        }
        return p10.f105p;
    }

    @Override // A0.InterfaceC0007b
    public final void l() {
        boolean z8;
        this.f181N = true;
        M m10 = this.f179K;
        m10.h();
        boolean z10 = this.f177I;
        P p10 = this.f192f;
        if (z10) {
            S.e x2 = p10.f93a.x();
            Object[] objArr = x2.f8959a;
            int i7 = x2.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                L l10 = (L) objArr[i10];
                if (l10.q()) {
                    P p11 = l10.f61T;
                    C0010c0 c0010c0 = p11.f105p;
                    if (c0010c0.f198z == H.f30a) {
                        V0.a aVar = c0010c0.f196x ? new V0.a(c0010c0.f26557d) : null;
                        if (aVar != null) {
                            if (l10.f57P == H.f32c) {
                                l10.c();
                            }
                            z8 = p11.f105p.b0(aVar.f9967a);
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            L.S(p10.f93a, false, 7);
                        }
                    }
                }
            }
        }
        if (this.f178J || (!i().f115v && this.f177I)) {
            this.f177I = false;
            F f4 = p10.f96d;
            p10.f96d = F.f22c;
            p10.e(false);
            L l11 = p10.f93a;
            v0 snapshotObserver = ((B0.D) O.a(l11)).getSnapshotObserver();
            snapshotObserver.a(l11, snapshotObserver.f318e, this.f184Q);
            p10.f96d = f4;
            if (i().f115v && p10.j) {
                requestLayout();
            }
            this.f178J = false;
        }
        if (m10.f84b && m10.e()) {
            m10.g();
        }
        this.f181N = false;
    }

    @Override // A0.InterfaceC0007b
    public final void requestLayout() {
        this.f192f.f93a.R(false);
    }

    @Override // A0.InterfaceC0007b
    public final boolean t() {
        return this.f174F;
    }
}
