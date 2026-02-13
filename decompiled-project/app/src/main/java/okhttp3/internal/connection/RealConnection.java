package okhttp3.internal.connection;

import ac.n;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import rc.B;
import rc.C;

/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {

    /* renamed from: A, reason: collision with root package name */
    public Http2Connection f22612A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f22613B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f22614C;

    /* renamed from: D, reason: collision with root package name */
    public int f22615D;

    /* renamed from: E, reason: collision with root package name */
    public int f22616E;

    /* renamed from: F, reason: collision with root package name */
    public int f22617F;

    /* renamed from: G, reason: collision with root package name */
    public int f22618G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f22619H;

    /* renamed from: I, reason: collision with root package name */
    public long f22620I;

    /* renamed from: b, reason: collision with root package name */
    public final TaskRunner f22621b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f22622c;

    /* renamed from: d, reason: collision with root package name */
    public final Route f22623d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f22624e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f22625f;

    /* renamed from: u, reason: collision with root package name */
    public final Handshake f22626u;

    /* renamed from: v, reason: collision with root package name */
    public final Protocol f22627v;

    /* renamed from: w, reason: collision with root package name */
    public final C f22628w;

    /* renamed from: x, reason: collision with root package name */
    public final B f22629x;

    /* renamed from: y, reason: collision with root package name */
    public final int f22630y;

    /* renamed from: z, reason: collision with root package name */
    public final ConnectionListener f22631z;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket rawSocket, Socket socket, Handshake handshake, Protocol protocol, C source, B sink, int i7, ConnectionListener connectionListener) {
        l.e(taskRunner, "taskRunner");
        l.e(connectionPool, "connectionPool");
        l.e(route, "route");
        l.e(rawSocket, "rawSocket");
        l.e(socket, "socket");
        l.e(protocol, "protocol");
        l.e(source, "source");
        l.e(sink, "sink");
        this.f22621b = taskRunner;
        this.f22622c = connectionPool;
        this.f22623d = route;
        this.f22624e = rawSocket;
        this.f22625f = socket;
        this.f22626u = handshake;
        this.f22627v = protocol;
        this.f22628w = source;
        this.f22629x = sink;
        this.f22630y = i7;
        this.f22631z = connectionListener;
        this.f22618G = 1;
        this.f22619H = new ArrayList();
        this.f22620I = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient client, Route failedRoute, IOException failure) {
        l.e(client, "client");
        l.e(failedRoute, "failedRoute");
        l.e(failure, "failure");
        if (failedRoute.f22471b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f22470a;
            address.g.connectFailed(address.f22245h.h(), failedRoute.f22471b.address(), failure);
        }
        RouteDatabase routeDatabase = client.f22361B;
        synchronized (routeDatabase) {
            routeDatabase.f22656a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection connection, Settings settings) {
        l.e(connection, "connection");
        l.e(settings, "settings");
        synchronized (this) {
            try {
                int i7 = this.f22618G;
                int i10 = (settings.f22857a & 8) != 0 ? settings.f22858b[3] : f.API_PRIORITY_OTHER;
                this.f22618G = i10;
                if (i10 < i7) {
                    RealConnectionPool realConnectionPool = this.f22622c;
                    Address address = this.f22623d.f22470a;
                    realConnectionPool.getClass();
                    l.e(address, "address");
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.f22636d.get(address);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                } else if (i10 > i7) {
                    RealConnectionPool realConnectionPool2 = this.f22622c;
                    realConnectionPool2.f22637e.c(realConnectionPool2.f22638f, 0L);
                }
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.f22726u, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall call, IOException iOException) {
        boolean z8;
        l.e(call, "call");
        synchronized (this) {
            try {
                z8 = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f22612A != null) || (iOException instanceof ConnectionShutdownException)) {
                        z8 = !this.f22613B;
                        this.f22613B = true;
                        if (this.f22616E == 0) {
                            if (iOException != null) {
                                d(call.f22595a, this.f22623d, iOException);
                            }
                            this.f22615D++;
                        }
                    }
                } else if (((StreamResetException) iOException).f22859a == ErrorCode.f22726u) {
                    int i7 = this.f22617F + 1;
                    this.f22617F = i7;
                    if (i7 > 1) {
                        z8 = !this.f22613B;
                        this.f22613B = true;
                        this.f22615D++;
                    }
                } else if (((StreamResetException) iOException).f22859a != ErrorCode.f22727v || !call.f22592B) {
                    z8 = !this.f22613B;
                    this.f22613B = true;
                    this.f22615D++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            this.f22631z.getClass();
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.c(this.f22624e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (okhttp3.internal.tls.OkHostnameVerifier.c(r2, (java.security.cert.X509Certificate) r1) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Address address, ArrayList arrayList) {
        l.e(address, "address");
        TimeZone timeZone = _UtilJvmKt.f22497a;
        if (this.f22619H.size() < this.f22618G && !this.f22613B) {
            Route route = this.f22623d;
            if (!route.f22470a.a(address)) {
                return false;
            }
            HttpUrl httpUrl = address.f22245h;
            String str = httpUrl.f22338d;
            Address address2 = route.f22470a;
            if (l.a(str, address2.f22245h.f22338d)) {
                return true;
            }
            if (this.f22612A != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Route route2 = (Route) it.next();
                    Proxy.Type type = route2.f22471b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && route.f22471b.type() == type2) {
                        if (l.a(route.f22472c, route2.f22472c)) {
                            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f22941a;
                            if (address.f22242d != okHostnameVerifier) {
                                return false;
                            }
                            TimeZone timeZone2 = _UtilJvmKt.f22497a;
                            HttpUrl httpUrl2 = address2.f22245h;
                            if (httpUrl.f22339e == httpUrl2.f22339e) {
                                String str2 = httpUrl2.f22338d;
                                String hostname = httpUrl.f22338d;
                                boolean a9 = l.a(hostname, str2);
                                Handshake handshake = this.f22626u;
                                if (!a9) {
                                    if (!this.f22614C && handshake != null) {
                                        List a10 = handshake.a();
                                        if (!a10.isEmpty()) {
                                            Object obj = a10.get(0);
                                            l.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            okHostnameVerifier.getClass();
                                        }
                                    }
                                }
                                try {
                                    CertificatePinner certificatePinner = address.f22243e;
                                    l.b(certificatePinner);
                                    l.b(handshake);
                                    List peerCertificates = handshake.a();
                                    l.e(hostname, "hostname");
                                    l.e(peerCertificates, "peerCertificates");
                                    Iterator it2 = certificatePinner.f22263a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    ((CertificatePinner.Pin) it2.next()).getClass();
                                    n.Y(null, "**.", false);
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route f() {
        return this.f22623d;
    }

    public final boolean g(boolean z8) {
        long j;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        long nanoTime = System.nanoTime();
        if (this.f22624e.isClosed() || this.f22625f.isClosed() || this.f22625f.isInputShutdown() || this.f22625f.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f22612A;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f22780f) {
                    return false;
                }
                if (http2Connection.f22764C < http2Connection.f22763B) {
                    if (nanoTime >= http2Connection.f22765D) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.f22620I;
        }
        if (j < 10000000000L || !z8) {
            return true;
        }
        Socket socket = this.f22625f;
        C source = this.f22628w;
        l.e(socket, "<this>");
        l.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.l();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void h() {
        synchronized (this) {
            this.f22613B = true;
        }
        this.f22631z.getClass();
    }

    public final void i() {
        this.f22620I = System.nanoTime();
        Protocol protocol = this.f22627v;
        if (protocol == Protocol.f22418f || protocol == Protocol.f22419u) {
            this.f22625f.setSoTimeout(0);
            Object obj = this.f22631z;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.f22730a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.f22621b);
            Socket socket = this.f22625f;
            String peerName = this.f22623d.f22470a.f22245h.f22338d;
            C source = this.f22628w;
            B sink = this.f22629x;
            l.e(socket, "socket");
            l.e(peerName, "peerName");
            l.e(source, "source");
            l.e(sink, "sink");
            builder.f22788b = socket;
            String str = _UtilJvmKt.f22498b + ' ' + peerName;
            l.e(str, "<set-?>");
            builder.f22789c = str;
            builder.f22790d = source;
            builder.f22791e = sink;
            builder.f22792f = this;
            builder.f22793h = this.f22630y;
            l.e(flowControlListener, "flowControlListener");
            builder.f22794i = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.f22612A = http2Connection;
            Http2Connection.f22760O.getClass();
            Settings settings = Http2Connection.f22761P;
            this.f22618G = (settings.f22857a & 8) != 0 ? settings.f22858b[3] : f.API_PRIORITY_OTHER;
            Http2Writer http2Writer = http2Connection.L;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.f22846d) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.f22842f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.e(">> CONNECTION " + Http2.f22756b.g(), new Object[0]));
                    }
                    http2Writer.f22843a.I(Http2.f22756b);
                    http2Writer.f22843a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.L;
            Settings settings2 = http2Connection.f22767F;
            http2Writer2.getClass();
            l.e(settings2, "settings");
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.f22846d) {
                        throw new IOException("closed");
                    }
                    http2Writer2.F(0, Integer.bitCount(settings2.f22857a) * 6, 4, 0);
                    for (int i7 = 0; i7 < 10; i7++) {
                        boolean z8 = true;
                        if (((1 << i7) & settings2.f22857a) == 0) {
                            z8 = false;
                        }
                        if (z8) {
                            B b2 = http2Writer2.f22843a;
                            if (b2.f23927c) {
                                throw new IllegalStateException("closed");
                            }
                            b2.f23926b.p0(i7);
                            b2.l();
                            http2Writer2.f22843a.F(settings2.f22858b[i7]);
                        }
                    }
                    http2Writer2.f22843a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (http2Connection.f22767F.a() != 65535) {
                http2Connection.L.V(0, r2 - 65535);
            }
            TaskQueue.b(http2Connection.f22781u.d(), http2Connection.f22777c, http2Connection.f22773M, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        Route route = this.f22623d;
        sb2.append(route.f22470a.f22245h.f22338d);
        sb2.append(':');
        sb2.append(route.f22470a.f22245h.f22339e);
        sb2.append(", proxy=");
        sb2.append(route.f22471b);
        sb2.append(" hostAddress=");
        sb2.append(route.f22472c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f22626u;
        if (handshake == null || (obj = handshake.f22328b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f22627v);
        sb2.append('}');
        return sb2.toString();
    }
}
