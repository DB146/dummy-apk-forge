package A0;

import B0.e1;
import Q.C0519v;
import Q.InterfaceC0494i;
import Q.InterfaceC0520w;
import d0.C1034b;
import java.util.List;
import m0.C1533b;
import x0.AbstractC2256a;
import y0.InterfaceC2316A;

/* loaded from: classes.dex */
public final class L implements InterfaceC0494i, u0, InterfaceC0022k {

    /* renamed from: d0, reason: collision with root package name */
    public static final E f40d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static final D f41e0 = new Object();

    /* renamed from: f0, reason: collision with root package name */
    public static final B f42f0 = new B(0);

    /* renamed from: A, reason: collision with root package name */
    public L f43A;

    /* renamed from: B, reason: collision with root package name */
    public B0.D f44B;

    /* renamed from: C, reason: collision with root package name */
    public Y0.q f45C;

    /* renamed from: D, reason: collision with root package name */
    public int f46D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f47E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f48F;

    /* renamed from: G, reason: collision with root package name */
    public H0.i f49G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f50H;

    /* renamed from: I, reason: collision with root package name */
    public final S.e f51I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f52J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC2316A f53K;
    public V0.c L;

    /* renamed from: M, reason: collision with root package name */
    public V0.l f54M;

    /* renamed from: N, reason: collision with root package name */
    public e1 f55N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC0520w f56O;

    /* renamed from: P, reason: collision with root package name */
    public H f57P;

    /* renamed from: Q, reason: collision with root package name */
    public H f58Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f59R;

    /* renamed from: S, reason: collision with root package name */
    public final C0018g0 f60S;

    /* renamed from: T, reason: collision with root package name */
    public final P f61T;

    /* renamed from: U, reason: collision with root package name */
    public y0.w f62U;

    /* renamed from: V, reason: collision with root package name */
    public n0 f63V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f64W;

    /* renamed from: X, reason: collision with root package name */
    public c0.m f65X;

    /* renamed from: Y, reason: collision with root package name */
    public c0.m f66Y;

    /* renamed from: Z, reason: collision with root package name */
    public Y0.c f67Z;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68a;

    /* renamed from: a0, reason: collision with root package name */
    public Y0.d f69a0;

    /* renamed from: b, reason: collision with root package name */
    public int f70b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f71b0;

    /* renamed from: c, reason: collision with root package name */
    public long f72c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f73c0;

    /* renamed from: d, reason: collision with root package name */
    public long f74d;

    /* renamed from: e, reason: collision with root package name */
    public long f75e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f76f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f77u;

    /* renamed from: v, reason: collision with root package name */
    public L f78v;

    /* renamed from: w, reason: collision with root package name */
    public int f79w;

    /* renamed from: x, reason: collision with root package name */
    public final q3.e f80x;

    /* renamed from: y, reason: collision with root package name */
    public S.e f81y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f82z;

    public L(int i7) {
        this(H0.j.f4498a.addAndGet(1), (i7 & 1) == 0);
    }

    public L(int i7, boolean z8) {
        this.f68a = z8;
        this.f70b = i7;
        this.f72c = 9223372034707292159L;
        this.f74d = 0L;
        this.f75e = 9223372034707292159L;
        this.f76f = true;
        this.f80x = new q3.e(1, new S.e(new L[16]), new J(this, 0));
        this.f51I = new S.e(new L[16]);
        this.f52J = true;
        this.f53K = f40d0;
        this.L = O.f92a;
        this.f54M = V0.l.f9982a;
        this.f55N = f41e0;
        InterfaceC0520w.f8564i.getClass();
        this.f56O = C0519v.f8563b;
        H h10 = H.f32c;
        this.f57P = h10;
        this.f58Q = h10;
        this.f60S = new C0018g0(this);
        this.f61T = new P(this);
        this.f64W = true;
        this.f65X = c0.j.f14110a;
    }

