package m8;

/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20771b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20772c;

    /* renamed from: d, reason: collision with root package name */
    public final C1641b f20773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20774e;

    public C1640a(String str, String str2, String str3, C1641b c1641b, int i7) {
        this.f20770a = str;
        this.f20771b = str2;
        this.f20772c = str3;
        this.f20773d = c1641b;
        this.f20774e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1640a)) {
            return false;
        }
        C1640a c1640a = (C1640a) obj;
        String str = this.f20770a;
        if (str != null ? str.equals(c1640a.f20770a) : c1640a.f20770a == null) {
            String str2 = this.f20771b;
            if (str2 != null ? str2.equals(c1640a.f20771b) : c1640a.f20771b == null) {
                String str3 = this.f20772c;
                if (str3 != null ? str3.equals(c1640a.f20772c) : c1640a.f20772c == null) {
                    C1641b c1641b = this.f20773d;
                    if (c1641b != null ? c1641b.equals(c1640a.f20773d) : c1640a.f20773d == null) {
                        int i7 = this.f20774e;
                        if (i7 == 0) {
                            if (c1640a.f20774e == 0) {
                                return true;
                            }
                        } else if (P.c.a(i7, c1640a.f20774e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20770a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20771b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20772c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C1641b c1641b = this.f20773d;
        int hashCode4 = (hashCode3 ^ (c1641b == null ? 0 : c1641b.hashCode())) * 1000003;
        int i7 = this.f20774e;
        return (i7 != 0 ? P.c.b(i7) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f20770a);
        sb2.append(", fid=");
        sb2.append(this.f20771b);
        sb2.append(", refreshToken=");
        sb2.append(this.f20772c);
        sb2.append(", authToken=");
        sb2.append(this.f20773d);
        sb2.append(", responseCode=");
        int i7 = this.f20774e;
        sb2.append(i7 != 1 ? i7 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
