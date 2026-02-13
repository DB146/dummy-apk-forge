package O5;

import E3.e;
import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f7477b;

    /* renamed from: a, reason: collision with root package name */
    public e f7478a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, O5.c] */
    static {
        ?? obj = new Object();
        obj.f7478a = null;
        f7477b = obj;
    }

    public static e a(Context context) {
        e eVar;
        c cVar = f7477b;
        synchronized (cVar) {
            try {
                if (cVar.f7478a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f7478a = new e(context, 5);
                }
                eVar = cVar.f7478a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
