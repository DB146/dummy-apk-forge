package androidx.compose.foundation;

import A.i;
import A0.AbstractC0012d0;
import A0.AbstractC0025n;
import A0.InterfaceC0024m;
import c0.l;
import y.C2290L;
import y.InterfaceC2291M;

/* loaded from: classes.dex */
final class IndicationModifierElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f13131a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2291M f13132b;

    public IndicationModifierElement(i iVar, InterfaceC2291M interfaceC2291M) {
        this.f13131a = iVar;
        this.f13132b = interfaceC2291M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A0.n, y.L, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        InterfaceC0024m b2 = this.f13132b.b(this.f13131a);
        ?? abstractC0025n = new AbstractC0025n();
        abstractC0025n.f26415E = b2;
        abstractC0025n.p0(b2);
        return abstractC0025n;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        C2290L c2290l = (C2290L) lVar;
        InterfaceC0024m b2 = this.f13132b.b(this.f13131a);
        c2290l.q0(c2290l.f26415E);
        c2290l.f26415E = b2;
        c2290l.p0(b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return kotlin.jvm.internal.l.a(this.f13131a, indicationModifierElement.f13131a) && kotlin.jvm.internal.l.a(this.f13132b, indicationModifierElement.f13132b);
    }

    public final int hashCode() {
        return this.f13132b.hashCode() + (this.f13131a.hashCode() * 31);
    }
}
