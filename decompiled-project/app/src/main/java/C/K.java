package C;

import java.util.List;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class K implements InterfaceC2316A, G {
    public K() {
        C0219d c0219d = AbstractC0224i.f2402a;
    }

    @Override // C.G
    public final void a(int i7, int[] iArr, int[] iArr2, A0.T t5) {
        AbstractC0224i.f2402a.b(t5, i7, iArr, t5.getLayoutDirection(), iArr2);
    }

    @Override // C.G
    public final long b(int i7, int i10, int i11, boolean z8) {
        return !z8 ? V0.b.a(i7, i10, 0, i11) : Tb.a.l(i7, i10, 0, i11);
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        int j10 = V0.a.j(j);
        int i7 = V0.a.i(j);
        int h10 = V0.a.h(j);
        int g = V0.a.g(j);
        C0219d c0219d = AbstractC0224i.f2402a;
        return c2.q.u(this, j10, i7, h10, g, t5.B(0), t5, list, new AbstractC2323H[list.size()], list.size());
    }

    @Override // C.G
    public final int d(AbstractC2323H abstractC2323H) {
        return abstractC2323H.f26554a;
    }

    @Override // C.G
    public final InterfaceC2317B e(AbstractC2323H[] abstractC2323HArr, A0.T t5, int[] iArr, int i7, int i10) {
        return t5.Q(i7, i10, Eb.w.f3892a, new J(abstractC2323HArr, this, i10, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        ((K) obj).getClass();
        Object obj2 = AbstractC0224i.f2402a;
        if (!obj2.equals(obj2)) {
            return false;
        }
        c0.d dVar = c0.b.f14098x;
        return dVar.equals(dVar);
    }

    @Override // C.G
    public final int f(AbstractC2323H abstractC2323H) {
        return abstractC2323H.f26555b;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (AbstractC0224i.f2402a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + AbstractC0224i.f2402a + ", verticalAlignment=" + c0.b.f14098x + ')';
    }
}
