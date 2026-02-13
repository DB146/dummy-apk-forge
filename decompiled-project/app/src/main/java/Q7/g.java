package Q7;

import L7.C0385e;
import L7.x;
import T7.k;
import T7.m;
import T7.q;
import T7.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q3.l;
import r8.o;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f8687a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8688b;

    /* renamed from: c, reason: collision with root package name */
    public l f8689c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8690d;

    /* renamed from: e, reason: collision with root package name */
    public final i f8691e;

    public g(f fVar, l lVar) {
        this.f8687a = fVar;
        e eVar = fVar.f8686b;
        R7.b bVar = new R7.b(eVar.f8684e, 0);
        R7.e bVar2 = eVar.d() ? new R7.b(eVar.f8684e, 0) : new o(eVar);
        this.f8688b = new i(bVar2);
        a aVar = (a) lVar.f23392c;
        m mVar = new m(k.f9348e, fVar.f8686b.f8684e);
        m mVar2 = (m) aVar.f8671c;
        bVar.d(mVar, mVar2, null);
        a aVar2 = (a) lVar.f23391b;
        m d10 = bVar2.d(mVar, (m) aVar2.f8671c, null);
        this.f8689c = new l(19, new a(d10, aVar2.f8669a, bVar2.k()), new a(mVar2, aVar.f8669a, false), false);
        this.f8690d = new ArrayList();
        this.f8691e = new i(fVar);
    }

    public final ArrayList a(ArrayList arrayList, m mVar, x xVar) {
        List asList = xVar == null ? this.f8690d : Arrays.asList(xVar);
        i iVar = this.f8691e;
        iVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (P.c.a(cVar.f8674a, 4)) {
                s sVar = cVar.f8676c.f9350a;
                m mVar2 = cVar.f8675b;
                s sVar2 = mVar2.f9350a;
                T7.l lVar = (T7.l) iVar.f8699a;
                T7.c cVar2 = T7.c.f9328b;
                if (lVar.compare(new q(cVar2, sVar), new q(cVar2, sVar2)) != 0) {
                    arrayList3.add(new c(3, mVar2, cVar.f8677d, null));
                }
            }
        }
        List list = asList;
        iVar.e(arrayList2, 1, arrayList, list, mVar);
        iVar.e(arrayList2, 2, arrayList, list, mVar);
        iVar.e(arrayList2, 3, arrayList3, list, mVar);
        iVar.e(arrayList2, 4, arrayList, list, mVar);
        iVar.e(arrayList2, 5, arrayList, list, mVar);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final List b(x xVar, G7.b bVar) {
        ?? emptyList;
        ArrayList arrayList = this.f8690d;
        if (bVar != null) {
            emptyList = new ArrayList();
            O7.k.b("A cancel should cancel all event registrations", xVar == null);
            C0385e c0385e = this.f8687a.f8685a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                emptyList.add(new b((x) it.next(), bVar, c0385e));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (xVar != null) {
            int i7 = -1;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    i10 = i7;
                    break;
                }
                x xVar2 = (x) arrayList.get(i10);
                xVar2.getClass();
                if (xVar2.f6409a.get()) {
                    break;
                }
                i7 = i10;
                i10++;
            }
            if (i10 != -1) {
                x xVar3 = (x) arrayList.get(i10);
                arrayList.remove(i10);
                xVar3.f6409a.compareAndSet(false, true);
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((x) it2.next()).f6409a.compareAndSet(false, true);
            }
            arrayList.clear();
        }
        return emptyList;
    }
}
