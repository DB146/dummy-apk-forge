package okhttp3.internal.http;

import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f22691a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        l.e(url, "url");
        String b2 = url.b();
        String d10 = url.d();
        if (d10 == null) {
            return b2;
        }
        return b2 + '?' + d10;
    }
}
