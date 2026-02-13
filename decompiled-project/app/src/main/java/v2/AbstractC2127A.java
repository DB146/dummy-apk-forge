package v2;

import fc.b0;
import java.util.List;
import java.util.ListIterator;

/* renamed from: v2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2127A {

    /* renamed from: a, reason: collision with root package name */
    public C2137i f24959a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24960b;

    public abstract q a();

    public final C2137i b() {
        C2137i c2137i = this.f24959a;
        if (c2137i != null) {
            return c2137i;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public q c(q qVar) {
        return qVar;
    }

    public void d(List list, x xVar) {
        Zb.e eVar = new Zb.e(new Zb.f(new Zb.j(new Eb.t(list, 0), new Ba.o(this, xVar), 1), false, new Ba.i(8)));
        while (eVar.hasNext()) {
            b().f((C2133e) eVar.next());
        }
    }

    public void e(C2133e c2133e, boolean z8) {
        List list = (List) ((b0) b().f24984e.f17078a).getValue();
        if (!list.contains(c2133e)) {
            throw new IllegalStateException(("popBackStack was called with " + c2133e + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C2133e c2133e2 = null;
        while (f()) {
            c2133e2 = (C2133e) listIterator.previous();
            if (kotlin.jvm.internal.l.a(c2133e2, c2133e)) {
                break;
            }
        }
        if (c2133e2 != null) {
            b().d(c2133e2, z8);
        }
    }

    public boolean f() {
        return true;
    }
}
