package okhttp3.internal.connection;

import okhttp3.internal.connection.RoutePlanner;

/* loaded from: classes2.dex */
public final class FailedPlan implements RoutePlanner.Plan {

    /* renamed from: a, reason: collision with root package name */
    public final RoutePlanner.ConnectResult f22581a;

    public FailedPlan(Throwable th) {
        this.f22581a = new RoutePlanner.ConnectResult(this, null, th, 2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean b() {
        return false;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() {
        return this.f22581a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection e() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        return this.f22581a;
    }
}
