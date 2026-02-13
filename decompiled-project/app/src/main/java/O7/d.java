package O7;

import A0.G0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import v7.s;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7490a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7491b;

    public d() {
        this.f7490a = 1;
        this.f7491b = new AtomicInteger(0);
    }

    public /* synthetic */ d(Object obj, int i7) {
        this.f7490a = i7;
        this.f7491b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7490a) {
            case 0:
                ((G0) this.f7491b).getClass();
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("FirebaseDatabaseWorker");
                newThread.setDaemon(true);
                newThread.setUncaughtExceptionHandler(new c(this));
                return newThread;
            case 1:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f7491b).getAndIncrement());
                return thread;
            default:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(new s(runnable));
                newThread2.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f7491b).getAndIncrement());
                return newThread2;
        }
    }
}
