package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import rc.G;
import rc.H;

/* loaded from: classes2.dex */
public interface ExchangeCodec {

    /* loaded from: classes2.dex */
    public interface Carrier {
        void c(RealCall realCall, IOException iOException);

        void cancel();

        Route f();

        void h();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    void a();

    void b(Request request);

    boolean c();

    void cancel();

    void d();

    long e(Response response);

    H f(Response response);

    Carrier g();

    G h(Request request, long j);

    Response.Builder i(boolean z8);
}
