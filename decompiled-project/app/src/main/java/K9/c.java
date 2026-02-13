package K9;

import db.InterfaceC1070c;
import java.lang.Thread;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public abstract class c implements InterfaceC1070c {
    public static OkHttpClient a(b bVar) {
        bVar.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 10;
        if (32767 <= availableProcessors) {
            availableProcessors = 32767;
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(availableProcessors, ForkJoinPool.defaultForkJoinWorkerThreadFactory, (Thread.UncaughtExceptionHandler) bVar.f6212a.getValue(), false);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.f22314c = forkJoinPool;
        builder.f22391a = dispatcher;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.b(10L, timeUnit);
        builder.a(10L, timeUnit);
        return new OkHttpClient(builder);
    }
}
