package A0;

import a.AbstractC0672a;
import a0.AbstractC0682i;
import a0.AbstractC0692s;
import i0.C1288a;
import j0.AbstractC1362A;
import java.util.Map;
import m0.C1533b;
import u.C2041D;
import u.C2042E;
import x0.AbstractC2256a;
import y0.C2344l;
import y0.InterfaceC2317B;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public abstract class n0 extends T implements y0.z, InterfaceC2345m, u0 {

    /* renamed from: U, reason: collision with root package name */
    public static final j0.B f270U;

    /* renamed from: V, reason: collision with root package name */
    public static final C0033w f271V;

    /* renamed from: W, reason: collision with root package name */
    public static final C0013e f272W;

    /* renamed from: X, reason: collision with root package name */
    public static final C0013e f273X;

    /* renamed from: A, reason: collision with root package name */
    public n0 f274A;

    /* renamed from: B, reason: collision with root package name */
    public n0 f275B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f276C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f277D;

    /* renamed from: E, reason: collision with root package name */
    public Rb.c f278E;

    /* renamed from: F, reason: collision with root package name */
    public V0.c f279F;

    /* renamed from: G, reason: collision with root package name */
    public V0.l f280G;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC2317B f282I;

    /* renamed from: J, reason: collision with root package name */
    public C2041D f283J;
    public float L;

    /* renamed from: M, reason: collision with root package name */
    public C1288a f285M;

    /* renamed from: N, reason: collision with root package name */
    public C0033w f286N;

    /* renamed from: O, reason: collision with root package name */
    public C1533b f287O;

    /* renamed from: P, reason: collision with root package name */
    public j0.l f288P;

    /* renamed from: Q, reason: collision with root package name */
    public j0 f289Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f291S;

    /* renamed from: T, reason: collision with root package name */
    public s0 f292T;

    /* renamed from: z, reason: collision with root package name */
    public final L f293z;

    /* renamed from: H, reason: collision with root package name */
    public float f281H = 0.8f;

    /* renamed from: K, reason: collision with root package name */
    public long f284K = 0;

    /* renamed from: R, reason: collision with root package name */
    public final k0 f290R = new k0(this, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j0.B] */
    static {
        ?? obj = new Object();
        obj.f18500b = 1.0f;
        obj.f18501c = 1.0f;
        obj.f18502d = 1.0f;
        long j = j0.t.f18558a;
        obj.f18504f = j;
        obj.f18505u = j;
        obj.f18506v = 8.0f;
        obj.f18507w = j0.G.f18526b;
        obj.f18508x = AbstractC1362A.f18492a;
        obj.f18510z = 9205357640488583168L;
        obj.f18496A = Y6.b.a();
        obj.f18497B = V0.l.f9982a;
        f270U = obj;
        f271V = new C0033w();
        AbstractC1362A.g();
        f272W = new C0013e(1);
        f273X = new C0013e(2);
    }

    public n0(L l10) {
        this.f293z = l10;
        this.f279F = l10.L;
        this.f280G = l10.f54M;
    }

    @Override // y0.InterfaceC2345m
    public final long A(long j) {
        if (!t0().f14112B) {
            AbstractC2256a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        E0();
        for (n0 n0Var = this; n0Var != null; n0Var = n0Var.f275B) {
            s0 s0Var = n0Var.f292T;
            if (s0Var != null) {
                j = s0Var.a(j, false);
            }
            j = Z9.x.M(j, n0Var.f284K);
        }
        return j;
    }

    public final void A0() {
        s0 s0Var = this.f292T;
        if (s0Var != null) {
            s0Var.invalidate();
            return;
        }
        n0 n0Var = this.f275B;
        if (n0Var != null) {
            n0Var.A0();
        }
    }

    public final boolean B0() {
        if (this.f292T != null && this.f281H <= 0.0f) {
            return true;
        }
        n0 n0Var = this.f275B;
        if (n0Var != null) {
            return n0Var.B0();
        }
        return false;
    }

    public final long C0(InterfaceC2345m interfaceC2345m, long j) {
        n0 n0Var;
        boolean z8 = interfaceC2345m instanceof y0.y;
        if (z8) {
            ((y0.y) interfaceC2345m).f26634a.f124z.E0();
            return ((y0.y) interfaceC2345m).a(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        y0.y yVar = z8 ? (y0.y) interfaceC2345m : null;
        if (yVar == null || (n0Var = yVar.f26634a.f124z) == null) {
            kotlin.jvm.internal.l.c(interfaceC2345m, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            n0Var = (n0) interfaceC2345m;
        }
        n0Var.E0();
        n0 o02 = o0(n0Var);
        while (n0Var != o02) {
            s0 s0Var = n0Var.f292T;
            if (s0Var != null) {
                j = s0Var.a(j, false);
            }
            j = Z9.x.M(j, n0Var.f284K);
            n0Var = n0Var.f275B;
            kotlin.jvm.internal.l.b(n0Var);
        }
        return i0(o02, j);
    }

    public final void D0() {
        if (this.f292T != null || this.f278E == null) {
            return;
        }
        s0 a9 = t0.a(O.a(this.f293z), q0(), this.f290R, false, 8);
        a9.b(this.f26556c);
        a9.f(this.f284K);
        a9.invalidate();
        this.f292T = a9;
    }

    public final void E0() {
        P p10 = this.f293z.f61T;
        F f4 = p10.f93a.f61T.f96d;
        if (f4 == F.f22c || f4 == F.f23d) {
            if (p10.f105p.f181N) {
                p10.e(true);
            } else {
                p10.d(true);
            }
        }
        if (f4 == F.f23d) {
            Y y10 = p10.f106q;
            if (y10 == null || !y10.f141H) {
                p10.f(true);
            } else {
                p10.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void F0() {
        c0.l lVar;
        c0.l v02 = v0(o0.g(128));
        if (v02 == null || (v02.f14113a.f14116d & 128) == 0) {
            return;
        }
        AbstractC0682i c10 = AbstractC0692s.c();
        Rb.c e2 = c10 != null ? c10.e() : null;
        AbstractC0682i d10 = AbstractC0692s.d(c10);
        try {
            boolean g = o0.g(128);
            if (g) {
                lVar = t0();
            } else {
                lVar = t0().f14117e;
                if (lVar == null) {
                }
            }
            for (c0.l v03 = v0(g); v03 != null; v03 = v03.f14118f) {
                if ((v03.f14116d & 128) == 0) {
                    break;
                }
                if ((v03.f14115c & 128) != 0) {
                    ?? r82 = 0;
                    AbstractC0025n abstractC0025n = v03;
                    while (abstractC0025n != 0) {
                        if (abstractC0025n instanceof InterfaceC0034x) {
                            ((InterfaceC0034x) abstractC0025n).l(this.f26556c);
                        } else if ((abstractC0025n.f14115c & 128) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                            c0.l lVar2 = abstractC0025n.f269D;
                            int i7 = 0;
                            abstractC0025n = abstractC0025n;
                            r82 = r82;
                            while (lVar2 != null) {
                                if ((lVar2.f14115c & 128) != 0) {
                                    i7++;
                                    r82 = r82;
                                    if (i7 == 1) {
                                        abstractC0025n = lVar2;
                                    } else {
                                        if (r82 == 0) {
                                            r82 = new S.e(new c0.l[16]);
                                        }
                                        if (abstractC0025n != 0) {
                                            r82.b(abstractC0025n);
                                            abstractC0025n = 0;
                                        }
                                        r82.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.f14118f;
                                abstractC0025n = abstractC0025n;
                                r82 = r82;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC0025n = AbstractC0017g.e(r82);
                    }
                }
                if (v03 == lVar) {
                    break;
                }
            }
        } finally {
            AbstractC0692s.f(c10, d10, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void G0() {
        boolean g = o0.g(128);
        c0.l t02 = t0();
        if (!g && (t02 = t02.f14117e) == null) {
            return;
        }
        for (c0.l v02 = v0(g); v02 != null && (v02.f14116d & 128) != 0; v02 = v02.f14118f) {
            if ((v02.f14115c & 128) != 0) {
                AbstractC0025n abstractC0025n = v02;
                ?? r52 = 0;
                while (abstractC0025n != 0) {
                    if (abstractC0025n instanceof InterfaceC0034x) {
                        ((InterfaceC0034x) abstractC0025n).T(this);
                    } else if ((abstractC0025n.f14115c & 128) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                        c0.l lVar = abstractC0025n.f269D;
                        int i7 = 0;
                        abstractC0025n = abstractC0025n;
                        r52 = r52;
                        while (lVar != null) {
                            if ((lVar.f14115c & 128) != 0) {
                                i7++;
                                r52 = r52;
                                if (i7 == 1) {
                                    abstractC0025n = lVar;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new S.e(new c0.l[16]);
                                    }
                                    if (abstractC0025n != 0) {
                                        r52.b(abstractC0025n);
                                        abstractC0025n = 0;
                                    }
                                    r52.b(lVar);
                                }
                            }
                            lVar = lVar.f14118f;
                            abstractC0025n = abstractC0025n;
                            r52 = r52;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC0025n = AbstractC0017g.e(r52);
                }
            }
            if (v02 == t02) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [S.e] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [S.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void H0(c0.l lVar, C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8, float f4, boolean z10) {
        if (lVar == null) {
            z0(c0013e, j, c0029s, i7, z8);
            return;
        }
        if (u0.u.e(i7, 3) || u0.u.e(i7, 4)) {
            AbstractC0025n abstractC0025n = lVar;
            ?? r62 = 0;
            while (true) {
                if (abstractC0025n == 0) {
                    break;
                }
                if (abstractC0025n instanceof y0) {
                    ((y0) abstractC0025n).getClass();
                    int i10 = C0.f15b;
                    long j10 = C0.f14a;
                    int i11 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i11);
                    L l10 = this.f293z;
                    V0.l lVar2 = l10.f54M;
                    int i12 = C0.f15b;
                    long j11 = j10 & Long.MIN_VALUE;
                    if (intBitsToFloat >= (-((j11 == 0 || lVar2 == V0.l.f9982a) ? C0013e.a(0, j10) : C0013e.a(2, j10)))) {
                        if (Float.intBitsToFloat(i11) < I() + ((j11 == 0 || l10.f54M == V0.l.f9982a) ? C0013e.a(2, j10) : C0013e.a(0, j10))) {
                            int i13 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i13) >= (-C0013e.a(1, j10))) {
                                if (Float.intBitsToFloat(i13) < C0013e.a(3, j10) + H()) {
                                    l0 l0Var = new l0(this, lVar, c0013e, j, c0029s, i7, z8, f4, z10);
                                    int i14 = c0029s.f308c;
                                    int s3 = y7.u0.s(c0029s);
                                    u.z zVar = c0029s.f307b;
                                    C2042E c2042e = c0029s.f306a;
                                    if (i14 == s3) {
                                        int i15 = c0029s.f308c;
                                        c0029s.o(i15 + 1, c2042e.f24585b);
                                        c0029s.f308c++;
                                        c2042e.a(lVar);
                                        zVar.a(AbstractC0017g.a(0.0f, z8, true));
                                        l0Var.invoke();
                                        c0029s.f308c = i15;
                                        return;
                                    }
                                    long b2 = c0029s.b();
                                    int i16 = c0029s.f308c;
                                    if (!AbstractC0017g.n(b2)) {
                                        if (AbstractC0017g.j(b2) > 0.0f) {
                                            int i17 = c0029s.f308c;
                                            c0029s.o(i17 + 1, c2042e.f24585b);
                                            c0029s.f308c++;
                                            c2042e.a(lVar);
                                            zVar.a(AbstractC0017g.a(0.0f, z8, true));
                                            l0Var.invoke();
                                            c0029s.f308c = i17;
                                            return;
                                        }
                                        return;
                                    }
                                    int s10 = y7.u0.s(c0029s);
                                    c0029s.f308c = s10;
                                    c0029s.o(s10 + 1, c2042e.f24585b);
                                    c0029s.f308c++;
                                    c2042e.a(lVar);
                                    zVar.a(AbstractC0017g.a(0.0f, z8, true));
                                    l0Var.invoke();
                                    c0029s.f308c = s10;
                                    if (AbstractC0017g.j(c0029s.b()) < 0.0f) {
                                        c0029s.o(i16 + 1, c0029s.f308c + 1);
                                    }
                                    c0029s.f308c = i16;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                        c0.l lVar3 = abstractC0025n.f269D;
                        int i18 = 0;
                        abstractC0025n = abstractC0025n;
                        r62 = r62;
                        while (lVar3 != null) {
                            if ((lVar3.f14115c & 16) != 0) {
                                i18++;
                                r62 = r62;
                                if (i18 == 1) {
                                    abstractC0025n = lVar3;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new S.e(new c0.l[16]);
                                    }
                                    if (abstractC0025n != 0) {
                                        r62.b(abstractC0025n);
                                        abstractC0025n = 0;
                                    }
                                    r62.b(lVar3);
                                }
                            }
                            lVar3 = lVar3.f14118f;
                            abstractC0025n = abstractC0025n;
                            r62 = r62;
                        }
                        if (i18 == 1) {
                        }
                    }
                    abstractC0025n = AbstractC0017g.e(r62);
                }
            }
        }
        if (z10) {
            x0(lVar, c0013e, j, c0029s, i7, z8, f4);
            return;
        }
        switch (c0013e.f201a) {
            case 1:
                AbstractC0025n abstractC0025n2 = lVar;
                ?? r12 = 0;
                while (abstractC0025n2 != 0) {
                    if (abstractC0025n2 instanceof y0) {
                        ((y0) abstractC0025n2).V();
                    } else if ((abstractC0025n2.f14115c & 16) != 0 && (abstractC0025n2 instanceof AbstractC0025n)) {
                        c0.l lVar4 = abstractC0025n2.f269D;
                        int i19 = 0;
                        abstractC0025n2 = abstractC0025n2;
                        r12 = r12;
                        while (lVar4 != null) {
                            if ((lVar4.f14115c & 16) != 0) {
                                i19++;
                                r12 = r12;
                                if (i19 == 1) {
                                    abstractC0025n2 = lVar4;
                                } else {
                                    if (r12 == 0) {
                                        r12 = new S.e(new c0.l[16]);
                                    }
                                    if (abstractC0025n2 != 0) {
                                        r12.b(abstractC0025n2);
                                        abstractC0025n2 = 0;
                                    }
                                    r12.b(lVar4);
                                }
                            }
                            lVar4 = lVar4.f14118f;
                            abstractC0025n2 = abstractC0025n2;
                            r12 = r12;
                        }
                        if (i19 != 1) {
                            abstractC0025n2 = AbstractC0017g.e(r12);
                        }
                    }
                    abstractC0025n2 = AbstractC0017g.e(r12);
                }
                break;
        }
        H0(AbstractC0017g.d(lVar, c0013e.b()), c0013e, j, c0029s, i7, z8, f4, false);
    }

    public abstract void I0(j0.l lVar, C1533b c1533b);

    public final void J0(long j, float f4, Rb.c cVar) {
        M0(cVar, false);
        if (!V0.i.a(this.f284K, j)) {
            this.f284K = j;
            L l10 = this.f293z;
            l10.f61T.f105p.U();
            s0 s0Var = this.f292T;
            if (s0Var != null) {
                s0Var.f(j);
            } else {
                n0 n0Var = this.f275B;
                if (n0Var != null) {
                    n0Var.A0();
                }
            }
            T.f0(this);
            B0.D d10 = l10.f44B;
            if (d10 != null) {
                d10.y(l10);
            }
        }
        this.L = f4;
        if (this.f115v) {
            return;
        }
        S(new x0(c0(), this));
    }

    public final void K0(C1288a c1288a, boolean z8, boolean z10) {
        s0 s0Var = this.f292T;
        if (s0Var != null) {
            if (this.f277D) {
                if (z10) {
                    long s02 = s0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (s02 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (s02 & 4294967295L)) / 2.0f;
                    long j = this.f26556c;
                    c1288a.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z8) {
                    long j10 = this.f26556c;
                    c1288a.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (c1288a.b()) {
                    return;
                }
            }
            s0Var.c(c1288a, false);
        }
        long j11 = this.f284K;
        float f4 = (int) (j11 >> 32);
        c1288a.f18168a += f4;
        c1288a.f18170c += f4;
        float f10 = (int) (j11 & 4294967295L);
        c1288a.f18169b += f10;
        c1288a.f18171d += f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [S.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [S.e] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void L0(InterfaceC2317B interfaceC2317B) {
        n0 n0Var;
        int i7 = 1;
        InterfaceC2317B interfaceC2317B2 = this.f282I;
        if (interfaceC2317B != interfaceC2317B2) {
            this.f282I = interfaceC2317B;
            L l10 = this.f293z;
            int i10 = 0;
            if (interfaceC2317B2 == null || interfaceC2317B.getWidth() != interfaceC2317B2.getWidth() || interfaceC2317B.getHeight() != interfaceC2317B2.getHeight()) {
                int width = interfaceC2317B.getWidth();
                int height = interfaceC2317B.getHeight();
                s0 s0Var = this.f292T;
                if (s0Var != null) {
                    s0Var.b((width << 32) | (height & 4294967295L));
                } else if (l10.G() && (n0Var = this.f275B) != null) {
                    n0Var.A0();
                }
                N((height & 4294967295L) | (width << 32));
                if (this.f278E != null) {
                    N0(false);
                }
                boolean g = o0.g(4);
                c0.l t02 = t0();
                if (g || (t02 = t02.f14117e) != null) {
                    for (c0.l v02 = v0(g); v02 != null && (v02.f14116d & 4) != 0; v02 = v02.f14118f) {
                        if ((v02.f14115c & 4) != 0) {
                            AbstractC0025n abstractC0025n = v02;
                            ?? r10 = 0;
                            while (abstractC0025n != 0) {
                                if (abstractC0025n instanceof InterfaceC0026o) {
                                    ((InterfaceC0026o) abstractC0025n).U();
                                } else if ((abstractC0025n.f14115c & 4) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                    c0.l lVar = abstractC0025n.f269D;
                                    int i11 = 0;
                                    abstractC0025n = abstractC0025n;
                                    r10 = r10;
                                    while (lVar != null) {
                                        if ((lVar.f14115c & 4) != 0) {
                                            i11++;
                                            r10 = r10;
                                            if (i11 == 1) {
                                                abstractC0025n = lVar;
                                            } else {
                                                if (r10 == 0) {
                                                    r10 = new S.e(new c0.l[16]);
                                                }
                                                if (abstractC0025n != 0) {
                                                    r10.b(abstractC0025n);
                                                    abstractC0025n = 0;
                                                }
                                                r10.b(lVar);
                                            }
                                        }
                                        lVar = lVar.f14118f;
                                        abstractC0025n = abstractC0025n;
                                        r10 = r10;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC0025n = AbstractC0017g.e(r10);
                            }
                        }
                        if (v02 == t02) {
                            break;
                        }
                    }
                }
                B0.D d10 = l10.f44B;
                if (d10 != null) {
                    d10.y(l10);
                }
            }
            C2041D c2041d = this.f283J;
            if ((c2041d == null || c2041d.f24582e == 0) && interfaceC2317B.a().isEmpty()) {
                return;
            }
            C2041D c2041d2 = this.f283J;
            Map a9 = interfaceC2317B.a();
            if (c2041d2 != null && c2041d2.f24582e == a9.size()) {
                Object[] objArr = c2041d2.f24579b;
                int[] iArr = c2041d2.f24580c;
                long[] jArr = c2041d2.f24578a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((j & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) a9.get((C2344l) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i7 = 1;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12 += i7;
                    i10 = 0;
                }
            }
            l10.f61T.f105p.f179K.f();
            C2041D c2041d3 = this.f283J;
            if (c2041d3 == null) {
                C2041D c2041d4 = u.N.f24629a;
                c2041d3 = new C2041D();
                this.f283J = c2041d3;
            }
            c2041d3.a();
            for (Map.Entry entry : interfaceC2317B.a().entrySet()) {
                c2041d3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void M0(Rb.c cVar, boolean z8) {
        B0.D d10;
        L l10 = this.f293z;
        boolean z10 = (!z8 && this.f278E == cVar && kotlin.jvm.internal.l.a(this.f279F, l10.L) && this.f280G == l10.f54M) ? false : true;
        this.f279F = l10.L;
        this.f280G = l10.f54M;
        boolean F10 = l10.F();
        k0 k0Var = this.f290R;
        if (!F10 || cVar == null) {
            this.f278E = null;
            s0 s0Var = this.f292T;
            if (s0Var != null) {
                s0Var.destroy();
                l10.f64W = true;
                k0Var.invoke();
                if (t0().f14112B && l10.G() && (d10 = l10.f44B) != null) {
                    d10.y(l10);
                }
            }
            this.f292T = null;
            this.f291S = false;
            return;
        }
        this.f278E = cVar;
        if (this.f292T != null) {
            if (z10 && N0(true)) {
                ((B0.D) O.a(l10)).getRectManager().e(l10);
                return;
            }
            return;
        }
        s0 a9 = t0.a(O.a(l10), q0(), k0Var, l10.f77u, 4);
        a9.b(this.f26556c);
        a9.f(this.f284K);
        this.f292T = a9;
        N0(true);
        l10.f64W = true;
        k0Var.invoke();
    }

    public final boolean N0(boolean z8) {
        B0.D d10;
        s0 s0Var = this.f292T;
        boolean z10 = false;
        if (s0Var == null) {
            if (this.f278E != null) {
                AbstractC2256a.b("null layer with a non-null layerBlock");
            }
            return false;
        }
        Rb.c cVar = this.f278E;
        if (cVar == null) {
            throw X.c.c("updateLayerParameters requires a non-null layerBlock");
        }
        j0.B b2 = f270U;
        b2.b(1.0f);
        b2.c(1.0f);
        b2.a(1.0f);
        if (b2.f18503e != 0.0f) {
            b2.f18499a |= 32;
            b2.f18503e = 0.0f;
        }
        long j = j0.t.f18558a;
        if (!j0.n.c(b2.f18504f, j)) {
            b2.f18499a |= 64;
            b2.f18504f = j;
        }
        if (!j0.n.c(b2.f18505u, j)) {
            b2.f18499a |= 128;
            b2.f18505u = j;
        }
        if (b2.f18506v != 8.0f) {
            b2.f18499a |= 2048;
            b2.f18506v = 8.0f;
        }
        b2.d(j0.G.f18526b);
        Y5.A a9 = AbstractC1362A.f18492a;
        if (!kotlin.jvm.internal.l.a(b2.f18508x, a9)) {
            b2.f18499a |= 8192;
            b2.f18508x = a9;
        }
        if (b2.f18509y) {
            b2.f18499a |= 16384;
            b2.f18509y = false;
        }
        if (!kotlin.jvm.internal.l.a(null, null)) {
            b2.f18499a |= 131072;
        }
        if (!AbstractC1362A.i(0)) {
            b2.f18499a |= 32768;
        }
        b2.f18510z = 9205357640488583168L;
        b2.f18498C = null;
        b2.f18499a = 0;
        L l10 = this.f293z;
        b2.f18496A = l10.L;
        b2.f18497B = l10.f54M;
        b2.f18510z = AbstractC0672a.u(this.f26556c);
        ((B0.D) O.a(l10)).getSnapshotObserver().a(this, C0015f.f207e, new J(cVar, 1));
        C0033w c0033w = this.f286N;
        if (c0033w == null) {
            c0033w = new C0033w();
            this.f286N = c0033w;
        }
        C0033w c0033w2 = f271V;
        c0033w2.getClass();
        c0033w2.f321a = c0033w.f321a;
        c0033w2.f322b = c0033w.f322b;
        c0033w2.f323c = c0033w.f323c;
        c0033w2.f324d = c0033w.f324d;
        c0033w.f321a = b2.f18500b;
        c0033w.f322b = b2.f18501c;
        c0033w.f323c = b2.f18506v;
        c0033w.f324d = b2.f18507w;
        s0Var.d(b2);
        boolean z11 = this.f277D;
        this.f277D = b2.f18509y;
        this.f281H = b2.f18502d;
        if (c0033w2.f321a == c0033w.f321a && c0033w2.f322b == c0033w.f322b && c0033w2.f323c == c0033w.f323c && j0.G.a(c0033w2.f324d, c0033w.f324d)) {
            z10 = true;
        }
        boolean z12 = !z10;
        if (z8 && ((!z10 || z11 != this.f277D) && (d10 = l10.f44B) != null)) {
            d10.y(l10);
        }
        return z12;
    }

    public final boolean O0(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        s0 s0Var = this.f292T;
        return s0Var == null || !this.f277D || s0Var.i(j);
    }

    @Override // A0.T
    public final T U() {
        return this.f274A;
    }

    @Override // A0.T
    public final InterfaceC2345m V() {
        return this;
    }

    @Override // A0.T
    public final boolean Z() {
        return this.f282I != null;
    }

    @Override // A0.T
    public final L b0() {
        return this.f293z;
    }

    @Override // y0.InterfaceC2345m
    public final long c(long j) {
        long A10 = A(j);
        B0.D d10 = (B0.D) O.a(this.f293z);
        d10.C();
        return AbstractC1362A.s(A10, d10.f1626g0);
    }

    @Override // A0.T
    public final InterfaceC2317B c0() {
        InterfaceC2317B interfaceC2317B = this.f282I;
        if (interfaceC2317B != null) {
            return interfaceC2317B;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // y0.AbstractC2323H, y0.z
    public final Object d() {
        L l10 = this.f293z;
        if (!l10.f60S.d(64)) {
            return null;
        }
        t0();
        Object obj = null;
        for (c0.l lVar = (B0) l10.f60S.f228e; lVar != null; lVar = lVar.f14117e) {
            if ((lVar.f14115c & 64) != 0) {
                AbstractC0025n abstractC0025n = lVar;
                ?? r52 = 0;
                while (abstractC0025n != 0) {
                    if (abstractC0025n instanceof w0) {
                        obj = ((w0) abstractC0025n).S(obj);
                    } else if ((abstractC0025n.f14115c & 64) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                        c0.l lVar2 = abstractC0025n.f269D;
                        int i7 = 0;
                        abstractC0025n = abstractC0025n;
                        r52 = r52;
                        while (lVar2 != null) {
                            if ((lVar2.f14115c & 64) != 0) {
                                i7++;
                                r52 = r52;
                                if (i7 == 1) {
                                    abstractC0025n = lVar2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new S.e(new c0.l[16]);
                                    }
                                    if (abstractC0025n != 0) {
                                        r52.b(abstractC0025n);
                                        abstractC0025n = 0;
                                    }
                                    r52.b(lVar2);
                                }
                            }
                            lVar2 = lVar2.f14118f;
                            abstractC0025n = abstractC0025n;
                            r52 = r52;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC0025n = AbstractC0017g.e(r52);
                }
            }
        }
        return obj;
    }

    @Override // A0.T
    public final T d0() {
        return this.f275B;
    }

    @Override // y0.InterfaceC2345m
    public final InterfaceC2345m e() {
        if (!t0().f14112B) {
            AbstractC2256a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        E0();
        return ((n0) this.f293z.f60S.f227d).f275B;
    }

    @Override // A0.T
    public final long e0() {
        return this.f284K;
    }

    @Override // V0.c
    public final float f() {
        return this.f293z.L.f();
    }

    @Override // A0.T
    public final void g0() {
        M(this.f284K, this.L, this.f278E);
    }

    @Override // y0.InterfaceC2318C
    public final V0.l getLayoutDirection() {
        return this.f293z.f54M;
    }

    public final void h0(n0 n0Var, C1288a c1288a, boolean z8) {
        if (n0Var == this) {
            return;
        }
        n0 n0Var2 = this.f275B;
        if (n0Var2 != null) {
            n0Var2.h0(n0Var, c1288a, z8);
        }
        long j = this.f284K;
        float f4 = (int) (j >> 32);
        c1288a.f18168a -= f4;
        c1288a.f18170c -= f4;
        float f10 = (int) (j & 4294967295L);
        c1288a.f18169b -= f10;
        c1288a.f18171d -= f10;
        s0 s0Var = this.f292T;
        if (s0Var != null) {
            s0Var.c(c1288a, true);
            if (this.f277D && z8) {
                long j10 = this.f26556c;
                c1288a.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final long i0(n0 n0Var, long j) {
        if (n0Var == this) {
            return j;
        }
        n0 n0Var2 = this.f275B;
        return (n0Var2 == null || kotlin.jvm.internal.l.a(n0Var, n0Var2)) ? p0(j) : p0(n0Var2.i0(n0Var, j));
    }

    public final long j0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - I();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - H();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // V0.c
    public final float k() {
        return this.f293z.L.k();
    }

    public final float k0(long j, long j10) {
        if (I() >= Float.intBitsToFloat((int) (j10 >> 32)) && H() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long j02 = j0(j10);
        float intBitsToFloat = Float.intBitsToFloat((int) (j02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - I());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - H())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat <= 0.0f && intBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        int i7 = (int) (floatToRawIntBits >> 32);
        if (Float.intBitsToFloat(i7) > intBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i10 = (int) (floatToRawIntBits & 4294967295L);
        if (Float.intBitsToFloat(i10) > intBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i7);
        float intBitsToFloat5 = Float.intBitsToFloat(i10);
        return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
    }

    public final void l0(j0.l lVar, C1533b c1533b) {
        s0 s0Var = this.f292T;
        if (s0Var != null) {
            s0Var.h(lVar, c1533b);
            return;
        }
        long j = this.f284K;
        float f4 = (int) (j >> 32);
        float f10 = (int) (j & 4294967295L);
        lVar.f(f4, f10);
        m0(lVar, c1533b);
        lVar.f(-f4, -f10);
    }

    public final void m0(j0.l lVar, C1533b c1533b) {
        c0.l u02 = u0(4);
        if (u02 == null) {
            I0(lVar, c1533b);
            return;
        }
        L l10 = this.f293z;
        l10.getClass();
        N sharedDrawScope = ((B0.D) O.a(l10)).getSharedDrawScope();
        long u3 = AbstractC0672a.u(this.f26556c);
        sharedDrawScope.getClass();
        S.e eVar = null;
        while (u02 != null) {
            if (u02 instanceof InterfaceC0026o) {
                sharedDrawScope.b(lVar, u3, this, (InterfaceC0026o) u02, c1533b);
            } else if ((u02.f14115c & 4) != 0 && (u02 instanceof AbstractC0025n)) {
                int i7 = 0;
                for (c0.l lVar2 = ((AbstractC0025n) u02).f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
                    if ((lVar2.f14115c & 4) != 0) {
                        i7++;
                        if (i7 == 1) {
                            u02 = lVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new S.e(new c0.l[16]);
                            }
                            if (u02 != null) {
                                eVar.b(u02);
                                u02 = null;
                            }
                            eVar.b(lVar2);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            u02 = AbstractC0017g.e(eVar);
        }
    }

    public abstract void n0();

    public final n0 o0(n0 n0Var) {
        L l10 = n0Var.f293z;
        L l11 = this.f293z;
        if (l10 == l11) {
            c0.l t02 = n0Var.t0();
            c0.l t03 = t0();
            if (!t03.f14113a.f14112B) {
                AbstractC2256a.b("visitLocalAncestors called on an unattached node");
            }
            for (c0.l lVar = t03.f14113a.f14117e; lVar != null; lVar = lVar.f14117e) {
                if ((lVar.f14115c & 2) != 0 && lVar == t02) {
                    return n0Var;
                }
            }
            return this;
        }
        while (l10.f46D > l11.f46D) {
            l10 = l10.t();
            kotlin.jvm.internal.l.b(l10);
        }
        L l12 = l11;
        while (l12.f46D > l10.f46D) {
            l12 = l12.t();
            kotlin.jvm.internal.l.b(l12);
        }
        while (l10 != l12) {
            l10 = l10.t();
            l12 = l12.t();
            if (l10 == null || l12 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return l12 == l11 ? this : l10 == n0Var.f293z ? n0Var : (C0031u) l10.f60S.f226c;
    }

    public final long p0(long j) {
        long j10 = this.f284K;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j10 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        s0 s0Var = this.f292T;
        return s0Var != null ? s0Var.a(floatToRawIntBits, true) : floatToRawIntBits;
    }

    public final Rb.e q0() {
        j0 j0Var = this.f289Q;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, this, new k0(this, 0));
        this.f289Q = j0Var2;
        return j0Var2;
    }

    @Override // A0.u0
    public final boolean r() {
        return (this.f292T == null || this.f276C || !this.f293z.F()) ? false : true;
    }

    public abstract U r0();

    public final long s0() {
        return this.f279F.G(this.f293z.f55N.c());
    }

    public abstract c0.l t0();

    public final c0.l u0(int i7) {
        boolean g = o0.g(i7);
        c0.l t02 = t0();
        if (!g && (t02 = t02.f14117e) == null) {
            return null;
        }
        for (c0.l v02 = v0(g); v02 != null && (v02.f14116d & i7) != 0; v02 = v02.f14118f) {
            if ((v02.f14115c & i7) != 0) {
                return v02;
            }
            if (v02 == t02) {
                return null;
            }
        }
        return null;
    }

    public final c0.l v0(boolean z8) {
        c0.l t02;
        C0018g0 c0018g0 = this.f293z.f60S;
        if (((n0) c0018g0.f227d) == this) {
            return (c0.l) c0018g0.f229f;
        }
        if (z8) {
            n0 n0Var = this.f275B;
            if (n0Var != null && (t02 = n0Var.t0()) != null) {
                return t02.f14118f;
            }
        } else {
            n0 n0Var2 = this.f275B;
            if (n0Var2 != null) {
                return n0Var2.t0();
            }
        }
        return null;
    }

    @Override // y0.InterfaceC2345m
    public final boolean w() {
        return t0().f14112B;
    }

    public final void w0(c0.l lVar, C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8) {
        if (lVar == null) {
            z0(c0013e, j, c0029s, i7, z8);
            return;
        }
        int i10 = c0029s.f308c;
        C2042E c2042e = c0029s.f306a;
        c0029s.o(i10 + 1, c2042e.f24585b);
        c0029s.f308c++;
        c2042e.a(lVar);
        c0029s.f307b.a(AbstractC0017g.a(-1.0f, z8, false));
        w0(AbstractC0017g.d(lVar, c0013e.b()), c0013e, j, c0029s, i7, z8);
        c0029s.f308c = i10;
    }

    @Override // y0.InterfaceC2345m
    public final i0.c x(InterfaceC2345m interfaceC2345m, boolean z8) {
        n0 n0Var;
        if (!t0().f14112B) {
            AbstractC2256a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC2345m.w()) {
            AbstractC2256a.b("LayoutCoordinates " + interfaceC2345m + " is not attached!");
        }
        y0.y yVar = interfaceC2345m instanceof y0.y ? (y0.y) interfaceC2345m : null;
        if (yVar == null || (n0Var = yVar.f26634a.f124z) == null) {
            n0Var = (n0) interfaceC2345m;
        }
        n0Var.E0();
        n0 o02 = o0(n0Var);
        C1288a c1288a = this.f285M;
        if (c1288a == null) {
            c1288a = new C1288a();
            this.f285M = c1288a;
        }
        c1288a.f18168a = 0.0f;
        c1288a.f18169b = 0.0f;
        c1288a.f18170c = (int) (interfaceC2345m.z() >> 32);
        c1288a.f18171d = (int) (interfaceC2345m.z() & 4294967295L);
        while (n0Var != o02) {
            n0Var.K0(c1288a, z8, false);
            if (c1288a.b()) {
                return i0.c.f18173e;
            }
            n0Var = n0Var.f275B;
            kotlin.jvm.internal.l.b(n0Var);
        }
        h0(o02, c1288a, z8);
        return new i0.c(c1288a.f18168a, c1288a.f18169b, c1288a.f18170c, c1288a.f18171d);
    }

    public final void x0(c0.l lVar, C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8, float f4) {
        if (lVar == null) {
            z0(c0013e, j, c0029s, i7, z8);
            return;
        }
        int i10 = c0029s.f308c;
        C2042E c2042e = c0029s.f306a;
        c0029s.o(i10 + 1, c2042e.f24585b);
        c0029s.f308c++;
        c2042e.a(lVar);
        c0029s.f307b.a(AbstractC0017g.a(f4, z8, false));
        H0(AbstractC0017g.d(lVar, c0013e.b()), c0013e, j, c0029s, i7, z8, f4, true);
        c0029s.f308c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (A0.AbstractC0017g.g(r20.b(), A0.AbstractC0017g.a(r11, r22, false)) > 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8) {
        c0.l u02 = u0(c0013e.b());
        boolean z10 = true;
        if (!O0(j)) {
            if (u0.u.e(i7, 1)) {
                float k02 = k0(j, s0());
                if ((Float.floatToRawIntBits(k02) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
                    if (c0029s.f308c != y7.u0.s(c0029s)) {
                        if (AbstractC0017g.g(c0029s.b(), AbstractC0017g.a(k02, false, false)) <= 0) {
                            return;
                        }
                    }
                    x0(u02, c0013e, j, c0029s, i7, false, k02);
                    return;
                }
                return;
            }
            return;
        }
        if (u02 == null) {
            z0(c0013e, j, c0029s, i7, z8);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < I() && intBitsToFloat2 < H()) {
            w0(u02, c0013e, j, c0029s, i7, z8);
            return;
        }
        float k03 = !u0.u.e(i7, 1) ? Float.POSITIVE_INFINITY : k0(j, s0());
        if ((Float.floatToRawIntBits(k03) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
            if (c0029s.f308c == y7.u0.s(c0029s)) {
            }
            H0(u02, c0013e, j, c0029s, i7, z8, k03, z10);
        }
        z10 = false;
        H0(u02, c0013e, j, c0029s, i7, z8, k03, z10);
    }

    @Override // y0.InterfaceC2345m
    public final long z() {
        return this.f26556c;
    }

    public void z0(C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8) {
        n0 n0Var = this.f274A;
        if (n0Var != null) {
            n0Var.y0(c0013e, n0Var.p0(j), c0029s, i7, z8);
        }
    }
}
