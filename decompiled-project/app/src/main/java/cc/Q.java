package cc;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class Q implements S {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f14501a;

    public Q(ScheduledFuture scheduledFuture) {
        this.f14501a = scheduledFuture;
    }

    @Override // cc.S
    public final void b() {
        this.f14501a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f14501a + ']';
    }
}
