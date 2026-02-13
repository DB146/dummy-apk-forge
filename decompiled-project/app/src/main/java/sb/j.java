package sb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import yb.C2477g;
import yb.InterfaceC2471a;
import yb.InterfaceC2475e;

/* loaded from: classes2.dex */
public final class j extends AtomicReference implements gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final k f24276a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f24277b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2475e f24278c;

    /* renamed from: d, reason: collision with root package name */
    public int f24279d;

    public j(k kVar) {
        this.f24276a = kVar;
    }

    @Override // gb.l
    public final void a() {
        this.f24277b = true;
        this.f24276a.h();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.j(this, interfaceC1269b) && (interfaceC1269b instanceof InterfaceC2471a)) {
            InterfaceC2471a interfaceC2471a = (InterfaceC2471a) interfaceC1269b;
            int i7 = interfaceC2471a.i(7);
            if (i7 == 1) {
                this.f24279d = i7;
                this.f24278c = interfaceC2471a;
                this.f24277b = true;
                this.f24276a.h();
                return;
            }
            if (i7 == 2) {
                this.f24279d = i7;
                this.f24278c = interfaceC2471a;
            }
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f24279d != 0) {
            this.f24276a.h();
            return;
        }
        k kVar = this.f24276a;
        if (kVar.get() == 0 && kVar.compareAndSet(0, 1)) {
            kVar.f24284a.e(obj);
            if (kVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            InterfaceC2475e interfaceC2475e = this.f24278c;
            if (interfaceC2475e == null) {
                interfaceC2475e = new C2477g(kVar.f24287d);
                this.f24278c = interfaceC2475e;
            }
            interfaceC2475e.offer(obj);
            if (kVar.getAndIncrement() != 0) {
                return;
            }
        }
        kVar.i();
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24276a.f24290u.b(th)) {
            k kVar = this.f24276a;
            kVar.getClass();
            kVar.f();
            this.f24277b = true;
            this.f24276a.h();
        }
    }
}
