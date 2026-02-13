package B0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import i0.C1288a;
import j0.AbstractC1362A;
import j0.AbstractC1365c;
import m0.C1533b;

/* loaded from: classes.dex */
public final class S0 implements A0.s0 {

    /* renamed from: A, reason: collision with root package name */
    public int f1782A;

    /* renamed from: a, reason: collision with root package name */
    public final D f1783a;

    /* renamed from: b, reason: collision with root package name */
    public Rb.e f1784b;

    /* renamed from: c, reason: collision with root package name */
    public A0.k0 f1785c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1786d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1788f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1789u;

    /* renamed from: v, reason: collision with root package name */
    public E5.o f1790v;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC0211x0 f1794z;

    /* renamed from: e, reason: collision with root package name */
    public final N0 f1787e = new N0();

    /* renamed from: w, reason: collision with root package name */
    public final I0 f1791w = new I0(N.f1753d);

    /* renamed from: x, reason: collision with root package name */
    public final j0.m f1792x = new j0.m();

    /* renamed from: y, reason: collision with root package name */
    public long f1793y = j0.G.f18526b;

    public S0(D d10, Rb.e eVar, A0.k0 k0Var) {
        this.f1783a = d10;
        this.f1784b = eVar;
        this.f1785c = k0Var;
        InterfaceC0211x0 q02 = Build.VERSION.SDK_INT >= 29 ? new Q0() : new P0(d10);
        q02.H();
        q02.v(false);
        this.f1794z = q02;
    }

    @Override // A0.s0
    public final long a(long j, boolean z8) {
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        I0 i02 = this.f1791w;
        if (!z8) {
            return !i02.f1696d ? AbstractC1362A.s(j, i02.b(interfaceC0211x0)) : j;
        }
        boolean z10 = i02.f1694b;
        float[] fArr = (float[]) i02.f1699h;
        if (z10) {
            i02.f1695c = X.h(i02.b(interfaceC0211x0), fArr);
            i02.f1694b = false;
        }
        if (!i02.f1695c) {
            fArr = null;
        }
        if (fArr == null) {
            return 9187343241974906880L;
        }
        return !i02.f1696d ? AbstractC1362A.s(j, fArr) : j;
    }

    @Override // A0.s0
    public final void b(long j) {
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        float b2 = j0.G.b(this.f1793y) * i7;
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        interfaceC0211x0.u(b2);
        interfaceC0211x0.z(j0.G.c(this.f1793y) * i10);
        if (interfaceC0211x0.w(interfaceC0211x0.e(), interfaceC0211x0.t(), interfaceC0211x0.e() + i7, interfaceC0211x0.t() + i10)) {
            interfaceC0211x0.F(this.f1787e.b());
            if (!this.f1786d && !this.f1788f) {
                this.f1783a.invalidate();
                j(true);
            }
            this.f1791w.d();
        }
    }

    @Override // A0.s0
    public final void c(C1288a c1288a, boolean z8) {
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        I0 i02 = this.f1791w;
        if (!z8) {
            float[] b2 = i02.b(interfaceC0211x0);
            if (i02.f1696d) {
                return;
            }
            AbstractC1362A.t(b2, c1288a);
            return;
        }
        boolean z10 = i02.f1694b;
        float[] fArr = (float[]) i02.f1699h;
        if (z10) {
            i02.f1695c = X.h(i02.b(interfaceC0211x0), fArr);
            i02.f1694b = false;
        }
        if (!i02.f1695c) {
            fArr = null;
        }
        if (fArr != null) {
            if (i02.f1696d) {
                return;
            }
            AbstractC1362A.t(fArr, c1288a);
        } else {
            c1288a.f18168a = 0.0f;
            c1288a.f18169b = 0.0f;
            c1288a.f18170c = 0.0f;
            c1288a.f18171d = 0.0f;
        }
    }