    public static void Q(L l10, boolean z8, int i7) {
        L t5;
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        boolean z10 = (i7 & 2) != 0;
        boolean z11 = (i7 & 4) != 0;
        if (l10.f78v == null) {
            AbstractC2256a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        B0.D d10 = l10.f44B;
        if (d10 == null || l10.f47E || l10.f68a) {
            return;
        }
        d10.z(l10, true, z8, z10);
        if (z11) {
            Y y10 = l10.f61T.f106q;
            kotlin.jvm.internal.l.b(y10);
            P p10 = y10.f145f;
            L t10 = p10.f93a.t();
            H h10 = p10.f93a.f57P;
            if (t10 == null || h10 == H.f32c) {
                return;
            }
            while (t10.f57P == h10 && (t5 = t10.t()) != null) {
                t10 = t5;
            }
            int ordinal = h10.ordinal();
            if (ordinal == 0) {
                if (t10.f78v != null) {
                    Q(t10, z8, 6);
                    return;
                } else {
                    S(t10, z8, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (t10.f78v != null) {
                t10.P(z8);
            } else {
                t10.R(z8);
            }
        }
    }

    public static void S(L l10, boolean z8, int i7) {
        B0.D d10;
        L t5;
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        boolean z10 = (i7 & 2) != 0;
        boolean z11 = (i7 & 4) != 0;
        if (l10.f47E || l10.f68a || (d10 = l10.f44B) == null) {
            return;
        }
        d10.z(l10, false, z8, z10);
        if (z11) {
            P p10 = l10.f61T.f105p.f192f;
            L t10 = p10.f93a.t();
            H h10 = p10.f93a.f57P;
            if (t10 == null || h10 == H.f32c) {
                return;
            }
            while (t10.f57P == h10 && (t5 = t10.t()) != null) {
                t10 = t5;
            }
            int ordinal = h10.ordinal();
            if (ordinal == 0) {
                S(t10, z8, 6);
            } else {
                if (ordinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                t10.R(z8);
            }
        }
    }

    public static void T(L l10) {
        int i7 = I.f34a[l10.f61T.f96d.ordinal()];
        P p10 = l10.f61T;
        if (i7 != 1) {
            throw new IllegalStateException("Unexpected state " + p10.f96d);
        }
        if (p10.f97e) {
            Q(l10, true, 6);
            return;
        }
        if (p10.f98f) {
            l10.P(true);
        }
        if (l10.q()) {
            S(l10, true, 6);
        } else if (l10.p()) {
            l10.R(true);
        }
    }

    private final String k(L l10) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(l10);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(h(0));
        sb2.append(" Other tree: ");
        L l11 = l10.f43A;
        sb2.append(l11 != null ? l11.h(0) : null);
        return sb2.toString();
    }

    public final void A() {
        if (this.f64W) {
            C0018g0 c0018g0 = this.f60S;
            n0 n0Var = (C0031u) c0018g0.f226c;
            n0 n0Var2 = ((n0) c0018g0.f227d).f275B;
            this.f63V = null;
            while (true) {
                if (kotlin.jvm.internal.l.a(n0Var, n0Var2)) {
                    break;
                }
                if ((n0Var != null ? n0Var.f292T : null) != null) {
                    this.f63V = n0Var;
                    break;
                }
                n0Var = n0Var != null ? n0Var.f275B : null;
            }
        }
        n0 n0Var3 = this.f63V;
        if (n0Var3 != null && n0Var3.f292T == null) {
            throw X.c.c("layer was not set");
        }
        if (n0Var3 != null) {
            n0Var3.A0();
            return;
        }
        L t5 = t();
        if (t5 != null) {
            t5.A();
        }
    }

    public final void B() {
        C0018g0 c0018g0 = this.f60S;
        C0031u c0031u = (C0031u) c0018g0.f226c;
        for (n0 n0Var = (n0) c0018g0.f227d; n0Var != c0031u; n0Var = n0Var.f274A) {
            kotlin.jvm.internal.l.c(n0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            s0 s0Var = ((A) n0Var).f292T;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
        s0 s0Var2 = ((C0031u) c0018g0.f226c).f292T;
        if (s0Var2 != null) {
            s0Var2.invalidate();
        }
    }

    public final void C() {
        this.f76f = true;
        if (this.f78v != null) {
            Q(this, false, 7);
        } else {
            S(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public final void D() {
        if (this.f50H) {
            return;
        }
        this.f60S.getClass();
        if (i0.f239a.f14118f != null || this.f66Y != null) {
            this.f48F = true;
            return;
        }
        H0.i iVar = this.f49G;
        this.f50H = true;
        ?? obj = new Object();
        obj.f19134a = new H0.i();
        v0 snapshotObserver = ((B0.D) O.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f317d, new K(0, this, (Object) obj));
        this.f50H = false;
        this.f49G = (H0.i) obj.f19134a;
        this.f48F = false;
        B0.D d10 = (B0.D) O.a(this);
        d10.getSemanticsOwner().b(this, iVar);
        d10.B();
    }

    public final void E() {
        L l10;
        if (this.f79w > 0) {
            this.f82z = true;
        }
        if (!this.f68a || (l10 = this.f43A) == null) {
            return;
        }
        l10.E();
    }

    public final boolean F() {
        return this.f44B != null;
    }

    public final boolean G() {
        return this.f61T.f105p.f174F;
    }

    public final Boolean H() {
        Y y10 = this.f61T.f106q;
        if (y10 != null) {
            return Boolean.valueOf(y10.t());
        }
        return null;
    }

    public final void I() {
        L t5;
        if (this.f57P == H.f32c) {
            g();
        }
        Y y10 = this.f61T.f106q;
        kotlin.jvm.internal.l.b(y10);
        try {
            y10.f146u = true;
            if (!y10.f150y) {
                AbstractC2256a.b("replace() called on item that was not placed");
            }
            y10.f144K = false;
            boolean t10 = y10.t();
            y10.V(y10.f135B, y10.f136C);
            if (t10 && !y10.f144K && (t5 = y10.f145f.f93a.t()) != null) {
                t5.P(false);
            }
            y10.f146u = false;
        } catch (Throwable th) {
            y10.f146u = false;
            throw th;
        }
    }

    public final void J(int i7, int i10, int i11) {
        if (i7 == i10) {
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i7 > i10 ? i7 + i12 : i7;
            int i14 = i7 > i10 ? i10 + i12 : (i10 + i11) - 2;
            q3.e eVar = this.f80x;
            Object l10 = ((S.e) eVar.f23376b).l(i13);
            J j = (J) eVar.f23377c;
            j.invoke();
            ((S.e) eVar.f23376b).a(i14, (L) l10);
            j.invoke();
        }
        L();
        E();
        C();
    }

    public final void K(L l10) {
        if (l10.f61T.f101l > 0) {
            this.f61T.b(r0.f101l - 1);
        }
        if (this.f44B != null) {
            l10.i();
        }
        l10.f43A = null;
        ((n0) l10.f60S.f227d).f275B = null;
        if (l10.f68a) {
            this.f79w--;
            S.e eVar = (S.e) l10.f80x.f23376b;
            Object[] objArr = eVar.f8959a;
            int i7 = eVar.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                ((n0) ((L) objArr[i10]).f60S.f227d).f275B = null;
            }
        }
        E();
        L();
    }

    public final void L() {
        if (!this.f68a) {
            this.f52J = true;
            return;
        }
        L t5 = t();
        if (t5 != null) {
            t5.L();
        }
    }

    public final void M() {
        q3.e eVar = this.f80x;
        int i7 = ((S.e) eVar.f23376b).f8961c;
        while (true) {
            i7--;
            S.e eVar2 = (S.e) eVar.f23376b;
            if (-1 >= i7) {
                eVar2.g();
                ((J) eVar.f23377c).invoke();
                return;
            }
            K((L) eVar2.f8959a[i7]);
        }
    }

    public final void N(int i7, int i10) {
        if (i10 < 0) {
            AbstractC2256a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i7) - 1;
        if (i7 > i11) {
            return;
        }
        while (true) {
            q3.e eVar = this.f80x;
            K((L) ((S.e) eVar.f23376b).f8959a[i11]);
            Object l10 = ((S.e) eVar.f23376b).l(i11);
            ((J) eVar.f23377c).invoke();
            if (i11 == i7) {
                return;
            } else {
                i11--;
            }
        }
    }

    public final void O() {
        L t5;
        if (this.f57P == H.f32c) {
            g();
        }
        C0010c0 c0010c0 = this.f61T.f105p;
        c0010c0.getClass();
        try {
            c0010c0.f193u = true;
            if (!c0010c0.f197y) {
                AbstractC2256a.b("replace called on unplaced item");
            }
            boolean z8 = c0010c0.f174F;
            c0010c0.Z(c0010c0.f169A, c0010c0.f171C, c0010c0.f170B);
            if (z8 && !c0010c0.f186S && (t5 = c0010c0.f192f.f93a.t()) != null) {
                t5.R(false);
            }
            c0010c0.f193u = false;
        } catch (Throwable th) {
            c0010c0.f193u = false;
            throw th;
        }
    }

    public final void P(boolean z8) {
        B0.D d10;
        if (this.f68a || (d10 = this.f44B) == null) {
            return;
        }
        d10.A(this, true, z8);
    }

    public final void R(boolean z8) {
        B0.D d10;
        this.f76f = true;
        if (this.f68a || (d10 = this.f44B) == null) {
            return;
        }
        d10.A(this, false, z8);
    }

    public final void U() {
        S.e x2 = x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l10 = (L) objArr[i10];
            H h10 = l10.f58Q;
            l10.f57P = h10;
            if (h10 != H.f32c) {
                l10.U();
            }
        }
    }

    public final void V(V0.c cVar) {
        if (kotlin.jvm.internal.l.a(this.L, cVar)) {
            return;
        }
        this.L = cVar;
        C();
        L t5 = t();
        if (t5 != null) {
            t5.A();
        }
        B();
        for (c0.l lVar = (c0.l) this.f60S.f229f; lVar != null; lVar = lVar.f14118f) {
            lVar.a();
        }
    }

    public final void W(L l10) {
        if (kotlin.jvm.internal.l.a(l10, this.f78v)) {
            return;
        }
        this.f78v = l10;
        P p10 = this.f61T;
        if (l10 != null) {
            if (p10.f106q == null) {
                p10.f106q = new Y(p10);
            }
            C0018g0 c0018g0 = this.f60S;
            n0 n0Var = ((C0031u) c0018g0.f226c).f274A;
            for (n0 n0Var2 = (n0) c0018g0.f227d; !kotlin.jvm.internal.l.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f274A) {
                n0Var2.n0();
            }
        } else {
            p10.f106q = null;
        }
        C();
    }

    public final void X(InterfaceC2316A interfaceC2316A) {
        if (kotlin.jvm.internal.l.a(this.f53K, interfaceC2316A)) {
            return;
        }
        this.f53K = interfaceC2316A;
        C();
    }

    public final void Y(c0.m mVar) {
        if (this.f68a && this.f65X != c0.j.f14110a) {
            AbstractC2256a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f73c0) {
            AbstractC2256a.a("modifier is updated when deactivated");
        }
        if (!F()) {
            this.f66Y = mVar;
            return;
        }
        a(mVar);
        if (this.f48F) {
            D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void Z(e1 e1Var) {
        if (kotlin.jvm.internal.l.a(this.f55N, e1Var)) {
            return;
        }
        this.f55N = e1Var;
        c0.l lVar = (c0.l) this.f60S.f229f;
        if ((lVar.f14116d & 16) != 0) {
            while (lVar != null) {
                if ((lVar.f14115c & 16) != 0) {
                    AbstractC0025n abstractC0025n = lVar;
                    ?? r32 = 0;
                    while (abstractC0025n != 0) {
                        if (abstractC0025n instanceof y0) {
                            ((y0) abstractC0025n).I();
                        } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                            c0.l lVar2 = abstractC0025n.f269D;
                            int i7 = 0;
                            abstractC0025n = abstractC0025n;
                            r32 = r32;
                            while (lVar2 != null) {
                                if ((lVar2.f14115c & 16) != 0) {
                                    i7++;
                                    r32 = r32;
                                    if (i7 == 1) {
                                        abstractC0025n = lVar2;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new S.e(new c0.l[16]);
                                        }
                                        if (abstractC0025n != 0) {
                                            r32.b(abstractC0025n);
                                            abstractC0025n = 0;
                                        }
                                        r32.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.f14118f;
                                abstractC0025n = abstractC0025n;
                                r32 = r32;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC0025n = AbstractC0017g.e(r32);
                    }
                }
                if ((lVar.f14116d & 16) == 0) {
                    return;
                } else {
                    lVar = lVar.f14118f;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        if (r2 >= r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
    
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r4 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r11.f66Y == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d2, code lost:
    
        r6.g(r2, r7, r8, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
    
        throw X.c.c("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e9, code lost:
    
        throw X.c.c("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Type inference failed for: r2v21, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [A0.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c0.m mVar) {
        h0 h0Var;
        ?? r22;
        this.f65X = mVar;
        ?? r62 = this.f60S;
        c0.l lVar = (c0.l) r62.f229f;
        c0.l lVar2 = i0.f239a;
        if (lVar == lVar2) {
            AbstractC2256a.b("padChain called on already padded chain");
        }
        c0.l lVar3 = (c0.l) r62.f229f;
        lVar3.f14117e = lVar2;
        lVar2.f14118f = lVar3;
        S.e eVar = (S.e) r62.g;
        int i7 = eVar != null ? eVar.f8961c : 0;
        S.e eVar2 = (S.e) r62.f230h;
        if (eVar2 == null) {
            eVar2 = new S.e(new c0.k[16]);
        }
        S.e eVar3 = eVar2;
        int i10 = eVar3.f8961c;
        if (i10 < 16) {
            i10 = 16;
        }
        S.e eVar4 = new S.e(new c0.m[i10]);
        eVar4.b(mVar);
        C0005a c0005a = null;
        while (true) {
            int i11 = eVar4.f8961c;
            if (i11 == 0) {
                break;
            }
            c0.m mVar2 = (c0.m) eVar4.l(i11 - 1);
            if (mVar2 instanceof c0.g) {
                c0.g gVar = (c0.g) mVar2;
                eVar4.b(gVar.f14107b);
                eVar4.b(gVar.f14106a);
            } else if (mVar2 instanceof c0.k) {
                eVar3.b(mVar2);
            } else {
                if (c0005a == null) {
                    c0005a = new C0005a(eVar3, 1);
                }
                mVar2.b(c0005a);
                c0005a = c0005a;
            }
        }
        int i12 = eVar3.f8961c;
        B0 b02 = (B0) r62.f228e;
        L l10 = (L) r62.f225b;
        if (i12 != i7) {
            c0.m mVar3 = l10.f66Y;
            if (mVar3 != null && i7 == 0) {
                for (int i13 = 0; i13 < eVar3.f8961c; i13++) {
                    lVar2 = C0018g0.b((c0.k) eVar3.f8959a[i13], lVar2);
                }
                for (c0.l lVar4 = b02.f14117e; lVar4 != null && lVar4 != i0.f239a; lVar4 = lVar4.f14117e) {
                    r0 |= lVar4.f14115c;
                    lVar4.f14116d = r0;
                }
            } else {
                if (i12 == 0) {
                    if (eVar == null) {
                        throw X.c.c("expected prior modifier list to be non-empty");
                    }
                    c0.l lVar5 = lVar2.f14118f;
                    for (int i14 = 0; lVar5 != null && i14 < eVar.f8961c; i14++) {
                        lVar5 = C0018g0.c(lVar5).f14118f;
                    }
                    L t5 = l10.t();
                    C0031u c0031u = t5 != null ? (C0031u) t5.f60S.f226c : null;
                    C0031u c0031u2 = (C0031u) r62.f226c;
                    c0031u2.f275B = c0031u;
                    r62.f227d = c0031u2;
                    r62.g = eVar3;
                    if (eVar == null) {
                        eVar.g();
                    } else {
                        eVar = null;
                    }
                    r62.f230h = eVar;
                    h0Var = i0.f239a;
                    r22 = h0Var.f14118f;
                    if (r22 != 0) {
                        b02 = r22;
                    }
                    b02.f14117e = null;
                    h0Var.f14118f = null;
                    h0Var.f14116d = -1;
                    h0Var.f14120v = null;
                    if (b02 == h0Var) {
                        AbstractC2256a.b("trimChain did not update the head");
                    }
                    r62.f229f = b02;
                    if (r0 != 0) {
                        r62.h();
                    }
                    this.f61T.h();
                    if (this.f78v == null || !r62.d(512)) {
                        return;
                    }
                    W(this);
                    return;
                }
                if (eVar == null) {
                    eVar = new S.e(new c0.k[16]);
                }
                r62.g(0, eVar, eVar3, lVar2, (mVar3 != null ? 1 : 0) ^ 1);
            }
            r0 = 1;
            r62.g = eVar3;
            if (eVar == null) {
            }
            r62.f230h = eVar;
            h0Var = i0.f239a;
            r22 = h0Var.f14118f;
            if (r22 != 0) {
            }
            b02.f14117e = null;
            h0Var.f14118f = null;
            h0Var.f14116d = -1;
            h0Var.f14120v = null;
            if (b02 == h0Var) {
            }
            r62.f229f = b02;
            if (r0 != 0) {
            }
            this.f61T.h();
            if (this.f78v == null) {
                return;
            } else {
                return;
            }
        }
        c0.l lVar6 = lVar2.f14118f;
        int i15 = 0;
        while (true) {
            if (lVar6 == null || i15 >= i7) {
                break;
            }
            if (eVar == null) {
                throw X.c.c("expected prior modifier list to be non-empty");
            }
            c0.k kVar = (c0.k) eVar.f8959a[i15];
            c0.k kVar2 = (c0.k) eVar3.f8959a[i15];
            char c10 = kotlin.jvm.internal.l.a(kVar, kVar2) ? (char) 2 : c0.o.a(kVar, kVar2) ? (char) 1 : (char) 0;
            if (c10 == 0) {
                lVar6 = lVar6.f14117e;
                break;
            }
            if (c10 == 1) {
                C0018g0.i(kVar, kVar2, lVar6);
            }
            lVar6 = lVar6.f14118f;
            i15++;
        }
    }

    public final void a0() {
        if (this.f79w <= 0 || !this.f82z) {
            return;
        }
        this.f82z = false;
        S.e eVar = this.f81y;
        if (eVar == null) {
            eVar = new S.e(new L[16]);
            this.f81y = eVar;
        }
        eVar.g();
        S.e eVar2 = (S.e) this.f80x.f23376b;
        Object[] objArr = eVar2.f8959a;
        int i7 = eVar2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l10 = (L) objArr[i10];
            if (l10.f68a) {
                eVar.c(eVar.f8961c, l10.x());
            } else {
                eVar.b(l10);
            }
        }
        P p10 = this.f61T;
        p10.f105p.f180M = true;
        Y y10 = p10.f106q;
        if (y10 != null) {
            y10.f140G = true;
        }
    }

    public final void b(B0.D d10) {
        L l10;
        C1034b c1034b;
        H0.i v10;
        if (!(this.f44B == null)) {
            AbstractC2256a.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        L l11 = this.f43A;
        if (l11 != null && !kotlin.jvm.internal.l.a(l11.f44B, d10)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(d10);
            sb2.append(") than the parent's owner(");
            L t5 = t();
            sb2.append(t5 != null ? t5.f44B : null);
            sb2.append("). This tree: ");
            sb2.append(h(0));
            sb2.append(" Parent tree: ");
            L l12 = this.f43A;
            sb2.append(l12 != null ? l12.h(0) : null);
            AbstractC2256a.b(sb2.toString());
        }
        L t10 = t();
        P p10 = this.f61T;
        if (t10 == null) {
            p10.f105p.f174F = true;
            Y y10 = p10.f106q;
            if (y10 != null) {
                y10.f137D = V.f125a;
            }
        }
        C0018g0 c0018g0 = this.f60S;
        ((n0) c0018g0.f227d).f275B = t10 != null ? (C0031u) t10.f60S.f226c : null;
        this.f44B = d10;
        this.f46D = (t10 != null ? t10.f46D : -1) + 1;
        c0.m mVar = this.f66Y;
        if (mVar != null) {
            a(mVar);
        }
        this.f66Y = null;
        d10.getLayoutNodes().g(this.f70b, this);
        L l13 = this.f43A;
        if (l13 == null || (l10 = l13.f78v) == null) {
            l10 = this.f78v;
        }
        W(l10);
        if (this.f78v == null && c0018g0.d(512)) {
            W(this);
        }
        if (!this.f73c0) {
            for (c0.l lVar = (c0.l) c0018g0.f229f; lVar != null; lVar = lVar.f14118f) {
                lVar.f0();
            }
        }
        S.e eVar = (S.e) this.f80x.f23376b;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((L) objArr[i10]).b(d10);
        }
        if (!this.f73c0) {
            c0018g0.e();
        }
        C();
        if (t10 != null) {
            t10.C();
        }
        n0 n0Var = ((C0031u) c0018g0.f226c).f274A;
        for (n0 n0Var2 = (n0) c0018g0.f227d; !kotlin.jvm.internal.l.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f274A) {
            n0Var2.M0(n0Var2.f278E, true);
            s0 s0Var = n0Var2.f292T;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
        Y0.c cVar = this.f67Z;
        if (cVar != null) {
            cVar.invoke(d10);
        }
        p10.h();
        if (!this.f73c0 && c0018g0.d(8)) {
            D();
        }
        d10.getClass();
        if (!B0.D.g() || (c1034b = d10.f1607Q) == null || (v10 = v()) == null) {
            return;
        }
        if (v10.f4494a.b(H0.q.f4551p)) {
            c1034b.g.a(this.f70b);
            c1034b.f16300a.E(c1034b.f16302c, this.f70b, true);
        }
    }

    public final void c() {
        this.f58Q = this.f57P;
        this.f57P = H.f32c;
        S.e x2 = x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l10 = (L) objArr[i10];
            if (l10.f57P != H.f32c) {
                l10.c();
            }
        }
    }

    @Override // Q.InterfaceC0494i
    public final void d() {
        C1034b c1034b;
        if (!F()) {
            AbstractC2256a.a("onReuse is only expected on attached node");
        }
        Y0.q qVar = this.f45C;
        if (qVar != null) {
            qVar.d();
        }
        y0.w wVar = this.f62U;
        if (wVar != null) {
            wVar.c(false);
        }
        this.f50H = false;
        boolean z8 = this.f73c0;
        C0018g0 c0018g0 = this.f60S;
        if (z8) {
            this.f73c0 = false;
        } else {
            for (c0.l lVar = (B0) c0018g0.f228e; lVar != null; lVar = lVar.f14117e) {
                if (lVar.f14112B) {
                    lVar.k0();
                }
            }
            c0018g0.f();
            for (c0.l lVar2 = (B0) c0018g0.f228e; lVar2 != null; lVar2 = lVar2.f14117e) {
                if (lVar2.f14112B) {
                    lVar2.g0();
                }
            }
        }
        int i7 = this.f70b;
        this.f70b = H0.j.f4498a.addAndGet(1);
        B0.D d10 = this.f44B;
        if (d10 != null) {
            d10.getLayoutNodes().f(i7);
            d10.getLayoutNodes().g(this.f70b, this);
        }
        for (c0.l lVar3 = (c0.l) c0018g0.f229f; lVar3 != null; lVar3 = lVar3.f14118f) {
            lVar3.f0();
        }
        c0018g0.e();
        if (c0018g0.d(8)) {
            D();
        }
        T(this);
        B0.D d11 = this.f44B;
        if (d11 != null) {
            if (B0.D.g() && (c1034b = d11.f1607Q) != null) {
                u.y yVar = c1034b.g;
                boolean e2 = yVar.e(i7);
                B0.D d12 = c1034b.f16302c;
                R7.a aVar = c1034b.f16300a;
                if (e2) {
                    aVar.E(d12, i7, false);
                }
                H0.i v10 = v();
                if (v10 != null) {
                    if (v10.f4494a.b(H0.q.f4551p)) {
                        yVar.a(this.f70b);
                        aVar.E(d12, this.f70b, true);
                    }
                }
            }
            d11.getRectManager().f(this, this.f61T.f105p.f169A, true);
        }
    }

    @Override // Q.InterfaceC0494i
    public final void e() {
        Y0.q qVar = this.f45C;
        if (qVar != null) {
            qVar.e();
        }
        y0.w wVar = this.f62U;
        if (wVar != null) {
            wVar.e();
        }
        C0018g0 c0018g0 = this.f60S;
        n0 n0Var = ((C0031u) c0018g0.f226c).f274A;
        for (n0 n0Var2 = (n0) c0018g0.f227d; !kotlin.jvm.internal.l.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f274A) {
            n0Var2.f276C = true;
            n0Var2.f290R.invoke();
            if (n0Var2.f292T != null) {
                n0Var2.M0(null, false);
                n0Var2.f293z.R(false);
            }
        }
    }

    @Override // Q.InterfaceC0494i
    public final void f() {
        C1034b c1034b;
        Y0.q qVar = this.f45C;
        if (qVar != null) {
            qVar.f();
        }
        y0.w wVar = this.f62U;
        if (wVar != null) {
            wVar.c(true);
        }
        this.f73c0 = true;
        C0018g0 c0018g0 = this.f60S;
        for (c0.l lVar = (B0) c0018g0.f228e; lVar != null; lVar = lVar.f14117e) {
            if (lVar.f14112B) {
                lVar.k0();
            }
        }
        c0018g0.f();
        for (c0.l lVar2 = (B0) c0018g0.f228e; lVar2 != null; lVar2 = lVar2.f14117e) {
            if (lVar2.f14112B) {
                lVar2.g0();
            }
        }
        if (F()) {
            this.f49G = null;
            this.f48F = false;
        }
        B0.D d10 = this.f44B;
        if (d10 != null) {
            d10.getRectManager().h(this);
            if (!B0.D.g() || (c1034b = d10.f1607Q) == null) {
                return;
            }
            if (c1034b.g.e(this.f70b)) {
                c1034b.f16300a.E(c1034b.f16302c, this.f70b, false);
            }
        }
    }

    public final void g() {
        this.f58Q = this.f57P;
        this.f57P = H.f32c;
        S.e x2 = x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l10 = (L) objArr[i10];
            if (l10.f57P == H.f31b) {
                l10.g();
            }
        }
    }

    public final String h(int i7) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        S.e x2 = x();
        Object[] objArr = x2.f8959a;
        int i11 = x2.f8961c;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((L) objArr[i12]).h(i7 + 1));
        }
        String sb3 = sb2.toString();
        if (i7 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public final void i() {
        C1034b c1034b;
        M m10;
        B0.D d10 = this.f44B;
        if (d10 == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            L t5 = t();
            sb2.append(t5 != null ? t5.h(0) : null);
            AbstractC2256a.c(sb2.toString());
            throw new Db.d(0);
        }
        L t10 = t();
        P p10 = this.f61T;
        if (t10 != null) {
            t10.A();
            t10.C();
            C0010c0 c0010c0 = p10.f105p;
            H h10 = H.f32c;
            c0010c0.f198z = h10;
            Y y10 = p10.f106q;
            if (y10 != null) {
                y10.f149x = h10;
            }
        }
        M m11 = p10.f105p.f179K;
        m11.f84b = true;
        m11.f85c = false;
        m11.f86d = false;
        m11.f87e = false;
        m11.f88f = null;
        Y y11 = p10.f106q;
        if (y11 != null && (m10 = y11.f138E) != null) {
            m10.f84b = true;
            m10.f85c = false;
            m10.f86d = false;
            m10.f87e = false;
            m10.f88f = null;
        }
        Y0.d dVar = this.f69a0;
        if (dVar != null) {
            dVar.invoke(d10);
        }
        C0018g0 c0018g0 = this.f60S;
        c0018g0.f();
        this.f47E = true;
        S.e eVar = (S.e) this.f80x.f23376b;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((L) objArr[i10]).i();
        }
        this.f47E = false;
        for (c0.l lVar = (B0) c0018g0.f228e; lVar != null; lVar = lVar.f14117e) {
            if (lVar.f14112B) {
                lVar.g0();
            }
        }
        d10.getLayoutNodes().f(this.f70b);
        C0006a0 c0006a0 = d10.f1621d0;
        q3.c cVar = c0006a0.f158b;
        ((D5.i) cVar.f23371b).w(this);
        ((D5.i) cVar.f23372c).w(this);
        ((S.e) c0006a0.f161e.f23391b).k(this);
        d10.f1608R = true;
        d10.getRectManager().h(this);
        if (B0.D.g() && (c1034b = d10.f1607Q) != null) {
            if (c1034b.g.e(this.f70b)) {
                c1034b.f16300a.E(c1034b.f16302c, this.f70b, false);
            }
        }
        this.f44B = null;
        W(null);
        this.f46D = 0;
        C0010c0 c0010c02 = p10.f105p;
        c0010c02.f195w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c0010c02.f194v = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c0010c02.f174F = false;
        Y y12 = p10.f106q;
        if (y12 != null) {
            y12.f148w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            y12.f147v = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            y12.f137D = V.f127c;
        }
        if (c0018g0.d(8)) {
            H0.i iVar = this.f49G;
            this.f49G = null;
            this.f48F = false;
            d10.getSemanticsOwner().b(this, iVar);
            d10.B();
        }
    }

    public final void j(j0.l lVar, C1533b c1533b) {
        ((n0) this.f60S.f227d).l0(lVar, c1533b);
    }

    public final void l() {
        if (this.f78v != null) {
            Q(this, false, 5);
        } else {
            S(this, false, 5);
        }
        C0010c0 c0010c0 = this.f61T.f105p;
        V0.a aVar = c0010c0.f196x ? new V0.a(c0010c0.f26557d) : null;
        if (aVar != null) {
            B0.D d10 = this.f44B;
            if (d10 != null) {
                d10.u(this, aVar.f9967a);
                return;
            }
            return;
        }
        B0.D d11 = this.f44B;
        if (d11 != null) {
            d11.t(true);
        }
    }

    public final List m() {
        Y y10 = this.f61T.f106q;
        kotlin.jvm.internal.l.b(y10);
        P p10 = y10.f145f;
        p10.f93a.n();
        boolean z8 = y10.f140G;
        S.e eVar = y10.f139F;
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
                Y y11 = l11.f61T.f106q;
                kotlin.jvm.internal.l.b(y11);
                eVar.b(y11);
            } else {
                Y y12 = l11.f61T.f106q;
                kotlin.jvm.internal.l.b(y12);
                Object[] objArr2 = eVar.f8959a;
                Object obj = objArr2[i10];
                objArr2[i10] = y12;
            }
        }
        eVar.m(((S.b) l10.n()).f8953a.f8961c, eVar.f8961c);
        y10.f140G = false;
        return eVar.f();
    }

    public final List n() {
        return x().f();
    }

    public final List o() {
        return ((S.e) this.f80x.f23376b).f();
    }

    public final boolean p() {
        return this.f61T.f105p.f177I;
    }

    public final boolean q() {
        return this.f61T.f105p.f176H;
    }

    @Override // A0.u0
    public final boolean r() {
        return F();
    }

    public final H s() {
        H h10;
        Y y10 = this.f61T.f106q;
        return (y10 == null || (h10 = y10.f149x) == null) ? H.f32c : h10;
    }

    public final L t() {
        L l10 = this.f43A;
        while (l10 != null && l10.f68a) {
            l10 = l10.f43A;
        }
        return l10;
    }

    public final String toString() {
        return B0.X.p(this) + " children: " + ((S.b) n()).f8953a.f8961c + " measurePolicy: " + this.f53K;
    }

    public final int u() {
        return this.f61T.f105p.f195w;
    }

    public final H0.i v() {
        if (F() && !this.f73c0 && this.f60S.d(8)) {
            return this.f49G;
        }
        return null;
    }

    public final S.e w() {
        boolean z8 = this.f52J;
        S.e eVar = this.f51I;
        if (z8) {
            eVar.g();
            eVar.c(eVar.f8961c, x());
            eVar.o(f42f0);
            this.f52J = false;
        }
        return eVar;
    }

    public final S.e x() {
        a0();
        if (this.f79w == 0) {
            return (S.e) this.f80x.f23376b;
        }
        S.e eVar = this.f81y;
        kotlin.jvm.internal.l.b(eVar);
        return eVar;
    }

    public final void y(long j, C0029s c0029s, int i7, boolean z8) {
        C0018g0 c0018g0 = this.f60S;
        n0 n0Var = (n0) c0018g0.f227d;
        j0.B b2 = n0.f270U;
        ((n0) c0018g0.f227d).y0(n0.f272W, n0Var.p0(j), c0029s, i7, z8);
    }

    public final void z(int i7, L l10) {
        if (l10.f43A != null && l10.f44B != null) {
            AbstractC2256a.b(k(l10));
        }
        l10.f43A = this;
        q3.e eVar = this.f80x;
        ((S.e) eVar.f23376b).a(i7, l10);
        ((J) eVar.f23377c).invoke();
        L();
        if (l10.f68a) {
            this.f79w++;
        }
        E();
        B0.D d10 = this.f44B;
        if (d10 != null) {
            l10.b(d10);
        }
        if (l10.f61T.f101l > 0) {
            P p10 = this.f61T;
            p10.b(p10.f101l + 1);
        }
    }
}
