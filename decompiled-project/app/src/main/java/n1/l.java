package n1;

/* loaded from: classes.dex */
public final class l {
    public static final l k;

    /* renamed from: a, reason: collision with root package name */
    public final float f21050a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21052c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21053d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21054e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21055f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21056h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21057i;
    public final float j;

    static {
        float[] fArr = b.f21025c;
        float n6 = (float) ((b.n() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f21023a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f4;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f4 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-n6) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * n6) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(n6 * 5.0d))) + (f19 * n6);
        float n8 = b.n() / fArr[1];
        double d11 = n8;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        k = new l(n8, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f4, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f21055f = f4;
        this.f21050a = f10;
        this.f21051b = f11;
        this.f21052c = f12;
        this.f21053d = f13;
        this.f21054e = f14;
        this.g = fArr;
        this.f21056h = f15;
        this.f21057i = f16;
        this.j = f17;
    }
}
