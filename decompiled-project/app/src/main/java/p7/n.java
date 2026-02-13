package p7;

import j8.InterfaceC1386a;
import j8.InterfaceC1387b;

/* loaded from: classes.dex */
public final class n implements InterfaceC1387b {

    /* renamed from: c, reason: collision with root package name */
    public static final n4.c f23148c = new n4.c(23);

    /* renamed from: d, reason: collision with root package name */
    public static final d f23149d = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1386a f23150a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1387b f23151b;

    public n(n4.c cVar, InterfaceC1387b interfaceC1387b) {
        this.f23150a = cVar;
        this.f23151b = interfaceC1387b;
    }

    public final void a(InterfaceC1386a interfaceC1386a) {
        InterfaceC1387b interfaceC1387b;
        InterfaceC1387b interfaceC1387b2;
        InterfaceC1387b interfaceC1387b3 = this.f23151b;
        d dVar = f23149d;
        if (interfaceC1387b3 != dVar) {
            interfaceC1386a.f(interfaceC1387b3);
            return;
        }
        synchronized (this) {
            interfaceC1387b = this.f23151b;
            if (interfaceC1387b != dVar) {
                interfaceC1387b2 = interfaceC1387b;
            } else {
                this.f23150a = new n4.b(2, this.f23150a, interfaceC1386a);
                interfaceC1387b2 = null;
            }
        }
        if (interfaceC1387b2 != null) {
            interfaceC1386a.f(interfaceC1387b);
        }
    }

    @Override // j8.InterfaceC1387b
    public final Object get() {
        return this.f23151b.get();
    }
}
