package okhttp3.internal.connection;

import Eb.l;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RoutePlanner;

/* loaded from: classes2.dex */
public final class ForceConnectRoutePlanner implements RoutePlanner {

    /* renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f22590a;

    public ForceConnectRoutePlanner(RealRoutePlanner realRoutePlanner) {
        this.f22590a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a() {
        return this.f22590a.f22650l.a();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final l b() {
        return this.f22590a.f22654p;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final RoutePlanner.Plan c() {
        return this.f22590a.g();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean d(RealConnection realConnection) {
        return this.f22590a.d(realConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address e() {
        return this.f22590a.j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean f(HttpUrl url) {
        kotlin.jvm.internal.l.e(url, "url");
        return this.f22590a.f(url);
    }
}
