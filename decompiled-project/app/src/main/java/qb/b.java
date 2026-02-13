package qb;

import Y5.A;
import hb.InterfaceC1269b;
import i1.C1290a;
import ib.C1360b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class b extends AtomicReference implements gb.g, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23592a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23593b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23594c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23595d;

    public b(gb.g gVar, InterfaceC1394e interfaceC1394e) {
        this.f23593b = gVar;
        this.f23594c = interfaceC1394e;
    }

    public b(InterfaceC1393d interfaceC1393d, InterfaceC1393d interfaceC1393d2) {
        A a9 = lb.b.f19614c;
        this.f23593b = interfaceC1393d;
        this.f23594c = interfaceC1393d2;
        this.f23595d = a9;
    }

    @Override // gb.g
    public final void a() {
        switch (this.f23592a) {
            case 0:
                lazySet(EnumC1437b.f19070a);
                try {
                    ((A) this.f23595d).getClass();
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    com.bumptech.glide.d.t(th);
                    return;
                }
            default:
                ((gb.g) this.f23593b).a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23592a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                ((InterfaceC1269b) this.f23595d).b();
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23592a) {
            case 0:
                EnumC1437b.j(this, interfaceC1269b);
                return;
            default:
                if (EnumC1437b.o((InterfaceC1269b) this.f23595d, interfaceC1269b)) {
                    this.f23595d = interfaceC1269b;
                    ((gb.g) this.f23593b).c(this);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23592a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23592a) {
            case 0:
                lazySet(EnumC1437b.f19070a);
                try {
                    ((InterfaceC1393d) this.f23594c).accept(th);
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    com.bumptech.glide.d.t(new C1360b(th, th2));
                    return;
                }
            default:
                ((gb.g) this.f23593b).onError(th);
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        switch (this.f23592a) {
            case 0:
                lazySet(EnumC1437b.f19070a);
                try {
                    ((InterfaceC1393d) this.f23593b).accept(obj);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    com.bumptech.glide.d.t(th);
                    return;
                }
            default:
                try {
                    Object apply = ((InterfaceC1394e) this.f23594c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    gb.f fVar = (gb.f) apply;
                    if (g()) {
                        return;
                    }
                    fVar.b(new C1290a(this, 17));
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    ((gb.g) this.f23593b).onError(th2);
                    return;
                }
        }
    }
}
