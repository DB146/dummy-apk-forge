package Y;

import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.C0517u;
import java.util.ArrayList;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11044a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final l f11045b = new l(0, new long[0], new Object[0]);

    public static final int a(int i7, int i10) {
        return i7 << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(C0506o c0506o, Rb.e eVar) {
        kotlin.jvm.internal.l.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        y.b(2, eVar);
        eVar.invoke(c0506o, 1);
    }

    public static final e d(int i7, Db.c cVar, C0506o c0506o) {
        Object H10 = c0506o.H();
        if (H10 == C0498k.f8409a) {
            H10 = new e(i7, cVar, true);
            c0506o.d0(H10);
        }
        e eVar = (e) H10;
        if (!kotlin.jvm.internal.l.a(eVar.f11041c, cVar)) {
            boolean z8 = eVar.f11041c == null;
            eVar.f11041c = cVar;
            if (!z8 && eVar.f11040b) {
                C0505n0 c0505n0 = eVar.f11042d;
                if (c0505n0 != null) {
                    C0517u c0517u = c0505n0.f8430b;
                    if (c0517u != null) {
                        c0517u.q(c0505n0, null);
                    }
                    eVar.f11042d = null;
                }
                ArrayList arrayList = eVar.f11043e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C0505n0 c0505n02 = (C0505n0) arrayList.get(i10);
                        C0517u c0517u2 = c0505n02.f8430b;
                        if (c0517u2 != null) {
                            c0517u2.q(c0505n02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return eVar;
    }

    public static final boolean e(C0505n0 c0505n0, C0505n0 c0505n02) {
        return c0505n0 == null || ((c0505n0 instanceof C0505n0) && (!c0505n0.b() || c0505n0.equals(c0505n02) || kotlin.jvm.internal.l.a(c0505n0.f8431c, c0505n02.f8431c)));
    }
}
