package D7;

import D5.i;
import Y5.C0660y;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import t8.C2034c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f3269a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3270b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3271c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3272d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3273e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3274f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3275h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3276i;

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder m10 = X.c.m(str);
        m10.append(jSONObject.toString());
        String sb2 = m10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public b a(int i7) {
        b bVar = null;
        try {
            if (!P.c.a(2, i7)) {
                JSONObject v10 = ((i) this.f3273e).v();
                if (v10 != null) {
                    b k = ((C2034c) this.f3271c).k(v10);
                    c(v10, "Loaded cached settings: ");
                    ((C0660y) this.f3272d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (P.c.a(3, i7) || k.f3263c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            bVar = k;
                        } catch (Exception e2) {
                            e = e2;
                            bVar = k;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        return bVar;
    }

    public b b() {
        return (b) ((AtomicReference) this.f3275h).get();
    }
}
