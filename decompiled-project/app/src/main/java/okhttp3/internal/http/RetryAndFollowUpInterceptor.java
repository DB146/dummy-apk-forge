package okhttp3.internal.http;

import Eb.o;
import Eb.v;
import a.AbstractC0672a;
import com.google.android.gms.common.api.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.CallConnectionUser;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.SequentialExchangeFinder;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.tls.OkHostnameVerifier;

/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f22692a;

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

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        l.e(client, "client");
        this.f22692a = client;
    }

    public static int c(Response response, int i7) {
        String b2 = response.f22444f.b("Retry-After");
        if (b2 == null) {
            b2 = null;
        }
        if (b2 == null) {
            return i7;
        }
        Pattern compile = Pattern.compile("\\d+");
        l.d(compile, "compile(...)");
        if (!compile.matcher(b2).matches()) {
            return f.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(b2);
        l.d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    public final Request a(Response response, Exchange exchange) {
        HttpUrl.Builder builder;
        Route route = exchange != null ? exchange.b().f22623d : null;
        int i7 = response.f22442d;
        Request request = response.f22439a;
        String str = request.f22425b;
        if (i7 != 307 && i7 != 308) {
            if (i7 == 401) {
                return this.f22692a.g.a(route, response);
            }
            if (i7 == 421) {
                RequestBody requestBody = request.f22427d;
                if ((requestBody != null && requestBody.c()) || exchange == null || l.a(exchange.f22567c.b().e().f22245h.f22338d, exchange.f22568d.g().f().f22470a.f22245h.f22338d)) {
                    return null;
                }
                RealConnection b2 = exchange.b();
                synchronized (b2) {
                    b2.f22614C = true;
                }
                return response.f22439a;
            }
            if (i7 == 503) {
                Response response2 = response.f22448x;
                if ((response2 == null || response2.f22442d != 503) && c(response, f.API_PRIORITY_OTHER) == 0) {
                    return response.f22439a;
                }
                return null;
            }
            if (i7 == 407) {
                l.b(route);
                if (route.f22471b.type() == Proxy.Type.HTTP) {
                    return this.f22692a.f22373m.a(route, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (i7 == 408) {
                if (!this.f22692a.f22368e) {
                    return null;
                }
                RequestBody requestBody2 = request.f22427d;
                if (requestBody2 != null && requestBody2.c()) {
                    return null;
                }
                Response response3 = response.f22448x;
                if ((response3 == null || response3.f22442d != 408) && c(response, 0) <= 0) {
                    return response.f22439a;
                }
                return null;
            }
            switch (i7) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        OkHttpClient okHttpClient = this.f22692a;
        if (!okHttpClient.f22370h) {
            return null;
        }
        String b10 = response.f22444f.b("Location");
        if (b10 == null) {
            b10 = null;
        }
        if (b10 == null) {
            return null;
        }
        Request request2 = response.f22439a;
        HttpUrl httpUrl = request2.f22424a;
        httpUrl.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.c(httpUrl, b10);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        HttpUrl b11 = builder != null ? builder.b() : null;
        if (b11 == null) {
            return null;
        }
        if (!l.a(b11.f22335a, request2.f22424a.f22335a) && !okHttpClient.f22371i) {
            return null;
        }
        Request.Builder a9 = request2.a();
        if (HttpMethod.a(str)) {
            HttpMethod.f22679a.getClass();
            boolean equals = str.equals("PROPFIND");
            int i10 = response.f22442d;
            boolean z8 = equals || i10 == 308 || i10 == 307;
            if (str.equals("PROPFIND") || i10 == 308 || i10 == 307) {
                a9.c(str, z8 ? request2.f22427d : null);
            } else {
                a9.c("GET", null);
            }
            if (!z8) {
                a9.f22432c.b("Transfer-Encoding");
                a9.f22432c.b("Content-Length");
                a9.f22432c.b("Content-Type");
            }
        }
        if (!_UtilJvmKt.a(request2.f22424a, b11)) {
            a9.f22432c.b("Authorization");
        }
        a9.f22430a = b11;
        return new Request(a9);
    }

    public final boolean b(IOException iOException, RealCall realCall, Request request) {
        Exchange exchange;
        RequestBody requestBody;
        boolean z8 = iOException instanceof ConnectionShutdownException;
        if (!this.f22692a.f22368e) {
            return false;
        }
        if ((z8 || (((requestBody = request.f22427d) == null || !requestBody.c()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && z8) && (exchange = realCall.f22593C) != null && exchange.f22569e) {
            ExchangeFinder exchangeFinder = realCall.f22602v;
            l.b(exchangeFinder);
            RoutePlanner b2 = exchangeFinder.b();
            Exchange exchange2 = realCall.f22593C;
            if (b2.d(exchange2 != null ? exchange2.b() : null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        r0 = r3.a(r1).l();
        r0.f22451a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        if (r38 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        r0.j = r1;
        r9 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        r5 = a(r9, r4.f22604x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        if (r5 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        r0 = r5.f22427d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        if (r0.c() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
    
        r4.f22598d.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r4.f(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        okhttp3.internal._UtilCommonKt.a(r9.f22445u);
        r10 = r25 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        if (r10 > 20) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        r4.f22598d.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014f, code lost:
    
        r4.f22598d.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        r4.f22598d.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        r4.f(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ed, code lost:
    
        r1 = okhttp3.internal.UnreadableResponseBodyKt.a(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f3, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0133, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        throw new java.io.IOException("Canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        r0 = th;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        Request request;
        List list;
        Response response;
        int i7;
        boolean z8;
        SSLSocketFactory sSLSocketFactory;
        OkHostnameVerifier okHostnameVerifier;
        CertificatePinner certificatePinner;
        RetryAndFollowUpInterceptor retryAndFollowUpInterceptor = this;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request2 = realInterceptorChain.f22684e;
        RealCall realCall = realInterceptorChain.f22680a;
        List list2 = v.f3891a;
        Response response2 = null;
        int i10 = 0;
        Request request3 = request2;
        loop0: while (true) {
            boolean z10 = true;
            while (true) {
                realCall.getClass();
                l.e(request3, "request");
                if (realCall.f22604x != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (realCall) {
                    try {
                        try {
                            if (realCall.f22606z) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (realCall.f22605y) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (z10) {
                                OkHttpClient okHttpClient = realCall.f22595a;
                                TaskRunner taskRunner = okHttpClient.f22362C;
                                RealConnectionPool realConnectionPool = realCall.f22597c;
                                int i11 = okHttpClient.f22384x;
                                int i12 = okHttpClient.f22385y;
                                int i13 = realInterceptorChain.f22685f;
                                int i14 = realInterceptorChain.g;
                                boolean z11 = okHttpClient.f22368e;
                                boolean z12 = okHttpClient.f22369f;
                                HttpUrl url = request3.f22424a;
                                list = list2;
                                l.e(url, "url");
                                i7 = i10;
                                if (l.a(url.f22335a, "https")) {
                                    SSLSocketFactory sSLSocketFactory2 = okHttpClient.f22375o;
                                    if (sSLSocketFactory2 == null) {
                                        throw new IllegalStateException("CLEARTEXT-only client");
                                    }
                                    OkHostnameVerifier okHostnameVerifier2 = okHttpClient.f22379s;
                                    certificatePinner = okHttpClient.f22380t;
                                    okHostnameVerifier = okHostnameVerifier2;
                                    sSLSocketFactory = sSLSocketFactory2;
                                } else {
                                    sSLSocketFactory = null;
                                    okHostnameVerifier = null;
                                    certificatePinner = null;
                                }
                                response = response2;
                                request = request3;
                                RealRoutePlanner realRoutePlanner = new RealRoutePlanner(taskRunner, realConnectionPool, i11, i12, i13, i14, 0, z11, z12, new Address(url.f22338d, url.f22339e, okHttpClient.k, okHttpClient.f22374n, sSLSocketFactory, okHostnameVerifier, certificatePinner, okHttpClient.f22373m, okHttpClient.f22378r, okHttpClient.f22377q, okHttpClient.f22372l), realCall.f22595a.f22361B, new CallConnectionUser(realCall, realCall.f22597c.f22634b, realInterceptorChain));
                                OkHttpClient okHttpClient2 = realCall.f22595a;
                                realCall.f22602v = okHttpClient2.f22369f ? new FastFallbackExchangeFinder(realRoutePlanner, okHttpClient2.f22362C) : new SequentialExchangeFinder(realRoutePlanner);
                            } else {
                                request = request3;
                                list = list2;
                                response = response2;
                                i7 = i10;
                            }
                            try {
                                if (realCall.f22592B) {
                                    break loop0;
                                }
                                Request request4 = request;
                                try {
                                    break;
                                } catch (IOException e2) {
                                    boolean b2 = b(e2, realCall, request4);
                                    realCall.f22598d.getClass();
                                    if (!b2) {
                                        byte[] bArr = _UtilCommonKt.f22495a;
                                        List suppressed = list;
                                        l.e(suppressed, "suppressed");
                                        Iterator it = suppressed.iterator();
                                        while (it.hasNext()) {
                                            AbstractC0672a.c(e2, (Exception) it.next());
                                        }
                                        throw e2;
                                    }
                                    list2 = o.h0(list, e2);
                                    realCall.f(true);
                                    request3 = request4;
                                    retryAndFollowUpInterceptor = this;
                                    z10 = false;
                                    i10 = i7;
                                    response2 = response;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            realCall.f(z8);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            realCall.f(true);
            retryAndFollowUpInterceptor = this;
            list2 = list;
        }
    }
}
