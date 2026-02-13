package androidx.compose.ui;

import A0.AbstractC0012d0;
import c0.l;
import c0.q;

/* loaded from: classes.dex */
public final class ZIndexElement extends AbstractC0012d0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, c0.q] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f14127C = 1.0f;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((q) lVar).f14127C = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZIndexElement)) {
            return false;
        }
        ((ZIndexElement) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }
}
