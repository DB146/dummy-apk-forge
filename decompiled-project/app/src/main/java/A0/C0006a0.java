package A0;

import x0.AbstractC2256a;
import y0.AbstractC2322G;

/* renamed from: A0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006a0 {

    /* renamed from: a, reason: collision with root package name */
    public final L f157a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f159c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f160d;

    /* renamed from: i, reason: collision with root package name */
    public V0.a f164i;

    /* renamed from: b, reason: collision with root package name */
    public final q3.c f158b = new q3.c(1, (byte) 0);

    /* renamed from: e, reason: collision with root package name */
    public final q3.l f161e = new q3.l(1);

    /* renamed from: f, reason: collision with root package name */
    public final S.e f162f = new S.e(new L[16]);
    public final long g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final S.e f163h = new S.e(new Z[16]);

    public C0006a0(L l10) {
        this.f157a = l10;
    }

    public static boolean b(L l10, V0.a aVar) {
        boolean Z7;
        L l11 = l10.f78v;
        if (l11 == null) {
            return false;
        }
        P p10 = l10.f61T;
        if (aVar != null) {
            if (l11 != null) {
                Y y10 = p10.f106q;
                kotlin.jvm.internal.l.b(y10);
                Z7 = y10.Z(aVar.f9967a);
            }
            Z7 = false;
        } else {
            Y y11 = p10.f106q;
            V0.a aVar2 = y11 != null ? y11.f134A : null;
            if (aVar2 != null && l11 != null) {
                kotlin.jvm.internal.l.b(y11);
                Z7 = y11.Z(aVar2.f9967a);
            }
            Z7 = false;
        }
        L t5 = l10.t();
        if (Z7 && t5 != null) {
            if (t5.f78v == null) {
                L.S(t5, false, 3);
            } else if (l10.s() == H.f30a) {
                L.Q(t5, false, 3);
            } else if (l10.s() == H.f31b) {
                t5.P(false);
            }
        }
        return Z7;
    }

    public static boolean c(L l10, V0.a aVar) {
        boolean z8;
        if (aVar != null) {
            if (l10.f57P == H.f32c) {
                l10.c();
            }
            z8 = l10.f61T.f105p.b0(aVar.f9967a);
        } else {
            C0010c0 c0010c0 = l10.f61T.f105p;
            V0.a aVar2 = c0010c0.f196x ? new V0.a(c0010c0.f26557d) : null;
            if (aVar2 != null) {
                if (l10.f57P == H.f32c) {
                    l10.c();
                }
                z8 = l10.f61T.f105p.b0(aVar2.f9967a);
            } else {
                z8 = false;
            }
        }
        L t5 = l10.t();
        if (z8 && t5 != null) {
            H h10 = l10.f61T.f105p.f198z;
            if (h10 == H.f30a) {
                L.S(t5, false, 3);
            } else if (h10 == H.f31b) {
                t5.R(false);
            }
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r2 = r2.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r2.G() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0004, code lost:
    
        if (r2.q() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (i(r2) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r0 = r2.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r0 = r0.f61T.f96d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0 != A0.F.f20a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(L l10) {
    }

    public static boolean i(L l10) {
        C0010c0 c0010c0 = l10.f61T.f105p;
        return c0010c0.f198z == H.f30a || c0010c0.f179K.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z8) {
        Object[] objArr;
        q3.l lVar = this.f161e;
        if (z8) {
            S.e eVar = (S.e) lVar.f23391b;
            eVar.g();
            L l10 = this.f157a;
            eVar.b(l10);
            l10.f71b0 = true;
        }
        r0 r0Var = r0.f304b;
        S.e eVar2 = (S.e) lVar.f23391b;
        eVar2.o(r0Var);
        int i7 = eVar2.f8961c;
        L[] lArr = (L[]) lVar.f23392c;
        if (lArr != null) {
            int length = lArr.length;
            objArr = lArr;
        }
        objArr = new L[Math.max(16, i7)];
        lVar.f23392c = null;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = eVar2.f8959a[i10];
        }
        eVar2.g();
        for (int i11 = i7 - 1; -1 < i11; i11--) {
            L l11 = objArr[i11];
            kotlin.jvm.internal.l.b(l11);
            if (l11.f71b0) {
                q3.l.h(l11);
            }
        }
        lVar.f23392c = objArr;
    }

    public final void d() {
        S.e eVar = this.f163h;
        int i7 = eVar.f8961c;
        if (i7 != 0) {
            Object[] objArr = eVar.f8959a;
            for (int i10 = 0; i10 < i7; i10++) {
                Z z8 = (Z) objArr[i10];
                if (z8.f152a.F()) {
                    boolean z10 = z8.f153b;
                    boolean z11 = z8.f154c;
                    L l10 = z8.f152a;
                    if (z10) {
                        L.Q(l10, z11, 2);
                    } else {
                        L.S(l10, z11, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(L l10) {
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (kotlin.jvm.internal.l.a(l11.H(), Boolean.TRUE) && !l11.f73c0) {
                if (((F0) ((D5.i) this.f158b.f23371b).f3256b).contains(l11)) {
                    l11.I();
                }
                e(l11);
            }
        }
    }

    public final void f(L l10, boolean z8) {
        if (!this.f159c) {
            AbstractC2256a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z8 ? l10.f61T.f97e : l10.q()) {
            AbstractC2256a.a("node not yet measured");
        }
        g(l10, z8);
    }

    public final void g(L l10, boolean z8) {
        Y y10;
        M m10;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if ((!z8 && i(l11)) || (z8 && (l11.s() == H.f30a || ((y10 = l11.f61T.f106q) != null && (m10 = y10.f138E) != null && m10.e())))) {
                boolean p10 = AbstractC0017g.p(l11);
                P p11 = l11.f61T;
                if (p10 && !z8) {
                    if (p11.f97e && ((F0) ((D5.i) this.f158b.f23371b).f3256b).contains(l11)) {
                        m(l11, true, false);
                    } else {
                        f(l11, true);
                    }
                }
                if (z8 ? p11.f97e : l11.q()) {
                    m(l11, z8, false);
                }
                if (!(z8 ? p11.f97e : l11.q())) {
                    g(l11, z8);
                }
            }
        }
        if (z8 ? l10.f61T.f97e : l10.q()) {
            m(l10, z8, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [c0.l] */
    public final boolean j(Rb.a aVar) {
        boolean z8;
        c0.l lVar;
        c0.l lVar2;
        L l10;
        q3.c cVar = this.f158b;
        L l11 = this.f157a;
        if (!l11.F()) {
            AbstractC2256a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l11.G()) {
            AbstractC2256a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f159c) {
            AbstractC2256a.a("performMeasureAndLayout called during measure layout");
        }
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        if (this.f164i != null) {
            this.f159c = true;
            this.f160d = true;
            try {
                if (cVar.p()) {
                    z8 = false;
                    while (true) {
                        boolean p10 = cVar.p();
                        D5.i iVar = (D5.i) cVar.f23371b;
                        if (!p10) {
                            break;
                        }
                        boolean isEmpty = ((F0) iVar.f3256b).isEmpty();
                        boolean z12 = !isEmpty;
                        if (isEmpty) {
                            D5.i iVar2 = (D5.i) cVar.f23372c;
                            L l12 = (L) ((F0) iVar2.f3256b).first();
                            iVar2.w(l12);
                            l10 = l12;
                        } else {
                            l10 = (L) ((F0) iVar.f3256b).first();
                            iVar.w(l10);
                        }
                        boolean m10 = m(l10, z12, true);
                        if (l10 == l11 && m10) {
                            z8 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z8 = false;
                }
            } finally {
                this.f159c = false;
                this.f160d = false;
            }
        } else {
            z8 = false;
        }
        S.e eVar = this.f162f;
        Object[] objArr = eVar.f8959a;
        int i10 = eVar.f8961c;
        int i11 = 0;
        while (i11 < i10) {
            C0018g0 c0018g0 = ((L) objArr[i11]).f60S;
            C0031u c0031u = (C0031u) c0018g0.f226c;
            boolean g = o0.g(128);
            if (g) {
                lVar = c0031u.f310Y;
            } else {
                lVar = c0031u.f310Y.f14117e;
                if (lVar == null) {
                    i11++;
                    i7 = 0;
                }
            }
            j0.B b2 = n0.f270U;
            c0.l v02 = c0031u.v0(g);
            while (v02 != null && (v02.f14116d & 128) != 0) {
                if ((v02.f14115c & 128) != 0) {
                    AbstractC0025n abstractC0025n = v02;
                    S.e eVar2 = null;
                    while (abstractC0025n != 0) {
                        if (abstractC0025n instanceof InterfaceC0034x) {
                            ((InterfaceC0034x) abstractC0025n).T((C0031u) c0018g0.f226c);
                        } else if ((abstractC0025n.f14115c & 128) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                            c0.l lVar3 = abstractC0025n.f269D;
                            lVar2 = abstractC0025n;
                            eVar2 = eVar2;
                            while (lVar3 != null) {
                                if ((lVar3.f14115c & 128) != 0) {
                                    i7++;
                                    eVar2 = eVar2;
                                    if (i7 == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new S.e(new c0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar2.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar2.b(lVar3);
                                    }
                                }
                                lVar3 = lVar3.f14118f;
                                lVar2 = lVar2;
                                eVar2 = eVar2;
                            }
                            if (i7 == 1) {
                                i7 = 0;
                                abstractC0025n = lVar2;
                                eVar2 = eVar2;
                            }
                        }
                        lVar2 = AbstractC0017g.e(eVar2);
                        i7 = 0;
                        abstractC0025n = lVar2;
                        eVar2 = eVar2;
                    }
                }
                if (v02 != lVar) {
                    v02 = v02.f14118f;
                    i7 = 0;
                }
            }
            i11++;
            i7 = 0;
        }
        eVar.g();
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r17v0, types: [A0.L, java.lang.Object] */
    public final void k(L l10, long j) {
        c0.l lVar;
        c0.l lVar2;
        if (l10.f73c0) {
            return;
        }
        L l11 = this.f157a;
        if (l10.equals(l11)) {
            AbstractC2256a.a("measureAndLayout called on root");
        }
        if (!l11.F()) {
            AbstractC2256a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l11.G()) {
            AbstractC2256a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f159c) {
            AbstractC2256a.a("performMeasureAndLayout called during measure layout");
        }
        int i7 = 0;
        if (this.f164i != null) {
            this.f159c = true;
            this.f160d = false;
            try {
                q3.c cVar = this.f158b;
                ((D5.i) cVar.f23371b).w(l10);
                ((D5.i) cVar.f23372c).w(l10);
                if ((b(l10, new V0.a(j)) || l10.f61T.f98f) && kotlin.jvm.internal.l.a(l10.H(), Boolean.TRUE)) {
                    l10.I();
                }
                e(l10);
                c(l10, new V0.a(j));
                if (l10.p() && l10.G()) {
                    l10.O();
                    ((S.e) this.f161e.f23391b).b(l10);
                    l10.f71b0 = true;
                }
                d();
                this.f159c = false;
                this.f160d = false;
            } catch (Throwable th) {
                this.f159c = false;
                this.f160d = false;
                throw th;
            }
        }
        S.e eVar = this.f162f;
        Object[] objArr = eVar.f8959a;
        int i10 = eVar.f8961c;
        int i11 = 0;
        while (i11 < i10) {
            C0018g0 c0018g0 = ((L) objArr[i11]).f60S;
            C0031u c0031u = (C0031u) c0018g0.f226c;
            boolean g = o0.g(128);
            if (g) {
                lVar = c0031u.f310Y;
            } else {
                lVar = c0031u.f310Y.f14117e;
                if (lVar == null) {
                    i11++;
                    i7 = 0;
                }
            }
            j0.B b2 = n0.f270U;
            c0.l v02 = c0031u.v0(g);
            while (v02 != null && (v02.f14116d & 128) != 0) {
                if ((v02.f14115c & 128) != 0) {
                    AbstractC0025n abstractC0025n = v02;
                    S.e eVar2 = null;
                    while (abstractC0025n != 0) {
                        if (abstractC0025n instanceof InterfaceC0034x) {
                            ((InterfaceC0034x) abstractC0025n).T((C0031u) c0018g0.f226c);
                        } else if ((abstractC0025n.f14115c & 128) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                            c0.l lVar3 = abstractC0025n.f269D;
                            int i12 = i7;
                            lVar2 = abstractC0025n;
                            eVar2 = eVar2;
                            while (lVar3 != null) {
                                if ((lVar3.f14115c & 128) != 0) {
                                    i12++;
                                    eVar2 = eVar2;
                                    if (i12 == 1) {
                                        lVar2 = lVar3;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new S.e(new c0.l[16]);
                                        }
                                        if (lVar2 != null) {
                                            eVar2.b(lVar2);
                                            lVar2 = null;
                                        }
                                        eVar2.b(lVar3);
                                    }
                                }
                                lVar3 = lVar3.f14118f;
                                lVar2 = lVar2;
                                eVar2 = eVar2;
                            }
                            if (i12 == 1) {
                                i7 = 0;
                                abstractC0025n = lVar2;
                                eVar2 = eVar2;
                            }
                        }
                        lVar2 = AbstractC0017g.e(eVar2);
                        i7 = 0;
                        abstractC0025n = lVar2;
                        eVar2 = eVar2;
                    }
                }
                if (v02 != lVar) {
                    v02 = v02.f14118f;
                    i7 = 0;
                }
            }
            i11++;
            i7 = 0;
        }
        eVar.g();
    }

    public final void l() {
        q3.c cVar = this.f158b;
        if (cVar.p()) {
            L l10 = this.f157a;
            if (!l10.F()) {
                AbstractC2256a.a("performMeasureAndLayout called with unattached root");
            }
            if (!l10.G()) {
                AbstractC2256a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f159c) {
                AbstractC2256a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f164i != null) {
                this.f159c = true;
                this.f160d = false;
                try {
                    if (!((F0) ((D5.i) cVar.f23371b).f3256b).isEmpty()) {
                        if (l10.f78v != null) {
                            o(l10, true);
                        } else {
                            n(l10);
                        }
                    }
                    o(l10, false);
                    this.f159c = false;
                    this.f160d = false;
                } catch (Throwable th) {
                    this.f159c = false;
                    this.f160d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(L l10, boolean z8, boolean z10) {
        V0.a aVar;
        AbstractC2322G placementScope;
        C0031u c0031u;
        L t5;
        Y y10;
        M m10;
        Y y11;
        M m11;
        if (l10.f73c0) {
            return false;
        }
        boolean G9 = l10.G();
        P p10 = l10.f61T;
        if (G9 || p10.f105p.f175G || h(l10) || kotlin.jvm.internal.l.a(l10.H(), Boolean.TRUE) || ((p10.f97e && (l10.s() == H.f30a || ((y11 = p10.f106q) != null && (m11 = y11.f138E) != null && m11.e()))) || p10.f105p.f179K.e() || ((y10 = p10.f106q) != null && (m10 = y10.f138E) != null && m10.e()))) {
            L l11 = this.f157a;
            if (l10 == l11) {
                aVar = this.f164i;
                kotlin.jvm.internal.l.b(aVar);
            } else {
                aVar = null;
            }
            if (z8) {
                r1 = p10.f97e ? b(l10, aVar) : false;
                if (z10 && ((r1 || p10.f98f) && kotlin.jvm.internal.l.a(l10.H(), Boolean.TRUE))) {
                    l10.I();
                }
            } else {
                boolean c10 = l10.q() ? c(l10, aVar) : false;
                if (z10 && l10.p() && (l10 == l11 || ((t5 = l10.t()) != null && t5.G() && p10.f105p.f175G))) {
                    if (l10 == l11) {
                        if (l10.f57P == H.f32c) {
                            l10.g();
                        }
                        L t10 = l10.t();
                        if (t10 == null || (c0031u = (C0031u) t10.f60S.f226c) == null || (placementScope = c0031u.f116w) == null) {
                            placementScope = ((B0.D) O.a(l10)).getPlacementScope();
                        }
                        AbstractC2322G.g(placementScope, p10.f105p, 0, 0);
                    } else {
                        l10.O();
                    }
                    ((S.e) this.f161e.f23391b).b(l10);
                    l10.f71b0 = true;
                    ((B0.D) O.a(l10)).getRectManager().d(l10);
                }
                r1 = c10;
            }
            d();
        }
        return r1;
    }

    public final void n(L l10) {
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (i(l11)) {
                if (AbstractC0017g.p(l11)) {
                    o(l11, true);
                } else {
                    n(l11);
                }
            }
        }
    }

    public final void o(L l10, boolean z8) {
        V0.a aVar;
        if (l10.f73c0) {
            return;
        }
        if (l10 == this.f157a) {
            aVar = this.f164i;
            kotlin.jvm.internal.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z8) {
            b(l10, aVar);
        } else {
            c(l10, aVar);
        }
    }

    public final boolean p(L l10, boolean z8) {
        int ordinal = l10.f61T.f96d.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal == 2 || ordinal == 3) {
            this.f163h.b(new Z(l10, false, z8));
            return false;
        }
        if (ordinal != 4) {
            throw new Db.d(1);
        }
        if (l10.q() && !z8) {
            return false;
        }
        l10.f61T.f105p.f176H = true;
        if (l10.f73c0) {
            return false;
        }
        if (!l10.G() && !h(l10)) {
            return false;
        }
        L t5 = l10.t();
        if (t5 == null || !t5.q()) {
            this.f158b.e(l10, false);
        }
        return !this.f160d;
    }

    public final void q(long j) {
        V0.a aVar = this.f164i;
        if (aVar == null ? false : V0.a.b(aVar.f9967a, j)) {
            return;
        }
        if (this.f159c) {
            AbstractC2256a.a("updateRootConstraints called while measuring");
        }
        this.f164i = new V0.a(j);
        L l10 = this.f157a;
        L l11 = l10.f78v;
        P p10 = l10.f61T;
        if (l11 != null) {
            p10.f97e = true;
        }
        p10.f105p.f176H = true;
        this.f158b.e(l10, l11 != null);
    }
}
