package A0;

import java.util.Arrays;

/* renamed from: A0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f312a;

    /* renamed from: b, reason: collision with root package name */
    public int f313b;

    public C0032v() {
        this.f312a = new int[10];
    }

    public C0032v(int i7) {
        this.f312a = new int[i7];
    }

    public int a(int i7) {
        int i10 = this.f313b - 1;
        return i10 >= 0 ? this.f312a[i10] : i7;
    }

    public int b() {
        int[] iArr = this.f312a;
        int i7 = this.f313b - 1;
        this.f313b = i7;
        return iArr[i7];
    }

    public void c(int i7) {
        int[] iArr = this.f312a;
        if (this.f313b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.d(iArr, "copyOf(...)");
            this.f312a = iArr;
        }
        int i10 = this.f313b;
        this.f313b = i10 + 1;
        iArr[i10] = i7;
    }

    public void d(int i7, int i10, int i11) {
        int i12 = this.f313b;
        int[] iArr = this.f312a;
        int i13 = i12 + 3;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.d(iArr, "copyOf(...)");
            this.f312a = iArr;
        }
        iArr[i12] = i7 + i11;
        iArr[i12 + 1] = i10 + i11;
        iArr[i12 + 2] = i11;
        this.f313b = i13;
    }

    public void e(int i7, int i10, int i11, int i12) {
        int i13 = this.f313b;
        int[] iArr = this.f312a;
        int i14 = i13 + 4;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.d(iArr, "copyOf(...)");
            this.f312a = iArr;
        }
        iArr[i13] = i7;
        iArr[i13 + 1] = i10;
        iArr[i13 + 2] = i11;
        iArr[i13 + 3] = i12;
        this.f313b = i14;
    }

    public void f(int i7, int i10) {
        if (i7 < i10) {
            int i11 = i7 - 3;
            for (int i12 = i7; i12 < i10; i12 += 3) {
                int[] iArr = this.f312a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i7, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i7, int i10) {
        int[] iArr = this.f312a;
        int i11 = iArr[i7];
        iArr[i7] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i7 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i7 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }
}
