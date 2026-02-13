package m5;

import android.os.Looper;
import android.os.SystemClock;
import e3.RunnableC1077b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class J implements K {

    /* renamed from: d, reason: collision with root package name */
    public static final D4.e f20549d = new D4.e(0, -9223372036854775807L, false);

    /* renamed from: e, reason: collision with root package name */
    public static final D4.e f20550e = new D4.e(2, -9223372036854775807L, false);

    /* renamed from: f, reason: collision with root package name */
    public static final D4.e f20551f = new D4.e(3, -9223372036854775807L, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f20552a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerC1602F f20553b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f20554c;

    public J(String str) {
        String t5 = X.c.t("ExoPlayer:Loader:", str);
        int i7 = n5.D.f21141a;
        this.f20552a = Executors.newSingleThreadExecutor(new n5.B(t5));
    }

    @Override // m5.K
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f20554c;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1602F handlerC1602F = this.f20553b;
        if (handlerC1602F != null && (iOException = handlerC1602F.f20543e) != null && handlerC1602F.f20544f > handlerC1602F.f20539a) {
            throw iOException;
        }
    }

    public final void b() {
        HandlerC1602F handlerC1602F = this.f20553b;
        AbstractC1705a.n(handlerC1602F);
        handlerC1602F.a(false);
    }

    public final boolean c() {
        return this.f20554c != null;
    }

    public final boolean d() {
        return this.f20553b != null;
    }

    public final void e(H h10) {
        HandlerC1602F handlerC1602F = this.f20553b;
        if (handlerC1602F != null) {
            handlerC1602F.a(true);
        }
        ExecutorService executorService = this.f20552a;
        if (h10 != null) {
            executorService.execute(new RunnableC1077b(h10, 6));
        }
        executorService.shutdown();
    }

    public final long f(InterfaceC1603G interfaceC1603G, InterfaceC1601E interfaceC1601E, int i7) {
        Looper myLooper = Looper.myLooper();
        AbstractC1705a.n(myLooper);
        this.f20554c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HandlerC1602F handlerC1602F = new HandlerC1602F(this, myLooper, interfaceC1603G, interfaceC1601E, i7, elapsedRealtime);
        AbstractC1705a.m(this.f20553b == null);
        this.f20553b = handlerC1602F;
        handlerC1602F.f20543e = null;
        this.f20552a.execute(handlerC1602F);
        return elapsedRealtime;
    }
}
