package N;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final K0.F f6974a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.F f6975b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.F f6976c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.F f6977d;

    /* renamed from: e, reason: collision with root package name */
    public final K0.F f6978e;

    /* renamed from: f, reason: collision with root package name */
    public final K0.F f6979f;
    public final K0.F g;

    /* renamed from: h, reason: collision with root package name */
    public final K0.F f6980h;

    /* renamed from: i, reason: collision with root package name */
    public final K0.F f6981i;
    public final K0.F j;
    public final K0.F k;

    /* renamed from: l, reason: collision with root package name */
    public final K0.F f6982l;

    /* renamed from: m, reason: collision with root package name */
    public final K0.F f6983m;

    /* renamed from: n, reason: collision with root package name */
    public final K0.F f6984n;

    /* renamed from: o, reason: collision with root package name */
    public final K0.F f6985o;

    public H(K0.F f4, int i7) {
        K0.F f10 = P.i.f7749d;
        K0.F f11 = P.i.f7750e;
        K0.F f12 = P.i.f7751f;
        K0.F f13 = P.i.g;
        K0.F f14 = P.i.f7752h;
        K0.F f15 = P.i.f7753i;
        K0.F f16 = P.i.f7755m;
        K0.F f17 = P.i.f7756n;
        K0.F f18 = P.i.f7757o;
        f4 = (i7 & 512) != 0 ? P.i.f7746a : f4;
        K0.F f19 = P.i.f7747b;
        K0.F f20 = P.i.f7748c;
        K0.F f21 = P.i.j;
        K0.F f22 = P.i.k;
        K0.F f23 = P.i.f7754l;
        this.f6974a = f10;
        this.f6975b = f11;
        this.f6976c = f12;
        this.f6977d = f13;
        this.f6978e = f14;
        this.f6979f = f15;
        this.g = f16;
        this.f6980h = f17;
        this.f6981i = f18;
        this.j = f4;
        this.k = f19;
        this.f6982l = f20;
        this.f6983m = f21;
        this.f6984n = f22;
        this.f6985o = f23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return kotlin.jvm.internal.l.a(this.f6974a, h10.f6974a) && kotlin.jvm.internal.l.a(this.f6975b, h10.f6975b) && kotlin.jvm.internal.l.a(this.f6976c, h10.f6976c) && kotlin.jvm.internal.l.a(this.f6977d, h10.f6977d) && kotlin.jvm.internal.l.a(this.f6978e, h10.f6978e) && kotlin.jvm.internal.l.a(this.f6979f, h10.f6979f) && kotlin.jvm.internal.l.a(this.g, h10.g) && kotlin.jvm.internal.l.a(this.f6980h, h10.f6980h) && kotlin.jvm.internal.l.a(this.f6981i, h10.f6981i) && kotlin.jvm.internal.l.a(this.j, h10.j) && kotlin.jvm.internal.l.a(this.k, h10.k) && kotlin.jvm.internal.l.a(this.f6982l, h10.f6982l) && kotlin.jvm.internal.l.a(this.f6983m, h10.f6983m) && kotlin.jvm.internal.l.a(this.f6984n, h10.f6984n) && kotlin.jvm.internal.l.a(this.f6985o, h10.f6985o);
    }

    public final int hashCode() {
        return this.f6985o.hashCode() + ((this.f6984n.hashCode() + ((this.f6983m.hashCode() + ((this.f6982l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.f6981i.hashCode() + ((this.f6980h.hashCode() + ((this.g.hashCode() + ((this.f6979f.hashCode() + ((this.f6978e.hashCode() + ((this.f6977d.hashCode() + ((this.f6976c.hashCode() + ((this.f6975b.hashCode() + (this.f6974a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f6974a + ", displayMedium=" + this.f6975b + ",displaySmall=" + this.f6976c + ", headlineLarge=" + this.f6977d + ", headlineMedium=" + this.f6978e + ", headlineSmall=" + this.f6979f + ", titleLarge=" + this.g + ", titleMedium=" + this.f6980h + ", titleSmall=" + this.f6981i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.f6982l + ", labelLarge=" + this.f6983m + ", labelMedium=" + this.f6984n + ", labelSmall=" + this.f6985o + ')';
    }
}
