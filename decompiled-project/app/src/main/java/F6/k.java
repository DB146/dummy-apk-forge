package F6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f4157a;

    public k() {
        this.f4157a = null;
    }

    public k(TaskCompletionSource taskCompletionSource) {
        this.f4157a = taskCompletionSource;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            TaskCompletionSource taskCompletionSource = this.f4157a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e2);
            }
        }
    }
}
