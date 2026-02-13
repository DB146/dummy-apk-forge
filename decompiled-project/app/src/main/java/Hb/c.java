package Hb;

import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f4916a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4917b;

    public c(g element, i left) {
        l.e(left, "left");
        l.e(element, "element");
        this.f4916a = left;
        this.f4917b = element;
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i7 = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                i iVar = cVar2.f4916a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f4916a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i10 != i7) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f4917b;
                if (!l.a(cVar.get(gVar.getKey()), gVar)) {
                    z8 = false;
                    break;
                }
                i iVar3 = cVar4.f4916a;
                if (!(iVar3 instanceof c)) {
                    l.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z8 = l.a(cVar.get(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(this.f4916a.fold(obj, eVar), this.f4917b);
    }

    @Override // Hb.i
    public final g get(h key) {
        l.e(key, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f4917b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f4916a;
            if (!(iVar instanceof c)) {
                return iVar.get(key);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f4917b.hashCode() + this.f4916a.hashCode();
    }

    @Override // Hb.i
    public final i minusKey(h key) {
        l.e(key, "key");
        g gVar = this.f4917b;
        g gVar2 = gVar.get(key);
        i iVar = this.f4916a;
        if (gVar2 != null) {
            return iVar;
        }
        i minusKey = iVar.minusKey(key);
        return minusKey == iVar ? this : minusKey == j.f4919a ? gVar : new c(gVar, minusKey);
    }

    @Override // Hb.i
    public final i plus(i context) {
        l.e(context, "context");
        return context == j.f4919a ? this : (i) context.fold(this, new b(1));
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("["), (String) fold("", new b(0)), ']');
    }
}
