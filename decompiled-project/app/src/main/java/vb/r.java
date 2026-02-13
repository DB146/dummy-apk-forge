package vb;

import Y5.D;
import hb.InterfaceC1269b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r extends AtomicReference implements Callable, InterfaceC1269b {

    /* renamed from: d, reason: collision with root package name */
    public static final FutureTask f25425d;

    /* renamed from: e, reason: collision with root package name */
    public static final FutureTask f25426e;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25427a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25428b = true;

    /* renamed from: c, reason: collision with root package name */
    public Thread f25429c;

    static {
        D d10 = lb.b.f19613b;
        f25425d = new FutureTask(d10, null);
        f25426e = new FutureTask(d10, null);
    }

    public r(Runnable runnable) {
        this.f25427a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f25425d) {
                return;
            }
            if (future2 == f25426e) {
                if (this.f25429c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f25428b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f25425d || future == (futureTask = f25426e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f25429c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f25428b);
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = f25425d;
        this.f25429c = Thread.currentThread();
        try {
            try {
                this.f25427a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f25429c = null;
            }
        } catch (Throwable th) {
            com.bumptech.glide.d.t(th);
            throw th;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        Future future = (Future) get();
        return future == f25425d || future == f25426e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == f25425d) {
            str = "Finished";
        } else if (future == f25426e) {
            str = "Disposed";
        } else if (this.f25429c != null) {
            str = "Running on " + this.f25429c;
        } else {
            str = "Waiting";
        }
        return r.class.getSimpleName() + "[" + str + "]";
    }
}
