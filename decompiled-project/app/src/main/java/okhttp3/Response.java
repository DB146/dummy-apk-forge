package okhttp3;

import java.io.Closeable;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes2.dex */
public final class Response implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public final Exchange f22436A;

    /* renamed from: B, reason: collision with root package name */
    public final TrailersSource f22437B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f22438C;

    /* renamed from: a, reason: collision with root package name */
    public final Request f22439a;

    /* renamed from: b, reason: collision with root package name */
    public final Protocol f22440b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22441c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22442d;

    /* renamed from: e, reason: collision with root package name */
    public final Handshake f22443e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f22444f;

    /* renamed from: u, reason: collision with root package name */
    public final ResponseBody f22445u;

    /* renamed from: v, reason: collision with root package name */
    public final Response f22446v;

    /* renamed from: w, reason: collision with root package name */
    public final Response f22447w;

    /* renamed from: x, reason: collision with root package name */
    public final Response f22448x;

    /* renamed from: y, reason: collision with root package name */
    public final long f22449y;

    /* renamed from: z, reason: collision with root package name */
    public final long f22450z;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Request f22451a;

        /* renamed from: b, reason: collision with root package name */
        public Protocol f22452b;

        /* renamed from: d, reason: collision with root package name */
        public String f22454d;

        /* renamed from: e, reason: collision with root package name */
        public Handshake f22455e;

        /* renamed from: h, reason: collision with root package name */
        public Response f22457h;

        /* renamed from: i, reason: collision with root package name */
        public Response f22458i;
        public Response j;
        public long k;

        /* renamed from: l, reason: collision with root package name */
        public long f22459l;

        /* renamed from: m, reason: collision with root package name */
        public Exchange f22460m;

        /* renamed from: c, reason: collision with root package name */
        public int f22453c = -1;
        public ResponseBody g = ResponseBody.f22462b;

        /* renamed from: n, reason: collision with root package name */
        public TrailersSource f22461n = TrailersSource.f22481a;

        /* renamed from: f, reason: collision with root package name */
        public Headers.Builder f22456f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.f22446v != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f22447w != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.f22448x != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i7 = this.f22453c;
            if (i7 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f22453c).toString());
            }
            Request request = this.f22451a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f22452b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f22454d;
            if (str != null) {
                return new Response(request, protocol, str, i7, this.f22455e, this.f22456f.a(), this.g, this.f22457h, this.f22458i, this.j, this.k, this.f22459l, this.f22460m, this.f22461n);
            }
            throw new IllegalStateException("message == null");
        }
    }

    public Response(Request request, Protocol protocol, String message, int i7, Handshake handshake, Headers headers, ResponseBody body, Response response, Response response2, Response response3, long j, long j10, Exchange exchange, TrailersSource trailersSource) {
        l.e(request, "request");
        l.e(protocol, "protocol");
        l.e(message, "message");
        l.e(body, "body");
        l.e(trailersSource, "trailersSource");
        this.f22439a = request;
        this.f22440b = protocol;
        this.f22441c = message;
        this.f22442d = i7;
        this.f22443e = handshake;
        this.f22444f = headers;
        this.f22445u = body;
        this.f22446v = response;
        this.f22447w = response2;
        this.f22448x = response3;
        this.f22449y = j;
        this.f22450z = j10;
        this.f22436A = exchange;
        this.f22437B = trailersSource;
        boolean z8 = false;
        if (200 <= i7 && i7 < 300) {
            z8 = true;
        }
        this.f22438C = z8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22445u.close();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Response$Builder, java.lang.Object] */
    public final Builder l() {
        ?? obj = new Object();
        obj.f22453c = -1;
        obj.g = ResponseBody.f22462b;
        obj.f22461n = TrailersSource.f22481a;
        obj.f22451a = this.f22439a;
        obj.f22452b = this.f22440b;
        obj.f22453c = this.f22442d;
        obj.f22454d = this.f22441c;
        obj.f22455e = this.f22443e;
        obj.f22456f = this.f22444f.t();
        obj.g = this.f22445u;
        obj.f22457h = this.f22446v;
        obj.f22458i = this.f22447w;
        obj.j = this.f22448x;
        obj.k = this.f22449y;
        obj.f22459l = this.f22450z;
        obj.f22460m = this.f22436A;
        obj.f22461n = this.f22437B;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f22440b + ", code=" + this.f22442d + ", message=" + this.f22441c + ", url=" + this.f22439a.f22424a + '}';
    }
}
