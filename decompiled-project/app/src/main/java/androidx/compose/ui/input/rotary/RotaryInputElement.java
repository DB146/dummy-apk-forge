package androidx.compose.ui.input.rotary;

import A0.AbstractC0012d0;
import B0.r;
import c0.l;
import w0.C2195a;

/* loaded from: classes.dex */
final class RotaryInputElement extends AbstractC0012d0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, w0.a] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f25638C = r.f1962d;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((C2195a) lVar).f25638C = r.f1962d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = r.f1962d;
        return obj2.equals(obj2) && kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        return r.f1962d.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + r.f1962d + ", onPreRotaryScrollEvent=null)";
    }
}
