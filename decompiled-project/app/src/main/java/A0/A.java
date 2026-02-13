package A0;

import android.graphics.Paint;
import j0.AbstractC1362A;
import m0.C1533b;
import u.C2041D;
import y0.AbstractC2323H;
import y0.C2344l;

/* loaded from: classes.dex */
public final class A extends n0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final E5.o f8a0;

    /* renamed from: Y, reason: collision with root package name */
    public InterfaceC0035y f9Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0036z f10Z;

    static {
        E5.o e2 = AbstractC1362A.e();
        e2.d(j0.n.f18551e);
        ((Paint) e2.f3713b).setStrokeWidth(1.0f);
        e2.i(1);
        f8a0 = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(L l10, InterfaceC0035y interfaceC0035y) {
        super(l10);
        this.f9Y = interfaceC0035y;
        this.f10Z = l10.f78v != null ? new C0036z(this) : null;
        if ((((c0.l) interfaceC0035y).f14113a.f14115c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // A0.n0
    public final void I0(j0.l lVar, C1533b c1533b) {
        n0 n0Var = this.f274A;
        kotlin.jvm.internal.l.b(n0Var);
        n0Var.l0(lVar, c1533b);
        if (((B0.D) O.a(this.f293z)).getShowLayoutBounds()) {
            long j = this.f26556c;
            lVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f8a0);
        }
    }

    @Override // y0.AbstractC2323H
    public final void M(long j, float f4, Rb.c cVar) {
        J0(j, f4, cVar);
        if (this.f114u) {
            return;
        }
        G0();
        c0().b();
        kotlin.jvm.internal.l.b(this.f274A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P0(InterfaceC0035y interfaceC0035y) {
        if (!interfaceC0035y.equals(this.f9Y) && (((c0.l) interfaceC0035y).f14113a.f14115c & 512) != 0) {
            throw new ClassCastException();
        }
        this.f9Y = interfaceC0035y;
    }

    @Override // A0.T
    public final int R(C2344l c2344l) {
        C0036z c0036z = this.f10Z;
        if (c0036z == null) {
            return AbstractC0017g.c(this, c2344l);
        }
        C2041D c2041d = c0036z.f123E;
        int d10 = c2041d.d(c2344l);
        if (d10 >= 0) {
            return c2041d.f24580c[d10];
        }
        return Integer.MIN_VALUE;
    }

    @Override // y0.z
    public final AbstractC2323H b(long j) {
        O(j);
        InterfaceC0035y interfaceC0035y = this.f9Y;
        n0 n0Var = this.f274A;
        kotlin.jvm.internal.l.b(n0Var);
        L0(interfaceC0035y.e(this, n0Var, j));
        F0();
        return this;
    }

    @Override // A0.n0
    public final void n0() {
        if (this.f10Z == null) {
            this.f10Z = new C0036z(this);
        }
    }

    @Override // A0.n0
    public final U r0() {
        return this.f10Z;
    }

    @Override // A0.n0
    public final c0.l t0() {
        return ((c0.l) this.f9Y).f14113a;
    }
}
