package vb;

import hb.InterfaceC1269b;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v extends gb.o {

    /* renamed from: b, reason: collision with root package name */
    public static final q f25440b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f25441c;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25442a;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f25441c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f25440b = new q("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public v() {
        AtomicReference atomicReference = new AtomicReference();
        this.f25442a = atomicReference;
        boolean z8 = t.f25436a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f25440b);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(t.f25436a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // gb.o
    public final gb.n a() {
        return new u((ScheduledExecutorService) this.f25442a.get());
    }

    @Override // gb.o
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        r rVar = new r(runnable);
        AtomicReference atomicReference = this.f25442a;
        try {
            rVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(rVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(rVar, j, timeUnit));
            return rVar;
        } catch (RejectedExecutionException e2) {
            com.bumptech.glide.d.t(e2);
            return kb.c.f19072a;
        }
    }
}
