package qb;

import hb.InterfaceC1269b;
import ia.C1357c;
import java.util.Iterator;
import java.util.Objects;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class l extends nb.b implements gb.g {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f23619a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1269b f23620b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Iterator f23621c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f23622d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23623e;

    public l(gb.l lVar) {
        this.f23619a = lVar;
    }

    @Override // gb.g
    public final void a() {
        this.f23619a.a();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f23622d = true;
        this.f23620b.b();
        this.f23620b = EnumC1437b.f19070a;
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f23620b, interfaceC1269b)) {
            this.f23620b = interfaceC1269b;
            this.f23619a.c(this);
        }
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f23621c = null;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f23622d;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        this.f23623e = true;
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f23621c == null;
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        this.f23620b = EnumC1437b.f19070a;
        this.f23619a.onError(th);
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        gb.l lVar = this.f23619a;
        try {
            Iterator it = ((Iterable) C1357c.f18482b.apply(obj)).iterator();
            if (!it.hasNext()) {
                lVar.a();
                return;
            }
            this.f23621c = it;
            if (this.f23623e) {
                lVar.e(null);
                lVar.a();
                return;
            }
            while (!this.f23622d) {
                try {
                    lVar.e(it.next());
                    if (this.f23622d) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            lVar.a();
                            return;
                        }
                    } catch (Throwable th) {
                        u0.L(th);
                        lVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    u0.L(th2);
                    lVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            u0.L(th3);
            lVar.onError(th3);
        }
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        Iterator it = this.f23621c;
        if (it == null) {
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f23621c = null;
        }
        return next;
    }
}
