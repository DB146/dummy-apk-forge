package androidx.compose.ui.input.nestedscroll;

import A0.AbstractC0012d0;
import A0.J;
import Y0.k;
import c0.l;
import t0.d;
import t0.g;

/* loaded from: classes.dex */
final class NestedScrollElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f13199a;

    public NestedScrollElement(d dVar) {
        this.f13199a = dVar;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        return new g(k.f11117a, this.f13199a);
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        g gVar = (g) lVar;
        gVar.f24431C = k.f11117a;
        d dVar = gVar.f24432D;
        if (dVar.f24416a == gVar) {
            dVar.f24416a = null;
        }
        d dVar2 = this.f13199a;
        if (!dVar2.equals(dVar)) {
            gVar.f24432D = dVar2;
        }
        if (gVar.f14112B) {
            d dVar3 = gVar.f24432D;
            dVar3.f24416a = gVar;
            dVar3.f24417b = null;
            gVar.f24433E = null;
            dVar3.f24418c = new J(gVar, 21);
            dVar3.f24419d = gVar.d0();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        nestedScrollElement.getClass();
        Object obj2 = k.f11117a;
        return obj2.equals(obj2) && nestedScrollElement.f13199a.equals(this.f13199a);
    }

    public final int hashCode() {
        return this.f13199a.hashCode() + (k.f11117a.hashCode() * 31);
    }
}
