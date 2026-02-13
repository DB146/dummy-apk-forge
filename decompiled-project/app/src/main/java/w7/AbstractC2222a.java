package w7;

import M9.e;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2222a {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.d f25814a = new E2.d(0);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        e eVar = new e(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 16);
        E2.d dVar = f25814a;
        task.continueWithTask(dVar, eVar);
        task2.continueWithTask(dVar, eVar);
        return taskCompletionSource.getTask();
    }
}
