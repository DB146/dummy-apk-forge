package k0;

import j0.AbstractC1362A;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411l extends AbstractC1402c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f18727d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f18728e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f18729f;
    public static final float[] g;

    static {
        float[] g2 = AbstractC1409j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1409j.c(C1400a.f18682b.f18683a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f18727d = g2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f18728e = fArr;
        f18729f = AbstractC1409j.f(g2);
        g = AbstractC1409j.f(fArr);
    }

    @Override // k0.AbstractC1402c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // k0.AbstractC1402c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // k0.AbstractC1402c
    public final long d(float f4, float f10, float f11) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f4);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f4);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f4);
        float f16 = f14 * f14 * f14;
        float f17 = f15 * f15 * f15;
        float[] fArr2 = f18729f;
        float f18 = (fArr2[6] * f17) + (fArr2[3] * f16) + (fArr2[0] * f13 * f13 * f13);
        return (Float.floatToRawIntBits((fArr2[7] * f17) + (fArr2[4] * f16) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32);
    }

    @Override // k0.AbstractC1402c
    public final float e(float f4, float f10, float f11) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f4);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f4);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f4);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f18729f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // k0.AbstractC1402c
    public final long f(float f4, float f10, float f11, float f12, AbstractC1402c abstractC1402c) {
        float[] fArr = f18727d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f4);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f4);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f4);
        float k = Y6.b.k(f13);
        float k7 = Y6.b.k(f14);
        float k10 = Y6.b.k(f15);
        float[] fArr2 = f18728e;
        return AbstractC1362A.a((fArr2[6] * k10) + (fArr2[3] * k7) + (fArr2[0] * k), (fArr2[7] * k10) + (fArr2[4] * k7) + (fArr2[1] * k), (fArr2[8] * k10) + (fArr2[5] * k7) + (fArr2[2] * k), f12, abstractC1402c);
    }
}
