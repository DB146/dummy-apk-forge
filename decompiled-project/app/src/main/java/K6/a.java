package K6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6184a;

    /* renamed from: b, reason: collision with root package name */
    public int f6185b;

    /* renamed from: c, reason: collision with root package name */
    public String f6186c;

    /* renamed from: d, reason: collision with root package name */
    public String f6187d;

    /* renamed from: e, reason: collision with root package name */
    public String f6188e;

    /* renamed from: f, reason: collision with root package name */
    public byte f6189f;

    public final b a() {
        String str;
        String str2;
        String str3;
        if (this.f6189f == 3 && (str = this.f6186c) != null && (str2 = this.f6187d) != null && (str3 = this.f6188e) != null) {
            return new b(this.f6184a, this.f6185b, str, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f6189f & 1) == 0) {
            sb2.append(" width");
        }
        if ((this.f6189f & 2) == 0) {
            sb2.append(" height");
        }
        if (this.f6186c == null) {
            sb2.append(" altText");
        }
        if (this.f6187d == null) {
            sb2.append(" creativeType");
        }
        if (this.f6188e == null) {
            sb2.append(" staticResourceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
