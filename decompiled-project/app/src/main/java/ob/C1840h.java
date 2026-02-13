package ob;

import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ob.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1840h extends AtomicInteger implements gb.b, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.b f22219a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22220b;

    /* renamed from: c, reason: collision with root package name */
    public final C1268a f22221c;

    public C1840h(gb.b bVar, AtomicBoolean atomicBoolean, C1268a c1268a, int i7) {
        this.f22219a = bVar;
        this.f22220b = atomicBoolean;
        this.f22221c = c1268a;
        lazySet(i7);
    }

    @Override // gb.b
    public final void a() {
        if (decrementAndGet() == 0) {
            this.f22219a.a();
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f22221c.b();
        this.f22220b.set(true);
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        this.f22221c.d(interfaceC1269b);
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f22221c.f17922b;
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        this.f22221c.b();
        if (this.f22220b.compareAndSet(false, true)) {
            this.f22219a.onError(th);
        } else {
            com.bumptech.glide.d.t(th);
        }
    }
}
