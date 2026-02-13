package C;

/* renamed from: C.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0219d f2402a = new C0219d();

    /* renamed from: b, reason: collision with root package name */
    public static final C0217b f2403b = new C0217b();

    static {
        new C0218c(0);
        new C0218c(3);
        new C0218c(2);
        new C0218c(1);
    }

    public static void a(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float f4 = (i7 - i11) / 2;
        if (!z8) {
            int length = iArr.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f4);
                f4 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = Math.round(f4);
            f4 += i15;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z8) {
        int i7 = 0;
        if (!z8) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i7 < length) {
                int i12 = iArr[i7];
                iArr2[i10] = i11;
                i11 += i12;
                i7++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = i7;
            i7 += i13;
        }
    }

    public static void c(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int i13 = i7 - i11;
        if (!z8) {
            int length = iArr.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = iArr[i10];
                iArr2[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i16;
        }
    }

    public static void d(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = iArr.length == 0 ? 0.0f : (i7 - i11) / iArr.length;
        float f4 = length / 2;
        if (!z8) {
            int length2 = iArr.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f4);
                f4 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i15 = iArr[length3];
            iArr2[length3] = Math.round(f4);
            f4 += i15 + length;
        }
    }

    public static void e(int i7, int[] iArr, int[] iArr2, boolean z8) {
        if (iArr.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float max = (i7 - i11) / Math.max(iArr.length - 1, 1);
        float f4 = (z8 && iArr.length == 1) ? max : 0.0f;
        if (z8) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                iArr2[length] = Math.round(f4);
                f4 += i13 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f4);
            f4 += i15 + max;
            i10++;
            i14++;
        }
    }

    public static void f(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = (i7 - i11) / (iArr.length + 1);
        if (z8) {
            float f4 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i13 = iArr[length2];
                iArr2[length2] = Math.round(f4);
                f4 += i13 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }
}
