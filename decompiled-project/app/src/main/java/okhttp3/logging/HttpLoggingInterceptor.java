package okhttp3.logging;

import A3.c;
import Eb.x;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.internal.IsProbablyUtf8Kt;
import rc.C1964h;
import rc.InterfaceC1966j;
import rc.t;
import tc.b;

/* loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f22950a;

    /* renamed from: b, reason: collision with root package name */
    public volatile x f22951b;

    /* renamed from: c, reason: collision with root package name */
    public volatile x f22952c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Level f22953d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Level {

        /* renamed from: a, reason: collision with root package name */
        public static final Level f22954a;

        /* renamed from: b, reason: collision with root package name */
        public static final Level f22955b;

        /* renamed from: c, reason: collision with root package name */
        public static final Level f22956c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Level[] f22957d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, okhttp3.logging.HttpLoggingInterceptor$Level] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, okhttp3.logging.HttpLoggingInterceptor$Level] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, okhttp3.logging.HttpLoggingInterceptor$Level] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, okhttp3.logging.HttpLoggingInterceptor$Level] */
        static {
            ?? r02 = new Enum("NONE", 0);
            f22954a = r02;
            ?? r12 = new Enum("BASIC", 1);
            ?? r22 = new Enum("HEADERS", 2);
            f22955b = r22;
            ?? r32 = new Enum("BODY", 3);
            f22956c = r32;
            Level[] levelArr = {r02, r12, r22, r32};
            f22957d = levelArr;
            Z9.x.k(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f22957d.clone();
        }
    }

    /* loaded from: classes2.dex */
    public interface Logger {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f22958a;

        /* loaded from: classes2.dex */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f22959a = 0;

            /* loaded from: classes2.dex */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String message) {
                    l.e(message, "message");
                    Platform.f22897a.getClass();
                    Platform.f22898b.h(4, message, null);
                }
            }

            static {
                new Companion();
            }

            private Companion() {
            }
        }

        static {
            int i7 = Companion.f22959a;
            f22958a = new Companion.DefaultLogger();
        }

        void a(String str);
    }

    static {
        new Companion(0);
    }

    public HttpLoggingInterceptor() {
        this(0);
    }

    public HttpLoggingInterceptor(int i7) {
        Logger logger = Logger.f22958a;
        l.e(logger, "logger");
        this.f22950a = logger;
        x xVar = x.f3893a;
        this.f22951b = xVar;
        this.f22952c = xVar;
        this.f22953d = Level.f22954a;
    }

    public final void a(Headers headers, int i7) {
        this.f22951b.contains(headers.o(i7));
        String y10 = headers.y(i7);
        this.f22950a.a(headers.o(i7) + ": " + y10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, rc.h] */
    /* JADX WARN: Type inference failed for: r7v16, types: [rc.j, rc.i, java.lang.Object, rc.h] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, rc.h] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l10;
        C1964h c1964h;
        Long l11;
        C1964h c1964h2;
        Level level = this.f22953d;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f22684e;
        if (level == Level.f22954a) {
            return realInterceptorChain.a(request);
        }
        boolean z10 = true;
        boolean z11 = level == Level.f22956c;
        if (!z11 && level != Level.f22955b) {
            z10 = false;
        }
        RequestBody requestBody = request.f22427d;
        Exchange exchange = realInterceptorChain.f22683d;
        RealConnection b2 = exchange != null ? exchange.b() : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.f22425b);
        sb2.append(' ');
        HttpUrl url = request.f22424a;
        l.e(url, "url");
        this.f22952c.getClass();
        sb2.append(url.f22342i);
        sb2.append(b2 != null ? " " + b2.f22627v : "");
        String sb3 = sb2.toString();
        if (!z10 && requestBody != 0) {
            StringBuilder n6 = c.n(sb3, " (");
            n6.append(requestBody.a());
            n6.append("-byte body)");
            sb3 = n6.toString();
        }
        this.f22950a.a(sb3);
        if (z10) {
            Headers headers = request.f22426c;
            if (requestBody != 0) {
                MediaType b10 = requestBody.b();
                z8 = z10;
                if (b10 == null || headers.b("Content-Type") != null) {
                    str = " ";
                    str2 = "url";
                } else {
                    str2 = "url";
                    str = " ";
                    this.f22950a.a("Content-Type: " + b10);
                }
                if (requestBody.a() != -1 && headers.b("Content-Length") == null) {
                    this.f22950a.a("Content-Length: " + requestBody.a());
                }
            } else {
                z8 = z10;
                str = " ";
                str2 = "url";
            }
            int size = headers.size();
            for (int i7 = 0; i7 < size; i7++) {
                a(headers, i7);
            }
            if (!z11 || requestBody == 0) {
                this.f22950a.a("--> END " + request.f22425b);
            } else {
                String b11 = request.f22426c.b("Content-Encoding");
                if (b11 != null && !b11.equalsIgnoreCase("identity") && !b11.equalsIgnoreCase("gzip")) {
                    this.f22950a.a("--> END " + request.f22425b + " (encoded body omitted)");
                } else if (requestBody.c()) {
                    this.f22950a.a("--> END " + request.f22425b + " (one-shot body omitted)");
                } else {
                    ?? obj = new Object();
                    requestBody.d(obj);
                    if ("gzip".equalsIgnoreCase(headers.b("Content-Encoding"))) {
                        l11 = Long.valueOf(obj.f23966b);
                        t tVar = new t(obj);
                        try {
                            ?? obj2 = new Object();
                            obj2.k0(tVar);
                            b.o(tVar, null);
                            c1964h2 = obj2;
                        } finally {
                        }
                    } else {
                        l11 = null;
                        c1964h2 = obj;
                    }
                    Charset a9 = Internal.a(requestBody.b());
                    this.f22950a.a("");
                    if (!IsProbablyUtf8Kt.a(c1964h2)) {
                        this.f22950a.a("--> END " + request.f22425b + " (binary " + requestBody.a() + "-byte body omitted)");
                    } else if (l11 != null) {
                        this.f22950a.a("--> END " + request.f22425b + " (" + c1964h2.f23966b + "-byte, " + l11 + "-gzipped-byte body)");
                    } else {
                        this.f22950a.a(c1964h2.Q(a9));
                        this.f22950a.a("--> END " + request.f22425b + " (" + requestBody.a() + "-byte body)");
                    }
                }
            }
        } else {
            z8 = z10;
            str = " ";
            str2 = "url";
        }
        long nanoTime = System.nanoTime();
        try {
            Response a10 = ((RealInterceptorChain) chain).a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody responseBody = a10.f22445u;
            l.b(responseBody);
            long l12 = responseBody.l();
            if (l12 != -1) {
                str3 = "";
                str4 = l12 + "-byte";
            } else {
                str3 = "";
                str4 = "unknown-length";
            }
            Logger logger = this.f22950a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- " + a10.f22442d);
            if (a10.f22441c.length() > 0) {
                str5 = str;
                sb4.append(str5 + a10.f22441c);
            } else {
                str5 = str;
            }
            StringBuilder sb5 = new StringBuilder(str5);
            HttpUrl httpUrl = a10.f22439a.f22424a;
            l.e(httpUrl, str2);
            this.f22952c.getClass();
            sb5.append(httpUrl.f22342i);
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            sb4.append(sb5.toString());
            if (!z8) {
                sb4.append(", " + str4 + " body");
            }
            sb4.append(")");
            logger.a(sb4.toString());
            if (z8) {
                Headers headers2 = a10.f22444f;
                int size2 = headers2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    a(headers2, i10);
                }
                if (z11 && HttpHeaders.a(a10)) {
                    String b12 = a10.f22444f.b("Content-Encoding");
                    if (b12 == null || b12.equalsIgnoreCase("identity") || b12.equalsIgnoreCase("gzip")) {
                        MediaType n8 = a10.f22445u.n();
                        if (n8 != null && n8.f22353b.equals("text") && n8.f22354c.equals("event-stream")) {
                            this.f22950a.a("<-- END HTTP (streaming)");
                        } else {
                            InterfaceC1966j F10 = responseBody.F();
                            F10.d(Long.MAX_VALUE);
                            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                            C1964h c10 = F10.c();
                            if ("gzip".equalsIgnoreCase(headers2.b("Content-Encoding"))) {
                                l10 = Long.valueOf(c10.f23966b);
                                t tVar2 = new t(c10.clone());
                                try {
                                    ?? obj3 = new Object();
                                    obj3.k0(tVar2);
                                    b.o(tVar2, null);
                                    c1964h = obj3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                l10 = null;
                                c1964h = c10;
                            }
                            Charset a11 = Internal.a(responseBody.n());
                            if (!IsProbablyUtf8Kt.a(c1964h)) {
                                this.f22950a.a(str3);
                                Logger logger2 = this.f22950a;
                                StringBuilder l13 = X.c.l(millis2, "<-- END HTTP (", "ms, binary ");
                                l13.append(c1964h.f23966b);
                                l13.append("-byte body omitted)");
                                logger2.a(l13.toString());
                                return a10;
                            }
                            String str6 = str3;
                            if (l12 != 0) {
                                this.f22950a.a(str6);
                                this.f22950a.a(c1964h.clone().Q(a11));
                            }
                            Logger logger3 = this.f22950a;
                            StringBuilder sb6 = new StringBuilder();
                            StringBuilder l14 = X.c.l(millis2, "<-- END HTTP (", "ms, ");
                            l14.append(c1964h.f23966b);
                            l14.append("-byte");
                            sb6.append(l14.toString());
                            if (l10 != null) {
                                sb6.append(", " + l10 + "-gzipped-byte");
                            }
                            sb6.append(" body)");
                            logger3.a(sb6.toString());
                        }
                    } else {
                        this.f22950a.a("<-- END HTTP (encoded body omitted)");
                    }
                } else {
                    this.f22950a.a("<-- END HTTP");
                }
            }
            return a10;
        } catch (Exception e2) {
            this.f22950a.a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
