package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f15762f = new c0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15763a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15764b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15765c;

    /* renamed from: d, reason: collision with root package name */
    public int f15766d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15767e;

    public c0(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.f15763a = i7;
        this.f15764b = iArr;
        this.f15765c = objArr;
        this.f15767e = z8;
    }

    public static c0 b() {
        return new c0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int s02;
        int i7 = this.f15766d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15763a; i11++) {
            int i12 = this.f15764b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                s02 = C1016j.s0(i13, ((Long) this.f15765c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f15765c[i11]).getClass();
                s02 = C1016j.d0(i13);
            } else if (i14 == 2) {
                s02 = C1016j.Y(i13, (AbstractC1014h) this.f15765c[i11]);
            } else if (i14 == 3) {
                i10 = ((c0) this.f15765c[i11]).a() + (C1016j.p0(i13) * 2) + i10;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(C.b());
                }
                ((Integer) this.f15765c[i11]).getClass();
                s02 = C1016j.c0(i13);
            }
            i10 = s02 + i10;
        }
        this.f15766d = i10;
        return i10;
    }

    public final void c(int i7, Object obj) {
        if (!this.f15767e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f15763a;
        int[] iArr = this.f15764b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f15764b = Arrays.copyOf(iArr, i11);
            this.f15765c = Arrays.copyOf(this.f15765c, i11);
        }
        int[] iArr2 = this.f15764b;
        int i12 = this.f15763a;
        iArr2[i12] = i7;
        this.f15765c[i12] = obj;
        this.f15763a = i12 + 1;
    }

    public final void d(C1018l c1018l) {
        if (this.f15763a == 0) {
            return;
        }
        c1018l.getClass();
        for (int i7 = 0; i7 < this.f15763a; i7++) {
            int i10 = this.f15764b[i7];
            Object obj = this.f15765c[i7];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                c1018l.j(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                c1018l.f(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                c1018l.b(i11, (AbstractC1014h) obj);
            } else if (i12 == 3) {
                C1016j c1016j = (C1016j) c1018l.f15795a;
                c1016j.B0(i11, 3);
                ((c0) obj).d(c1018l);
                c1016j.B0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(C.b());
                }
                c1018l.e(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i7 = this.f15763a;
        if (i7 == c0Var.f15763a) {
            int[] iArr = this.f15764b;
            int[] iArr2 = c0Var.f15764b;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.f15765c;
                    Object[] objArr2 = c0Var.f15765c;
                    int i11 = this.f15763a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f15763a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f15764b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f15765c;
        int i15 = this.f15763a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
