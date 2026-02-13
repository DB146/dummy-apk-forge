package O7;

import A0.G0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class b extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f7488a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(G0 g02, d dVar) {
        super(1, dVar);
        this.f7488a = g02;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e2) {
                th = e2.getCause();
            }
        }
        if (th != null) {
            this.f7488a.K(th);
        }
    }
}
