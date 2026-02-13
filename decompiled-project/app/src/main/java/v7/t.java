package v7;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f25174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f25175b;

    public t(ExecutorService executorService, TimeUnit timeUnit) {
        this.f25174a = executorService;
        this.f25175b = timeUnit;
    }

    @Override // v7.c
    public final void a() {
        ExecutorService executorService = this.f25174a;
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f25175b)) {
                return;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
            }
            executorService.shutdownNow();
        }
    }
}
