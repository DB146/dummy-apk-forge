package a0;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677d extends C0678e {
    @Override // a0.C0678e
    public final C0678e C(Rb.c cVar, Rb.c cVar2) {
        return (C0678e) ((AbstractC0682i) AbstractC0688o.f(new C0687n(new C0675b(cVar, cVar2, 0), 0)));
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final void c() {
        synchronized (AbstractC0688o.f12405b) {
            o();
        }
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
        AbstractC0688o.a();
    }

    @Override // a0.C0678e, a0.AbstractC0682i
    public final AbstractC0682i u(Rb.c cVar) {
        return (C0681h) ((AbstractC0682i) AbstractC0688o.f(new C0687n(new C0676c(cVar, 0), 0)));
    }

    @Override // a0.C0678e
    public final AbstractC0692s w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
