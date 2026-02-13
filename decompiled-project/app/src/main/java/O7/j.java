package O7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7500a = new HashMap();

    public final String a(String str) {
        String h10 = X.c.h(str, "<value>: null\n");
        HashMap hashMap = this.f7500a;
        if (hashMap.isEmpty()) {
            return X.c.i(h10, str, "<empty>");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder n6 = A3.c.n(h10, str);
            n6.append(entry.getKey());
            n6.append(":\n");
            n6.append(((j) entry.getValue()).a(str + "\t"));
            n6.append("\n");
            h10 = n6.toString();
        }
        return h10;
    }
}
