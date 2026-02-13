package C7;

import A9.O0;
import Aa.j;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import ha.g;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v7.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f3051a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3052b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3053c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3055e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f3056f;
    public final ThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    public final O0 f3057h;

    /* renamed from: i, reason: collision with root package name */
    public final g f3058i;
    public int j;
    public long k;

    public d(O0 o02, D7.b bVar, g gVar) {
        double d10 = bVar.f3264d;
        this.f3051a = d10;
        this.f3052b = bVar.f3265e;
        this.f3053c = bVar.f3266f * 1000;
        this.f3057h = o02;
        this.f3058i = gVar;
        this.f3054d = SystemClock.elapsedRealtime();
        int i7 = (int) d10;
        this.f3055e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f3056f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.f3053c);
        int min = this.f3056f.size() == this.f3055e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(final v7.a aVar, final TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + aVar.f25097b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z8 = SystemClock.elapsedRealtime() - this.f3054d < 2000;
        this.f3057h.z(new Y3.a(aVar.f25096a, Y3.d.f11151c, null), new Y3.g() { // from class: C7.b
            @Override // Y3.g
            public final void b(Exception exc) {
                int i7 = 1;
                d dVar = d.this;
                dVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z8) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new j(i7, dVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = y.f25189a;
                    int i10 = 0;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    i10 = 1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (i7 != 0) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (i10 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i7 = i10;
                    }
                }
                taskCompletionSource2.trySetResult(aVar);
            }
        });
    }
}
