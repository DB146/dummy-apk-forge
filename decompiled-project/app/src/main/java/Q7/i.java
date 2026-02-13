package Q7;

import L7.C0381a;
import L7.C0385e;
import L7.E;
import L7.x;
import O7.k;
import T7.m;
import T7.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q3.l;
import q3.s;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final h8.e f8698b = new h8.e(13);

    /* renamed from: a, reason: collision with root package name */
    public final Object f8699a;

    public i(f fVar) {
        this.f8699a = fVar.f8686b.f8684e;
    }

    public i(R7.e eVar) {
        this.f8699a = eVar;
    }

    public l a(l lVar, C0385e c0385e, C0381a c0381a, s sVar, T7.s sVar2, boolean z8, R7.a aVar) {
        l lVar2;
        T7.c cVar;
        l lVar3 = lVar;
        C0381a c0381a2 = c0381a;
        boolean isEmpty = ((m) ((a) lVar3.f23392c).f8671c).f9350a.isEmpty();
        a aVar2 = (a) lVar3.f23392c;
        if (isEmpty && !aVar2.f8669a) {
            return lVar3;
        }
        k.b("Can't have a merge that is an overwrite", ((T7.s) c0381a2.f6321a.f7495a) == null);
        if (!c0385e.isEmpty()) {
            c0381a2 = C0381a.f6320b.i(c0385e, c0381a2);
        }
        T7.s sVar3 = ((m) aVar2.f8671c).f9350a;
        c0381a2.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : c0381a2.f6321a.f7496b) {
            hashMap.put((T7.c) entry.getKey(), new C0381a((O7.g) entry.getValue()));
        }
        loop1: while (true) {
            lVar2 = lVar3;
            for (Map.Entry entry2 : hashMap.entrySet()) {
                cVar = (T7.c) entry2.getKey();
                if (sVar3.n(cVar)) {
                    break;
                }
            }
            lVar3 = b(lVar2, new C0385e(cVar), ((C0381a) entry2.getValue()).o(sVar3.h(cVar)), sVar, sVar2, z8, aVar);
        }
        l lVar4 = lVar2;
        for (Map.Entry entry3 : hashMap.entrySet()) {
            T7.c cVar2 = (T7.c) entry3.getKey();
            boolean z10 = !aVar2.a(cVar2) && ((T7.s) ((C0381a) entry3.getValue()).f6321a.f7495a) == null;
            if (!sVar3.n(cVar2) && !z10) {
                lVar4 = b(lVar4, new C0385e(cVar2), ((C0381a) entry3.getValue()).o(sVar3.h(cVar2)), sVar, sVar2, z8, aVar);
            }
        }
        return lVar4;
    }

    public l b(l lVar, C0385e c0385e, T7.s sVar, s sVar2, T7.s sVar3, boolean z8, R7.a aVar) {
        m b2;
        a aVar2 = (a) lVar.f23392c;
        R7.e eVar = (R7.e) this.f8699a;
        if (!z8) {
            eVar = eVar.c();
        }
        boolean isEmpty = c0385e.isEmpty();
        m mVar = (m) aVar2.f8671c;
        boolean z10 = true;
        if (isEmpty) {
            b2 = eVar.d(mVar, new m(sVar, eVar.getIndex()), null);
        } else {
            if (!eVar.k() || aVar2.f8670b) {
                T7.c C2 = c0385e.C();
                if (!aVar2.b(c0385e) && c0385e.size() > 1) {
                    return lVar;
                }
                C0385e F10 = c0385e.F();
                T7.s l10 = mVar.f9350a.h(C2).l(F10, sVar);
                if (C2.equals(T7.c.f9330d)) {
                    b2 = eVar.g(mVar, l10);
                } else {
                    b2 = eVar.b((m) aVar2.f8671c, C2, l10, F10, f8698b, null);
                }
                if (!aVar2.f8669a && !c0385e.isEmpty()) {
                    z10 = false;
                }
                l lVar2 = new l(19, (a) lVar.f23391b, new a(b2, z10, eVar.k()), false);
                return d(lVar2, c0385e, sVar2, new h(sVar2, lVar2, sVar3, 0), aVar);
            }
            k.b("An empty path should have been caught in the other branch", !c0385e.isEmpty());
            T7.c C10 = c0385e.C();
            b2 = eVar.d(mVar, mVar.i(C10, mVar.f9350a.h(C10).l(c0385e.F(), sVar)), null);
        }
        if (!aVar2.f8669a) {
            z10 = false;
        }
        l lVar22 = new l(19, (a) lVar.f23391b, new a(b2, z10, eVar.k()), false);
        return d(lVar22, c0385e, sVar2, new h(sVar2, lVar22, sVar3, 0), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l c(l lVar, C0385e c0385e, T7.s sVar, s sVar2, T7.s sVar3, R7.a aVar) {
        T7.s j;
        T7.s sVar4;
        T7.s sVar5 = sVar;
        a aVar2 = (a) lVar.f23391b;
        h hVar = new h(sVar2, lVar, sVar3, 0);
        boolean isEmpty = c0385e.isEmpty();
        R7.e eVar = (R7.e) this.f8699a;
        a aVar3 = (a) lVar.f23391b;
        m mVar = (m) aVar3.f8671c;
        if (isEmpty) {
            return lVar.N(eVar.d(mVar, new m(sVar5, eVar.getIndex()), aVar), true, eVar.k());
        }
        T7.c C2 = c0385e.C();
        T7.c cVar = T7.c.f9330d;
        boolean equals = C2.equals(cVar);
        boolean z8 = aVar2.f8669a;
        if (equals) {
            return lVar.N(eVar.g(mVar, sVar5), z8, aVar2.f8670b);
        }
        C0385e F10 = c0385e.F();
        T7.s h10 = ((m) aVar2.f8671c).f9350a.h(C2);
        if (!F10.isEmpty()) {
            if (aVar3.a(C2)) {
                j = mVar.f9350a.h(C2);
            } else {
                j = sVar2.j(C2, sVar3 != null ? new a(new m(sVar3, n.f9353a), true, false) : (a) lVar.f23392c);
            }
            if (j == null) {
                sVar5 = T7.k.f9348e;
            } else {
                if (F10.z().equals(cVar) && j.k(F10.D()).isEmpty()) {
                    sVar4 = j;
                    return h10.equals(sVar4) ? lVar.N(eVar.b((m) aVar2.f8671c, C2, sVar4, F10, hVar, aVar), z8, eVar.k()) : lVar;
                }
                sVar5 = j.l(F10, sVar5);
            }
        }
        sVar4 = sVar5;
        if (h10.equals(sVar4)) {
        }
    }

    public l d(l lVar, C0385e c0385e, s sVar, R7.d dVar, R7.a aVar) {
        T7.s j;
        m b2;
        T7.s a9;
        a aVar2 = (a) lVar.f23391b;
        if (sVar.F(c0385e) != null) {
            return lVar;
        }
        boolean isEmpty = c0385e.isEmpty();
        R7.e eVar = (R7.e) this.f8699a;
        a aVar3 = (a) lVar.f23392c;
        if (isEmpty) {
            k.b("If change path is empty, we must have complete server data", aVar3.f8669a);
            if (aVar3.f8670b) {
                T7.s y10 = lVar.y();
                if (!(y10 instanceof T7.f)) {
                    y10 = T7.k.f9348e;
                }
                a9 = sVar.k(y10);
            } else {
                a9 = ((E) sVar.f23439c).a((C0385e) sVar.f23438b, lVar.y(), Collections.emptyList(), false);
            }
            b2 = eVar.d((m) aVar2.f8671c, new m(a9, eVar.getIndex()), aVar);
        } else {
            T7.c C2 = c0385e.C();
            boolean equals = C2.equals(T7.c.f9330d);
            m mVar = (m) aVar2.f8671c;
            m mVar2 = (m) aVar3.f8671c;
            if (equals) {
                k.b("Can't have a priority with additional path components", c0385e.size() == 1);
                T7.s m10 = sVar.m(c0385e, mVar.f9350a, mVar2.f9350a);
                if (m10 != null) {
                    b2 = eVar.g(mVar, m10);
                }
                b2 = mVar;
            } else {
                C0385e F10 = c0385e.F();
                if (aVar2.a(C2)) {
                    T7.s m11 = sVar.m(c0385e, mVar.f9350a, mVar2.f9350a);
                    T7.s sVar2 = mVar.f9350a;
                    j = m11 != null ? sVar2.h(C2).l(F10, m11) : sVar2.h(C2);
                } else {
                    j = sVar.j(C2, aVar3);
                }
                if (j != null) {
                    b2 = eVar.b((m) aVar2.f8671c, C2, j, F10, dVar, aVar);
                }
                b2 = mVar;
            }
        }
        return lVar.N(b2, aVar2.f8669a || c0385e.isEmpty(), eVar.k());
    }

    public void e(ArrayList arrayList, int i7, ArrayList arrayList2, List list, m mVar) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (P.c.a(cVar.f8674a, i7)) {
                arrayList3.add(cVar);
            }
        }
        Collections.sort(arrayList3, new d(this));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((x) it3.next()).getClass();
            }
        }
    }
}
