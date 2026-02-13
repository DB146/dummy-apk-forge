package A0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final L f93a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f94b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f99h;

    /* renamed from: i, reason: collision with root package name */
    public int f100i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f101l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f102m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f103n;

    /* renamed from: o, reason: collision with root package name */
    public int f104o;

    /* renamed from: q, reason: collision with root package name */
    public Y f106q;

    /* renamed from: d, reason: collision with root package name */
    public F f96d = F.f24e;

    /* renamed from: p, reason: collision with root package name */
    public final C0010c0 f105p = new C0010c0(this);

    public P(L l10) {
        this.f93a = l10;
    }

    public final n0 a() {
        return (n0) this.f93a.f60S.f227d;
    }

    public final void b(int i7) {
        int i10 = this.f101l;
        this.f101l = i7;
        if ((i10 == 0) != (i7 == 0)) {
            L t5 = this.f93a.t();
            P p10 = t5 != null ? t5.f61T : null;
            if (p10 != null) {
                if (i7 == 0) {
                    p10.b(p10.f101l - 1);
                } else {
                    p10.b(p10.f101l + 1);
                }
            }
        }
    }

    public final void c(int i7) {
        int i10 = this.f104o;
        this.f104o = i7;
        if ((i10 == 0) != (i7 == 0)) {
            L t5 = this.f93a.t();
            P p10 = t5 != null ? t5.f61T : null;
            if (p10 != null) {
                if (i7 == 0) {
                    p10.c(p10.f104o - 1);
                } else {
                    p10.c(p10.f104o + 1);
                }
            }
        }
    }

    public final void d(boolean z8) {
        if (this.k != z8) {
            this.k = z8;
            if (z8 && !this.j) {
                b(this.f101l + 1);
            } else {
                if (z8 || this.j) {
                    return;
                }
                b(this.f101l - 1);
            }
        }
    }

    public final void e(boolean z8) {
        if (this.j != z8) {
            this.j = z8;
            if (z8 && !this.k) {
                b(this.f101l + 1);
            } else {
                if (z8 || this.k) {
                    return;
                }
                b(this.f101l - 1);
            }
        }
    }

    public final void f(boolean z8) {
        if (this.f103n != z8) {
            this.f103n = z8;
            if (z8 && !this.f102m) {
                c(this.f104o + 1);
            } else {
                if (z8 || this.f102m) {
                    return;
                }
                c(this.f104o - 1);
            }
        }
    }

    public final void g(boolean z8) {
        if (this.f102m != z8) {
            this.f102m = z8;
            if (z8 && !this.f103n) {
                c(this.f104o + 1);
            } else {
                if (z8 || this.f103n) {
                    return;
                }
                c(this.f104o - 1);
            }
        }
    }

    public final void h() {
        C0010c0 c0010c0 = this.f105p;
        Object obj = c0010c0.f173E;
        L l10 = this.f93a;
        P p10 = c0010c0.f192f;
        if ((obj != null || p10.a().d() != null) && c0010c0.f172D) {
            c0010c0.f172D = false;
            c0010c0.f173E = p10.a().d();
            L t5 = l10.t();
            if (t5 != null) {
                L.S(t5, false, 7);
            }
        }
        Y y10 = this.f106q;
        if (y10 != null) {
            Object obj2 = y10.f143J;
            P p11 = y10.f145f;
            if (obj2 == null) {
                U r02 = p11.a().r0();
                kotlin.jvm.internal.l.b(r02);
                if (r02.f124z.d() == null) {
                    return;
                }
            }
            if (y10.f142I) {
                y10.f142I = false;
                U r03 = p11.a().r0();
                kotlin.jvm.internal.l.b(r03);
                y10.f143J = r03.f124z.d();
                if (AbstractC0017g.p(l10)) {
                    L t10 = l10.t();
                    if (t10 != null) {
                        L.S(t10, false, 7);
                        return;
                    }
                    return;
                }
                L t11 = l10.t();
                if (t11 != null) {
                    L.Q(t11, false, 7);
                }
            }
        }
    }
}
