package m8;

import A4.s;

/* renamed from: m8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20775a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20777c;

    public C1641b(String str, long j, int i7) {
        this.f20775a = str;
        this.f20776b = j;
        this.f20777c = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.s, java.lang.Object] */
    public static s a() {
        ?? obj = new Object();
        obj.f472c = 0L;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1641b)) {
            return false;
        }
        C1641b c1641b = (C1641b) obj;
        String str = this.f20775a;
        if (str != null ? str.equals(c1641b.f20775a) : c1641b.f20775a == null) {
            if (this.f20776b == c1641b.f20776b) {
                int i7 = c1641b.f20777c;
                int i10 = this.f20777c;
                if (i10 == 0) {
                    if (i7 == 0) {
                        return true;
                    }
                } else if (P.c.a(i10, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20775a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f20776b;
        int i7 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i10 = this.f20777c;
        return (i10 != 0 ? P.c.b(i10) : 0) ^ i7;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f20775a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f20776b);
        sb2.append(", responseCode=");
        int i7 = this.f20777c;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
