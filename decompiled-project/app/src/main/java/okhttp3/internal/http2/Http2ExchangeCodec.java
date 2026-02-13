package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;
import rc.C1967k;
import rc.G;
import rc.H;

/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final Companion g = new Companion(0);

    /* renamed from: h, reason: collision with root package name */
    public static final List f22798h = _UtilJvmKt.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: i, reason: collision with root package name */
    public static final List f22799i = _UtilJvmKt.l(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f22800a;

    /* renamed from: b, reason: collision with root package name */
    public final RealInterceptorChain f22801b;

    /* renamed from: c, reason: collision with root package name */
    public final Http2Connection f22802c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Http2Stream f22803d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f22804e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f22805f;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        l.e(client, "client");
        l.e(http2Connection, "http2Connection");
        this.f22800a = realConnection;
        this.f22801b = realInterceptorChain;
        this.f22802c = http2Connection;
        Protocol protocol = Protocol.f22419u;
        this.f22804e = client.f22378r.contains(protocol) ? protocol : Protocol.f22418f;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        Http2Stream http2Stream = this.f22803d;
        l.b(http2Stream);
        http2Stream.f22827w.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        int i7;
        Http2Stream http2Stream;
        l.e(request, "request");
        if (this.f22803d != null) {
            return;
        }
        boolean z8 = true;
        boolean z10 = request.f22427d != null;
        g.getClass();
        Headers headers = request.f22426c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f22733f, request.f22425b));
        C1967k c1967k = Header.g;
        RequestLine requestLine = RequestLine.f22691a;
        HttpUrl httpUrl = request.f22424a;
        requestLine.getClass();
        arrayList.add(new Header(c1967k, RequestLine.a(httpUrl)));
        String b2 = request.f22426c.b("Host");
        if (b2 != null) {
            arrayList.add(new Header(Header.f22735i, b2));
        }
        arrayList.add(new Header(Header.f22734h, httpUrl.f22335a));
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String o10 = headers.o(i10);
            Locale US = Locale.US;
            l.d(US, "US");
            String lowerCase = o10.toLowerCase(US);
            l.d(lowerCase, "toLowerCase(...)");
            if (!f22798h.contains(lowerCase) || (lowerCase.equals("te") && headers.y(i10).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, headers.y(i10)));
            }
        }
        Http2Connection http2Connection = this.f22802c;
        http2Connection.getClass();
        boolean z11 = !z10;
        synchronized (http2Connection.L) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.f22779e > 1073741823) {
                        http2Connection.K(ErrorCode.f22726u);
                    }
                    if (http2Connection.f22780f) {
                        throw new ConnectionShutdownException();
                    }
                    i7 = http2Connection.f22779e;
                    http2Connection.f22779e = i7 + 2;
                    http2Stream = new Http2Stream(i7, http2Connection, z11, false, null);
                    if (z10 && http2Connection.f22770I < http2Connection.f22771J && http2Stream.f22822d < http2Stream.f22823e) {
                        z8 = false;
                    }
                    if (http2Stream.h()) {
                        http2Connection.f22776b.put(Integer.valueOf(i7), http2Stream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.L.P(z11, i7, arrayList);
        }
        if (z8) {
            http2Connection.L.flush();
        }
        this.f22803d = http2Stream;
        if (this.f22805f) {
            Http2Stream http2Stream2 = this.f22803d;
            l.b(http2Stream2);
            http2Stream2.e(ErrorCode.f22727v);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f22803d;
        l.b(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.f22828x;
        long j = this.f22801b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j, timeUnit);
        Http2Stream http2Stream4 = this.f22803d;
        l.b(http2Stream4);
        http2Stream4.f22829y.g(this.f22801b.f22686h, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        boolean z8;
        Http2Stream http2Stream = this.f22803d;
        if (http2Stream == null) {
            return false;
        }
        synchronized (http2Stream) {
            Http2Stream.FramingSource framingSource = http2Stream.f22826v;
            if (framingSource.f22836b) {
                if (framingSource.f22838d.K()) {
                    z8 = true;
                }
            }
            z8 = false;
        }
        return z8;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f22805f = true;
        Http2Stream http2Stream = this.f22803d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.f22727v);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void d() {
        this.f22802c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long e(Response response) {
        if (HttpHeaders.a(response)) {
            return _UtilJvmKt.f(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final H f(Response response) {
        Http2Stream http2Stream = this.f22803d;
        l.b(http2Stream);
        return http2Stream.f22826v;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier g() {
        return this.f22800a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final G h(Request request, long j) {
        l.e(request, "request");
        Http2Stream http2Stream = this.f22803d;
        l.b(http2Stream);
        return http2Stream.f22827w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response.Builder i(boolean z8) {
        int i7;
        Headers headers;
        boolean z10;
        Http2Stream http2Stream = this.f22803d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (http2Stream) {
            while (true) {
                i7 = 0;
                if (!http2Stream.f22824f.isEmpty() || http2Stream.f() != null) {
                    break;
                }
                if (!z8) {
                    http2Stream.f22820b.getClass();
                    Http2Stream.FramingSink framingSink = http2Stream.f22827w;
                    if (!framingSink.f22833c && !framingSink.f22831a) {
                        z10 = false;
                    }
                    z10 = true;
                }
                i7 = 1;
                if (i7 != 0) {
                    http2Stream.f22828x.h();
                }
                try {
                    http2Stream.j();
                    if (i7 != 0) {
                        http2Stream.f22828x.k();
                    }
                } catch (Throwable th) {
                    if (i7 != 0) {
                        http2Stream.f22828x.k();
                    }
                    throw th;
                }
            }
            if (http2Stream.f22824f.isEmpty()) {
                IOException iOException = http2Stream.f22818A;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode f4 = http2Stream.f();
                l.b(f4);
                throw new StreamResetException(f4);
            }
            Object removeFirst = http2Stream.f22824f.removeFirst();
            l.d(removeFirst, "removeFirst(...)");
            headers = (Headers) removeFirst;
        }
        Companion companion = g;
        Protocol protocol = this.f22804e;
        companion.getClass();
        l.e(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        while (i7 < size) {
            String o10 = headers.o(i7);
            String y10 = headers.y(i7);
            if (o10.equals(":status")) {
                StatusLine.Companion companion2 = StatusLine.f22693d;
                String concat = "HTTP/1.1 ".concat(y10);
                companion2.getClass();
                statusLine = StatusLine.Companion.a(concat);
            } else if (!f22799i.contains(o10)) {
                _HeadersCommonKt.a(builder, o10, y10);
            }
            i7++;
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f22452b = protocol;
        builder2.f22453c = statusLine.f22695b;
        String message = statusLine.f22696c;
        l.e(message, "message");
        builder2.f22454d = message;
        builder2.f22456f = builder.a().t();
        if (z8 && builder2.f22453c == 100) {
            return null;
        }
        return builder2;
    }
}
