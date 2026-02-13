package Z0;

import Db.q;
import Q.C0506o;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class g extends m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12113a = new m(2);

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        int intValue = ((Number) obj2).intValue();
        if (!c0506o.K(intValue & 1, (intValue & 3) != 2)) {
            c0506o.N();
        }
        return q.f3365a;
    }
}
