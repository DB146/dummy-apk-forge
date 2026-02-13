package P4;

import m4.E0;
import m5.C1620q;

/* renamed from: P4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470s implements InterfaceC0476y, InterfaceC0475x {

    /* renamed from: a, reason: collision with root package name */
    public final B f8131a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8132b;

    /* renamed from: c, reason: collision with root package name */
    public final C1620q f8133c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0453a f8134d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0476y f8135e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0475x f8136f;

    /* renamed from: u, reason: collision with root package name */
    public long f8137u = -9223372036854775807L;

    public C0470s(B b2, C1620q c1620q, long j) {
        this.f8131a = b2;
        this.f8133c = c1620q;
        this.f8132b = j;
    }

    @Override // P4.InterfaceC0475x
    public final void a(InterfaceC0476y interfaceC0476y) {
        InterfaceC0475x interfaceC0475x = this.f8136f;
        int i7 = n5.D.f21141a;
        interfaceC0475x.a(this);
    }

    public final void b(B b2) {
        long j = this.f8137u;
        if (j == -9223372036854775807L) {
            j = this.f8132b;
        }
        AbstractC0453a abstractC0453a = this.f8134d;
        abstractC0453a.getClass();
        InterfaceC0476y b10 = abstractC0453a.b(b2, this.f8133c, j);
        this.f8135e = b10;
        if (this.f8136f != null) {
            b10.q(this, j);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.c(j, e02);
    }

    @Override // P4.f0
    public final boolean d() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        return interfaceC0476y != null && interfaceC0476y.d();
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        InterfaceC0475x interfaceC0475x = this.f8136f;
        int i7 = n5.D.f21141a;
        interfaceC0475x.i(this);
    }

    @Override // P4.f0
    public final long j() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.j();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.k();
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.l();
    }

    @Override // P4.f0
    public final long n() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.n();
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        if (interfaceC0476y != null) {
            interfaceC0476y.o();
            return;
        }
        AbstractC0453a abstractC0453a = this.f8134d;
        if (abstractC0453a != null) {
            abstractC0453a.k();
        }
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f8136f = interfaceC0475x;
        InterfaceC0476y interfaceC0476y = this.f8135e;
        if (interfaceC0476y != null) {
            long j10 = this.f8137u;
            if (j10 == -9223372036854775807L) {
                j10 = this.f8132b;
            }
            interfaceC0476y.q(this, j10);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.r(j);
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        interfaceC0476y.s(j);
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        long j10;
        long j11 = this.f8137u;
        if (j11 == -9223372036854775807L || j != this.f8132b) {
            j10 = j;
        } else {
            this.f8137u = -9223372036854775807L;
            j10 = j11;
        }
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        return interfaceC0476y.v(sVarArr, zArr, d0VarArr, zArr2, j10);
    }

    @Override // P4.f0
    public final boolean x(long j) {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        return interfaceC0476y != null && interfaceC0476y.x(j);
    }

    @Override // P4.f0
    public final void y(long j) {
        InterfaceC0476y interfaceC0476y = this.f8135e;
        int i7 = n5.D.f21141a;
        interfaceC0476y.y(j);
    }
}
