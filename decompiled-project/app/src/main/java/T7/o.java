package T7;

import L7.C0385e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f9354a;

    /* renamed from: b, reason: collision with root package name */
    public String f9355b;

    public o(s sVar) {
        this.f9354a = sVar;
    }

    @Override // T7.s
    public final Iterator A() {
        return Collections.emptyList().iterator();
    }

    public abstract int b(o oVar);

    @Override // T7.s
    public final String c() {
        if (this.f9355b == null) {
            this.f9355b = O7.k.e(m(1));
        }
        return this.f9355b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        if (sVar.isEmpty()) {
            return 1;
        }
        if (sVar instanceof f) {
            return -1;
        }
        O7.k.b("Node is not leaf node!", sVar.p());
        if ((this instanceof p) && (sVar instanceof j)) {
            return Double.valueOf(((p) this).f9356c).compareTo(((j) sVar).f9347c);
        }
        if ((this instanceof j) && (sVar instanceof p)) {
            return Double.valueOf(((p) sVar).f9356c).compareTo(((j) this).f9347c) * (-1);
        }
        o oVar = (o) sVar;
        int i7 = i();
        int i10 = oVar.i();
        if (P.c.a(i7, i10)) {
            return b(oVar);
        }
        if (i7 == 0 || i10 == 0) {
            throw null;
        }
        return i7 - i10;
    }

    @Override // T7.s
    public final s e() {
        return this.f9354a;
    }

    @Override // T7.s
    public final s h(c cVar) {
        return cVar.equals(c.f9330d) ? this.f9354a : k.f9348e;
    }

    public abstract int i();

    @Override // T7.s
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // T7.s
    public final s k(C0385e c0385e) {
        return c0385e.isEmpty() ? this : c0385e.C().equals(c.f9330d) ? this.f9354a : k.f9348e;
    }

    @Override // T7.s
    public final s l(C0385e c0385e, s sVar) {
        c C2 = c0385e.C();
        if (C2 == null) {
            return sVar;
        }
        boolean isEmpty = sVar.isEmpty();
        c cVar = c.f9330d;
        if (isEmpty && !C2.equals(cVar)) {
            return this;
        }
        boolean equals = c0385e.C().equals(cVar);
        boolean z8 = true;
        if (equals && c0385e.size() != 1) {
            z8 = false;
        }
        O7.k.c(z8);
        return w(C2, k.f9348e.l(c0385e.F(), sVar));
    }

    @Override // T7.s
    public final boolean n(c cVar) {
        return false;
    }

    public final String o(int i7) {
        int b2 = P.c.b(i7);
        if (b2 != 0 && b2 != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(A3.c.u(i7)));
        }
        s sVar = this.f9354a;
        if (sVar.isEmpty()) {
            return "";
        }
        return "priority:" + sVar.m(i7) + ":";
    }

    @Override // T7.s
    public final boolean p() {
        return true;
    }

    @Override // T7.s
    public final int q() {
        return 0;
    }

    public final String toString() {
        String obj = x(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // T7.s
    public final s w(c cVar, s sVar) {
        return cVar.equals(c.f9330d) ? s(sVar) : sVar.isEmpty() ? this : k.f9348e.w(cVar, sVar).s(this.f9354a);
    }

    @Override // T7.s
    public final Object x(boolean z8) {
        if (z8) {
            s sVar = this.f9354a;
            if (!sVar.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put(".value", getValue());
                hashMap.put(".priority", sVar.getValue());
                return hashMap;
            }
        }
        return getValue();
    }
}
