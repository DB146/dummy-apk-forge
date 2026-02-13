package w7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r7.C1947c;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2223b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f25815a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25816b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Task f25817c = Tasks.forResult(null);

    public ExecutorC2223b(ExecutorService executorService) {
        this.f25815a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f25816b) {
            continueWithTask = this.f25817c.continueWithTask(this.f25815a, new C1947c(runnable, 15));
            this.f25817c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25815a.execute(runnable);
    }
}
