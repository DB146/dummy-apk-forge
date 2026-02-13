package y7;

/* loaded from: classes.dex */
public final class N extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27160c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27161d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27162e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27163f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27164h;

    /* renamed from: i, reason: collision with root package name */
    public final String f27165i;

    public N(int i7, String str, int i10, long j, long j10, boolean z8, int i11, String str2, String str3) {
        this.f27158a = i7;
        this.f27159b = str;
        this.f27160c = i10;
        this.f27161d = j;
        this.f27162e = j10;
        this.f27163f = z8;
        this.g = i11;
        this.f27164h = str2;
        this.f27165i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f27158a == ((N) w0Var).f27158a) {
            N n6 = (N) w0Var;
            if (this.f27159b.equals(n6.f27159b) && this.f27160c == n6.f27160c && this.f27161d == n6.f27161d && this.f27162e == n6.f27162e && this.f27163f == n6.f27163f && this.g == n6.g && this.f27164h.equals(n6.f27164h) && this.f27165i.equals(n6.f27165i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f27158a ^ 1000003) * 1000003) ^ this.f27159b.hashCode()) * 1000003) ^ this.f27160c) * 1000003;
        long j = this.f27161d;
        int i7 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f27162e;
        return ((((((((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f27163f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f27164h.hashCode()) * 1000003) ^ this.f27165i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f27158a);
        sb2.append(", model=");
        sb2.append(this.f27159b);
        sb2.append(", cores=");
        sb2.append(this.f27160c);
        sb2.append(", ram=");
        sb2.append(this.f27161d);
        sb2.append(", diskSpace=");
        sb2.append(this.f27162e);
        sb2.append(", simulator=");
        sb2.append(this.f27163f);
        sb2.append(", state=");
        sb2.append(this.g);
        sb2.append(", manufacturer=");
        sb2.append(this.f27164h);
        sb2.append(", modelClass=");
        return h3.o.p(sb2, this.f27165i, "}");
    }
}
