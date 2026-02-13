package fb;

import android.os.Handler;
import android.os.Message;
import gb.n;
import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;

/* renamed from: fb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1149c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f17037a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f17038b;

    public C1149c(Handler handler) {
        this.f17037a = handler;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f17038b = true;
        this.f17037a.removeCallbacksAndMessages(this);
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z8 = this.f17038b;
        kb.c cVar = kb.c.f19072a;
        if (z8) {
            return cVar;
        }
        Handler handler = this.f17037a;
        RunnableC1150d runnableC1150d = new RunnableC1150d(handler, runnable);
        Message obtain = Message.obtain(handler, runnableC1150d);
        obtain.obj = this;
        obtain.setAsynchronous(true);
        this.f17037a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        if (!this.f17038b) {
            return runnableC1150d;
        }
        this.f17037a.removeCallbacks(runnableC1150d);
        return cVar;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f17038b;
    }
}
