package pb;

import mb.InterfaceC1655a;

/* loaded from: classes2.dex */
public final class p extends gb.p implements InterfaceC1655a {

    /* renamed from: a, reason: collision with root package name */
    public final a f23315a;

    public p(a aVar) {
        this.f23315a = aVar;
    }

    @Override // mb.InterfaceC1655a
    public final gb.d a() {
        return new n(this.f23315a, true);
    }

    @Override // gb.p
    public final void e(gb.q qVar) {
        this.f23315a.a(new o(qVar, 1));
    }
}
