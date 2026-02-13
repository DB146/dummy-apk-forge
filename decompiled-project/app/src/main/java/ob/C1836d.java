package ob;

import a.AbstractC0672a;
import gb.q;
import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import xb.AbstractC2275c;
import yb.C2477g;

/* renamed from: ob.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1836d extends AtomicReference implements InterfaceC1269b, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22211a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22212b;

    public C1836d(gb.b bVar) {
        this.f22212b = bVar;
    }

    public C1836d(pb.b bVar) {
        this.f22212b = bVar;
    }

    public void a() {
        InterfaceC1269b interfaceC1269b;
        Object obj = get();
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        if (obj == enumC1437b || (interfaceC1269b = (InterfaceC1269b) getAndSet(enumC1437b)) == enumC1437b) {
            return;
        }
        try {
            ((gb.b) this.f22212b).a();
        } finally {
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f22211a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        EnumC1437b.j(this, interfaceC1269b);
    }

    public boolean d(Throwable th) {
        InterfaceC1269b interfaceC1269b;
        if (th == null) {
            th = AbstractC2275c.a("onError called with a null Throwable.");
        }
        Object obj = get();
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        if (obj == enumC1437b || (interfaceC1269b = (InterfaceC1269b) getAndSet(enumC1437b)) == enumC1437b) {
            return false;
        }
        try {
            ((gb.b) this.f22212b).onError(th);
        } finally {
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f22211a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.q
    public void onError(Throwable th) {
        pb.b bVar = (pb.b) this.f22212b;
        C1268a c1268a = bVar.f23265d;
        c1268a.a(this);
        if (bVar.f23267f.b(th)) {
            bVar.f23270w.cancel();
            c1268a.b();
            bVar.f23266e.decrementAndGet();
            bVar.c();
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        pb.b bVar = (pb.b) this.f22212b;
        bVar.f23265d.a(this);
        if (bVar.get() == 0) {
            if (bVar.compareAndSet(0, 1)) {
                boolean z8 = bVar.f23266e.decrementAndGet() == 0;
                if (bVar.f23264c.get() != 0) {
                    bVar.f23262a.e(obj);
                    C2477g c2477g = (C2477g) bVar.f23269v.get();
                    if (z8 && (c2477g == null || c2477g.isEmpty())) {
                        bVar.f23267f.e(bVar.f23262a);
                        return;
                    } else {
                        AbstractC0672a.m(bVar.f23264c, 1L);
                        if (bVar.f23263b != Integer.MAX_VALUE) {
                            bVar.f23270w.d(1L);
                        }
                    }
                } else {
                    C2477g h10 = bVar.h();
                    synchronized (h10) {
                        h10.offer(obj);
                    }
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
                bVar.g();
            }
        }
        C2477g h11 = bVar.h();
        synchronized (h11) {
            h11.offer(obj);
        }
        bVar.f23266e.decrementAndGet();
        if (bVar.getAndIncrement() != 0) {
            return;
        }
        bVar.g();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f22211a) {
            case 0:
                return X.c.j(C1836d.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }
}
