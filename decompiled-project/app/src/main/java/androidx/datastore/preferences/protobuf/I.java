package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class I {
    public static int a(int i7, Object obj, Object obj2) {
        H h10 = (H) obj;
        G g = (G) obj2;
        int i10 = 0;
        if (!h10.isEmpty()) {
            for (Map.Entry entry : h10.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                g.getClass();
                int h02 = C0808k.h0(i7);
                int a9 = G.a(g.f13329a, key, value);
                i10 += C0808k.j0(a9) + a9 + h02;
            }
        }
        return i10;
    }

    public static H b(Object obj, Object obj2) {
        H h10 = (H) obj;
        H h11 = (H) obj2;
        if (!h11.isEmpty()) {
            if (!h10.f13331a) {
                h10 = h10.b();
            }
            h10.a();
            if (!h11.isEmpty()) {
                h10.putAll(h11);
            }
        }
        return h10;
    }

    public static void c(Object obj) {
        ((H) obj).f13331a = false;
    }
}
