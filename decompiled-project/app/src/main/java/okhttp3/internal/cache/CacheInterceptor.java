package okhttp3.internal.cache;

import ac.g;
import com.google.android.gms.common.api.f;
import kotlin.jvm.internal.l;
import okhttp3.CacheControl;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f22501a = new Companion(0);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0313, code lost:
    
        if (ac.n.Y(r13, "1", false) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165 A[SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        CacheStrategy cacheStrategy;
        EventListener eventListener;
        String str2;
        Response response;
        int i7;
        Headers headers;
        String str3;
        int i10;
        int i11;
        String str4;
        int i12;
        String str5 = "networkResponse";
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f22680a;
        System.currentTimeMillis();
        Request request = realInterceptorChain.f22684e;
        l.e(request, "request");
        CacheStrategy cacheStrategy2 = new CacheStrategy(request, null);
        CacheControl cacheControl = request.f22429f;
        if (cacheControl == null) {
            CacheControl.f22250n.getClass();
            Headers headers2 = request.f22426c;
            l.e(headers2, "headers");
            int size = headers2.size();
            String str6 = null;
            int i13 = 0;
            boolean z8 = true;
            boolean z10 = false;
            boolean z11 = false;
            int i14 = -1;
            int i15 = -1;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i16 = -1;
            int i17 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            while (i13 < size) {
                String o10 = headers2.o(i13);
                String y10 = headers2.y(i13);
                if (o10.equalsIgnoreCase("Cache-Control")) {
                    if (str6 == null) {
                        str6 = y10;
                        i7 = 0;
                        while (i7 < y10.length()) {
                            int length = y10.length();
                            CacheStrategy cacheStrategy3 = cacheStrategy2;
                            int i18 = i7;
                            while (true) {
                                if (i18 >= length) {
                                    headers = headers2;
                                    i18 = y10.length();
                                    break;
                                }
                                int i19 = length;
                                headers = headers2;
                                if (g.a0("=,;", y10.charAt(i18))) {
                                    break;
                                }
                                i18++;
                                length = i19;
                                headers2 = headers;
                            }
                            String substring = y10.substring(i7, i18);
                            l.d(substring, "substring(...)");
                            String obj = g.v0(substring).toString();
                            if (i18 != y10.length()) {
                                i10 = size;
                                if (y10.charAt(i18) == ',' || y10.charAt(i18) == ';') {
                                    str3 = str5;
                                } else {
                                    int i20 = i18 + 1;
                                    byte[] bArr = _UtilCommonKt.f22495a;
                                    int length2 = y10.length();
                                    while (true) {
                                        if (i20 >= length2) {
                                            i12 = 1;
                                            i20 = y10.length();
                                            break;
                                        }
                                        char charAt = y10.charAt(i20);
                                        int i21 = length2;
                                        if (charAt != ' ' && charAt != '\t') {
                                            i12 = 1;
                                            break;
                                        }
                                        i20++;
                                        length2 = i21;
                                    }
                                    if (i20 < y10.length()) {
                                        str3 = str5;
                                        if (y10.charAt(i20) == '\"') {
                                            int i22 = i20 + i12;
                                            int e02 = g.e0(y10, '\"', i22, 4);
                                            String substring2 = y10.substring(i22, e02);
                                            l.d(substring2, "substring(...)");
                                            i11 = e02 + i12;
                                            str4 = substring2;
                                            if ("no-cache".equalsIgnoreCase(obj)) {
                                                i7 = i11;
                                                size = i10;
                                                cacheStrategy2 = cacheStrategy3;
                                                headers2 = headers;
                                                str5 = str3;
                                                z10 = true;
                                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                                i7 = i11;
                                                size = i10;
                                                cacheStrategy2 = cacheStrategy3;
                                                headers2 = headers;
                                                str5 = str3;
                                                z11 = true;
                                            } else {
                                                if ("max-age".equalsIgnoreCase(obj)) {
                                                    i14 = _UtilCommonKt.m(-1, str4);
                                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                                    i15 = _UtilCommonKt.m(-1, str4);
                                                } else if ("private".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z12 = true;
                                                } else if ("public".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z13 = true;
                                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z14 = true;
                                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                                    i16 = _UtilCommonKt.m(f.API_PRIORITY_OTHER, str4);
                                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                                    i17 = _UtilCommonKt.m(-1, str4);
                                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z15 = true;
                                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z16 = true;
                                                } else if ("immutable".equalsIgnoreCase(obj)) {
                                                    i7 = i11;
                                                    size = i10;
                                                    cacheStrategy2 = cacheStrategy3;
                                                    headers2 = headers;
                                                    str5 = str3;
                                                    z17 = true;
                                                }
                                                i7 = i11;
                                                size = i10;
                                                cacheStrategy2 = cacheStrategy3;
                                                headers2 = headers;
                                                str5 = str3;
                                            }
                                        }
                                    } else {
                                        str3 = str5;
                                    }
                                    int length3 = y10.length();
                                    int i23 = i20;
                                    while (true) {
                                        if (i23 >= length3) {
                                            i23 = y10.length();
                                            break;
                                        }
                                        int i24 = length3;
                                        if (g.a0(",;", y10.charAt(i23))) {
                                            break;
                                        }
                                        i23++;
                                        length3 = i24;
                                    }
                                    String substring3 = y10.substring(i20, i23);
                                    l.d(substring3, "substring(...)");
                                    str4 = g.v0(substring3).toString();
                                    i11 = i23;
                                    if ("no-cache".equalsIgnoreCase(obj)) {
                                    }
                                }
                            } else {
                                str3 = str5;
                                i10 = size;
                            }
                            i11 = i18 + 1;
                            str4 = null;
                            if ("no-cache".equalsIgnoreCase(obj)) {
                            }
                        }
                        i13++;
                        size = size;
                        cacheStrategy2 = cacheStrategy2;
                        headers2 = headers2;
                        str5 = str5;
                    }
                } else if (!o10.equalsIgnoreCase("Pragma")) {
                    i13++;
                    size = size;
                    cacheStrategy2 = cacheStrategy2;
                    headers2 = headers2;
                    str5 = str5;
                }
                z8 = false;
                i7 = 0;
                while (i7 < y10.length()) {
                }
                i13++;
                size = size;
                cacheStrategy2 = cacheStrategy2;
                headers2 = headers2;
                str5 = str5;
            }
            str = str5;
            cacheStrategy = cacheStrategy2;
            cacheControl = new CacheControl(z10, z11, i14, i15, z12, z13, z14, i16, i17, z15, z16, z17, !z8 ? null : str6);
            request.f22429f = cacheControl;
        } else {
            str = "networkResponse";
            cacheStrategy = cacheStrategy2;
        }
        CacheStrategy cacheStrategy4 = cacheControl.j ? new CacheStrategy(null, null) : cacheStrategy;
        Request request2 = cacheStrategy4.f22503a;
        Response response2 = cacheStrategy4.f22504b;
        RealCall realCall2 = realCall != null ? realCall : null;
        if (realCall2 == null || (eventListener = realCall2.f22598d) == null) {
            eventListener = EventListener.f22320a;
        }
        if (request2 == null && response2 == null) {
            Response.Builder builder = new Response.Builder();
            Request request3 = realInterceptorChain.f22684e;
            l.e(request3, "request");
            builder.f22451a = request3;
            builder.f22452b = Protocol.f22416d;
            builder.f22453c = 504;
            builder.f22454d = "Unsatisfiable Request (only-if-cached)";
            builder.k = -1L;
            builder.f22459l = System.currentTimeMillis();
            Response a9 = builder.a();
            eventListener.z(realCall, a9);
            return a9;
        }
        if (request2 == null) {
            l.b(response2);
            Response.Builder l10 = response2.l();
            Response a10 = UnreadableResponseBodyKt.a(response2);
            Response.Builder.b("cacheResponse", a10);
            l10.f22458i = a10;
            Response a11 = l10.a();
            eventListener.b(realCall, a11);
            return a11;
        }
        if (response2 != null) {
            eventListener.a(realCall, response2);
        }
        Response a12 = realInterceptorChain.a(request2);
        if (response2 == null) {
            str2 = str;
            response = null;
        } else {
            if (a12.f22442d == 304) {
                Response.Builder l11 = response2.l();
                Companion companion = f22501a;
                Headers headers3 = response2.f22444f;
                Headers headers4 = a12.f22444f;
                companion.getClass();
                Headers.Builder builder2 = new Headers.Builder();
                int size2 = headers3.size();
                for (int i25 = 0; i25 < size2; i25++) {
                    String o11 = headers3.o(i25);
                    String y11 = headers3.y(i25);
                    if (!"Warning".equalsIgnoreCase(o11)) {
                    }
                    if ("Content-Length".equalsIgnoreCase(o11) || "Content-Encoding".equalsIgnoreCase(o11) || "Content-Type".equalsIgnoreCase(o11) || !Companion.a(o11) || headers4.b(o11) == null) {
                        _HeadersCommonKt.a(builder2, o11, y11);
                    }
                }
                int size3 = headers4.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    String o12 = headers4.o(i26);
                    if (!"Content-Length".equalsIgnoreCase(o12) && !"Content-Encoding".equalsIgnoreCase(o12) && !"Content-Type".equalsIgnoreCase(o12) && Companion.a(o12)) {
                        _HeadersCommonKt.a(builder2, o12, headers4.y(i26));
                    }
                }
                l11.f22456f = builder2.a().t();
                l11.k = a12.f22449y;
                l11.f22459l = a12.f22450z;
                Response a13 = UnreadableResponseBodyKt.a(response2);
                Response.Builder.b("cacheResponse", a13);
                l11.f22458i = a13;
                Response a14 = UnreadableResponseBodyKt.a(a12);
                Response.Builder.b(str, a14);
                l11.f22457h = a14;
                l11.a();
                a12.f22445u.close();
                l.b(null);
                throw null;
            }
            str2 = str;
            response = null;
            _UtilCommonKt.a(response2.f22445u);
        }
        Response.Builder l12 = a12.l();
        Response a15 = response2 != null ? UnreadableResponseBodyKt.a(response2) : response;
        Response.Builder.b("cacheResponse", a15);
        l12.f22458i = a15;
        Response a16 = UnreadableResponseBodyKt.a(a12);
        Response.Builder.b(str2, a16);
        l12.f22457h = a16;
        return l12.a();
    }
}
