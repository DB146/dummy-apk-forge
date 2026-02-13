package L7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: d, reason: collision with root package name */
    public static final U9.i f6316d = new U9.i(9);

    /* renamed from: a, reason: collision with root package name */
    public Object f6317a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6318b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6319c;

    public static C0381a b(ArrayList arrayList, O7.i iVar, C0385e c0385e) {
        C0381a c0381a = C0381a.f6320b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d10 = (D) it.next();
            if (iVar.d(d10)) {
                C0385e c0385e2 = d10.f6313b;
                if (d10.c()) {
                    if (c0385e.y(c0385e2)) {
                        c0381a = c0381a.b(C0385e.E(c0385e, c0385e2), d10.b());
                    } else if (c0385e2.y(c0385e)) {
                        c0381a = c0381a.b(C0385e.f6337d, d10.b().k(C0385e.E(c0385e2, c0385e)));
                    }
                } else if (c0385e.y(c0385e2)) {
                    c0381a = c0381a.i(C0385e.E(c0385e, c0385e2), d10.a());
                } else if (c0385e2.y(c0385e)) {
                    C0385e E10 = C0385e.E(c0385e2, c0385e);
                    if (E10.isEmpty()) {
                        c0381a = c0381a.i(C0385e.f6337d, d10.a());
                    } else {
                        T7.s C2 = d10.a().C(E10);
                        if (C2 != null) {
                            c0381a = c0381a.b(C0385e.f6337d, C2);
                        }
                    }
                }
            }
        }
        return c0381a;
    }

    public T7.s a(C0385e c0385e, T7.s sVar, List list, boolean z8) {
        if (list.isEmpty() && !z8) {
            T7.s C2 = ((C0381a) this.f6317a).C(c0385e);
            if (C2 != null) {
                return C2;
            }
            C0381a y10 = ((C0381a) this.f6317a).y(c0385e);
            if (y10.f6321a.isEmpty()) {
                return sVar;
            }
            if (sVar == null && y10.C(C0385e.f6337d) == null) {
                return null;
            }
            if (sVar == null) {
                sVar = T7.k.f9348e;
            }
            return y10.o(sVar);
        }
        C0381a y11 = ((C0381a) this.f6317a).y(c0385e);
        if (!z8 && y11.f6321a.isEmpty()) {
            return sVar;
        }
        if (!z8 && sVar == null && y11.C(C0385e.f6337d) == null) {
            return null;
        }
        C0381a b2 = b((ArrayList) this.f6318b, new q3.l(z8, list, c0385e), c0385e);
        if (sVar == null) {
            sVar = T7.k.f9348e;
        }
        return b2.o(sVar);
    }

    public List c(G7.b bVar) {
        Q7.g gVar = (Q7.g) this.f6317a;
        z zVar = (z) this.f6319c;
        if (bVar != null) {
            zVar.f6417h.b0("Listen at " + gVar.f8687a.f8685a + " failed: " + bVar.toString());
            return zVar.h(gVar.f8687a, null, bVar, false);
        }
        Q7.f fVar = gVar.f8687a;
        A a9 = (A) this.f6318b;
        if (a9 != null) {
            zVar.getClass();
            return (List) zVar.g.c(new r(2, zVar, a9));
        }
        C0385e c0385e = fVar.f8685a;
        zVar.getClass();
        return (List) zVar.g.c(new r(1, zVar, c0385e));
    }
}
