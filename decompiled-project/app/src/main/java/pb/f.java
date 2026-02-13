package pb;

import ha.C1265a;
import wb.AbstractC2227a;
import y7.u0;

/* loaded from: classes2.dex */
public final class f extends AbstractC2227a implements gb.e {

    /* renamed from: c, reason: collision with root package name */
    public final C1265a f23280c;

    /* renamed from: d, reason: collision with root package name */
    public Ac.b f23281d;

    public f(gb.e eVar, C1265a c1265a) {
        super(eVar);
        this.f23280c = c1265a;
    }

    @Override // gb.e, gb.l
    public final void a() {
        Ac.b bVar = this.f23281d;
        wb.c cVar = wb.c.f25857a;
        if (bVar == cVar) {
            return;
        }
        this.f23281d = cVar;
        Object obj = this.f25849b;
        if (obj != null) {
            b(obj);
        } else {
            this.f25848a.a();
        }
    }

    @Override // Ac.b
    public final void cancel() {
        set(4);
        this.f25849b = null;
        this.f23281d.cancel();
        this.f23281d = wb.c.f25857a;
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        if (this.f23281d == wb.c.f25857a) {
            return;
        }
        Object obj2 = this.f25849b;
        if (obj2 == null) {
            this.f25849b = obj;
            return;
        }
        try {
            this.f25849b = this.f23280c.apply(obj2, obj);
        } catch (Throwable th) {
            u0.L(th);
            this.f23281d.cancel();
            onError(th);
        }
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        if (wb.c.b(this.f23281d, bVar)) {
            this.f23281d = bVar;
            this.f25848a.f(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        Ac.b bVar = this.f23281d;
        wb.c cVar = wb.c.f25857a;
        if (bVar == cVar) {
            com.bumptech.glide.d.t(th);
        } else {
            this.f23281d = cVar;
            this.f25848a.onError(th);
        }
    }
}
