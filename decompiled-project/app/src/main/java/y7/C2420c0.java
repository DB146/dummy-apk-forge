package y7;

/* renamed from: y7.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2420c0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f27246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27247b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27248c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27249d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27250e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27251f;

    public C2420c0(Double d10, int i7, boolean z8, int i10, long j, long j10) {
        this.f27246a = d10;
        this.f27247b = i7;
        this.f27248c = z8;
        this.f27249d = i10;
        this.f27250e = j;
        this.f27251f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        Double d10 = this.f27246a;
        if (d10 != null ? d10.equals(((C2420c0) f02).f27246a) : ((C2420c0) f02).f27246a == null) {
            if (this.f27247b == ((C2420c0) f02).f27247b) {
                C2420c0 c2420c0 = (C2420c0) f02;
                if (this.f27248c == c2420c0.f27248c && this.f27249d == c2420c0.f27249d && this.f27250e == c2420c0.f27250e && this.f27251f == c2420c0.f27251f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f27246a;
        int hashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f27247b) * 1000003) ^ (this.f27248c ? 1231 : 1237)) * 1000003) ^ this.f27249d) * 1000003;
        long j = this.f27250e;
        long j10 = this.f27251f;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f27246a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f27247b);
        sb2.append(", proximityOn=");
        sb2.append(this.f27248c);
        sb2.append(", orientation=");
        sb2.append(this.f27249d);
        sb2.append(", ramUsed=");
        sb2.append(this.f27250e);
        sb2.append(", diskUsed=");
        return X.c.f(this.f27251f, "}", sb2);
    }
}
