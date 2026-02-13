package vb;

import hb.InterfaceC1269b;
import hb.InterfaceC1270c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class h extends AtomicInteger implements Runnable, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25389a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1270c f25390b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Thread f25391c;

    public h(Runnable runnable, InterfaceC1270c interfaceC1270c) {
        this.f25389a = runnable;
        this.f25390b = interfaceC1270c;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        while (true) {
            int i7 = get();
            if (i7 >= 2) {
                return;
            }
            if (i7 == 0) {
                if (compareAndSet(0, 4)) {
                    InterfaceC1270c interfaceC1270c = this.f25390b;
                    if (interfaceC1270c != null) {
                        interfaceC1270c.a(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.f25391c;
                if (thread != null) {
                    thread.interrupt();
                    this.f25391c = null;
                }
                set(4);
                InterfaceC1270c interfaceC1270c2 = this.f25390b;
                if (interfaceC1270c2 != null) {
                    interfaceC1270c2.a(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.f25391c = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.f25391c = null;
                return;
            }
            try {
                this.f25389a.run();
                this.f25391c = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    InterfaceC1270c interfaceC1270c = this.f25390b;
                    if (interfaceC1270c != null) {
                        interfaceC1270c.a(this);
                    }
                }
            } catch (Throwable th) {
                try {
                    com.bumptech.glide.d.t(th);
                    throw th;
                } catch (Throwable th2) {
                    this.f25391c = null;
                    if (compareAndSet(1, 2)) {
                        InterfaceC1270c interfaceC1270c2 = this.f25390b;
                        if (interfaceC1270c2 != null) {
                            interfaceC1270c2.a(this);
                        }
                    } else {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    }
                    throw th2;
                }
            }
        }
    }
}
