package k8;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19028a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19029b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19030c;

    public C1433a(long j, long j10, String str) {
        this.f19028a = str;
        this.f19029b = j;
        this.f19030c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1433a)) {
            return false;
        }
        C1433a c1433a = (C1433a) obj;
        return this.f19028a.equals(c1433a.f19028a) && this.f19029b == c1433a.f19029b && this.f19030c == c1433a.f19030c;
    }

    public final int hashCode() {
        int hashCode = (this.f19028a.hashCode() ^ 1000003) * 1000003;
        long j = this.f19029b;
        long j10 = this.f19030c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f19028a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f19029b);
        sb2.append(", tokenCreationTimestamp=");
        return X.c.f(this.f19030c, "}", sb2);
    }
}
