package androidx.compose.ui.graphics;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.n0;
import Rb.c;
import c0.l;
import j0.j;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f13191a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f13191a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.j, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f18546C = this.f13191a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        j jVar = (j) lVar;
        jVar.f18546C = this.f13191a;
        n0 n0Var = AbstractC0017g.r(jVar, 2).f274A;
        if (n0Var != null) {
            n0Var.M0(jVar.f18546C, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kotlin.jvm.internal.l.a(this.f13191a, ((BlockGraphicsLayerElement) obj).f13191a);
    }

    public final int hashCode() {
        return this.f13191a.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f13191a + ')';
    }
}
