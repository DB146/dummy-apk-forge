package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;

/* loaded from: classes2.dex */
public final class PoolConnectionUser implements ConnectionUser {
    static {
        new PoolConnectionUser();
    }

    private PoolConnectionUser() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean a() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void b(Route route, IOException iOException) {
        l.e(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(HttpUrl url) {
        l.e(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void d(HttpUrl url, List list) {
        l.e(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        l.e(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void g(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket h() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean i() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(RealConnection connection) {
        l.e(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection l() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(Connection connection, Route route) {
        l.e(connection, "connection");
        l.e(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o(Route route) {
        l.e(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void p(Connection connection) {
        l.e(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(Route route, Protocol protocol) {
        l.e(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void r(Route route) {
        l.e(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void s(String str) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(String str, List list) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Handshake handshake) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(ConnectPlan connectPlan) {
        l.e(connectPlan, "connectPlan");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void x(ConnectPlan connectPlan) {
        l.e(connectPlan, "connectPlan");
    }
}
