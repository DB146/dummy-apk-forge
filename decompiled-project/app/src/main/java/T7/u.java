package T7;

import L7.C0385e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final C0385e f9362a;

    /* renamed from: b, reason: collision with root package name */
    public final C0385e f9363b;

    /* renamed from: c, reason: collision with root package name */
    public final s f9364c;

    public u(J7.s sVar) {
        ArrayList arrayList = sVar.f5639a;
        this.f9362a = arrayList != null ? new C0385e(arrayList) : null;
        ArrayList arrayList2 = sVar.f5640b;
        this.f9363b = arrayList2 != null ? new C0385e(arrayList2) : null;
        this.f9364c = android.support.v4.media.session.b.a(sVar.f5641c, k.f9348e);
    }

    public final s a(C0385e c0385e, s sVar, s sVar2) {
        boolean z8 = true;
        C0385e c0385e2 = this.f9362a;
        int compareTo = c0385e2 == null ? 1 : c0385e.compareTo(c0385e2);
        C0385e c0385e3 = this.f9363b;
        int compareTo2 = c0385e3 == null ? -1 : c0385e.compareTo(c0385e3);
        boolean z10 = c0385e2 != null && c0385e.y(c0385e2);
        boolean z11 = c0385e3 != null && c0385e.y(c0385e3);
        if (compareTo > 0 && compareTo2 < 0 && !z11) {
            return sVar2;
        }
        if (compareTo > 0 && z11 && sVar2.p()) {
            return sVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            O7.k.c(z11);
            O7.k.c(!sVar2.p());
            return sVar.p() ? k.f9348e : sVar;
        }
        if (!z10 && !z11) {
            if (compareTo2 <= 0 && compareTo > 0) {
                z8 = false;
            }
            O7.k.c(z8);
            return sVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((q) it.next()).f9359a);
        }
        Iterator it2 = sVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((q) it2.next()).f9359a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!sVar2.e().isEmpty() || !sVar.e().isEmpty()) {
            arrayList.add(c.f9330d);
        }
        Iterator it3 = arrayList.iterator();
        s sVar3 = sVar;
        while (it3.hasNext()) {
            c cVar = (c) it3.next();
            s h10 = sVar.h(cVar);
            s a9 = a(c0385e.o(cVar), sVar.h(cVar), sVar2.h(cVar));
            if (a9 != h10) {
                sVar3 = sVar3.w(cVar, a9);
            }
        }
        return sVar3;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f9362a + ", optInclusiveEnd=" + this.f9363b + ", snap=" + this.f9364c + '}';
    }
}
