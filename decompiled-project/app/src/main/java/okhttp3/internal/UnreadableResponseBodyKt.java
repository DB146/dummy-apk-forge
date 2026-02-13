package okhttp3.internal;

import kotlin.jvm.internal.l;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        l.e(response, "<this>");
        Response.Builder l10 = response.l();
        ResponseBody responseBody = response.f22445u;
        l10.g = new UnreadableResponseBody(responseBody.n(), responseBody.l());
        return l10.a();
    }
}
