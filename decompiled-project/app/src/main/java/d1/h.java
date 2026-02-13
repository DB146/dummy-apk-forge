package d1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f16475q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f16476r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f16477s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C1040c f16478t0 = this.f16349J;

    /* renamed from: u0, reason: collision with root package name */
    public int f16479u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f16480v0;

    public h() {
        this.f16356R.clear();
        this.f16356R.add(this.f16478t0);
        int length = this.f16355Q.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f16355Q[i7] = this.f16478t0;
        }
    }

    @Override // d1.d
    public final boolean A() {
        return this.f16480v0;
    }

    @Override // d1.d
    public final boolean B() {
        return this.f16480v0;
    }

    @Override // d1.d
    public final void Q(b1.c cVar, boolean z8) {
        if (this.f16358T == null) {
            return;
        }
        C1040c c1040c = this.f16478t0;
        cVar.getClass();
        int n6 = b1.c.n(c1040c);
        if (this.f16479u0 == 1) {
            this.f16363Y = n6;
            this.f16364Z = 0;
            L(this.f16358T.k());
            O(0);
            return;
        }
        this.f16363Y = 0;
        this.f16364Z = n6;
        O(this.f16358T.q());
        L(0);
    }

    public final void R(int i7) {
        this.f16478t0.l(i7);
        this.f16480v0 = true;
    }

    public final void S(int i7) {
        if (this.f16479u0 == i7) {
            return;
        }
        this.f16479u0 = i7;
        ArrayList arrayList = this.f16356R;
        arrayList.clear();
        if (this.f16479u0 == 1) {
            this.f16478t0 = this.f16348I;
        } else {
            this.f16478t0 = this.f16349J;
        }
        arrayList.add(this.f16478t0);
        C1040c[] c1040cArr = this.f16355Q;
        int length = c1040cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c1040cArr[i10] = this.f16478t0;
        }
    }

    @Override // d1.d
    public final void b(b1.c cVar, boolean z8) {
        e eVar = (e) this.f16358T;
        if (eVar == null) {
            return;
        }
        Object i7 = eVar.i(2);
        Object i10 = eVar.i(4);
        d dVar = this.f16358T;
        boolean z10 = dVar != null && dVar.f16393p0[0] == 2;
        if (this.f16479u0 == 0) {
            i7 = eVar.i(3);
            i10 = eVar.i(5);
            d dVar2 = this.f16358T;
            z10 = dVar2 != null && dVar2.f16393p0[1] == 2;
        }
        if (this.f16480v0) {
            C1040c c1040c = this.f16478t0;
            if (c1040c.f16334c) {
                b1.f k = cVar.k(c1040c);
                cVar.d(k, this.f16478t0.d());
                if (this.f16476r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(i10), k, 0, 5);
                    }
                } else if (this.f16477s0 != -1 && z10) {
                    b1.f k7 = cVar.k(i10);
                    cVar.f(k, cVar.k(i7), 0, 5);
                    cVar.f(k7, k, 0, 5);
                }
                this.f16480v0 = false;
                return;
            }
        }
        if (this.f16476r0 != -1) {
            b1.f k10 = cVar.k(this.f16478t0);
            cVar.e(k10, cVar.k(i7), this.f16476r0, 8);
            if (z10) {
                cVar.f(cVar.k(i10), k10, 0, 5);
                return;
            }
            return;
        }
        if (this.f16477s0 != -1) {
            b1.f k11 = cVar.k(this.f16478t0);
            b1.f k12 = cVar.k(i10);
            cVar.e(k11, k12, -this.f16477s0, 8);
            if (z10) {
                cVar.f(k11, cVar.k(i7), 0, 5);
                cVar.f(k12, k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f16475q0 != -1.0f) {
            b1.f k13 = cVar.k(this.f16478t0);
            b1.f k14 = cVar.k(i10);
            float f4 = this.f16475q0;
            b1.b l10 = cVar.l();
            l10.f13781d.g(k13, -1.0f);
            l10.f13781d.g(k14, f4);
            cVar.c(l10);
        }
    }

    @Override // d1.d
    public final boolean c() {
        return true;
    }

    @Override // d1.d
    public final C1040c i(int i7) {
        int b2 = P.c.b(i7);
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f16479u0 == 0) {
                return this.f16478t0;
            }
            return null;
        }
        if (this.f16479u0 == 1) {
            return this.f16478t0;
        }
        return null;
    }
}
