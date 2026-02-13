package a0;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680g extends AbstractC0682i {

    /* renamed from: e, reason: collision with root package name */
    public final Rb.c f12382e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0682i f12383f;

    public C0680g(long j, C0686m c0686m, Rb.c cVar, AbstractC0682i abstractC0682i) {
        super(j, c0686m);
        this.f12382e = cVar;
        this.f12383f = abstractC0682i;
        abstractC0682i.k();
    }

    @Override // a0.AbstractC0682i
    public final void c() {
        if (this.f12388c) {
            return;
        }
        long j = this.f12387b;
        AbstractC0682i abstractC0682i = this.f12383f;
        if (j != abstractC0682i.g()) {
            a();
        }
        abstractC0682i.l();
        this.f12388c = true;
        synchronized (AbstractC0688o.f12405b) {
            o();
        }
    }

    @Override // a0.AbstractC0682i
    public final Rb.c e() {
        return this.f12382e;
    }

    @Override // a0.AbstractC0682i
    public final boolean f() {
        return true;
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
    }

    @Override // a0.AbstractC0682i
    public final void n(InterfaceC0695v interfaceC0695v) {
        Q7.h hVar = AbstractC0688o.f12404a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // a0.AbstractC0682i
    public final AbstractC0682i u(Rb.c cVar) {
        return new C0680g(this.f12387b, this.f12386a, AbstractC0688o.l(cVar, this.f12382e, true), this.f12383f);
    }
}
