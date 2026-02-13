package J3;

import A0.G0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final A3.k f5487f = A3.k.a(A3.b.f350c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final A3.k g = new A3.k("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, A3.k.f355e);

    /* renamed from: h, reason: collision with root package name */
    public static final A3.k f5488h;

    /* renamed from: i, reason: collision with root package name */
    public static final A3.k f5489i;
    public static final U9.j j;
    public static final ArrayDeque k;

    /* renamed from: a, reason: collision with root package name */
    public final D3.a f5490a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f5491b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.f f5492c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5493d;

    /* renamed from: e, reason: collision with root package name */
    public final w f5494e = w.a();

    static {
        o oVar = o.f5480b;
        Boolean bool = Boolean.FALSE;
        f5488h = A3.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f5489i = A3.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new U9.j(7);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = W3.o.f10619a;
        k = new ArrayDeque(0);
    }

    public q(ArrayList arrayList, DisplayMetrics displayMetrics, D3.a aVar, D3.f fVar) {
        this.f5493d = arrayList;
        W3.g.c(displayMetrics, "Argument must not be null");
        this.f5491b = displayMetrics;
        W3.g.c(aVar, "Argument must not be null");
        this.f5490a = aVar;
        W3.g.c(fVar, "Argument must not be null");
        this.f5492c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(G0 g02, BitmapFactory.Options options, p pVar, D3.a aVar) {
        if (!options.inJustDecodeBounds) {
            pVar.k();
            switch (g02.f26a) {
                case 20:
                    x xVar = (x) ((com.bumptech.glide.load.data.h) g02.f27b).f14680b;
                    synchronized (xVar) {
                        xVar.f5508c = xVar.f5506a.length;
                        break;
                    }
            }
        }
        int i7 = options.outWidth;
        int i10 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = A.f5448b;
        lock.lock();
        try {
            try {
                Bitmap F10 = g02.F(options);
                lock.unlock();
                return F10;
            } catch (IllegalArgumentException e2) {
                StringBuilder q10 = h3.o.q(i7, i10, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                q10.append(str);
                q10.append(", inBitmap: ");
                q10.append(d(options.inBitmap));
                IOException iOException = new IOException(q10.toString(), e2);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    aVar.g(bitmap);
                    options.inBitmap = null;
                    Bitmap c10 = c(g02, options, pVar, aVar);
                    A.f5448b.unlock();
                    return c10;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            A.f5448b.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0340d a(G0 g02, int i7, int i10, A3.l lVar, p pVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f5492c.c(65536, byte[].class);
        synchronized (q.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        A3.b bVar = (A3.b) lVar.c(f5487f);
        A3.m mVar = (A3.m) lVar.c(g);
        o oVar = (o) lVar.c(o.g);
        boolean booleanValue = ((Boolean) lVar.c(f5488h)).booleanValue();
        A3.k kVar = f5489i;
        try {
            C0340d e2 = C0340d.e(this.f5490a, b(g02, options2, oVar, bVar, mVar, lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue(), i7, i10, booleanValue, pVar));
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f5492c.g(bArr);
            return e2;
        } catch (Throwable th) {
            e(options2);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f5492c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0619 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x057d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(G0 g02, BitmapFactory.Options options, o oVar, A3.b bVar, A3.m mVar, boolean z8, int i7, int i10, boolean z10, p pVar) {
        long j10;
        boolean z11;
        String str;
        boolean z12;
        int i11;
        int i12;
        int i13;
        boolean z13;
        String str2;
        String str3;
        int i14;
        String str4;
        String str5;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean c10;
        boolean z14;
        boolean z15;
        int i19;
        int round;
        int i20;
        int i21;
        int i22;
        Bitmap c11;
        Bitmap f4;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        boolean z16;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        String str6;
        String str7;
        int i23;
        int i24;
        int floor;
        int floor2;
        int i25;
        x xVar;
        int i26 = W3.i.f10608b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        D3.a aVar = this.f5490a;
        c(g02, options, pVar, aVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i27 = iArr[0];
        int i28 = iArr[1];
        String str8 = options.outMimeType;
        if (i27 == -1 || i28 == -1) {
            j10 = elapsedRealtimeNanos;
            z11 = false;
        } else {
            z11 = z8;
            j10 = elapsedRealtimeNanos;
        }
        switch (g02.f26a) {
            case 19:
                str = str8;
                z12 = z11;
                ByteBuffer c12 = W3.b.c((ByteBuffer) g02.f27b);
                D3.f fVar = (D3.f) g02.f29d;
                if (c12 == null) {
                    i11 = -1;
                } else {
                    ArrayList arrayList = (ArrayList) g02.f28c;
                    int size = arrayList.size();
                    int i29 = 0;
                    while (true) {
                        if (i29 < size) {
                            try {
                                i11 = ((A3.g) arrayList.get(i29)).b(c12, fVar);
                                if (i11 == -1) {
                                    i29++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            i11 = -1;
                        }
                    }
                }
                i12 = i11;
                break;
            case 20:
                str = str8;
                z12 = z11;
                x xVar2 = (x) ((com.bumptech.glide.load.data.h) g02.f27b).f14680b;
                xVar2.reset();
                i12 = E6.b.r((ArrayList) g02.f28c, xVar2, (D3.f) g02.f29d);
                break;
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) g02.f29d;
                D3.f fVar2 = (D3.f) g02.f27b;
                str = str8;
                ArrayList arrayList2 = (ArrayList) g02.f28c;
                int size2 = arrayList2.size();
                int i30 = 0;
                while (true) {
                    if (i30 >= size2) {
                        z12 = z11;
                        i12 = -1;
                        break;
                    } else {
                        int i31 = size2;
                        A3.g gVar = (A3.g) arrayList2.get(i30);
                        ArrayList arrayList3 = arrayList2;
                        try {
                            z12 = z11;
                            x xVar3 = new x(new FileInputStream(hVar.d().getFileDescriptor()), fVar2);
                            try {
                                i12 = gVar.c(xVar3, fVar2);
                                xVar3.n();
                                hVar.d();
                                if (i12 != -1) {
                                    break;
                                } else {
                                    i30++;
                                    size2 = i31;
                                    arrayList2 = arrayList3;
                                    z11 = z12;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                xVar = xVar3;
                                if (xVar != null) {
                                    xVar.n();
                                }
                                hVar.d();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            xVar = null;
                        }
                    }
                }
        }
        switch (i12) {
            case 3:
            case 4:
                i13 = 180;
                break;
            case 5:
            case 6:
                i13 = 90;
                break;
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                i13 = 270;
                break;
            default:
                i13 = 0;
                break;
        }
        switch (i12) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                z13 = true;
                break;
            default:
                z13 = false;
                break;
        }
        int i32 = i7 == Integer.MIN_VALUE ? (i13 == 90 || i13 == 270) ? i28 : i27 : i7;
        int i33 = i10 == Integer.MIN_VALUE ? (i13 == 90 || i13 == 270) ? i27 : i28 : i10;
        ImageHeaderParser$ImageType I6 = g02.I();
        int i34 = i12;
        boolean z17 = z13;
        if (i27 <= 0) {
            str2 = "x";
            str3 = "]";
            i14 = i33;
            str4 = ", density: ";
            str5 = ", target density: ";
            int i35 = i32;
            i15 = i28;
            i16 = i27;
            i17 = i35;
            i18 = 3;
        } else if (i28 <= 0) {
            str2 = "x";
            str3 = "]";
            i14 = i33;
            i18 = 3;
            str4 = ", density: ";
            str5 = ", target density: ";
            int i36 = i32;
            i15 = i28;
            i16 = i27;
            i17 = i36;
        } else {
            if (i13 == 90 || i13 == 270) {
                str6 = ", density: ";
                str7 = ", target density: ";
                i23 = i28;
                i24 = i27;
            } else {
                str6 = ", density: ";
                str7 = ", target density: ";
                i24 = i28;
                i23 = i27;
            }
            float b2 = oVar.b(i23, i24, i32, i33);
            if (b2 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + oVar + ", source: [" + i27 + "x" + i28 + "], target: [" + i32 + "x" + i33 + "]");
            }
            int i37 = i13;
            int a9 = oVar.a(i23, i24, i32, i33);
            if (a9 == 0) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f10 = i23;
            int i38 = i33;
            int i39 = i32;
            float f11 = i24;
            int i40 = i23 / ((int) ((b2 * f10) + 0.5d));
            int i41 = i24 / ((int) ((b2 * f11) + 0.5d));
            int max = Math.max(1, Integer.highestOneBit(a9 == 1 ? Math.max(i40, i41) : Math.min(i40, i41)));
            if (a9 == 1 && max < 1.0f / b2) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (I6 == ImageHeaderParser$ImageType.JPEG) {
                float min = Math.min(max, 8);
                floor = (int) Math.ceil(f10 / min);
                floor2 = (int) Math.ceil(f11 / min);
                int i42 = max / 8;
                if (i42 > 0) {
                    floor /= i42;
                    floor2 /= i42;
                }
            } else {
                if (I6 == ImageHeaderParser$ImageType.PNG || I6 == ImageHeaderParser$ImageType.PNG_A) {
                    aVar = aVar;
                    float f12 = max;
                    floor = (int) Math.floor(f10 / f12);
                    floor2 = (int) Math.floor(f11 / f12);
                } else if (I6.isWebp()) {
                    float f13 = max;
                    floor = Math.round(f10 / f13);
                    floor2 = Math.round(f11 / f13);
                } else if (i23 % max == 0 && i24 % max == 0) {
                    floor = i23 / max;
                    floor2 = i24 / max;
                } else {
                    options.inJustDecodeBounds = true;
                    aVar = aVar;
                    c(g02, options, pVar, aVar);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i43 = iArr2[0];
                    floor2 = iArr2[1];
                    floor = i43;
                }
                i17 = i39;
                i14 = i38;
                double b10 = oVar.b(floor, floor2, i17, i14);
                int i44 = max;
                options.inTargetDensity = (int) (((b10 / (r8 / r14)) * ((int) ((((int) Math.round((b10 > 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d)) * b10) + 0.5d))) + 0.5d);
                int round2 = (int) Math.round((b10 > 1.0d ? b10 : 1.0d / b10) * 2.147483647E9d);
                options.inDensity = round2;
                i25 = options.inTargetDensity;
                if (i25 > 0 || round2 <= 0 || i25 == round2) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    str4 = str6;
                    str5 = str7;
                    str2 = "x";
                    i15 = i28;
                    i16 = i27;
                } else {
                    str2 = "x";
                    i15 = i28;
                    i16 = i27;
                    StringBuilder q10 = h3.o.q(i16, i15, "Calculate scaling, source: [", str2, "], degreesToRotate: ");
                    q10.append(i37);
                    q10.append(", target: [");
                    q10.append(i17);
                    q10.append(str2);
                    q10.append(i14);
                    q10.append("], power of two scaled: [");
                    q10.append(floor);
                    q10.append(str2);
                    q10.append(floor2);
                    q10.append("], exact scale factor: ");
                    q10.append(b2);
                    q10.append(", power of 2 sample size: ");
                    q10.append(i44);
                    q10.append(", adjusted scale factor: ");
                    q10.append(b10);
                    str5 = str7;
                    q10.append(str5);
                    q10.append(options.inTargetDensity);
                    str4 = str6;
                    q10.append(str4);
                    q10.append(options.inDensity);
                    Log.v("Downsampler", q10.toString());
                }
                c10 = this.f5494e.c(i17, i14, z12, z17);
                if (c10) {
                    config3 = Bitmap.Config.HARDWARE;
                    options.inPreferredConfig = config3;
                    options.inMutable = false;
                }
                if (!c10) {
                    if (bVar != A3.b.f348a) {
                        try {
                            z14 = g02.I().hasAlpha();
                        } catch (IOException e2) {
                            if (Log.isLoggable("Downsampler", 3)) {
                                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e2);
                            }
                            z14 = false;
                        }
                        Bitmap.Config config4 = z14 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                        options.inPreferredConfig = config4;
                        if (config4 == Bitmap.Config.RGB_565) {
                            z15 = true;
                            options.inDither = true;
                        }
                    } else {
                        z15 = true;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    i19 = Build.VERSION.SDK_INT;
                    if (i16 >= 0 || i15 < 0 || !z10) {
                        int i45 = options.inTargetDensity;
                        float f14 = !((i45 > 0 || (i22 = options.inDensity) <= 0 || i45 == i22) ? false : z15) ? i45 / options.inDensity : 1.0f;
                        int i46 = options.inSampleSize;
                        float f15 = i46;
                        int i47 = i16;
                        int ceil = (int) Math.ceil(i16 / f15);
                        int ceil2 = (int) Math.ceil(i15 / f15);
                        int round3 = Math.round(ceil * f14);
                        round = Math.round(ceil2 * f14);
                        if (Log.isLoggable("Downsampler", 2)) {
                            i20 = round3;
                            i21 = i47;
                        } else {
                            StringBuilder q11 = h3.o.q(round3, round, "Calculated target [", str2, "] for source [");
                            i21 = i47;
                            q11.append(i21);
                            q11.append(str2);
                            q11.append(i15);
                            i20 = round3;
                            q11.append("], sampleSize: ");
                            q11.append(i46);
                            q11.append(", targetDensity: ");
                            q11.append(options.inTargetDensity);
                            q11.append(str4);
                            q11.append(options.inDensity);
                            q11.append(", density multiplier: ");
                            q11.append(f14);
                            Log.v("Downsampler", q11.toString());
                        }
                        i17 = i20;
                    } else {
                        round = i14;
                        i21 = i16;
                    }
                    if (i17 > 0 && round > 0) {
                        if (i19 < 26) {
                            Bitmap.Config config5 = options.inPreferredConfig;
                            config2 = Bitmap.Config.HARDWARE;
                            config = config5 != config2 ? options.outConfig : null;
                        }
                        if (config == null) {
                            config = options.inPreferredConfig;
                        }
                        options.inBitmap = aVar.d(i17, round, config);
                    }
                    if (mVar != null) {
                        if (i19 >= 28) {
                            if (mVar == A3.m.f361a) {
                                colorSpace3 = options.outColorSpace;
                                if (colorSpace3 != null) {
                                    colorSpace4 = options.outColorSpace;
                                    isWideGamut = colorSpace4.isWideGamut();
                                    if (isWideGamut) {
                                        z16 = true;
                                        colorSpace2 = ColorSpace.get(!z16 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                        options.inPreferredColorSpace = colorSpace2;
                                    }
                                }
                            }
                            z16 = false;
                            colorSpace2 = ColorSpace.get(!z16 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                            options.inPreferredColorSpace = colorSpace2;
                        } else if (i19 >= 26) {
                            named = ColorSpace.Named.SRGB;
                            colorSpace = ColorSpace.get(named);
                            options.inPreferredColorSpace = colorSpace;
                        }
                    }
                    c11 = c(g02, options, pVar, aVar);
                    pVar.f(aVar, c11);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Decoded " + d(c11) + " from [" + i21 + str2 + i15 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i7 + str2 + i10 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str5 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + W3.i.a(j10));
                    }
                    if (c11 != null) {
                        return null;
                    }
                    c11.setDensity(this.f5491b.densityDpi);
                    switch (i34) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            Matrix matrix = new Matrix();
                            switch (i34) {
                                case 2:
                                    matrix.setScale(-1.0f, 1.0f);
                                    break;
                                case 3:
                                    matrix.setRotate(180.0f);
                                    break;
                                case 4:
                                    matrix.setRotate(180.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case 5:
                                    matrix.setRotate(90.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case 6:
                                    matrix.setRotate(90.0f);
                                    break;
                                case 7:
                                    matrix.setRotate(-90.0f);
                                    matrix.postScale(-1.0f, 1.0f);
                                    break;
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    matrix.setRotate(-90.0f);
                                    break;
                            }
                            RectF rectF = new RectF(0.0f, 0.0f, c11.getWidth(), c11.getHeight());
                            matrix.mapRect(rectF);
                            f4 = aVar.f(Math.round(rectF.width()), Math.round(rectF.height()), c11.getConfig() != null ? c11.getConfig() : Bitmap.Config.ARGB_8888);
                            matrix.postTranslate(-rectF.left, -rectF.top);
                            f4.setHasAlpha(c11.hasAlpha());
                            A.a(c11, f4, matrix);
                            break;
                        default:
                            f4 = c11;
                            break;
                    }
                    if (!c11.equals(f4)) {
                        aVar.g(c11);
                    }
                    return f4;
                }
                z15 = true;
                i19 = Build.VERSION.SDK_INT;
                if (i16 >= 0) {
                }
                int i452 = options.inTargetDensity;
                if (!((i452 > 0 || (i22 = options.inDensity) <= 0 || i452 == i22) ? false : z15)) {
                }
                int i462 = options.inSampleSize;
                float f152 = i462;
                int i472 = i16;
                int ceil3 = (int) Math.ceil(i16 / f152);
                int ceil22 = (int) Math.ceil(i15 / f152);
                int round32 = Math.round(ceil3 * f14);
                round = Math.round(ceil22 * f14);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                i17 = i20;
                if (i17 > 0) {
                    if (i19 < 26) {
                    }
                    if (config == null) {
                    }
                    options.inBitmap = aVar.d(i17, round, config);
                }
                if (mVar != null) {
                }
                c11 = c(g02, options, pVar, aVar);
                pVar.f(aVar, c11);
                if (Log.isLoggable("Downsampler", 2)) {
                }
                if (c11 != null) {
                }
            }
            i17 = i39;
            i14 = i38;
            aVar = aVar;
            double b102 = oVar.b(floor, floor2, i17, i14);
            int i442 = max;
            options.inTargetDensity = (int) (((b102 / (r8 / r14)) * ((int) ((((int) Math.round((b102 > 1.0d ? b102 : 1.0d / b102) * 2.147483647E9d)) * b102) + 0.5d))) + 0.5d);
            int round22 = (int) Math.round((b102 > 1.0d ? b102 : 1.0d / b102) * 2.147483647E9d);
            options.inDensity = round22;
            i25 = options.inTargetDensity;
            if (i25 > 0) {
            }
            options.inTargetDensity = 0;
            options.inDensity = 0;
            if (Log.isLoggable("Downsampler", 2)) {
            }
            c10 = this.f5494e.c(i17, i14, z12, z17);
            if (c10) {
            }
            if (!c10) {
            }
            z15 = true;
            i19 = Build.VERSION.SDK_INT;
            if (i16 >= 0) {
            }
            int i4522 = options.inTargetDensity;
            if (!((i4522 > 0 || (i22 = options.inDensity) <= 0 || i4522 == i22) ? false : z15)) {
            }
            int i4622 = options.inSampleSize;
            float f1522 = i4622;
            int i4722 = i16;
            int ceil32 = (int) Math.ceil(i16 / f1522);
            int ceil222 = (int) Math.ceil(i15 / f1522);
            int round322 = Math.round(ceil32 * f14);
            round = Math.round(ceil222 * f14);
            if (Log.isLoggable("Downsampler", 2)) {
            }
            i17 = i20;
            if (i17 > 0) {
            }
            if (mVar != null) {
            }
            c11 = c(g02, options, pVar, aVar);
            pVar.f(aVar, c11);
            if (Log.isLoggable("Downsampler", 2)) {
            }
            if (c11 != null) {
            }
        }
        if (Log.isLoggable("Downsampler", i18)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + I6 + " with target [" + i17 + str2 + i14 + str3);
        }
        c10 = this.f5494e.c(i17, i14, z12, z17);
        if (c10) {
        }
        if (!c10) {
        }
        z15 = true;
        i19 = Build.VERSION.SDK_INT;
        if (i16 >= 0) {
        }
        int i45222 = options.inTargetDensity;
        if (!((i45222 > 0 || (i22 = options.inDensity) <= 0 || i45222 == i22) ? false : z15)) {
        }
        int i46222 = options.inSampleSize;
        float f15222 = i46222;
        int i47222 = i16;
        int ceil322 = (int) Math.ceil(i16 / f15222);
        int ceil2222 = (int) Math.ceil(i15 / f15222);
        int round3222 = Math.round(ceil322 * f14);
        round = Math.round(ceil2222 * f14);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        i17 = i20;
        if (i17 > 0) {
        }
        if (mVar != null) {
        }
        c11 = c(g02, options, pVar, aVar);
        pVar.f(aVar, c11);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (c11 != null) {
        }
    }
}
