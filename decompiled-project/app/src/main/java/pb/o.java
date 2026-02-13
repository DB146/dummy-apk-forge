package pb;

import M1.C0386a;
import hb.InterfaceC1269b;
import java.util.NoSuchElementException;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class o implements gb.e, InterfaceC1269b, gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23310a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23311b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23312c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23313d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23314e;

    public o(gb.l lVar, C0386a c0386a) {
        this.f23310a = 2;
        this.f23314e = lVar;
        this.f23311b = c0386a;
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.f23310a = i7;
        this.f23314e = obj;
    }

    @Override // gb.e, gb.l
    public final void a() {
        switch (this.f23310a) {
            case 0:
                if (this.f23312c) {
                    return;
                }
                this.f23312c = true;
                this.f23311b = wb.c.f25857a;
                Object obj = this.f23313d;
                this.f23313d = null;
                gb.g gVar = (gb.g) this.f23314e;
                if (obj == null) {
                    gVar.a();
                    return;
                } else {
                    gVar.onSuccess(obj);
                    return;
                }
            case 1:
                if (this.f23312c) {
                    return;
                }
                this.f23312c = true;
                this.f23311b = wb.c.f25857a;
                Object obj2 = this.f23313d;
                this.f23313d = null;
                if (obj2 == null) {
                    obj2 = null;
                }
                gb.q qVar = (gb.q) this.f23314e;
                if (obj2 != null) {
                    qVar.onSuccess(obj2);
                    return;
                } else {
                    qVar.onError(new NoSuchElementException());
                    return;
                }
            default:
                if (this.f23312c) {
                    return;
                }
                this.f23312c = true;
                ((gb.l) this.f23314e).a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23310a) {
            case 0:
                ((Ac.b) this.f23311b).cancel();
                this.f23311b = wb.c.f25857a;
                return;
            case 1:
                ((Ac.b) this.f23311b).cancel();
                this.f23311b = wb.c.f25857a;
                return;
            default:
                ((InterfaceC1269b) this.f23313d).b();
                return;
        }
    }

    @Override // gb.l
    public void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o((InterfaceC1269b) this.f23313d, interfaceC1269b)) {
            this.f23313d = interfaceC1269b;
            ((gb.l) this.f23314e).c(this);
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        switch (this.f23310a) {
            case 0:
                if (this.f23312c) {
                    return;
                }
                if (this.f23313d == null) {
                    this.f23313d = obj;
                    return;
                }
                this.f23312c = true;
                ((Ac.b) this.f23311b).cancel();
                this.f23311b = wb.c.f25857a;
                ((gb.g) this.f23314e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            case 1:
                if (this.f23312c) {
                    return;
                }
                if (this.f23313d == null) {
                    this.f23313d = obj;
                    return;
                }
                this.f23312c = true;
                ((Ac.b) this.f23311b).cancel();
                this.f23311b = wb.c.f25857a;
                ((gb.q) this.f23314e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            default:
                if (this.f23312c) {
                    return;
                }
                try {
                    boolean test = ((C0386a) this.f23311b).test(obj);
                    gb.l lVar = (gb.l) this.f23314e;
                    if (test) {
                        lVar.e(obj);
                        return;
                    }
                    this.f23312c = true;
                    ((InterfaceC1269b) this.f23313d).b();
                    lVar.a();
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    ((InterfaceC1269b) this.f23313d).b();
                    onError(th);
                    return;
                }
        }
    }

    @Override // gb.e
    public void f(Ac.b bVar) {
        switch (this.f23310a) {
            case 0:
                if (wb.c.b((Ac.b) this.f23311b, bVar)) {
                    this.f23311b = bVar;
                    ((gb.g) this.f23314e).c(this);
                    bVar.d(Long.MAX_VALUE);
                    return;
                }
                return;
            default:
                if (wb.c.b((Ac.b) this.f23311b, bVar)) {
                    this.f23311b = bVar;
                    ((gb.q) this.f23314e).c(this);
                    bVar.d(Long.MAX_VALUE);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23310a) {
            case 0:
                return ((Ac.b) this.f23311b) == wb.c.f25857a;
            case 1:
                return ((Ac.b) this.f23311b) == wb.c.f25857a;
            default:
                return ((InterfaceC1269b) this.f23313d).g();
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        switch (this.f23310a) {
            case 0:
                if (this.f23312c) {
                    com.bumptech.glide.d.t(th);
                    return;
                }
                this.f23312c = true;
                this.f23311b = wb.c.f25857a;
                ((gb.g) this.f23314e).onError(th);
                return;
            case 1:
                if (this.f23312c) {
                    com.bumptech.glide.d.t(th);
                    return;
                }
                this.f23312c = true;
                this.f23311b = wb.c.f25857a;
                ((gb.q) this.f23314e).onError(th);
                return;
            default:
                if (this.f23312c) {
                    com.bumptech.glide.d.t(th);
                    return;
                } else {
                    this.f23312c = true;
                    ((gb.l) this.f23314e).onError(th);
                    return;
                }
        }
    }
}
