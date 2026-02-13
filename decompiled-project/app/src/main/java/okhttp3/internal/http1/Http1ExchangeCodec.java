package okhttp3.internal.http1;

import A3.c;
import ac.g;
import ac.n;
import c2.q;
import com.google.android.gms.common.api.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import rc.B;
import rc.C;
import rc.C1964h;
import rc.G;
import rc.H;
import rc.J;
import rc.r;

/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers g;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f22699a;

    /* renamed from: b, reason: collision with root package name */
    public final ExchangeCodec.Carrier f22700b;

    /* renamed from: c, reason: collision with root package name */
    public final C f22701c;

    /* renamed from: d, reason: collision with root package name */
    public final B f22702d;

    /* renamed from: e, reason: collision with root package name */
    public int f22703e;

    /* renamed from: f, reason: collision with root package name */
    public final HeadersReader f22704f;

    /* loaded from: classes2.dex */
    public abstract class AbstractSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final HttpUrl f22705a;

        /* renamed from: b, reason: collision with root package name */
        public final r f22706b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22707c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f22708d;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            l.e(url, "url");
            this.f22708d = http1ExchangeCodec;
            this.f22705a = url;
            this.f22706b = new r(http1ExchangeCodec.f22701c.f23928a.e());
        }

        @Override // rc.H
        public long O(long j, C1964h sink) {
            Http1ExchangeCodec http1ExchangeCodec = this.f22708d;
            l.e(sink, "sink");
            try {
                return http1ExchangeCodec.f22701c.O(j, sink);
            } catch (IOException e2) {
                http1ExchangeCodec.f22700b.h();
                l(Http1ExchangeCodec.g);
                throw e2;
            }
        }

        @Override // rc.H
        public final J e() {
            return this.f22706b;
        }

        public final void l(Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            l.e(trailers, "trailers");
            Http1ExchangeCodec http1ExchangeCodec = this.f22708d;
            int i7 = http1ExchangeCodec.f22703e;
            if (i7 == 6) {
                return;
            }
            if (i7 != 5) {
                throw new IllegalStateException("state: " + http1ExchangeCodec.f22703e);
            }
            r rVar = this.f22706b;
            J j = rVar.f23984e;
            rVar.f23984e = J.f23942d;
            j.a();
            j.b();
            http1ExchangeCodec.f22703e = 6;
            if (trailers.size() <= 0 || (okHttpClient = http1ExchangeCodec.f22699a) == null || (cookieJar = okHttpClient.j) == null) {
                return;
            }
            HttpHeaders.d(cookieJar, this.f22705a, trailers);
        }
    }

    /* loaded from: classes2.dex */
    public final class ChunkedSink implements G {

        /* renamed from: a, reason: collision with root package name */
        public final r f22709a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22710b;

        public ChunkedSink() {
            this.f22709a = new r(Http1ExchangeCodec.this.f22702d.f23925a.e());
        }

        @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f22710b) {
                return;
            }
            this.f22710b = true;
            Http1ExchangeCodec.this.f22702d.L("0\r\n\r\n");
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            r rVar = this.f22709a;
            http1ExchangeCodec.getClass();
            J j = rVar.f23984e;
            rVar.f23984e = J.f23942d;
            j.a();
            j.b();
            Http1ExchangeCodec.this.f22703e = 3;
        }

        @Override // rc.G
        public final J e() {
            return this.f22709a;
        }

        @Override // rc.G, java.io.Flushable
        public final synchronized void flush() {
            if (this.f22710b) {
                return;
            }
            Http1ExchangeCodec.this.f22702d.flush();
        }

        @Override // rc.G
        public final void m(long j, C1964h c1964h) {
            if (this.f22710b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            B b2 = http1ExchangeCodec.f22702d;
            if (b2.f23927c) {
                throw new IllegalStateException("closed");
            }
            b2.f23926b.n0(j);
            b2.l();
            B b10 = http1ExchangeCodec.f22702d;
            b10.L("\r\n");
            b10.m(j, c1964h);
            b10.L("\r\n");
        }
    }

    /* loaded from: classes2.dex */
    public final class ChunkedSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public long f22712e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22713f;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f22714u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            l.e(url, "url");
            this.f22714u = http1ExchangeCodec;
            this.f22712e = -1L;
            this.f22713f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
        
            if (r12 == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0075, code lost:
        
            com.bumptech.glide.c.g(16);
            r2 = java.lang.Integer.toString(r7, 16);
            kotlin.jvm.internal.l.d(r2, "toString(...)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x008e, code lost:
        
            throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, rc.H
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long O(long j, C1964h sink) {
            C1964h c1964h;
            long j10;
            l.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(c.h("byteCount < 0: ", j).toString());
            }
            if (this.f22707c) {
                throw new IllegalStateException("closed");
            }
            if (!this.f22713f) {
                return -1L;
            }
            long j11 = this.f22712e;
            Http1ExchangeCodec http1ExchangeCodec = this.f22714u;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    http1ExchangeCodec.f22701c.Y(Long.MAX_VALUE);
                }
                try {
                    C c10 = http1ExchangeCodec.f22701c;
                    c10.Z(1L);
                    int i7 = 0;
                    while (true) {
                        int i10 = i7 + 1;
                        boolean d10 = c10.d(i10);
                        c1964h = c10.f23929b;
                        if (!d10) {
                            break;
                        }
                        byte P10 = c1964h.P(i7);
                        if ((P10 < 48 || P10 > 57) && ((P10 < 97 || P10 > 102) && (P10 < 65 || P10 > 70))) {
                            break;
                        }
                        i7 = i10;
                    }
                    this.f22712e = c1964h.Y();
                    String obj = g.v0(http1ExchangeCodec.f22701c.Y(Long.MAX_VALUE)).toString();
                    if (this.f22712e < 0 || (obj.length() > 0 && !n.Y(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f22712e + obj + '\"');
                    }
                    if (this.f22712e == 0) {
                        this.f22713f = false;
                        HeadersReader headersReader = http1ExchangeCodec.f22704f;
                        headersReader.getClass();
                        Headers.Builder builder = new Headers.Builder();
                        while (true) {
                            String Y2 = headersReader.f22697a.Y(headersReader.f22698b);
                            headersReader.f22698b -= Y2.length();
                            if (Y2.length() == 0) {
                                break;
                            }
                            int e02 = g.e0(Y2, ':', 1, 4);
                            if (e02 != -1) {
                                String substring = Y2.substring(0, e02);
                                l.d(substring, "substring(...)");
                                String substring2 = Y2.substring(e02 + 1);
                                l.d(substring2, "substring(...)");
                                _HeadersCommonKt.a(builder, substring, substring2);
                            } else if (Y2.charAt(0) == ':') {
                                String substring3 = Y2.substring(1);
                                l.d(substring3, "substring(...)");
                                _HeadersCommonKt.a(builder, "", substring3);
                            } else {
                                _HeadersCommonKt.a(builder, "", Y2);
                            }
                        }
                        l(builder.a());
                    }
                    if (!this.f22713f) {
                        return -1L;
                    }
                    j10 = -1;
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            } else {
                j10 = -1;
            }
            long O10 = super.O(Math.min(j, this.f22712e), sink);
            if (O10 != j10) {
                this.f22712e -= O10;
                return O10;
            }
            http1ExchangeCodec.f22700b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            l(Http1ExchangeCodec.g);
            throw protocolException;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22707c) {
                return;
            }
            if (this.f22713f && !_UtilJvmKt.d(this, TimeUnit.MILLISECONDS)) {
                this.f22714u.f22700b.h();
                l(Http1ExchangeCodec.g);
            }
            this.f22707c = true;
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

    /* loaded from: classes2.dex */
    public final class FixedLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public long f22715e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f22716f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url, long j) {
            super(http1ExchangeCodec, url);
            l.e(url, "url");
            this.f22716f = http1ExchangeCodec;
            this.f22715e = j;
            if (j == 0) {
                l(Headers.f22332c);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, rc.H
        public final long O(long j, C1964h sink) {
            l.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(c.h("byteCount < 0: ", j).toString());
            }
            if (this.f22707c) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f22715e;
            if (j10 == 0) {
                return -1L;
            }
            long O10 = super.O(Math.min(j10, j), sink);
            if (O10 == -1) {
                this.f22716f.f22700b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                l(Http1ExchangeCodec.g);
                throw protocolException;
            }
            long j11 = this.f22715e - O10;
            this.f22715e = j11;
            if (j11 == 0) {
                l(Headers.f22332c);
            }
            return O10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22707c) {
                return;
            }
            if (this.f22715e != 0 && !_UtilJvmKt.d(this, TimeUnit.MILLISECONDS)) {
                this.f22716f.f22700b.h();
                l(Http1ExchangeCodec.g);
            }
            this.f22707c = true;
        }
    }

    /* loaded from: classes2.dex */
    public final class KnownLengthSink implements G {

        /* renamed from: a, reason: collision with root package name */
        public final r f22717a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22718b;

        public KnownLengthSink() {
            this.f22717a = new r(Http1ExchangeCodec.this.f22702d.f23925a.e());
        }

        @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22718b) {
                return;
            }
            this.f22718b = true;
            Headers headers = Http1ExchangeCodec.g;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            http1ExchangeCodec.getClass();
            r rVar = this.f22717a;
            J j = rVar.f23984e;
            rVar.f23984e = J.f23942d;
            j.a();
            j.b();
            http1ExchangeCodec.f22703e = 3;
        }

        @Override // rc.G
        public final J e() {
            return this.f22717a;
        }

        @Override // rc.G, java.io.Flushable
        public final void flush() {
            if (this.f22718b) {
                return;
            }
            Http1ExchangeCodec.this.f22702d.flush();
        }

        @Override // rc.G
        public final void m(long j, C1964h c1964h) {
            if (this.f22718b) {
                throw new IllegalStateException("closed");
            }
            long j10 = c1964h.f23966b;
            byte[] bArr = _UtilCommonKt.f22495a;
            if (j >= 0 && 0 <= j10 && j10 >= j) {
                Http1ExchangeCodec.this.f22702d.m(j, c1964h);
                return;
            }
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=0, count=0");
        }
    }

    /* loaded from: classes2.dex */
    public final class UnknownLengthSource extends AbstractSource {

        /* renamed from: e, reason: collision with root package name */
        public boolean f22720e;

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, rc.H
        public final long O(long j, C1964h sink) {
            l.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(c.h("byteCount < 0: ", j).toString());
            }
            if (this.f22707c) {
                throw new IllegalStateException("closed");
            }
            if (this.f22720e) {
                return -1L;
            }
            long O10 = super.O(j, sink);
            if (O10 != -1) {
                return O10;
            }
            this.f22720e = true;
            l(Headers.f22332c);
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22707c) {
                return;
            }
            if (!this.f22720e) {
                l(Http1ExchangeCodec.g);
            }
            this.f22707c = true;
        }
    }

    static {
        int i7 = 0;
        new Companion(i7);
        Headers.f22331b.getClass();
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        l.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (strArr[i10] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i10] = g.v0(inputNamesAndValues[i10]).toString();
        }
        int l10 = q.l(0, strArr.length - 1, 2);
        if (l10 >= 0) {
            while (true) {
                String str = strArr[i7];
                String str2 = strArr[i7 + 1];
                _HeadersCommonKt.b(str);
                _HeadersCommonKt.c(str2, str);
                if (i7 == l10) {
                    break;
                } else {
                    i7 += 2;
                }
            }
        }
        g = new Headers(strArr);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, C source, B sink) {
        l.e(source, "source");
        l.e(sink, "sink");
        this.f22699a = okHttpClient;
        this.f22700b = carrier;
        this.f22701c = source;
        this.f22702d = sink;
        this.f22704f = new HeadersReader(source);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.f22702d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        l.e(request, "request");
        RequestLine requestLine = RequestLine.f22691a;
        Proxy.Type type = this.f22700b.f().f22471b.type();
        l.d(type, "type(...)");
        requestLine.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f22425b);
        sb2.append(' ');
        HttpUrl httpUrl = request.f22424a;
        if (l.a(httpUrl.f22335a, "https") || type != Proxy.Type.HTTP) {
            sb2.append(RequestLine.a(httpUrl));
        } else {
            sb2.append(httpUrl);
        }
        sb2.append(" HTTP/1.1");
        l(request.f22426c, sb2.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        return this.f22703e == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f22700b.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d() {
        this.f22702d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long e(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        String b2 = response.f22444f.b("Transfer-Encoding");
        if (b2 == null) {
            b2 = null;
        }
        if ("chunked".equalsIgnoreCase(b2)) {
            return -1L;
        }
        return _UtilJvmKt.f(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final H f(Response response) {
        H abstractSource;
        boolean a9 = HttpHeaders.a(response);
        Request request = response.f22439a;
        if (!a9) {
            return j(request.f22424a, 0L);
        }
        String b2 = response.f22444f.b("Transfer-Encoding");
        if (b2 == null) {
            b2 = null;
        }
        if ("chunked".equalsIgnoreCase(b2)) {
            HttpUrl httpUrl = request.f22424a;
            if (this.f22703e != 4) {
                throw new IllegalStateException(("state: " + this.f22703e).toString());
            }
            this.f22703e = 5;
            abstractSource = new ChunkedSource(this, httpUrl);
        } else {
            long f4 = _UtilJvmKt.f(response);
            if (f4 != -1) {
                return j(request.f22424a, f4);
            }
            HttpUrl url = request.f22424a;
            if (this.f22703e != 4) {
                throw new IllegalStateException(("state: " + this.f22703e).toString());
            }
            this.f22703e = 5;
            this.f22700b.h();
            l.e(url, "url");
            abstractSource = new AbstractSource(this, url);
        }
        return abstractSource;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier g() {
        return this.f22700b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final G h(Request request, long j) {
        l.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f22426c.b("Transfer-Encoding"))) {
            if (this.f22703e == 1) {
                this.f22703e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException(("state: " + this.f22703e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f22703e == 1) {
            this.f22703e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f22703e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder i(boolean z8) {
        HeadersReader headersReader = this.f22704f;
        int i7 = this.f22703e;
        if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f22703e).toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f22693d;
            String Y2 = headersReader.f22697a.Y(headersReader.f22698b);
            headersReader.f22698b -= Y2.length();
            companion.getClass();
            StatusLine a9 = StatusLine.Companion.a(Y2);
            int i10 = a9.f22695b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = a9.f22694a;
            l.e(protocol, "protocol");
            builder.f22452b = protocol;
            builder.f22453c = i10;
            String message = a9.f22696c;
            l.e(message, "message");
            builder.f22454d = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String Y10 = headersReader.f22697a.Y(headersReader.f22698b);
                headersReader.f22698b -= Y10.length();
                if (Y10.length() == 0) {
                    break;
                }
                int e02 = g.e0(Y10, ':', 1, 4);
                if (e02 != -1) {
                    String substring = Y10.substring(0, e02);
                    l.d(substring, "substring(...)");
                    String substring2 = Y10.substring(e02 + 1);
                    l.d(substring2, "substring(...)");
                    _HeadersCommonKt.a(builder2, substring, substring2);
                } else if (Y10.charAt(0) == ':') {
                    String substring3 = Y10.substring(1);
                    l.d(substring3, "substring(...)");
                    _HeadersCommonKt.a(builder2, "", substring3);
                } else {
                    _HeadersCommonKt.a(builder2, "", Y10);
                }
            }
            builder.f22456f = builder2.a().t();
            if (z8 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f22703e = 3;
                return builder;
            }
            if (102 > i10 || i10 >= 200) {
                this.f22703e = 4;
                return builder;
            }
            this.f22703e = 3;
            return builder;
        } catch (EOFException e2) {
            throw new IOException(X.c.t("unexpected end of stream on ", this.f22700b.f().f22470a.f22245h.g()), e2);
        }
    }

    public final H j(HttpUrl httpUrl, long j) {
        if (this.f22703e == 4) {
            this.f22703e = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        throw new IllegalStateException(("state: " + this.f22703e).toString());
    }

    public final void k(Response response) {
        long f4 = _UtilJvmKt.f(response);
        if (f4 == -1) {
            return;
        }
        H j = j(response.f22439a.f22424a, f4);
        _UtilJvmKt.h(j, f.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        ((FixedLengthSource) j).close();
    }

    public final void l(Headers headers, String requestLine) {
        l.e(headers, "headers");
        l.e(requestLine, "requestLine");
        if (this.f22703e != 0) {
            throw new IllegalStateException(("state: " + this.f22703e).toString());
        }
        B b2 = this.f22702d;
        b2.L(requestLine);
        b2.L("\r\n");
        int size = headers.size();
        for (int i7 = 0; i7 < size; i7++) {
            b2.L(headers.o(i7));
            b2.L(": ");
            b2.L(headers.y(i7));
            b2.L("\r\n");
        }
        b2.L("\r\n");
        this.f22703e = 1;
    }
}
