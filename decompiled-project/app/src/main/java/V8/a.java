package V8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10191c = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public int[] f10192a;

    /* renamed from: b, reason: collision with root package name */
    public int f10193b;

    public a() {
        this.f10193b = 0;
        this.f10192a = f10191c;
    }

    public a(int i7) {
        this.f10193b = i7;
        this.f10192a = new int[(i7 + 31) / 32];
    }

    public final void a(boolean z8) {
        c(this.f10193b + 1);
        if (z8) {
            int[] iArr = this.f10192a;
            int i7 = this.f10193b;
            int i10 = i7 / 32;
            iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
        }
        this.f10193b++;
    }

    public final void b(int i7, int i10) {
        if (i10 < 0 || i10 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i11 = this.f10193b;
        c(i11 + i10);
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            if (((1 << i12) & i7) != 0) {
                int[] iArr = this.f10192a;
                int i13 = i11 / 32;
                iArr[i13] = iArr[i13] | (1 << (i11 & 31));
            }
            i11++;
        }
        this.f10193b = i11;
    }

    public final void c(int i7) {
        if (i7 > this.f10192a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i7 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f10192a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f10192a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [V8.a, java.lang.Object] */
    public final Object clone() {
        int[] iArr = (int[]) this.f10192a.clone();
        int i7 = this.f10193b;
        ?? obj = new Object();
        obj.f10192a = iArr;
        obj.f10193b = i7;
        return obj;
    }

    public final boolean d(int i7) {
        return ((1 << (i7 & 31)) & this.f10192a[i7 / 32]) != 0;
    }

    public final int e(int i7) {
        int i10 = this.f10193b;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & this.f10192a[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f10192a;
            if (i11 == iArr.length) {
                return this.f10193b;
            }
            i12 = iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), this.f10193b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10193b == aVar.f10193b && Arrays.equals(this.f10192a, aVar.f10192a);
    }

    public final int f(int i7) {
        int i10 = this.f10193b;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & (~this.f10192a[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f10192a;
            if (i11 == iArr.length) {
                return this.f10193b;
            }
            i12 = ~iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), this.f10193b);
    }

    public final int g() {
        return (this.f10193b + 7) / 8;
    }

    public final boolean h(int i7, int i10) {
        if (i10 < i7 || i7 < 0 || i10 > this.f10193b) {
            throw new IllegalArgumentException();
        }
        if (i10 == i7) {
            return true;
        }
        int i11 = i10 - 1;
        int i12 = i7 / 32;
        int i13 = i11 / 32;
        int i14 = i12;
        while (i14 <= i13) {
            if ((((2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i7 & 31))) & this.f10192a[i14]) != 0) {
                return false;
            }
            i14++;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10192a) + (this.f10193b * 31);
    }

    public final void i() {
        int[] iArr = new int[this.f10192a.length];
        int i7 = (this.f10193b - 1) / 32;
        int i10 = i7 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i7 - i11] = Integer.reverse(this.f10192a[i11]);
        }
        int i12 = this.f10193b;
        int i13 = i10 * 32;
        if (i12 != i13) {
            int i14 = i13 - i12;
            int i15 = iArr[0] >>> i14;
            for (int i16 = 1; i16 < i10; i16++) {
                int i17 = iArr[i16];
                iArr[i16 - 1] = i15 | (i17 << (32 - i14));
                i15 = i17 >>> i14;
            }
            iArr[i7] = i15;
        }
        this.f10192a = iArr;
    }

    public final void j(int i7) {
        int[] iArr = this.f10192a;
        int i10 = i7 / 32;
        iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
    }

    public final String toString() {
        int i7 = this.f10193b;
        StringBuilder sb2 = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i10 = 0; i10 < this.f10193b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
