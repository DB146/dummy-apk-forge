package vb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class g extends AtomicBoolean implements Runnable, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25388a;

    public g(Runnable runnable) {
        this.f25388a = runnable;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        lazySet(true);
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.f25388a.run();
        } finally {
        }
    }
}
