package s2;

import L7.q;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1972b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1971a f24028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1972b(RunnableC1971a runnableC1971a, q qVar) {
        super(qVar);
        this.f24028a = runnableC1971a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC1971a runnableC1971a = this.f24028a;
        try {
            Object obj = get();
            if (runnableC1971a.f24026d.get()) {
                return;
            }
            runnableC1971a.a(obj);
        } catch (InterruptedException e2) {
            Log.w("AsyncTask", e2);
        } catch (CancellationException unused) {
            if (runnableC1971a.f24026d.get()) {
                return;
            }
            runnableC1971a.a(null);
        } catch (ExecutionException e10) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
