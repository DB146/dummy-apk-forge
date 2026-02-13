package vb;

import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class u extends gb.n {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f25437a;

    /* renamed from: b, reason: collision with root package name */
    public final C1268a f25438b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f25439c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hb.a] */
    public u(ScheduledExecutorService scheduledExecutorService) {
        this.f25437a = scheduledExecutorService;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f25439c) {
            return;
        }
        this.f25439c = true;
        this.f25438b.b();
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z8 = this.f25439c;
        kb.c cVar = kb.c.f19072a;
        if (z8) {
            return cVar;
        }
        s sVar = new s(runnable, this.f25438b, true);
        this.f25438b.d(sVar);
        try {
            sVar.a(j <= 0 ? this.f25437a.submit((Callable) sVar) : this.f25437a.schedule((Callable) sVar, j, timeUnit));
            return sVar;
        } catch (RejectedExecutionException e2) {
            b();
            com.bumptech.glide.d.t(e2);
            return cVar;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f25439c;
    }
}
