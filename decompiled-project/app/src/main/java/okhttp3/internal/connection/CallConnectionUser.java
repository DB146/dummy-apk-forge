package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.l;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes2.dex */
public final class CallConnectionUser implements ConnectionUser {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f22534a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionListener f22535b;

    /* renamed from: c, reason: collision with root package name */
    public final RealInterceptorChain f22536c;

    public CallConnectionUser(RealCall call, ConnectionListener connectionListener, RealInterceptorChain realInterceptorChain) {
        l.e(call, "call");
        this.f22534a = call;
        this.f22535b = connectionListener;
        this.f22536c = realInterceptorChain;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean a() {
        return this.f22534a.f22592B;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void b(Route route, IOException iOException) {
        l.e(route, "route");
        RealCall call = this.f22534a;
        call.f22598d.h(call, route.f22472c, route.f22471b, iOException);
        l.e(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(HttpUrl url) {
        l.e(url, "url");
        RealCall realCall = this.f22534a;
        realCall.f22598d.o(realCall, url);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void d(HttpUrl url, List list) {
        l.e(url, "url");
        RealCall realCall = this.f22534a;
        realCall.f22598d.n(realCall, url, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        l.e(connection, "connection");
        RealCall realCall = this.f22534a;
        realCall.getClass();
        TimeZone timeZone = _UtilJvmKt.f22497a;
        if (realCall.f22603w != null) {
            throw new IllegalStateException("Check failed.");
        }
        realCall.f22603w = connection;
        connection.f22619H.add(new RealCall.CallReference(realCall, realCall.f22601u));
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f() {
        RealCall realCall = this.f22534a;
        realCall.f22598d.B(realCall);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void g(RealConnection realConnection) {
        realConnection.f22631z.getClass();
        RealCall call = this.f22534a;
        l.e(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket h() {
        return this.f22534a.j();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean i() {
        return !l.a(this.f22536c.f22684e.f22425b, "GET");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(RealConnection connection) {
        l.e(connection, "connection");
        connection.f22631z.getClass();
        RealCall call = this.f22534a;
        l.e(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(RealConnection realConnection) {
        realConnection.f22631z.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection l() {
        return this.f22534a.f22603w;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(RealConnection realConnection) {
        RealCall realCall = this.f22534a;
        realCall.f22598d.k(realCall, realConnection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(Connection connection, Route route) {
        l.e(connection, "connection");
        l.e(route, "route");
        this.f22535b.getClass();
        RealCall call = this.f22534a;
        l.e(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o(Route route) {
        l.e(route, "route");
        RouteDatabase routeDatabase = this.f22534a.f22595a.f22361B;
        synchronized (routeDatabase) {
            routeDatabase.f22656a.remove(route);
        }
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void p(Connection connection) {
        l.e(connection, "connection");
        RealCall realCall = this.f22534a;
        realCall.f22598d.j(realCall, connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(Route route, Protocol protocol) {
        l.e(route, "route");
        RealCall realCall = this.f22534a;
        realCall.f22598d.g(realCall, route.f22472c, route.f22471b, protocol);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void r(Route route) {
        l.e(route, "route");
        RealCall realCall = this.f22534a;
        realCall.f22598d.i(realCall, route.f22472c, route.f22471b);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void s(String str) {
        RealCall realCall = this.f22534a;
        realCall.f22598d.m(realCall, str);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(RealConnection realConnection) {
        realConnection.f22631z.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(String str, List list) {
        RealCall realCall = this.f22534a;
        realCall.f22598d.l(realCall, str, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Handshake handshake) {
        RealCall realCall = this.f22534a;
        realCall.f22598d.A(realCall, handshake);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(ConnectPlan connectPlan) {
        l.e(connectPlan, "connectPlan");
        this.f22534a.f22594D.add(connectPlan);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void x(ConnectPlan connectPlan) {
        l.e(connectPlan, "connectPlan");
        this.f22534a.f22594D.remove(connectPlan);
    }
}
