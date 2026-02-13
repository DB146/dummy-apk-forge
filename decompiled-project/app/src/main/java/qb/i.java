package qb;

import hb.InterfaceC1269b;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class i implements gb.g, InterfaceC1269b, gb.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23613a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.g f23614b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1269b f23615c;

    public /* synthetic */ i(gb.g gVar, int i7) {
        this.f23613a = i7;
        this.f23614b = gVar;
    }

    @Override // gb.g
    public void a() {
        switch (this.f23613a) {
            case 0:
                this.f23614b.a();
                return;
            default:
                this.f23614b.a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23613a) {
            case 0:
                InterfaceC1269b interfaceC1269b = this.f23615c;
                this.f23615c = EnumC1437b.f19070a;
                interfaceC1269b.b();
                return;
            case 1:
                this.f23615c.b();
                this.f23615c = EnumC1437b.f19070a;
                return;
            default:
                this.f23615c.b();
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23613a) {
            case 0:
                if (EnumC1437b.o(this.f23615c, interfaceC1269b)) {
                    this.f23615c = interfaceC1269b;
                    this.f23614b.c(this);
                    return;
                }
                return;
            case 1:
                if (EnumC1437b.o(this.f23615c, interfaceC1269b)) {
                    this.f23615c = interfaceC1269b;
                    this.f23614b.c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.o(this.f23615c, interfaceC1269b)) {
                    this.f23615c = interfaceC1269b;
                    this.f23614b.c(this);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23613a) {
            case 0:
                return this.f23615c.g();
            case 1:
                return this.f23615c.g();
            default:
                return this.f23615c.g();
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23613a) {
            case 0:
                this.f23614b.onError(th);
                return;
            case 1:
                this.f23615c = EnumC1437b.f19070a;
                this.f23614b.onError(th);
                return;
            default:
                this.f23614b.a();
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        switch (this.f23613a) {
            case 0:
                gb.g gVar = this.f23614b;
                try {
                    if (ha.f.f17909c.test(obj)) {
                        gVar.onSuccess(obj);
                        return;
                    } else {
                        gVar.a();
                        return;
                    }
                } catch (Throwable th) {
                    u0.L(th);
                    gVar.onError(th);
                    return;
                }
            case 1:
                this.f23615c = EnumC1437b.f19070a;
                this.f23614b.onSuccess(obj);
                return;
            default:
                this.f23614b.onSuccess(obj);
                return;
        }
    }
}
