package d9;

import P8.n;
import P8.o;
import P8.p;
import java.util.Arrays;
import java.util.EnumMap;

/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1059a extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f16567d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16568e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f16569f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f16570a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public int[] f16571b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    public int f16572c = 0;

    public static boolean g(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        int i10;
        int[] iArr;
        int i11;
        int i12 = 0;
        Arrays.fill(this.f16571b, 0);
        this.f16572c = 0;
        int f4 = aVar.f(0);
        int i13 = aVar.f10193b;
        if (f4 >= i13) {
            throw P8.j.a();
        }
        int i14 = 1;
        int i15 = 0;
        boolean z8 = true;
        while (f4 < i13) {
            if (aVar.d(f4) != z8) {
                i15++;
            } else {
                int[] iArr2 = this.f16571b;
                int i16 = this.f16572c;
                iArr2[i16] = i15;
                int i17 = i16 + 1;
                this.f16572c = i17;
                if (i17 >= iArr2.length) {
                    int[] iArr3 = new int[i17 * 2];
                    System.arraycopy(iArr2, 0, iArr3, 0, i17);
                    this.f16571b = iArr3;
                }
                z8 = !z8;
                i15 = 1;
            }
            f4++;
        }
        int[] iArr4 = this.f16571b;
        int i18 = this.f16572c;
        iArr4[i18] = i15;
        int i19 = i18 + 1;
        this.f16572c = i19;
        if (i19 >= iArr4.length) {
            int[] iArr5 = new int[i19 * 2];
            System.arraycopy(iArr4, 0, iArr5, 0, i19);
            this.f16571b = iArr5;
        }
        int i20 = 1;
        while (i20 < this.f16572c) {
            int h10 = h(i20);
            if (h10 != -1) {
                char[] cArr = f16567d;
                char c10 = cArr[h10];
                char[] cArr2 = f16569f;
                if (g(cArr2, c10)) {
                    int i21 = i12;
                    for (int i22 = i20; i22 < i20 + 7; i22++) {
                        i21 += this.f16571b[i22];
                    }
                    if (i20 == i14 || this.f16571b[i20 - 1] >= i21 / 2) {
                        StringBuilder sb2 = this.f16570a;
                        sb2.setLength(i12);
                        int i23 = i20;
                        while (true) {
                            int h11 = h(i23);
                            if (h11 == -1) {
                                throw P8.j.a();
                            }
                            sb2.append((char) h11);
                            i10 = i23 + 8;
                            if ((sb2.length() <= i14 || !g(cArr2, cArr[h11])) && i10 < this.f16572c) {
                                i23 = i10;
                                i14 = i14;
                                i12 = i12;
                            }
                        }
                        int i24 = i23 + 7;
                        int i25 = this.f16571b[i24];
                        int i26 = i12;
                        for (int i27 = -8; i27 < -1; i27++) {
                            i26 += this.f16571b[i10 + i27];
                        }
                        if (i10 < this.f16572c && i25 < i26 / 2) {
                            throw P8.j.a();
                        }
                        int[] iArr6 = new int[4];
                        iArr6[i12] = i12;
                        iArr6[i14] = i12;
                        iArr6[2] = i12;
                        iArr6[3] = i12;
                        int[] iArr7 = new int[4];
                        iArr7[i12] = i12;
                        iArr7[i14] = i12;
                        iArr7[2] = i12;
                        iArr7[3] = i12;
                        int length = sb2.length() - i14;
                        int i28 = i20;
                        int i29 = i12;
                        while (true) {
                            iArr = f16568e;
                            if (i29 > length) {
                                break;
                            }
                            int i30 = iArr[sb2.charAt(i29)];
                            for (int i31 = 6; i31 >= 0; i31--) {
                                int i32 = ((i30 & 1) * 2) + (i31 & 1);
                                iArr6[i32] = iArr6[i32] + this.f16571b[i28 + i31];
                                iArr7[i32] = iArr7[i32] + i14;
                                i30 >>= 1;
                            }
                            i28 += 8;
                            i29++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i33 = i12;
                        for (int i34 = 2; i33 < i34; i34 = 2) {
                            fArr2[i33] = 0.0f;
                            int i35 = i33 + 2;
                            float f10 = iArr6[i35];
                            float f11 = iArr7[i35];
                            float f12 = ((f10 / f11) + (iArr6[i33] / iArr7[i33])) / 2.0f;
                            fArr2[i35] = f12;
                            fArr[i33] = f12;
                            fArr[i35] = ((f10 * 2.0f) + 1.5f) / f11;
                            i33++;
                        }
                        int i36 = i20;
                        for (int i37 = 0; i37 <= length; i37++) {
                            int i38 = iArr[sb2.charAt(i37)];
                            for (int i39 = 6; i39 >= 0; i39--) {
                                int i40 = ((i38 & 1) * 2) + (i39 & 1);
                                float f13 = this.f16571b[i36 + i39];
                                if (f13 < fArr2[i40] || f13 > fArr[i40]) {
                                    throw P8.j.a();
                                }
                                i38 >>= 1;
                            }
                            i36 += 8;
                        }
                        for (int i41 = 0; i41 < sb2.length(); i41++) {
                            sb2.setCharAt(i41, cArr[sb2.charAt(i41)]);
                        }
                        if (!g(cArr2, sb2.charAt(0))) {
                            throw P8.j.a();
                        }
                        if (!g(cArr2, sb2.charAt(sb2.length() - 1))) {
                            throw P8.j.a();
                        }
                        if (sb2.length() <= 3) {
                            throw P8.j.a();
                        }
                        if (enumMap == null || !enumMap.containsKey(P8.d.f8203w)) {
                            sb2.deleteCharAt(sb2.length() - 1);
                            i11 = 0;
                            sb2.deleteCharAt(0);
                        } else {
                            i11 = 0;
                        }
                        for (int i42 = i11; i42 < i20; i42++) {
                            i11 += this.f16571b[i42];
                        }
                        float f14 = i11;
                        while (i20 < i24) {
                            i11 += this.f16571b[i20];
                            i20++;
                        }
                        float f15 = i11;
                        float f16 = i7;
                        n nVar = new n(sb2.toString(), null, new p[]{new p(f14, f16), new p(f15, f16)}, P8.a.f8181b);
                        nVar.b(o.f8235A, "]F0");
                        return nVar;
                    }
                }
            }
            i20 += 2;
            i14 = i14;
            i12 = i12;
        }
        throw P8.j.a();
    }

    public final int h(int i7) {
        int i10 = i7 + 7;
        if (i10 >= this.f16572c) {
            return -1;
        }
        int[] iArr = this.f16571b;
        int i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = i7; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i7 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = 128;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i7 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = f16568e;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }
}
