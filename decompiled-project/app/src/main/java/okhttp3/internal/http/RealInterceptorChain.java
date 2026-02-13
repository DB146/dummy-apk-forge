package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f22680a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22682c;

    /* renamed from: d, reason: collision with root package name */
    public final Exchange f22683d;

    /* renamed from: e, reason: collision with root package name */
    public final Request f22684e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22685f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22686h;

    /* renamed from: i, reason: collision with root package name */
    public int f22687i;

    public RealInterceptorChain(RealCall call, ArrayList arrayList, int i7, Exchange exchange, Request request, int i10, int i11, int i12) {
        l.e(call, "call");
        l.e(request, "request");
        this.f22680a = call;
        this.f22681b = arrayList;
        this.f22682c = i7;
        this.f22683d = exchange;
        this.f22684e = request;
        this.f22685f = i10;
        this.g = i11;
        this.f22686h = i12;
    }

    public static RealInterceptorChain c(RealInterceptorChain realInterceptorChain, int i7, Exchange exchange, Request request, int i10) {
        if ((i10 & 1) != 0) {
            i7 = realInterceptorChain.f22682c;
        }
        int i11 = i7;
        if ((i10 & 2) != 0) {
            exchange = realInterceptorChain.f22683d;
        }
        Exchange exchange2 = exchange;
        if ((i10 & 4) != 0) {
            request = realInterceptorChain.f22684e;
        }
        Request request2 = request;
        l.e(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f22680a, realInterceptorChain.f22681b, i11, exchange2, request2, realInterceptorChain.f22685f, realInterceptorChain.g, realInterceptorChain.f22686h);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response a(Request request) {
        l.e(request, "request");
        ArrayList arrayList = this.f22681b;
        int size = arrayList.size();
        int i7 = this.f22682c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f22687i++;
        Exchange exchange = this.f22683d;
        if (exchange != null) {
            if (!exchange.f22567c.b().f(request.f22424a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f22687i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i7 + 1;
        RealInterceptorChain c10 = c(this, i10, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i7);
        Response intercept = interceptor.intercept(c10);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i10 >= arrayList.size() || c10.f22687i == 1) {
            return intercept;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request b() {
        return this.f22684e;
    }
}
