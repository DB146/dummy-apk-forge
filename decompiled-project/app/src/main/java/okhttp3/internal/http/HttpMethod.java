package okhttp3.internal.http;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class HttpMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final HttpMethod f22679a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean a(String method) {
        l.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
