package pb;

/* loaded from: classes2.dex */
public final class r extends a {

    /* renamed from: c, reason: collision with root package name */
    public final vb.n f23322c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23323d;

    public r(c cVar, vb.n nVar) {
        super(cVar);
        this.f23322c = nVar;
        this.f23323d = true;
    }

    @Override // gb.d
    public final void b(gb.e eVar) {
        gb.n a9 = this.f23322c.a();
        q qVar = new q(eVar, a9, this.f23261b, this.f23323d);
        eVar.f(qVar);
        a9.a(qVar);
    }
}
