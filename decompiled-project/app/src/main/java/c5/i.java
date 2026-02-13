package c5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import n5.D;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14384h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14385i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f14386a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14387b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f14388c;

    /* renamed from: d, reason: collision with root package name */
    public final C0909c f14389d;

    /* renamed from: e, reason: collision with root package name */
    public final C0908b f14390e;

    /* renamed from: f, reason: collision with root package name */
    public final h f14391f;
    public Bitmap g;

    public i(int i7, int i10) {
        Paint paint = new Paint();
        this.f14386a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f14387b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f14388c = new Canvas();
        this.f14389d = new C0909c(719, 575, 0, 719, 0, 575);
        this.f14390e = new C0908b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f14391f = new h(i7, i10);
    }

    public static byte[] a(int i7, int i10, b5.f fVar) {
        byte[] bArr = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) fVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i7 & 136;
                if (i10 == 0) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i7] = d(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i7, int i10, int i11, int i12) {
        return (i7 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:89:0x0172->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i7, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i12;
        int i13;
        int i14;
        char c10;
        char c11;
        int i15;
        int i16;
        int i17;
        byte[] bArr4;
        int i18;
        boolean z8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        b5.f fVar = new b5.f(bArr, bArr.length);
        int i26 = i10;
        int i27 = i11;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (fVar.b() != 0) {
            int i28 = 8;
            int i29 = fVar.i(8);
            if (i29 != 240) {
                int i30 = 1;
                int i31 = 3;
                int i32 = 4;
                switch (i29) {
                    case 16:
                        int i33 = 1;
                        if (i7 == 3) {
                            bArr3 = bArr5 == null ? f14385i : bArr5;
                        } else if (i7 == 2) {
                            bArr3 = bArr7 == null ? f14384h : bArr7;
                        } else {
                            bArr2 = null;
                            i12 = i26;
                            i13 = 0;
                            while (true) {
                                i14 = fVar.i(2);
                                if (i14 == 0) {
                                    i16 = i33;
                                    i15 = i13;
                                } else if (fVar.h()) {
                                    i15 = i13;
                                    i16 = fVar.i(3) + 3;
                                    i14 = fVar.i(2);
                                } else if (fVar.h()) {
                                    i16 = i33;
                                    i15 = i13;
                                    i14 = 0;
                                } else {
                                    int i34 = fVar.i(2);
                                    if (i34 == 0) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i15 = i33;
                                        i14 = 0;
                                        i16 = 0;
                                    } else if (i34 == i33) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i15 = i13;
                                        i16 = 2;
                                        i14 = 0;
                                    } else if (i34 == 2) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i15 = i13;
                                        i16 = fVar.i(4) + 12;
                                        i14 = fVar.i(2);
                                    } else if (i34 != 3) {
                                        i15 = i13;
                                        i14 = 0;
                                        i16 = 0;
                                    } else {
                                        c11 = '\b';
                                        i15 = i13;
                                        i16 = fVar.i(8) + 29;
                                        i14 = fVar.i(2);
                                        c10 = 4;
                                    }
                                    if (i16 != 0 || paint == null) {
                                        i17 = i12;
                                    } else {
                                        if (bArr2 != 0) {
                                            i14 = bArr2[i14];
                                        }
                                        paint.setColor(iArr[i14]);
                                        i17 = i12;
                                        canvas.drawRect(i12, i27, i12 + i16, i27 + 1, paint);
                                    }
                                    i12 = i17 + i16;
                                    if (i15 != 0) {
                                        fVar.c();
                                        break;
                                    } else {
                                        i13 = i15;
                                        i33 = 1;
                                    }
                                }
                                c10 = 4;
                                c11 = '\b';
                                if (i16 != 0) {
                                }
                                i17 = i12;
                                i12 = i17 + i16;
                                if (i15 != 0) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i12 = i26;
                        i13 = 0;
                        while (true) {
                            i14 = fVar.i(2);
                            if (i14 == 0) {
                            }
                            c10 = 4;
                            c11 = '\b';
                            if (i16 != 0) {
                            }
                            i17 = i12;
                            i12 = i17 + i16;
                            if (i15 != 0) {
                            }
                            i13 = i15;
                            i33 = 1;
                        }
                    case 17:
                        if (i7 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i12 = i26;
                        boolean z10 = false;
                        while (true) {
                            int i35 = fVar.i(i32);
                            if (i35 != 0) {
                                i18 = 1;
                                z8 = z10;
                            } else if (fVar.h()) {
                                if (fVar.h()) {
                                    int i36 = fVar.i(2);
                                    if (i36 == 0) {
                                        i18 = 1;
                                        z8 = z10;
                                    } else if (i36 == 1) {
                                        z8 = z10;
                                        i18 = 2;
                                    } else if (i36 == 2) {
                                        i19 = fVar.i(i32) + 9;
                                        i20 = fVar.i(i32);
                                    } else if (i36 != i31) {
                                        z8 = z10;
                                        i35 = 0;
                                        i18 = 0;
                                    } else {
                                        i19 = fVar.i(i28) + 25;
                                        i20 = fVar.i(i32);
                                    }
                                    i35 = 0;
                                } else {
                                    i19 = fVar.i(2) + i32;
                                    i20 = fVar.i(i32);
                                }
                                z8 = z10;
                                i18 = i19;
                                i35 = i20;
                            } else {
                                int i37 = fVar.i(i31);
                                if (i37 != 0) {
                                    z8 = z10;
                                    i18 = i37 + 2;
                                    i35 = 0;
                                } else {
                                    z8 = true;
                                    i35 = 0;
                                    i18 = 0;
                                }
                            }
                            if (i18 == 0 || paint == null) {
                                i21 = i31;
                                i22 = i12;
                            } else {
                                if (bArr4 != 0) {
                                    i35 = bArr4[i35];
                                }
                                paint.setColor(iArr[i35]);
                                i21 = i31;
                                i22 = i12;
                                canvas.drawRect(i12, i27, i12 + i18, i27 + 1, paint);
                            }
                            i12 = i22 + i18;
                            if (z8) {
                                fVar.c();
                                break;
                            } else {
                                i31 = i21;
                                z10 = z8;
                                i32 = 4;
                                i28 = 8;
                            }
                        }
                    case 18:
                        int i38 = i26;
                        int i39 = 0;
                        while (true) {
                            int i40 = fVar.i(8);
                            if (i40 != 0) {
                                i23 = i39;
                                i24 = i30;
                            } else if (fVar.h()) {
                                i23 = i39;
                                i24 = fVar.i(7);
                                i40 = fVar.i(8);
                            } else {
                                int i41 = fVar.i(7);
                                if (i41 != 0) {
                                    i23 = i39;
                                    i24 = i41;
                                    i40 = 0;
                                } else {
                                    i23 = i30;
                                    i40 = 0;
                                    i24 = 0;
                                }
                            }
                            if (i24 == 0 || paint == null) {
                                i25 = i30;
                            } else {
                                paint.setColor(iArr[i40]);
                                i25 = i30;
                                canvas.drawRect(i38, i27, i38 + i24, i27 + 1, paint);
                            }
                            i38 += i24;
                            if (i23 != 0) {
                                i26 = i38;
                                continue;
                            } else {
                                i30 = i25;
                                i39 = i23;
                            }
                        }
                    default:
                        switch (i29) {
                            case 32:
                                bArr7 = a(4, 4, fVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, fVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, fVar);
                                break;
                            default:
                                continue;
                        }
                }
                i26 = i12;
            } else {
                i27 += 2;
                i26 = i10;
            }
        }
    }

    public static C0908b f(b5.f fVar, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = fVar.i(8);
        fVar.s(8);
        int i17 = 2;
        int i18 = i7 - 2;
        int i19 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b2 = b();
        int[] c10 = c();
        while (i18 > 0) {
            int i20 = fVar.i(i15);
            int i21 = fVar.i(i15);
            int[] iArr2 = (i21 & 128) != 0 ? iArr : (i21 & 64) != 0 ? b2 : c10;
            if ((i21 & 1) != 0) {
                i13 = fVar.i(i15);
                i14 = fVar.i(i15);
                i10 = fVar.i(i15);
                i12 = fVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i22 = fVar.i(6) << i17;
                int i23 = fVar.i(4) << 4;
                i10 = fVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = fVar.i(i17) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i19;
                i10 = i14;
                i12 = 255;
            }
            double d10 = i13;
            double d11 = i14 - 128;
            double d12 = i10 - 128;
            iArr2[i20] = d((byte) (255 - (i12 & 255)), D.i((int) ((1.402d * d11) + d10), 0, 255), D.i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), D.i((int) ((d12 * 1.772d) + d10), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            c10 = c10;
            i15 = 8;
            i17 = 2;
        }
        return new C0908b(i16, iArr, b2, c10);
    }

    public static C0910d g(b5.f fVar) {
        byte[] bArr;
        int i7 = fVar.i(16);
        fVar.s(4);
        int i10 = fVar.i(2);
        boolean h10 = fVar.h();
        fVar.s(1);
        byte[] bArr2 = D.f21146f;
        if (i10 == 1) {
            fVar.s(fVar.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = fVar.i(16);
            int i12 = fVar.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                fVar.k(i11, bArr2);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                fVar.k(i12, bArr);
                return new C0910d(i7, h10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C0910d(i7, h10, bArr2, bArr);
    }
}
