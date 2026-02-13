package pb;

import hb.InterfaceC1269b;
import kb.EnumC1437b;
import yb.InterfaceC2471a;
import yb.InterfaceC2472b;

/* loaded from: classes2.dex */
public final class e implements gb.b, InterfaceC2472b, Ac.b, InterfaceC2471a {

    /* renamed from: a, reason: collision with root package name */
    public final gb.e f23278a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1269b f23279b;

    public e(gb.e eVar) {
        this.f23278a = eVar;
    }

    @Override // gb.b
    public final void a() {
        this.f23279b = EnumC1437b.f19070a;
        this.f23278a.a();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f23279b, interfaceC1269b)) {
            this.f23279b = interfaceC1269b;
            this.f23278a.f(this);
        }
    }

    @Override // Ac.b
    public final void cancel() {
        this.f23279b.b();
        this.f23279b = EnumC1437b.f19070a;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
    }

    @Override // Ac.b
    public final void d(long j) {
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return false;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return true;
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        this.f23279b = EnumC1437b.f19070a;
        this.f23278a.onError(th);
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        return null;
    }
}
