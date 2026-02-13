package n4;

import N6.F;
import N6.H;
import N6.t0;
import N6.y0;
import P4.B;
import P4.C0474w;
import P4.C0477z;
import P4.I;
import P4.r;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import m4.C1549C;
import m4.C1558a0;
import m4.C1562c0;
import m4.C1581m;
import m4.C1591u;
import m4.C1595y;
import m4.G0;
import m4.J0;
import m4.K0;
import m4.L0;
import m4.N0;
import m4.q0;
import m4.s0;
import m4.u0;
import m4.v0;
import m4.w0;
import n5.AbstractC1705a;
import n5.D;
import n5.x;
import n5.z;
import o5.w;
import r4.n;

/* loaded from: classes.dex */
public final class f implements v0, I, n {

    /* renamed from: a, reason: collision with root package name */
    public final x f21086a;

    /* renamed from: b, reason: collision with root package name */
    public final J0 f21087b;

    /* renamed from: c, reason: collision with root package name */
    public final K0 f21088c;

    /* renamed from: d, reason: collision with root package name */
    public final T6.a f21089d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f21090e;

    /* renamed from: f, reason: collision with root package name */
    public n5.l f21091f;

    /* renamed from: u, reason: collision with root package name */
    public C1549C f21092u;

    /* renamed from: v, reason: collision with root package name */
    public z f21093v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21094w;

    /* JADX WARN: Type inference failed for: r0v2, types: [T6.a, java.lang.Object] */
    public f(x xVar) {
        xVar.getClass();
        this.f21086a = xVar;
        int i7 = D.f21141a;
        Looper myLooper = Looper.myLooper();
        this.f21091f = new n5.l(myLooper == null ? Looper.getMainLooper() : myLooper, xVar, new G0(20));
        J0 j02 = new J0();
        this.f21087b = j02;
        this.f21088c = new K0();
        ?? obj = new Object();
        obj.f9320a = j02;
        F f4 = H.f7232b;
        obj.f9321b = t0.f7341e;
        obj.f9322c = y0.f7368u;
        this.f21089d = obj;
        this.f21090e = new SparseArray();
    }

    @Override // m4.v0
    public final void A(int i7, int i10) {
        Q(P(), 24, new G0(11));
    }

    @Override // P4.I
    public final void B(int i7, B b2, r rVar, C0474w c0474w) {
        Q(O(i7, b2), 1002, new c(17));
    }

    @Override // r4.n
    public final void C(int i7, B b2) {
        Q(O(i7, b2), 1025, new c(15));
    }

    @Override // r4.n
    public final void D(int i7, B b2, Exception exc) {
        Q(O(i7, b2), 1024, new c(5));
    }

    @Override // P4.I
    public final void E(int i7, B b2, r rVar, C0474w c0474w) {
        Q(O(i7, b2), 1000, new c(0));
    }

    @Override // P4.I
    public final void F(int i7, B b2, r rVar, C0474w c0474w) {
        Q(O(i7, b2), 1001, new G0(8));
    }

    @Override // m4.v0
    public final void G(m4.t0 t0Var) {
        Q(d(), 13, new G0(15));
    }

    @Override // P4.I
    public final void H(int i7, B b2, C0474w c0474w) {
        Q(O(i7, b2), 1005, new c(4));
    }

    @Override // P4.I
    public final void I(int i7, B b2, C0474w c0474w) {
        C1703a O10 = O(i7, b2);
        Q(O10, 1004, new b(1, O10, c0474w));
    }

    @Override // m4.v0
    public final void J(w wVar) {
        C1703a P10 = P();
        Q(P10, 25, new C1595y(P10, wVar));
    }

    @Override // m4.v0
    public final void K(F4.c cVar) {
        Q(d(), 28, new c(9));
    }

    @Override // m4.v0
    public final void L(boolean z8) {
        Q(d(), 7, new c(18));
    }

    public final C1703a M(B b2) {
        this.f21092u.getClass();
        L0 l02 = b2 == null ? null : (L0) ((y0) this.f21089d.f9322c).get(b2);
        if (b2 != null && l02 != null) {
            return N(l02, l02.g(b2.f8157a, this.f21087b).f19965c, b2);
        }
        int U8 = this.f21092u.U();
        L0 Y2 = this.f21092u.Y();
        if (U8 >= Y2.o()) {
            Y2 = L0.f20097a;
        }
        return N(Y2, U8, null);
    }

    public final C1703a N(L0 l02, int i7, B b2) {
        B b10 = l02.p() ? null : b2;
        this.f21086a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z8 = l02.equals(this.f21092u.Y()) && i7 == this.f21092u.U();
        long j = 0;
        if (b10 == null || !b10.a()) {
            if (z8) {
                j = this.f21092u.Q();
            } else if (!l02.p()) {
                j = D.Z(l02.m(i7, this.f21088c, 0L).f20014A);
            }
        } else if (z8 && this.f21092u.S() == b10.f8158b && this.f21092u.T() == b10.f8159c) {
            j = this.f21092u.W();
        }
        B b11 = (B) this.f21089d.f9323d;
        L0 Y2 = this.f21092u.Y();
        int U8 = this.f21092u.U();
        long W10 = this.f21092u.W();
        C1549C c1549c = this.f21092u;
        c1549c.E0();
        return new C1703a(elapsedRealtime, l02, i7, b10, j, Y2, U8, b11, W10, D.Z(c1549c.f19872w0.f20495q));
    }

