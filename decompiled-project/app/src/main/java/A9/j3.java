package A9;

import u.C2054g;

/* loaded from: classes2.dex */
public final class j3 extends G0 {
    public C2054g j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1261l;

    /* renamed from: m, reason: collision with root package name */
    public int f1262m;

    @Override // A9.G0
    public final boolean b(int i7, boolean z8) {
        Object[] objArr = this.f824a;
        if (this.f825b.h() == 0) {
            return false;
        }
        if (!z8 && c(i7)) {
            return false;
        }
        try {
            if (!o(i7, z8)) {
                return q(i7, z8);
            }
            objArr[0] = null;
            this.f1261l = null;
            return true;
        } finally {
            objArr[0] = null;
            this.f1261l = null;
        }
    }

    @Override // A9.G0
    public final int g(int[] iArr, int i7, boolean z8) {
        int i10;
        int i11 = this.f825b.i(i7);
        i3 k = k(i7);
        int i12 = k.f1468a;
        if (this.f826c) {
            i10 = i12;
            int i13 = i10;
            int i14 = 1;
            int i15 = i11;
            for (int i16 = i7 + 1; i14 < this.f828e && i16 <= this.g; i16++) {
                i3 k7 = k(i16);
                i15 += k7.f1231b;
                int i17 = k7.f1468a;
                if (i17 != i13) {
                    i14++;
                    if (!z8 ? i15 >= i11 : i15 <= i11) {
                        i13 = i17;
                    } else {
                        i11 = i15;
                        i7 = i16;
                        i10 = i17;
                        i13 = i10;
                    }
                }
            }
        } else {
            int i18 = 1;
            int i19 = i12;
            i3 i3Var = k;
            int i20 = i11;
            i11 = this.f825b.j(i7) + i11;
            i10 = i19;
            for (int i21 = i7 - 1; i18 < this.f828e && i21 >= this.f829f; i21--) {
                i20 -= i3Var.f1231b;
                i3Var = k(i21);
                int i22 = i3Var.f1468a;
                if (i22 != i19) {
                    i18++;
                    int j = this.f825b.j(i21) + i20;
                    if (!z8 ? j >= i11 : j <= i11) {
                        i19 = i22;
                    } else {
                        i11 = j;
                        i7 = i21;
                        i10 = i22;
                        i19 = i10;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i10;
            iArr[1] = i7;
        }
        return i11;
    }

    @Override // A9.G0
    public final int i(int[] iArr, int i7, boolean z8) {
        int i10;
        int i11 = this.f825b.i(i7);
        i3 k = k(i7);
        int i12 = k.f1468a;
        if (this.f826c) {
            int i13 = 1;
            i10 = i11 - this.f825b.j(i7);
            int i14 = i12;
            for (int i15 = i7 - 1; i13 < this.f828e && i15 >= this.f829f; i15--) {
                i11 -= k.f1231b;
                k = k(i15);
                int i16 = k.f1468a;
                if (i16 != i14) {
                    i13++;
                    int j = i11 - this.f825b.j(i15);
                    if (!z8 ? j >= i10 : j <= i10) {
                        i14 = i16;
                    } else {
                        i10 = j;
                        i7 = i15;
                        i12 = i16;
                        i14 = i12;
                    }
                }
            }
        } else {
            int i17 = i12;
            int i18 = i17;
            int i19 = 1;
            int i20 = i11;
            for (int i21 = i7 + 1; i19 < this.f828e && i21 <= this.g; i21++) {
                i3 k7 = k(i21);
                i20 += k7.f1231b;
                int i22 = k7.f1468a;
                if (i22 != i18) {
                    i19++;
                    if (!z8 ? i20 >= i11 : i20 <= i11) {
                        i18 = i22;
                    } else {
                        i11 = i20;
                        i7 = i21;
                        i17 = i22;
                        i18 = i17;
                    }
                }
            }
            i10 = i11;
            i12 = i17;
        }
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i7;
        }
        return i10;
    }

    @Override // A9.G0
    public final A4.h[] j(int i7, int i10) {
        for (int i11 = 0; i11 < this.f828e; i11++) {
            this.f830h[i11].f385b = 0;
        }
        if (i7 >= 0) {
            while (i7 <= i10) {
                A4.h hVar = this.f830h[k(i7).f1468a];
                if (hVar.u() > 0) {
                    int i12 = hVar.f385b;
                    if (i12 == 0) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int[] iArr = (int[]) hVar.f387d;
                    int i13 = hVar.f386c;
                    if (iArr[(i12 - 1) & i13] == i7 - 1) {
                        if (i12 == 0) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        int i14 = (i12 - 1) & i13;
                        int i15 = iArr[i14];
                        hVar.f385b = i14;
                        hVar.p(i7);
                        i7++;
                    }
                }
                hVar.p(i7);
                hVar.p(i7);
                i7++;
            }
        }
        return this.f830h;
    }

    @Override // A9.G0
    public final void l(int i7) {
        super.l(i7);
        int s3 = (s() - i7) + 1;
        C2054g c2054g = this.j;
        c2054g.f(s3);
        if (c2054g.h() == 0) {
            this.k = -1;
        }
    }

    @Override // A9.G0
    public final boolean m(int i7, boolean z8) {
        Object[] objArr = this.f824a;
        if (this.f825b.h() == 0) {
            return false;
        }
        if (!z8 && d(i7)) {
            return false;
        }
        try {
            if (!w(i7, z8)) {
                return y(i7, z8);
            }
            objArr[0] = null;
            this.f1261l = null;
            return true;
        } finally {
            objArr[0] = null;
            this.f1261l = null;
        }
    }

    public final boolean o(int i7, boolean z8) {
        int i10;
        int i11;
        int i12;
        C2054g c2054g = this.j;
        if (c2054g.h() == 0) {
            return false;
        }
        int h10 = this.f825b.h();
        int i13 = this.g;
        if (i13 >= 0) {
            i10 = i13 + 1;
            i11 = this.f825b.i(i13);
        } else {
            int i14 = this.f831i;
            i10 = i14 != -1 ? i14 : 0;
            if (i10 > s() + 1 || i10 < this.k) {
                c2054g.g(c2054g.h());
                return false;
            }
            if (i10 > s()) {
                return false;
            }
            i11 = Integer.MAX_VALUE;
        }
        int s3 = s();
        int i15 = i10;
        while (i15 < h10 && i15 <= s3) {
            i3 k = k(i15);
            if (i11 != Integer.MAX_VALUE) {
                i11 += k.f1231b;
            }
            int i16 = k.f1468a;
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            int g = t5.g(i15, true, objArr, false);
            if (g != k.f1232c) {
                k.f1232c = g;
                c2054g.f(s3 - i15);
                i12 = i15;
            } else {
                i12 = s3;
            }
            this.g = i15;
            if (this.f829f < 0) {
                this.f829f = i15;
            }
            this.f825b.f(objArr[0], i15, g, i16, i11);
            if (!z8 && c(i7)) {
                return true;
            }
            if (i11 == Integer.MAX_VALUE) {
                i11 = this.f825b.i(i15);
            }
            if (i16 == this.f828e - 1 && z8) {
                return true;
            }
            i15++;
            s3 = i12;
        }
        return false;
    }

    public final int p(int i7, int i10, int i11) {
        int i12;
        int i13 = this.g;
        if (i13 >= 0 && (i13 != s() || this.g != i7 - 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.g;
        C2054g c2054g = this.j;
        if (i14 >= 0) {
            i12 = i11 - this.f825b.i(i14);
        } else if (c2054g.h() <= 0 || i7 != s() + 1) {
            i12 = 0;
        } else {
            int s3 = s();
            while (true) {
                if (s3 < this.k) {
                    s3 = s();
                    break;
                }
                if (k(s3).f1468a == i10) {
                    break;
                }
                s3--;
            }
            i12 = this.f826c ? (-k(s3).f1232c) - this.f827d : k(s3).f1232c + this.f827d;
            for (int i15 = s3 + 1; i15 <= s(); i15++) {
                i12 -= k(i15).f1231b;
            }
        }
        i3 i3Var = new i3(i10, i12);
        c2054g.b(i3Var);
        Object obj = this.f1261l;
        if (obj != null) {
            i3Var.f1232c = this.f1262m;
            this.f1261l = null;
        } else {
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            i3Var.f1232c = t5.g(i7, true, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        if (c2054g.h() == 1) {
            this.g = i7;
            this.f829f = i7;
            this.k = i7;
        } else {
            int i16 = this.g;
            if (i16 < 0) {
                this.g = i7;
                this.f829f = i7;
            } else {
                this.g = i16 + 1;
            }
        }
        this.f825b.f(obj2, i7, i3Var.f1232c, i10, i11);
        return i3Var.f1232c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(int i7, boolean z8) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int h10 = this.f825b.h();
        int i15 = this.g;
        if (i15 < 0) {
            int i16 = this.f831i;
            i10 = i16 != -1 ? i16 : 0;
            i11 = (this.j.h() > 0 ? k(s()).f1468a + 1 : i10) % this.f828e;
            z10 = false;
            i12 = 0;
        } else {
            if (i15 < s()) {
                return false;
            }
            int i17 = this.g;
            i10 = i17 + 1;
            i11 = k(i17).f1468a;
            int r10 = r(true);
            if (r10 < 0) {
                i12 = Integer.MIN_VALUE;
                for (int i18 = 0; i18 < this.f828e; i18++) {
                    i12 = this.f826c ? v(i18) : u(i18);
                    if (i12 != Integer.MIN_VALUE) {
                        break;
                    }
                }
            } else {
                i12 = this.f826c ? i(null, r10, false) : g(null, r10, true);
            }
            if (!this.f826c ? u(i11) >= i12 : v(i11) <= i12) {
                i11++;
                if (i11 == this.f828e) {
                    i12 = this.f826c ? h(false, null) : f(true, null);
                    i11 = 0;
                }
            }
            z10 = true;
        }
        boolean z11 = false;
        loop1: while (true) {
            if (i11 < this.f828e) {
                if (i10 == h10 || (!z8 && c(i7))) {
                    break;
                }
                int v10 = this.f826c ? v(i11) : u(i11);
                if (v10 == Integer.MAX_VALUE || v10 == Integer.MIN_VALUE) {
                    if (i11 == 0) {
                        v10 = this.f826c ? v(this.f828e - 1) : u(this.f828e - 1);
                        if (v10 != Integer.MAX_VALUE && v10 != Integer.MIN_VALUE) {
                            if (this.f826c) {
                                i14 = this.f827d;
                                i13 = -i14;
                                v10 += i13;
                            } else {
                                i13 = this.f827d;
                                v10 += i13;
                            }
                        }
                    } else {
                        v10 = this.f826c ? u(i11 - 1) : v(i11 - 1);
                    }
                } else if (this.f826c) {
                    i14 = this.f827d;
                    i13 = -i14;
                    v10 += i13;
                } else {
                    i13 = this.f827d;
                    v10 += i13;
                }
                int i19 = i10 + 1;
                int p10 = p(i10, i11, v10);
                if (z10) {
                    while (true) {
                        if (!this.f826c) {
                            if (v10 + p10 >= i12) {
                                break;
                            }
                            if (i19 == h10) {
                                break loop1;
                            }
                            break loop1;
                        }
                        if (v10 - p10 <= i12) {
                            break;
                        }
                        if (i19 == h10 || (!z8 && c(i7))) {
                            break loop1;
                        }
                        v10 += this.f826c ? (-p10) - this.f827d : p10 + this.f827d;
                        int i20 = i19 + 1;
                        int p11 = p(i19, i11, v10);
                        i19 = i20;
                        p10 = p11;
                    }
                } else {
                    z10 = true;
                    i12 = this.f826c ? v(i11) : u(i11);
                }
                i10 = i19;
                i11++;
                z11 = true;
            } else {
                if (z8) {
                    return z11;
                }
                i12 = this.f826c ? h(false, null) : f(true, null);
                i11 = 0;
            }
        }
    }

    public final int r(boolean z8) {
        boolean z10 = false;
        if (z8) {
            for (int i7 = this.g; i7 >= this.f829f; i7--) {
                int i10 = k(i7).f1468a;
                if (i10 == 0) {
                    z10 = true;
                } else if (z10 && i10 == this.f828e - 1) {
                    return i7;
                }
            }
            return -1;
        }
        for (int i11 = this.f829f; i11 <= this.g; i11++) {
            int i12 = k(i11).f1468a;
            if (i12 == this.f828e - 1) {
                z10 = true;
            } else if (z10 && i12 == 0) {
                return i11;
            }
        }
        return -1;
    }

    public final int s() {
        return (this.j.h() + this.k) - 1;
    }

    @Override // A9.G0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final i3 k(int i7) {
        int i10 = i7 - this.k;
        if (i10 < 0) {
            return null;
        }
        C2054g c2054g = this.j;
        if (i10 >= c2054g.h()) {
            return null;
        }
        return (i3) c2054g.d(i10);
    }

    public final int u(int i7) {
        int i10;
        i3 k;
        int i11 = this.f829f;
        if (i11 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f826c) {
            int i12 = this.f825b.i(i11);
            if (k(this.f829f).f1468a == i7) {
                return i12;
            }
            int i13 = this.f829f;
            do {
                i13++;
                if (i13 <= s()) {
                    k = k(i13);
                    i12 += k.f1231b;
                }
            } while (k.f1468a != i7);
            return i12;
        }
        int i14 = this.f825b.i(this.g);
        i3 k7 = k(this.g);
        if (k7.f1468a == i7) {
            i10 = k7.f1232c;
        } else {
            int i15 = this.g;
            do {
                i15--;
                if (i15 >= this.k) {
                    i14 -= k7.f1231b;
                    k7 = k(i15);
                }
            } while (k7.f1468a != i7);
            i10 = k7.f1232c;
        }
        return i14 + i10;
        return Integer.MIN_VALUE;
    }

    public final int v(int i7) {
        i3 k;
        int i10;
        int i11 = this.f829f;
        if (i11 < 0) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (!this.f826c) {
            int i12 = this.f825b.i(i11);
            if (k(this.f829f).f1468a == i7) {
                return i12;
            }
            int i13 = this.f829f;
            do {
                i13++;
                if (i13 <= s()) {
                    k = k(i13);
                    i12 += k.f1231b;
                }
            } while (k.f1468a != i7);
            return i12;
        }
        int i14 = this.f825b.i(this.g);
        i3 k7 = k(this.g);
        if (k7.f1468a == i7) {
            i10 = k7.f1232c;
        } else {
            int i15 = this.g;
            do {
                i15--;
                if (i15 >= this.k) {
                    i14 -= k7.f1231b;
                    k7 = k(i15);
                }
            } while (k7.f1468a != i7);
            i10 = k7.f1232c;
        }
        return i14 - i10;
        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final boolean w(int i7, boolean z8) {
        int i10;
        int i11;
        int i12;
        C2054g c2054g = this.j;
        if (c2054g.h() == 0) {
            return false;
        }
        int i13 = this.f829f;
        if (i13 < 0) {
            int i14 = this.f831i;
            i10 = i14 != -1 ? i14 : 0;
            if (i10 <= s()) {
                int i15 = this.k;
                if (i10 >= i15 - 1) {
                    if (i10 < i15) {
                        return false;
                    }
                    i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    i12 = 0;
                }
            }
            c2054g.g(c2054g.h());
            return false;
        }
        i11 = this.f825b.i(i13);
        i12 = k(this.f829f).f1231b;
        i10 = this.f829f - 1;
        int max = Math.max(((N0) this.f825b.f964a).f914w, this.k);
        while (i10 >= max) {
            i3 k = k(i10);
            int i16 = k.f1468a;
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            int g = t5.g(i10, false, objArr, false);
            if (g != k.f1232c) {
                c2054g.g((i10 + 1) - this.k);
                this.k = this.f829f;
                this.f1261l = objArr[0];
                this.f1262m = g;
                return false;
            }
            this.f829f = i10;
            if (this.g < 0) {
                this.g = i10;
            }
            this.f825b.f(objArr[0], i10, g, i16, i11 - i12);
            if (!z8 && d(i7)) {
                return true;
            }
            i11 = this.f825b.i(i10);
            i12 = k.f1231b;
            if (i16 == 0 && z8) {
                return true;
            }
            i10--;
        }
        return false;
    }

    public final int x(int i7, int i10, int i11) {
        int i12 = this.f829f;
        if (i12 >= 0 && (i12 != this.k || i12 != i7 + 1)) {
            throw new IllegalStateException();
        }
        int i13 = this.k;
        i3 k = i13 >= 0 ? k(i13) : null;
        int i14 = this.f825b.i(this.k);
        i3 i3Var = new i3(i10, 0);
        C2054g c2054g = this.j;
        int i15 = (c2054g.f24673a - 1) & c2054g.f24675c;
        c2054g.f24673a = i15;
        c2054g.f24676d[i15] = i3Var;
        if (i15 == c2054g.f24674b) {
            c2054g.c();
        }
        Object obj = this.f1261l;
        if (obj != null) {
            i3Var.f1232c = this.f1262m;
            this.f1261l = null;
        } else {
            T t5 = this.f825b;
            Object[] objArr = this.f824a;
            i3Var.f1232c = t5.g(i7, false, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        this.f829f = i7;
        this.k = i7;
        if (this.g < 0) {
            this.g = i7;
        }
        int i16 = !this.f826c ? i11 - i3Var.f1232c : i11 + i3Var.f1232c;
        if (k != null) {
            k.f1231b = i14 - i16;
        }
        this.f825b.f(obj2, i7, i3Var.f1232c, i10, i16);
        return i3Var.f1232c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb A[LOOP:2: B:55:0x00fb->B:69:0x011f, LOOP_START, PHI: r5 r8 r9
      0x00fb: PHI (r5v12 int) = (r5v6 int), (r5v17 int) binds: [B:54:0x00f9, B:69:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:54:0x00f9, B:69:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r9v8 int) = (r9v6 int), (r9v10 int) binds: [B:54:0x00f9, B:69:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(int i7, boolean z8) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15 = this.f829f;
        if (i15 < 0) {
            int i16 = this.f831i;
            i10 = i16 != -1 ? i16 : 0;
            i11 = (this.j.h() > 0 ? (k(this.k).f1468a + this.f828e) - 1 : i10) % this.f828e;
            z10 = false;
            i12 = 0;
        } else {
            if (i15 > this.k) {
                return false;
            }
            i10 = i15 - 1;
            i11 = k(i15).f1468a;
            int r10 = r(false);
            if (r10 < 0) {
                i11--;
                i12 = Integer.MAX_VALUE;
                for (int i17 = this.f828e - 1; i17 >= 0; i17--) {
                    i12 = this.f826c ? u(i17) : v(i17);
                    if (i12 != Integer.MAX_VALUE) {
                        break;
                    }
                }
            } else {
                i12 = this.f826c ? g(null, r10, true) : i(null, r10, false);
            }
            if (!this.f826c ? v(i11) <= i12 : u(i11) >= i12) {
                i11--;
                if (i11 < 0) {
                    i11 = this.f828e - 1;
                    i12 = this.f826c ? f(true, null) : h(false, null);
                }
            }
            z10 = true;
        }
        boolean z11 = false;
        loop1: while (true) {
            if (i11 >= 0) {
                if (i10 < 0 || (!z8 && d(i7))) {
                    break;
                }
                int u3 = this.f826c ? u(i11) : v(i11);
                if (u3 == Integer.MAX_VALUE || u3 == Integer.MIN_VALUE) {
                    if (i11 == this.f828e - 1) {
                        u3 = this.f826c ? u(0) : v(0);
                        if (u3 != Integer.MAX_VALUE && u3 != Integer.MIN_VALUE) {
                            if (this.f826c) {
                                i14 = this.f827d;
                                u3 += i14;
                            } else {
                                i13 = this.f827d;
                                i14 = -i13;
                                u3 += i14;
                            }
                        }
                    } else {
                        u3 = this.f826c ? v(i11 + 1) : u(i11 + 1);
                    }
                    int i18 = i10 - 1;
                    int x2 = x(i10, i11, u3);
                    if (z10) {
                        while (true) {
                            if (!this.f826c) {
                                if (u3 - x2 <= i12) {
                                    break;
                                }
                                if (i18 < 0) {
                                    break loop1;
                                }
                                break loop1;
                            }
                            if (u3 + x2 >= i12) {
                                break;
                            }
                            if (i18 < 0 || (!z8 && d(i7))) {
                                break loop1;
                            }
                            u3 += this.f826c ? x2 + this.f827d : (-x2) - this.f827d;
                            int i19 = i18 - 1;
                            int x10 = x(i18, i11, u3);
                            i18 = i19;
                            x2 = x10;
                        }
                    } else {
                        z10 = true;
                        i12 = this.f826c ? u(i11) : v(i11);
                    }
                    i10 = i18;
                    i11--;
                    z11 = true;
                } else if (this.f826c) {
                    i14 = this.f827d;
                    u3 += i14;
                    int i182 = i10 - 1;
                    int x22 = x(i10, i11, u3);
                    if (z10) {
                    }
                    i10 = i182;
                    i11--;
                    z11 = true;
                } else {
                    i13 = this.f827d;
                    i14 = -i13;
                    u3 += i14;
                    int i1822 = i10 - 1;
                    int x222 = x(i10, i11, u3);
                    if (z10) {
                    }
                    i10 = i1822;
                    i11--;
                    z11 = true;
                }
            } else {
                if (z8) {
                    return z11;
                }
                i12 = this.f826c ? f(true, null) : h(false, null);
                i11 = this.f828e - 1;
            }
        }
    }
}
