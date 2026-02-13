package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes2.dex */
public final class LoggingEventListener extends EventListener {

    /* renamed from: b, reason: collision with root package name */
    public long f22960b;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static class Factory implements EventListener.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final HttpLoggingInterceptor.Logger f22961a;

        public Factory() {
            HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.f22958a;
            l.e(logger, "logger");
            this.f22961a = logger;
        }
    }

    static {
        new Companion(0);
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Handshake handshake) {
        l.e(call, "call");
        C("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void B(Call call) {
        l.e(call, "call");
        C("secureConnectStart");
    }

    public final void C(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f22960b);
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(millis);
        sb2.append(" ms] ");
        sb2.append(str);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response cachedResponse) {
        l.e(call, "call");
        l.e(cachedResponse, "cachedResponse");
        C("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        l.e(call, "call");
        C("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void c(RealCall realCall) {
        C("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void d(RealCall realCall, IOException iOException) {
        C("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void e(RealCall realCall) {
        this.f22960b = System.nanoTime();
        C("callStart: " + realCall.f22596b);
    }

    @Override // okhttp3.EventListener
    public final void f(RealCall realCall) {
        C("canceled");
    }

    @Override // okhttp3.EventListener
    public final void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
        C("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
        C("connectFailed: null " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        l.e(call, "call");
        l.e(inetSocketAddress, "inetSocketAddress");
        C("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public final void j(Call call, Connection connection) {
        l.e(call, "call");
        l.e(connection, "connection");
        C("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void k(Call call, Connection connection) {
        l.e(call, "call");
        l.e(connection, "connection");
        C("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void l(Call call, String str, List list) {
        l.e(call, "call");
        C("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String str) {
        l.e(call, "call");
        C("dnsStart: ".concat(str));
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, HttpUrl url, List list) {
        l.e(call, "call");
        l.e(url, "url");
        C("proxySelectEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void o(Call call, HttpUrl url) {
        l.e(call, "call");
        l.e(url, "url");
        C("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public final void p(Call call, long j) {
        l.e(call, "call");
        C("requestBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void q(Call call) {
        l.e(call, "call");
        C("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void r(Call call, IOException ioe) {
        l.e(call, "call");
        l.e(ioe, "ioe");
        C("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void s(Call call, Request request) {
        l.e(call, "call");
        l.e(request, "request");
        C("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void t(Call call) {
        l.e(call, "call");
        C("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void u(Call call, long j) {
        l.e(call, "call");
        C("responseBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public final void v(Call call) {
        l.e(call, "call");
        C("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void w(Call call, IOException ioe) {
        l.e(call, "call");
        l.e(ioe, "ioe");
        C("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void x(Call call, Response response) {
        l.e(call, "call");
        C("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void y(Call call) {
        l.e(call, "call");
        C("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void z(Call call, Response response) {
        l.e(call, "call");
        C("satisfactionFailure: " + response);
    }
}
