package r8;

import P4.G;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class g extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f23833a;

    /* renamed from: b, reason: collision with root package name */
    public y f23834b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23835c;

    /* renamed from: d, reason: collision with root package name */
    public int f23836d;

    /* renamed from: e, reason: collision with root package name */
    public int f23837e;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new N5.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f23833a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f23835c = new Object();
        this.f23837e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            x.b(intent);
        }
        synchronized (this.f23835c) {
            try {
                int i7 = this.f23837e - 1;
                this.f23837e = i7;
                if (i7 == 0) {
                    stopSelfResult(this.f23836d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f23834b == null) {
                this.f23834b = new y(new o7.o(this, 5));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23834b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f23833a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        synchronized (this.f23835c) {
            this.f23836d = i10;
            this.f23837e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) o.f().f23860e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f23833a.execute(new G(this, intent2, taskCompletionSource, 12));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new E2.d(0), new n4.b(3, this, intent));
        return 3;
    }
}
