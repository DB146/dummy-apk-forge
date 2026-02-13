package o9;

import A4.h;
import h3.o;
import java.util.Arrays;
import m9.C1649f;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f22130a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f22131b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f22132c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f22133d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(h hVar, boolean z8) {
        int i7 = hVar.f385b;
        int i10 = hVar.f386c;
        int i11 = z8 ? i10 : i7;
        if (!z8) {
            i7 = i10;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b2 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i7; i15++) {
                byte[][] bArr = (byte[][]) hVar.f387d;
                byte b10 = z8 ? bArr[i13][i15] : bArr[i15][i13];
                if (b10 == b2) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    i14 = 1;
                    b2 = b10;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x01fe. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(V8.a aVar, int i7, C1649f c1649f, int i10, h hVar) {
        int i11;
        int i12;
        int i13;
        boolean z8;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        byte[][] bArr = (byte[][]) hVar.f387d;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = f22130a[0].length;
        e(0, 0, hVar);
        int i18 = hVar.f385b;
        int i19 = i18 - length;
        e(i19, 0, hVar);
        e(0, i19, hVar);
        d(0, 7, hVar);
        int i20 = i18 - 8;
        d(i20, 7, hVar);
        d(0, i20, hVar);
        f(7, 0, hVar);
        int i21 = hVar.f386c;
        int i22 = i21 - 8;
        f(i22, 0, hVar);
        int i23 = i21 - 7;
        f(7, i23, hVar);
        if (hVar.r(8, i22) == 0) {
            throw new Exception();
        }
        hVar.t(8, i22, 1);
        int i24 = c1649f.f20808a;
        if (i24 >= 2) {
            int[] iArr2 = f22132c[i24 - 1];
            int length2 = iArr2.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = iArr2[i25];
                if (i26 >= 0) {
                    int length3 = iArr2.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        int i28 = length2;
                        int i29 = iArr2[i27];
                        if (i29 < 0 || !g(hVar.r(i29, i26))) {
                            i17 = i26;
                            iArr = iArr2;
                        } else {
                            int i30 = i29 - 2;
                            int i31 = i26 - 2;
                            i17 = i26;
                            iArr = iArr2;
                            int i32 = 5;
                            int i33 = 0;
                            while (i33 < i32) {
                                int[] iArr3 = f22131b[i33];
                                int i34 = length3;
                                int i35 = 0;
                                while (i35 < i32) {
                                    hVar.t(i30 + i35, i31 + i33, iArr3[i35]);
                                    i35++;
                                    i32 = 5;
                                    i30 = i30;
                                }
                                i33++;
                                i32 = 5;
                                length3 = i34;
                            }
                        }
                        i27++;
                        length2 = i28;
                        i26 = i17;
                        iArr2 = iArr;
                        length3 = length3;
                    }
                }
                i25++;
                length2 = length2;
                iArr2 = iArr2;
            }
        }
        int i36 = 8;
        while (true) {
            i11 = 6;
            if (i36 >= i20) {
                break;
            }
            int i37 = i36 + 1;
            int i38 = i37 % 2;
            if (g(hVar.r(i36, 6))) {
                hVar.t(i36, 6, i38);
            }
            if (g(hVar.r(6, i36))) {
                hVar.t(6, i36, i38);
            }
            i36 = i37;
        }
        V8.a aVar2 = new V8.a();
        if (i10 < 0 || i10 >= 8) {
            throw new Exception("Invalid mask pattern");
        }
        int i39 = 1;
        if (i7 != 1) {
            i39 = 2;
            if (i7 == 2) {
                i39 = 0;
            } else if (i7 == 3) {
                i39 = 3;
            } else if (i7 != 4) {
                throw null;
            }
        }
        int i40 = (i39 << 3) | i10;
        aVar2.b(i40, 5);
        aVar2.b(c(i40, 1335), 10);
        V8.a aVar3 = new V8.a();
        aVar3.b(21522, 15);
        if (aVar2.f10193b != aVar3.f10193b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i41 = 0;
        while (true) {
            int[] iArr4 = aVar2.f10192a;
            if (i41 >= iArr4.length) {
                break;
            }
            iArr4[i41] = iArr4[i41] ^ aVar3.f10192a[i41];
            i41++;
        }
        if (aVar2.f10193b != 15) {
            throw new Exception("should not happen but we got: " + aVar2.f10193b);
        }
        int i42 = 0;
        while (true) {
            int i43 = aVar2.f10193b;
            if (i42 >= i43) {
                break;
            }
            boolean d10 = aVar2.d((i43 - 1) - i42);
            int[] iArr5 = f22133d[i42];
            int i44 = iArr5[0];
            byte[] bArr3 = bArr[iArr5[1]];
            byte b2 = d10 ? (byte) 1 : (byte) 0;
            bArr3[i44] = b2;
            if (i42 < 8) {
                i16 = (i18 - i42) - 1;
                i15 = 8;
            } else {
                i15 = (i42 - 8) + i23;
                i16 = 8;
            }
            bArr[i15][i16] = b2;
            i42++;
        }
        if (i24 >= 7) {
            V8.a aVar4 = new V8.a();
            aVar4.b(i24, 6);
            aVar4.b(c(i24, 7973), 12);
            if (aVar4.f10193b != 18) {
                throw new Exception("should not happen but we got: " + aVar4.f10193b);
            }
            int i45 = 17;
            for (int i46 = 0; i46 < 6; i46++) {
                for (int i47 = 0; i47 < 3; i47++) {
                    boolean d11 = aVar4.d(i45);
                    i45--;
                    int i48 = (i21 - 11) + i47;
                    byte[] bArr4 = bArr[i48];
                    byte b10 = d11 ? (byte) 1 : (byte) 0;
                    bArr4[i46] = b10;
                    bArr[i46][i48] = b10;
                }
            }
        }
        int i49 = i18 - 1;
        int i50 = i21 - 1;
        int i51 = 0;
        int i52 = -1;
        while (i49 > 0) {
            if (i49 == i11) {
                i49--;
            }
            while (i50 >= 0 && i50 < i21) {
                for (int i53 = 0; i53 < 2; i53++) {
                    int i54 = i49 - i53;
                    if (g(hVar.r(i54, i50))) {
                        if (i51 < aVar.f10193b) {
                            boolean d12 = aVar.d(i51);
                            i51++;
                            i12 = d12;
                        } else {
                            i12 = 0;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i13 = i50 + i54;
                                    z8 = true;
                                    i14 = i13 & 1;
                                    if (i14 != 0 ? z8 : false) {
                                        i12 = ~i12;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i14 = i50 & 1;
                                    z8 = true;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 2:
                                    i14 = i54 % 3;
                                    z8 = true;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 3:
                                    i14 = (i50 + i54) % 3;
                                    z8 = true;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 4:
                                    z8 = true;
                                    i14 = ((i54 / 3) + (i50 / 2)) & 1;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 5:
                                    int i55 = i50 * i54;
                                    i14 = (i55 % 3) + (i55 & 1);
                                    z8 = true;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 6:
                                    int i56 = i50 * i54;
                                    i14 = ((i56 % 3) + (i56 & 1)) & 1;
                                    z8 = true;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                case 7:
                                    z8 = true;
                                    i13 = ((i50 * i54) % 3) + ((i50 + i54) & 1);
                                    i14 = i13 & 1;
                                    if (i14 != 0 ? z8 : false) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(o.l(i10, "Invalid mask pattern: "));
                            }
                        }
                        bArr[i50][i54] = (byte) i12;
                    }
                }
                i50 += i52;
            }
            i52 = -i52;
            i50 += i52;
            i49 -= 2;
            i11 = 6;
        }
        if (i51 == aVar.f10193b) {
            return;
        }
        throw new Exception("Not all bits consumed: " + i51 + '/' + aVar.f10193b);
    }

    public static int c(int i7, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
        int i11 = 32 - numberOfLeadingZeros;
        int i12 = i7 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i12) >= i11) {
            i12 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i12)) - i11);
        }
        return i12;
    }

    public static void d(int i7, int i10, h hVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i7 + i11;
            if (!g(hVar.r(i12, i10))) {
                throw new Exception();
            }
            hVar.t(i12, i10, 0);
        }
    }

    public static void e(int i7, int i10, h hVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = f22130a[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                hVar.t(i7 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i7, int i10, h hVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (!g(hVar.r(i7, i12))) {
                throw new Exception();
            }
            hVar.t(i7, i12, 0);
        }
    }

    public static boolean g(int i7) {
        return i7 == -1;
    }
}
