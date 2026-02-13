package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f13387f = new d0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f13388a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f13389b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f13390c;

    /* renamed from: d, reason: collision with root package name */
    public int f13391d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13392e;

    public d0(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.f13388a = i7;
        this.f13389b = iArr;
        this.f13390c = objArr;
        this.f13392e = z8;
    }

    public final void a(int i7) {
        int[] iArr = this.f13389b;
        if (i7 > iArr.length) {
            int i10 = this.f13388a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f13389b = Arrays.copyOf(iArr, i7);
            this.f13390c = Arrays.copyOf(this.f13390c, i7);
        }
    }

    public final int b() {
        int k02;
        int i7 = this.f13391d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13388a; i11++) {
            int i12 = this.f13389b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                k02 = C0808k.k0(i13, ((Long) this.f13390c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f13390c[i11]).getClass();
                k02 = C0808k.W(i13);
            } else if (i14 == 2) {
                k02 = C0808k.S(i13, (C0804g) this.f13390c[i11]);
            } else if (i14 == 3) {
                i10 = ((d0) this.f13390c[i11]).b() + (C0808k.h0(i13) * 2) + i10;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(C0821y.b());
                }
                ((Integer) this.f13390c[i11]).getClass();
                k02 = C0808k.V(i13);
            }
            i10 = k02 + i10;
        }
        this.f13391d = i10;
        return i10;
    }

    public final void c(int i7, Object obj) {
        if (!this.f13392e) {
            throw new UnsupportedOperationException();
        }
        a(this.f13388a + 1);
        int[] iArr = this.f13389b;
        int i10 = this.f13388a;
        iArr[i10] = i7;
        this.f13390c[i10] = obj;
        this.f13388a = i10 + 1;
    }

    public final void d(E e2) {
        if (this.f13388a == 0) {
            return;
        }
        e2.getClass();
        for (int i7 = 0; i7 < this.f13388a; i7++) {
            int i10 = this.f13389b[i7];
            Object obj = this.f13390c[i7];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                e2.j(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                e2.f(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                e2.b(i11, (C0804g) obj);
            } else if (i12 == 3) {
                C0808k c0808k = (C0808k) e2.f13325a;
                c0808k.B0(i11, 3);
                ((d0) obj).d(e2);
                c0808k.B0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(C0821y.b());
                }
                e2.e(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        int i7 = this.f13388a;
        if (i7 == d0Var.f13388a) {
            int[] iArr = this.f13389b;
            int[] iArr2 = d0Var.f13389b;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.f13390c;
                    Object[] objArr2 = d0Var.f13390c;
                    int i11 = this.f13388a;
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
        int i7 = this.f13388a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f13389b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f13390c;
        int i15 = this.f13388a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
