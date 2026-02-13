package U6;

import W6.C0593b;
import W6.E;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class e {
    static {
        a[] aVarArr = {new a(1)};
        HashMap hashMap = new HashMap();
        a aVar = aVarArr[0];
        aVar.getClass();
        if (hashMap.containsKey(S6.b.class)) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + S6.b.class.getCanonicalName());
        }
        hashMap.put(S6.b.class, aVar);
        aVarArr[0].getClass();
        Collections.unmodifiableMap(hashMap);
        int i7 = E.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        S6.g.d(new c());
        S6.g.d(new c(C0593b.class, new a[]{new a(0)}));
        Object obj = new Object();
        synchronized (S6.g.class) {
            try {
                ConcurrentHashMap concurrentHashMap = S6.g.f9182e;
                if (concurrentHashMap.containsKey(S6.b.class)) {
                    S6.e eVar = (S6.e) concurrentHashMap.get(S6.b.class);
                    if (!g.class.equals(eVar.getClass())) {
                        S6.g.f9178a.warning("Attempted overwrite of a registered SetWrapper for type " + S6.b.class);
                        throw new GeneralSecurityException("SetWrapper for primitive (" + S6.b.class.getName() + ") is already registered to be " + eVar.getClass().getName() + ", cannot be re-registered with " + g.class.getName());
                    }
                }
                concurrentHashMap.put(S6.b.class, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
