package okhttp3.internal.connection;

import Eb.o;
import Y5.C0658x;
import ac.h;
import ac.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import rc.AbstractC1958b;
import rc.B;
import rc.C;
import rc.C1967k;
import rc.J;

/* loaded from: classes2.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f22538M = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f22539A;

    /* renamed from: B, reason: collision with root package name */
    public final Request f22540B;

    /* renamed from: C, reason: collision with root package name */
    public final int f22541C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f22542D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f22543E;

    /* renamed from: F, reason: collision with root package name */
    public Socket f22544F;

    /* renamed from: G, reason: collision with root package name */
    public Socket f22545G;

    /* renamed from: H, reason: collision with root package name */
    public Handshake f22546H;

    /* renamed from: I, reason: collision with root package name */
    public Protocol f22547I;

    /* renamed from: J, reason: collision with root package name */
    public C f22548J;

    /* renamed from: K, reason: collision with root package name */
    public B f22549K;
    public RealConnection L;

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f22550a;

    /* renamed from: b, reason: collision with root package name */
    public final RealConnectionPool f22551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22552c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22553d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22555f;

    /* renamed from: u, reason: collision with root package name */
    public final int f22556u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f22557v;

    /* renamed from: w, reason: collision with root package name */
    public final ConnectionUser f22558w;

    /* renamed from: x, reason: collision with root package name */
    public final RealRoutePlanner f22559x;

    /* renamed from: y, reason: collision with root package name */
    public final Route f22560y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f22561z;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22562a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22562a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool connectionPool, int i7, int i10, int i11, int i12, int i13, boolean z8, ConnectionUser connectionUser, RealRoutePlanner routePlanner, Route route, ArrayList arrayList, int i14, Request request, int i15, boolean z10) {
        l.e(taskRunner, "taskRunner");
        l.e(connectionPool, "connectionPool");
        l.e(routePlanner, "routePlanner");
        l.e(route, "route");
        this.f22550a = taskRunner;
        this.f22551b = connectionPool;
        this.f22552c = i7;
        this.f22553d = i10;
        this.f22554e = i11;
        this.f22555f = i12;
        this.f22556u = i13;
        this.f22557v = z8;
        this.f22558w = connectionUser;
        this.f22559x = routePlanner;
        this.f22560y = route;
        this.f22561z = arrayList;
        this.f22539A = i14;
        this.f22540B = request;
        this.f22541C = i15;
        this.f22542D = z10;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        return new ConnectPlan(this.f22550a, this.f22551b, this.f22552c, this.f22553d, this.f22554e, this.f22555f, this.f22556u, this.f22557v, this.f22558w, this.f22559x, this.f22560y, this.f22561z, this.f22539A, this.f22540B, this.f22541C, this.f22542D);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean b() {
        return this.f22547I != null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall call, IOException iOException) {
        l.e(call, "call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.f22543E = true;
        Socket socket = this.f22544F;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[Catch: all -> 0x012f, TryCatch #11 {all -> 0x012f, blocks: (B:85:0x0109, B:48:0x015e, B:50:0x0165, B:53:0x016a, B:56:0x016f, B:58:0x0173, B:61:0x017c, B:64:0x0181, B:67:0x0187, B:105:0x013e, B:106:0x0142, B:41:0x0146, B:44:0x014a), top: B:6:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r14v1, types: [okhttp3.internal.connection.ConnectionUser] */
    /* JADX WARN: Type inference failed for: r14v13, types: [okhttp3.internal.connection.ConnectionUser] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [javax.net.ssl.SSLSocketFactory] */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RoutePlanner.ConnectResult d() {
        Socket socket;
        ConnectPlan connectPlan;
        ConnectionUser connectionUser;
        ConnectPlan connectPlan2;
        ConnectionUser connectionUser2;
        ConnectionUser connectionUser3;
        B b2;
        ?? r14 = this.f22544F;
        if (r14 == 0) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (b()) {
            throw new IllegalStateException("already connected");
        }
        Route route = this.f22560y;
        Address address = route.f22470a;
        Address address2 = route.f22470a;
        List list = address.j;
        ConnectionUser connectionUser4 = this.f22558w;
        connectionUser4.w(this);
        ConnectPlan connectPlan3 = null;
        boolean z8 = false;
        try {
            try {
                try {
                    if (this.f22540B != null) {
                        RoutePlanner.ConnectResult k = k();
                        if (k.f22658b != null || k.f22659c != null) {
                            connectionUser4.x(this);
                            Socket socket2 = this.f22545G;
                            if (socket2 != null) {
                                _UtilJvmKt.c(socket2);
                            }
                            _UtilJvmKt.c(r14);
                            return k;
                        }
                    }
                    try {
                        if (address2.f22241c != null) {
                            C c10 = this.f22548J;
                            if (c10 == null) {
                                l.j("source");
                                throw null;
                            }
                            if (c10.f23929b.K()) {
                                B b10 = this.f22549K;
                                if (b10 == null) {
                                    l.j("sink");
                                    throw null;
                                }
                                if (b10.f23926b.K()) {
                                    connectionUser4.f();
                                    ?? r32 = address2.f22241c;
                                    HttpUrl httpUrl = address2.f22245h;
                                    Socket createSocket = r32.createSocket(r14, httpUrl.f22338d, httpUrl.f22339e, true);
                                    l.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                    SSLSocket sSLSocket = (SSLSocket) createSocket;
                                    ConnectPlan m10 = m(list, sSLSocket);
                                    ConnectionSpec connectionSpec = (ConnectionSpec) list.get(m10.f22541C);
                                    ConnectPlan l10 = m10.l(list, sSLSocket);
                                    try {
                                        connectionSpec.a(sSLSocket, m10.f22542D);
                                        j(sSLSocket, connectionSpec);
                                        connectionUser4.v(this.f22546H);
                                        connectPlan2 = l10;
                                    } catch (IOException e2) {
                                        e = e2;
                                        connectPlan = null;
                                        socket = r14;
                                        connectPlan3 = l10;
                                        connectionUser = connectionUser4;
                                        connectionUser.b(route, e);
                                        if (this.f22557v && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                            RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                            connectionUser.x(this);
                                            if (!z8) {
                                                Socket socket3 = this.f22545G;
                                                if (socket3 != null) {
                                                    _UtilJvmKt.c(socket3);
                                                }
                                                _UtilJvmKt.c(socket);
                                            }
                                            return connectResult;
                                        }
                                        connectPlan3 = connectPlan;
                                        RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                        connectionUser.x(this);
                                        if (!z8) {
                                        }
                                        return connectResult2;
                                    }
                                }
                            }
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                        this.f22545G = r14;
                        List list2 = address2.f22246i;
                        Protocol protocol = Protocol.f22419u;
                        if (!list2.contains(protocol)) {
                            protocol = Protocol.f22416d;
                        }
                        this.f22547I = protocol;
                        connectPlan2 = null;
                        try {
                            TaskRunner taskRunner = this.f22550a;
                            RealConnectionPool realConnectionPool = this.f22551b;
                            Route route2 = this.f22560y;
                            Socket socket4 = this.f22545G;
                            l.b(socket4);
                            Handshake handshake = this.f22546H;
                            Protocol protocol2 = this.f22547I;
                            l.b(protocol2);
                            C c11 = this.f22548J;
                            if (c11 == null) {
                                socket = r14;
                                connectionUser2 = connectionUser4;
                                try {
                                    l.j("source");
                                    connectPlan = null;
                                } catch (IOException e10) {
                                    e = e10;
                                    connectPlan = null;
                                }
                                try {
                                    throw null;
                                } catch (IOException e11) {
                                    e = e11;
                                    connectPlan3 = connectPlan2;
                                    connectionUser = connectionUser2;
                                    connectionUser.b(route, e);
                                    if (this.f22557v) {
                                    }
                                    connectPlan3 = connectPlan;
                                    RoutePlanner.ConnectResult connectResult22 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                    connectionUser.x(this);
                                    if (!z8) {
                                    }
                                    return connectResult22;
                                }
                            }
                            try {
                                b2 = this.f22549K;
                            } catch (IOException e12) {
                                e = e12;
                                socket = r14;
                                r14 = connectionUser4;
                            }
                            try {
                                if (b2 == null) {
                                    l.j("sink");
                                    throw null;
                                }
                                socket = r14;
                                r14 = connectionUser4;
                                RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route2, r14, socket4, handshake, protocol2, c11, b2, this.f22556u, this.f22551b.f22634b);
                                this.L = realConnection;
                                realConnection.i();
                                r14.q(route, this.f22547I);
                                try {
                                    RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, null, null, 6);
                                    r14.x(this);
                                    return connectResult3;
                                } catch (IOException e13) {
                                    e = e13;
                                    connectPlan3 = connectPlan2;
                                    z8 = true;
                                    connectionUser3 = r14;
                                    connectPlan = null;
                                    connectionUser = connectionUser3;
                                    connectionUser.b(route, e);
                                    if (this.f22557v) {
                                    }
                                    connectPlan3 = connectPlan;
                                    RoutePlanner.ConnectResult connectResult222 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                    connectionUser.x(this);
                                    if (!z8) {
                                    }
                                    return connectResult222;
                                } catch (Throwable th) {
                                    th = th;
                                    z8 = true;
                                    r14.x(this);
                                    if (!z8) {
                                        Socket socket5 = this.f22545G;
                                        if (socket5 != null) {
                                            _UtilJvmKt.c(socket5);
                                        }
                                        _UtilJvmKt.c(socket);
                                    }
                                    throw th;
                                }
                            } catch (IOException e14) {
                                e = e14;
                                connectPlan3 = connectPlan2;
                                connectionUser3 = r14;
                                connectPlan = null;
                                connectionUser = connectionUser3;
                                connectionUser.b(route, e);
                                if (this.f22557v) {
                                    RoutePlanner.ConnectResult connectResult2222 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                    connectionUser.x(this);
                                    if (!z8) {
                                    }
                                    return connectResult2222;
                                }
                                connectPlan3 = connectPlan;
                                RoutePlanner.ConnectResult connectResult22222 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                connectionUser.x(this);
                                if (!z8) {
                                }
                                return connectResult22222;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            connectPlan = null;
                            socket = r14;
                            connectionUser2 = connectionUser4;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        connectPlan = null;
                        socket = r14;
                        connectionUser = connectionUser4;
                        connectPlan3 = null;
                    }
                } catch (IOException e17) {
                    e = e17;
                    connectPlan = null;
                    socket = r14;
                }
            } catch (Throwable th2) {
                th = th2;
                socket = r14;
                r14 = connectionUser4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection e() {
        this.f22558w.o(this.f22560y);
        RealConnection realConnection = this.L;
        l.b(realConnection);
        this.f22558w.n(realConnection, this.f22560y);
        ReusePlan i7 = this.f22559x.i(this, this.f22561z);
        if (i7 != null) {
            return i7.f22655a;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.f22551b;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.f22497a;
            realConnectionPool.g.add(realConnection);
            realConnectionPool.f22637e.c(realConnectionPool.f22638f, 0L);
            this.f22558w.e(realConnection);
        }
        this.f22558w.p(realConnection);
        this.f22558w.j(realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route f() {
        return this.f22560y;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        Socket socket;
        Socket socket2;
        Route route = this.f22560y;
        if (this.f22544F != null) {
            throw new IllegalStateException("TCP already connected");
        }
        ConnectionUser connectionUser = this.f22558w;
        connectionUser.w(this);
        boolean z8 = false;
        try {
            try {
                connectionUser.r(route);
                i();
                z8 = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                connectionUser.x(this);
                return connectResult;
            } catch (IOException e2) {
                route.f22470a.getClass();
                Proxy proxy = route.f22471b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    Address address = route.f22470a;
                    address.g.connectFailed(address.f22245h.h(), proxy.address(), e2);
                }
                connectionUser.b(route, e2);
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e2, 2);
                connectionUser.x(this);
                if (!z8 && (socket2 = this.f22544F) != null) {
                    _UtilJvmKt.c(socket2);
                }
                return connectResult2;
            }
        } catch (Throwable th) {
            connectionUser.x(this);
            if (!z8 && (socket = this.f22544F) != null) {
                _UtilJvmKt.c(socket);
            }
            throw th;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void h() {
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.f22560y.f22471b.type();
        int i7 = type == null ? -1 : WhenMappings.f22562a[type.ordinal()];
        if (i7 == 1 || i7 == 2) {
            createSocket = this.f22560y.f22470a.f22240b.createSocket();
            l.b(createSocket);
        } else {
            createSocket = new Socket(this.f22560y.f22471b);
        }
        this.f22544F = createSocket;
        if (this.f22543E) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f22555f);
        try {
            Platform.f22897a.getClass();
            Platform.f22898b.d(createSocket, this.f22560y.f22472c, this.f22554e);
            try {
                this.f22548J = AbstractC1958b.c(AbstractC1958b.i(createSocket));
                this.f22549K = AbstractC1958b.b(AbstractC1958b.h(createSocket));
            } catch (NullPointerException e2) {
                if (l.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f22560y.f22472c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocol;
        int i7 = 0;
        Address address = this.f22560y.f22470a;
        try {
            if (connectionSpec.f22290b) {
                Platform.f22897a.getClass();
                Platform.f22898b.c(sSLSocket, address.f22245h.f22338d, address.f22246i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f22326e;
            l.b(session);
            companion.getClass();
            Handshake a9 = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.f22242d;
            l.b(hostnameVerifier);
            if (hostnameVerifier.verify(address.f22245h.f22338d, session)) {
                CertificatePinner certificatePinner = address.f22243e;
                l.b(certificatePinner);
                this.f22546H = new Handshake(a9.f22327a, a9.f22328b, a9.f22329c, new a(certificatePinner, a9, address, i7));
                String hostname = address.f22245h.f22338d;
                l.e(hostname, "hostname");
                Iterator it = certificatePinner.f22263a.iterator();
                String str = null;
                if (it.hasNext()) {
                    ((CertificatePinner.Pin) it.next()).getClass();
                    n.Y(null, "**.", false);
                    throw null;
                }
                if (connectionSpec.f22290b) {
                    Platform.f22897a.getClass();
                    str = Platform.f22898b.e(sSLSocket);
                }
                this.f22545G = sSLSocket;
                this.f22548J = AbstractC1958b.c(AbstractC1958b.i(sSLSocket));
                this.f22549K = AbstractC1958b.b(AbstractC1958b.h(sSLSocket));
                if (str != null) {
                    Protocol.f22414b.getClass();
                    protocol = Protocol.Companion.a(str);
                } else {
                    protocol = Protocol.f22416d;
                }
                this.f22547I = protocol;
                Platform.f22897a.getClass();
                Platform.f22898b.getClass();
                return;
            }
            List a10 = a9.a();
            if (a10.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.f22245h.f22338d + " not verified (no certificates)");
            }
            Object obj = a10.get(0);
            l.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
            sb2.append(address.f22245h.f22338d);
            sb2.append(" not verified:\n            |    certificate: ");
            CertificatePinner.f22261c.getClass();
            StringBuilder sb3 = new StringBuilder("sha256/");
            C1967k c1967k = C1967k.f23967d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l.d(encoded, "getEncoded(...)");
            sb3.append(C0658x.d(encoded).d("SHA-256").a());
            sb2.append(sb3.toString());
            sb2.append("\n            |    DN: ");
            sb2.append(x509Certificate.getSubjectDN().getName());
            sb2.append("\n            |    subjectAltNames: ");
            OkHostnameVerifier.f22941a.getClass();
            sb2.append(o.i0(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
            sb2.append("\n            ");
            throw new SSLPeerUnverifiedException(h.R(sb2.toString()));
        } catch (Throwable th) {
            Platform.f22897a.getClass();
            Platform.f22898b.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        return new okhttp3.internal.connection.RoutePlanner.ConnectResult(r10, null, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RoutePlanner.ConnectResult k() {
        Request request = this.f22540B;
        l.b(request);
        Route route = this.f22560y;
        String str = "CONNECT " + _UtilJvmKt.j(route.f22470a.f22245h, true) + " HTTP/1.1";
        while (true) {
            C c10 = this.f22548J;
            if (c10 == null) {
                l.j("source");
                throw null;
            }
            B b2 = this.f22549K;
            if (b2 == null) {
                l.j("sink");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, c10, b2);
            C c11 = this.f22548J;
            if (c11 == null) {
                l.j("source");
                throw null;
            }
            J e2 = c11.f23928a.e();
            long j = this.f22552c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e2.g(j, timeUnit);
            B b10 = this.f22549K;
            if (b10 == null) {
                l.j("sink");
                throw null;
            }
            b10.f23925a.e().g(this.f22553d, timeUnit);
            http1ExchangeCodec.l(request.f22426c, str);
            http1ExchangeCodec.a();
            Response.Builder i7 = http1ExchangeCodec.i(false);
            l.b(i7);
            i7.f22451a = request;
            Response a9 = i7.a();
            http1ExchangeCodec.k(a9);
            int i10 = a9.f22442d;
            if (i10 == 200) {
                break;
            }
            if (i10 != 407) {
                throw new IOException(h3.o.l(i10, "Unexpected response code for CONNECT: "));
            }
            Request a10 = route.f22470a.f22244f.a(route, a9);
            if (a10 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            String b11 = a9.f22444f.b("Connection");
            if (b11 == null) {
                b11 = null;
            }
            if ("close".equalsIgnoreCase(b11)) {
                break;
            }
            request = a10;
        }
    }

    public final ConnectPlan l(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        l.e(connectionSpecs, "connectionSpecs");
        int i7 = this.f22541C;
        int i10 = i7 + 1;
        int size = connectionSpecs.size();
        while (i10 < size) {
            ConnectionSpec connectionSpec = (ConnectionSpec) connectionSpecs.get(i10);
            connectionSpec.getClass();
            if (connectionSpec.f22289a && ((strArr = connectionSpec.f22292d) == null || _UtilCommonKt.d(strArr, sSLSocket.getEnabledProtocols(), Gb.a.f4452b))) {
                String[] strArr2 = connectionSpec.f22291c;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                    CipherSuite.f22268b.getClass();
                    if (!_UtilCommonKt.d(strArr2, enabledCipherSuites, CipherSuite.f22269c)) {
                    }
                }
                boolean z8 = i7 != -1;
                int i11 = (3 & 1) != 0 ? this.f22539A : 0;
                Request request = (3 & 2) != 0 ? this.f22540B : null;
                if ((3 & 4) != 0) {
                    i10 = this.f22541C;
                }
                int i12 = i10;
                if ((3 & 8) != 0) {
                    z8 = this.f22542D;
                }
                return new ConnectPlan(this.f22550a, this.f22551b, this.f22552c, this.f22553d, this.f22554e, this.f22555f, this.f22556u, this.f22557v, this.f22558w, this.f22559x, this.f22560y, this.f22561z, i11, request, i12, z8);
            }
            i10++;
        }
        return null;
    }

    public final ConnectPlan m(List connectionSpecs, SSLSocket sSLSocket) {
        l.e(connectionSpecs, "connectionSpecs");
        if (this.f22541C != -1) {
            return this;
        }
        ConnectPlan l10 = l(connectionSpecs, sSLSocket);
        if (l10 != null) {
            return l10;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f22542D);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        l.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        l.d(arrays, "toString(...)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }
}
