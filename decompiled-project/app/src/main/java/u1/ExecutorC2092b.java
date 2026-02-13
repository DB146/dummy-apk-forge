package u1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2092b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24821a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f24822b;

    public /* synthetic */ ExecutorC2092b(Handler handler, int i7) {
        this.f24821a = i7;
        this.f24822b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f24821a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f24822b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f24822b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
