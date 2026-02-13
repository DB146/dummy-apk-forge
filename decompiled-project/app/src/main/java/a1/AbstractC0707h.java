package a1;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0707h implements R6.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12464d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f12465e = Logger.getLogger(AbstractC0707h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final Q5.e f12466f;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f12467u;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f12468a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0703d f12469b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0706g f12470c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [Q5.e] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    static {
        ?? r42;
        try {
            th = null;
            r42 = new C0704e(AtomicReferenceFieldUpdater.newUpdater(C0706g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0706g.class, C0706g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0707h.class, C0706g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0707h.class, C0703d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0707h.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r42 = new Object();
        }
        f12466f = r42;
        if (th != null) {
            f12465e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12467u = new Object();
    }

    public static void f(AbstractC0707h abstractC0707h) {
        C0706g c0706g;
        C0703d c0703d;
        C0703d c0703d2;
        C0703d c0703d3;
        do {
            c0706g = abstractC0707h.f12470c;
        } while (!f12466f.h(abstractC0707h, c0706g, C0706g.f12461c));
        while (true) {
            c0703d = null;
            if (c0706g == null) {
                break;
            }
            Thread thread = c0706g.f12462a;
            if (thread != null) {
                c0706g.f12462a = null;
                LockSupport.unpark(thread);
            }
            c0706g = c0706g.f12463b;
        }
        abstractC0707h.d();
        do {
            c0703d2 = abstractC0707h.f12469b;
        } while (!f12466f.f(abstractC0707h, c0703d2, C0703d.f12453d));
        while (true) {
            c0703d3 = c0703d;
            c0703d = c0703d2;
            if (c0703d == null) {
                break;
            }
            c0703d2 = c0703d.f12456c;
            c0703d.f12456c = c0703d3;
        }
        while (c0703d3 != null) {
            C0703d c0703d4 = c0703d3.f12456c;
            g(c0703d3.f12454a, c0703d3.f12455b);
            c0703d3 = c0703d4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f12465e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object i(Object obj) {
        if (obj instanceof C0700a) {
            CancellationException cancellationException = ((C0700a) obj).f12450b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C0702c) {
            throw new ExecutionException(((C0702c) obj).f12452a);
        }
        if (obj == f12467u) {
            return null;
        }
        return obj;
    }

    public static Object j(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // R6.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0703d c0703d = this.f12469b;
        C0703d c0703d2 = C0703d.f12453d;
        if (c0703d != c0703d2) {
            C0703d c0703d3 = new C0703d(runnable, executor);
            do {
                c0703d3.f12456c = c0703d;
                if (f12466f.f(this, c0703d, c0703d3)) {
                    return;
                } else {
                    c0703d = this.f12469b;
                }
            } while (c0703d != c0703d2);
        }
        g(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object j = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(j == this ? "this future" : String.valueOf(j));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e2.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        Object obj = this.f12468a;
        if (obj != null) {
            return false;
        }
        if (!f12466f.g(this, obj, f12464d ? new C0700a(z8, new CancellationException("Future.cancel() was called.")) : z8 ? C0700a.f12447c : C0700a.f12448d)) {
            return false;
        }
        f(this);
        return true;
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12468a;
        if (obj2 != null) {
            return i(obj2);
        }
        C0706g c0706g = this.f12470c;
        C0706g c0706g2 = C0706g.f12461c;
        if (c0706g != c0706g2) {
            C0706g c0706g3 = new C0706g();
            do {
                Q5.e eVar = f12466f;
                eVar.J(c0706g3, c0706g);
                if (eVar.h(this, c0706g, c0706g3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            r(c0706g3);
                            throw new InterruptedException();
                        }
                        obj = this.f12468a;
                    } while (obj == null);
                    return i(obj);
                }
                c0706g = this.f12470c;
            } while (c0706g != c0706g2);
        }
        return i(this.f12468a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12468a;
        if (obj != null) {
            return i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0706g c0706g = this.f12470c;
            C0706g c0706g2 = C0706g.f12461c;
            if (c0706g != c0706g2) {
                C0706g c0706g3 = new C0706g();
                do {
                    Q5.e eVar = f12466f;
                    eVar.J(c0706g3, c0706g);
                    if (eVar.h(this, c0706g, c0706g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                r(c0706g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12468a;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(c0706g3);
                    } else {
                        c0706g = this.f12470c;
                    }
                } while (c0706g != c0706g2);
            }
            return i(this.f12468a);
        }
        while (nanos > 0) {
            Object obj3 = this.f12468a;
            if (obj3 != null) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0707h = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        StringBuilder l10 = X.c.l(j, "Waited ", " ");
        l10.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = l10.toString();
        if (nanos + 1000 < 0) {
            String h10 = X.c.h(sb2, " (plus ");
            long j10 = -nanos;
            long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(convert);
            boolean z8 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str = h10 + convert + " " + lowerCase;
                if (z8) {
                    str = X.c.h(str, ",");
                }
                h10 = X.c.h(str, " ");
            }
            if (z8) {
                h10 = h10 + nanos2 + " nanoseconds ";
            }
            sb2 = X.c.h(h10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(X.c.h(sb2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(X.c.i(sb2, " for ", abstractC0707h));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12468a instanceof C0700a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12468a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String o() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void r(C0706g c0706g) {
        c0706g.f12462a = null;
        while (true) {
            C0706g c0706g2 = this.f12470c;
            if (c0706g2 == C0706g.f12461c) {
                return;
            }
            C0706g c0706g3 = null;
            while (c0706g2 != null) {
                C0706g c0706g4 = c0706g2.f12463b;
                if (c0706g2.f12462a != null) {
                    c0706g3 = c0706g2;
                } else if (c0706g3 != null) {
                    c0706g3.f12463b = c0706g4;
                    if (c0706g3.f12462a == null) {
                        break;
                    }
                } else if (!f12466f.h(this, c0706g2, c0706g4)) {
                    break;
                }
                c0706g2 = c0706g4;
            }
            return;
        }
    }

    public boolean t(Object obj) {
        if (obj == null) {
            obj = f12467u;
        }
        if (!f12466f.g(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f12468a instanceof C0700a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = o();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u(Throwable th) {
        th.getClass();
        if (!f12466f.g(this, null, new C0702c(th))) {
            return false;
        }
        f(this);
        return true;
    }
}
