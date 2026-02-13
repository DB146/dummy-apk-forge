package androidx.compose.ui.layout;

import A0.AbstractC0012d0;
import Y0.c;
import c0.l;
import y0.C2320E;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f13204a;

    public OnGloballyPositionedElement(c cVar) {
        this.f13204a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, y0.E] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f26551C = this.f13204a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((C2320E) lVar).f26551C = this.f13204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f13204a == ((OnGloballyPositionedElement) obj).f13204a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13204a.hashCode();
    }
}
