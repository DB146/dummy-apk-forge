package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;

/* loaded from: classes2.dex */
public interface ConnectionUser {
    boolean a();

    void b(Route route, IOException iOException);

    void c(HttpUrl httpUrl);

    void d(HttpUrl httpUrl, List list);

    void e(RealConnection realConnection);

    void f();

    void g(RealConnection realConnection);

    Socket h();

    boolean i();

    void j(RealConnection realConnection);

    void k(RealConnection realConnection);

    RealConnection l();

    void m(RealConnection realConnection);

    void n(Connection connection, Route route);

    void o(Route route);

    void p(Connection connection);

    void q(Route route, Protocol protocol);

    void r(Route route);

    void s(String str);

    void t(RealConnection realConnection);

    void u(String str, List list);

    void v(Handshake handshake);

    void w(ConnectPlan connectPlan);

    void x(ConnectPlan connectPlan);
}
