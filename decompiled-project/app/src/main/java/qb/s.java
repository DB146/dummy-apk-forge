package qb;

import hb.InterfaceC1269b;
import kb.EnumC1437b;
import wb.AbstractC2227a;

/* loaded from: classes2.dex */
public final class s extends AbstractC2227a implements gb.g, gb.q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23640c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1269b f23641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(gb.e eVar, int i7) {
        super(eVar);
        this.f23640c = i7;
    }

    @Override // gb.g
    public void a() {
        this.f25848a.a();
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23640c) {
            case 0:
                if (EnumC1437b.o(this.f23641d, interfaceC1269b)) {
                    this.f23641d = interfaceC1269b;
                    this.f25848a.f(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.o(this.f23641d, interfaceC1269b)) {
                    this.f23641d = interfaceC1269b;
                    this.f25848a.f(this);
                    return;
                }
                return;
        }
    }

    @Override // Ac.b
    public final void cancel() {
        switch (this.f23640c) {
            case 0:
                set(4);
                this.f25849b = null;
                this.f23641d.b();
                return;
            default:
                set(4);
                this.f25849b = null;
                this.f23641d.b();
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23640c) {
            case 0:
                this.f25848a.onError(th);
                return;
            default:
                this.f25848a.onError(th);
                return;
        }
    }
}