    @Override // A0.s0
    public final void d(j0.B b2) {
        A0.k0 k0Var;
        int i7 = b2.f18499a | this.f1782A;
        int i10 = i7 & 4096;
        if (i10 != 0) {
            this.f1793y = b2.f18507w;
        }
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        boolean B10 = interfaceC0211x0.B();
        N0 n02 = this.f1787e;
        boolean z8 = false;
        boolean z10 = B10 && n02.g;
        if ((i7 & 1) != 0) {
            interfaceC0211x0.h(b2.f18500b);
        }
        if ((i7 & 2) != 0) {
            interfaceC0211x0.l(b2.f18501c);
        }
        if ((i7 & 4) != 0) {
            interfaceC0211x0.c(b2.f18502d);
        }
        if ((i7 & 8) != 0) {
            interfaceC0211x0.j();
        }
        if ((i7 & 16) != 0) {
            interfaceC0211x0.f();
        }
        if ((i7 & 32) != 0) {
            interfaceC0211x0.A(b2.f18503e);
        }
        if ((i7 & 64) != 0) {
            interfaceC0211x0.y(AbstractC1362A.z(b2.f18504f));
        }
        if ((i7 & 128) != 0) {
            interfaceC0211x0.G(AbstractC1362A.z(b2.f18505u));
        }
        if ((i7 & 1024) != 0) {
            interfaceC0211x0.k();
        }
        if ((i7 & 256) != 0) {
            interfaceC0211x0.b();
        }
        if ((i7 & 512) != 0) {
            interfaceC0211x0.g();
        }
        if ((i7 & 2048) != 0) {
            interfaceC0211x0.n(b2.f18506v);
        }
        if (i10 != 0) {
            interfaceC0211x0.u(j0.G.b(this.f1793y) * interfaceC0211x0.getWidth());
            interfaceC0211x0.z(j0.G.c(this.f1793y) * interfaceC0211x0.getHeight());
        }
        boolean z11 = b2.f18509y;
        Y5.A a9 = AbstractC1362A.f18492a;
        boolean z12 = z11 && b2.f18508x != a9;
        if ((i7 & 24576) != 0) {
            interfaceC0211x0.D(z12);
            interfaceC0211x0.v(b2.f18509y && b2.f18508x == a9);
        }
        if ((131072 & i7) != 0) {
            interfaceC0211x0.d();
        }
        if ((32768 & i7) != 0) {
            interfaceC0211x0.x();
        }
        boolean d10 = this.f1787e.d(b2.f18498C, b2.f18502d, z12, b2.f18503e, b2.f18510z);
        if (n02.f1761f) {
            interfaceC0211x0.F(n02.b());
        }
        if (z12 && n02.g) {
            z8 = true;
        }
        D d11 = this.f1783a;
        if (z10 != z8 || (z8 && d10)) {
            if (!this.f1786d && !this.f1788f) {
                d11.invalidate();
                j(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = d11.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(d11, d11);
            }
        } else {
            d11.invalidate();
        }
        if (!this.f1789u && interfaceC0211x0.J() > 0.0f && (k0Var = this.f1785c) != null) {
            k0Var.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f1791w.d();
        }
        this.f1782A = b2.f18499a;
    }

    @Override // A0.s0
    public final void destroy() {
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        if (interfaceC0211x0.o()) {
            interfaceC0211x0.i();
        }
        this.f1784b = null;
        this.f1785c = null;
        this.f1788f = true;
        j(false);
        D d10 = this.f1783a;
        d10.f1608R = true;
        d10.E(this);
    }

    @Override // A0.s0
    public final void e(Rb.e eVar, A0.k0 k0Var) {
        I0 i02 = this.f1791w;
        i02.f1693a = false;
        i02.f1694b = false;
        i02.f1696d = true;
        i02.f1695c = true;
        AbstractC1362A.u((float[]) i02.g);
        AbstractC1362A.u((float[]) i02.f1699h);
        j(false);
        this.f1788f = false;
        this.f1789u = false;
        this.f1793y = j0.G.f18526b;
        this.f1784b = eVar;
        this.f1785c = k0Var;
    }

    @Override // A0.s0
    public final void f(long j) {
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        int e2 = interfaceC0211x0.e();
        int t5 = interfaceC0211x0.t();
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (e2 == i7 && t5 == i10) {
            return;
        }
        if (e2 != i7) {
            interfaceC0211x0.p(i7 - e2);
        }
        if (t5 != i10) {
            interfaceC0211x0.C(i10 - t5);
        }
        int i11 = Build.VERSION.SDK_INT;
        D d10 = this.f1783a;
        if (i11 >= 26) {
            ViewParent parent = d10.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(d10, d10);
            }
        } else {
            d10.invalidate();
        }
        this.f1791w.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // A0.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        j0.z zVar;
        Rb.e eVar;
        boolean z8 = this.f1786d;
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        if (z8 || !interfaceC0211x0.o()) {
            if (interfaceC0211x0.B()) {
                N0 n02 = this.f1787e;
                if (n02.g) {
                    n02.e();
                    zVar = n02.f1760e;
                    eVar = this.f1784b;
                    if (eVar != null) {
                        interfaceC0211x0.E(this.f1792x, zVar, new R0(eVar, 0));
                    }
                    j(false);
                }
            }
            zVar = null;
            eVar = this.f1784b;
            if (eVar != null) {
            }
            j(false);
        }
    }

    @Override // A0.s0
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f1791w.b(this.f1794z);
    }

    @Override // A0.s0
    public final void h(j0.l lVar, C1533b c1533b) {
        Canvas a9 = AbstractC1365c.a(lVar);
        boolean isHardwareAccelerated = a9.isHardwareAccelerated();
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        if (isHardwareAccelerated) {
            g();
            boolean z8 = interfaceC0211x0.J() > 0.0f;
            this.f1789u = z8;
            if (z8) {
                lVar.o();
            }
            interfaceC0211x0.s(a9);
            if (this.f1789u) {
                lVar.j();
                return;
            }
            return;
        }
        float e2 = interfaceC0211x0.e();
        float t5 = interfaceC0211x0.t();
        float m10 = interfaceC0211x0.m();
        float q10 = interfaceC0211x0.q();
        if (interfaceC0211x0.a() < 1.0f) {
            E5.o oVar = this.f1790v;
            if (oVar == null) {
                oVar = AbstractC1362A.e();
                this.f1790v = oVar;
            }
            oVar.b(interfaceC0211x0.a());
            a9.saveLayer(e2, t5, m10, q10, (Paint) oVar.f3713b);
        } else {
            lVar.i();
        }
        lVar.f(e2, t5);
        lVar.n(this.f1791w.b(interfaceC0211x0));
        if (interfaceC0211x0.B() || interfaceC0211x0.r()) {
            this.f1787e.a(lVar);
        }
        Rb.e eVar = this.f1784b;
        if (eVar != null) {
            eVar.invoke(lVar, null);
        }
        lVar.g();
        j(false);
    }

    @Override // A0.s0
    public final boolean i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        InterfaceC0211x0 interfaceC0211x0 = this.f1794z;
        if (interfaceC0211x0.r()) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) interfaceC0211x0.getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) interfaceC0211x0.getHeight());
        }
        if (interfaceC0211x0.B()) {
            return this.f1787e.c(j);
        }
        return true;
    }

    @Override // A0.s0
    public final void invalidate() {
        if (this.f1786d || this.f1788f) {
            return;
        }
        this.f1783a.invalidate();
        j(true);
    }

    public final void j(boolean z8) {
        if (z8 != this.f1786d) {
            this.f1786d = z8;
            this.f1783a.v(this, z8);
        }
    }
}
