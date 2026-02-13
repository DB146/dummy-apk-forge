package vb;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n extends gb.o {

    /* renamed from: b, reason: collision with root package name */
    public static final q f25411b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f25412c;

    /* renamed from: f, reason: collision with root package name */
    public static final m f25415f;
    public static final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f25416h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25417a;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeUnit f25414e = TimeUnit.SECONDS;

    /* renamed from: d, reason: collision with root package name */
    public static final long f25413d = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        m mVar = new m(new q("RxCachedThreadSchedulerShutdown"));
        f25415f = mVar;
        mVar.b();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        q qVar = new q("RxCachedThreadScheduler", max, false);
        f25411b = qVar;
        f25412c = new q("RxCachedWorkerPoolEvictor", max, false);
        g = Boolean.getBoolean("rx3.io-scheduled-release");
        k kVar = new k(0L, null, qVar);
        f25416h = kVar;
        kVar.f25402c.b();
        ScheduledFuture scheduledFuture = kVar.f25404e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = kVar.f25403d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public n() {
        AtomicReference atomicReference;
        q qVar = f25411b;
        k kVar = f25416h;
        this.f25417a = new AtomicReference(kVar);
        k kVar2 = new k(f25413d, f25414e, qVar);
        do {
            atomicReference = this.f25417a;
            if (atomicReference.compareAndSet(kVar, kVar2)) {
                return;
            }
        } while (atomicReference.get() == kVar);
        kVar2.f25402c.b();
        ScheduledFuture scheduledFuture = kVar2.f25404e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = kVar2.f25403d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // gb.o
    public final gb.n a() {
        return new l((k) this.f25417a.get());
    }
}
