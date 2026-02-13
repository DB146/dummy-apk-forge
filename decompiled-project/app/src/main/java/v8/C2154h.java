package v8;

import P4.G;
import android.util.Log;
import h3.o;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: v8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2154h {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f25227e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f25228f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f25229a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f25230b;

    /* renamed from: c, reason: collision with root package name */
    public final C2149c f25231c;

    /* renamed from: d, reason: collision with root package name */
    public final C2149c f25232d;

    static {
        Charset.forName("UTF-8");
        f25227e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f25228f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C2154h(Executor executor, C2149c c2149c, C2149c c2149c2) {
        this.f25230b = executor;
        this.f25231c = c2149c;
        this.f25232d = c2149c2;
    }

    public static String b(C2149c c2149c, String str) {
        C2151e c10 = c2149c.c();
        if (c10 == null) {
            return null;
        }
        try {
            return c10.f25211b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", o.n("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, C2151e c2151e) {
        if (c2151e == null) {
            return;
        }
        synchronized (this.f25229a) {
            try {
                Iterator it = this.f25229a.iterator();
                while (it.hasNext()) {
                    this.f25230b.execute(new G((u8.h) it.next(), str, c2151e, 14));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
