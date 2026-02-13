package a0;

/* renamed from: a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673A extends AbstractC0682i {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0682i f12362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12363f;
    public Rb.c g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0673A(AbstractC0682i abstractC0682i, Rb.c cVar, boolean z8) {
        super(0L, C0686m.f12397e);
        Rb.c e2;
        Q7.h hVar = AbstractC0688o.f12404a;
        this.f12362e = abstractC0682i;
        this.f12363f = z8;
        this.g = AbstractC0688o.l(cVar, (abstractC0682i == null || (e2 = abstractC0682i.e()) == null) ? AbstractC0688o.f12411i.f12374e : e2, false);
        this.f12364h = Y.f.b();
    }

    @Override // a0.AbstractC0682i
    public final void c() {
        AbstractC0682i abstractC0682i;
        this.f12388c = true;
        if (!this.f12363f || (abstractC0682i = this.f12362e) == null) {
            return;
        }
        abstractC0682i.c();
    }

    @Override // a0.AbstractC0682i
    public final C0686m d() {
        return v().d();
    }

    @Override // a0.AbstractC0682i
    public final Rb.c e() {
        return this.g;
    }

    @Override // a0.AbstractC0682i
    public final boolean f() {
        return v().f();
    }

    @Override // a0.AbstractC0682i
    public final long g() {
        return v().g();
    }

    @Override // a0.AbstractC0682i
    public final Rb.c i() {
        return null;
    }

    @Override // a0.AbstractC0682i
    public final void k() {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.AbstractC0682i
    public final void l() {
        AbstractC0692s.g();
        throw null;
    }

    @Override // a0.AbstractC0682i
    public final void m() {
        v().m();
    }

    @Override // a0.AbstractC0682i
    public final void n(InterfaceC0695v interfaceC0695v) {
        v().n(interfaceC0695v);
    }

    @Override // a0.AbstractC0682i
    public final AbstractC0682i u(Rb.c cVar) {
        return AbstractC0688o.h(v().u(null), AbstractC0688o.l(cVar, this.g, true), true);
    }

    public final AbstractC0682i v() {
        AbstractC0682i abstractC0682i = this.f12362e;
        return abstractC0682i == null ? AbstractC0688o.f12411i : abstractC0682i;
    }
}
