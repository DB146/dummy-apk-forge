package P4;

import A0.G0;
import android.net.Uri;
import android.os.Looper;
import m4.C1558a0;
import m4.L0;
import m5.C1620q;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import r4.C1941m;
import r4.InterfaceC1938j;
import s4.InterfaceC1985m;

/* loaded from: classes.dex */
public final class W extends AbstractC0453a {

    /* renamed from: A, reason: collision with root package name */
    public final Y5.B f7956A;

    /* renamed from: B, reason: collision with root package name */
    public final int f7957B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7958C;

    /* renamed from: D, reason: collision with root package name */
    public long f7959D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7960E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7961F;

    /* renamed from: G, reason: collision with root package name */
    public m5.T f7962G;

    /* renamed from: v, reason: collision with root package name */
    public final C1558a0 f7963v;

    /* renamed from: w, reason: collision with root package name */
    public final m4.V f7964w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1615l f7965x;

    /* renamed from: y, reason: collision with root package name */
    public final A1.d f7966y;

    /* renamed from: z, reason: collision with root package name */
    public final r4.q f7967z;

    public W(C1558a0 c1558a0, InterfaceC1615l interfaceC1615l, A1.d dVar, r4.q qVar, Y5.B b2, int i7) {
        m4.V v10 = c1558a0.f20224b;
        v10.getClass();
        this.f7964w = v10;
        this.f7963v = c1558a0;
        this.f7965x = interfaceC1615l;
        this.f7966y = dVar;
        this.f7967z = qVar;
        this.f7956A = b2;
        this.f7957B = i7;
        this.f7958C = true;
        this.f7959D = -9223372036854775807L;
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(B b2, C1620q c1620q, long j) {
        InterfaceC1616m e2 = this.f7965x.e();
        m5.T t5 = this.f7962G;
        if (t5 != null) {
            e2.a(t5);
        }
        m4.V v10 = this.f7964w;
        Uri uri = v10.f20177a;
        AbstractC1705a.n(this.f7984u);
        G0 g02 = new G0((InterfaceC1985m) this.f7966y.f330b);
        C1941m c1941m = new C1941m(this.f7981d.f23773c, 0, b2);
        A4.s a9 = a(b2);
        return new T(uri, e2, g02, this.f7967z, c1941m, this.f7956A, a9, this, c1620q, v10.f20182f, this.f7957B);
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f7963v;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
    }

    @Override // P4.AbstractC0453a
    public final void n(m5.T t5) {
        this.f7962G = t5;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        r4.q qVar = this.f7967z;
        qVar.b(myLooper, lVar);
        qVar.a();
        v();
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        T t5 = (T) interfaceC0476y;
        if (t5.f7922J) {
            for (c0 c0Var : t5.f7919G) {
                c0Var.h();
                InterfaceC1938j interfaceC1938j = c0Var.f8003h;
                if (interfaceC1938j != null) {
                    interfaceC1938j.a(c0Var.f8001e);
                    c0Var.f8003h = null;
                    c0Var.g = null;
                }
            }
        }
        t5.f7948y.e(t5);
        t5.f7916D.removeCallbacksAndMessages(null);
        t5.f7917E = null;
        t5.f7937Z = true;
    }

    @Override // P4.AbstractC0453a
    public final void r() {
        this.f7967z.release();
    }

    public final void v() {
        L0 h0Var = new h0(this.f7959D, this.f7960E, this.f7961F, this.f7963v);
        if (this.f7958C) {
            h0Var = new U(h0Var, 0);
        }
        o(h0Var);
    }

    public final void w(long j, boolean z8, boolean z10) {
        if (j == -9223372036854775807L) {
            j = this.f7959D;
        }
        if (!this.f7958C && this.f7959D == j && this.f7960E == z8 && this.f7961F == z10) {
            return;
        }
        this.f7959D = j;
        this.f7960E = z8;
        this.f7961F = z10;
        this.f7958C = false;
        v();
    }
}
