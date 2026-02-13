package Y5;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640o0 extends AbstractC0659x0 {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLong f11863y = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public C0637n0 f11864c;

    /* renamed from: d, reason: collision with root package name */
    public C0637n0 f11865d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f11866e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f11867f;

    /* renamed from: u, reason: collision with root package name */
    public final C0631l0 f11868u;

    /* renamed from: v, reason: collision with root package name */
    public final C0631l0 f11869v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f11870w;

    /* renamed from: x, reason: collision with root package name */
    public final Semaphore f11871x;

    public C0640o0(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11870w = new Object();
        this.f11871x = new Semaphore(2);
        this.f11866e = new PriorityBlockingQueue();
        this.f11867f = new LinkedBlockingQueue();
        this.f11868u = new C0631l0(this, "Thread death: Uncaught exception on worker thread");
        this.f11869v = new C0631l0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // C9.h
    public final void J() {
        if (Thread.currentThread() != this.f11864c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // Y5.AbstractC0659x0
    public final boolean K() {
        return false;
    }

    public final void N() {
        if (Thread.currentThread() != this.f11865d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void O() {
        if (Thread.currentThread() == this.f11864c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean P() {
        return Thread.currentThread() == this.f11864c;
    }

    public final C0634m0 Q(Callable callable) {
        L();
        C0634m0 c0634m0 = new C0634m0(this, callable, false);
        if (Thread.currentThread() == this.f11864c) {
            if (!this.f11866e.isEmpty()) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("Callable skipped the worker queue.");
            }
            c0634m0.run();
        } else {
            W(c0634m0);
        }
        return c0634m0;
    }

    public final C0634m0 R(Callable callable) {
        L();
        C0634m0 c0634m0 = new C0634m0(this, callable, true);
        if (Thread.currentThread() == this.f11864c) {
            c0634m0.run();
        } else {
            W(c0634m0);
        }
        return c0634m0;
    }

    public final void S(Runnable runnable) {
        L();
        com.google.android.gms.common.internal.G.g(runnable);
        W(new C0634m0(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object T(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                U u3 = w10.f11580w;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                u3.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            W w11 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w11);
            w11.f11580w.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void U(Runnable runnable) {
        L();
        W(new C0634m0(this, runnable, true, "Task exception on worker thread"));
    }

    public final void V(Runnable runnable) {
        L();
        C0634m0 c0634m0 = new C0634m0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11870w) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f11867f;
                linkedBlockingQueue.add(c0634m0);
                C0637n0 c0637n0 = this.f11865d;
                if (c0637n0 == null) {
                    C0637n0 c0637n02 = new C0637n0(this, "Measurement Network", linkedBlockingQueue);
                    this.f11865d = c0637n02;
                    c0637n02.setUncaughtExceptionHandler(this.f11869v);
                    this.f11865d.start();
                } else {
                    Object obj = c0637n0.f11846a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(C0634m0 c0634m0) {
        synchronized (this.f11870w) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f11866e;
                priorityBlockingQueue.add(c0634m0);
                C0637n0 c0637n0 = this.f11864c;
                if (c0637n0 == null) {
                    C0637n0 c0637n02 = new C0637n0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f11864c = c0637n02;
                    c0637n02.setUncaughtExceptionHandler(this.f11868u);
                    this.f11864c.start();
                } else {
                    Object obj = c0637n0.f11846a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
