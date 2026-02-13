package w;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2175b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f25547a;

    static {
        float f4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float[] fArr = new float[101];
        f25547a = fArr;
        float[] fArr2 = new float[101];
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i7 = 0; i7 < 100; i7++) {
            float f19 = i7 / 100;
            float f20 = 1.0f;
            while (true) {
                f4 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f4;
                f11 = f4 * 3.0f * f10;
                f12 = f4 * f4 * f4;
                float f21 = (((f4 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                if (Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                } else if (f21 > f19) {
                    f20 = f4;
                } else {
                    f17 = f4;
                }
            }
            float f22 = 0.5f;
            fArr[i7] = (((f10 * 0.5f) + f4) * f11) + f12;
            float f23 = 1.0f;
            while (true) {
                f13 = ((f23 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f24 = (((f14 * f22) + f13) * f15) + f16;
                if (Math.abs(f24 - f19) >= 1.0E-5d) {
                    if (f24 > f19) {
                        f23 = f13;
                    } else {
                        f18 = f13;
                    }
                    f22 = 0.5f;
                }
            }
            fArr2[i7] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C2174a a(float f4) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float j = h3.H.j(f4, 0.0f, 1.0f);
        float f12 = 100;
        int i7 = (int) (f12 * j);
        if (i7 < 100) {
            float f13 = i7 / f12;
            int i10 = i7 + 1;
            float f14 = i10 / f12;
            float[] fArr = f25547a;
            float f15 = fArr[i7];
            float f16 = (fArr[i10] - f15) / (f14 - f13);
            float d10 = h3.o.d(j, f13, f16, f15);
            f10 = f16;
            f11 = d10;
        }
        return new C2174a(f11, f10);
    }
}
