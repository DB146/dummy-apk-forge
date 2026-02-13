package C;

import java.util.List;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class r implements InterfaceC2316A {

    /* renamed from: a, reason: collision with root package name */
    public final c0.e f2431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2432b;

    public r(c0.e eVar, boolean z8) {
        this.f2431a = eVar;
        this.f2432b = z8;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        boolean isEmpty = list.isEmpty();
        Eb.w wVar = Eb.w.f3892a;
        if (isEmpty) {
            return t5.Q(V0.a.j(j), V0.a.i(j), wVar, C0228m.f2410c);
        }
        long j10 = this.f2432b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            y0.z zVar = (y0.z) list.get(0);
            zVar.d();
            AbstractC2323H b2 = zVar.b(j10);
            int max = Math.max(V0.a.j(j), b2.f26554a);
            int max2 = Math.max(V0.a.i(j), b2.f26555b);
            return t5.Q(max, max2, wVar, new C0231p(b2, zVar, t5, max, max2, this));
        }
        AbstractC2323H[] abstractC2323HArr = new AbstractC2323H[list.size()];
        ?? obj = new Object();
        obj.f19132a = V0.a.j(j);
        ?? obj2 = new Object();
        obj2.f19132a = V0.a.i(j);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            y0.z zVar2 = (y0.z) list.get(i7);
            zVar2.d();
            AbstractC2323H b10 = zVar2.b(j10);
            abstractC2323HArr[i7] = b10;
            obj.f19132a = Math.max(obj.f19132a, b10.f26554a);
            obj2.f19132a = Math.max(obj2.f19132a, b10.f26555b);
        }
        return t5.Q(obj.f19132a, obj2.f19132a, wVar, new C0232q(abstractC2323HArr, list, t5, obj, obj2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(this.f2431a, rVar.f2431a) && this.f2432b == rVar.f2432b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2432b) + (this.f2431a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f2431a + ", propagateMinConstraints=" + this.f2432b + ')';
    }
}
