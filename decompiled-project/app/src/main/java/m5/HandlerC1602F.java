package m5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import n5.AbstractC1705a;

/* renamed from: m5.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1602F extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f20539a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1603G f20540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20541c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1601E f20542d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f20543e;

    /* renamed from: f, reason: collision with root package name */
    public int f20544f;

    /* renamed from: u, reason: collision with root package name */
    public Thread f20545u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20546v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f20547w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f20548x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1602F(J j, Looper looper, InterfaceC1603G interfaceC1603G, InterfaceC1601E interfaceC1601E, int i7, long j10) {
        super(looper);
        this.f20548x = j;
        this.f20540b = interfaceC1603G;
        this.f20542d = interfaceC1601E;
        this.f20539a = i7;
        this.f20541c = j10;
    }

    public final void a(boolean z8) {
        this.f20547w = z8;
        this.f20543e = null;
        if (hasMessages(0)) {
            this.f20546v = true;
            removeMessages(0);
            if (!z8) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f20546v = true;
                    this.f20540b.d();
                    Thread thread = this.f20545u;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z8) {
            this.f20548x.f20553b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC1601E interfaceC1601E = this.f20542d;
            interfaceC1601E.getClass();
            interfaceC1601E.m(this.f20540b, elapsedRealtime, elapsedRealtime - this.f20541c, true);
            this.f20542d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f20547w) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            this.f20543e = null;
            J j = this.f20548x;
            ExecutorService executorService = j.f20552a;
            HandlerC1602F handlerC1602F = j.f20553b;
            handlerC1602F.getClass();
            executorService.execute(handlerC1602F);
            return;
        }
        if (i7 == 3) {
            throw ((Error) message.obj);
        }
        this.f20548x.f20553b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f20541c;
        InterfaceC1601E interfaceC1601E = this.f20542d;
        interfaceC1601E.getClass();
        if (this.f20546v) {
            interfaceC1601E.m(this.f20540b, elapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            try {
                interfaceC1601E.t(this.f20540b, elapsedRealtime, j10);
                return;
            } catch (RuntimeException e2) {
                AbstractC1705a.u("LoadTask", "Unexpected exception handling load completed", e2);
                this.f20548x.f20554c = new I(e2);
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f20543e = iOException;
        int i11 = this.f20544f + 1;
        this.f20544f = i11;
        D4.e e10 = interfaceC1601E.e(this.f20540b, elapsedRealtime, j10, iOException, i11);
        int i12 = e10.f3224a;
        if (i12 == 3) {
            this.f20548x.f20554c = this.f20543e;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f20544f = 1;
            }
            long j11 = e10.f3225b;
            if (j11 == -9223372036854775807L) {
                j11 = Math.min((this.f20544f - 1) * 1000, 5000);
            }
            J j12 = this.f20548x;
            AbstractC1705a.m(j12.f20553b == null);
            j12.f20553b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(0, j11);
            } else {
                this.f20543e = null;
                j12.f20552a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            synchronized (this) {
                z8 = this.f20546v;
                this.f20545u = Thread.currentThread();
            }
            if (!z8) {
                AbstractC1705a.c("load:".concat(this.f20540b.getClass().getSimpleName()));
                try {
                    this.f20540b.b();
                    AbstractC1705a.v();
                } catch (Throwable th) {
                    AbstractC1705a.v();
                    throw th;
                }
            }
            synchronized (this) {
                this.f20545u = null;
                Thread.interrupted();
            }
            if (this.f20547w) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e2) {
            if (this.f20547w) {
                return;
            }
            obtainMessage(2, e2).sendToTarget();
        } catch (Exception e10) {
            if (this.f20547w) {
                return;
            }
            AbstractC1705a.u("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(2, new I(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f20547w) {
                return;
            }
            AbstractC1705a.u("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(2, new I(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f20547w) {
                AbstractC1705a.u("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
