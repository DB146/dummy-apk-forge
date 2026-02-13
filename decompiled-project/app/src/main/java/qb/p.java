package qb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;

/* loaded from: classes2.dex */
public final class p extends AtomicReference implements gb.g, InterfaceC1269b, Runnable, gb.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23629a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.o f23630b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23631c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f23632d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23633e;

    public /* synthetic */ p(Object obj, gb.o oVar, int i7) {
        this.f23629a = i7;
        this.f23633e = obj;
        this.f23630b = oVar;
    }

    @Override // gb.g
    public void a() {
        EnumC1437b.f(this, this.f23630b.b(this));
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23629a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23629a) {
            case 0:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.g) this.f23633e).c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.q) this.f23633e).c(this);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23629a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23629a) {
            case 0:
                this.f23632d = th;
                EnumC1437b.f(this, this.f23630b.b(this));
                return;
            default:
                this.f23632d = th;
                EnumC1437b.f(this, this.f23630b.b(this));
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        switch (this.f23629a) {
            case 0:
                this.f23631c = obj;
                EnumC1437b.f(this, this.f23630b.b(this));
                return;
            default:
                this.f23631c = obj;
                EnumC1437b.f(this, this.f23630b.b(this));
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23629a) {
            case 0:
                Throwable th = this.f23632d;
                gb.g gVar = (gb.g) this.f23633e;
                if (th != null) {
                    this.f23632d = null;
                    gVar.onError(th);
                    return;
                }
                Object obj = this.f23631c;
                if (obj == null) {
                    gVar.a();
                    return;
                } else {
                    this.f23631c = null;
                    gVar.onSuccess(obj);
                    return;
                }
            default:
                Throwable th2 = this.f23632d;
                gb.q qVar = (gb.q) this.f23633e;
                if (th2 != null) {
                    qVar.onError(th2);
                    return;
                } else {
                    qVar.onSuccess(this.f23631c);
                    return;
                }
        }
    }
}
