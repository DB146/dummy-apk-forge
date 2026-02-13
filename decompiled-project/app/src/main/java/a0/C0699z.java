package a0;

import u.C2047J;

/* renamed from: a0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699z extends C0678e {

    /* renamed from: o, reason: collision with root package name */
    public final C0678e f12441o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12442p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12443q;

    /* renamed from: r, reason: collision with root package name */
    public Rb.c f12444r;

    /* renamed from: s, reason: collision with root package name */
    public Rb.c f12445s;

    /* renamed from: t, reason: collision with root package name */
    public final long f12446t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0699z(C0678e c0678e, Rb.c cVar, Rb.c cVar2, boolean z8, boolean z10) {
        super(0L, C0686m.f12397e, AbstractC0688o.l(cVar, (c0678e == null || (r0 = c0678e.e()) == null) ? AbstractC0688o.f12411i.f12374e : r0, z8), AbstractC0688o.b(cVar2, (c0678e == null || (r9 = c0678e.i()) == null) ? AbstractC0688o.f12411i.f12375f : r9));
        Rb.c i7;
        Rb.c e2;
        Q7.h hVar = AbstractC0688o.f12404a;
        this.f12441o = c0678e;
        this.f12442p = z8;
        this.f12443q = z10;
        this.f12444r = this.f12374e;
        this.f12445s = this.f12375f;
        this.f12446t = Y.f.b();
    }

    @Override // a0.C0678e
    public final void B(C2047J c2047j) {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.C0678e
    public final C0678e C(Rb.c cVar, Rb.c cVar2) {
        Rb.c l10 = AbstractC0688o.l(cVar, this.f12444r, true);
        Rb.c b2 = AbstractC0688o.b(cVar2, this.f12445s);
        return !this.f12442p ? new C0699z(D().C(null, b2), l10, b2, false, true) : D().C(l10, b2);
    }

    public final C0678e D() {
        C0678e c0678e = this.f12441o;
        return c0678e == null ? AbstractC0688o.f12411i : c0678e;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void c() {
        C0678e c0678e;
        this.f12388c = true;
        if (!this.f12443q || (c0678e = this.f12441o) == null) {
            return;
        }
        c0678e.c();
    }

    @Override // a0.AbstractC0682i
    public final C0686m d() {
        return D().d();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final Rb.c e() {
        return this.f12444r;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final boolean f() {
        return D().f();
    }

    @Override // a0.AbstractC0682i
    public final long g() {
        return D().g();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final int h() {
        return D().h();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final Rb.c i() {
        return this.f12445s;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void k() {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void l() {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void m() {
        D().m();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void n(InterfaceC0695v interfaceC0695v) {
        D().n(interfaceC0695v);
    }

    @Override // a0.AbstractC0682i
    public final void r(C0686m c0686m) {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.AbstractC0682i
    public final void s(long j) {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void t(int i7) {
        D().t(i7);
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final AbstractC0682i u(Rb.c cVar) {
        Rb.c l10 = AbstractC0688o.l(cVar, this.f12444r, true);
        return !this.f12442p ? AbstractC0688o.h(D().u(null), l10, true) : D().u(l10);
    }

    @Override // a0.C0678e
    public final AbstractC0692s w() {
        return D().w();
    }

    @Override // a0.C0678e
    public final C2047J x() {
        return D().x();
    }

    @Override // a0.C0678e
    /* renamed from: y */
    public final Rb.c e() {
        return this.f12444r;
    }
}
