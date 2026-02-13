package w7;

import B0.C0200s;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f25818d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC2223b f25819a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorC2223b f25820b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC2223b f25821c;

    public d(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        l.e(backgroundExecutorService, "backgroundExecutorService");
        l.e(blockingExecutorService, "blockingExecutorService");
        this.f25819a = new ExecutorC2223b(backgroundExecutorService);
        this.f25820b = new ExecutorC2223b(backgroundExecutorService);
        Tasks.forResult(null);
        this.f25821c = new ExecutorC2223b(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new C0200s(0, f25818d, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 8).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new C0200s(0, f25818d, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 9).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
