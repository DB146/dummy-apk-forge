package vb;

import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C1436a;
import kb.EnumC1437b;

/* loaded from: classes2.dex */
public final class i extends gb.n implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f25394c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f25396e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f25397f = new AtomicInteger();

    /* renamed from: u, reason: collision with root package name */
    public final C1268a f25398u = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ha.g f25395d = new ha.g(12);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25392a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25393b = true;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hb.a] */
    public i(Executor executor) {
        this.f25394c = executor;
    }

    @Override // gb.n
    public final InterfaceC1269b a(Runnable runnable) {
        InterfaceC1269b gVar;
        boolean z8 = this.f25396e;
        kb.c cVar = kb.c.f19072a;
        if (z8) {
            return cVar;
        }
        if (this.f25392a) {
            gVar = new h(runnable, this.f25398u);
            this.f25398u.d(gVar);
        } else {
            gVar = new g(runnable);
        }
        this.f25395d.offer(gVar);
        if (this.f25397f.getAndIncrement() == 0) {
            try {
                this.f25394c.execute(this);
            } catch (RejectedExecutionException e2) {
                this.f25396e = true;
                this.f25395d.clear();
                com.bumptech.glide.d.t(e2);
                return cVar;
            }
        }
        return gVar;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f25396e) {
            return;
        }
        this.f25396e = true;
        this.f25398u.b();
        if (this.f25397f.getAndIncrement() == 0) {
            this.f25395d.clear();
        }
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        boolean z8 = this.f25396e;
        kb.c cVar = kb.c.f19072a;
        if (z8) {
            return cVar;
        }
        C1436a c1436a = new C1436a();
        C1436a c1436a2 = new C1436a();
        c1436a2.lazySet(c1436a);
        s sVar = new s(new C7.c(this, c1436a2, runnable, 14), this.f25398u, this.f25392a);
        this.f25398u.d(sVar);
        Executor executor = this.f25394c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                sVar.a(((ScheduledExecutorService) executor).schedule((Callable) sVar, j, timeUnit));
            } catch (RejectedExecutionException e2) {
                this.f25396e = true;
                com.bumptech.glide.d.t(e2);
                return cVar;
            }
        } else {
            sVar.a(new e(j.f25399a.c(sVar, j, timeUnit)));
        }
        EnumC1437b.f(c1436a, sVar);
        return c1436a2;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f25396e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25393b) {
            ha.g gVar = this.f25395d;
            if (this.f25396e) {
                gVar.clear();
                return;
            }
            ((Runnable) gVar.poll()).run();
            if (this.f25396e) {
                gVar.clear();
                return;
            } else {
                if (this.f25397f.decrementAndGet() != 0) {
                    this.f25394c.execute(this);
                    return;
                }
                return;
            }
        }
        ha.g gVar2 = this.f25395d;
        int i7 = 1;
        while (!this.f25396e) {
            do {
                Runnable runnable = (Runnable) gVar2.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.f25396e) {
                    gVar2.clear();
                    return;
                } else {
                    i7 = this.f25397f.addAndGet(-i7);
                    if (i7 == 0) {
                        return;
                    }
                }
            } while (!this.f25396e);
            gVar2.clear();
            return;
        }
        gVar2.clear();
    }
}
