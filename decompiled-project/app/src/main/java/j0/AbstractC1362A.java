package j0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import i0.C1288a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k0.AbstractC1401b;
import k0.AbstractC1402c;
import k0.C1403d;
import k0.C1412m;
import k0.C1416q;

/* renamed from: j0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1362A {

    /* renamed from: a, reason: collision with root package name */
    public static final Y5.A f18492a = new Y5.A(11);

    /* renamed from: b, reason: collision with root package name */
    public static Method f18493b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f18494c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f18495d;

    public static final Bitmap.Config A(int i7) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (l(i7, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (l(i7, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (l(i7, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && l(i7, 3)) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i10 < 26 || !l(i7, 4)) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final PorterDuff.Mode B(int i7) {
        return j(i7, 0) ? PorterDuff.Mode.CLEAR : j(i7, 1) ? PorterDuff.Mode.SRC : j(i7, 2) ? PorterDuff.Mode.DST : j(i7, 3) ? PorterDuff.Mode.SRC_OVER : j(i7, 4) ? PorterDuff.Mode.DST_OVER : j(i7, 5) ? PorterDuff.Mode.SRC_IN : j(i7, 6) ? PorterDuff.Mode.DST_IN : j(i7, 7) ? PorterDuff.Mode.SRC_OUT : j(i7, 8) ? PorterDuff.Mode.DST_OUT : j(i7, 9) ? PorterDuff.Mode.SRC_ATOP : j(i7, 10) ? PorterDuff.Mode.DST_ATOP : j(i7, 11) ? PorterDuff.Mode.XOR : j(i7, 12) ? PorterDuff.Mode.ADD : j(i7, 14) ? PorterDuff.Mode.SCREEN : j(i7, 15) ? PorterDuff.Mode.OVERLAY : j(i7, 16) ? PorterDuff.Mode.DARKEN : j(i7, 17) ? PorterDuff.Mode.LIGHTEN : j(i7, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static void C(float[] fArr, float f4, float f10) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f4) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f4) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f4) + fArr[14];
        float f14 = (fArr[11] * 0.0f) + (fArr[7] * f10) + (fArr[3] * f4) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public static final int D(float f4, float[] fArr, int i7) {
        float f10 = f4 >= 0.0f ? f4 : 0.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f4) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i7] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f4, float f10, float f11, float f12, AbstractC1402c abstractC1402c) {
        int i7;
        int i10;
        int i11;
        float b2;
        float a9;
        int i12;
        int i13;
        int i14;
        int i15;
        float b10;
        float a10;
        int i16;
        int i17;
        int i18;
        int i19 = 31;
        if (abstractC1402c.c()) {
            float f13 = f12 < 0.0f ? 0.0f : f12;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i20 = ((int) ((f13 * 255.0f) + 0.5f)) << 24;
            float f14 = f4 < 0.0f ? 0.0f : f4;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i21 = i20 | (((int) ((f14 * 255.0f) + 0.5f)) << 16);
            float f15 = f10 < 0.0f ? 0.0f : f10;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i22 = i21 | (((int) ((f15 * 255.0f) + 0.5f)) << 8);
            long j = (i22 | ((int) ((((f11 >= 0.0f ? f11 : 0.0f) <= 1.0f ? r8 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i23 = n.f18553h;
            return j;
        }
        int i24 = AbstractC1401b.f18688e;
        if (((int) (abstractC1402c.f18690b >> 32)) != 3) {
            u.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = abstractC1402c.f18691c;
        if (i25 == -1) {
            u.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b11 = abstractC1402c.b(0);
        float a11 = abstractC1402c.a(0);
        if (f4 >= b11) {
            b11 = f4;
        }
        if (b11 <= a11) {
            a11 = b11;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a11);
        int i26 = floatToRawIntBits >>> 31;
        int i27 = (floatToRawIntBits >>> 23) & 255;
        int i28 = floatToRawIntBits & 8388607;
        if (i27 == 255) {
            i10 = i28 != 0 ? 512 : 0;
            i7 = 31;
        } else {
            i7 = i27 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i10 = 0;
            } else if (i7 <= 0) {
                if (i7 >= -10) {
                    int i29 = (i28 | 8388608) >> (1 - i7);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i10 = i29 >> 13;
                } else {
                    i10 = 0;
                }
                i7 = 0;
            } else {
                int i30 = i28 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i11 = (((i7 << 10) | i30) + 1) | (i26 << 15);
                    short s3 = (short) i11;
                    b2 = abstractC1402c.b(1);
                    a9 = abstractC1402c.a(1);
                    if (f10 >= b2) {
                        b2 = f10;
                    }
                    if (b2 <= a9) {
                        a9 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a9);
                    int i31 = floatToRawIntBits2 >>> 31;
                    i12 = (floatToRawIntBits2 >>> 23) & 255;
                    int i32 = floatToRawIntBits2 & 8388607;
                    if (i12 != 255) {
                        i14 = i32 != 0 ? 512 : 0;
                        i13 = 31;
                    } else {
                        i13 = i12 - 112;
                        if (i13 >= 31) {
                            i13 = 49;
                            i14 = 0;
                        } else if (i13 <= 0) {
                            if (i13 >= -10) {
                                int i33 = (i32 | 8388608) >> (1 - i13);
                                if ((i33 & 4096) != 0) {
                                    i33 += 8192;
                                }
                                i14 = i33 >> 13;
                            } else {
                                i14 = 0;
                            }
                            i13 = 0;
                        } else {
                            int i34 = i32 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i15 = (((i13 << 10) | i34) + 1) | (i31 << 15);
                                short s10 = (short) i15;
                                b10 = abstractC1402c.b(2);
                                a10 = abstractC1402c.a(2);
                                if (f11 >= b10) {
                                    b10 = f11;
                                }
                                if (b10 <= a10) {
                                    a10 = b10;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a10);
                                int i35 = floatToRawIntBits3 >>> 31;
                                i16 = (floatToRawIntBits3 >>> 23) & 255;
                                int i36 = 8388607 & floatToRawIntBits3;
                                if (i16 == 255) {
                                    if (i36 != 0) {
                                        i17 = 512;
                                        i18 = (i35 << 15) | (i19 << 10) | i17;
                                        short s11 = (short) i18;
                                        long j10 = ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((s11 & 65535) << 16) | (i25 & 63);
                                        int i37 = n.f18553h;
                                        return j10;
                                    }
                                    i17 = 0;
                                    i18 = (i35 << 15) | (i19 << 10) | i17;
                                    short s112 = (short) i18;
                                    if (f12 >= 0.0f) {
                                    }
                                    long j102 = ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((s112 & 65535) << 16) | (i25 & 63);
                                    int i372 = n.f18553h;
                                    return j102;
                                }
                                int i38 = i16 - 112;
                                if (i38 < 31) {
                                    if (i38 > 0) {
                                        i17 = i36 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i18 = (((i38 << 10) | i17) + 1) | (i35 << 15);
                                            short s1122 = (short) i18;
                                            if (f12 >= 0.0f) {
                                            }
                                            long j1022 = ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((s1122 & 65535) << 16) | (i25 & 63);
                                            int i3722 = n.f18553h;
                                            return j1022;
                                        }
                                        i19 = i38;
                                    } else if (i38 >= -10) {
                                        int i39 = (i36 | 8388608) >> (1 - i38);
                                        if ((i39 & 4096) != 0) {
                                            i39 += 8192;
                                        }
                                        i17 = i39 >> 13;
                                        i19 = 0;
                                    } else {
                                        i19 = 0;
                                    }
                                    i18 = (i35 << 15) | (i19 << 10) | i17;
                                    short s11222 = (short) i18;
                                    if (f12 >= 0.0f) {
                                    }
                                    long j10222 = ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((s11222 & 65535) << 16) | (i25 & 63);
                                    int i37222 = n.f18553h;
                                    return j10222;
                                }
                                i19 = 49;
                                i17 = 0;
                                i18 = (i35 << 15) | (i19 << 10) | i17;
                                short s112222 = (short) i18;
                                if (f12 >= 0.0f) {
                                }
                                long j102222 = ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((s112222 & 65535) << 16) | (i25 & 63);
                                int i372222 = n.f18553h;
                                return j102222;
                            }
                            i14 = i34;
                        }
                    }
                    i15 = i14 | (i31 << 15) | (i13 << 10);
                    short s102 = (short) i15;
                    b10 = abstractC1402c.b(2);
                    a10 = abstractC1402c.a(2);
                    if (f11 >= b10) {
                    }
                    if (b10 <= a10) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a10);
                    int i352 = floatToRawIntBits32 >>> 31;
                    i16 = (floatToRawIntBits32 >>> 23) & 255;
                    int i362 = 8388607 & floatToRawIntBits32;
                    if (i16 == 255) {
                    }
                } else {
                    i10 = i30;
                }
            }
        }
        i11 = i10 | (i26 << 15) | (i7 << 10);
        short s32 = (short) i11;
        b2 = abstractC1402c.b(1);
        a9 = abstractC1402c.a(1);
        if (f10 >= b2) {
        }
        if (b2 <= a9) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a9);
        int i312 = floatToRawIntBits22 >>> 31;
        i12 = (floatToRawIntBits22 >>> 23) & 255;
        int i322 = floatToRawIntBits22 & 8388607;
        if (i12 != 255) {
        }
        i15 = i14 | (i312 << 15) | (i13 << 10);
        short s1022 = (short) i15;
        b10 = abstractC1402c.b(2);
        a10 = abstractC1402c.a(2);
        if (f11 >= b10) {
        }
        if (b10 <= a10) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a10);
        int i3522 = floatToRawIntBits322 >>> 31;
        i16 = (floatToRawIntBits322 >>> 23) & 255;
        int i3622 = 8388607 & floatToRawIntBits322;
        if (i16 == 255) {
        }
    }

    public static final long b(int i7) {
        long j = i7 << 32;
        int i10 = n.f18553h;
        return j;
    }

    public static final long c(long j) {
        long j10 = j << 32;
        int i7 = n.f18553h;
        return j10;
    }

    public static long d(int i7, int i10, int i11) {
        return b(((i7 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static final E5.o e() {
        return new E5.o(new Paint(7));
    }

    public static float[] g() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void h(Canvas canvas, boolean z8) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z8) {
                AbstractC1363a.h(canvas);
                return;
            } else {
                AbstractC1363a.q(canvas);
                return;
            }
        }
        if (!f18495d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f18493b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f18494c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f18493b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f18494c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f18493b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f18494c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f18495d = true;
        }
        if (z8) {
            try {
                Method method4 = f18493b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z8 || (method = f18494c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean i(int i7) {
        return i7 == 0;
    }

    public static final boolean j(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean k(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean l(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean m(int i7, int i10) {
        return i7 == i10;
    }

    public static final boolean n(int i7, int i10) {
        return i7 == i10;
    }

    public static long o() {
        return n.f18548b;
    }

    public static final boolean q(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final float r(long j) {
        AbstractC1402c f4 = n.f(j);
        if (!AbstractC1401b.a(f4.f18690b, AbstractC1401b.f18684a)) {
            u.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1401b.b(f4.f18690b)));
        }
        double h10 = n.h(j);
        C1412m c1412m = ((C1416q) f4).f18748p;
        double a9 = c1412m.a(h10);
        float a10 = (float) ((c1412m.a(n.e(j)) * 0.0722d) + (c1412m.a(n.g(j)) * 0.7152d) + (a9 * 0.2126d));
        if (a10 < 0.0f) {
            a10 = 0.0f;
        }
        if (a10 > 1.0f) {
            return 1.0f;
        }
        return a10;
    }

    public static final long s(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f18 = 1 / (((f14 * intBitsToFloat2) + (f11 * intBitsToFloat)) + f17);
        if ((Float.floatToRawIntBits(f18) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040) {
            f18 = 0.0f;
        }
        float f19 = f13 * intBitsToFloat2;
        return (Float.floatToRawIntBits((((f12 * intBitsToFloat2) + (f4 * intBitsToFloat)) + f15) * f18) << 32) | (Float.floatToRawIntBits((f19 + (f10 * intBitsToFloat) + f16) * f18) & 4294967295L);
    }

    public static final void t(float[] fArr, C1288a c1288a) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float f18 = c1288a.f18168a;
        float f19 = c1288a.f18169b;
        float f20 = c1288a.f18170c;
        float f21 = c1288a.f18171d;
        float f22 = f11 * f18;
        float f23 = f14 * f19;
        float f24 = 1.0f / ((f22 + f23) + f17);
        if ((Float.floatToRawIntBits(f24) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f18;
        float f26 = f12 * f19;
        float f27 = (f25 + f26 + f15) * f24;
        float f28 = f18 * f10;
        float f29 = f19 * f13;
        float f30 = (f28 + f29 + f16) * f24;
        float f31 = f14 * f21;
        float f32 = 1.0f / ((f22 + f31) + f17);
        float f33 = (Float.floatToRawIntBits(f32) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040 ? f32 : 0.0f;
        float f34 = f12 * f21;
        float f35 = (f25 + f34 + f15) * f33;
        float f36 = f13 * f21;
        float f37 = (f28 + f36 + f16) * f33;
        float f38 = f11 * f20;
        float f39 = 1.0f / ((f38 + f23) + f17);
        if ((Float.floatToRawIntBits(f39) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040) {
            f39 = 0.0f;
        }
        float f40 = f4 * f20;
        float f41 = (f40 + f26 + f15) * f39;
        float f42 = f10 * f20;
        float f43 = (f29 + f42 + f16) * f39;
        float f44 = 1.0f / ((f38 + f31) + f17);
        float f45 = (Float.floatToRawIntBits(f44) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040 ? f44 : 0.0f;
        float f46 = (f40 + f34 + f15) * f45;
        float f47 = (f42 + f36 + f16) * f45;
        c1288a.f18168a = Math.min(f27, Math.min(f35, Math.min(f41, f46)));
        c1288a.f18169b = Math.min(f30, Math.min(f37, Math.min(f43, f47)));
        c1288a.f18170c = Math.max(f27, Math.max(f35, Math.max(f41, f46)));
        c1288a.f18171d = Math.max(f30, Math.max(f37, Math.max(f43, f47)));
    }

    public static final void u(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void v(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f4;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final BlendMode w(int i7) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        if (j(i7, 0)) {
            blendMode29 = BlendMode.CLEAR;
            return blendMode29;
        }
        if (j(i7, 1)) {
            blendMode28 = BlendMode.SRC;
            return blendMode28;
        }
        if (j(i7, 2)) {
            blendMode27 = BlendMode.DST;
            return blendMode27;
        }
        if (j(i7, 3)) {
            blendMode26 = BlendMode.SRC_OVER;
            return blendMode26;
        }
        if (j(i7, 4)) {
            blendMode25 = BlendMode.DST_OVER;
            return blendMode25;
        }
        if (j(i7, 5)) {
            blendMode24 = BlendMode.SRC_IN;
            return blendMode24;
        }
        if (j(i7, 6)) {
            blendMode23 = BlendMode.DST_IN;
            return blendMode23;
        }
        if (j(i7, 7)) {
            blendMode22 = BlendMode.SRC_OUT;
            return blendMode22;
        }
        if (j(i7, 8)) {
            blendMode21 = BlendMode.DST_OUT;
            return blendMode21;
        }
        if (j(i7, 9)) {
            blendMode20 = BlendMode.SRC_ATOP;
            return blendMode20;
        }
        if (j(i7, 10)) {
            blendMode19 = BlendMode.DST_ATOP;
            return blendMode19;
        }
        if (j(i7, 11)) {
            blendMode18 = BlendMode.XOR;
            return blendMode18;
        }
        if (j(i7, 12)) {
            blendMode17 = BlendMode.PLUS;
            return blendMode17;
        }
        if (j(i7, 13)) {
            blendMode16 = BlendMode.MODULATE;
            return blendMode16;
        }
        if (j(i7, 14)) {
            blendMode15 = BlendMode.SCREEN;
            return blendMode15;
        }
        if (j(i7, 15)) {
            blendMode14 = BlendMode.OVERLAY;
            return blendMode14;
        }
        if (j(i7, 16)) {
            blendMode13 = BlendMode.DARKEN;
            return blendMode13;
        }
        if (j(i7, 17)) {
            blendMode12 = BlendMode.LIGHTEN;
            return blendMode12;
        }
        if (j(i7, 18)) {
            return AbstractC1363a.b();
        }
        if (j(i7, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (j(i7, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (j(i7, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (j(i7, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (j(i7, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (j(i7, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (j(i7, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (j(i7, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (j(i7, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (j(i7, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect x(V0.j jVar) {
        return new Rect(jVar.f9977a, jVar.f9978b, jVar.f9979c, jVar.f9980d);
    }

    public static final Rect y(i0.c cVar) {
        return new Rect((int) cVar.f18174a, (int) cVar.f18175b, (int) cVar.f18176c, (int) cVar.f18177d);
    }

    public static final int z(long j) {
        float[] fArr = C1403d.f18692a;
        return (int) (n.a(j, C1403d.f18696e) >>> 32);
    }

    public abstract void f(float f4, long j, E5.o oVar);

    public abstract i0.c p();
}
