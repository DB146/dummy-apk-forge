package o4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import m4.C1586o0;
import n5.AbstractC1705a;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1787a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21816a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21817b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21818c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21819d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21820e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21821f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f21822h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f21823i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f21824l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f21825m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f21826n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f21827o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f21828p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f21829q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f21830r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f21831s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i7, int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < 13; i12++) {
            if (i7 == f21816a[i12]) {
                i11 = i12;
            }
        }
        int i13 = -1;
        for (int i14 = 0; i14 < 16; i14++) {
            if (i10 == f21817b[i14]) {
                i13 = i14;
            }
        }
        if (i7 == -1 || i13 == -1) {
            throw new IllegalArgumentException(X.c.e(i7, i10, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i11, i13);
    }

    public static byte[] b(int i7, int i10, int i11) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int d(int i7, int i10) {
        int i11 = i10 / 2;
        if (i7 < 0 || i7 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f21819d[i7];
        if (i12 == 44100) {
            return ((i10 % 2) + f21822h[i11]) * 2;
        }
        int i13 = g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void e(int i7, n5.v vVar) {
        vVar.D(7);
        byte[] bArr = vVar.f21229a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int f(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i7 & (-2097152)) == -2097152) || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f21826n[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i7 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f21827o[i12 - 1] : f21828p[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f21829q[i12 - 1] : f21830r[i12 - 1] : f21831s[i12 - 1];
        if (i10 == 3) {
            return X.c.b(i16, 144, i14, i15);
        }
        return X.c.b(i11 == 1 ? 72 : 144, i16, i14, i15);
    }

    public static long g(byte b2, byte b10) {
        int i7;
        int i10 = b2 & 255;
        int i11 = b2 & 3;
        if (i11 != 0) {
            i7 = 2;
            if (i11 != 1 && i11 != 2) {
                i7 = b10 & 63;
            }
        } else {
            i7 = 1;
        }
        int i12 = i10 >> 3;
        return i7 * (i12 >= 16 ? 2500 << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int h(b5.f fVar) {
        int i7 = fVar.i(4);
        if (i7 == 15) {
            if (fVar.b() >= 24) {
                return fVar.i(24);
            }
            throw C1586o0.a("AAC header insufficient data", null);
        }
        if (i7 < 13) {
            return f21816a[i7];
        }
        throw C1586o0.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static C1788b i(b5.f fVar) {
        int d10;
        int i7;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int g2 = fVar.g();
        fVar.s(40);
        boolean z8 = fVar.i(5) > 10;
        fVar.p(g2);
        int[] iArr = f21821f;
        int[] iArr2 = f21819d;
        if (z8) {
            fVar.s(16);
            int i23 = fVar.i(2);
            if (i23 == 0) {
                r9 = 0;
            } else if (i23 == 1) {
                r9 = 1;
            } else if (i23 == 2) {
                r9 = 2;
            }
            fVar.s(3);
            d10 = (fVar.i(11) + 1) * 2;
            int i24 = fVar.i(2);
            if (i24 == 3) {
                i15 = f21820e[fVar.i(2)];
                i14 = 3;
                i16 = 6;
            } else {
                i14 = fVar.i(2);
                int i25 = f21818c[i14];
                i15 = iArr2[i24];
                i16 = i25;
            }
            int i26 = i16 * 256;
            int i27 = (d10 * i15) / (i16 * 32);
            int i28 = fVar.i(3);
            boolean h10 = fVar.h();
            int i29 = iArr[i28] + (h10 ? 1 : 0);
            fVar.s(10);
            if (fVar.h()) {
                fVar.s(8);
            }
            if (i28 == 0) {
                fVar.s(5);
                if (fVar.h()) {
                    fVar.s(8);
                }
            }
            if (r9 == 1 && fVar.h()) {
                fVar.s(16);
            }
            if (fVar.h()) {
                if (i28 > 2) {
                    fVar.s(2);
                }
                if ((i28 & 1) == 0 || i28 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    fVar.s(6);
                }
                if ((i28 & 4) != 0) {
                    fVar.s(i19);
                }
                if (h10 && fVar.h()) {
                    fVar.s(5);
                }
                if (r9 == 0) {
                    if (fVar.h()) {
                        i20 = 6;
                        fVar.s(6);
                    } else {
                        i20 = 6;
                    }
                    if (i28 == 0 && fVar.h()) {
                        fVar.s(i20);
                    }
                    if (fVar.h()) {
                        fVar.s(i20);
                    }
                    int i30 = fVar.i(2);
                    if (i30 == 1) {
                        fVar.s(5);
                        i22 = 2;
                    } else {
                        if (i30 == 2) {
                            fVar.s(12);
                        } else if (i30 == 3) {
                            int i31 = fVar.i(5);
                            if (fVar.h()) {
                                fVar.s(5);
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    fVar.s(4);
                                }
                                if (fVar.h()) {
                                    if (fVar.h()) {
                                        fVar.s(4);
                                    }
                                    if (fVar.h()) {
                                        fVar.s(4);
                                    }
                                }
                            }
                            if (fVar.h()) {
                                fVar.s(5);
                                if (fVar.h()) {
                                    fVar.s(7);
                                    if (fVar.h()) {
                                        i21 = 8;
                                        fVar.s(8);
                                        i22 = 2;
                                        fVar.s((i31 + 2) * i21);
                                        fVar.c();
                                    }
                                }
                            }
                            i21 = 8;
                            i22 = 2;
                            fVar.s((i31 + 2) * i21);
                            fVar.c();
                        }
                        i22 = 2;
                    }
                    if (i28 < i22) {
                        if (fVar.h()) {
                            fVar.s(14);
                        }
                        if (i28 == 0 && fVar.h()) {
                            fVar.s(14);
                        }
                    }
                    if (fVar.h()) {
                        if (i14 == 0) {
                            fVar.s(5);
                        } else {
                            for (int i32 = 0; i32 < i16; i32++) {
                                if (fVar.h()) {
                                    fVar.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (fVar.h()) {
                fVar.s(5);
                if (i28 == 2) {
                    fVar.s(4);
                }
                if (i28 >= 6) {
                    fVar.s(2);
                }
                if (fVar.h()) {
                    i18 = 8;
                    fVar.s(8);
                } else {
                    i18 = 8;
                }
                if (i28 == 0 && fVar.h()) {
                    fVar.s(i18);
                }
                if (i24 < 3) {
                    fVar.r();
                }
            }
            if (r9 == 0 && i14 != 3) {
                fVar.r();
            }
            if (r9 == 2 && (i14 == 3 || fVar.h())) {
                i17 = 6;
                fVar.s(6);
            } else {
                i17 = 6;
            }
            str = (fVar.h() && fVar.i(i17) == 1 && fVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i29;
            i12 = i15;
            i13 = i26;
            i11 = i27;
        } else {
            fVar.s(32);
            int i33 = fVar.i(2);
            String str2 = i33 == 3 ? null : "audio/ac3";
            int i34 = fVar.i(6);
            int i35 = g[i34 / 2] * 1000;
            d10 = d(i33, i34);
            fVar.s(8);
            int i36 = fVar.i(3);
            if ((i36 & 1) == 0 || i36 == 1) {
                i7 = 2;
            } else {
                i7 = 2;
                fVar.s(2);
            }
            if ((i36 & 4) != 0) {
                fVar.s(i7);
            }
            if (i36 == i7) {
                fVar.s(i7);
            }
            r9 = i33 < 3 ? iArr2[i33] : -1;
            i10 = iArr[i36] + (fVar.h() ? 1 : 0);
            str = str2;
            i11 = i35;
            i12 = r9;
            i13 = 1536;
        }
        return new C1788b(str, i10, i12, d10, i13, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.h() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.i(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.i(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.s(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.h() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.i(4);
        r8 = o4.AbstractC1787a.f21823i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return new E3.h(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.i(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.i(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static E3.h j(b5.f fVar) {
        int i7;
        int i10 = fVar.i(16);
        int i11 = fVar.i(16);
        if (i11 == 65535) {
            i11 = fVar.i(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i12 = i11 + i7;
        if (i10 == 44097) {
            i12 += 2;
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [o4.M, java.lang.Object] */
    public static M k(b5.f fVar, boolean z8) {
        int i7 = fVar.i(5);
        if (i7 == 31) {
            i7 = fVar.i(6) + 32;
        }
        int h10 = h(fVar);
        int i10 = fVar.i(4);
        String l10 = h3.o.l(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            h10 = h(fVar);
            int i11 = fVar.i(5);
            if (i11 == 31) {
                i11 = fVar.i(6) + 32;
            }
            i7 = i11;
            if (i7 == 22) {
                i10 = fVar.i(4);
            }
        }
        if (z8) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C1586o0.c("Unsupported audio object type: " + i7);
                }
            }
            if (fVar.h()) {
                AbstractC1705a.S("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.h()) {
                fVar.s(14);
            }
            boolean h11 = fVar.h();
            if (i10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i7 == 6 || i7 == 20) {
                fVar.s(3);
            }
            if (h11) {
                if (i7 == 22) {
                    fVar.s(16);
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    fVar.s(3);
                }
                fVar.s(1);
            }
            switch (i7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i12 = fVar.i(2);
                    if (i12 == 2 || i12 == 3) {
                        throw C1586o0.c("Unsupported epConfig: " + i12);
                    }
            }
        }
        int i13 = f21817b[i10];
        if (i13 == -1) {
            throw C1586o0.a(null, null);
        }
        ?? obj = new Object();
        obj.f21766a = h10;
        obj.f21767b = i13;
        obj.f21768c = l10;
        return obj;
    }

    public static int l(int i7) {
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i7 >>> 12) & 15;
        int i13 = (i7 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
