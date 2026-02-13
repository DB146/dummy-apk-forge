package d9;

import P8.n;
import P8.o;
import P8.p;
import java.util.Arrays;
import java.util.EnumMap;

/* renamed from: d9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1061c extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16574d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16575a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16576b = new StringBuilder(20);

    /* renamed from: c, reason: collision with root package name */
    public final int[] f16577c = new int[9];

    public C1061c(boolean z8) {
        this.f16575a = z8;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i7) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if (i18 * 2 >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i7 = i10;
        }
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        char c10;
        int[] iArr = this.f16577c;
        int i10 = 0;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f16576b;
        sb2.setLength(0);
        int i11 = aVar.f10193b;
        int e2 = aVar.e(0);
        int length = iArr.length;
        boolean z8 = false;
        int i12 = 0;
        int i13 = e2;
        while (e2 < i11) {
            if (aVar.d(e2) != z8) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 == length - 1) {
                    int i14 = 148;
                    if (g(iArr) == 148 && aVar.h(Math.max(0, i13 - ((e2 - i13) / 2)), i13)) {
                        int e10 = aVar.e(new int[]{i13, e2}[1]);
                        int i15 = aVar.f10193b;
                        while (true) {
                            h.e(e10, aVar, iArr);
                            int g = g(iArr);
                            if (g < 0) {
                                throw P8.j.a();
                            }
                            int i16 = i10;
                            while (true) {
                                if (i16 < 43) {
                                    if (f16574d[i16] == g) {
                                        c10 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16);
                                        break;
                                    }
                                    i16++;
                                } else {
                                    if (g != i14) {
                                        throw P8.j.a();
                                    }
                                    c10 = '*';
                                }
                            }
                            sb2.append(c10);
                            int i17 = e10;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            int e11 = aVar.e(i17);
                            if (c10 == '*') {
                                sb2.setLength(sb2.length() - 1);
                                int i19 = 0;
                                for (int i20 : iArr) {
                                    i19 += i20;
                                }
                                int i21 = (e11 - e10) - i19;
                                if (e11 != i15 && i21 * 2 < i19) {
                                    throw P8.j.a();
                                }
                                if (this.f16575a) {
                                    int length2 = sb2.length() - 1;
                                    int i22 = 0;
                                    for (int i23 = 0; i23 < length2; i23++) {
                                        i22 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i23));
                                    }
                                    if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i22 % 43)) {
                                        throw P8.c.a();
                                    }
                                    sb2.setLength(length2);
                                }
                                if (sb2.length() == 0) {
                                    throw P8.j.a();
                                }
                                float f4 = (r5[1] + r5[0]) / 2.0f;
                                float f10 = (i19 / 2.0f) + e10;
                                float f11 = i7;
                                n nVar = new n(sb2.toString(), null, new p[]{new p(f4, f11), new p(f10, f11)}, P8.a.f8182c);
                                nVar.b(o.f8235A, "]A0");
                                return nVar;
                            }
                            e10 = e11;
                            i10 = 0;
                            i14 = 148;
                        }
                    } else {
                        i13 += iArr[0] + iArr[1];
                        int i24 = i12 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i24);
                        iArr[i24] = 0;
                        iArr[i12] = 0;
                        i12--;
                    }
                } else {
                    i12++;
                }
                iArr[i12] = 1;
                z8 = !z8;
            }
            e2++;
        }
        throw P8.j.a();
    }
}
