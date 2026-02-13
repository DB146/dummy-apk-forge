package y7;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public long f27166a;

    /* renamed from: b, reason: collision with root package name */
    public String f27167b;

    /* renamed from: c, reason: collision with root package name */
    public Q f27168c;

    /* renamed from: d, reason: collision with root package name */
    public C2420c0 f27169d;

    /* renamed from: e, reason: collision with root package name */
    public C2422d0 f27170e;

    /* renamed from: f, reason: collision with root package name */
    public C2430h0 f27171f;
    public byte g;

    public final P a() {
        String str;
        Q q10;
        C2420c0 c2420c0;
        if (this.g == 1 && (str = this.f27167b) != null && (q10 = this.f27168c) != null && (c2420c0 = this.f27169d) != null) {
            return new P(this.f27166a, str, q10, c2420c0, this.f27170e, this.f27171f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f27167b == null) {
            sb2.append(" type");
        }
        if (this.f27168c == null) {
            sb2.append(" app");
        }
        if (this.f27169d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
