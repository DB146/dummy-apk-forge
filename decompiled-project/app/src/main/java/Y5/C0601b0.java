package Y5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: Y5.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601b0 {

    /* renamed from: A, reason: collision with root package name */
    public Long f11635A;

    /* renamed from: B, reason: collision with root package name */
    public long f11636B;

    /* renamed from: C, reason: collision with root package name */
    public String f11637C;

    /* renamed from: D, reason: collision with root package name */
    public int f11638D;

    /* renamed from: E, reason: collision with root package name */
    public int f11639E;

    /* renamed from: F, reason: collision with root package name */
    public long f11640F;

    /* renamed from: G, reason: collision with root package name */
    public String f11641G;

    /* renamed from: H, reason: collision with root package name */
    public byte[] f11642H;

    /* renamed from: I, reason: collision with root package name */
    public int f11643I;

    /* renamed from: J, reason: collision with root package name */
    public long f11644J;

    /* renamed from: K, reason: collision with root package name */
    public long f11645K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public long f11646M;

    /* renamed from: N, reason: collision with root package name */
    public long f11647N;

    /* renamed from: O, reason: collision with root package name */
    public long f11648O;

    /* renamed from: P, reason: collision with root package name */
    public String f11649P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f11650Q;

    /* renamed from: R, reason: collision with root package name */
    public long f11651R;

    /* renamed from: S, reason: collision with root package name */
    public long f11652S;

    /* renamed from: a, reason: collision with root package name */
    public final C0646q0 f11653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11654b;

    /* renamed from: c, reason: collision with root package name */
    public String f11655c;

    /* renamed from: d, reason: collision with root package name */
    public String f11656d;

    /* renamed from: e, reason: collision with root package name */
    public String f11657e;

    /* renamed from: f, reason: collision with root package name */
    public String f11658f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f11659h;

    /* renamed from: i, reason: collision with root package name */
    public long f11660i;
    public String j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public String f11661l;

    /* renamed from: m, reason: collision with root package name */
    public long f11662m;

    /* renamed from: n, reason: collision with root package name */
    public long f11663n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11664o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11665p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f11666q;

    /* renamed from: r, reason: collision with root package name */
    public long f11667r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f11668s;

    /* renamed from: t, reason: collision with root package name */
    public String f11669t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11670u;

    /* renamed from: v, reason: collision with root package name */
    public long f11671v;

    /* renamed from: w, reason: collision with root package name */
    public long f11672w;

    /* renamed from: x, reason: collision with root package name */
    public int f11673x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11674y;

    /* renamed from: z, reason: collision with root package name */
    public Long f11675z;

    public C0601b0(C0646q0 c0646q0, String str) {
        com.google.android.gms.common.internal.G.g(c0646q0);
        com.google.android.gms.common.internal.G.d(str);
        this.f11653a = c0646q0;
        this.f11654b = str;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
    }

    public final void A(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11672w != j;
        this.f11672w = j;
    }

    public final void B(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11636B != j;
        this.f11636B = j;
    }

    public final String C() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11637C;
    }

    public final String D() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11654b;
    }

    public final String E() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11655c;
    }

    public final void F(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.f11655c, str);
        this.f11655c = str;
    }

    public final String G() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11656d;
    }

    public final void H(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f11650Q |= true ^ Objects.equals(this.f11656d, str);
        this.f11656d = str;
    }

    public final void I(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.f11657e, str);
        this.f11657e = str;
    }

    public final String J() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11658f;
    }

    public final void K(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.f11658f, str);
        this.f11658f = str;
    }

    public final void L(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11659h != j;
        this.f11659h = j;
    }

    public final void M(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11660i != j;
        this.f11660i = j;
    }

    public final String N() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.j;
    }

    public final void O(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.k;
    }

    public final void Q(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.k != j;
        this.k = j;
    }

    public final void R(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.f11661l, str);
        this.f11661l = str;
    }

    public final void S(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11662m != j;
        this.f11662m = j;
    }

    public final void a(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11663n != j;
        this.f11663n = j;
    }

    public final long b() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11667r;
    }

    public final void c(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11667r != j;
        this.f11667r = j;
    }

    public final void d(boolean z8) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11664o != z8;
        this.f11664o = z8;
    }

    public final void e(long j) {
        com.google.android.gms.common.internal.G.b(j >= 0);
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.g != j;
        this.g = j;
    }

    public final void f(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11651R != j;
        this.f11651R = j;
    }

    public final void g(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11652S != j;
        this.f11652S = j;
    }

    public final void h(long j) {
        C0646q0 c0646q0 = this.f11653a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        long j10 = this.g + j;
        String str = this.f11654b;
        W w10 = c0646q0.f11912f;
        if (j10 > 2147483647L) {
            C0646q0.l(w10);
            w10.f11580w.b(W.R(str), "Bundle index overflow. appId");
            j10 = (-1) + j;
        }
        long j11 = this.f11640F + 1;
        if (j11 > 2147483647L) {
            C0646q0.l(w10);
            w10.f11580w.b(W.R(str), "Delivery index overflow. appId");
            j11 = 0;
        }
        this.f11650Q = true;
        this.g = j10;
        this.f11640F = j11;
    }

    public final void i(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11644J != j;
        this.f11644J = j;
    }

    public final void j(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11645K != j;
        this.f11645K = j;
    }

    public final void k(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.L != j;
        this.L = j;
    }

    public final void l(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11646M != j;
        this.f11646M = j;
    }

    public final void m(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11648O != j;
        this.f11648O = j;
    }

    public final void n(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11647N != j;
        this.f11647N = j;
    }

    public final boolean o() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11650Q;
    }

    public final void p(int i7) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11638D != i7;
        this.f11638D = i7;
    }

    public final void q(int i7) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11639E != i7;
        this.f11639E = i7;
    }

    public final void r(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11640F != j;
        this.f11640F = j;
    }

    public final String s() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11641G;
    }

    public final int t() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11643I;
    }

    public final String u() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        String str = this.f11649P;
        v(null);
        return str;
    }

    public final void v(String str) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= !Objects.equals(this.f11649P, str);
        this.f11649P = str;
    }

    public final Boolean w() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11666q;
    }

    public final void x(List list) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        if (Objects.equals(this.f11668s, list)) {
            return;
        }
        this.f11650Q = true;
        this.f11668s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        return this.f11670u;
    }

    public final void z(long j) {
        C0640o0 c0640o0 = this.f11653a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        this.f11650Q |= this.f11671v != j;
        this.f11671v = j;
    }
}
