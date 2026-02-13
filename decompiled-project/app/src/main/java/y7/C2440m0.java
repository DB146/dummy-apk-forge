package y7;

/* renamed from: y7.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27340c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27342e;

    /* renamed from: f, reason: collision with root package name */
    public final ha.g f27343f;

    public C2440m0(String str, String str2, String str3, String str4, int i7, ha.g gVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f27338a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f27339b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f27340c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f27341d = str4;
        this.f27342e = i7;
        this.f27343f = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2440m0)) {
            return false;
        }
        C2440m0 c2440m0 = (C2440m0) obj;
        return this.f27338a.equals(c2440m0.f27338a) && this.f27339b.equals(c2440m0.f27339b) && this.f27340c.equals(c2440m0.f27340c) && this.f27341d.equals(c2440m0.f27341d) && this.f27342e == c2440m0.f27342e && this.f27343f.equals(c2440m0.f27343f);
    }

    public final int hashCode() {
        return ((((((((((this.f27338a.hashCode() ^ 1000003) * 1000003) ^ this.f27339b.hashCode()) * 1000003) ^ this.f27340c.hashCode()) * 1000003) ^ this.f27341d.hashCode()) * 1000003) ^ this.f27342e) * 1000003) ^ this.f27343f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f27338a + ", versionCode=" + this.f27339b + ", versionName=" + this.f27340c + ", installUuid=" + this.f27341d + ", deliveryMechanism=" + this.f27342e + ", developmentPlatformProvider=" + this.f27343f + "}";
    }
}
