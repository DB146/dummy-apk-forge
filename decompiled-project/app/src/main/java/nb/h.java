package nb;

import Y5.B;
import gb.l;
import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1390a;
import jb.InterfaceC1393d;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class h extends AtomicReference implements l, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1393d f21350a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1393d f21351b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1390a f21352c;

    /* renamed from: d, reason: collision with root package name */
    public final B f21353d;

    public h(InterfaceC1393d interfaceC1393d, InterfaceC1393d interfaceC1393d2, InterfaceC1390a interfaceC1390a) {
        B b2 = lb.b.f19615d;
        this.f21350a = interfaceC1393d;
        this.f21351b = interfaceC1393d2;
        this.f21352c = interfaceC1390a;
        this.f21353d = b2;
    }

    @Override // gb.l
    public final void a() {
        if (g()) {
            return;
        }
        lazySet(EnumC1437b.f19070a);
        try {
            this.f21352c.run();
        } catch (Throwable th) {
            u0.L(th);
            com.bumptech.glide.d.t(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        EnumC1437b.a(this);
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.j(this, interfaceC1269b)) {
            try {
                this.f21353d.getClass();
            } catch (Throwable th) {
                u0.L(th);
                interfaceC1269b.b();
                onError(th);
            }
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (g()) {
            return;
        }
        try {
            this.f21350a.accept(obj);
        } catch (Throwable th) {
            u0.L(th);
            ((InterfaceC1269b) get()).b();
            onError(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get() == EnumC1437b.f19070a;
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (g()) {
            com.bumptech.glide.d.t(th);
            return;
        }
        lazySet(EnumC1437b.f19070a);
        try {
            this.f21351b.accept(th);
        } catch (Throwable th2) {
            u0.L(th2);
            com.bumptech.glide.d.t(new C1360b(th, th2));
        }
    }
}
