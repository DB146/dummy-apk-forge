package x7;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f26249a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f26250b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f26251c;

    public e(int i7) {
        this.f26251c = i7;
    }

    public static String a(int i7, String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i7 ? trim.substring(0, i7) : trim;
    }

    public final synchronized boolean b(String str) {
        String a9 = a(this.f26251c, "com.crashlytics.version-control-info");
        if (this.f26249a.size() >= this.f26250b && !this.f26249a.containsKey(a9)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f26250b, null);
            return false;
        }
        String a10 = a(this.f26251c, str);
        String str2 = (String) this.f26249a.get(a9);
        if (str2 == null ? a10 == null : str2.equals(a10)) {
            return false;
        }
        this.f26249a.put(a9, a10);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String a9 = a(this.f26251c, str);
                if (this.f26249a.size() >= this.f26250b && !this.f26249a.containsKey(a9)) {
                    i7++;
                }
                String str2 = (String) entry.getValue();
                this.f26249a.put(a9, str2 == null ? "" : a(this.f26251c, str2));
            }
            if (i7 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f26250b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
