package okhttp3;

import A3.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f22266a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f22267b;

    public Challenge(String str, Map map) {
        String str2;
        this.f22266a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null) {
                Locale US = Locale.US;
                l.d(US, "US");
                str2 = str3.toLowerCase(US);
                l.d(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.d(unmodifiableMap, "unmodifiableMap(...)");
        this.f22267b = unmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (l.a(challenge.f22266a, this.f22266a) && l.a(challenge.f22267b, this.f22267b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22267b.hashCode() + c.d(899, 31, this.f22266a);
    }

    public final String toString() {
        return this.f22266a + " authParams=" + this.f22267b;
    }
}
