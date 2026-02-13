package fb;

import android.os.Handler;
import android.os.Message;
import gb.n;
import gb.o;
import hb.InterfaceC1269b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kb.C1436a;
import kb.EnumC1437b;
import vb.f;
import vb.h;
import vb.i;
import vb.j;
import vb.r;

/* renamed from: fb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1151e extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17042a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17043b;

    public /* synthetic */ C1151e(Object obj, int i7) {
        this.f17042a = i7;
        this.f17043b = obj;
    }

    @Override // gb.o
    public final n a() {
        switch (this.f17042a) {
            case 0:
                return new C1149c((Handler) this.f17043b);
            default:
                return new i((Executor) this.f17043b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb.o
    public InterfaceC1269b b(Runnable runnable) {
        h hVar;
        switch (this.f17042a) {
            case 1:
                Executor executor = (Executor) this.f17043b;
                try {
                    if (executor instanceof ExecutorService) {
                        r rVar = new r(runnable);
                        rVar.a(((ExecutorService) executor).submit(rVar));
                        hVar = rVar;
                    } else {
                        h hVar2 = new h(runnable, null);
                        executor.execute(hVar2);
                        hVar = hVar2;
                    }
                    return hVar;
                } catch (RejectedExecutionException e2) {
                    com.bumptech.glide.d.t(e2);
                    return kb.c.f19072a;
                }
            default:
                return super.b(runnable);
        }
    }

    @Override // gb.o
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        switch (this.f17042a) {
            case 0:
                if (timeUnit == null) {
                    throw new NullPointerException("unit == null");
                }
                Handler handler = (Handler) this.f17043b;
                RunnableC1150d runnableC1150d = new RunnableC1150d(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC1150d);
                obtain.setAsynchronous(true);
                handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC1150d;
            default:
                Executor executor = (Executor) this.f17043b;
                if (executor instanceof ScheduledExecutorService) {
                    try {
                        r rVar = new r(runnable);
                        rVar.a(((ScheduledExecutorService) executor).schedule(rVar, j, timeUnit));
                        return rVar;
                    } catch (RejectedExecutionException e2) {
                        com.bumptech.glide.d.t(e2);
                        return kb.c.f19072a;
                    }
                }
                f fVar = new f(runnable);
                InterfaceC1269b c10 = j.f25399a.c(new hc.i(17, this, fVar), j, timeUnit);
                C1436a c1436a = fVar.f25386a;
                c1436a.getClass();
                EnumC1437b.f(c1436a, c10);
                return fVar;
        }
    }
}
