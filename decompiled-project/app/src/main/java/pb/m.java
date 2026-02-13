package pb;

import java.util.NoSuchElementException;
import wb.AbstractC2227a;

/* loaded from: classes2.dex */
public final class m extends AbstractC2227a implements gb.e {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23306c;

    /* renamed from: d, reason: collision with root package name */
    public Ac.b f23307d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23308e;

    public m(gb.e eVar, boolean z8) {
        super(eVar);
        this.f23306c = z8;
    }

    @Override // gb.e, gb.l
    public final void a() {
        if (this.f23308e) {
            return;
        }
        this.f23308e = true;
        Object obj = this.f25849b;
        this.f25849b = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            b(obj);
            return;
        }
        boolean z8 = this.f23306c;
        gb.e eVar = this.f25848a;
        if (z8) {
            eVar.onError(new NoSuchElementException());
        } else {
            eVar.a();
        }
    }

    @Override // Ac.b
    public final void cancel() {
        set(4);
        this.f25849b = null;
        this.f23307d.cancel();
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        if (this.f23308e) {
            return;
        }
        if (this.f25849b == null) {
            this.f25849b = obj;
            return;
        }
        this.f23308e = true;
        this.f23307d.cancel();
        this.f25848a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        if (wb.c.b(this.f23307d, bVar)) {
            this.f23307d = bVar;
            this.f25848a.f(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        if (this.f23308e) {
            com.bumptech.glide.d.t(th);
        } else {
            this.f23308e = true;
            this.f25848a.onError(th);
        }
    }
}
