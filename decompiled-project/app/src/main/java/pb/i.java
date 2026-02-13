package pb;

import ha.C1265a;
import mb.InterfaceC1655a;

/* loaded from: classes2.dex */
public final class i extends gb.f implements InterfaceC1655a {

    /* renamed from: a, reason: collision with root package name */
    public final c f23290a;

    /* renamed from: b, reason: collision with root package name */
    public final C1265a f23291b;

    public i(c cVar, C1265a c1265a) {
        this.f23290a = cVar;
        this.f23291b = c1265a;
    }

    @Override // mb.InterfaceC1655a
    public final gb.d a() {
        return new g(this.f23290a, this.f23291b, 0);
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        this.f23290a.a(new h(gVar, this.f23291b, 0));
    }
}
