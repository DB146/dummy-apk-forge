package okhttp3.internal.platform.android;

import Eb.B;
import ac.g;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.l;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
/* loaded from: classes2.dex */
public final class AndroidLog {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLog f22905a = new AndroidLog();

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f22906b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f22907c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f22907c = B.L(linkedHashMap);
    }

    private AndroidLog() {
    }

    public static void a(String str, int i7, String str2, Throwable th) {
        int min;
        String str3 = (String) f22907c.get(str);
        if (str3 == null) {
            str3 = g.u0(23, str);
        }
        if (Log.isLoggable(str3, i7)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                int e02 = g.e0(str2, '\n', i10, 4);
                if (e02 == -1) {
                    e02 = length;
                }
                while (true) {
                    min = Math.min(e02, i10 + 4000);
                    String substring = str2.substring(i10, min);
                    l.d(substring, "substring(...)");
                    Log.println(i7, str3, substring);
                    if (min >= e02) {
                        break;
                    } else {
                        i10 = min;
                    }
                }
                i10 = min + 1;
            }
        }
    }
}
