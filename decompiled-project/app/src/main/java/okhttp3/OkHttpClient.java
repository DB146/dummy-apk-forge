package okhttp3;

import Eb.o;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import okhttp3.Call;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* loaded from: classes2.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {

    /* renamed from: E, reason: collision with root package name */
    public static final Companion f22357E = new Companion(0);

    /* renamed from: F, reason: collision with root package name */
    public static final List f22358F = _UtilJvmKt.l(new Protocol[]{Protocol.f22418f, Protocol.f22416d});

    /* renamed from: G, reason: collision with root package name */
    public static final List f22359G = _UtilJvmKt.l(new ConnectionSpec[]{ConnectionSpec.g, ConnectionSpec.f22288h});

    /* renamed from: A, reason: collision with root package name */
    public final long f22360A;

    /* renamed from: B, reason: collision with root package name */
    public final RouteDatabase f22361B;

    /* renamed from: C, reason: collision with root package name */
    public final TaskRunner f22362C;

    /* renamed from: D, reason: collision with root package name */
    public final ConnectionPool f22363D;

    /* renamed from: a, reason: collision with root package name */
    public final Dispatcher f22364a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22365b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22366c;

    /* renamed from: d, reason: collision with root package name */
    public final Q9.a f22367d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22368e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22369f;
    public final Authenticator g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22370h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22371i;
    public final CookieJar j;
    public final Dns k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f22372l;

    /* renamed from: m, reason: collision with root package name */
    public final Authenticator f22373m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f22374n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f22375o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f22376p;

    /* renamed from: q, reason: collision with root package name */
    public final List f22377q;

    /* renamed from: r, reason: collision with root package name */
    public final List f22378r;

    /* renamed from: s, reason: collision with root package name */
    public final OkHostnameVerifier f22379s;

    /* renamed from: t, reason: collision with root package name */
    public final CertificatePinner f22380t;

    /* renamed from: u, reason: collision with root package name */
    public final CertificateChainCleaner f22381u;

    /* renamed from: v, reason: collision with root package name */
    public final int f22382v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22383w;

    /* renamed from: x, reason: collision with root package name */
    public final int f22384x;

    /* renamed from: y, reason: collision with root package name */
    public final int f22385y;

    /* renamed from: z, reason: collision with root package name */
    public final int f22386z;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: A, reason: collision with root package name */
        public int f22387A;

        /* renamed from: B, reason: collision with root package name */
        public long f22388B;

        /* renamed from: C, reason: collision with root package name */
        public RouteDatabase f22389C;

        /* renamed from: D, reason: collision with root package name */
        public TaskRunner f22390D;

        /* renamed from: b, reason: collision with root package name */
        public ConnectionPool f22392b;

        /* renamed from: e, reason: collision with root package name */
        public Q9.a f22395e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22396f;
        public boolean g;

        /* renamed from: h, reason: collision with root package name */
        public Authenticator f22397h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22398i;
        public boolean j;
        public CookieJar k;

        /* renamed from: l, reason: collision with root package name */
        public Dns f22399l;

        /* renamed from: m, reason: collision with root package name */
        public ProxySelector f22400m;

        /* renamed from: n, reason: collision with root package name */
        public Authenticator f22401n;

        /* renamed from: o, reason: collision with root package name */
        public SocketFactory f22402o;

        /* renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f22403p;

        /* renamed from: q, reason: collision with root package name */
        public X509TrustManager f22404q;

        /* renamed from: r, reason: collision with root package name */
        public List f22405r;

        /* renamed from: s, reason: collision with root package name */
        public List f22406s;

        /* renamed from: t, reason: collision with root package name */
        public OkHostnameVerifier f22407t;

        /* renamed from: u, reason: collision with root package name */
        public CertificatePinner f22408u;

        /* renamed from: v, reason: collision with root package name */
        public CertificateChainCleaner f22409v;

        /* renamed from: w, reason: collision with root package name */
        public int f22410w;

        /* renamed from: x, reason: collision with root package name */
        public int f22411x;

        /* renamed from: y, reason: collision with root package name */
        public int f22412y;

        /* renamed from: z, reason: collision with root package name */
        public int f22413z;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f22391a = new Dispatcher();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f22393c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f22394d = new ArrayList();

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f22320a;
            TimeZone timeZone = _UtilJvmKt.f22497a;
            l.e(eventListener$Companion$NONE$1, "<this>");
            this.f22395e = new Q9.a(eventListener$Companion$NONE$1, 29);
            this.f22396f = true;
            this.g = true;
            Authenticator authenticator = Authenticator.f22247a;
            this.f22397h = authenticator;
            this.f22398i = true;
            this.j = true;
            this.k = CookieJar.f22309a;
            this.f22399l = Dns.f22318a;
            this.f22401n = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l.d(socketFactory, "getDefault(...)");
            this.f22402o = socketFactory;
            OkHttpClient.f22357E.getClass();
            this.f22405r = OkHttpClient.f22359G;
            this.f22406s = OkHttpClient.f22358F;
            this.f22407t = OkHostnameVerifier.f22941a;
            this.f22408u = CertificatePinner.f22262d;
            this.f22411x = 10000;
            this.f22412y = 10000;
            this.f22413z = 10000;
            this.f22387A = 60000;
            this.f22388B = 1024L;
        }

        public final void a(long j, TimeUnit unit) {
            l.e(unit, "unit");
            this.f22410w = _UtilJvmKt.b(j, unit);
        }

        public final void b(long j, TimeUnit unit) {
            l.e(unit, "unit");
            this.f22413z = _UtilJvmKt.b(j, unit);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpClient(Builder builder) {
        List list;
        this.f22364a = builder.f22391a;
        this.f22365b = _UtilJvmKt.k(builder.f22393c);
        this.f22366c = _UtilJvmKt.k(builder.f22394d);
        this.f22367d = builder.f22395e;
        boolean z8 = builder.f22396f;
        this.f22368e = z8;
        boolean z10 = builder.g;
        this.f22369f = z10;
        this.g = builder.f22397h;
        this.f22370h = builder.f22398i;
        this.f22371i = builder.j;
        this.j = builder.k;
        this.k = builder.f22399l;
        ProxySelector proxySelector = builder.f22400m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = NullProxySelector.f22923a;
        }
        this.f22372l = proxySelector;
        this.f22373m = builder.f22401n;
        this.f22374n = builder.f22402o;
        List list2 = builder.f22405r;
        this.f22377q = list2;
        this.f22378r = builder.f22406s;
        this.f22379s = builder.f22407t;
        this.f22382v = builder.f22410w;
        int i7 = builder.f22411x;
        this.f22383w = i7;
        int i10 = builder.f22412y;
        this.f22384x = i10;
        int i11 = builder.f22413z;
        this.f22385y = i11;
        this.f22386z = builder.f22387A;
        this.f22360A = builder.f22388B;
        RouteDatabase routeDatabase = builder.f22389C;
        RouteDatabase routeDatabase2 = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        this.f22361B = routeDatabase2;
        TaskRunner taskRunner = builder.f22390D;
        this.f22362C = taskRunner == null ? TaskRunner.f22521z : taskRunner;
        ConnectionPool connectionPool = builder.f22392b;
        if (connectionPool == null) {
            ConnectionPool connectionPool2 = new ConnectionPool(null, null, null, i10, i11, i7, i10, z8, z10, routeDatabase2, 31);
            builder.f22392b = connectionPool2;
            connectionPool = connectionPool2;
        }
        this.f22363D = connectionPool;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f22289a) {
                    SSLSocketFactory sSLSocketFactory = builder.f22403p;
                    if (sSLSocketFactory == null) {
                        Platform.f22897a.getClass();
                        Platform.f22898b.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        l.b(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                l.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f22376p = x509TrustManager;
                                Platform platform = Platform.f22898b;
                                platform.getClass();
                                try {
                                    SSLContext j = platform.j();
                                    j.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = j.getSocketFactory();
                                    l.d(socketFactory, "getSocketFactory(...)");
                                    this.f22375o = socketFactory;
                                    CertificateChainCleaner.f22940a.getClass();
                                    CertificateChainCleaner a9 = Platform.f22898b.a(x509TrustManager);
                                    this.f22381u = a9;
                                    CertificatePinner certificatePinner = builder.f22408u;
                                    certificatePinner.getClass();
                                    this.f22380t = l.a(certificatePinner.f22264b, a9) ? certificatePinner : new CertificatePinner(certificatePinner.f22263a, a9);
                                } catch (GeneralSecurityException e2) {
                                    throw new AssertionError("No System TLS: " + e2, e2);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        l.d(arrays, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                    }
                    this.f22375o = sSLSocketFactory;
                    CertificateChainCleaner certificateChainCleaner = builder.f22409v;
                    l.b(certificateChainCleaner);
                    this.f22381u = certificateChainCleaner;
                    X509TrustManager x509TrustManager2 = builder.f22404q;
                    l.b(x509TrustManager2);
                    this.f22376p = x509TrustManager2;
                    CertificatePinner certificatePinner2 = builder.f22408u;
                    certificatePinner2.getClass();
                    this.f22380t = l.a(certificatePinner2.f22264b, certificateChainCleaner) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f22263a, certificateChainCleaner);
                    list = this.f22365b;
                    l.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f22366c;
                    l.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager3 = this.f22376p;
                    CertificateChainCleaner certificateChainCleaner2 = this.f22381u;
                    SSLSocketFactory sSLSocketFactory2 = this.f22375o;
                    List list4 = this.f22377q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((ConnectionSpec) it2.next()).f22289a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (certificateChainCleaner2 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager3 == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (certificateChainCleaner2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!l.a(this.f22380t, CertificatePinner.f22262d)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f22375o = null;
        this.f22381u = null;
        this.f22376p = null;
        this.f22380t = CertificatePinner.f22262d;
        list = this.f22365b;
        l.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f22391a = this.f22364a;
        builder.f22392b = this.f22363D;
        o.U(builder.f22393c, this.f22365b);
        o.U(builder.f22394d, this.f22366c);
        builder.f22395e = this.f22367d;
        builder.f22396f = this.f22368e;
        builder.g = this.f22369f;
        builder.f22397h = this.g;
        builder.f22398i = this.f22370h;
        builder.j = this.f22371i;
        builder.k = this.j;
        builder.f22399l = this.k;
        builder.f22400m = this.f22372l;
        builder.f22401n = this.f22373m;
        builder.f22402o = this.f22374n;
        builder.f22403p = this.f22375o;
        builder.f22404q = this.f22376p;
        builder.f22405r = this.f22377q;
        builder.f22406s = this.f22378r;
        builder.f22407t = this.f22379s;
        builder.f22408u = this.f22380t;
        builder.f22409v = this.f22381u;
        builder.f22410w = this.f22382v;
        builder.f22411x = this.f22383w;
        builder.f22412y = this.f22384x;
        builder.f22413z = this.f22385y;
        builder.f22387A = this.f22386z;
        builder.f22388B = this.f22360A;
        builder.f22389C = this.f22361B;
        builder.f22390D = this.f22362C;
        return builder;
    }

    public final RealCall b(Request request) {
        l.e(request, "request");
        return new RealCall(this, request);
    }
}
