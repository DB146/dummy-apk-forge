package P4;

import m4.E0;

/* loaded from: classes.dex */
public final class K implements InterfaceC0476y, InterfaceC0475x {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0476y f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7871b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0475x f7872c;

    public K(InterfaceC0476y interfaceC0476y, long j) {
        this.f7870a = interfaceC0476y;
        this.f7871b = j;
    }

    @Override // P4.InterfaceC0475x
    public final void a(InterfaceC0476y interfaceC0476y) {
        InterfaceC0475x interfaceC0475x = this.f7872c;
        interfaceC0475x.getClass();
        interfaceC0475x.a(this);
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        long j10 = this.f7871b;
        return this.f7870a.c(j - j10, e02) + j10;
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f7870a.d();
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        InterfaceC0475x interfaceC0475x = this.f7872c;
        interfaceC0475x.getClass();
        interfaceC0475x.i(this);
    }

    @Override // P4.f0
    public final long j() {
        long j = this.f7870a.j();
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f7871b + j;
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        long k = this.f7870a.k();
        if (k == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f7871b + k;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        return this.f7870a.l();
    }

    @Override // P4.f0
    public final long n() {
        long n6 = this.f7870a.n();
        if (n6 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f7871b + n6;
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        this.f7870a.o();
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f7872c = interfaceC0475x;
        this.f7870a.q(this, j - this.f7871b);
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        long j10 = this.f7871b;
        return this.f7870a.r(j - j10) + j10;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        this.f7870a.s(j - this.f7871b);
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        d0[] d0VarArr2 = new d0[d0VarArr.length];
        int i7 = 0;
        while (true) {
            d0 d0Var = null;
            if (i7 >= d0VarArr.length) {
                break;
            }
            L l10 = (L) d0VarArr[i7];
            if (l10 != null) {
                d0Var = l10.f7873a;
            }
            d0VarArr2[i7] = d0Var;
            i7++;
        }
        long j10 = this.f7871b;
        long v10 = this.f7870a.v(sVarArr, zArr, d0VarArr2, zArr2, j - j10);
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            d0 d0Var2 = d0VarArr2[i10];
            if (d0Var2 == null) {
                d0VarArr[i10] = null;
            } else {
                d0 d0Var3 = d0VarArr[i10];
                if (d0Var3 == null || ((L) d0Var3).f7873a != d0Var2) {
                    d0VarArr[i10] = new L(d0Var2, j10);
                }
            }
        }
        return v10 + j10;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        return this.f7870a.x(j - this.f7871b);
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f7870a.y(j - this.f7871b);
    }
}
