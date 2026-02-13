package V8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f10194a;

    /* renamed from: b, reason: collision with root package name */
    public int f10195b;

    /* renamed from: c, reason: collision with root package name */
    public int f10196c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10197d;

    public b(int i7, int i10) {
        if (i7 < 1 || i10 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f10194a = i7;
        this.f10195b = i10;
        int i11 = (i7 + 31) / 32;
        this.f10196c = i11;
        this.f10197d = new int[i11 * i10];
    }

    public final void a(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f10196c);
        int[] iArr = this.f10197d;
        iArr[i11] = (1 << (i7 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i7, int i10) {
        return ((this.f10197d[(i7 / 32) + (i10 * this.f10196c)] >>> (i7 & 31)) & 1) != 0;
    }

    public final int[] c() {
        int length = this.f10197d.length - 1;
        while (length >= 0 && this.f10197d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i7 = this.f10196c;
        int i10 = length / i7;
        int i11 = (length % i7) * 32;
        int i12 = 31;
        while ((this.f10197d[length] >>> i12) == 0) {
            i12--;
        }
        return new int[]{i11 + i12, i10};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [V8.b, java.lang.Object] */
    public final Object clone() {
        int i7 = this.f10194a;
        int i10 = this.f10195b;
        int i11 = this.f10196c;
        int[] iArr = (int[]) this.f10197d.clone();
        ?? obj = new Object();
        obj.f10194a = i7;
        obj.f10195b = i10;
        obj.f10196c = i11;
        obj.f10197d = iArr;
        return obj;
    }

    public final a d(a aVar, int i7) {
        int i10 = aVar.f10193b;
        int i11 = this.f10194a;
        if (i10 < i11) {
            aVar = new a(i11);
        } else {
            int length = aVar.f10192a.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar.f10192a[i12] = 0;
            }
        }
        int i13 = i7 * this.f10196c;
        for (int i14 = 0; i14 < this.f10196c; i14++) {
            aVar.f10192a[(i14 * 32) / 32] = this.f10197d[i13 + i14];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.f10197d;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f10196c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        while ((iArr[i10] << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i13 + i7, i12};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10194a == bVar.f10194a && this.f10195b == bVar.f10195b && this.f10196c == bVar.f10196c && Arrays.equals(this.f10197d, bVar.f10197d);
    }

    public final void f() {
        a aVar = new a(this.f10194a);
        a aVar2 = new a(this.f10194a);
        int i7 = (this.f10195b + 1) / 2;
        for (int i10 = 0; i10 < i7; i10++) {
            aVar = d(aVar, i10);
            int i11 = (this.f10195b - 1) - i10;
            aVar2 = d(aVar2, i11);
            aVar.i();
            aVar2.i();
            int[] iArr = aVar2.f10192a;
            int[] iArr2 = this.f10197d;
            int i12 = this.f10196c;
            System.arraycopy(iArr, 0, iArr2, i10 * i12, i12);
            int[] iArr3 = aVar.f10192a;
            int[] iArr4 = this.f10197d;
            int i13 = this.f10196c;
            System.arraycopy(iArr3, 0, iArr4, i11 * i13, i13);
        }
    }

    public final void g() {
        int i7 = this.f10195b;
        int i10 = this.f10194a;
        int i11 = (i7 + 31) / 32;
        int[] iArr = new int[i11 * i10];
        for (int i12 = 0; i12 < this.f10195b; i12++) {
            for (int i13 = 0; i13 < this.f10194a; i13++) {
                if (((this.f10197d[(i13 / 32) + (this.f10196c * i12)] >>> (i13 & 31)) & 1) != 0) {
                    int i14 = (i12 / 32) + (((i10 - 1) - i13) * i11);
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
            }
        }
        this.f10194a = i7;
        this.f10195b = i10;
        this.f10196c = i11;
        this.f10197d = iArr;
    }

    public final void h(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f10196c);
        int[] iArr = this.f10197d;
        iArr[i11] = (1 << (i7 & 31)) | iArr[i11];
    }

    public final int hashCode() {
        int i7 = this.f10194a;
        return Arrays.hashCode(this.f10197d) + (((((((i7 * 31) + i7) * 31) + this.f10195b) * 31) + this.f10196c) * 31);
    }

    public final void i(int i7, int i10, int i11, int i12) {
        if (i10 < 0 || i7 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        if (i14 > this.f10195b || i13 > this.f10194a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.f10196c * i10;
            for (int i16 = i7; i16 < i13; i16++) {
                int[] iArr = this.f10197d;
                int i17 = (i16 / 32) + i15;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f10194a + 1) * this.f10195b);
        for (int i7 = 0; i7 < this.f10195b; i7++) {
            for (int i10 = 0; i10 < this.f10194a; i10++) {
                sb2.append(b(i10, i7) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
