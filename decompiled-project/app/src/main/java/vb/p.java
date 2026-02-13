package vb;

import hb.InterfaceC1269b;
import hb.InterfaceC1270c;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class p extends gb.n {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f25420a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f25421b;

    public p(q qVar) {
        boolean z8 = t.f25436a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, qVar);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(t.f25436a);
        this.f25420a = scheduledThreadPoolExecutor;
    }

    @Override // gb.n
    public final InterfaceC1269b a(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f25421b) {
            return;
        }
        this.f25421b = true;
        this.f25420a.shutdownNow();
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f25421b ? kb.c.f19072a : d(runnable, j, timeUnit, null);
    }

    public final s d(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC1270c interfaceC1270c) {
        s sVar = new s(runnable, interfaceC1270c, true);
        if (interfaceC1270c != null && !interfaceC1270c.d(sVar)) {
            return sVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f25420a;
        try {
            sVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) sVar) : scheduledThreadPoolExecutor.schedule((Callable) sVar, j, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (interfaceC1270c != null) {
                interfaceC1270c.c(sVar);
            }
            com.bumptech.glide.d.t(e2);
        }
        return sVar;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f25421b;
    }
}
