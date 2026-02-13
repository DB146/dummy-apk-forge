package c4;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14331a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14332b;

    public C0899a(int i7, long j) {
        if (i7 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f14331a = i7;
        this.f14332b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0899a)) {
            return false;
        }
        C0899a c0899a = (C0899a) obj;
        return P.c.a(this.f14331a, c0899a.f14331a) && this.f14332b == c0899a.f14332b;
    }

    public final int hashCode() {
        int b2 = (P.c.b(this.f14331a) ^ 1000003) * 1000003;
        long j = this.f14332b;
        return b2 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i7 = this.f14331a;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return X.c.f(this.f14332b, "}", sb2);
    }
}
