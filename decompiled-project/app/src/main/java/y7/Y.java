package y7;

/* loaded from: classes.dex */
public final class Y extends A0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27212b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27213c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27214d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27215e;

    public Y(long j, String str, String str2, long j10, int i7) {
        this.f27211a = j;
        this.f27212b = str;
        this.f27213c = str2;
        this.f27214d = j10;
        this.f27215e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (this.f27211a == ((Y) a02).f27211a) {
            Y y10 = (Y) a02;
            if (this.f27212b.equals(y10.f27212b)) {
                String str = y10.f27213c;
                String str2 = this.f27213c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f27214d == y10.f27214d && this.f27215e == y10.f27215e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27211a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f27212b.hashCode()) * 1000003;
        String str = this.f27213c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f27214d;
        return ((hashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f27215e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f27211a);
        sb2.append(", symbol=");
        sb2.append(this.f27212b);
        sb2.append(", file=");
        sb2.append(this.f27213c);
        sb2.append(", offset=");
        sb2.append(this.f27214d);
        sb2.append(", importance=");
        return A3.c.k(sb2, this.f27215e, "}");
    }
}
