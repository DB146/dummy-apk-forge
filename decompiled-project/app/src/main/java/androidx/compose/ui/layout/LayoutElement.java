package androidx.compose.ui.layout;

import A0.AbstractC0012d0;
import Rb.f;
import c0.l;
import y0.C2346n;

/* loaded from: classes.dex */
final class LayoutElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f13203a;

    public LayoutElement(f fVar) {
        this.f13203a = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y0.n, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f26589C = this.f13203a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((C2346n) lVar).f26589C = this.f13203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && kotlin.jvm.internal.l.a(this.f13203a, ((LayoutElement) obj).f13203a);
    }

    public final int hashCode() {
        return this.f13203a.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f13203a + ')';
    }
}
