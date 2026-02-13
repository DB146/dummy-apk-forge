package vb;

import hb.InterfaceC1269b;
import hb.InterfaceC1270c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class s extends AtomicReferenceArray implements Runnable, Callable, InterfaceC1269b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f25430c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f25431d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f25432e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f25433f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25434a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25435b;

    public s(Runnable runnable, InterfaceC1270c interfaceC1270c, boolean z8) {
        super(3);
        this.f25434a = runnable;
        this.f25435b = z8;
        lazySet(0, interfaceC1270c);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f25433f) {
                return;
            }
            if (obj == f25431d) {
                future.cancel(false);
                return;
            } else if (obj == f25432e) {
                future.cancel(this.f25435b);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f25433f;
            if (obj6 == obj || obj6 == (obj4 = f25431d) || obj6 == (obj5 = f25432e)) {
                break;
            }
            boolean z8 = get(2) != Thread.currentThread();
            if (z8) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z8 && this.f25435b);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f25430c) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC1270c) obj2).a(this);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        Object obj = get(0);
        return obj == f25430c || obj == f25433f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f25432e;
        Object obj4 = f25431d;
        Object obj5 = f25430c;
        Object obj6 = f25433f;
        lazySet(2, Thread.currentThread());
        try {
            this.f25434a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((InterfaceC1270c) obj7).a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                com.bumptech.glide.d.t(th);
                throw th;
            } catch (Throwable th2) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((InterfaceC1270c) obj8).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String g;
        Object obj = get(1);
        if (obj == f25433f) {
            g = "Finished";
        } else if (obj == f25431d) {
            g = "Disposed(Sync)";
        } else if (obj == f25432e) {
            g = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            g = obj2 == null ? "Waiting" : X.c.g(obj2, "Running on ");
        }
        return s.class.getSimpleName() + "[" + g + "]";
    }
}
