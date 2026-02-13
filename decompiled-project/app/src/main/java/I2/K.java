package I2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class K implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5053b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5054c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f5055d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5056e;

    public K(W3.f fVar) {
        this.f5052a = 1;
        this.f5053b = new Object();
        this.f5054c = new ArrayDeque();
        this.f5056e = fVar;
    }

    public K(Executor executor) {
        this.f5052a = 0;
        kotlin.jvm.internal.l.e(executor, "executor");
        this.f5056e = executor;
        this.f5054c = new ArrayDeque();
        this.f5053b = new Object();
    }

    public K(ExecutorService executorService) {
        this.f5052a = 2;
        this.f5056e = executorService;
        this.f5054c = new ArrayDeque();
        this.f5053b = new Object();
    }

    public final void a() {
        switch (this.f5052a) {
            case 0:
                synchronized (this.f5053b) {
                    Object poll = this.f5054c.poll();
                    Runnable runnable = (Runnable) poll;
                    this.f5055d = runnable;
                    if (poll != null) {
                        this.f5056e.execute(runnable);
                    }
                }
                return;
            case 1:
                synchronized (this.f5053b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f5054c.poll();
                        this.f5055d = runnable2;
                        if (runnable2 != null) {
                            ((W3.f) this.f5056e).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Runnable runnable3 = (Runnable) this.f5054c.poll();
                this.f5055d = runnable3;
                if (runnable3 != null) {
                    ((ExecutorService) this.f5056e).execute(runnable3);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f5052a) {
            case 0:
                kotlin.jvm.internal.l.e(command, "command");
                synchronized (this.f5053b) {
                    this.f5054c.offer(new Aa.j(4, command, this));
                    if (this.f5055d == null) {
                        a();
                    }
                }
                return;
            case 1:
                synchronized (this.f5053b) {
                    try {
                        this.f5054c.add(new Aa.j(17, this, command));
                        if (this.f5055d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f5053b) {
                    try {
                        this.f5054c.add(new hc.i(10, this, command));
                        if (this.f5055d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
