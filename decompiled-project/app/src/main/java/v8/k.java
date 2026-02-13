package v8;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f25252e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f25253f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25254a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25255b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f25256c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f25257d = new Object();

    public k(SharedPreferences sharedPreferences) {
        this.f25254a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v8.j, java.lang.Object] */
    public final j a() {
        ?? obj;
        synchronized (this.f25256c) {
            int i7 = this.f25254a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f25254a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f25250a = i7;
            obj.f25251b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f25254a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v8.j, java.lang.Object] */
    public final j c() {
        ?? obj;
        synchronized (this.f25257d) {
            int i7 = this.f25254a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f25254a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f25250a = i7;
            obj.f25251b = date;
        }
        return obj;
    }

    public final void d(int i7, Date date) {
        synchronized (this.f25256c) {
            this.f25254a.edit().putInt("num_failed_fetches", i7).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i7, Date date) {
        synchronized (this.f25257d) {
            this.f25254a.edit().putInt("num_failed_realtime_streams", i7).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
