package vb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.C1436a;
import kb.EnumC1437b;

/* loaded from: classes2.dex */
public final class f extends AtomicReference implements Runnable, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final C1436a f25386a;

    /* renamed from: b, reason: collision with root package name */
    public final C1436a f25387b;

    public f(Runnable runnable) {
        super(runnable);
        this.f25386a = new C1436a();
        this.f25387b = new C1436a();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (getAndSet(null) != null) {
            C1436a c1436a = this.f25386a;
            c1436a.getClass();
            EnumC1437b.a(c1436a);
            C1436a c1436a2 = this.f25387b;
            c1436a2.getClass();
            EnumC1437b.a(c1436a2);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1436a c1436a = this.f25387b;
        C1436a c1436a2 = this.f25386a;
        EnumC1437b enumC1437b = EnumC1437b.f19070a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                try {
                    runnable.run();
                    lazySet(null);
                    c1436a2.lazySet(enumC1437b);
                    c1436a.lazySet(enumC1437b);
                } catch (Throwable th) {
                    lazySet(null);
                    c1436a2.lazySet(enumC1437b);
                    c1436a.lazySet(enumC1437b);
                    throw th;
                }
            } catch (Throwable th2) {
                com.bumptech.glide.d.t(th2);
                throw th2;
            }
        }
    }
}
