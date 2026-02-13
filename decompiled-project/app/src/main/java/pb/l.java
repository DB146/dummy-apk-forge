package pb;

import Y5.C0662z;

/* loaded from: classes2.dex */
public final class l extends a {

    /* renamed from: c, reason: collision with root package name */
    public final C0662z f23304c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gb.d dVar) {
        super(dVar);
        C0662z c0662z = lb.b.f19617f;
        this.f23304c = c0662z;
        this.f23305d = 3L;
    }

    @Override // gb.d
    public final void b(gb.e eVar) {
        wb.b bVar = new wb.b();
        eVar.f(bVar);
        new k(eVar, this.f23305d, this.f23304c, bVar, this.f23261b).b();
    }
}
