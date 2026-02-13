package C;

import java.util.List;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class u implements InterfaceC2316A, G {
    public u() {
        C0219d c0219d = AbstractC0224i.f2402a;
    }

    @Override // C.G
    public final void a(int i7, int[] iArr, int[] iArr2, A0.T t5) {
        C0219d c0219d = AbstractC0224i.f2402a;
        AbstractC0224i.b(iArr, iArr2, false);
    }

    @Override // C.G
    public final long b(int i7, int i10, int i11, boolean z8) {
        return !z8 ? V0.b.a(0, i11, i7, i10) : Tb.a.k(0, i11, i7, i10);
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        int i7 = V0.a.i(j);
        int j10 = V0.a.j(j);
        int g = V0.a.g(j);
        int h10 = V0.a.h(j);
        C0219d c0219d = AbstractC0224i.f2402a;
        return c2.q.u(this, i7, j10, g, h10, t5.B(0), t5, list, new AbstractC2323H[list.size()], list.size());
    }

    @Override // C.G
    public final int d(AbstractC2323H abstractC2323H) {
        return abstractC2323H.f26555b;
    }

    @Override // C.G
    public final InterfaceC2317B e(AbstractC2323H[] abstractC2323HArr, A0.T t5, int[] iArr, int i7, int i10) {
        return t5.Q(i10, i7, Eb.w.f3892a, new C0234t(abstractC2323HArr, this, i10, t5, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        ((u) obj).getClass();
        Object obj2 = AbstractC0224i.f2403b;
        if (!obj2.equals(obj2)) {
            return false;
        }
        c0.c cVar = c0.b.f14100z;
        return cVar.equals(cVar);
    }

    @Override // C.G
    public final int f(AbstractC2323H abstractC2323H) {
        return abstractC2323H.f26554a;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (AbstractC0224i.f2403b.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + AbstractC0224i.f2403b + ", horizontalAlignment=" + c0.b.f14100z + ')';
    }
}
