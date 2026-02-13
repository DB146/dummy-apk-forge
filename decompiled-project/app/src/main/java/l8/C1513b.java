package l8;

import h3.o;

/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19601b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19602c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19603d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19604e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19605f;
    public final String g;

    public C1513b(String str, int i7, String str2, String str3, long j, long j10, String str4) {
        this.f19600a = str;
        this.f19601b = i7;
        this.f19602c = str2;
        this.f19603d = str3;
        this.f19604e = j;
        this.f19605f = j10;
        this.g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l8.a] */
    public final C1512a a() {
        ?? obj = new Object();
        obj.f19594a = this.f19600a;
        obj.f19595b = this.f19601b;
        obj.f19596c = this.f19602c;
        obj.f19597d = this.f19603d;
        obj.f19598e = Long.valueOf(this.f19604e);
        obj.f19599f = Long.valueOf(this.f19605f);
        obj.g = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1513b)) {
            return false;
        }
        C1513b c1513b = (C1513b) obj;
        String str = this.f19600a;
        if (str != null ? str.equals(c1513b.f19600a) : c1513b.f19600a == null) {
            if (P.c.a(this.f19601b, c1513b.f19601b)) {
                String str2 = c1513b.f19602c;
                String str3 = this.f19602c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c1513b.f19603d;
                    String str5 = this.f19603d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f19604e == c1513b.f19604e && this.f19605f == c1513b.f19605f) {
                            String str6 = c1513b.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19600a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ P.c.b(this.f19601b)) * 1000003;
        String str2 = this.f19602c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19603d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f19604e;
        int i7 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f19605f;
        int i10 = (i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f19600a);
        sb2.append(", registrationStatus=");
        int i7 = this.f19601b;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f19602c);
        sb2.append(", refreshToken=");
        sb2.append(this.f19603d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f19604e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f19605f);
        sb2.append(", fisError=");
        return o.p(sb2, this.g, "}");
    }
}
