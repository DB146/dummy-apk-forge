package okhttp3.internal.http;

import a.AbstractC0672a;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.ConnectionShutdownException;
import rc.AbstractC1958b;
import rc.B;

/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
    
        if ("close".equalsIgnoreCase(r11) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[Catch: IOException -> 0x00c3, TryCatch #1 {IOException -> 0x00c3, blocks: (B:63:0x00b5, B:65:0x00be, B:18:0x00c6, B:22:0x00eb, B:24:0x00f4, B:26:0x00f7, B:33:0x0110, B:35:0x012a, B:37:0x0138, B:40:0x0142, B:48:0x0157, B:50:0x0162, B:51:0x0184, B:60:0x0148), top: B:62:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138 A[Catch: IOException -> 0x00c3, TryCatch #1 {IOException -> 0x00c3, blocks: (B:63:0x00b5, B:65:0x00be, B:18:0x00c6, B:22:0x00eb, B:24:0x00f4, B:26:0x00f7, B:33:0x0110, B:35:0x012a, B:37:0x0138, B:40:0x0142, B:48:0x0157, B:50:0x0162, B:51:0x0184, B:60:0x0148), top: B:62:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, okhttp3.TrailersSource] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        Response.Builder builder;
        IOException iOException;
        boolean z8;
        Response a9;
        int i7;
        Response a10;
        ResponseBody responseBody;
        boolean z10;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.f22683d;
        l.b(exchange);
        EventListener eventListener = exchange.f22566b;
        RealCall realCall = exchange.f22565a;
        ExchangeCodec exchangeCodec = exchange.f22568d;
        Request request = realInterceptorChain.f22684e;
        RequestBody requestBody = request.f22427d;
        long currentTimeMillis = System.currentTimeMillis();
        String str = null;
        boolean z11 = true;
        try {
            try {
                eventListener.t(realCall);
                exchangeCodec.b(request);
                eventListener.s(realCall, request);
                if (!HttpMethod.a(request.f22425b) || requestBody == null) {
                    realCall.h(exchange, true, false, null);
                    builder = null;
                } else {
                    if ("100-continue".equalsIgnoreCase(request.f22426c.b("Expect"))) {
                        try {
                            exchangeCodec.d();
                            builder = exchange.d(true);
                            try {
                                eventListener.y(realCall);
                                z10 = false;
                            } catch (IOException e2) {
                                e = e2;
                                if (e instanceof ConnectionShutdownException) {
                                }
                            }
                        } catch (IOException e10) {
                            eventListener.r(realCall, e10);
                            exchange.e(e10);
                            throw e10;
                        }
                    } else {
                        builder = null;
                        z10 = true;
                    }
                    try {
                        if (builder == null) {
                            B b2 = AbstractC1958b.b(exchange.a(request));
                            requestBody.d(b2);
                            b2.close();
                        } else {
                            realCall.h(exchange, true, false, null);
                            if (exchange.b().f22612A == null) {
                                z11 = false;
                            }
                            if (!z11) {
                                exchangeCodec.g().h();
                            }
                        }
                        z11 = z10;
                    } catch (IOException e11) {
                        e = e11;
                        z11 = z10;
                        if (e instanceof ConnectionShutdownException) {
                            throw e;
                        }
                        if (!exchange.f22569e) {
                            throw e;
                        }
                        boolean z12 = z11;
                        iOException = e;
                        z8 = z12;
                        if (builder == null) {
                        }
                        builder.f22451a = request;
                        builder.f22455e = exchange.b().f22626u;
                        builder.k = currentTimeMillis;
                        builder.f22459l = System.currentTimeMillis();
                        a9 = builder.a();
                        i7 = a9.f22442d;
                        while (true) {
                            if (i7 != 100) {
                                break;
                            }
                            Response.Builder d10 = exchange.d(false);
                            l.b(d10);
                            if (!z8) {
                            }
                            d10.f22451a = request;
                            d10.f22455e = exchange.b().f22626u;
                            d10.k = currentTimeMillis;
                            d10.f22459l = System.currentTimeMillis();
                            a9 = d10.a();
                            i7 = a9.f22442d;
                        }
                        eventListener.x(realCall, a9);
                        RealResponseBody c10 = exchange.c(a9);
                        Response.Builder l10 = a9.l();
                        l10.g = c10;
                        l10.f22461n = new Object();
                        a10 = l10.a();
                        responseBody = a10.f22445u;
                        if (!"close".equalsIgnoreCase(a10.f22439a.f22426c.b("Connection"))) {
                        }
                        exchangeCodec.g().h();
                        if (i7 == 204) {
                        }
                        throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + responseBody.l());
                    }
                }
                try {
                    exchangeCodec.a();
                    z8 = z11;
                    iOException = null;
                } catch (IOException e12) {
                    eventListener.r(realCall, e12);
                    exchange.e(e12);
                    throw e12;
                }
            } catch (IOException e13) {
                e = e13;
                builder = null;
                if (e instanceof ConnectionShutdownException) {
                }
            }
            if (builder == null) {
                try {
                    builder = exchange.d(false);
                    l.b(builder);
                    if (z8) {
                        eventListener.y(realCall);
                        z8 = false;
                    }
                } catch (IOException e14) {
                    if (iOException == null) {
                        throw e14;
                    }
                    AbstractC0672a.c(iOException, e14);
                    throw iOException;
                }
            }
            builder.f22451a = request;
            builder.f22455e = exchange.b().f22626u;
            builder.k = currentTimeMillis;
            builder.f22459l = System.currentTimeMillis();
            a9 = builder.a();
            i7 = a9.f22442d;
            while (true) {
                if (i7 != 100 && (102 > i7 || i7 >= 200)) {
                    break;
                }
                Response.Builder d102 = exchange.d(false);
                l.b(d102);
                if (!z8) {
                    eventListener.y(realCall);
                }
                d102.f22451a = request;
                d102.f22455e = exchange.b().f22626u;
                d102.k = currentTimeMillis;
                d102.f22459l = System.currentTimeMillis();
                a9 = d102.a();
                i7 = a9.f22442d;
            }
            eventListener.x(realCall, a9);
            RealResponseBody c102 = exchange.c(a9);
            Response.Builder l102 = a9.l();
            l102.g = c102;
            l102.f22461n = new Object();
            a10 = l102.a();
            responseBody = a10.f22445u;
            if (!"close".equalsIgnoreCase(a10.f22439a.f22426c.b("Connection"))) {
                String b10 = a10.f22444f.b("Connection");
                if (b10 != null) {
                    str = b10;
                }
            }
            exchangeCodec.g().h();
            if ((i7 == 204 && i7 != 205) || responseBody.l() <= 0) {
                return a10;
            }
            throw new ProtocolException("HTTP " + i7 + " had non-zero Content-Length: " + responseBody.l());
        } catch (IOException e15) {
            eventListener.r(realCall, e15);
            exchange.e(e15);
            throw e15;
        }
    }
}
