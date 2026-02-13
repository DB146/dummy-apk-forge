package T7;

import H2.C0297k;
import L7.C0385e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final C0297k f9334d = new C0297k(9);

    /* renamed from: a, reason: collision with root package name */
    public final I7.c f9335a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9336b;

    /* renamed from: c, reason: collision with root package name */
    public String f9337c;

    public f() {
        this.f9337c = null;
        this.f9335a = new I7.b(f9334d);
        this.f9336b = k.f9348e;
    }

    public f(I7.c cVar, s sVar) {
        this.f9337c = null;
        if (cVar.isEmpty() && !sVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f9336b = sVar;
        this.f9335a = cVar;
    }

    @Override // T7.s
    public Iterator A() {
        return new I7.e(this.f9335a.A(), 2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(s sVar) {
        if (isEmpty()) {
            return sVar.isEmpty() ? 0 : -1;
        }
        if (sVar.p() || sVar.isEmpty()) {
            return 1;
        }
        return sVar == s.k ? -1 : 0;
    }

    @Override // T7.s
    public String c() {
        if (this.f9337c == null) {
            String m10 = m(1);
            this.f9337c = m10.isEmpty() ? "" : O7.k.e(m10);
        }
        return this.f9337c;
    }

    @Override // T7.s
    public s e() {
        return this.f9336b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!e().equals(fVar.e())) {
            return false;
        }
        I7.c cVar = this.f9335a;
        int size = cVar.size();
        I7.c cVar2 = fVar.f9335a;
        if (size != cVar2.size()) {
            return false;
        }
        Iterator it = cVar.iterator();
        Iterator it2 = cVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((c) entry.getKey()).equals(entry2.getKey()) || !((s) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // T7.s
    public Object getValue() {
        return x(false);
    }

    @Override // T7.s
    public s h(c cVar) {
        if (cVar.equals(c.f9330d)) {
            s sVar = this.f9336b;
            if (!sVar.isEmpty()) {
                return sVar;
            }
        }
        I7.c cVar2 = this.f9335a;
        return cVar2.b(cVar) ? (s) cVar2.i(cVar) : k.f9348e;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            i7 = A3.c.d(i7 * 31, 17, qVar.f9359a.f9331a) + qVar.f9360b.hashCode();
        }
        return i7;
    }

    public final void i(e eVar, boolean z8) {
        I7.c cVar = this.f9335a;
        if (!z8 || e().isEmpty()) {
            cVar.z(eVar);
        } else {
            cVar.z(new d(this, eVar));
        }
    }

    @Override // T7.s
    public boolean isEmpty() {
        return this.f9335a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new I7.e(this.f9335a.iterator(), 2);
    }

    @Override // T7.s
    public s k(C0385e c0385e) {
        c C2 = c0385e.C();
        return C2 == null ? this : h(C2).k(c0385e.F());
    }

    @Override // T7.s
    public s l(C0385e c0385e, s sVar) {
        c C2 = c0385e.C();
        if (C2 == null) {
            return sVar;
        }
        if (!C2.equals(c.f9330d)) {
            return w(C2, h(C2).l(c0385e.F(), sVar));
        }
        O7.k.c(com.bumptech.glide.c.I(sVar));
        return s(sVar);
    }

    @Override // T7.s
    public String m(int i7) {
        boolean z8;
        if (i7 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb2 = new StringBuilder();
        s sVar = this.f9336b;
        if (!sVar.isEmpty()) {
            sb2.append("priority:");
            sb2.append(sVar.m(1));
            sb2.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            z8 = false;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                arrayList.add(qVar);
                if (z8 || !qVar.f9360b.e().isEmpty()) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            Collections.sort(arrayList, t.f9361a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q qVar2 = (q) it2.next();
            String c10 = qVar2.f9360b.c();
            if (!c10.equals("")) {
                sb2.append(":");
                sb2.append(qVar2.f9359a.f9331a);
                sb2.append(":");
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    @Override // T7.s
    public boolean n(c cVar) {
        return !h(cVar).isEmpty();
    }

    public final void o(int i7, StringBuilder sb2) {
        int i10;
        I7.c cVar = this.f9335a;
        boolean isEmpty = cVar.isEmpty();
        s sVar = this.f9336b;
        if (isEmpty && sVar.isEmpty()) {
            sb2.append("{ }");
            return;
        }
        sb2.append("{\n");
        Iterator it = cVar.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i11 = i7 + 2;
            while (i10 < i11) {
                sb2.append(" ");
                i10++;
            }
            sb2.append(((c) entry.getKey()).f9331a);
            sb2.append("=");
            if (entry.getValue() instanceof f) {
                ((f) entry.getValue()).o(i11, sb2);
            } else {
                sb2.append(((s) entry.getValue()).toString());
            }
            sb2.append("\n");
        }
        if (!sVar.isEmpty()) {
            int i12 = i7 + 2;
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append(" ");
            }
            sb2.append(".priority=");
            sb2.append(sVar.toString());
            sb2.append("\n");
        }
        while (i10 < i7) {
            sb2.append(" ");
            i10++;
        }
        sb2.append("}");
    }

    @Override // T7.s
    public boolean p() {
        return false;
    }

    @Override // T7.s
    public int q() {
        return this.f9335a.size();
    }

    @Override // T7.s
    public s s(s sVar) {
        I7.c cVar = this.f9335a;
        return cVar.isEmpty() ? k.f9348e : new f(cVar, sVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        o(0, sb2);
        return sb2.toString();
    }

    @Override // T7.s
    public s w(c cVar, s sVar) {
        if (cVar.equals(c.f9330d)) {
            return s(sVar);
        }
        I7.c cVar2 = this.f9335a;
        if (cVar2.b(cVar)) {
            cVar2 = cVar2.D(cVar);
        }
        if (!sVar.isEmpty()) {
            cVar2 = cVar2.C(sVar, cVar);
        }
        return cVar2.isEmpty() ? k.f9348e : new f(cVar2, this.f9336b);
    }

    @Override // T7.s
    public Object x(boolean z8) {
        Integer g;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z10 = true;
        int i7 = 0;
        int i10 = 0;
        for (Map.Entry entry : this.f9335a) {
            String str = ((c) entry.getKey()).f9331a;
            hashMap.put(str, ((s) entry.getValue()).x(z8));
            i7++;
            if (z10) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (g = O7.k.g(str)) == null || g.intValue() < 0) {
                    z10 = false;
                } else if (g.intValue() > i10) {
                    i10 = g.intValue();
                }
            }
        }
        if (z8 || !z10 || i10 >= i7 * 2) {
            if (z8) {
                s sVar = this.f9336b;
                if (!sVar.isEmpty()) {
                    hashMap.put(".priority", sVar.getValue());
                }
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i10 + 1);
        for (int i11 = 0; i11 <= i10; i11++) {
            arrayList.add(hashMap.get("" + i11));
        }
        return arrayList;
    }
}
