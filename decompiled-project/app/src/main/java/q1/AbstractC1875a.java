package q1;

import android.graphics.Color;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1875a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f23339a = new ThreadLocal();

    public static void a(int i7, int i10, int i11, float[] fArr) {
        float f4;
        float abs;
        float f10 = i7 / 255.0f;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min;
        float f14 = (max + min) / 2.0f;
        if (max == min) {
            f4 = 0.0f;
            abs = 0.0f;
        } else {
            f4 = max == f10 ? ((f11 - f12) / f13) % 6.0f : max == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f4 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f;
    }

    public static int b(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static double c(int i7, int i10) {
        if (Color.alpha(i10) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        if (Color.alpha(i7) < 255) {
            i7 = f(i7, i10);
        }
        double d10 = d(i7) + 0.05d;
        double d11 = d(i10) + 0.05d;
        return Math.max(d10, d11) / Math.min(d10, d11);
    }

    public static double d(int i7) {
        ThreadLocal threadLocal = f23339a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = red / 255.0d;
        double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = green / 255.0d;
        double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = blue / 255.0d;
        double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d13 / 100.0d;
    }

    public static int e(float f4, int i7, int i10) {
        int i11 = 255;
        if (Color.alpha(i10) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        double d10 = f4;
        if (c(h(i7, 255), i10) < d10) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
            int i14 = (i12 + i11) / 2;
            if (c(h(i7, i14), i10) < d10) {
                i12 = i14;
            } else {
                i11 = i14;
            }
        }
        return i11;
    }

    public static int f(int i7, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i7);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, g(Color.red(i7), alpha2, Color.red(i10), alpha, i11), g(Color.green(i7), alpha2, Color.green(i10), alpha, i11), g(Color.blue(i7), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int g(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i7 * 255) * i10)) / (i13 * 255);
    }

    public static int h(int i7, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & 16777215) | (i10 << 24);
    }
}
