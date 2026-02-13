package androidx.compose.foundation.lazy.layout;

import A0.AbstractC0012d0;
import E.e;
import F.C0267k;
import F.C0270n;
import c0.l;
import h3.o;
import z.V;

/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final C0267k f13157b;

    /* renamed from: c, reason: collision with root package name */
    public final V f13158c;

    public LazyLayoutBeyondBoundsModifierElement(e eVar, C0267k c0267k, V v10) {
        this.f13156a = eVar;
        this.f13157b = c0267k;
        this.f13158c = v10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, F.n] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f3985C = this.f13156a;
        lVar.f3986D = this.f13157b;
        lVar.f3987E = this.f13158c;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        C0270n c0270n = (C0270n) lVar;
        c0270n.f3985C = this.f13156a;
        c0270n.f3986D = this.f13157b;
        c0270n.f3987E = this.f13158c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return kotlin.jvm.internal.l.a(this.f13156a, lazyLayoutBeyondBoundsModifierElement.f13156a) && kotlin.jvm.internal.l.a(this.f13157b, lazyLayoutBeyondBoundsModifierElement.f13157b) && this.f13158c == lazyLayoutBeyondBoundsModifierElement.f13158c;
    }

    public final int hashCode() {
        return this.f13158c.hashCode() + o.g(false, (this.f13157b.hashCode() + (this.f13156a.hashCode() * 31)) * 31, 31);
    }
}
