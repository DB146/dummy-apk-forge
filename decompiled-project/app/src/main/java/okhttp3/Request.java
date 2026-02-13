package okhttp3;

import Db.j;
import Eb.B;
import Eb.w;
import ac.n;
import java.util.Map;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;
import y.S;
import y7.u0;

/* loaded from: classes2.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f22424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22425b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f22426c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestBody f22427d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f22428e;

    /* renamed from: f, reason: collision with root package name */
    public CacheControl f22429f;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f22430a;

        /* renamed from: d, reason: collision with root package name */
        public RequestBody f22433d;

        /* renamed from: e, reason: collision with root package name */
        public Object f22434e = w.f3892a;

        /* renamed from: b, reason: collision with root package name */
        public String f22431b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public Headers.Builder f22432c = new Headers.Builder();

        public final void a(String str, String value) {
            l.e(value, "value");
            Headers.Builder builder = this.f22432c;
            builder.getClass();
            l.e(value, "value");
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(value, str);
            _HeadersCommonKt.a(builder, str, value);
        }

        public final void b(String name, String value) {
            l.e(name, "name");
            l.e(value, "value");
            Headers.Builder builder = this.f22432c;
            builder.getClass();
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.c(value, name);
            builder.b(name);
            _HeadersCommonKt.a(builder, name, value);
        }

        public final void c(String method, RequestBody requestBody) {
            l.e(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f22679a;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(S.b("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.a(method)) {
                throw new IllegalArgumentException(S.b("method ", method, " must not have a request body.").toString());
            }
            this.f22431b = method;
            this.f22433d = requestBody;
        }

        public final void d(FormBody formBody) {
            c("POST", formBody);
        }

        public final void e(String url) {
            l.e(url, "url");
            HttpUrl.Companion companion = HttpUrl.j;
            if (n.Y(url, "ws:", true)) {
                String substring = url.substring(3);
                l.d(substring, "substring(...)");
                url = "http:".concat(substring);
            } else if (n.Y(url, "wss:", true)) {
                String substring2 = url.substring(4);
                l.d(substring2, "substring(...)");
                url = "https:".concat(substring2);
            }
            companion.getClass();
            this.f22430a = HttpUrl.Companion.b(url);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    public Request(Builder builder) {
        HttpUrl httpUrl = builder.f22430a;
        if (httpUrl == null) {
            throw new IllegalStateException("url == null");
        }
        this.f22424a = httpUrl;
        this.f22425b = builder.f22431b;
        this.f22426c = builder.f22432c.a();
        this.f22427d = builder.f22433d;
        this.f22428e = B.L(builder.f22434e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Request$Builder, java.lang.Object] */
    public final Builder a() {
        ?? obj = new Object();
        Object obj2 = w.f3892a;
        obj.f22434e = obj2;
        obj.f22430a = this.f22424a;
        obj.f22431b = this.f22425b;
        obj.f22433d = this.f22427d;
        Map map = this.f22428e;
        if (!map.isEmpty()) {
            obj2 = B.M(map);
        }
        obj.f22434e = obj2;
        obj.f22432c = this.f22426c.t();
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f22425b);
        sb2.append(", url=");
        sb2.append(this.f22424a);
        Headers headers = this.f22426c;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i7 = 0;
            for (j jVar : headers) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    u0.M();
                    throw null;
                }
                j jVar2 = jVar;
                String str = (String) jVar2.f3354a;
                String str2 = (String) jVar2.f3355b;
                if (i7 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (_UtilCommonKt.i(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i7 = i10;
            }
            sb2.append(']');
        }
        Map map = this.f22428e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
