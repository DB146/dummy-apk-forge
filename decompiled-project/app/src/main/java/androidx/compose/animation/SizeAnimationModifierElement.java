package androidx.compose.animation;

import A0.AbstractC0012d0;
import c0.e;
import c0.l;
import w.S;
import x.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f13121a;

    public SizeAnimationModifierElement(Q q10) {
        this.f13121a = q10;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        return new S(this.f13121a);
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((S) lVar).f25533C = this.f13121a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        if (!this.f13121a.equals(((SizeAnimationModifierElement) obj).f13121a)) {
            return false;
        }
        e eVar = c0.b.f14089a;
        return eVar.equals(eVar) && kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f13121a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f13121a + ", alignment=" + c0.b.f14089a + ", finishedListener=null)";
    }
}
