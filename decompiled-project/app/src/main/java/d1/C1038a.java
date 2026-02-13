package d1;

import h3.o;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f16314s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f16315t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f16316u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f16317v0;

    @Override // d1.d
    public final boolean A() {
        return this.f16317v0;
    }

    @Override // d1.d
    public final boolean B() {
        return this.f16317v0;
    }

    public final boolean T() {
        int i7;
        int i10;
        int i11;
        boolean z8 = true;
        int i12 = 0;
        while (true) {
            i7 = this.f16482r0;
            if (i12 >= i7) {
                break;
            }
            d dVar = this.f16481q0[i12];
            if ((this.f16315t0 || dVar.c()) && ((((i10 = this.f16314s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f16314s0) == 2 || i11 == 3) && !dVar.B()))) {
                z8 = false;
            }
            i12++;
        }
        if (!z8 || i7 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f16482r0; i14++) {
            d dVar2 = this.f16481q0[i14];
            if (this.f16315t0 || dVar2.c()) {
                if (!z10) {
                    int i15 = this.f16314s0;
                    if (i15 == 0) {
                        i13 = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        i13 = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        i13 = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        i13 = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i16 = this.f16314s0;
                if (i16 == 0) {
                    i13 = Math.min(i13, dVar2.i(2).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, dVar2.i(4).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, dVar2.i(3).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, dVar2.i(5).d());
                }
            }
        }
        int i17 = i13 + this.f16316u0;
        int i18 = this.f16314s0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f16317v0 = true;
        return true;
    }

    public final int U() {
        int i7 = this.f16314s0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // d1.d
    public final void b(b1.c cVar, boolean z8) {
        boolean z10;
        int i7;
        int i10;
        C1040c[] c1040cArr = this.f16355Q;
        C1040c c1040c = this.f16348I;
        c1040cArr[0] = c1040c;
        C1040c c1040c2 = this.f16349J;
        int i11 = 2;
        c1040cArr[2] = c1040c2;
        C1040c c1040c3 = this.f16350K;
        c1040cArr[1] = c1040c3;
        C1040c c1040c4 = this.L;
        c1040cArr[3] = c1040c4;
        for (C1040c c1040c5 : c1040cArr) {
            c1040c5.f16339i = cVar.k(c1040c5);
        }
        int i12 = this.f16314s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        C1040c c1040c6 = c1040cArr[i12];
        if (!this.f16317v0) {
            T();
        }
        if (this.f16317v0) {
            this.f16317v0 = false;
            int i13 = this.f16314s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(c1040c.f16339i, this.f16363Y);
                cVar.d(c1040c3.f16339i, this.f16363Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(c1040c2.f16339i, this.f16364Z);
                    cVar.d(c1040c4.f16339i, this.f16364Z);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f16482r0; i14++) {
            d dVar = this.f16481q0[i14];
            if ((this.f16315t0 || dVar.c()) && ((((i10 = this.f16314s0) == 0 || i10 == 1) && dVar.f16393p0[0] == 3 && dVar.f16348I.f16337f != null && dVar.f16350K.f16337f != null) || ((i10 == 2 || i10 == 3) && dVar.f16393p0[1] == 3 && dVar.f16349J.f16337f != null && dVar.L.f16337f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = c1040c.g() || c1040c3.g();
        boolean z12 = c1040c2.g() || c1040c4.g();
        int i15 = (z10 || !(((i7 = this.f16314s0) == 0 && z11) || ((i7 == 2 && z12) || ((i7 == 1 && z11) || (i7 == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f16482r0) {
            d dVar2 = this.f16481q0[i16];
            if (this.f16315t0 || dVar2.c()) {
                b1.f k = cVar.k(dVar2.f16355Q[this.f16314s0]);
                int i17 = this.f16314s0;
                C1040c c1040c7 = dVar2.f16355Q[i17];
                c1040c7.f16339i = k;
                C1040c c1040c8 = c1040c7.f16337f;
                int i18 = (c1040c8 == null || c1040c8.f16335d != this) ? 0 : c1040c7.g;
                if (i17 == 0 || i17 == i11) {
                    b1.f fVar = c1040c6.f16339i;
                    int i19 = this.f16316u0 - i18;
                    b1.b l10 = cVar.l();
                    b1.f m10 = cVar.m();
                    m10.f13805d = 0;
                    l10.c(fVar, k, m10, i19);
                    cVar.c(l10);
                } else {
                    b1.f fVar2 = c1040c6.f16339i;
                    int i20 = this.f16316u0 + i18;
                    b1.b l11 = cVar.l();
                    b1.f m11 = cVar.m();
                    m11.f13805d = 0;
                    l11.b(fVar2, k, m11, i20);
                    cVar.c(l11);
                }
                cVar.e(c1040c6.f16339i, k, this.f16316u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f16314s0;
        if (i21 == 0) {
            cVar.e(c1040c3.f16339i, c1040c.f16339i, 0, 8);
            cVar.e(c1040c.f16339i, this.f16358T.f16350K.f16339i, 0, 4);
            cVar.e(c1040c.f16339i, this.f16358T.f16348I.f16339i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(c1040c.f16339i, c1040c3.f16339i, 0, 8);
            cVar.e(c1040c.f16339i, this.f16358T.f16348I.f16339i, 0, 4);
            cVar.e(c1040c.f16339i, this.f16358T.f16350K.f16339i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(c1040c4.f16339i, c1040c2.f16339i, 0, 8);
            cVar.e(c1040c2.f16339i, this.f16358T.L.f16339i, 0, 4);
            cVar.e(c1040c2.f16339i, this.f16358T.f16349J.f16339i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(c1040c2.f16339i, c1040c4.f16339i, 0, 8);
            cVar.e(c1040c2.f16339i, this.f16358T.f16349J.f16339i, 0, 4);
            cVar.e(c1040c2.f16339i, this.f16358T.L.f16339i, 0, 0);
        }
    }

    @Override // d1.d
    public final boolean c() {
        return true;
    }

    @Override // d1.d
    public final String toString() {
        String p10 = o.p(new StringBuilder("[Barrier] "), this.f16379h0, " {");
        for (int i7 = 0; i7 < this.f16482r0; i7++) {
            d dVar = this.f16481q0[i7];
            if (i7 > 0) {
                p10 = X.c.h(p10, ", ");
            }
            StringBuilder m10 = X.c.m(p10);
            m10.append(dVar.f16379h0);
            p10 = m10.toString();
        }
        return X.c.h(p10, "}");
    }
}
