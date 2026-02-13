package ob;

import Eb.v;
import Z9.C0668e;
import hb.InterfaceC1269b;
import ib.C1360b;
import kb.EnumC1437b;
import y7.u0;

/* renamed from: ob.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1839g implements gb.e, InterfaceC1269b, gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22217b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22218c;

    public /* synthetic */ C1839g(Object obj, int i7) {
        this.f22216a = i7;
        this.f22218c = obj;
    }

    private final void d(Object obj) {
    }

    @Override // gb.e, gb.l
    public final void a() {
        switch (this.f22216a) {
            case 0:
                ((gb.b) this.f22218c).a();
                return;
            case 1:
                ((gb.l) this.f22218c).a();
                return;
            default:
                ((gb.l) this.f22218c).a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f22216a) {
            case 0:
                ((Ac.b) this.f22217b).cancel();
                this.f22217b = wb.c.f25857a;
                return;
            case 1:
                ((Ac.b) this.f22217b).cancel();
                this.f22217b = wb.c.f25857a;
                return;
            default:
                ((InterfaceC1269b) this.f22217b).b();
                return;
        }
    }

    @Override // gb.l
    public void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o((InterfaceC1269b) this.f22217b, interfaceC1269b)) {
            this.f22217b = interfaceC1269b;
            ((gb.l) this.f22218c).c(this);
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        switch (this.f22216a) {
            case 0:
                return;
            case 1:
                ((gb.l) this.f22218c).e(obj);
                return;
            default:
                ((gb.l) this.f22218c).e(obj);
                return;
        }
    }

    @Override // gb.e
    public void f(Ac.b bVar) {
        switch (this.f22216a) {
            case 0:
                if (wb.c.b((Ac.b) this.f22217b, bVar)) {
                    this.f22217b = bVar;
                    ((gb.b) this.f22218c).c(this);
                    bVar.d(Long.MAX_VALUE);
                    return;
                }
                return;
            default:
                if (wb.c.b((Ac.b) this.f22217b, bVar)) {
                    this.f22217b = bVar;
                    ((gb.l) this.f22218c).c(this);
                    bVar.d(Long.MAX_VALUE);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f22216a) {
            case 0:
                return ((Ac.b) this.f22217b) == wb.c.f25857a;
            case 1:
                return ((Ac.b) this.f22217b) == wb.c.f25857a;
            default:
                return ((InterfaceC1269b) this.f22217b).g();
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        switch (this.f22216a) {
            case 0:
                ((gb.b) this.f22218c).onError(th);
                return;
            case 1:
                ((gb.l) this.f22218c).onError(th);
                return;
            default:
                gb.l lVar = (gb.l) this.f22218c;
                try {
                    C0668e.f12261b.apply(th);
                    lVar.e(v.f3891a);
                    lVar.a();
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    lVar.onError(new C1360b(th, th2));
                    return;
                }
        }
    }
}
