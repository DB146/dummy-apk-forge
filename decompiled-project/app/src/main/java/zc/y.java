package zc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class y extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final ha.g f28409e = new ha.g(new wc.d(8));

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28410d;

    public y(p pVar) {
        super(pVar);
        boolean z8;
        if (pVar instanceof d) {
            Iterator it = ((d) pVar).f28370a.iterator();
            while (it.hasNext()) {
                p pVar2 = (p) it.next();
                if ((pVar2 instanceof B) || (pVar2 instanceof A)) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        this.f28410d = z8;
    }

    @Override // zc.p
    public final int a() {
        return this.f28367a.a() * 10;
    }

    @Override // zc.C, zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        boolean z8 = this.f28410d;
        p pVar = this.f28367a;
        if (z8) {
            xc.l lVar3 = lVar2.f26368a;
            for (xc.l h02 = lVar3 != null ? lVar3.h0() : lVar2; h02 != null; h02 = h02.L()) {
                if (h02 != lVar2 && pVar.b(lVar2, h02)) {
                    return true;
                }
            }
        }
        ha.g gVar = f28409e;
        xc.r rVar = (xc.r) gVar.d();
        if (rVar.f26375f.isInstance(lVar2)) {
            rVar.f26371b = lVar2;
        }
        rVar.f26372c = lVar2;
        rVar.f26373d = lVar2;
        rVar.f26370a = lVar2;
        rVar.f26374e = lVar2.T();
        while (rVar.hasNext()) {
            try {
                rVar.a();
                xc.q qVar = rVar.f26371b;
                if (qVar == null) {
                    throw new NoSuchElementException();
                }
                rVar.f26373d = rVar.f26372c;
                rVar.f26372c = qVar;
                rVar.f26374e = qVar.T();
                rVar.f26371b = null;
                if (qVar != lVar2 && pVar.d(lVar2, qVar)) {
                    return true;
                }
            } finally {
                gVar.o(rVar);
            }
        }
        gVar.o(rVar);
        return false;
    }

    @Override // zc.C
    public final boolean g(xc.l lVar, xc.q qVar) {
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f28367a);
    }
}
