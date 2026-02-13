package T7;

import L7.C0385e;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final k f9348e = new f();

    @Override // T7.f, T7.s
    public final Iterator A() {
        return Collections.emptyList().iterator();
    }

    @Override // T7.f, java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return sVar.isEmpty() ? 0 : -1;
    }

    @Override // T7.f, T7.s
    public final String c() {
        return "";
    }

    @Override // T7.f, T7.s
    public final s e() {
        return this;
    }

    @Override // T7.f
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.isEmpty() && equals(sVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // T7.f, T7.s
    public final Object getValue() {
        return null;
    }

    @Override // T7.f, T7.s
    public final s h(c cVar) {
        return this;
    }

    @Override // T7.f
    public final int hashCode() {
        return 0;
    }

    @Override // T7.f, T7.s
    public final boolean isEmpty() {
        return true;
    }

    @Override // T7.f, java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // T7.f, T7.s
    public final s k(C0385e c0385e) {
        return this;
    }

    @Override // T7.f, T7.s
    public final s l(C0385e c0385e, s sVar) {
        return c0385e.isEmpty() ? sVar : w(c0385e.C(), l(c0385e.F(), sVar));
    }

    @Override // T7.f, T7.s
    public final String m(int i7) {
        return "";
    }

    @Override // T7.f, T7.s
    public final boolean n(c cVar) {
        return false;
    }

    @Override // T7.f, T7.s
    public final int q() {
        return 0;
    }

    @Override // T7.f, T7.s
    public final s s(s sVar) {
        return this;
    }

    @Override // T7.f
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // T7.f, T7.s
    public final s w(c cVar, s sVar) {
        if (sVar.isEmpty()) {
            return this;
        }
        c cVar2 = c.f9330d;
        if (cVar.equals(cVar2)) {
            return this;
        }
        I7.c bVar = new I7.b(f.f9334d);
        boolean equals = cVar.equals(cVar2);
        k kVar = f9348e;
        if (equals) {
            return bVar.isEmpty() ? kVar : new f(bVar, sVar);
        }
        if (bVar.b(cVar)) {
            bVar = bVar.D(cVar);
        }
        if (!sVar.isEmpty()) {
            bVar = bVar.C(sVar, cVar);
        }
        return bVar.isEmpty() ? kVar : new f(bVar, kVar);
    }

    @Override // T7.f, T7.s
    public final Object x(boolean z8) {
        return null;
    }
}
