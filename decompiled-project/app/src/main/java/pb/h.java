package pb;

import ha.C1265a;
import hb.InterfaceC1269b;
import java.util.Objects;
import jb.InterfaceC1391b;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class h implements gb.e, InterfaceC1269b, gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23284a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.g f23285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23286c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23287d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1391b f23288e;

    /* renamed from: f, reason: collision with root package name */
    public Object f23289f;

    public /* synthetic */ h(gb.g gVar, InterfaceC1391b interfaceC1391b, int i7) {
        this.f23284a = i7;
        this.f23285b = gVar;
        this.f23288e = interfaceC1391b;
    }

    @Override // gb.e, gb.l
    public final void a() {
        switch (this.f23284a) {
            case 0:
                if (this.f23286c) {
                    return;
                }
                this.f23286c = true;
                Object obj = this.f23287d;
                gb.g gVar = this.f23285b;
                if (obj != null) {
                    gVar.onSuccess(obj);
                    return;
                } else {
                    gVar.a();
                    return;
                }
            default:
                if (this.f23286c) {
                    return;
                }
                this.f23286c = true;
                Object obj2 = this.f23287d;
                this.f23287d = null;
                gb.g gVar2 = this.f23285b;
                if (obj2 != null) {
                    gVar2.onSuccess(obj2);
                    return;
                } else {
                    gVar2.a();
                    return;
                }
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23284a) {
            case 0:
                ((Ac.b) this.f23289f).cancel();
                this.f23286c = true;
                return;
            default:
                ((InterfaceC1269b) this.f23289f).b();
                return;
        }
    }

    @Override // gb.l
    public void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o((InterfaceC1269b) this.f23289f, interfaceC1269b)) {
            this.f23289f = interfaceC1269b;
            this.f23285b.c(this);
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        switch (this.f23284a) {
            case 0:
                if (this.f23286c) {
                    return;
                }
                Object obj2 = this.f23287d;
                if (obj2 == null) {
                    this.f23287d = obj;
                    return;
                }
                try {
                    this.f23287d = ((C1265a) this.f23288e).apply(obj2, obj);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    ((Ac.b) this.f23289f).cancel();
                    onError(th);
                    return;
                }
            default:
                if (this.f23286c) {
                    return;
                }
                Object obj3 = this.f23287d;
                if (obj3 == null) {
                    this.f23287d = obj;
                    return;
                }
                try {
                    Object apply = this.f23288e.apply(obj3, obj);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f23287d = apply;
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    ((InterfaceC1269b) this.f23289f).b();
                    onError(th2);
                    return;
                }
        }
    }

    @Override // gb.e
    public void f(Ac.b bVar) {
        if (wb.c.b((Ac.b) this.f23289f, bVar)) {
            this.f23289f = bVar;
            this.f23285b.c(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23284a) {
            case 0:
                return this.f23286c;
            default:
                return ((InterfaceC1269b) this.f23289f).g();
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        switch (this.f23284a) {
            case 0:
                if (this.f23286c) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    this.f23286c = true;
                    this.f23285b.onError(th);
                    return;
                }
            default:
                if (this.f23286c) {
                    com.bumptech.glide.d.t(th);
                    return;
                }
                this.f23286c = true;
                this.f23287d = null;
                this.f23285b.onError(th);
                return;
        }
    }
}
