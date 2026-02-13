package h7;

import android.util.Log;
import com.google.android.gms.common.internal.G;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17828d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f17829a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17830b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17831c;

    public C1256b(long j, long j10, String str) {
        G.d(str);
        this.f17829a = str;
        this.f17831c = j;
        this.f17830b = j10;
    }

    public static C1256b a(String str) {
        G.g(str);
        Map D10 = tc.b.D(str);
        long c10 = c("iat", D10);
        return new C1256b((c("exp", D10) - c10) * 1000, c10 * 1000, str);
    }

    public static C1256b b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1256b(jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"), jSONObject.getString("token"));
        } catch (JSONException e2) {
            Log.e("h7.b", "Could not deserialize token: " + e2.getMessage());
            return null;
        }
    }

    public static long c(String str, Map map) {
        G.g(map);
        G.d(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
