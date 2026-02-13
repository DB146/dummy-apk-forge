package androidx.compose.foundation;

import A.i;
import A0.AbstractC0012d0;
import A0.AbstractC0025n;
import E.A;
import c0.l;
import h3.o;
import y.C2305m;
import y.X;
import z.C2565l;
import z.V;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingContainerElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final A f13133a;

    /* renamed from: b, reason: collision with root package name */
    public final V f13134b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13135c;

    /* renamed from: d, reason: collision with root package name */
    public final C2565l f13136d;

    /* renamed from: e, reason: collision with root package name */
    public final i f13137e;

    /* renamed from: f, reason: collision with root package name */
    public final C2305m f13138f;

    public ScrollingContainerElement(i iVar, A a9, C2305m c2305m, C2565l c2565l, V v10, boolean z8) {
        this.f13133a = a9;
        this.f13134b = v10;
        this.f13135c = z8;
        this.f13136d = c2565l;
        this.f13137e = iVar;
        this.f13138f = c2305m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A0.n, y.X, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? abstractC0025n = new AbstractC0025n();
        abstractC0025n.f26438E = this.f13133a;
        abstractC0025n.f26439F = this.f13134b;
        abstractC0025n.f26440G = this.f13135c;
        abstractC0025n.f26441H = this.f13136d;
        abstractC0025n.f26442I = this.f13137e;
        abstractC0025n.f26443J = this.f13138f;
        return abstractC0025n;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        ((X) lVar).u0(this.f13137e, this.f13133a, this.f13138f, this.f13136d, this.f13134b, this.f13135c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return kotlin.jvm.internal.l.a(this.f13133a, scrollingContainerElement.f13133a) && this.f13134b == scrollingContainerElement.f13134b && this.f13135c == scrollingContainerElement.f13135c && kotlin.jvm.internal.l.a(this.f13136d, scrollingContainerElement.f13136d) && kotlin.jvm.internal.l.a(this.f13137e, scrollingContainerElement.f13137e) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(this.f13138f, scrollingContainerElement.f13138f);
    }

    public final int hashCode() {
        int g = o.g(false, o.g(this.f13135c, (this.f13134b.hashCode() + (this.f13133a.hashCode() * 31)) * 31, 31), 31);
        C2565l c2565l = this.f13136d;
        int hashCode = (g + (c2565l != null ? c2565l.hashCode() : 0)) * 31;
        i iVar = this.f13137e;
        int g2 = o.g(false, (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 961, 31);
        C2305m c2305m = this.f13138f;
        return g2 + (c2305m != null ? c2305m.hashCode() : 0);
    }
}
