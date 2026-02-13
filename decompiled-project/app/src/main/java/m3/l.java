package m3;

import cc.A;
import cc.D0;
import cc.F;
import h3.z;
import q3.p;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19799a;

    static {
        String g = z.g("WorkConstraintsTracker");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f19799a = g;
    }

    public static final D0 a(O3.c cVar, p pVar, A dispatcher, h listener) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        kotlin.jvm.internal.l.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.l.e(listener, "listener");
        return F.B(F.b(dispatcher), null, 0, new k(cVar, pVar, listener, null), 3);
    }
}
