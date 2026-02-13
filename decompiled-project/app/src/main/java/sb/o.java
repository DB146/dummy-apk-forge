package sb;

import gb.AbstractC1204a;
import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import xb.C2273a;
import y7.u0;

/* loaded from: classes2.dex */
public final class o extends AtomicInteger implements InterfaceC1269b, gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final gb.b f24308a;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f24310c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24311d;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1269b f24313f;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f24314u;

    /* renamed from: b, reason: collision with root package name */
    public final C2273a f24309b = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final C1268a f24312e = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, hb.a] */
    public o(gb.b bVar, InterfaceC1394e interfaceC1394e, boolean z8) {
        this.f24308a = bVar;
        this.f24310c = interfaceC1394e;
        this.f24311d = z8;
        lazySet(1);
    }

    @Override // gb.l
    public final void a() {
        if (decrementAndGet() == 0) {
            this.f24309b.d(this.f24308a);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24314u = true;
        this.f24313f.b();
        this.f24312e.b();
        this.f24309b.c();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24313f, interfaceC1269b)) {
            this.f24313f = interfaceC1269b;
            this.f24308a.c(this);
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        try {
            Object apply = this.f24310c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            AbstractC1204a abstractC1204a = (AbstractC1204a) apply;
            getAndIncrement();
            C2010d c2010d = new C2010d(this);
            if (this.f24314u || !this.f24312e.d(c2010d)) {
                return;
            }
            abstractC1204a.c(c2010d);
        } catch (Throwable th) {
            u0.L(th);
            this.f24313f.b();
            onError(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24313f.g();
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24309b.b(th)) {
            if (this.f24311d) {
                if (decrementAndGet() == 0) {
                    this.f24309b.d(this.f24308a);
                }
            } else {
                this.f24314u = true;
                this.f24313f.b();
                this.f24312e.b();
                this.f24309b.d(this.f24308a);
            }
        }
    }
}
