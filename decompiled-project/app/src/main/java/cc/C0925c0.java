package cc;

import hc.AbstractC1275c;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cc.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0925c0 extends AbstractC0923b0 implements K {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f14524c;

    public C0925c0(Executor executor) {
        Method method;
        this.f14524c = executor;
        Method method2 = AbstractC1275c.f17936a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC1275c.f17936a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // cc.K
    public final S K(long j, I0 i02, Hb.i iVar) {
        Executor executor = this.f14524c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(i02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                F.h(iVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new Q(scheduledFuture) : G.f14479x.K(j, i02, iVar);
    }

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        try {
            this.f14524c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            F.h(iVar, cancellationException);
            P.f14500c.T(iVar, runnable);
        }
    }

    @Override // cc.AbstractC0923b0
    public final Executor X() {
        return this.f14524c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f14524c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0925c0) && ((C0925c0) obj).f14524c == this.f14524c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f14524c);
    }

    @Override // cc.K
    public final void l(long j, C0944m c0944m) {
        Executor executor = this.f14524c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new E5.k(27, this, c0944m), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e2);
                F.h(c0944m.f14552e, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c0944m.u(new C0938j(scheduledFuture, 0));
        } else {
            G.f14479x.l(j, c0944m);
        }
    }

    @Override // cc.A
    public final String toString() {
        return this.f14524c.toString();
    }
}
