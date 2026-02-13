package androidx.compose.foundation.lazy.layout;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import E.C0249d;
import F.L;
import Yb.g;
import c0.l;
import h3.o;
import z.V;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f13160a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249d f13161b;

    /* renamed from: c, reason: collision with root package name */
    public final V f13162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13163d;

    public LazyLayoutSemanticsModifier(g gVar, C0249d c0249d, V v10, boolean z8) {
        this.f13160a = gVar;
        this.f13161b = c0249d;
        this.f13162c = v10;
        this.f13163d = z8;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        V v10 = this.f13162c;
        return new L(this.f13160a, this.f13161b, v10, this.f13163d);
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        L l10 = (L) lVar;
        l10.f3918C = this.f13160a;
        l10.f3919D = this.f13161b;
        V v10 = l10.f3920E;
        V v11 = this.f13162c;
        if (v10 != v11) {
            l10.f3920E = v11;
            AbstractC0017g.m(l10);
        }
        boolean z8 = l10.f3921F;
        boolean z10 = this.f13163d;
        if (z8 == z10) {
            return;
        }
        l10.f3921F = z10;
        l10.p0();
        AbstractC0017g.m(l10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f13160a == lazyLayoutSemanticsModifier.f13160a && kotlin.jvm.internal.l.a(this.f13161b, lazyLayoutSemanticsModifier.f13161b) && this.f13162c == lazyLayoutSemanticsModifier.f13162c && this.f13163d == lazyLayoutSemanticsModifier.f13163d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + o.g(this.f13163d, (this.f13162c.hashCode() + ((this.f13161b.hashCode() + (this.f13160a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
