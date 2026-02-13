package androidx.compose.foundation.layout;

import A0.AbstractC0012d0;
import C.w;
import C.y;
import c0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f13143a;

    public FillElement(w wVar) {
        this.f13143a = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, C.y] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f2448C = this.f13143a;
        lVar.f2449D = 1.0f;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        y yVar = (y) lVar;
        yVar.f2448C = this.f13143a;
        yVar.f2449D = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.f13143a == ((FillElement) obj).f13143a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f13143a.hashCode() * 31);
    }
}
