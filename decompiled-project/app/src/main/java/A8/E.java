package A8;

import ac.AbstractC0796a;
import android.os.Build;
import android.os.Process;
import android.util.Base64;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final String f543a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f544b;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    static {
        String d10;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            d10 = Process.myProcessName();
            kotlin.jvm.internal.l.d(d10, "myProcessName()");
        } else if ((i7 < 28 || d10 == null) && (d10 = M5.c.d()) == null) {
            d10 = "";
        }
        byte[] bytes = d10.getBytes(AbstractC0796a.f12815a);
        kotlin.jvm.internal.l.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        f543a = y.S.b("firebase_session_", encodeToString, "_data");
        f544b = y.S.b("firebase_session_", encodeToString, "_settings");
    }
}
