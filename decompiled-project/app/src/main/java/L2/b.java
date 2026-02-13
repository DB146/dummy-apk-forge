package L2;

import K2.InterfaceC0380b;
import g3.C1191j;

/* loaded from: classes.dex */
public final class b implements InterfaceC0380b {

    /* renamed from: a, reason: collision with root package name */
    public final C1191j f6265a;

    public b(C1191j c1191j) {
        this.f6265a = c1191j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((U2.d) this.f6265a.f17441b).close();
    }

    @Override // K2.InterfaceC0380b
    public final Object w(boolean z8, Rb.e eVar, Jb.c cVar) {
        U2.d dVar = (U2.d) this.f6265a.f17441b;
        dVar.getClass();
        return eVar.invoke(new d(new a(dVar.N())), cVar);
    }
}
