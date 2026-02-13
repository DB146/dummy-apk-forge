package q1;

import android.graphics.Path;
import android.util.Log;

/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877c {

    /* renamed from: a, reason: collision with root package name */
    public char f23345a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23346b;

    public C1877c(char c10, float[] fArr) {
        this.f23345a = c10;
        this.f23346b = fArr;
    }

    public C1877c(C1877c c1877c) {
        this.f23345a = c1877c.f23345a;
        float[] fArr = c1877c.f23346b;
        this.f23346b = tc.b.p(fArr, fArr.length);
    }

    public static void a(Path path, float f4, float f10, float f11, float f12, float f13, float f14, float f15, boolean z8, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f4;
        double d13 = f10;
        double d14 = (d13 * sin) + (d12 * cos);
        double d15 = d12;
        double d16 = f13;
        double d17 = d14 / d16;
        double d18 = f14;
        double d19 = ((d13 * cos) + ((-f4) * sin)) / d18;
        double d20 = d13;
        double d21 = f12;
        double d22 = ((d21 * sin) + (f11 * cos)) / d16;
        double d23 = ((d21 * cos) + ((-f11) * sin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d28);
            float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f4, f10, f11, f12, f13 * sqrt, f14 * sqrt, f15, z8, z10);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d24 * sqrt2;
        double d31 = sqrt2 * d25;
        if (z8 == z10) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double atan2 = Math.atan2(d19 - d11, d17 - d10);
        double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
        if (z10 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * cos) - (d33 * sin);
        double d35 = (d33 * cos) + (d32 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d36 = -d16;
        double d37 = d36 * cos2;
        double d38 = d18 * sin2;
        double d39 = (d37 * sin3) - (d38 * cos3);
        double d40 = d36 * sin2;
        double d41 = d18 * cos2;
        double d42 = (cos3 * d41) + (sin3 * d40);
        double d43 = d41;
        double d44 = atan22 / ceil;
        int i7 = 0;
        while (i7 < ceil) {
            double d45 = atan2 + d44;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d44;
            double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
            double d48 = d43;
            double d49 = d34;
            double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
            double d51 = (d37 * sin4) - (d38 * cos4);
            double d52 = (cos4 * d48) + (sin4 * d40);
            double d53 = d45 - atan2;
            double tan = Math.tan(d53 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
            i7++;
            atan2 = d45;
            d40 = d40;
            cos2 = cos2;
            ceil = ceil;
            d42 = d52;
            d16 = d16;
            d39 = d51;
            d15 = d47;
            d20 = d50;
            d34 = d49;
            d44 = d46;
            d43 = d48;
        }
    }

    public static void b(C1877c[] c1877cArr, Path path) {
        int i7;
        int i10;
        char c10;
        int i11;
        int i12;
        C1877c c1877c;
        float f4;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        C1877c[] c1877cArr2 = c1877cArr;
        int i13 = 6;
        float[] fArr = new float[6];
        int length = c1877cArr2.length;
        int i14 = 0;
        char c11 = 'm';
        while (i14 < length) {
            C1877c c1877c2 = c1877cArr2[i14];
            char c12 = c1877c2.f23345a;
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                    break;
            }
            i7 = 2;
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i15 = 0;
            while (true) {
                float[] fArr2 = c1877c2.f23346b;
                if (i15 < fArr2.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                i10 = i15;
                                c10 = c12;
                                i11 = i14;
                                i12 = length;
                                c1877c = c1877c2;
                                path.lineTo(fArr2[i10], f30);
                                f29 = fArr2[i10];
                            } else if (c12 == 'Q') {
                                i10 = i15;
                                c10 = c12;
                                i11 = i14;
                                i12 = length;
                                c1877c = c1877c2;
                                float f31 = fArr2[i10];
                                int i16 = i10 + 1;
                                float f32 = fArr2[i16];
                                int i17 = i10 + 2;
                                int i18 = i10 + 3;
                                path.quadTo(f31, f32, fArr2[i17], fArr2[i18]);
                                f4 = fArr2[i10];
                                f10 = fArr2[i16];
                                f29 = fArr2[i17];
                                f30 = fArr2[i18];
                            } else if (c12 == 'V') {
                                i10 = i15;
                                c10 = c12;
                                i11 = i14;
                                i12 = length;
                                c1877c = c1877c2;
                                path.lineTo(f29, fArr2[i10]);
                                f30 = fArr2[i10];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 != 'h') {
                                        if (c12 == 'q') {
                                            i10 = i15;
                                            float f33 = f30;
                                            float f34 = f29;
                                            int i19 = i10 + 1;
                                            int i20 = i10 + 2;
                                            int i21 = i10 + 3;
                                            path.rQuadTo(fArr2[i10], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            float f35 = f34 + fArr2[i10];
                                            float f36 = fArr2[i19] + f33;
                                            float f37 = f34 + fArr2[i20];
                                            f30 = f33 + fArr2[i21];
                                            f24 = f36;
                                            f23 = f35;
                                            c10 = c12;
                                            i11 = i14;
                                            i12 = length;
                                            f29 = f37;
                                        } else if (c12 == 'v') {
                                            i10 = i15;
                                            path.rLineTo(0.0f, fArr2[i10]);
                                            f30 += fArr2[i10];
                                        } else if (c12 == 'L') {
                                            i10 = i15;
                                            int i22 = i10 + 1;
                                            path.lineTo(fArr2[i10], fArr2[i22]);
                                            f29 = fArr2[i10];
                                            f30 = fArr2[i22];
                                        } else if (c12 == 'M') {
                                            i10 = i15;
                                            f29 = fArr2[i10];
                                            f30 = fArr2[i10 + 1];
                                            if (i10 > 0) {
                                                path.lineTo(f29, f30);
                                            } else {
                                                path.moveTo(f29, f30);
                                                f28 = f30;
                                                f27 = f29;
                                            }
                                        } else if (c12 == 'S') {
                                            i10 = i15;
                                            float f38 = f30;
                                            float f39 = f29;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f15 = (f38 * 2.0f) - f24;
                                                f16 = (f39 * 2.0f) - f23;
                                            } else {
                                                f16 = f39;
                                                f15 = f38;
                                            }
                                            int i23 = i10 + 1;
                                            int i24 = i10 + 2;
                                            int i25 = i10 + 3;
                                            path.cubicTo(f16, f15, fArr2[i10], fArr2[i23], fArr2[i24], fArr2[i25]);
                                            float f40 = fArr2[i10];
                                            float f41 = fArr2[i23];
                                            f29 = fArr2[i24];
                                            f30 = fArr2[i25];
                                            f24 = f41;
                                            f23 = f40;
                                        } else if (c12 == 'T') {
                                            i10 = i15;
                                            float f42 = f30;
                                            float f43 = f29;
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f11 = (f43 * 2.0f) - f23;
                                                f12 = (f42 * 2.0f) - f24;
                                            } else {
                                                f11 = f43;
                                                f12 = f42;
                                            }
                                            int i26 = i10 + 1;
                                            path.quadTo(f11, f12, fArr2[i10], fArr2[i26]);
                                            f13 = fArr2[i10];
                                            f14 = fArr2[i26];
                                        } else if (c12 == 'l') {
                                            i10 = i15;
                                            int i27 = i10 + 1;
                                            path.rLineTo(fArr2[i10], fArr2[i27]);
                                            f29 += fArr2[i10];
                                            f30 += fArr2[i27];
                                        } else if (c12 == 'm') {
                                            i10 = i15;
                                            float f44 = fArr2[i10];
                                            f29 += f44;
                                            float f45 = fArr2[i10 + 1];
                                            f30 += f45;
                                            if (i10 > 0) {
                                                path.rLineTo(f44, f45);
                                            } else {
                                                path.rMoveTo(f44, f45);
                                                f28 = f30;
                                                f27 = f29;
                                            }
                                        } else if (c12 == 's') {
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                float f46 = f29 - f23;
                                                f17 = f30 - f24;
                                                f18 = f46;
                                            } else {
                                                f17 = 0.0f;
                                                f18 = 0.0f;
                                            }
                                            int i28 = i15 + 1;
                                            int i29 = i15 + 2;
                                            int i30 = i15 + 3;
                                            i10 = i15;
                                            float f47 = f30;
                                            float f48 = f29;
                                            path.rCubicTo(f18, f17, fArr2[i15], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f11 = f48 + fArr2[i10];
                                            f12 = f47 + fArr2[i28];
                                            f13 = f48 + fArr2[i29];
                                            f14 = fArr2[i30] + f47;
                                        } else if (c12 != 't') {
                                            i10 = i15;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f19 = f29 - f23;
                                                f20 = f30 - f24;
                                            } else {
                                                f20 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i31 = i15 + 1;
                                            path.rQuadTo(f19, f20, fArr2[i15], fArr2[i31]);
                                            float f49 = f19 + f29;
                                            float f50 = f20 + f30;
                                            f29 += fArr2[i15];
                                            f30 += fArr2[i31];
                                            f24 = f50;
                                            i10 = i15;
                                            c10 = c12;
                                            i11 = i14;
                                            i12 = length;
                                            f23 = f49;
                                        }
                                        c1877c = c1877c2;
                                    } else {
                                        i10 = i15;
                                        path.rLineTo(fArr2[i10], 0.0f);
                                        f29 += fArr2[i10];
                                    }
                                    c10 = c12;
                                    i11 = i14;
                                    i12 = length;
                                    c1877c = c1877c2;
                                } else {
                                    i10 = i15;
                                    float f51 = f30;
                                    float f52 = f29;
                                    int i32 = i10 + 2;
                                    int i33 = i10 + 3;
                                    int i34 = i10 + 4;
                                    int i35 = i10 + 5;
                                    path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                                    f11 = f52 + fArr2[i32];
                                    f12 = f51 + fArr2[i33];
                                    f13 = f52 + fArr2[i34];
                                    f14 = fArr2[i35] + f51;
                                }
                                f24 = f12;
                                f23 = f11;
                                c10 = c12;
                                i11 = i14;
                                i12 = length;
                                f29 = f13;
                                f30 = f14;
                                c1877c = c1877c2;
                            } else {
                                i10 = i15;
                                float f53 = f30;
                                float f54 = f29;
                                int i36 = i10 + 5;
                                int i37 = i10 + 6;
                                c10 = c12;
                                i12 = length;
                                c1877c = c1877c2;
                                i11 = i14;
                                a(path, f54, f53, fArr2[i36] + f54, fArr2[i37] + f53, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                                f29 = f54 + fArr2[i36];
                                f30 = f53 + fArr2[i37];
                            }
                            i15 = i10 + i7;
                            c1877c2 = c1877c;
                            length = i12;
                            c11 = c10;
                            c12 = c11;
                            i14 = i11;
                        } else {
                            i10 = i15;
                            c10 = c12;
                            i11 = i14;
                            i12 = length;
                            c1877c = c1877c2;
                            int i38 = i10 + 2;
                            int i39 = i10 + 3;
                            int i40 = i10 + 4;
                            int i41 = i10 + 5;
                            path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f29 = fArr2[i40];
                            f30 = fArr2[i41];
                            f4 = fArr2[i38];
                            f10 = fArr2[i39];
                        }
                        f23 = f4;
                        f24 = f10;
                        i15 = i10 + i7;
                        c1877c2 = c1877c;
                        length = i12;
                        c11 = c10;
                        c12 = c11;
                        i14 = i11;
                    } else {
                        i10 = i15;
                        c10 = c12;
                        i11 = i14;
                        i12 = length;
                        c1877c = c1877c2;
                        int i42 = i10 + 5;
                        int i43 = i10 + 6;
                        a(path, f29, f30, fArr2[i42], fArr2[i43], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f29 = fArr2[i42];
                        f30 = fArr2[i43];
                    }
                    f24 = f30;
                    f23 = f29;
                    i15 = i10 + i7;
                    c1877c2 = c1877c;
                    length = i12;
                    c11 = c10;
                    c12 = c11;
                    i14 = i11;
                }
            }
            fArr[0] = f29;
            fArr[1] = f30;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f27;
            fArr[5] = f28;
            c11 = c1877c2.f23345a;
            i14++;
            c1877cArr2 = c1877cArr;
            length = length;
            i13 = 6;
        }
    }
}
