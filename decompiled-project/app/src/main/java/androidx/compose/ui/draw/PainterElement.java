package androidx.compose.ui.draw;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import c0.e;
import c0.l;
import g0.C1180b;
import h3.o;
import j0.i;
import o0.AbstractC1775c;
import y0.C2341i;

/* loaded from: classes.dex */
final class PainterElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1775c f13185a;

    /* renamed from: b, reason: collision with root package name */
    public final e f13186b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13187c;

    /* renamed from: d, reason: collision with root package name */
    public final i f13188d;

    public PainterElement(AbstractC1775c abstractC1775c, e eVar, float f4, i iVar) {
        this.f13185a = abstractC1775c;
        this.f13186b = eVar;
        this.f13187c = f4;
        this.f13188d = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g0.b, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f17215C = this.f13185a;
        lVar.f17216D = true;
        lVar.f17217E = this.f13186b;
        lVar.f17218F = C2341i.f26586b;
        lVar.f17219G = this.f13187c;
        lVar.f17220H = this.f13188d;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        C1180b c1180b = (C1180b) lVar;
        boolean z8 = c1180b.f17216D;
        AbstractC1775c abstractC1775c = this.f13185a;
        boolean z10 = (z8 && i0.e.a(c1180b.f17215C.e(), abstractC1775c.e())) ? false : true;
        c1180b.f17215C = abstractC1775c;
        c1180b.f17216D = true;
        c1180b.f17217E = this.f13186b;
        c1180b.f17218F = C2341i.f26586b;
        c1180b.f17219G = this.f13187c;
        c1180b.f17220H = this.f13188d;
        if (z10) {
            AbstractC0017g.l(c1180b);
        }
        AbstractC0017g.k(c1180b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!kotlin.jvm.internal.l.a(this.f13185a, painterElement.f13185a) || !kotlin.jvm.internal.l.a(this.f13186b, painterElement.f13186b)) {
            return false;
        }
        Object obj2 = C2341i.f26586b;
        return obj2.equals(obj2) && Float.compare(this.f13187c, painterElement.f13187c) == 0 && kotlin.jvm.internal.l.a(this.f13188d, painterElement.f13188d);
    }

    public final int hashCode() {
        int e2 = o.e(this.f13187c, (C2341i.f26586b.hashCode() + ((this.f13186b.hashCode() + o.g(true, this.f13185a.hashCode() * 31, 31)) * 31)) * 31, 31);
        i iVar = this.f13188d;
        return e2 + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f13185a + ", sizeToIntrinsics=true, alignment=" + this.f13186b + ", contentScale=" + C2341i.f26586b + ", alpha=" + this.f13187c + ", colorFilter=" + this.f13188d + ')';
    }
}