    public final C1703a O(int i7, B b2) {
        this.f21092u.getClass();
        if (b2 != null) {
            return ((L0) ((y0) this.f21089d.f9322c).get(b2)) != null ? M(b2) : N(L0.f20097a, i7, b2);
        }
        L0 Y2 = this.f21092u.Y();
        if (i7 >= Y2.o()) {
            Y2 = L0.f20097a;
        }
        return N(Y2, i7, null);
    }

    public final C1703a P() {
        return M((B) this.f21089d.f9325f);
    }

    public final void Q(C1703a c1703a, int i7, n5.i iVar) {
        this.f21090e.put(i7, c1703a);
        this.f21091f.e(i7, iVar);
    }

    public final void R(C1549C c1549c, Looper looper) {
        AbstractC1705a.m(this.f21092u == null || ((H) this.f21089d.f9321b).isEmpty());
        c1549c.getClass();
        this.f21092u = c1549c;
        this.f21093v = this.f21086a.a(looper, null);
        n5.l lVar = this.f21091f;
        this.f21091f = new n5.l(lVar.f21185d, looper, lVar.f21182a, new b(0, this, c1549c), lVar.f21189i);
    }

    @Override // m4.v0
    public final void a(int i7) {
        Q(d(), 6, new c(1));
    }

    @Override // m4.v0
    public final void b(int i7) {
        C1549C c1549c = this.f21092u;
        c1549c.getClass();
        T6.a aVar = this.f21089d;
        aVar.f9323d = T6.a.n(c1549c, (H) aVar.f9321b, (B) aVar.f9324e, (J0) aVar.f9320a);
        aVar.x(c1549c.Y());
        Q(d(), 0, new c(7));
    }

    @Override // m4.v0
    public final void c(C1558a0 c1558a0, int i7) {
        Q(d(), 1, new G0(13));
    }

    public final C1703a d() {
        return M((B) this.f21089d.f9323d);
    }

    @Override // P4.I
    public final void e(int i7, B b2, r rVar, C0474w c0474w, IOException iOException, boolean z8) {
        C1703a O10 = O(i7, b2);
        Q(O10, 1003, new Q9.a(O10, rVar, c0474w, iOException, z8));
    }

    @Override // r4.n
    public final void f(int i7, B b2) {
        Q(O(i7, b2), 1027, new G0(26));
    }

    @Override // m4.v0
    public final void g(C1562c0 c1562c0) {
        Q(d(), 14, new G0(6));
    }

    @Override // m4.v0
    public final void h(C1549C c1549c, u0 u0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [P4.z, P4.B] */
    @Override // m4.v0
    public final void i(q0 q0Var) {
        C0477z c0477z;
        C1703a d10 = (!(q0Var instanceof C1581m) || (c0477z = ((C1581m) q0Var).f20433v) == null) ? d() : M(new C0477z(c0477z));
        Q(d10, 10, new Q9.a(d10, q0Var, 25));
    }

    @Override // m4.v0
    public final void j(N0 n02) {
        Q(d(), 2, new G0(27));
    }

    @Override // m4.v0
    public final void k(k5.x xVar) {
        Q(d(), 19, new G0(21));
    }

    @Override // m4.v0
    public final void l(int i7) {
        Q(d(), 8, new G0(24));
    }

    @Override // m4.v0
    public final void m(a5.c cVar) {
        Q(d(), 27, new G0(14));
    }

    @Override // m4.v0
    public final void n(boolean z8) {
        Q(d(), 3, new c(10));
    }

    @Override // m4.v0
    public final void o() {
    }

    @Override // m4.v0
    public final void p(boolean z8) {
        Q(P(), 23, new c(16));
    }

    @Override // m4.v0
    public final void q(List list) {
        C1703a d10 = d();
        Q(d10, 27, new Kc.a(d10, list));
    }

    @Override // m4.v0
    public final void r(int i7, boolean z8) {
        Q(d(), -1, new G0(9));
    }

    @Override // r4.n
    public final void s(int i7, B b2) {
        Q(O(i7, b2), 1023, new c(14));
    }

    @Override // m4.v0
    public final void t(int i7, boolean z8) {
        Q(d(), 5, new G0(12));
    }

    @Override // m4.v0
    public final void u(s0 s0Var) {
        Q(d(), 12, new G0(7));
    }

    @Override // m4.v0
    public final void v(int i7) {
        Q(d(), 4, new G0(18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [P4.z, P4.B] */
    @Override // m4.v0
    public final void w(q0 q0Var) {
        C0477z c0477z;
        Q((!(q0Var instanceof C1581m) || (c0477z = ((C1581m) q0Var).f20433v) == null) ? d() : M(new C0477z(c0477z)), 10, new G0(29));
    }

    @Override // r4.n
    public final void x(int i7, B b2, int i10) {
        Q(O(i7, b2), 1022, new c(8));
    }

    @Override // m4.v0
    public final void y(int i7, w0 w0Var, w0 w0Var2) {
        if (i7 == 1) {
            this.f21094w = false;
        }
        C1549C c1549c = this.f21092u;
        c1549c.getClass();
        T6.a aVar = this.f21089d;
        aVar.f9323d = T6.a.n(c1549c, (H) aVar.f9321b, (B) aVar.f9324e, (J0) aVar.f9320a);
        C1703a d10 = d();
        Q(d10, 11, new C1591u(d10, i7, w0Var, w0Var2));
    }

    @Override // m4.v0
    public final void z(boolean z8) {
        Q(d(), 9, new c(21));
    }
}
