package q7;

import C3.RunnableC0235a;
import com.google.android.gms.common.internal.G;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f23537f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23538a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f23539b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f23540c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f23541d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final hc.i f23542e = new hc.i(this);

    public j(Executor executor) {
        G.g(executor);
        this.f23538a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        G.g(runnable);
        synchronized (this.f23539b) {
            int i7 = this.f23540c;
            if (i7 != 4 && i7 != 3) {
                long j = this.f23541d;
                RunnableC0235a runnableC0235a = new RunnableC0235a(runnable, 3);
                this.f23539b.add(runnableC0235a);
                this.f23540c = 2;
                try {
                    this.f23538a.execute(this.f23542e);
                    if (this.f23540c != 2) {
                        return;
                    }
                    synchronized (this.f23539b) {
                        try {
                            if (this.f23541d == j && this.f23540c == 2) {
                                this.f23540c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f23539b) {
                        try {
                            int i10 = this.f23540c;
                            boolean z8 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f23539b.removeLastOccurrence(runnableC0235a)) {
                                z8 = false;
                            }
                            if (!(e2 instanceof RejectedExecutionException) || z8) {
                                throw e2;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f23539b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f23538a + "}";
    }
}
