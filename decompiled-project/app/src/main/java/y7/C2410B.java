package y7;

/* renamed from: y7.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410B extends O0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f27091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27092c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27093d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27094e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27095f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27096h;

    /* renamed from: i, reason: collision with root package name */
    public final String f27097i;
    public final String j;
    public final J k;

    /* renamed from: l, reason: collision with root package name */
    public final G f27098l;

    /* renamed from: m, reason: collision with root package name */
    public final C2412D f27099m;

    public C2410B(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, J j, G g, C2412D c2412d) {
        this.f27091b = str;
        this.f27092c = str2;
        this.f27093d = i7;
        this.f27094e = str3;
        this.f27095f = str4;
        this.g = str5;
        this.f27096h = str6;
        this.f27097i = str7;
        this.j = str8;
        this.k = j;
        this.f27098l = g;
        this.f27099m = c2412d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7.A, java.lang.Object] */
    public final C2409A a() {
        ?? obj = new Object();
        obj.f27081a = this.f27091b;
        obj.f27082b = this.f27092c;
        obj.f27083c = this.f27093d;
        obj.f27084d = this.f27094e;
        obj.f27085e = this.f27095f;
        obj.f27086f = this.g;
        obj.g = this.f27096h;
        obj.f27087h = this.f27097i;
        obj.f27088i = this.j;
        obj.j = this.k;
        obj.k = this.f27098l;
        obj.f27089l = this.f27099m;
        obj.f27090m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        C2410B c2410b = (C2410B) ((O0) obj);
        if (this.f27091b.equals(c2410b.f27091b)) {
            if (this.f27092c.equals(c2410b.f27092c) && this.f27093d == c2410b.f27093d && this.f27094e.equals(c2410b.f27094e)) {
                String str = c2410b.f27095f;
                String str2 = this.f27095f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c2410b.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c2410b.f27096h;
                        String str6 = this.f27096h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f27097i.equals(c2410b.f27097i) && this.j.equals(c2410b.j)) {
                                J j = c2410b.k;
                                J j10 = this.k;
                                if (j10 != null ? j10.equals(j) : j == null) {
                                    G g = c2410b.f27098l;
                                    G g2 = this.f27098l;
                                    if (g2 != null ? g2.equals(g) : g == null) {
                                        C2412D c2412d = c2410b.f27099m;
                                        C2412D c2412d2 = this.f27099m;
                                        if (c2412d2 == null) {
                                            if (c2412d == null) {
                                                return true;
                                            }
                                        } else if (c2412d2.equals(c2412d)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f27091b.hashCode() ^ 1000003) * 1000003) ^ this.f27092c.hashCode()) * 1000003) ^ this.f27093d) * 1000003) ^ this.f27094e.hashCode()) * 1000003;
        String str = this.f27095f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27096h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f27097i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        J j = this.k;
        int hashCode5 = (hashCode4 ^ (j == null ? 0 : j.hashCode())) * 1000003;
        G g = this.f27098l;
        int hashCode6 = (hashCode5 ^ (g == null ? 0 : g.hashCode())) * 1000003;
        C2412D c2412d = this.f27099m;
        return hashCode6 ^ (c2412d != null ? c2412d.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f27091b + ", gmpAppId=" + this.f27092c + ", platform=" + this.f27093d + ", installationUuid=" + this.f27094e + ", firebaseInstallationId=" + this.f27095f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.f27096h + ", buildVersion=" + this.f27097i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.f27098l + ", appExitInfo=" + this.f27099m + "}";
    }
}
