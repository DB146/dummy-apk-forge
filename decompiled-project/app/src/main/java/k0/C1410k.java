package k0;

import j0.AbstractC1362A;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410k extends AbstractC1402c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1410k(int i7, int i10, long j, String str) {
        super(str, j, i7);
        this.f18726d = i10;
    }

    @Override // k0.AbstractC1402c
    public final float a(int i7) {
        switch (this.f18726d) {
            case 0:
                return i7 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // k0.AbstractC1402c
    public final float b(int i7) {
        switch (this.f18726d) {
            case 0:
                return i7 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // k0.AbstractC1402c
    public final long d(float f4, float f10, float f11) {
        switch (this.f18726d) {
            case 0:
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                if (f4 > 100.0f) {
                    f4 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f4 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float f16 = f14 * AbstractC1409j.f18725e[0];
                return (Float.floatToRawIntBits(f15 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
            default:
                if (f4 < -2.0f) {
                    f4 = -2.0f;
                }
                if (f4 > 2.0f) {
                    f4 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f) & 4294967295L);
        }
    }

    @Override // k0.AbstractC1402c
    public final float e(float f4, float f10, float f11) {
        switch (this.f18726d) {
            case 0:
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                if (f4 > 100.0f) {
                    f4 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f4 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * AbstractC1409j.f18725e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // k0.AbstractC1402c
    public final long f(float f4, float f10, float f11, float f12, AbstractC1402c abstractC1402c) {
        switch (this.f18726d) {
            case 0:
                float[] fArr = AbstractC1409j.f18725e;
                float f13 = f4 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float cbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float cbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * cbrt2) - 16.0f;
                float f17 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return AbstractC1362A.a(f16, f17, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f12, abstractC1402c);
            default:
                if (f4 < -2.0f) {
                    f4 = -2.0f;
                }
                if (f4 > 2.0f) {
                    f4 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return AbstractC1362A.a(f4, f10, f11 <= 2.0f ? f11 : 2.0f, f12, abstractC1402c);
        }
    }
}
