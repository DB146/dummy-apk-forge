package qb;

import hb.InterfaceC1269b;
import kb.EnumC1437b;

/* loaded from: classes2.dex */
public final class t extends nb.f implements gb.g, gb.q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23642c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1269b f23643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(gb.l lVar, int i7) {
        super(lVar);
        this.f23642c = i7;
    }

    @Override // gb.g
    public void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f21344a.a();
    }

    @Override // nb.f, hb.InterfaceC1269b
    public final void b() {
        switch (this.f23642c) {
            case 0:
                super.b();
                this.f23643d.b();
                return;
            default:
                super.b();
                this.f23643d.b();
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23642c) {
            case 0:
                if (EnumC1437b.o(this.f23643d, interfaceC1269b)) {
                    this.f23643d = interfaceC1269b;
                    this.f21344a.c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.o(this.f23643d, interfaceC1269b)) {
                    this.f23643d = interfaceC1269b;
                    this.f21344a.c(this);
                    return;
                }
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23642c) {
            case 0:
                if ((get() & 54) != 0) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    lazySet(2);
                    this.f21344a.onError(th);
                    return;
                }
            default:
                if ((get() & 54) != 0) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    lazySet(2);
                    this.f21344a.onError(th);
                    return;
                }
        }
    }
}
