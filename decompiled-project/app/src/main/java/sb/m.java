package sb;

import gb.AbstractC1204a;
import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import nb.AbstractC1719a;
import xb.C2273a;
import y7.u0;

/* loaded from: classes2.dex */
public final class m extends AbstractC1719a implements gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24299a;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f24301c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24302d;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1269b f24304f;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f24305u;

    /* renamed from: b, reason: collision with root package name */
    public final C2273a f24300b = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final C1268a f24303e = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, hb.a] */
    public m(gb.l lVar, InterfaceC1394e interfaceC1394e, boolean z8) {
        this.f24299a = lVar;
        this.f24301c = interfaceC1394e;
        this.f24302d = z8;
        lazySet(1);
    }

    @Override // gb.l
    public final void a() {
        if (decrementAndGet() == 0) {
            this.f24300b.f(this.f24299a);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24305u = true;
        this.f24304f.b();
        this.f24303e.b();
        this.f24300b.c();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24304f, interfaceC1269b)) {
            this.f24304f = interfaceC1269b;
            this.f24299a.c(this);
        }
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
    }

    @Override // gb.l
    public final void e(Object obj) {
        try {
            Object apply = this.f24301c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            AbstractC1204a abstractC1204a = (AbstractC1204a) apply;
            getAndIncrement();
            qb.c cVar = new qb.c(this);
            if (this.f24305u || !this.f24303e.d(cVar)) {
                return;
            }
            abstractC1204a.c(cVar);
        } catch (Throwable th) {
            u0.L(th);
            this.f24304f.b();
            onError(th);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24304f.g();
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return true;
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24300b.b(th)) {
            if (this.f24302d) {
                if (decrementAndGet() == 0) {
                    this.f24300b.f(this.f24299a);
                }
            } else {
                this.f24305u = true;
                this.f24304f.b();
                this.f24303e.b();
                this.f24300b.f(this.f24299a);
            }
        }
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        return null;
    }
}
