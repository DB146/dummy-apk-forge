package O7;

import I7.o;
import L7.C0385e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements Iterable {

    /* renamed from: c, reason: collision with root package name */
    public static final I7.b f7493c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f7494d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7495a;

    /* renamed from: b, reason: collision with root package name */
    public final I7.c f7496b;

    static {
        I7.b bVar = new I7.b(o.f5257a);
        f7493c = bVar;
        f7494d = new g(null, bVar);
    }

    public g(Comparable comparable) {
        this(comparable, f7493c);
    }

    public g(Object obj, I7.c cVar) {
        this.f7495a = obj;
        this.f7496b = cVar;
    }

    public final g C(C0385e c0385e, g gVar) {
        if (c0385e.isEmpty()) {
            return gVar;
        }
        T7.c C2 = c0385e.C();
        I7.c cVar = this.f7496b;
        g gVar2 = (g) cVar.i(C2);
        if (gVar2 == null) {
            gVar2 = f7494d;
        }
        g C10 = gVar2.C(c0385e.F(), gVar);
        return new g(this.f7495a, C10.isEmpty() ? cVar.D(C2) : cVar.C(C10, C2));
    }

    public final g D(C0385e c0385e) {
        if (c0385e.isEmpty()) {
            return this;
        }
        g gVar = (g) this.f7496b.i(c0385e.C());
        return gVar != null ? gVar.D(c0385e.F()) : f7494d;
    }

    public final C0385e b(C0385e c0385e, i iVar) {
        C0385e b2;
        Object obj = this.f7495a;
        if (obj != null && iVar.d(obj)) {
            return C0385e.f6337d;
        }
        if (c0385e.isEmpty()) {
            return null;
        }
        T7.c C2 = c0385e.C();
        g gVar = (g) this.f7496b.i(C2);
        if (gVar == null || (b2 = gVar.b(c0385e.F(), iVar)) == null) {
            return null;
        }
        return new C0385e(C2).i(b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        I7.c cVar = gVar.f7496b;
        I7.c cVar2 = this.f7496b;
        if (cVar2 == null ? cVar != null : !cVar2.equals(cVar)) {
            return false;
        }
        Object obj2 = gVar.f7495a;
        Object obj3 = this.f7495a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f7495a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        I7.c cVar = this.f7496b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final Object i(C0385e c0385e, f fVar, Object obj) {
        for (Map.Entry entry : this.f7496b) {
            obj = ((g) entry.getValue()).i(c0385e.o((T7.c) entry.getKey()), fVar, obj);
        }
        Object obj2 = this.f7495a;
        return obj2 != null ? fVar.l(c0385e, obj2, obj) : obj;
    }

    public final boolean isEmpty() {
        return this.f7495a == null && this.f7496b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        i(C0385e.f6337d, new e(arrayList), null);
        return arrayList.iterator();
    }

    public final Object o(C0385e c0385e) {
        if (c0385e.isEmpty()) {
            return this.f7495a;
        }
        g gVar = (g) this.f7496b.i(c0385e.C());
        if (gVar != null) {
            return gVar.o(c0385e.F());
        }
        return null;
    }

    public final g t(T7.c cVar) {
        g gVar = (g) this.f7496b.i(cVar);
        return gVar != null ? gVar : f7494d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableTree { value=");
        sb2.append(this.f7495a);
        sb2.append(", children={");
        for (Map.Entry entry : this.f7496b) {
            sb2.append(((T7.c) entry.getKey()).f9331a);
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        sb2.append("} }");
        return sb2.toString();
    }

    public final g y(C0385e c0385e) {
        boolean isEmpty = c0385e.isEmpty();
        g gVar = f7494d;
        I7.c cVar = this.f7496b;
        if (isEmpty) {
            return cVar.isEmpty() ? gVar : new g(null, cVar);
        }
        T7.c C2 = c0385e.C();
        g gVar2 = (g) cVar.i(C2);
        if (gVar2 == null) {
            return this;
        }
        g y10 = gVar2.y(c0385e.F());
        I7.c D10 = y10.isEmpty() ? cVar.D(C2) : cVar.C(y10, C2);
        Object obj = this.f7495a;
        return (obj == null && D10.isEmpty()) ? gVar : new g(obj, D10);
    }

    public final g z(C0385e c0385e, Object obj) {
        boolean isEmpty = c0385e.isEmpty();
        I7.c cVar = this.f7496b;
        if (isEmpty) {
            return new g(obj, cVar);
        }
        T7.c C2 = c0385e.C();
        g gVar = (g) cVar.i(C2);
        if (gVar == null) {
            gVar = f7494d;
        }
        return new g(this.f7495a, cVar.C(gVar.z(c0385e.F(), obj), C2));
    }
}
