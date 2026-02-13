package a0;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681h extends AbstractC0682i {

    /* renamed from: e, reason: collision with root package name */
    public final Rb.c f12384e;

    /* renamed from: f, reason: collision with root package name */
    public int f12385f;

    public C0681h(long j, C0686m c0686m, Rb.c cVar) {
        super(j, c0686m);
        this.f12384e = cVar;
        this.f12385f = 1;
    }

    @Override // a0.AbstractC0682i
    public final void c() {
        if (this.f12388c) {
            return;
        }
        l();
        this.f12388c = true;
        synchronized (AbstractC0688o.f12405b) {
            o();
        }
    }

    @Override // a0.AbstractC0682i
    public final Rb.c e() {
        return this.f12384e;
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
        this.f12385f++;
    }

    @Override // a0.AbstractC0682i
    public final void l() {
        int i7 = this.f12385f - 1;
        this.f12385f = i7;
        if (i7 == 0) {
            a();
        }
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
        AbstractC0688o.d(this);
        return new C0680g(this.f12387b, this.f12386a, AbstractC0688o.l(cVar, this.f12384e, true), this);
    }
}
