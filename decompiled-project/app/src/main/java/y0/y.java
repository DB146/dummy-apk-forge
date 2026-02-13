package y0;

import A0.U;
import A0.n0;
import i0.C1289b;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class y implements InterfaceC2345m {

    /* renamed from: a, reason: collision with root package name */
    public final U f26634a;

    public y(U u3) {
        this.f26634a = u3;
    }

    @Override // y0.InterfaceC2345m
    public final long A(long j) {
        U u3 = this.f26634a;
        n0 n0Var = u3.f124z;
        U h10 = AbstractC2328M.h(u3);
        return n0Var.A(C1289b.e(0L, C1289b.d(a(h10.f121C, 0L), u3.f124z.C0(h10.f124z, 0L))));
    }

    public final long a(InterfaceC2345m interfaceC2345m, long j) {
        boolean z8 = interfaceC2345m instanceof y;
        U u3 = this.f26634a;
        if (!z8) {
            U h10 = AbstractC2328M.h(u3);
            long a9 = a(h10.f121C, j);
            long j10 = h10.f119A;
            long d10 = C1289b.d(a9, (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            n0 n0Var = h10.f124z;
            if (!n0Var.t0().f14112B) {
                AbstractC2256a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            n0Var.E0();
            n0 n0Var2 = n0Var.f275B;
            if (n0Var2 != null) {
                n0Var = n0Var2;
            }
            return C1289b.e(d10, n0Var.C0(interfaceC2345m, 0L));
        }
        U u10 = ((y) interfaceC2345m).f26634a;
        u10.f124z.E0();
        U r02 = u3.f124z.o0(u10.f124z).r0();
        if (r02 != null) {
            long b2 = V0.i.b(V0.i.c(u10.k0(r02, false), Z9.x.O(j)), u3.k0(r02, false));
            return (Float.floatToRawIntBits((int) (b2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L);
        }
        U h11 = AbstractC2328M.h(u10);
        long c10 = V0.i.c(V0.i.c(u10.k0(h11, false), h11.f119A), Z9.x.O(j));
        U h12 = AbstractC2328M.h(u3);
        long b10 = V0.i.b(c10, V0.i.c(u3.k0(h12, false), h12.f119A));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b10 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L;
        n0 n0Var3 = h12.f124z.f275B;
        kotlin.jvm.internal.l.b(n0Var3);
        n0 n0Var4 = h11.f124z.f275B;
        kotlin.jvm.internal.l.b(n0Var4);
        return n0Var3.C0(n0Var4, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // y0.InterfaceC2345m
    public final long c(long j) {
        U u3 = this.f26634a;
        n0 n0Var = u3.f124z;
        U h10 = AbstractC2328M.h(u3);
        return n0Var.c(C1289b.e(j, C1289b.d(a(h10.f121C, 0L), u3.f124z.C0(h10.f124z, 0L))));
    }

    @Override // y0.InterfaceC2345m
    public final InterfaceC2345m e() {
        U r02;
        if (!w()) {
            AbstractC2256a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        n0 n0Var = ((n0) this.f26634a.f124z.f293z.f60S.f227d).f275B;
        if (n0Var == null || (r02 = n0Var.r0()) == null) {
            return null;
        }
        return r02.f121C;
    }

    @Override // y0.InterfaceC2345m
    public final boolean w() {
        return this.f26634a.f124z.t0().f14112B;
    }

    @Override // y0.InterfaceC2345m
    public final i0.c x(InterfaceC2345m interfaceC2345m, boolean z8) {
        return this.f26634a.f124z.x(interfaceC2345m, z8);
    }

    @Override // y0.InterfaceC2345m
    public final long z() {
        U u3 = this.f26634a;
        return (u3.f26554a << 32) | (u3.f26555b & 4294967295L);
    }
}
