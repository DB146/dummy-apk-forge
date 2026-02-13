package w2;

import Q.C0480b;
import Q.C0487e0;
import fc.L;
import fc.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l2.EnumC1474s;
import v2.AbstractC2127A;
import v2.C2133e;
import v2.C2137i;

@v2.z("composable")
/* loaded from: classes.dex */
public final class i extends AbstractC2127A {

    /* renamed from: c, reason: collision with root package name */
    public final C0487e0 f25681c = C0480b.o(Boolean.FALSE);

    @Override // v2.AbstractC2127A
    public final v2.q a() {
        return new h(this, AbstractC2206c.f25677a);
    }

    @Override // v2.AbstractC2127A
    public final void d(List list, v2.x xVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2133e backStackEntry = (C2133e) it.next();
            C2137i b2 = b();
            kotlin.jvm.internal.l.e(backStackEntry, "backStackEntry");
            b0 b0Var = b2.f24982c;
            Iterable iterable = (Iterable) b0Var.getValue();
            boolean z8 = iterable instanceof Collection;
            L l10 = b2.f24984e;
            if (!z8 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C2133e) it2.next()) == backStackEntry) {
                        Iterable iterable2 = (Iterable) ((b0) l10.f17078a).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C2133e) it3.next()) == backStackEntry) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C2133e c2133e = (C2133e) Eb.o.f0((List) ((b0) l10.f17078a).getValue());
            if (c2133e != null) {
                b0Var.j(null, O5.b.C((Set) b0Var.getValue(), c2133e));
            }
            b0Var.j(null, O5.b.C((Set) b0Var.getValue(), backStackEntry));
            b2.f(backStackEntry);
        }
        this.f25681c.setValue(Boolean.FALSE);
    }

    @Override // v2.AbstractC2127A
    public final void e(C2133e c2133e, boolean z8) {
        b().e(c2133e, z8);
        this.f25681c.setValue(Boolean.TRUE);
    }

    public final void g(C2133e entry) {
        C2137i b2 = b();
        kotlin.jvm.internal.l.e(entry, "entry");
        b0 b0Var = b2.f24982c;
        b0Var.j(null, O5.b.C((Set) b0Var.getValue(), entry));
        y2.f fVar = b2.f24986h.f25026b;
        fVar.getClass();
        if (!fVar.f26770f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.c(EnumC1474s.f19230d);
    }
}
