package fb;

import gb.o;
import xb.AbstractC2275c;

/* renamed from: fb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1148b {

    /* renamed from: a, reason: collision with root package name */
    public static final o f17036a;

    static {
        try {
            C1151e c1151e = AbstractC1147a.f17035a;
            if (c1151e == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f17036a = c1151e;
        } catch (Throwable th) {
            throw AbstractC2275c.b(th);
        }
    }

    public static o a() {
        o oVar = f17036a;
        if (oVar != null) {
            return oVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
