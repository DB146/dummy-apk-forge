package y7;

/* renamed from: y7.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2442n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27352c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27353d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27354e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27355f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27356h;

    /* renamed from: i, reason: collision with root package name */
    public final String f27357i;

    public C2442n0(int i7, String str, int i10, long j, long j10, boolean z8, int i11, String str2, String str3) {
        this.f27350a = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f27351b = str;
        this.f27352c = i10;
        this.f27353d = j;
        this.f27354e = j10;
        this.f27355f = z8;
        this.g = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f27356h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f27357i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2442n0)) {
            return false;
        }
        C2442n0 c2442n0 = (C2442n0) obj;
        return this.f27350a == c2442n0.f27350a && this.f27351b.equals(c2442n0.f27351b) && this.f27352c == c2442n0.f27352c && this.f27353d == c2442n0.f27353d && this.f27354e == c2442n0.f27354e && this.f27355f == c2442n0.f27355f && this.g == c2442n0.g && this.f27356h.equals(c2442n0.f27356h) && this.f27357i.equals(c2442n0.f27357i);
    }

    public final int hashCode() {
        int hashCode = (((((this.f27350a ^ 1000003) * 1000003) ^ this.f27351b.hashCode()) * 1000003) ^ this.f27352c) * 1000003;
        long j = this.f27353d;
        int i7 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f27354e;
        return ((((((((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f27355f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f27356h.hashCode()) * 1000003) ^ this.f27357i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f27350a);
        sb2.append(", model=");
        sb2.append(this.f27351b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f27352c);
        sb2.append(", totalRam=");
        sb2.append(this.f27353d);
        sb2.append(", diskSpace=");
        sb2.append(this.f27354e);
        sb2.append(", isEmulator=");
        sb2.append(this.f27355f);
        sb2.append(", state=");
        sb2.append(this.g);
        sb2.append(", manufacturer=");
        sb2.append(this.f27356h);
        sb2.append(", modelClass=");
        return h3.o.p(sb2, this.f27357i, "}");
    }
}
