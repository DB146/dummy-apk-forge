package J6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f5563a;

    public z() {
        this.f5563a = null;
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f5563a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f5563a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f5563a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }
}
