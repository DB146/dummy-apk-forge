package androidx.compose.foundation.lazy.layout;

import A0.AbstractC0012d0;
import F.D;
import F.W;
import c0.l;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D f13164a;

    public TraversablePrefetchStateModifierElement(D d10) {
        this.f13164a = d10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, F.W] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f3956C = this.f13164a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((W) lVar).f3956C = this.f13164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && kotlin.jvm.internal.l.a(this.f13164a, ((TraversablePrefetchStateModifierElement) obj).f13164a);
    }

    public final int hashCode() {
        return this.f13164a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f13164a + ')';
    }
}
