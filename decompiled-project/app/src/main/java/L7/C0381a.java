package L7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: L7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381a implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0381a f6320b = new C0381a(new O7.g(null));

    /* renamed from: a, reason: collision with root package name */
    public final O7.g f6321a;

    public C0381a(O7.g gVar) {
        this.f6321a = gVar;
    }

    public static T7.s t(C0385e c0385e, O7.g gVar, T7.s sVar) {
        T7.c cVar;
        Object obj = gVar.f7495a;
        if (obj != null) {
            return sVar.l(c0385e, (T7.s) obj);
        }
        Iterator it = gVar.f7496b.iterator();
        T7.s sVar2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = T7.c.f9330d;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            O7.g gVar2 = (O7.g) entry.getValue();
            T7.c cVar2 = (T7.c) entry.getKey();
            if (cVar2.equals(cVar)) {
                O7.k.b("Priority writes must always be leaf nodes", gVar2.f7495a != null);
                sVar2 = (T7.s) gVar2.f7495a;
            } else {
                sVar = t(c0385e.o(cVar2), gVar2, sVar);
            }
        }
        return (sVar.k(c0385e).isEmpty() || sVar2 == null) ? sVar : sVar.l(c0385e.o(cVar), sVar2);
    }

    public static C0381a z(HashMap hashMap) {
        O7.g gVar = O7.g.f7494d;
        for (Map.Entry entry : hashMap.entrySet()) {
            gVar = gVar.C((C0385e) entry.getKey(), new O7.g((T7.s) entry.getValue()));
        }
        return new C0381a(gVar);
    }

    public final T7.s C(C0385e c0385e) {
        U9.i iVar = O7.i.f7499h;
        O7.g gVar = this.f6321a;
        C0385e b2 = gVar.b(c0385e, iVar);
        if (b2 != null) {
            return ((T7.s) gVar.o(b2)).k(C0385e.E(b2, c0385e));
        }
        return null;
    }

    public final HashMap D() {
        HashMap hashMap = new HashMap();
        C3.x xVar = new C3.x(hashMap);
        O7.g gVar = this.f6321a;
        gVar.getClass();
        gVar.i(C0385e.f6337d, xVar, null);
        return hashMap;
    }

    public final C0381a b(C0385e c0385e, T7.s sVar) {
        if (c0385e.isEmpty()) {
            return new C0381a(new O7.g(sVar));
        }
        U9.i iVar = O7.i.f7499h;
        O7.g gVar = this.f6321a;
        C0385e b2 = gVar.b(c0385e, iVar);
        if (b2 == null) {
            return new C0381a(gVar.C(c0385e, new O7.g(sVar)));
        }
        C0385e E10 = C0385e.E(b2, c0385e);
        T7.s sVar2 = (T7.s) gVar.o(b2);
        T7.c z8 = E10.z();
        return (z8 != null && z8.equals(T7.c.f9330d) && sVar2.k(E10.D()).isEmpty()) ? this : new C0381a(gVar.z(b2, sVar2.l(E10, sVar)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0381a.class) {
            return false;
        }
        return ((C0381a) obj).D().equals(D());
    }

    public final int hashCode() {
        return D().hashCode();
    }

    public final C0381a i(C0385e c0385e, C0381a c0381a) {
        O7.g gVar = c0381a.f6321a;
        D5.i iVar = new D5.i(c0385e, 21);
        gVar.getClass();
        return (C0381a) gVar.i(C0385e.f6337d, iVar, this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6321a.iterator();
    }

    public final T7.s o(T7.s sVar) {
        return t(C0385e.f6337d, this.f6321a, sVar);
    }

    public final String toString() {
        return "CompoundWrite{" + D().toString() + "}";
    }

    public final C0381a y(C0385e c0385e) {
        if (c0385e.isEmpty()) {
            return this;
        }
        T7.s C2 = C(c0385e);
        return C2 != null ? new C0381a(new O7.g(C2)) : new C0381a(this.f6321a.D(c0385e));
    }
}
