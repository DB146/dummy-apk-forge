package nb;

import gb.l;
import gb.q;
import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.NoSuchElementException;
import java.util.Objects;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kb.EnumC1437b;
import lb.CallableC1516a;
import ob.k;
import qb.r;
import y7.u0;

/* loaded from: classes2.dex */
public final class g implements l, InterfaceC1269b, gb.b, q, gb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21346a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1269b f21347b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21348c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21349d;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f21346a = i7;
        this.f21348c = obj;
        this.f21349d = obj2;
    }

    public g(k kVar, gb.b bVar) {
        this.f21346a = 1;
        this.f21349d = kVar;
        this.f21348c = bVar;
    }

    @Override // gb.l
    public void a() {
        switch (this.f21346a) {
            case 0:
                InterfaceC1269b interfaceC1269b = this.f21347b;
                EnumC1437b enumC1437b = EnumC1437b.f19070a;
                if (interfaceC1269b != enumC1437b) {
                    this.f21347b = enumC1437b;
                    ((l) this.f21348c).a();
                    return;
                }
                return;
            case 1:
                gb.b bVar = (gb.b) this.f21348c;
                k kVar = (k) this.f21349d;
                if (this.f21347b == EnumC1437b.f19070a) {
                    return;
                }
                try {
                    kVar.f22231c.run();
                    bVar.a();
                    try {
                        kVar.getClass();
                        return;
                    } catch (Throwable th) {
                        u0.L(th);
                        com.bumptech.glide.d.t(th);
                        return;
                    }
                } catch (Throwable th2) {
                    u0.L(th2);
                    bVar.onError(th2);
                    return;
                }
            case 2:
            default:
                InterfaceC1269b interfaceC1269b2 = this.f21347b;
                EnumC1437b enumC1437b2 = EnumC1437b.f19070a;
                if (interfaceC1269b2 == enumC1437b2) {
                    return;
                }
                this.f21347b = enumC1437b2;
                ((l) this.f21348c).a();
                return;
            case 3:
                ((gb.g) this.f21348c).a();
                return;
            case 4:
                ((gb.g) this.f21348c).a();
                return;
            case 5:
                InterfaceC1269b interfaceC1269b3 = this.f21347b;
                EnumC1437b enumC1437b3 = EnumC1437b.f19070a;
                if (interfaceC1269b3 == enumC1437b3) {
                    return;
                }
                try {
                    ((r) this.f21349d).f23638d.run();
                    this.f21347b = enumC1437b3;
                    ((gb.g) this.f21348c).a();
                    d();
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    f(th3);
                    return;
                }
            case 6:
                this.f21347b = EnumC1437b.f19070a;
                q qVar = (q) this.f21348c;
                W9.c cVar = (W9.c) this.f21349d;
                if (cVar != null) {
                    qVar.onSuccess(cVar);
                    return;
                } else {
                    qVar.onError(new NoSuchElementException("The MaybeSource is empty"));
                    return;
                }
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f21346a) {
            case 0:
                InterfaceC1269b interfaceC1269b = this.f21347b;
                EnumC1437b enumC1437b = EnumC1437b.f19070a;
                if (interfaceC1269b != enumC1437b) {
                    this.f21347b = enumC1437b;
                    try {
                        ((M9.l) this.f21349d).run();
                    } catch (Throwable th) {
                        u0.L(th);
                        com.bumptech.glide.d.t(th);
                    }
                    interfaceC1269b.b();
                    return;
                }
                return;
            case 1:
                try {
                    ((k) this.f21349d).getClass();
                } catch (Throwable th2) {
                    u0.L(th2);
                    com.bumptech.glide.d.t(th2);
                }
                this.f21347b.b();
                return;
            case 2:
                InterfaceC1269b interfaceC1269b2 = this.f21347b;
                this.f21347b = EnumC1437b.f19070a;
                interfaceC1269b2.b();
                return;
            case 3:
                InterfaceC1269b interfaceC1269b3 = this.f21347b;
                this.f21347b = EnumC1437b.f19070a;
                interfaceC1269b3.b();
                return;
            case 4:
                this.f21347b.b();
                return;
            case 5:
                try {
                    ((r) this.f21349d).f23639e.run();
                } catch (Throwable th3) {
                    u0.L(th3);
                    com.bumptech.glide.d.t(th3);
                }
                this.f21347b.b();
                this.f21347b = EnumC1437b.f19070a;
                return;
            case 6:
                this.f21347b.b();
                this.f21347b = EnumC1437b.f19070a;
                return;
            default:
                this.f21347b.b();
                this.f21347b = EnumC1437b.f19070a;
                return;
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f21346a) {
            case 0:
                l lVar = (l) this.f21348c;
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    lVar.c(this);
                    return;
                }
                return;
            case 1:
                gb.b bVar = (gb.b) this.f21348c;
                try {
                    ((k) this.f21349d).getClass();
                    if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                        this.f21347b = interfaceC1269b;
                        bVar.c(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    interfaceC1269b.b();
                    this.f21347b = EnumC1437b.f19070a;
                    bVar.c(kb.c.f19072a);
                    bVar.onError(th);
                    return;
                }
            case 2:
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    ((gb.g) this.f21348c).c(this);
                    return;
                }
                return;
            case 3:
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    ((gb.g) this.f21348c).c(this);
                    return;
                }
                return;
            case 4:
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    ((gb.g) this.f21348c).c(this);
                    return;
                }
                return;
            case 5:
                gb.g gVar = (gb.g) this.f21348c;
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    try {
                        ((r) this.f21349d).getClass();
                        this.f21347b = interfaceC1269b;
                        gVar.c(this);
                        return;
                    } catch (Throwable th2) {
                        u0.L(th2);
                        interfaceC1269b.b();
                        this.f21347b = EnumC1437b.f19070a;
                        gVar.c(kb.c.f19072a);
                        gVar.onError(th2);
                        return;
                    }
                }
                return;
            case 6:
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    ((q) this.f21348c).c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.o(this.f21347b, interfaceC1269b)) {
                    this.f21347b = interfaceC1269b;
                    ((l) this.f21348c).c(this);
                    return;
                }
                return;
        }
    }

    public void d() {
        try {
            ((r) this.f21349d).getClass();
        } catch (Throwable th) {
            u0.L(th);
            com.bumptech.glide.d.t(th);
        }
    }

    @Override // gb.l
    public void e(Object obj) {
        switch (this.f21346a) {
            case 0:
                ((l) this.f21348c).e(obj);
                return;
            default:
                if (this.f21347b == EnumC1437b.f19070a) {
                    return;
                }
                try {
                    for (Object obj2 : (Iterable) ((InterfaceC1394e) this.f21349d).apply(obj)) {
                        try {
                            try {
                                Objects.requireNonNull(obj2, "The iterator returned a null value");
                                ((l) this.f21348c).e(obj2);
                            } catch (Throwable th) {
                                u0.L(th);
                                this.f21347b.b();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            u0.L(th2);
                            this.f21347b.b();
                            onError(th2);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    this.f21347b.b();
                    onError(th3);
                    return;
                }
        }
    }

    public void f(Throwable th) {
        try {
            ((r) this.f21349d).f23637c.accept(th);
        } catch (Throwable th2) {
            u0.L(th2);
            th = new C1360b(th, th2);
        }
        this.f21347b = EnumC1437b.f19070a;
        ((gb.g) this.f21348c).onError(th);
        d();
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f21346a) {
            case 0:
                return this.f21347b.g();
            case 1:
                return this.f21347b.g();
            case 2:
                return this.f21347b.g();
            case 3:
                return this.f21347b.g();
            case 4:
                return this.f21347b.g();
            case 5:
                return this.f21347b.g();
            case 6:
                return this.f21347b.g();
            default:
                return this.f21347b.g();
        }
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        switch (this.f21346a) {
            case 0:
                InterfaceC1269b interfaceC1269b = this.f21347b;
                EnumC1437b enumC1437b = EnumC1437b.f19070a;
                if (interfaceC1269b == enumC1437b) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    this.f21347b = enumC1437b;
                    ((l) this.f21348c).onError(th);
                    return;
                }
            case 1:
                k kVar = (k) this.f21349d;
                if (this.f21347b == EnumC1437b.f19070a) {
                    com.bumptech.glide.d.t(th);
                    return;
                }
                try {
                    kVar.f22230b.accept(th);
                } catch (Throwable th2) {
                    u0.L(th2);
                    th = new C1360b(th, th2);
                }
                ((gb.b) this.f21348c).onError(th);
                try {
                    kVar.getClass();
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    com.bumptech.glide.d.t(th3);
                    return;
                }
            case 2:
                ((gb.g) this.f21348c).onError(th);
                return;
            case 3:
                ((gb.g) this.f21348c).onError(th);
                return;
            case 4:
                gb.g gVar = (gb.g) this.f21348c;
                try {
                    Object obj = ((CallableC1516a) this.f21349d).f19611a;
                    Objects.requireNonNull(obj, "The itemSupplier returned a null value");
                    gVar.onSuccess(obj);
                    return;
                } catch (Throwable th4) {
                    u0.L(th4);
                    gVar.onError(new C1360b(th, th4));
                    return;
                }
            case 5:
                if (this.f21347b == EnumC1437b.f19070a) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    f(th);
                    return;
                }
            case 6:
                this.f21347b = EnumC1437b.f19070a;
                ((q) this.f21348c).onError(th);
                return;
            default:
                InterfaceC1269b interfaceC1269b2 = this.f21347b;
                EnumC1437b enumC1437b2 = EnumC1437b.f19070a;
                if (interfaceC1269b2 == enumC1437b2) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    this.f21347b = enumC1437b2;
                    ((l) this.f21348c).onError(th);
                    return;
                }
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        switch (this.f21346a) {
            case 2:
                gb.g gVar = (gb.g) this.f21348c;
                try {
                    if (((InterfaceC1395f) this.f21349d).test(obj)) {
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
            case 3:
                gb.g gVar2 = (gb.g) this.f21348c;
                try {
                    Object apply = ((InterfaceC1394e) this.f21349d).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null item");
                    gVar2.onSuccess(apply);
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    gVar2.onError(th2);
                    return;
                }
            case 4:
                ((gb.g) this.f21348c).onSuccess(obj);
                return;
            case 5:
                InterfaceC1269b interfaceC1269b = this.f21347b;
                EnumC1437b enumC1437b = EnumC1437b.f19070a;
                if (interfaceC1269b == enumC1437b) {
                    return;
                }
                try {
                    ((r) this.f21349d).f23636b.accept(obj);
                    this.f21347b = enumC1437b;
                    ((gb.g) this.f21348c).onSuccess(obj);
                    d();
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    f(th3);
                    return;
                }
            default:
                this.f21347b = EnumC1437b.f19070a;
                ((q) this.f21348c).onSuccess(obj);
                return;
        }
    }
}
