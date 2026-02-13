package ob;

import gb.AbstractC1204a;
import gb.o;
import gb.p;
import gb.q;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.C1436a;
import kb.EnumC1437b;

/* renamed from: ob.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1841i extends AtomicReference implements gb.b, InterfaceC1269b, Runnable, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22222a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22224c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22225d;

    public RunnableC1841i(gb.b bVar, AbstractC1204a abstractC1204a) {
        this.f22222a = 1;
        this.f22223b = bVar;
        this.f22225d = abstractC1204a;
        this.f22224c = new C1436a();
    }

    public RunnableC1841i(gb.b bVar, o oVar) {
        this.f22222a = 0;
        this.f22223b = bVar;
        this.f22224c = oVar;
    }

    public RunnableC1841i(q qVar, p pVar) {
        this.f22222a = 2;
        this.f22223b = qVar;
        this.f22225d = pVar;
        this.f22224c = new C1436a();
    }

    @Override // gb.b
    public void a() {
        switch (this.f22222a) {
            case 0:
                EnumC1437b.f(this, ((o) this.f22224c).b(this));
                return;
            default:
                ((gb.b) this.f22223b).a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f22222a) {
            case 0:
                EnumC1437b.a(this);
                return;
            case 1:
                EnumC1437b.a(this);
                C1436a c1436a = (C1436a) this.f22224c;
                c1436a.getClass();
                EnumC1437b.a(c1436a);
                return;
            default:
                EnumC1437b.a(this);
                C1436a c1436a2 = (C1436a) this.f22224c;
                c1436a2.getClass();
                EnumC1437b.a(c1436a2);
                return;
        }
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f22222a) {
            case 0:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    ((gb.b) this.f22223b).c(this);
                    return;
                }
                return;
            case 1:
                EnumC1437b.j(this, interfaceC1269b);
                return;
            default:
                EnumC1437b.j(this, interfaceC1269b);
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f22222a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            case 1:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        switch (this.f22222a) {
            case 0:
                this.f22225d = th;
                EnumC1437b.f(this, ((o) this.f22224c).b(this));
                return;
            case 1:
                ((gb.b) this.f22223b).onError(th);
                return;
            default:
                ((q) this.f22223b).onError(th);
                return;
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        ((q) this.f22223b).onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22222a) {
            case 0:
                Throwable th = (Throwable) this.f22225d;
                gb.b bVar = (gb.b) this.f22223b;
                if (th == null) {
                    bVar.a();
                    return;
                } else {
                    this.f22225d = null;
                    bVar.onError(th);
                    return;
                }
            case 1:
                ((AbstractC1204a) this.f22225d).c(this);
                return;
            default:
                ((p) this.f22225d).d(this);
                return;
        }
    }
}
