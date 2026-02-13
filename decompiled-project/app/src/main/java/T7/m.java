package T7;

import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final I7.f f9349d = new I7.f(Collections.emptyList(), null);

    /* renamed from: a, reason: collision with root package name */
    public final s f9350a;

    /* renamed from: b, reason: collision with root package name */
    public I7.f f9351b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9352c;

    public m(s sVar, l lVar) {
        this.f9352c = lVar;
        this.f9350a = sVar;
        this.f9351b = null;
    }

    public m(s sVar, l lVar, I7.f fVar) {
        this.f9352c = lVar;
        this.f9350a = sVar;
        this.f9351b = fVar;
    }

    public final void b() {
        if (this.f9351b == null) {
            n nVar = n.f9353a;
            l lVar = this.f9352c;
            boolean equals = lVar.equals(nVar);
            I7.f fVar = f9349d;
            if (equals) {
                this.f9351b = fVar;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z8 = false;
            for (q qVar : this.f9350a) {
                z8 = z8 || lVar.b(qVar.f9360b);
                arrayList.add(new q(qVar.f9359a, qVar.f9360b));
            }
            if (z8) {
                this.f9351b = new I7.f(arrayList, lVar);
            } else {
                this.f9351b = fVar;
            }
        }
    }

    public final m i(c cVar, s sVar) {
        s sVar2 = this.f9350a;
        s w10 = sVar2.w(cVar, sVar);
        I7.f fVar = this.f9351b;
        I7.f fVar2 = f9349d;
        boolean k = G.k(fVar, fVar2);
        l lVar = this.f9352c;
        if (k && !lVar.b(sVar)) {
            return new m(w10, lVar, fVar2);
        }
        I7.f fVar3 = this.f9351b;
        if (fVar3 == null || G.k(fVar3, fVar2)) {
            return new m(w10, lVar, null);
        }
        s h10 = sVar2.h(cVar);
        I7.f fVar4 = this.f9351b;
        q qVar = new q(cVar, h10);
        I7.c cVar2 = fVar4.f5243a;
        I7.c D10 = cVar2.D(qVar);
        if (D10 != cVar2) {
            fVar4 = new I7.f(D10);
        }
        if (!sVar.isEmpty()) {
            fVar4 = new I7.f(fVar4.f5243a.C(null, new q(cVar, sVar)));
        }
        return new m(w10, lVar, fVar4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b();
        return G.k(this.f9351b, f9349d) ? this.f9350a.iterator() : this.f9351b.iterator();
    }
}
