package r3;

import h3.z;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f23693e = z.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final H7.e f23694a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23695b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23696c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f23697d = new Object();

    public s(H7.e eVar) {
        this.f23694a = eVar;
    }

    public final void a(q3.j jVar) {
        synchronized (this.f23697d) {
            try {
                if (((r) this.f23695b.remove(jVar)) != null) {
                    z.e().a(f23693e, "Stopping timer for " + jVar);
                    this.f23696c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
