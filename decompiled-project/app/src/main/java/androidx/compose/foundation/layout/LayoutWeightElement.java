package androidx.compose.foundation.layout;

import A0.AbstractC0012d0;
import C.C;
import c0.l;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f13144a;

    public LayoutWeightElement(float f4) {
        this.f13144a = f4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, C.C] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f2337C = this.f13144a;
        lVar.f2338D = true;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        C c10 = (C) lVar;
        c10.f2337C = this.f13144a;
        c10.f2338D = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f13144a == layoutWeightElement.f13144a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.f13144a) * 31);
    }
}
