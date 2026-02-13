package L7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f6368b = new l();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6369a = new HashMap();

    public static j a(C0384d c0384d, k kVar) {
        j jVar;
        l lVar = f6368b;
        lVar.getClass();
        synchronized (c0384d) {
            if (!c0384d.j) {
                c0384d.j = true;
                c0384d.d();
            }
        }
        String str = "https://" + kVar.f6365a + "/" + kVar.f6367c;
        synchronized (lVar.f6369a) {
            try {
                if (!lVar.f6369a.containsKey(c0384d)) {
                    lVar.f6369a.put(c0384d, new HashMap());
                }
                Map map = (Map) lVar.f6369a.get(c0384d);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                jVar = new j(c0384d, kVar);
                map.put(str, jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
