package F;

import A0.InterfaceC0026o;
import java.util.ArrayList;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271o extends c0.l implements InterfaceC0026o {

    /* renamed from: C, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f3988C;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0271o) && kotlin.jvm.internal.l.a(this.f3988C, ((C0271o) obj).f3988C);
    }

    @Override // c0.l
    public final void h0() {
        this.f3988C.getClass();
    }

    public final int hashCode() {
        return this.f3988C.hashCode();
    }

    @Override // c0.l
    public final void i0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f3988C;
        bVar.c();
        bVar.f13166b = null;
    }

    @Override // A0.InterfaceC0026o
    public final void t(A0.N n6) {
        ArrayList arrayList = this.f3988C.f13171h;
        if (arrayList.size() <= 0) {
            n6.a();
        } else {
            A3.c.p(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f3988C + ')';
    }
}
