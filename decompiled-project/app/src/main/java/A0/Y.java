package A0;

import x0.AbstractC2256a;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class Y extends AbstractC2323H implements y0.z, InterfaceC0007b, InterfaceC0014e0 {

    /* renamed from: A, reason: collision with root package name */
    public V0.a f134A;

    /* renamed from: C, reason: collision with root package name */
    public Rb.c f136C;

    /* renamed from: H, reason: collision with root package name */
    public boolean f141H;

    /* renamed from: J, reason: collision with root package name */
    public Object f143J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f144K;

    /* renamed from: f, reason: collision with root package name */
    public final P f145f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f146u;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f151z;

    /* renamed from: v, reason: collision with root package name */
    public int f147v = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: w, reason: collision with root package name */
    public int f148w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: x, reason: collision with root package name */
    public H f149x = H.f32c;

    /* renamed from: B, reason: collision with root package name */
    public long f135B = 0;

    /* renamed from: D, reason: collision with root package name */
    public V f137D = V.f127c;

    /* renamed from: E, reason: collision with root package name */
    public final M f138E = new M(this, 1);

    /* renamed from: F, reason: collision with root package name */
    public final S.e f139F = new S.e(new Y[16]);

    /* renamed from: G, reason: collision with root package name */
    public boolean f140G = true;

    /* renamed from: I, reason: collision with root package name */
    public boolean f142I = true;

    public Y(P p10) {
        this.f145f = p10;
        this.f143J = p10.f105p.f173E;
    }

    @Override // A0.InterfaceC0007b
    public final void C(C0005a c0005a) {
        S.e x2 = this.f145f.f93a.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            Y y10 = ((L) objArr[i10]).f61T.f106q;
            kotlin.jvm.internal.l.b(y10);
            c0005a.invoke(y10);
        }
    }

    @Override // A0.InterfaceC0007b
    public final void E() {
        L.Q(this.f145f.f93a, false, 7);
    }

    @Override // y0.AbstractC2323H
    public final void M(long j, float f4, Rb.c cVar) {
        V(j, cVar);
    }

    public final void R(boolean z8) {
        P p10 = this.f145f;
        if (z8 && p10.f95c) {
            return;
        }
        if (z8 || p10.f95c) {
            this.f137D = V.f127c;
            S.e x2 = p10.f93a.x();
            Object[] objArr = x2.f8959a;
            int i7 = x2.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                Y y10 = ((L) objArr[i10]).f61T.f106q;
                kotlin.jvm.internal.l.b(y10);
                y10.R(true);
            }
        }
    }

    public final void S() {
        V v10 = this.f137D;
        P p10 = this.f145f;
        if (p10.f95c) {
            this.f137D = V.f126b;
        } else {
            this.f137D = V.f125a;
        }
        V v11 = V.f125a;
        L l10 = p10.f93a;
        if (v10 != v11 && p10.f97e) {
            L.Q(l10, true, 6);
        }
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            Y y10 = l11.f61T.f106q;
            if (y10 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (y10.f148w != Integer.MAX_VALUE) {
                y10.S();
                L.T(l11);
            }
        }
    }

    public final void T() {
        P p10 = this.f145f;
        if (p10.f104o > 0) {
            S.e x2 = p10.f93a.x();
            Object[] objArr = x2.f8959a;
            int i7 = x2.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                L l10 = (L) objArr[i10];
                P p11 = l10.f61T;
                if ((p11.f102m || p11.f103n) && !p11.f98f) {
                    l10.P(false);
                }
                Y y10 = p11.f106q;
                if (y10 != null) {
                    y10.T();
                }
            }
        }
    }

    public final void U() {
        P p10;
        F f4;
        this.f144K = true;
        P p11 = this.f145f;
        L t5 = p11.f93a.t();
        V v10 = this.f137D;
        if ((v10 != V.f125a && !p11.f95c) || (v10 != V.f126b && p11.f95c)) {
            S();
            if (this.f146u && t5 != null) {
                t5.P(false);
            }
        }
        if (t5 == null) {
            this.f148w = 0;
        } else if (!this.f146u && ((f4 = (p10 = t5.f61T).f96d) == F.f22c || f4 == F.f23d)) {
            if (this.f148w != Integer.MAX_VALUE) {
                AbstractC2256a.b("Place was called on a node which was placed already");
            }
            int i7 = p10.f99h;
            this.f148w = i7;
            p10.f99h = i7 + 1;
        }
        l();
    }

    public final void V(long j, Rb.c cVar) {
        P p10 = this.f145f;
        L t5 = p10.f93a.t();
        F f4 = t5 != null ? t5.f61T.f96d : null;
        F f10 = F.f23d;
        if (f4 == f10) {
            p10.f95c = false;
        }
        L l10 = p10.f93a;
        if (l10.f73c0) {
            AbstractC2256a.a("place is called on a deactivated node");
        }
        p10.f96d = f10;
        this.f150y = true;
        this.f144K = false;
        if (!V0.i.a(j, this.f135B)) {
            if (p10.f103n || p10.f102m) {
                p10.f98f = true;
            }
            T();
        }
        t0 a9 = O.a(l10);
        if (p10.f98f || !t()) {
            p10.f(false);
            this.f138E.f87e = false;
            v0 snapshotObserver = ((B0.D) a9).getSnapshotObserver();
            X x2 = new X(this, a9, j);
            snapshotObserver.getClass();
            if (l10.f78v != null) {
                snapshotObserver.a(l10, snapshotObserver.g, x2);
            } else {
                snapshotObserver.a(l10, snapshotObserver.f319f, x2);
            }
        } else {
            U r02 = p10.a().r0();
            kotlin.jvm.internal.l.b(r02);
            r02.j0(V0.i.c(j, r02.f26558e));
            U();
        }
        this.f135B = j;
        this.f136C = cVar;
        p10.f96d = F.f24e;
    }

    public final boolean Z(long j) {
        long j10;
        P p10 = this.f145f;
        if (p10.f93a.f73c0) {
            AbstractC2256a.a("measure is called on a deactivated node");
        }
        L l10 = p10.f93a;
        L t5 = l10.t();
        l10.f59R = l10.f59R || (t5 != null && t5.f59R);
        if (!l10.f61T.f97e) {
            V0.a aVar = this.f134A;
            if (aVar == null ? false : V0.a.b(aVar.f9967a, j)) {
                B0.D d10 = l10.f44B;
                if (d10 != null) {
                    d10.k(l10, true);
                }
                l10.U();
                return false;
            }
        }
        this.f134A = new V0.a(j);
        O(j);
        this.f138E.f86d = false;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            Y y10 = ((L) objArr[i10]).f61T.f106q;
            kotlin.jvm.internal.l.b(y10);
            y10.f138E.getClass();
        }
        if (this.f151z) {
            j10 = this.f26556c;
        } else {
            long j11 = Integer.MIN_VALUE;
            j10 = (j11 & 4294967295L) | (j11 << 32);
        }
        this.f151z = true;
        U r02 = p10.a().r0();
        if (!(r02 != null)) {
            AbstractC2256a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        Y y11 = p10.f106q;
        if (y11 != null) {
            F f4 = F.f21b;
            P p11 = y11.f145f;
            p11.f96d = f4;
            p11.f97e = false;
            L l11 = p11.f93a;
            v0 snapshotObserver = ((B0.D) O.a(l11)).getSnapshotObserver();
            W w10 = new W(y11, j);
            snapshotObserver.getClass();
            if (l11.f78v != null) {
                snapshotObserver.a(l11, snapshotObserver.f315b, w10);
            } else {
                snapshotObserver.a(l11, snapshotObserver.f316c, w10);
            }
            p11.f98f = true;
            p11.g = true;
            boolean p12 = AbstractC0017g.p(l11);
            C0010c0 c0010c0 = p11.f105p;
            if (p12) {
                c0010c0.f177I = true;
                c0010c0.f178J = true;
            } else {
                c0010c0.f176H = true;
            }
            p11.f96d = F.f24e;
        }
        N((r02.f26555b & 4294967295L) | (r02.f26554a << 32));
        return (((int) (j10 >> 32)) == r02.f26554a && ((int) (j10 & 4294967295L)) == r02.f26555b) ? false : true;
    }

    @Override // A0.InterfaceC0007b
    public final M a() {
        return this.f138E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f61T.f96d : null) == A0.F.f23d) goto L13;
     */
    @Override // y0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2323H b(long j) {
        H h10;
        P p10 = this.f145f;
        L t5 = p10.f93a.t();
        if ((t5 != null ? t5.f61T.f96d : null) != F.f21b) {
            L t10 = p10.f93a.t();
        }
        p10.f94b = false;
        L l10 = p10.f93a;
        L t11 = l10.t();
        if (t11 != null) {
            if (this.f149x != H.f32c && !l10.f59R) {
                AbstractC2256a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            P p11 = t11.f61T;
            int ordinal = p11.f96d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                h10 = H.f30a;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + p11.f96d);
                }
                h10 = H.f31b;
            }
            this.f149x = h10;
        } else {
            this.f149x = H.f32c;
        }
        L l11 = p10.f93a;
        if (l11.f57P == H.f32c) {
            l11.c();
        }
        Z(j);
        return this;
    }

    @Override // y0.AbstractC2323H, y0.z
    public final Object d() {
        return this.f143J;
    }

    @Override // A0.InterfaceC0014e0
    public final void h(boolean z8) {
        U r02;
        P p10 = this.f145f;
        U r03 = p10.a().r0();
        if (Boolean.valueOf(z8).equals(r03 != null ? Boolean.valueOf(r03.f113f) : null) || (r02 = p10.a().r0()) == null) {
            return;
        }
        r02.f113f = z8;
    }

    @Override // A0.InterfaceC0007b
    public final C0031u i() {
        return (C0031u) this.f145f.f93a.f60S.f226c;
    }

    @Override // A0.InterfaceC0007b
    public final InterfaceC0007b j() {
        P p10;
        L t5 = this.f145f.f93a.t();
        if (t5 == null || (p10 = t5.f61T) == null) {
            return null;
        }
        return p10.f106q;
    }

    @Override // A0.InterfaceC0007b
    public final void l() {
        this.f141H = true;
        M m10 = this.f138E;
        m10.h();
        P p10 = this.f145f;
        boolean z8 = p10.f98f;
        L l10 = p10.f93a;
        if (z8) {
            S.e x2 = l10.x();
            Object[] objArr = x2.f8959a;
            int i7 = x2.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                L l11 = (L) objArr[i10];
                if (l11.f61T.f97e && l11.s() == H.f30a) {
                    P p11 = l11.f61T;
                    Y y10 = p11.f106q;
                    kotlin.jvm.internal.l.b(y10);
                    Y y11 = p11.f106q;
                    V0.a aVar = y11 != null ? y11.f134A : null;
                    kotlin.jvm.internal.l.b(aVar);
                    if (y10.Z(aVar.f9967a)) {
                        L.Q(l10, false, 7);
                    }
                }
            }
        }
        C0030t c0030t = i().f311Z;
        kotlin.jvm.internal.l.b(c0030t);
        if (p10.g || (!c0030t.f115v && p10.f98f)) {
            p10.f98f = false;
            F f4 = p10.f96d;
            p10.f96d = F.f23d;
            t0 a9 = O.a(l10);
            p10.g(false);
            v0 snapshotObserver = ((B0.D) a9).getSnapshotObserver();
            K k = new K(2, this, c0030t);
            snapshotObserver.getClass();
            if (l10.f78v != null) {
                snapshotObserver.a(l10, snapshotObserver.f320h, k);
            } else {
                snapshotObserver.a(l10, snapshotObserver.f318e, k);
            }
            p10.f96d = f4;
            if (p10.f102m && c0030t.f115v) {
                requestLayout();
            }
            p10.g = false;
        }
        if (m10.f84b && m10.e()) {
            m10.g();
        }
        this.f141H = false;
    }

    @Override // A0.InterfaceC0007b
    public final void requestLayout() {
        this.f145f.f93a.P(false);
    }

    @Override // A0.InterfaceC0007b
    public final boolean t() {
        return this.f137D != V.f127c;
    }
}
