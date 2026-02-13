package qb;

import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import vb.C2170d;

/* loaded from: classes2.dex */
public final class e extends AtomicReference implements gb.g, InterfaceC1269b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final gb.g f23600a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23601b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f23602c;

    /* renamed from: d, reason: collision with root package name */
    public final C2170d f23603d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23604e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f23605f;

    public e(gb.g gVar, long j, TimeUnit timeUnit, C2170d c2170d) {
        this.f23600a = gVar;
        this.f23601b = j;
        this.f23602c = timeUnit;
        this.f23603d = c2170d;
    }

    @Override // gb.g
    public final void a() {
        EnumC1437b.f(this, this.f23603d.c(this, this.f23601b, this.f23602c));
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        EnumC1437b.a(this);
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.j(this, interfaceC1269b)) {
            this.f23600a.c(this);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return EnumC1437b.d((InterfaceC1269b) get());
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        this.f23605f = th;
        EnumC1437b.f(this, this.f23603d.c(this, 0L, this.f23602c));
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        this.f23604e = obj;
        EnumC1437b.f(this, this.f23603d.c(this, this.f23601b, this.f23602c));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.f23605f;
        gb.g gVar = this.f23600a;
        if (th != null) {
            gVar.onError(th);
            return;
        }
        Object obj = this.f23604e;
        if (obj != null) {
            gVar.onSuccess(obj);
        } else {
            gVar.a();
        }
    }
}
