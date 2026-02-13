package X8;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f11015a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11016b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f11015a = aVar;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f11016b = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.f11016b = new int[]{0};
            return;
        }
        int i10 = length - i7;
        int[] iArr2 = new int[i10];
        this.f11016b = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, i10);
    }

    public final b a(b bVar) {
        a aVar = bVar.f11015a;
        a aVar2 = this.f11015a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return bVar;
        }
        if (bVar.e()) {
            return this;
        }
        int[] iArr = this.f11016b;
        int length = iArr.length;
        int[] iArr2 = bVar.f11016b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i7 = length2; i7 < iArr.length; i7++) {
            iArr3[i7] = iArr2[i7 - length2] ^ iArr[i7];
        }
        return new b(aVar2, iArr3);
    }

    public final int b(int i7) {
        if (i7 == 0) {
            return c(0);
        }
        int[] iArr = this.f11016b;
        if (i7 != 1) {
            int i10 = iArr[0];
            int length = iArr.length;
            for (int i11 = 1; i11 < length; i11++) {
                i10 = this.f11015a.c(i7, i10) ^ iArr[i11];
            }
            return i10;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            a aVar = a.f11003h;
            i12 ^= i13;
        }
        return i12;
    }

    public final int c(int i7) {
        return this.f11016b[(r0.length - 1) - i7];
    }

    public final int d() {
        return this.f11016b.length - 1;
    }

    public final boolean e() {
        return this.f11016b[0] == 0;
    }

    public final b f(int i7) {
        a aVar = this.f11015a;
        if (i7 == 0) {
            return aVar.f11011c;
        }
        if (i7 == 1) {
            return this;
        }
        int[] iArr = this.f11016b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i7);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f11015a;
        a aVar2 = this.f11015a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || bVar.e()) {
            return aVar2.f11011c;
        }
        int[] iArr = this.f11016b;
        int length = iArr.length;
        int[] iArr2 = bVar.f11016b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
            }
        }
        return new b(aVar2, iArr3);
    }

    public final b h(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        a aVar = this.f11015a;
        if (i10 == 0) {
            return aVar.f11011c;
        }
        int[] iArr = this.f11016b;
        int length = iArr.length;
        int[] iArr2 = new int[i7 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new b(aVar, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d10 = d(); d10 >= 0; d10--) {
            int c10 = c(d10);
            if (c10 != 0) {
                if (c10 < 0) {
                    if (d10 == d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d10 == 0 || c10 != 1) {
                    a aVar = this.f11015a;
                    if (c10 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i7 = aVar.f11010b[c10];
                    if (i7 == 0) {
                        sb2.append('1');
                    } else if (i7 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i7);
                    }
                }
                if (d10 != 0) {
                    if (d10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
