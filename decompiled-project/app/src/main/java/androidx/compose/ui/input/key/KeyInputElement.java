package androidx.compose.ui.input.key;

import A0.AbstractC0012d0;
import B0.C0214z;
import c0.l;
import s0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class KeyInputElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0214z f13198a;

    public KeyInputElement(C0214z c0214z) {
        this.f13198a = c0214z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, s0.d] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f24021C = this.f13198a;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((d) lVar).f24021C = this.f13198a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f13198a == ((KeyInputElement) obj).f13198a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13198a.hashCode() * 31;
    }
}
