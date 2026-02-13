package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public abstract class EventListener {

    /* renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f22320a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface Factory {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.EventListener$Companion$NONE$1] */
    static {
        new Companion(0);
        f22320a = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
        };
    }

    public void A(Call call, Handshake handshake) {
        l.e(call, "call");
    }

    public void B(Call call) {
        l.e(call, "call");
    }

    public void a(Call call, Response cachedResponse) {
        l.e(call, "call");
        l.e(cachedResponse, "cachedResponse");
    }

    public void b(Call call, Response response) {
        l.e(call, "call");
    }

    public void c(RealCall realCall) {
    }

    public void d(RealCall realCall, IOException iOException) {
    }

    public void e(RealCall realCall) {
    }

    public void f(RealCall realCall) {
    }

    public void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
    }

    public void j(Call call, Connection connection) {
        l.e(call, "call");
        l.e(connection, "connection");
    }

    public void k(Call call, Connection connection) {
        l.e(call, "call");
        l.e(connection, "connection");
    }

    public void l(Call call, String str, List list) {
        l.e(call, "call");
    }

    public void m(Call call, String str) {
        l.e(call, "call");
    }

    public void n(Call call, HttpUrl url, List list) {
        l.e(call, "call");
        l.e(url, "url");
    }

    public void o(Call call, HttpUrl url) {
        l.e(call, "call");
        l.e(url, "url");
    }

    public void p(Call call, long j) {
        l.e(call, "call");
    }

    public void q(Call call) {
        l.e(call, "call");
    }

    public void r(Call call, IOException ioe) {
        l.e(call, "call");
        l.e(ioe, "ioe");
    }

    public void s(Call call, Request request) {
        l.e(call, "call");
        l.e(request, "request");
    }

    public void t(Call call) {
        l.e(call, "call");
    }

    public void u(Call call, long j) {
        l.e(call, "call");
    }

    public void v(Call call) {
        l.e(call, "call");
    }

    public void w(Call call, IOException ioe) {
        l.e(call, "call");
        l.e(ioe, "ioe");
    }

    public void x(Call call, Response response) {
        l.e(call, "call");
    }

    public void y(Call call) {
        l.e(call, "call");
    }

    public void z(Call call, Response response) {
        l.e(call, "call");
    }
}
