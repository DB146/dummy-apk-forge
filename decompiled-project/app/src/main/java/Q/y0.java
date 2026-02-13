package Q;

import A0.C0032v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f8573a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8575c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f8576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8577e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8578f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f8579h;

    /* renamed from: i, reason: collision with root package name */
    public int f8580i;
    public final C0032v j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8581l;

    /* renamed from: m, reason: collision with root package name */
    public int f8582m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8583n;

    public y0(z0 z0Var) {
        this.f8573a = z0Var;
        this.f8574b = z0Var.f8586a;
        int i7 = z0Var.f8587b;
        this.f8575c = i7;
        this.f8576d = z0Var.f8588c;
        this.f8577e = z0Var.f8589d;
        this.f8579h = i7;
        this.f8580i = -1;
        this.j = new C0032v();
    }

    public final C0478a a(int i7) {
        ArrayList arrayList = this.f8573a.f8594w;
        int e2 = B0.e(arrayList, i7, this.f8575c);
        if (e2 >= 0) {
            return (C0478a) arrayList.get(e2);
        }
        C0478a c0478a = new C0478a(i7);
        arrayList.add(-(e2 + 1), c0478a);
        return c0478a;
    }

    public final Object b(int[] iArr, int i7) {
        int i10 = i7 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            return this.f8576d[i10 >= iArr.length ? iArr.length : iArr[i10 + 4] + Integer.bitCount(i11 >> 29)];
        }
        return C0498k.f8409a;
    }

    public final void c() {
        this.f8578f = true;
        z0 z0Var = this.f8573a;
        z0Var.getClass();
        if (this.f8573a != z0Var || z0Var.f8590e <= 0) {
            AbstractC0508p.c("Unexpected reader close()");
        }
        z0Var.f8590e--;
    }

    public final void d() {
        if (this.k == 0) {
            if (!(this.g == this.f8579h)) {
                AbstractC0508p.c("endGroup() not called at the end of a group");
            }
            int i7 = (this.f8580i * 5) + 2;
            int[] iArr = this.f8574b;
            int i10 = iArr[i7];
            this.f8580i = i10;
            int i11 = this.f8575c;
            this.f8579h = i10 < 0 ? i11 : B0.a(iArr, i10) + i10;
            int b2 = this.j.b();
            if (b2 < 0) {
                this.f8581l = 0;
                this.f8582m = 0;
            } else {
                this.f8581l = b2;
                this.f8582m = i10 >= i11 - 1 ? this.f8577e : iArr[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final Object e() {
        int i7 = this.g;
        if (i7 < this.f8579h) {
            return b(this.f8574b, i7);
        }
        return 0;
    }

    public final int f() {
        int i7 = this.g;
        if (i7 >= this.f8579h) {
            return 0;
        }
        return this.f8574b[i7 * 5];
    }

    public final Object g(int i7, int i10) {
        int[] iArr = this.f8574b;
        int c10 = B0.c(iArr, i7);
        int i11 = i7 + 1;
        int i12 = c10 + i10;
        return i12 < (i11 < this.f8575c ? iArr[(i11 * 5) + 4] : this.f8577e) ? this.f8576d[i12] : C0498k.f8409a;
    }

    public final boolean h(int i7) {
        return (this.f8574b[(i7 * 5) + 1] & 536870912) != 0;
    }

    public final boolean i(int i7) {
        return (this.f8574b[(i7 * 5) + 1] & 1073741824) != 0;
    }

    public final Object j() {
        int i7;
        if (this.k > 0 || (i7 = this.f8581l) >= this.f8582m) {
            this.f8583n = false;
            return C0498k.f8409a;
        }
        this.f8583n = true;
        this.f8581l = i7 + 1;
        return this.f8576d[i7];
    }

    public final Object k(int i7) {
        int i10 = i7 * 5;
        int[] iArr = this.f8574b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 == 0) {
            return null;
        }
        if (i11 == 0) {
            return C0498k.f8409a;
        }
        return this.f8576d[iArr[i10 + 4]];
    }

    public final int l(int i7) {
        return this.f8574b[(i7 * 5) + 1] & 67108863;
    }

    public final Object m(int[] iArr, int i7) {
        int i10 = i7 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f8576d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int n(int i7) {
        return this.f8574b[(i7 * 5) + 2];
    }

    public final void o(int i7) {
        if (!(this.k == 0)) {
            AbstractC0508p.c("Cannot reposition while in an empty region");
        }
        this.g = i7;
        int[] iArr = this.f8574b;
        int i10 = this.f8575c;
        int i11 = i7 < i10 ? iArr[(i7 * 5) + 2] : -1;
        this.f8580i = i11;
        if (i11 < 0) {
            this.f8579h = i10;
        } else {
            this.f8579h = B0.a(iArr, i11) + i11;
        }
        this.f8581l = 0;
        this.f8582m = 0;
    }

    public final int p() {
        if (!(this.k == 0)) {
            AbstractC0508p.c("Cannot skip while in an empty region");
        }
        int i7 = this.g;
        int[] iArr = this.f8574b;
        int i10 = (iArr[(i7 * 5) + 1] & 1073741824) == 0 ? iArr[(i7 * 5) + 1] & 67108863 : 1;
        this.g = B0.a(iArr, i7) + i7;
        return i10;
    }

    public final void q() {
        if (!(this.k == 0)) {
            AbstractC0508p.c("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.f8579h;
        this.f8581l = 0;
        this.f8582m = 0;
    }

    public final void r() {
        if (this.k <= 0) {
            int i7 = this.f8580i;
            int i10 = this.g;
            int[] iArr = this.f8574b;
            if (!(iArr[(i10 * 5) + 2] == i7)) {
                AbstractC0495i0.a("Invalid slot table detected");
            }
            int i11 = this.f8581l;
            int i12 = this.f8582m;
            C0032v c0032v = this.j;
            if (i11 == 0 && i12 == 0) {
                c0032v.c(-1);
            } else {
                c0032v.c(i11);
            }
            this.f8580i = i10;
            this.f8579h = B0.a(iArr, i10) + i10;
            int i13 = i10 + 1;
            this.g = i13;
            this.f8581l = B0.c(iArr, i10);
            this.f8582m = i10 >= this.f8575c - 1 ? this.f8577e : iArr[(i13 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.g);
        sb2.append(", key=");
        sb2.append(f());
        sb2.append(", parent=");
        sb2.append(this.f8580i);
        sb2.append(", end=");
        return X.c.k(sb2, this.f8579h, ')');
    }
}
