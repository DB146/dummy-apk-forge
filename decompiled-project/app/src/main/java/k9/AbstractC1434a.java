package k9;

import P8.p;
import V8.b;
import java.util.Arrays;

/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1434a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f19054a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f19055b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f19056c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f19057d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f19058e = {0, 180, 270, 90};

    public static int[] a(b bVar, int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bVar.b(i7, i10) && i7 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i7--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i7;
        int i15 = 0;
        boolean z8 = false;
        while (i7 < i11) {
            if (bVar.b(i7, i10) != z8) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (c(iArr2, iArr) < 0.42f) {
                        return new int[]{i14, i7};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z8 = !z8;
            }
            i7++;
        }
        if (i15 != length - 1 || c(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i7 - 1};
    }

    public static p[] b(b bVar, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z8;
        p[] pVarArr = new p[4];
        int[] iArr2 = new int[iArr.length];
        int i14 = i11;
        while (true) {
            if (i14 >= i7) {
                z8 = false;
                break;
            }
            int[] a9 = a(bVar, i12, i14, i10, iArr, iArr2);
            if (a9 != null) {
                int i15 = i14;
                int[] iArr3 = a9;
                while (i15 > 0) {
                    int i16 = i15 - 1;
                    int[] a10 = a(bVar, i12, i16, i10, iArr, iArr2);
                    if (a10 == null) {
                        break;
                    }
                    iArr3 = a10;
                    i15 = i16;
                }
                float f4 = i15;
                pVarArr[0] = new p(iArr3[0], f4);
                pVarArr[1] = new p(iArr3[1], f4);
                z8 = true;
                i14 = i15;
            } else {
                i14 += 5;
            }
        }
        int i17 = i14 + 1;
        if (z8) {
            int[] iArr4 = {(int) pVarArr[0].f8249a, (int) pVarArr[1].f8249a};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i7) {
                int[] a11 = a(bVar, iArr4[0], i18, i10, iArr, iArr2);
                if (a11 != null && Math.abs(iArr4[0] - a11[0]) < 5 && Math.abs(iArr4[1] - a11[1]) < 5) {
                    iArr4 = a11;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f10 = i17;
            pVarArr[2] = new p(iArr4[0], f10);
            pVarArr[3] = new p(iArr4[1], f10);
        }
        if (i17 - i14 < i13) {
            Arrays.fill(pVarArr, (Object) null);
        }
        return pVarArr;
    }

    public static float c(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = i7;
        float f10 = f4 / i10;
        float f11 = 0.8f * f10;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f13 = iArr2[i12] * f10;
            float f14 = iArr[i12];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f4;
    }
}
