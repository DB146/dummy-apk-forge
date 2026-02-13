package h7;

import A9.S2;
import com.google.android.gms.common.internal.G;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: h7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260f {

    /* renamed from: a, reason: collision with root package name */
    public final C1259e f17847a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17848b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17849c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ScheduledFuture f17850d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f17851e;

    public C1260f(C1259e c1259e, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        G.g(c1259e);
        this.f17847a = c1259e;
        this.f17848b = executor;
        this.f17849c = scheduledExecutorService;
        this.f17851e = -1L;
    }

    public final void a() {
        if (this.f17850d == null || this.f17850d.isDone()) {
            return;
        }
        this.f17850d.cancel(false);
    }

    public final void b(long j) {
        a();
        this.f17851e = -1L;
        this.f17850d = this.f17849c.schedule(new S2(this, 28), Math.max(0L, j), TimeUnit.MILLISECONDS);
    }
}
