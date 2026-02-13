package vb;

import hb.InterfaceC1269b;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2170d extends gb.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C2168b f25380b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f25381c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25382d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2169c f25383e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25384a;

    /* JADX WARN: Type inference failed for: r0v3, types: [vb.c, vb.p] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f25382d = availableProcessors;
        ?? pVar = new p(new q("RxComputationShutdown"));
        f25383e = pVar;
        pVar.b();
        q qVar = new q("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f25381c = qVar;
        C2168b c2168b = new C2168b(0, qVar);
        f25380b = c2168b;
        for (C2169c c2169c : c2168b.f25378b) {
            c2169c.b();
        }
    }

    public C2170d() {
        AtomicReference atomicReference;
        q qVar = f25381c;
        C2168b c2168b = f25380b;
        this.f25384a = new AtomicReference(c2168b);
        C2168b c2168b2 = new C2168b(f25382d, qVar);
        do {
            atomicReference = this.f25384a;
            if (atomicReference.compareAndSet(c2168b, c2168b2)) {
                return;
            }
        } while (atomicReference.get() == c2168b);
        for (C2169c c2169c : c2168b2.f25378b) {
            c2169c.b();
        }
    }

    @Override // gb.o
    public final gb.n a() {
        C2169c c2169c;
        C2168b c2168b = (C2168b) this.f25384a.get();
        int i7 = c2168b.f25377a;
        if (i7 == 0) {
            c2169c = f25383e;
        } else {
            long j = c2168b.f25379c;
            c2168b.f25379c = 1 + j;
            c2169c = c2168b.f25378b[(int) (j % i7)];
        }
        return new C2167a(c2169c);
    }

    @Override // gb.o
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        C2169c c2169c;
        C2168b c2168b = (C2168b) this.f25384a.get();
        int i7 = c2168b.f25377a;
        if (i7 == 0) {
            c2169c = f25383e;
        } else {
            long j10 = c2168b.f25379c;
            c2168b.f25379c = 1 + j10;
            c2169c = c2168b.f25378b[(int) (j10 % i7)];
        }
        c2169c.getClass();
        r rVar = new r(runnable);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c2169c.f25420a;
        try {
            rVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit(rVar) : scheduledThreadPoolExecutor.schedule(rVar, j, timeUnit));
            return rVar;
        } catch (RejectedExecutionException e2) {
            com.bumptech.glide.d.t(e2);
            return kb.c.f19072a;
        }
    }
}
