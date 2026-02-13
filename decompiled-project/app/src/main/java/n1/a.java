package n1;

import android.graphics.Color;
import q1.AbstractC1875a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f21017a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21018b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21019c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21020d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21021e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21022f;

    public a(float f4, float f10, float f11, float f12, float f13, float f14) {
        this.f21017a = f4;
        this.f21018b = f10;
        this.f21019c = f11;
        this.f21020d = f12;
        this.f21021e = f13;
        this.f21022f = f14;
    }

    public static a a(int i7) {
        l lVar = l.k;
        float g = b.g(Color.red(i7));
        float g2 = b.g(Color.green(i7));
        float g10 = b.g(Color.blue(i7));
        float[][] fArr = b.f21026d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[2] * g10) + (fArr2[1] * g2) + (fArr2[0] * g);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * g10) + (fArr3[1] * g2) + (fArr3[0] * g);
        float[] fArr4 = fArr[2];
        float f11 = (g10 * fArr4[2]) + (g2 * fArr4[1]) + (g * fArr4[0]);
        float[][] fArr5 = b.f21023a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f4);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f4 * fArr8[0]);
        float[] fArr9 = lVar.g;
        float f15 = fArr9[0] * f12;
        float f16 = fArr9[1] * f13;
        float f17 = fArr9[2] * f14;
        float abs = Math.abs(f15);
        float f18 = lVar.f21056h;
        float pow = (float) Math.pow((abs * f18) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f17) * f18) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f19 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = ((21.0f * signum3) + ((signum * 20.0f) + f21)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float f26 = f23 * lVar.f21051b;
        float f27 = lVar.f21050a;
        float f28 = lVar.f21053d;
        float pow4 = ((float) Math.pow(f26 / f27, lVar.j * f28)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f29 = f27 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f21055f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f24) < 20.14d ? 360.0f + f24 : f24) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f21054e) * lVar.f21052c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f30 = lVar.f21057i * pow5;
        Math.sqrt((r3 * f28) / f29);
        float f31 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f30 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f25;
        return new a(f24, pow5, pow4, f31, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f4, float f10, float f11) {
        l lVar = l.k;
        float f12 = lVar.f21053d;
        Math.sqrt(f4 / 100.0d);
        float f13 = lVar.f21050a + 4.0f;
        float f14 = lVar.f21057i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * lVar.f21053d) / f13);
        float f15 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f4, f15, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float f4;
        float f10 = this.f21018b;
        double d10 = f10;
        float f11 = this.f21019c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 != 0.0d) {
                f4 = f10 / ((float) Math.sqrt(d11 / 100.0d));
                float pow = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, lVar.f21055f), 0.73d), 1.1111111111111112d);
                double d12 = (this.f21017a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = lVar.f21050a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f21053d) / lVar.j));
                float f12 = cos * 3846.1538f * lVar.f21054e * lVar.f21052c;
                float f13 = pow2 / lVar.f21051b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f12 * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18)));
                float signum = Math.signum(f18);
                float f21 = 100.0f / lVar.f21056h;
                float pow3 = signum * f21 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float[] fArr = lVar.g;
                float f22 = pow3 / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.f21024b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return AbstractC1875a.b(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f4 = 0.0f;
        float pow4 = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, lVar.f21055f), 0.73d), 1.1111111111111112d);
        double d122 = (this.f21017a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = lVar.f21050a * ((float) Math.pow(f11 / 100.0d, (1.0d / lVar.f21053d) / lVar.j));
        float f122 = cos3 * 3846.1538f * lVar.f21054e * lVar.f21052c;
        float f132 = pow22 / lVar.f21051b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f142 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f122 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182)));
        float signum4 = Math.signum(f182);
        float f212 = 100.0f / lVar.f21056h;
        float pow32 = signum4 * f212 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum32 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float[] fArr6 = lVar.g;
        float f222 = pow32 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.f21024b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return AbstractC1875a.b(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
