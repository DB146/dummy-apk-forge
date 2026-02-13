package androidx.compose.ui.semantics;

import A0.AbstractC0012d0;
import Rb.c;
import c0.k;
import c0.l;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends AbstractC0012d0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13212a;

    /* renamed from: b, reason: collision with root package name */
    public final c f13213b;

    public AppendedSemanticsElement(c cVar, boolean z8) {
        this.f13212a = z8;
        this.f13213b = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, H0.c] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f4464C = this.f13212a;
        lVar.f4465D = this.f13213b;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        H0.c cVar = (H0.c) lVar;
        cVar.f4464C = this.f13212a;
        cVar.f4465D = this.f13213b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f13212a == appendedSemanticsElement.f13212a && kotlin.jvm.internal.l.a(this.f13213b, appendedSemanticsElement.f13213b);
    }

    public final int hashCode() {
        return this.f13213b.hashCode() + (Boolean.hashCode(this.f13212a) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f13212a + ", properties=" + this.f13213b + ')';
    }
}
