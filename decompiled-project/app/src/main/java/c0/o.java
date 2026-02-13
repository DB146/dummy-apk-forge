package c0;

import B0.C0165a;
import Q.C0506o;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f14126a = new StackTraceElement[0];

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final m b(C0506o c0506o, m mVar) {
        if (mVar.b(i.f14109a)) {
            return mVar;
        }
        c0506o.T(1219399079);
        m mVar2 = (m) mVar.a(j.f14110a, new C0165a(c0506o, 6));
        c0506o.p(false);
        return mVar2;
    }

    public static final m c(C0506o c0506o, m mVar) {
        c0506o.S(439770924);
        m b2 = b(c0506o, mVar);
        c0506o.p(false);
        return b2;
    }
}
