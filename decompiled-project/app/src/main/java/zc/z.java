package zc;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z extends C {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28411d;

    /* renamed from: e, reason: collision with root package name */
    public int f28412e;

    public z(p pVar) {
        super(pVar);
        ArrayList arrayList = new ArrayList();
        this.f28411d = arrayList;
        this.f28412e = 2;
        arrayList.add(pVar);
        this.f28412e = pVar.a() + this.f28412e;
    }

    @Override // zc.p
    public final int a() {
        return this.f28412e;
    }

    @Override // zc.C, zc.p
    public final void e() {
        Iterator it = this.f28411d.iterator();
        while (it.hasNext()) {
            ((p) it.next()).e();
        }
        super.e();
    }

    @Override // zc.C
    public final boolean g(xc.l lVar, xc.q qVar) {
        if (qVar == lVar) {
            return false;
        }
        ArrayList arrayList = this.f28411d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (qVar == null || !((p) arrayList.get(size)).d(lVar, qVar)) {
                return false;
            }
            qVar = qVar.T();
        }
        return true;
    }

    public final String toString() {
        return wc.l.j(this.f28411d, " > ");
    }
}
