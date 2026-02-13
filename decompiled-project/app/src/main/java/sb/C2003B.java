package sb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import rb.C1955b;
import xb.C2273a;

/* renamed from: sb.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2003B extends AtomicInteger implements gb.l, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24232a;

    /* renamed from: d, reason: collision with root package name */
    public final Bb.c f24235d;

    /* renamed from: u, reason: collision with root package name */
    public final gb.k f24238u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f24239v;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f24233b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final C2273a f24234c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final C1955b f24236e = new C1955b(this);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f24237f = new AtomicReference();

    /* JADX WARN: Type inference failed for: r1v2, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    public C2003B(gb.l lVar, Bb.c cVar, gb.k kVar) {
        this.f24232a = lVar;
        this.f24235d = cVar;
        this.f24238u = kVar;
    }

    @Override // gb.l
    public final void a() {
        EnumC1437b.a(this.f24236e);
        if (getAndIncrement() == 0) {
            this.f24234c.f(this.f24232a);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        EnumC1437b.a(this.f24237f);
        EnumC1437b.a(this.f24236e);
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        EnumC1437b.f(this.f24237f, interfaceC1269b);
    }

    public final void d() {
        if (this.f24233b.getAndIncrement() != 0) {
            return;
        }
        while (!g()) {
            if (!this.f24239v) {
                this.f24239v = true;
                this.f24238u.b(this);
            }
            if (this.f24233b.decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            gb.l lVar = this.f24232a;
            lVar.e(obj);
            if (decrementAndGet() != 0) {
                this.f24234c.f(lVar);
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return EnumC1437b.d((InterfaceC1269b) this.f24237f.get());
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        EnumC1437b.f(this.f24237f, null);
        this.f24239v = false;
        this.f24235d.e(th);
    }
}
