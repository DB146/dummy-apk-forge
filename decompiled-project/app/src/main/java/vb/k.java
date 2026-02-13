package vb;

import hb.C1268a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f25400a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f25401b;

    /* renamed from: c, reason: collision with root package name */
    public final C1268a f25402c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f25403d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f25404e;

    /* renamed from: f, reason: collision with root package name */
    public final q f25405f;

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, hb.a] */
    public k(long j, TimeUnit timeUnit, q qVar) {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f25400a = nanos;
        this.f25401b = new ConcurrentLinkedQueue();
        this.f25402c = new Object();
        this.f25405f = qVar;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, n.f25412c);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f25403d = scheduledExecutorService;
        this.f25404e = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f25401b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar.f25410c > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(mVar)) {
                this.f25402c.c(mVar);
            }
        }
    }
}
