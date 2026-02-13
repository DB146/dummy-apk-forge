package vb;

import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2167a extends gb.n {

    /* renamed from: a, reason: collision with root package name */
    public final kb.d f25372a;

    /* renamed from: b, reason: collision with root package name */
    public final C1268a f25373b;

    /* renamed from: c, reason: collision with root package name */
    public final kb.d f25374c;

    /* renamed from: d, reason: collision with root package name */
    public final C2169c f25375d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f25376e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hb.a, hb.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kb.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, hb.b, kb.d] */
    public C2167a(C2169c c2169c) {
        this.f25375d = c2169c;
        ?? obj = new Object();
        this.f25372a = obj;
        ?? obj2 = new Object();
        this.f25373b = obj2;
        ?? obj3 = new Object();
        this.f25374c = obj3;
        obj3.d(obj);
        obj3.d(obj2);
    }

    @Override // gb.n
    public final InterfaceC1269b a(Runnable runnable) {
        return this.f25376e ? kb.c.f19072a : this.f25375d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f25372a);
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f25376e) {
            return;
        }
        this.f25376e = true;
        this.f25374c.b();
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f25376e ? kb.c.f19072a : this.f25375d.d(runnable, j, timeUnit, this.f25373b);
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f25376e;
    }
}
