package L7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6372a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final N7.a f6373b;

    public n(N7.a aVar) {
        this.f6373b = aVar;
    }

    public final ArrayList a(H2.E e2, q3.s sVar, T7.s sVar2) {
        Q7.e eVar = ((M7.d) e2.f4587b).f6829b;
        HashMap hashMap = this.f6372a;
        if (eVar != null) {
            Q7.g gVar = (Q7.g) hashMap.get(eVar);
            O7.k.c(gVar != null);
            return b(gVar, e2, sVar, sVar2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((Q7.g) ((Map.Entry) it.next()).getValue(), e2, sVar, sVar2));
        }
        return arrayList;
    }

    public final ArrayList b(Q7.g gVar, H2.E e2, q3.s sVar, T7.s sVar2) {
        R7.a aVar;
        q3.l b2;
        C0385e c0385e;
        C0385e c0385e2;
        O7.g gVar2;
        R7.a aVar2;
        gVar.getClass();
        int i7 = e2.f4586a;
        if (i7 == 2 && ((M7.d) e2.f4587b).f6829b != null) {
            O7.k.b("We should always have a full cache before handling merges", gVar.f8689c.y() != null);
            O7.k.b("Missing event cache, even though we have a server cache", gVar.f8689c.x() != null);
        }
        q3.l lVar = gVar.f8689c;
        Q7.i iVar = gVar.f8688b;
        iVar.getClass();
        R7.a aVar3 = new R7.a(0);
        int b10 = P.c.b(i7);
        if (b10 == 0) {
            aVar = aVar3;
            M7.e eVar = (M7.e) e2;
            M7.d dVar = (M7.d) eVar.f4587b;
            int i10 = dVar.f6828a;
            if (i10 == 1) {
                b2 = iVar.c(lVar, (C0385e) eVar.f4588c, eVar.f6831d, sVar, sVar2, aVar);
            } else {
                O7.k.c(i10 == 2);
                b2 = iVar.b(lVar, (C0385e) eVar.f4588c, eVar.f6831d, sVar, sVar2, dVar.f6830c || (((Q7.a) lVar.f23392c).f8670b && !((C0385e) eVar.f4588c).isEmpty()), aVar);
            }
        } else if (b10 != 1) {
            if (b10 == 2) {
                M7.a aVar4 = (M7.a) e2;
                boolean z8 = aVar4.f6823d;
                C0385e c0385e3 = (C0385e) aVar4.f4588c;
                if (z8) {
                    if (sVar.F(c0385e3) == null) {
                        Q7.h hVar = new Q7.h(sVar, lVar, sVar2, 0);
                        Q7.a aVar5 = (Q7.a) lVar.f23391b;
                        boolean isEmpty = c0385e3.isEmpty();
                        R7.e eVar2 = (R7.e) iVar.f8699a;
                        Q7.a aVar6 = (Q7.a) lVar.f23392c;
                        E e10 = (E) sVar.f23439c;
                        C0385e c0385e4 = (C0385e) sVar.f23438b;
                        T7.m mVar = (T7.m) aVar5.f8671c;
                        boolean z10 = aVar6.f8669a;
                        if (isEmpty || c0385e3.C().equals(T7.c.f9330d)) {
                            aVar = aVar3;
                            mVar = eVar2.d(mVar, new T7.m(z10 ? e10.a(c0385e4, lVar.y(), Collections.emptyList(), false) : sVar.k(((T7.m) aVar6.f8671c).f9350a), eVar2.getIndex()), aVar);
                        } else {
                            T7.c C2 = c0385e3.C();
                            T7.s j = sVar.j(C2, aVar6);
                            T7.s h10 = (j == null && aVar6.a(C2)) ? mVar.f9350a.h(C2) : j;
                            if (h10 != null) {
                                aVar2 = aVar3;
                                mVar = eVar2.b(mVar, C2, h10, c0385e3.F(), hVar, aVar2);
                            } else {
                                aVar2 = aVar3;
                                if (h10 == null && ((T7.m) ((Q7.a) lVar.f23391b).f8671c).f9350a.n(C2)) {
                                    mVar = eVar2.b(mVar, C2, T7.k.f9348e, c0385e3.F(), hVar, aVar2);
                                }
                            }
                            if (mVar.f9350a.isEmpty() && z10) {
                                T7.s a9 = e10.a(c0385e4, lVar.y(), Collections.emptyList(), false);
                                if (a9.p()) {
                                    mVar = eVar2.d(mVar, new T7.m(a9, eVar2.getIndex()), aVar2);
                                }
                            }
                            aVar = aVar2;
                        }
                        b2 = lVar.N(mVar, z10 || sVar.F(C0385e.f6337d) != null, eVar2.k());
                    }
                } else if (sVar.F(c0385e3) == null) {
                    Q7.a aVar7 = (Q7.a) lVar.f23392c;
                    O7.g gVar3 = aVar4.f6824e;
                    Object obj = gVar3.f7495a;
                    boolean z11 = aVar7.f8670b;
                    T7.m mVar2 = (T7.m) aVar7.f8671c;
                    if (obj == null) {
                        C0381a c0381a = C0381a.f6320b;
                        Iterator it = gVar3.iterator();
                        while (it.hasNext()) {
                            C0385e c0385e5 = (C0385e) ((Map.Entry) it.next()).getKey();
                            C0385e i11 = c0385e3.i(c0385e5);
                            if (aVar7.b(i11)) {
                                c0381a = c0381a.b(c0385e5, mVar2.f9350a.k(i11));
                            }
                        }
                        b2 = iVar.a(lVar, c0385e3, c0381a, sVar, sVar2, z11, aVar3);
                    } else if ((c0385e3.isEmpty() && aVar7.f8669a) || aVar7.b(c0385e3)) {
                        b2 = iVar.b(lVar, c0385e3, mVar2.f9350a.k(c0385e3), sVar, sVar2, z11, aVar3);
                    } else if (c0385e3.isEmpty()) {
                        C0381a c0381a2 = C0381a.f6320b;
                        C0381a c0381a3 = c0381a2;
                        for (T7.q qVar : mVar2.f9350a) {
                            T7.c cVar = qVar.f9359a;
                            c0381a3.getClass();
                            c0381a3 = c0381a3.b(new C0385e(cVar), qVar.f9360b);
                        }
                        b2 = iVar.a(lVar, c0385e3, c0381a3, sVar, sVar2, z11, aVar3);
                    }
                }
                b2 = lVar;
            } else {
                if (b10 != 3) {
                    throw new AssertionError("Unknown operation: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "ListenComplete" : "AckUserWrite" : "Merge" : "Overwrite"));
                }
                Q7.a aVar8 = (Q7.a) lVar.f23392c;
                boolean z12 = aVar8.f8669a;
                C0385e c0385e6 = (C0385e) e2.f4588c;
                b2 = iVar.d(new q3.l(19, (Q7.a) lVar.f23391b, new Q7.a((T7.m) aVar8.f8671c, z12 || c0385e6.isEmpty(), aVar8.f8670b), false), c0385e6, sVar, Q7.i.f8698b, aVar3);
            }
            aVar = aVar3;
        } else {
            aVar = aVar3;
            M7.c cVar2 = (M7.c) e2;
            M7.d dVar2 = (M7.d) cVar2.f4587b;
            int i12 = dVar2.f6828a;
            if (i12 == 1) {
                C0381a c0381a4 = cVar2.f6825d;
                O7.k.b("Can't have a merge that is an overwrite", ((T7.s) c0381a4.f6321a.f7495a) == null);
                O7.g gVar4 = c0381a4.f6321a;
                Iterator it2 = gVar4.iterator();
                q3.l lVar2 = lVar;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    c0385e = (C0385e) cVar2.f4588c;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    C0385e i13 = c0385e.i((C0385e) entry.getKey());
                    if (((Q7.a) lVar.f23391b).a(i13.C())) {
                        gVar2 = gVar4;
                        lVar2 = iVar.c(lVar2, i13, (T7.s) entry.getValue(), sVar, sVar2, aVar);
                    } else {
                        gVar2 = gVar4;
                    }
                    gVar4 = gVar2;
                }
                Iterator it3 = gVar4.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    C0385e i14 = c0385e.i((C0385e) entry2.getKey());
                    if (((Q7.a) lVar.f23391b).a(i14.C())) {
                        c0385e2 = c0385e;
                    } else {
                        c0385e2 = c0385e;
                        lVar2 = iVar.c(lVar2, i14, (T7.s) entry2.getValue(), sVar, sVar2, aVar);
                    }
                    c0385e = c0385e2;
                }
                b2 = lVar2;
            } else {
                O7.k.c(i12 == 2);
                b2 = iVar.a(lVar, (C0385e) cVar2.f4588c, cVar2.f6825d, sVar, sVar2, dVar2.f6830c || ((Q7.a) lVar.f23392c).f8670b, aVar);
            }
        }
        ArrayList arrayList = new ArrayList(new ArrayList(((HashMap) aVar.f8927b).values()));
        Q7.a aVar9 = (Q7.a) b2.f23391b;
        if (aVar9.f8669a) {
            T7.m mVar3 = (T7.m) aVar9.f8671c;
            boolean p10 = mVar3.f9350a.p();
            T7.s sVar3 = mVar3.f9350a;
            boolean z13 = p10 || sVar3.isEmpty();
            if (!arrayList.isEmpty() || !((Q7.a) lVar.f23391b).f8669a || ((z13 && !sVar3.equals(lVar.x())) || !sVar3.e().equals(lVar.x().e()))) {
                arrayList.add(new Q7.c(5, mVar3, null, null));
            }
        }
        O7.k.b("Once a server snap is complete, it should never go back", ((Q7.a) b2.f23392c).f8669a || !((Q7.a) lVar.f23392c).f8669a);
        gVar.f8689c = b2;
        ArrayList a10 = gVar.a(arrayList, (T7.m) ((Q7.a) b2.f23391b).f8671c, null);
        if (!gVar.f8687a.f8686b.d()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Q7.c cVar3 = (Q7.c) it4.next();
                int i15 = cVar3.f8674a;
                T7.c cVar4 = cVar3.f8677d;
                if (i15 == 2) {
                    hashSet2.add(cVar4);
                } else if (i15 == 1) {
                    hashSet.add(cVar4);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f6373b.e();
                return a10;
            }
        }
        return a10;
    }

    public final T7.s c(C0385e c0385e) {
        T7.s sVar;
        Iterator it = this.f6372a.values().iterator();
        do {
            sVar = null;
            if (!it.hasNext()) {
                break;
            }
            Q7.g gVar = (Q7.g) it.next();
            T7.s y10 = gVar.f8689c.y();
            if (y10 != null && (gVar.f8687a.f8686b.d() || (!c0385e.isEmpty() && !y10.h(c0385e.C()).isEmpty()))) {
                sVar = y10.k(c0385e);
            }
        } while (sVar == null);
        return sVar;
    }

    public final Q7.g d() {
        Iterator it = this.f6372a.entrySet().iterator();
        while (it.hasNext()) {
            Q7.g gVar = (Q7.g) ((Map.Entry) it.next()).getValue();
            if (gVar.f8687a.f8686b.d()) {
                return gVar;
            }
        }
        return null;
    }

    public final Q7.g e(Q7.f fVar, q3.s sVar, Q7.a aVar) {
        boolean z8;
        Q7.g gVar = (Q7.g) this.f6372a.get(fVar.f8686b);
        if (gVar != null) {
            return gVar;
        }
        boolean z10 = aVar.f8669a;
        T7.m mVar = (T7.m) aVar.f8671c;
        T7.s a9 = ((E) sVar.f23439c).a((C0385e) sVar.f23438b, z10 ? mVar.f9350a : null, Collections.emptyList(), false);
        if (a9 != null) {
            z8 = true;
        } else {
            T7.s sVar2 = mVar.f9350a;
            if (sVar2 == null) {
                sVar2 = T7.k.f9348e;
            }
            a9 = sVar.k(sVar2);
            z8 = false;
        }
        return new Q7.g(fVar, new q3.l(19, new Q7.a(new T7.m(a9, fVar.f8686b.f8684e), z8, false), aVar, false));
    }

    public final boolean f() {
        return d() != null;
    }

    public final Q7.g g(Q7.f fVar) {
        return fVar.f8686b.d() ? d() : (Q7.g) this.f6372a.get(fVar.f8686b);
    }
}
