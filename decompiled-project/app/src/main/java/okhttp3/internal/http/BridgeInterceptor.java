package okhttp3.internal.http;

import kotlin.jvm.internal.l;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;
import rc.AbstractC1958b;
import rc.t;

/* loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f22675a;

    public BridgeInterceptor(CookieJar cookieJar) {
        l.e(cookieJar, "cookieJar");
        this.f22675a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f22684e;
        Request.Builder a9 = request.a();
        RequestBody requestBody = request.f22427d;
        if (requestBody != null) {
            MediaType b2 = requestBody.b();
            if (b2 != null) {
                a9.b("Content-Type", b2.f22352a);
            }
            long a10 = requestBody.a();
            if (a10 != -1) {
                a9.b("Content-Length", String.valueOf(a10));
                a9.f22432c.b("Transfer-Encoding");
            } else {
                a9.b("Transfer-Encoding", "chunked");
                a9.f22432c.b("Content-Length");
            }
        }
        Headers headers = request.f22426c;
        String b10 = headers.b("Host");
        boolean z8 = false;
        HttpUrl httpUrl = request.f22424a;
        if (b10 == null) {
            a9.b("Host", _UtilJvmKt.j(httpUrl, false));
        }
        if (headers.b("Connection") == null) {
            a9.b("Connection", "Keep-Alive");
        }
        if (headers.b("Accept-Encoding") == null && headers.b("Range") == null) {
            a9.b("Accept-Encoding", "gzip");
            z8 = true;
        }
        CookieJar cookieJar = this.f22675a;
        cookieJar.a(httpUrl);
        if (headers.b("User-Agent") == null) {
            a9.b("User-Agent", "okhttp/5.1.0");
        }
        Request request2 = new Request(a9);
        Response a11 = realInterceptorChain.a(request2);
        Headers headers2 = a11.f22444f;
        HttpHeaders.d(cookieJar, request2.f22424a, headers2);
        Response.Builder l10 = a11.l();
        l10.f22451a = request2;
        if (z8) {
            String b11 = headers2.b("Content-Encoding");
            if (b11 == null) {
                b11 = null;
            }
            if ("gzip".equalsIgnoreCase(b11) && HttpHeaders.a(a11) && (responseBody = a11.f22445u) != null) {
                t tVar = new t(responseBody.F());
                Headers.Builder t5 = headers2.t();
                t5.b("Content-Encoding");
                t5.b("Content-Length");
                l10.f22456f = t5.a().t();
                String b12 = headers2.b("Content-Type");
                l10.g = new RealResponseBody(b12 != null ? b12 : null, -1L, AbstractC1958b.c(tVar));
            }
        }
        return l10.a();
    }
}
