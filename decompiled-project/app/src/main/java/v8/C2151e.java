package v8;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: v8.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2151e {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f25209h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25210a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f25211b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f25212c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f25213d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f25214e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25215f;
    public final JSONArray g;

    public C2151e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f25211b = jSONObject;
        this.f25212c = date;
        this.f25213d = jSONArray;
        this.f25214e = jSONObject2;
        this.f25215f = j;
        this.g = jSONArray2;
        this.f25210a = jSONObject3;
    }

    public static C2151e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new C2151e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v8.d] */
    public static C2150d c() {
        ?? obj = new Object();
        obj.f25203a = new JSONObject();
        obj.f25204b = f25209h;
        obj.f25205c = new JSONArray();
        obj.f25206d = new JSONObject();
        obj.f25207e = 0L;
        obj.f25208f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            JSONArray jSONArray = this.g;
            if (i7 >= jSONArray.length()) {
                return hashMap;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2151e) {
            return this.f25210a.toString().equals(((C2151e) obj).f25210a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f25210a.hashCode();
    }

    public final String toString() {
        return this.f25210a.toString();
    }
}
