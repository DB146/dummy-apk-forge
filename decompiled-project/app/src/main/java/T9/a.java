package T9;

import M9.c;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Type f9383a = N8.a.a(Map.class, String.class, String.class).f7387b;

    public static c a(String str) {
        l.e(str, "str");
        try {
            return c.valueOf(str);
        } catch (Exception unused) {
            return c.f6846a;
        }
    }

    public static LinkedHashMap b(String str) {
        LinkedHashMap linkedHashMap;
        if (str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = jSONObject.keys();
                l.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return linkedHashMap;
    }
}
