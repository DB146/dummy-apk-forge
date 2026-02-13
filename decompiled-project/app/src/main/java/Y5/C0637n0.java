package Y5;

import android.os.Process;
import java.util.AbstractQueue;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* renamed from: Y5.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637n0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11846a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractQueue f11847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0640o0 f11849d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0637n0(C0640o0 c0640o0, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c0640o0);
        this.f11849d = c0640o0;
        this.f11848c = false;
        com.google.android.gms.common.internal.G.g(blockingQueue);
        this.f11846a = new Object();
        this.f11847b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        C0640o0 c0640o0 = this.f11849d;
        synchronized (c0640o0.f11870w) {
            try {
                if (!this.f11848c) {
                    c0640o0.f11871x.release();
                    c0640o0.f11870w.notifyAll();
                    if (this == c0640o0.f11864c) {
                        c0640o0.f11864c = null;
                    } else if (this == c0640o0.f11865d) {
                        c0640o0.f11865d = null;
                    } else {
                        W w10 = ((C0646q0) c0640o0.f3094a).f11912f;
                        C0646q0.l(w10);
                        w10.f11577f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f11848c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z8 = false;
        while (!z8) {
            try {
                this.f11849d.f11871x.acquire();
                z8 = true;
            } catch (InterruptedException e2) {
                W w10 = ((C0646q0) this.f11849d.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11580w.b(e2, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.f11847b;
                C0634m0 c0634m0 = (C0634m0) abstractQueue.poll();
                if (c0634m0 != null) {
                    Process.setThreadPriority(true != c0634m0.f11836b ? 10 : threadPriority);
                    c0634m0.run();
                } else {
                    Object obj = this.f11846a;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.f11849d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                W w11 = ((C0646q0) this.f11849d.f3094a).f11912f;
                                C0646q0.l(w11);
                                w11.f11580w.b(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f11849d.f11870w) {
                        if (this.f11847b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
