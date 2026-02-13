package Y6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12022a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12023b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12024c;

    public a(long j, long j10, long j11) {
        this.f12022a = j;
        this.f12023b = j10;
        this.f12024c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12022a == aVar.f12022a && this.f12023b == aVar.f12023b && this.f12024c == aVar.f12024c;
    }

    public final int hashCode() {
        long j = this.f12022a;
        long j10 = this.f12023b;
        int i7 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12024c;
        return i7 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f12022a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f12023b);
        sb2.append(", uptimeMillis=");
        return X.c.f(this.f12024c, "}", sb2);
    }
}
