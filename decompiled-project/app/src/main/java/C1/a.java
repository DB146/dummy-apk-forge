package C1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f2450a;

    /* renamed from: b, reason: collision with root package name */
    public int f2451b;

    /* renamed from: c, reason: collision with root package name */
    public float f2452c;

    /* renamed from: d, reason: collision with root package name */
    public float f2453d;

    /* renamed from: e, reason: collision with root package name */
    public long f2454e;

    /* renamed from: f, reason: collision with root package name */
    public long f2455f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public float f2456h;

    /* renamed from: i, reason: collision with root package name */
    public int f2457i;

    public final float a(long j) {
        long j10 = this.f2454e;
        if (j < j10) {
            return 0.0f;
        }
        long j11 = this.g;
        if (j11 < 0 || j < j11) {
            return d.b(((float) (j - j10)) / this.f2450a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.f2456h;
        return (d.b(((float) (j - j11)) / this.f2457i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
