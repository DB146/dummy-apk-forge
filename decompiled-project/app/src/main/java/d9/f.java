package d9;

import P8.n;
import P8.o;
import P8.p;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class f extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16586b = {6, 8, 10, 12, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16587c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f16588d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f16589e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f16590a = -1;

    public static int g(int[] iArr) {
        float f4 = 0.38f;
        int i7 = -1;
        for (int i10 = 0; i10 < 20; i10++) {
            float d10 = h.d(iArr, f16589e[i10], 0.5f);
            if (d10 < f4) {
                i7 = i10;
                f4 = d10;
            } else if (d10 == f4) {
                i7 = -1;
            }
        }
        if (i7 >= 0) {
            return i7 % 10;
        }
        throw P8.j.a();
    }

    public static int[] h(int i7, V8.a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = aVar.f10193b;
        int i11 = i7;
        boolean z8 = false;
        int i12 = 0;
        while (i7 < i10) {
            if (aVar.d(i7) != z8) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (h.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i7};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z8 = !z8;
            }
            i7++;
        }
        throw P8.j.a();
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        int[] h10;
        boolean z8;
        int i10 = aVar.f10193b;
        int e2 = aVar.e(0);
        if (e2 == i10) {
            throw P8.j.a();
        }
        int[] h11 = h(e2, aVar, f16587c);
        int i11 = h11[1];
        int i12 = h11[0];
        this.f16590a = (i11 - i12) / 4;
        i(aVar, i12);
        int[][] iArr = f16588d;
        aVar.i();
        try {
            int i13 = aVar.f10193b;
            int e10 = aVar.e(0);
            if (e10 == i13) {
                throw P8.j.a();
            }
            try {
                h10 = h(e10, aVar, iArr[0]);
            } catch (P8.j unused) {
                h10 = h(e10, aVar, iArr[1]);
            }
            i(aVar, h10[0]);
            int i14 = h10[0];
            int i15 = aVar.f10193b;
            h10[0] = i15 - h10[1];
            h10[1] = i15 - i14;
            aVar.i();
            StringBuilder sb2 = new StringBuilder(20);
            int i16 = h11[1];
            int i17 = h10[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i16 < i17) {
                h.e(i16, aVar, iArr2);
                for (int i18 = 0; i18 < 5; i18++) {
                    int i19 = i18 * 2;
                    iArr3[i18] = iArr2[i19];
                    iArr4[i18] = iArr2[i19 + 1];
                }
                sb2.append((char) (g(iArr3) + 48));
                sb2.append((char) (g(iArr4) + 48));
                for (int i20 = 0; i20 < 10; i20++) {
                    i16 += iArr2[i20];
                }
            }
            String sb3 = sb2.toString();
            int[] iArr5 = enumMap != null ? (int[]) enumMap.get(P8.d.f8200f) : null;
            if (iArr5 == null) {
                iArr5 = f16586b;
            }
            int length = sb3.length();
            int length2 = iArr5.length;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i21 >= length2) {
                    z8 = false;
                    break;
                }
                int i23 = iArr5[i21];
                if (length == i23) {
                    z8 = true;
                    break;
                }
                if (i23 > i22) {
                    i22 = i23;
                }
                i21++;
            }
            if (!z8 && length > i22) {
                z8 = true;
            }
            if (!z8) {
                throw P8.f.a();
            }
            float f4 = i7;
            n nVar = new n(sb3, null, new p[]{new p(h11[1], f4), new p(h10[0], f4)}, P8.a.f8188w);
            nVar.b(o.f8235A, "]I0");
            return nVar;
        } catch (Throwable th) {
            aVar.i();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(V8.a aVar, int i7) {
        int min = Math.min(this.f16590a * 10, i7);
        for (int i10 = i7 - 1; min > 0 && i10 >= 0 && !aVar.d(i10); i10--) {
            min--;
        }
        throw P8.j.a();
    }
}
