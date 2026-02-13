package o4;

import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final int f21779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21780b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21781c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21782d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21783e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21784f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21785h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f21786i;
    public short[] j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f21787l;

    /* renamed from: m, reason: collision with root package name */
    public int f21788m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f21789n;

    /* renamed from: o, reason: collision with root package name */
    public int f21790o;

    /* renamed from: p, reason: collision with root package name */
    public int f21791p;

    /* renamed from: q, reason: collision with root package name */
    public int f21792q;

    /* renamed from: r, reason: collision with root package name */
    public int f21793r;

    /* renamed from: s, reason: collision with root package name */
    public int f21794s;

    /* renamed from: t, reason: collision with root package name */
    public int f21795t;

    /* renamed from: u, reason: collision with root package name */
    public int f21796u;

    /* renamed from: v, reason: collision with root package name */
    public int f21797v;

    public O(int i7, int i10, float f4, float f10, int i11) {
        this.f21779a = i7;
        this.f21780b = i10;
        this.f21781c = f4;
        this.f21782d = f10;
        this.f21783e = i7 / i11;
        this.f21784f = i7 / 400;
        int i12 = i7 / 65;
        this.g = i12;
        int i13 = i12 * 2;
        this.f21785h = i13;
        this.f21786i = new short[i13];
        this.j = new short[i13 * i10];
        this.f21787l = new short[i13 * i10];
        this.f21789n = new short[i13 * i10];
    }

    public static void e(int i7, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i7 - i18) * sArr2[i17])) / i7);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i10) {
        short[] c10 = c(this.f21787l, this.f21788m, i10);
        this.f21787l = c10;
        int i11 = this.f21780b;
        System.arraycopy(sArr, i7 * i11, c10, this.f21788m * i11, i11 * i10);
        this.f21788m += i10;
    }

    public final void b(short[] sArr, int i7, int i10) {
        int i11 = this.f21785h / i10;
        int i12 = this.f21780b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f21786i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = this.f21780b;
        int i12 = length / i11;
        return i7 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * this.f21780b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f21796u = i14 / i15;
        this.f21797v = i16 / i13;
        return i15;
    }

    public final void f() {
        int i7;
        int i10;
        float f4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.f21788m;
        float f10 = this.f21781c;
        float f11 = this.f21782d;
        float f12 = f10 / f11;
        float f13 = this.f21783e * f11;
        double d10 = f12;
        int i21 = this.f21779a;
        int i22 = this.f21780b;
        int i23 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i24 = this.k;
            int i25 = this.f21785h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f21793r;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(this.j, i26, min);
                        this.f21793r -= min;
                        i26 += min;
                        i10 = i20;
                        f4 = f13;
                        i7 = i21;
                    } else {
                        short[] sArr = this.j;
                        int i28 = i21 > 4000 ? i21 / 4000 : i23;
                        int i29 = this.g;
                        int i30 = this.f21784f;
                        if (i22 == i23 && i28 == i23) {
                            i11 = d(sArr, i26, i30, i29);
                            i10 = i20;
                            f4 = f13;
                            i7 = i21;
                        } else {
                            b(sArr, i26, i28);
                            i7 = i21;
                            i10 = i20;
                            short[] sArr2 = this.f21786i;
                            f4 = f13;
                            int d11 = d(sArr2, 0, i30 / i28, i29 / i28);
                            if (i28 != 1) {
                                int i31 = d11 * i28;
                                int i32 = i28 * 4;
                                int i33 = i31 - i32;
                                int i34 = i31 + i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i22 == 1) {
                                    i11 = d(sArr, i26, i30, i29);
                                } else {
                                    b(sArr, i26, 1);
                                    i11 = d(sArr2, 0, i30, i29);
                                }
                            } else {
                                i11 = d11;
                            }
                        }
                        int i35 = this.f21796u;
                        int i36 = this.f21797v;
                        if (i35 == 0 || (i12 = this.f21794s) == 0 || i36 > i35 * 3 || i35 * 2 <= this.f21795t * 3) {
                            i12 = i11;
                        }
                        this.f21795t = i35;
                        this.f21794s = i11;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f12 >= 2.0f) {
                                i14 = (int) (i12 / (f12 - 1.0f));
                            } else {
                                this.f21793r = (int) (((2.0f - f12) * i12) / (f12 - 1.0f));
                                i14 = i12;
                            }
                            short[] c10 = c(this.f21787l, this.f21788m, i14);
                            this.f21787l = c10;
                            int i37 = i26;
                            e(i14, this.f21780b, c10, this.f21788m, sArr3, i37, sArr3, i26 + i12);
                            this.f21788m += i14;
                            i26 = i12 + i14 + i37;
                        } else {
                            int i38 = i26;
                            short[] sArr4 = this.j;
                            if (f12 < 0.5f) {
                                i13 = (int) ((i12 * f12) / (1.0f - f12));
                            } else {
                                this.f21793r = (int) ((((2.0f * f12) - 1.0f) * i12) / (1.0f - f12));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c11 = c(this.f21787l, this.f21788m, i39);
                            this.f21787l = c11;
                            System.arraycopy(sArr4, i38 * i22, c11, this.f21788m * i22, i12 * i22);
                            e(i13, this.f21780b, this.f21787l, this.f21788m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f21788m += i39;
                            i26 = i38 + i13;
                        }
                    }
                    if (i26 + i25 > i24) {
                        break;
                    }
                    i21 = i7;
                    i20 = i10;
                    f13 = f4;
                    i23 = 1;
                }
                int i40 = this.k - i26;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i26 * i22, sArr5, 0, i40 * i22);
                this.k = i40;
                if (f4 != 1.0f || this.f21788m == (i15 = i10)) {
                }
                int i41 = i7;
                int i42 = (int) (i41 / f4);
                int i43 = i41;
                while (true) {
                    if (i42 <= 16384 && i43 <= 16384) {
                        break;
                    }
                    i42 /= 2;
                    i43 /= 2;
                }
                int i44 = this.f21788m - i15;
                short[] c12 = c(this.f21789n, this.f21790o, i44);
                this.f21789n = c12;
                System.arraycopy(this.f21787l, i15 * i22, c12, this.f21790o * i22, i44 * i22);
                this.f21788m = i15;
                this.f21790o += i44;
                int i45 = 0;
                while (true) {
                    i16 = this.f21790o;
                    i17 = i16 - 1;
                    if (i45 >= i17) {
                        break;
                    }
                    while (true) {
                        i18 = this.f21791p + 1;
                        int i46 = i18 * i42;
                        i19 = this.f21792q;
                        if (i46 <= i19 * i43) {
                            break;
                        }
                        this.f21787l = c(this.f21787l, this.f21788m, 1);
                        for (int i47 = 0; i47 < i22; i47++) {
                            short[] sArr6 = this.f21787l;
                            int i48 = (this.f21788m * i22) + i47;
                            short[] sArr7 = this.f21789n;
                            int i49 = (i45 * i22) + i47;
                            short s3 = sArr7[i49];
                            short s10 = sArr7[i49 + i22];
                            int i50 = this.f21792q * i43;
                            int i51 = this.f21791p;
                            int i52 = i51 * i42;
                            int i53 = (i51 + 1) * i42;
                            int i54 = i53 - i50;
                            int i55 = i53 - i52;
                            sArr6[i48] = (short) ((((i55 - i54) * s10) + (s3 * i54)) / i55);
                        }
                        this.f21792q++;
                        this.f21788m++;
                    }
                    this.f21791p = i18;
                    if (i18 == i43) {
                        this.f21791p = 0;
                        AbstractC1705a.m(i19 == i42);
                        this.f21792q = 0;
                    }
                    i45++;
                }
                if (i17 == 0) {
                    return;
                }
                short[] sArr8 = this.f21789n;
                System.arraycopy(sArr8, i17 * i22, sArr8, 0, (i16 - i17) * i22);
                this.f21790o -= i17;
                return;
            }
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        i10 = i20;
        f4 = f13;
        i7 = i21;
        if (f4 != 1.0f) {
        }
    }
}
