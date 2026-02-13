package A9;

import H2.C0305t;

/* loaded from: classes2.dex */
public final class g3 extends G0 {
    public final C0154x0 j = new C0154x0(0);

    public g3() {
        n(1);
    }

    @Override // A9.G0
    public final boolean b(int i7, boolean z8) {
        int min;
        int i10;
        if (this.f825b.h() == 0) {
            return false;
        }
        if (!z8 && c(i7)) {
            return false;
        }
        int i11 = this.g;
        if (i11 >= 0) {
            min = i11 + 1;
        } else {
            int i12 = this.f831i;
            min = i12 != -1 ? Math.min(i12, this.f825b.h() - 1) : 0;
        }
        boolean z10 = false;
        while (min < this.f825b.h()) {
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            int g = t5.g(min, true, objArr, false);
            if (this.f829f < 0 || this.g < 0) {
                i10 = this.f826c ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Integer.MIN_VALUE;
                this.f829f = min;
                this.g = min;
            } else {
                if (this.f826c) {
                    int i13 = min - 1;
                    i10 = (this.f825b.i(i13) - this.f825b.j(i13)) - this.f827d;
                } else {
                    int i14 = min - 1;
                    i10 = this.f827d + this.f825b.j(i14) + this.f825b.i(i14);
                }
                this.g = min;
            }
            this.f825b.f(objArr[0], min, g, 0, i10);
            if (z8 || c(i7)) {
                return true;
            }
            min++;
            z10 = true;
        }
        return z10;
    }

    @Override // A9.G0
    public final void e(int i7, int i10, C0305t c0305t) {
        int o10;
        int i11;
        if (!this.f826c ? i10 < 0 : i10 > 0) {
            if (this.g == this.f825b.h() - 1) {
                return;
            }
            int i12 = this.g;
            if (i12 >= 0) {
                o10 = i12 + 1;
            } else {
                int i13 = this.f831i;
                o10 = i13 != -1 ? Math.min(i13, this.f825b.h() - 1) : 0;
            }
            int j = this.f825b.j(this.g) + this.f827d;
            int i14 = this.f825b.i(this.g);
            if (this.f826c) {
                j = -j;
            }
            i11 = j + i14;
        } else {
            if (this.f829f == 0) {
                return;
            }
            o10 = o();
            i11 = this.f825b.i(this.f829f) + (this.f826c ? this.f827d : -this.f827d);
        }
        c0305t.a(o10, Math.abs(i11 - i7));
    }

    @Override // A9.G0
    public final int g(int[] iArr, int i7, boolean z8) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
        }
        return this.f826c ? this.f825b.i(i7) : this.f825b.i(i7) + this.f825b.j(i7);
    }

    @Override // A9.G0
    public final int i(int[] iArr, int i7, boolean z8) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
        }
        return this.f826c ? this.f825b.i(i7) - this.f825b.j(i7) : this.f825b.i(i7);
    }

    @Override // A9.G0
    public final A4.h[] j(int i7, int i10) {
        A4.h hVar = this.f830h[0];
        hVar.f385b = 0;
        hVar.p(i7);
        this.f830h[0].p(i10);
        return this.f830h;
    }

    @Override // A9.G0
    public final C0154x0 k(int i7) {
        return this.j;
    }

    @Override // A9.G0
    public final boolean m(int i7, boolean z8) {
        int i10;
        if (this.f825b.h() == 0) {
            return false;
        }
        if (!z8 && d(i7)) {
            return false;
        }
        int i11 = ((N0) this.f825b.f964a).f914w;
        boolean z10 = false;
        for (int o10 = o(); o10 >= i11; o10--) {
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            int g = t5.g(o10, false, objArr, false);
            if (this.f829f < 0 || this.g < 0) {
                i10 = this.f826c ? Integer.MIN_VALUE : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                this.f829f = o10;
                this.g = o10;
            } else {
                i10 = this.f826c ? this.f825b.i(o10 + 1) + this.f827d + g : (this.f825b.i(o10 + 1) - this.f827d) - g;
                this.f829f = o10;
            }
            this.f825b.f(objArr[0], o10, g, 0, i10);
            z10 = true;
            if (z8 || d(i7)) {
                break;
            }
        }
        return z10;
    }

    public final int o() {
        int i7 = this.f829f;
        if (i7 >= 0) {
            return i7 - 1;
        }
        int i10 = this.f831i;
        return i10 != -1 ? Math.min(i10, this.f825b.h() - 1) : this.f825b.h() - 1;
    }
}
