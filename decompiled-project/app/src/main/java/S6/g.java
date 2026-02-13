package S6;

import I2.I;
import W6.q;
import W6.t;
import i2.C1332t;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f9178a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f9179b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f9180c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f9181d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f9182e;

    static {
        new ConcurrentHashMap();
        f9182e = new ConcurrentHashMap();
    }

    public static synchronized void a(Class cls, String str) {
        synchronized (g.class) {
            try {
                ConcurrentHashMap concurrentHashMap = f9179b;
                if (concurrentHashMap.containsKey(str)) {
                    f fVar = (f) concurrentHashMap.get(str);
                    if (fVar.f9177a.getClass().equals(cls)) {
                        if (((Boolean) f9181d.get(str)).booleanValue()) {
                            return;
                        }
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    f9178a.warning("Attempted overwrite of a registered key manager for key type " + str);
                    throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + fVar.f9177a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized f b(String str) {
        f fVar;
        synchronized (g.class) {
            ConcurrentHashMap concurrentHashMap = f9179b;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            fVar = (f) concurrentHashMap.get(str);
        }
        return fVar;
    }

    public static synchronized q c(t tVar) {
        q D10;
        synchronized (g.class) {
            I i7 = b(tVar.q()).f9177a;
            R7.a aVar = new R7.a(i7, (Class) i7.f5050c);
            if (!((Boolean) f9181d.get(tVar.q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + tVar.q());
            }
            D10 = aVar.D(tVar.r());
        }
        return D10;
    }

    public static synchronized void d(I i7) {
        synchronized (g.class) {
            try {
                String g = i7.g();
                a(i7.getClass(), g);
                ConcurrentHashMap concurrentHashMap = f9179b;
                if (!concurrentHashMap.containsKey(g)) {
                    concurrentHashMap.put(g, new f(i7));
                    f9180c.put(g, new C1332t(14));
                }
                f9181d.put(g, Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
