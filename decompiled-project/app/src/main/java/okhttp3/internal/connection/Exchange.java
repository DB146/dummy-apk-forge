package okhttp3.internal.connection;

import X.c;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import rc.AbstractC1958b;
import rc.C1964h;
import rc.G;
import rc.H;
import rc.p;
import rc.q;

/* loaded from: classes2.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f22565a;

    /* renamed from: b, reason: collision with root package name */
    public final EventListener f22566b;

    /* renamed from: c, reason: collision with root package name */
    public final ExchangeFinder f22567c;

    /* renamed from: d, reason: collision with root package name */
    public final ExchangeCodec f22568d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22569e;

    /* loaded from: classes2.dex */
    public final class RequestBodySink extends p {

        /* renamed from: b, reason: collision with root package name */
        public final long f22570b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22571c;

        /* renamed from: d, reason: collision with root package name */
        public long f22572d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22573e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f22574f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, G delegate, long j) {
            super(delegate);
            l.e(delegate, "delegate");
            this.f22574f = exchange;
            this.f22570b = j;
        }

        @Override // rc.p, rc.G, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22573e) {
                return;
            }
            this.f22573e = true;
            long j = this.f22570b;
            if (j != -1 && this.f22572d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e2) {
                throw l(e2);
            }
        }

        @Override // rc.p, rc.G, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e2) {
                throw l(e2);
            }
        }

        public final IOException l(IOException iOException) {
            if (this.f22571c) {
                return iOException;
            }
            this.f22571c = true;
            long j = this.f22572d;
            Exchange exchange = this.f22574f;
            if (iOException != null) {
                exchange.e(iOException);
            }
            EventListener eventListener = exchange.f22566b;
            RealCall realCall = exchange.f22565a;
            if (iOException != null) {
                eventListener.r(realCall, iOException);
            } else {
                eventListener.p(realCall, j);
            }
            return realCall.h(exchange, true, false, iOException);
        }

        @Override // rc.p, rc.G
        public final void m(long j, C1964h c1964h) {
            if (this.f22573e) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f22570b;
            if (j10 != -1 && this.f22572d + j > j10) {
                StringBuilder l10 = c.l(j10, "expected ", " bytes but received ");
                l10.append(this.f22572d + j);
                throw new ProtocolException(l10.toString());
            }
            try {
                super.m(j, c1964h);
                this.f22572d += j;
            } catch (IOException e2) {
                throw l(e2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class ResponseBodySource extends q {

        /* renamed from: b, reason: collision with root package name */
        public final long f22575b;

        /* renamed from: c, reason: collision with root package name */
        public long f22576c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22577d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22578e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22579f;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Exchange f22580u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, H delegate, long j) {
            super(delegate);
            l.e(delegate, "delegate");
            this.f22580u = exchange;
            this.f22575b = j;
            this.f22577d = true;
            if (j == 0) {
                l(null);
            }
        }

        @Override // rc.q, rc.H
        public final long O(long j, C1964h sink) {
            l.e(sink, "sink");
            if (this.f22579f) {
                throw new IllegalStateException("closed");
            }
            try {
                long O10 = this.f23983a.O(j, sink);
                boolean z8 = this.f22577d;
                Exchange exchange = this.f22580u;
                if (z8) {
                    this.f22577d = false;
                    exchange.f22566b.v(exchange.f22565a);
                }
                if (O10 == -1) {
                    l(null);
                    return -1L;
                }
                long j10 = this.f22576c + O10;
                long j11 = this.f22575b;
                if (j11 == -1 || j10 <= j11) {
                    this.f22576c = j10;
                    if (exchange.f22568d.c()) {
                        l(null);
                    }
                    return O10;
                }
                throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
            } catch (IOException e2) {
                throw l(e2);
            }
        }

        @Override // rc.q, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22579f) {
                return;
            }
            this.f22579f = true;
            try {
                super.close();
            } catch (IOException e2) {
                throw l(e2);
            }
        }

        public final IOException l(IOException iOException) {
            if (this.f22578e) {
                return iOException;
            }
            this.f22578e = true;
            Exchange exchange = this.f22580u;
            if (iOException == null && this.f22577d) {
                this.f22577d = false;
                exchange.f22566b.v(exchange.f22565a);
            }
            long j = this.f22576c;
            if (iOException != null) {
                exchange.e(iOException);
            }
            EventListener eventListener = exchange.f22566b;
            RealCall realCall = exchange.f22565a;
            if (iOException != null) {
                eventListener.w(realCall, iOException);
            } else {
                eventListener.u(realCall, j);
            }
            return realCall.h(exchange, false, true, iOException);
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        l.e(call, "call");
        l.e(eventListener, "eventListener");
        l.e(finder, "finder");
        this.f22565a = call;
        this.f22566b = eventListener;
        this.f22567c = finder;
        this.f22568d = exchangeCodec;
    }

    public final G a(Request request) {
        l.e(request, "request");
        RequestBody requestBody = request.f22427d;
        l.b(requestBody);
        long a9 = requestBody.a();
        this.f22566b.q(this.f22565a);
        return new RequestBodySink(this, this.f22568d.h(request, a9), a9);
    }

    public final RealConnection b() {
        ExchangeCodec.Carrier g = this.f22568d.g();
        RealConnection realConnection = g instanceof RealConnection ? (RealConnection) g : null;
        if (realConnection != null) {
            return realConnection;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final RealResponseBody c(Response response) {
        ExchangeCodec exchangeCodec = this.f22568d;
        try {
            String b2 = response.f22444f.b("Content-Type");
            if (b2 == null) {
                b2 = null;
            }
            long e2 = exchangeCodec.e(response);
            return new RealResponseBody(b2, e2, AbstractC1958b.c(new ResponseBodySource(this, exchangeCodec.f(response), e2)));
        } catch (IOException e10) {
            this.f22566b.w(this.f22565a, e10);
            e(e10);
            throw e10;
        }
    }

    public final Response.Builder d(boolean z8) {
        try {
            Response.Builder i7 = this.f22568d.i(z8);
            if (i7 != null) {
                i7.f22460m = this;
            }
            return i7;
        } catch (IOException e2) {
            this.f22566b.w(this.f22565a, e2);
            e(e2);
            throw e2;
        }
    }

    public final void e(IOException iOException) {
        this.f22569e = true;
        this.f22568d.g().c(this.f22565a, iOException);
    }
}
