package sb;

import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.concurrent.atomic.AtomicInteger;
import jb.InterfaceC1392c;
import kb.C1436a;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class y extends AtomicInteger implements gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24345a;

    /* renamed from: b, reason: collision with root package name */
    public final C1436a f24346b;

    /* renamed from: c, reason: collision with root package name */
    public final gb.k f24347c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1392c f24348d;

    /* renamed from: e, reason: collision with root package name */
    public int f24349e;

    public y(gb.l lVar, InterfaceC1392c interfaceC1392c, C1436a c1436a, gb.k kVar) {
        this.f24345a = lVar;
        this.f24346b = c1436a;
        this.f24347c = kVar;
        this.f24348d = interfaceC1392c;
    }

    @Override // gb.l
    public final void a() {
        this.f24345a.a();
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            int i7 = 1;
            while (!this.f24346b.g()) {
                this.f24347c.b(this);
                i7 = addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = this.f24346b;
        c1436a.getClass();
        EnumC1437b.f(c1436a, interfaceC1269b);
    }

    @Override // gb.l
    public final void e(Object obj) {
        this.f24345a.e(obj);
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        gb.l lVar = this.f24345a;
        try {
            InterfaceC1392c interfaceC1392c = this.f24348d;
            int i7 = this.f24349e + 1;
            this.f24349e = i7;
            if (interfaceC1392c.w(Integer.valueOf(i7), th)) {
                b();
            } else {
                lVar.onError(th);
            }
        } catch (Throwable th2) {
            u0.L(th2);
            lVar.onError(new C1360b(th, th2));
        }
    }
}
