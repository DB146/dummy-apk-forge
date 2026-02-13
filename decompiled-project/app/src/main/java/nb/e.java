package nb;

import ea.C1108c;
import ea.C1111f;
import ea.C1112g;
import gb.AbstractC1204a;
import gb.k;
import gb.l;
import gb.p;
import gb.q;
import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1390a;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.C1436a;
import kb.EnumC1437b;
import qb.AbstractC1909a;
import sb.u;
import y7.u0;

/* loaded from: classes2.dex */
public final class e extends AtomicReference implements gb.b, InterfaceC1269b, q, gb.g, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21341a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21342b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21343c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f21341a = i7;
        this.f21342b = obj;
        this.f21343c = obj2;
    }

    public e(gb.g gVar) {
        this.f21341a = 6;
        this.f21343c = gVar;
        this.f21342b = new C1436a();
    }

    public e(l lVar) {
        this.f21341a = 10;
        this.f21342b = lVar;
        this.f21343c = new AtomicReference();
    }

    @Override // gb.b
    public void a() {
        switch (this.f21341a) {
            case 0:
                try {
                    ((InterfaceC1390a) this.f21343c).run();
                } catch (Throwable th) {
                    u0.L(th);
                    com.bumptech.glide.d.t(th);
                }
                lazySet(EnumC1437b.f19070a);
                return;
            case 1:
            default:
                ((p) this.f21343c).d(new C1112g(7, this, (q) this.f21342b));
                return;
            case 2:
                ((AbstractC1204a) this.f21343c).c(new C1111f(9, this, (gb.b) this.f21342b));
                return;
            case 3:
                ((AbstractC1909a) this.f21343c).b(new C1112g(10, this, (gb.g) this.f21342b));
                return;
            case 4:
                ((gb.g) this.f21342b).a();
                return;
            case 5:
                ((gb.g) this.f21342b).a();
                return;
            case 6:
                ((gb.g) this.f21343c).a();
                return;
            case 7:
                InterfaceC1269b interfaceC1269b = (InterfaceC1269b) get();
                if (interfaceC1269b == EnumC1437b.f19070a || !compareAndSet(interfaceC1269b, null)) {
                    return;
                }
                ((tb.e) this.f21343c).d(new C1111f(11, (q) this.f21342b, this));
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                u uVar = (u) this.f21343c;
                if (uVar == null) {
                    ((l) this.f21342b).a();
                    return;
                } else {
                    this.f21343c = null;
                    uVar.b(this);
                    return;
                }
            case 9:
                ((l) this.f21342b).a();
                return;
            case 10:
                ((l) this.f21342b).a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f21341a) {
            case 0:
                EnumC1437b.a(this);
                return;
            case 1:
                EnumC1437b.a(this);
                return;
            case 2:
                EnumC1437b.a(this);
                return;
            case 3:
                EnumC1437b.a(this);
                return;
            case 4:
                EnumC1437b.a(this);
                return;
            case 5:
                EnumC1437b.a(this);
                return;
            case 6:
                EnumC1437b.a(this);
                C1436a c1436a = (C1436a) this.f21342b;
                c1436a.getClass();
                EnumC1437b.a(c1436a);
                return;
            case 7:
                EnumC1437b.a(this);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                EnumC1437b.a(this);
                return;
            case 9:
                EnumC1437b.a(this);
                return;
            case 10:
                EnumC1437b.a((AtomicReference) this.f21343c);
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f21341a) {
            case 0:
                EnumC1437b.j(this, interfaceC1269b);
                return;
            case 1:
                EnumC1437b.j(this, interfaceC1269b);
                return;
            case 2:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.b) this.f21342b).c(this);
                    return;
                }
                return;
            case 3:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.g) this.f21342b).c(this);
                    return;
                }
                return;
            case 4:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.g) this.f21342b).c(this);
                    return;
                }
                return;
            case 5:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.g) this.f21342b).c(this);
                    return;
                }
                return;
            case 6:
                EnumC1437b.j(this, interfaceC1269b);
                return;
            case 7:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((q) this.f21342b).c(this);
                    return;
                }
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                EnumC1437b.f(this, interfaceC1269b);
                return;
            case 9:
                EnumC1437b.f(this, interfaceC1269b);
                return;
            case 10:
                EnumC1437b.j((AtomicReference) this.f21343c, interfaceC1269b);
                return;
            default:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((q) this.f21342b).c(this);
                    return;
                }
                return;
        }
    }

    @Override // gb.l
    public void e(Object obj) {
        switch (this.f21341a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((l) this.f21342b).e(obj);
                return;
            case 9:
                ((l) this.f21342b).e(obj);
                return;
            default:
                ((l) this.f21342b).e(obj);
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f21341a) {
            case 0:
                return get() == EnumC1437b.f19070a;
            case 1:
                return get() == EnumC1437b.f19070a;
            case 2:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 3:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 4:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 5:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 6:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 7:
                return EnumC1437b.d((InterfaceC1269b) get());
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 9:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 10:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        switch (this.f21341a) {
            case 0:
                try {
                    ((InterfaceC1393d) this.f21342b).accept(th);
                } catch (Throwable th2) {
                    u0.L(th2);
                    com.bumptech.glide.d.t(th2);
                }
                lazySet(EnumC1437b.f19070a);
                return;
            case 1:
                lazySet(EnumC1437b.f19070a);
                try {
                    ((InterfaceC1393d) this.f21343c).accept(th);
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    com.bumptech.glide.d.t(new C1360b(th, th3));
                    return;
                }
            case 2:
                ((gb.b) this.f21342b).onError(th);
                return;
            case 3:
                ((gb.g) this.f21342b).onError(th);
                return;
            case 4:
                ((gb.g) this.f21342b).onError(th);
                return;
            case 5:
                gb.g gVar = (gb.g) this.f21342b;
                try {
                    Object apply = ((InterfaceC1394e) this.f21343c).apply(th);
                    Objects.requireNonNull(apply, "The resumeFunction returned a null MaybeSource");
                    gb.f fVar = (gb.f) apply;
                    EnumC1437b.f(this, null);
                    fVar.b(new ha.g(8, gVar, this));
                    return;
                } catch (Throwable th4) {
                    u0.L(th4);
                    gVar.onError(new C1360b(th, th4));
                    return;
                }
            case 6:
                ((gb.g) this.f21343c).onError(th);
                return;
            case 7:
                ((q) this.f21342b).onError(th);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((l) this.f21342b).onError(th);
                return;
            case 9:
                ((l) this.f21342b).onError(th);
                return;
            case 10:
                ((l) this.f21342b).onError(th);
                return;
            default:
                ((q) this.f21342b).onError(th);
                return;
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        switch (this.f21341a) {
            case 1:
                lazySet(EnumC1437b.f19070a);
                try {
                    ((InterfaceC1393d) this.f21342b).accept(obj);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    com.bumptech.glide.d.t(th);
                    return;
                }
            case 2:
            case 3:
            default:
                try {
                    k kVar = (k) ((q3.e) this.f21343c).apply(obj);
                    if (g()) {
                        return;
                    }
                    kVar.b(this);
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    ((l) this.f21342b).onError(th2);
                    return;
                }
            case 4:
                try {
                    p pVar = (p) ((C1108c) this.f21343c).apply(obj);
                    if (g()) {
                        return;
                    }
                    pVar.d(new C1108c(11, this, (gb.g) this.f21342b));
                    return;
                } catch (Throwable th3) {
                    u0.L(th3);
                    onError(th3);
                    return;
                }
            case 5:
                ((gb.g) this.f21342b).onSuccess(obj);
                return;
            case 6:
                ((gb.g) this.f21343c).onSuccess(obj);
                return;
            case 7:
                ((q) this.f21342b).onSuccess(obj);
                return;
        }
    }
}
