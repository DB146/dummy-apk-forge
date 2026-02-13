package y7;

/* renamed from: y7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2409A {

    /* renamed from: a, reason: collision with root package name */
    public String f27081a;

    /* renamed from: b, reason: collision with root package name */
    public String f27082b;

    /* renamed from: c, reason: collision with root package name */
    public int f27083c;

    /* renamed from: d, reason: collision with root package name */
    public String f27084d;

    /* renamed from: e, reason: collision with root package name */
    public String f27085e;

    /* renamed from: f, reason: collision with root package name */
    public String f27086f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f27087h;

    /* renamed from: i, reason: collision with root package name */
    public String f27088i;
    public J j;
    public G k;

    /* renamed from: l, reason: collision with root package name */
    public C2412D f27089l;

    /* renamed from: m, reason: collision with root package name */
    public byte f27090m;

    public final C2410B a() {
        if (this.f27090m == 1 && this.f27081a != null && this.f27082b != null && this.f27084d != null && this.f27087h != null && this.f27088i != null) {
            return new C2410B(this.f27081a, this.f27082b, this.f27083c, this.f27084d, this.f27085e, this.f27086f, this.g, this.f27087h, this.f27088i, this.j, this.k, this.f27089l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27081a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f27082b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f27090m) == 0) {
            sb2.append(" platform");
        }
        if (this.f27084d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f27087h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f27088i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
