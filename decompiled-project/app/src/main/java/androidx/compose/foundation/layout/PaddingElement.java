package androidx.compose.foundation.layout;

import A0.AbstractC0012d0;
import C.E;
import V0.f;
import c0.l;
import h3.o;

/* loaded from: classes.dex */
final class PaddingElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public float f13145a;

    /* renamed from: b, reason: collision with root package name */
    public float f13146b;

    /* renamed from: c, reason: collision with root package name */
    public float f13147c;

    /* renamed from: d, reason: collision with root package name */
    public float f13148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13149e;

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, C.E] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f2343C = this.f13145a;
        lVar.f2344D = this.f13146b;
        lVar.f2345E = this.f13147c;
        lVar.f2346F = this.f13148d;
        lVar.f2347G = this.f13149e;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        E e2 = (E) lVar;
        e2.f2343C = this.f13145a;
        e2.f2344D = this.f13146b;
        e2.f2345E = this.f13147c;
        e2.f2346F = this.f13148d;
        e2.f2347G = this.f13149e;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f13145a, paddingElement.f13145a) && f.a(this.f13146b, paddingElement.f13146b) && f.a(this.f13147c, paddingElement.f13147c) && f.a(this.f13148d, paddingElement.f13148d) && this.f13149e == paddingElement.f13149e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13149e) + o.e(this.f13148d, o.e(this.f13147c, o.e(this.f13146b, Float.hashCode(this.f13145a) * 31, 31), 31), 31);
    }
}
