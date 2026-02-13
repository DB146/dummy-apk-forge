package p7;

import j8.InterfaceC1387b;
import java.util.Set;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1858b {
    default Object a(Class cls) {
        return g(p.a(cls));
    }

    default Set b(p pVar) {
        return (Set) c(pVar).get();
    }

    InterfaceC1387b c(p pVar);

    default InterfaceC1387b d(Class cls) {
        return h(p.a(cls));
    }

    n e(p pVar);

    default n f(Class cls) {
        return e(p.a(cls));
    }

    default Object g(p pVar) {
        InterfaceC1387b h10 = h(pVar);
        if (h10 == null) {
            return null;
        }
        return h10.get();
    }

    InterfaceC1387b h(p pVar);
}
