package r8;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final long f23861d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f23862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23864c;

    public p(long j, String str, String str2) {
        this.f23862a = str;
        this.f23863b = str2;
        this.f23864c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
            return null;
        }
    }

    public static p b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new p(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new p(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
            return null;
        }
    }
}
