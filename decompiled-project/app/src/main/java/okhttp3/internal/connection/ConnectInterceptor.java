package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import rc.B;
import rc.C;
import rc.J;

/* loaded from: classes2.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f22537a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ExchangeCodec http1ExchangeCodec;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f22680a;
        realCall.getClass();
        synchronized (realCall) {
            try {
                if (!realCall.f22591A) {
                    throw new IllegalStateException("released");
                }
                if (realCall.f22606z) {
                    throw new IllegalStateException("Check failed.");
                }
                if (realCall.f22605y) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ExchangeFinder exchangeFinder = realCall.f22602v;
        l.b(exchangeFinder);
        RealConnection a9 = exchangeFinder.a();
        OkHttpClient client = realCall.f22595a;
        a9.getClass();
        l.e(client, "client");
        Http2Connection http2Connection = a9.f22612A;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(client, a9, realInterceptorChain, http2Connection);
        } else {
            Socket socket = a9.f22625f;
            int i7 = realInterceptorChain.g;
            socket.setSoTimeout(i7);
            C c10 = a9.f22628w;
            J e2 = c10.f23928a.e();
            long j = i7;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            e2.g(j, timeUnit);
            B b2 = a9.f22629x;
            b2.f23925a.e().g(realInterceptorChain.f22686h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(client, a9, c10, b2);
        }
        Exchange exchange = new Exchange(realCall, realCall.f22598d, exchangeFinder, http1ExchangeCodec);
        realCall.f22604x = exchange;
        realCall.f22593C = exchange;
        synchronized (realCall) {
            realCall.f22605y = true;
            realCall.f22606z = true;
        }
        if (realCall.f22592B) {
            throw new IOException("Canceled");
        }
        return RealInterceptorChain.c(realInterceptorChain, 0, exchange, null, 61).a(realInterceptorChain.f22684e);
    }
}
