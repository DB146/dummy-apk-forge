package androidx.compose.ui.draw;

import A0.AbstractC0012d0;
import C.D;
import c0.l;
import g0.C1179a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DrawBehindElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D f13184a;

    public DrawBehindElement(D d10) {
        this.f13184a = d10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g0.a, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f17214C = this.f13184a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((C1179a) lVar).f17214C = this.f13184a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.f13184a.equals(((DrawBehindElement) obj).f13184a);
    }

    public final int hashCode() {
        return this.f13184a.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f13184a + ')';
    }
}
