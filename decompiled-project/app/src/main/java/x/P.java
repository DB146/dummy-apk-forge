package x;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public float f25975a;

    /* renamed from: b, reason: collision with root package name */
    public double f25976b;

    public final long a(float f4, float f10, long j) {
        float f11 = f4 - this.f25975a;
        double d10 = j / 1000.0d;
        double d11 = this.f25976b;
        double d12 = f11;
        double d13 = (d11 * d12) + f10;
        double d14 = (-d11) * d10;
        double d15 = (d10 * d13) + d12;
        double exp = Math.exp(d14) * d15;
        float exp2 = (float) ((Math.exp(d14) * d13) + (Math.exp(d14) * d15 * (-this.f25976b)));
        return (Float.floatToRawIntBits(exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.f25975a)) << 32);
    }
}
