package androidx.compose.foundation.layout;

import A0.AbstractC0012d0;
import C.C0226k;
import c0.l;

/* loaded from: classes.dex */
final class AspectRatioElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f13142a;

    public AspectRatioElement(float f4) {
        this.f13142a = f4;
        if (f4 > 0.0f) {
            return;
        }
        D.a.a("aspectRatio " + f4 + " must be > 0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [C.k, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f2406C = this.f13142a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((C0226k) lVar).f2406C = this.f13142a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f13142a == aspectRatioElement.f13142a) {
            ((AspectRatioElement) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f13142a) * 31);
    }
}
