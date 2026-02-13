package okhttp3.internal.connection;

import okhttp3.internal.connection.RoutePlanner;

/* loaded from: classes2.dex */
public final class ReusePlan implements RoutePlanner.Plan {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f22655a;

    public ReusePlan(RealConnection realConnection) {
        this.f22655a = realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean b() {
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() {
        throw new IllegalStateException("already connected");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection e() {
        return this.f22655a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        throw new IllegalStateException("already connected");
    }
}
