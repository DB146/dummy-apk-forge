package androidx.compose.foundation;

import A0.AbstractC0012d0;
import c0.l;
import h3.o;
import j0.D;
import j0.n;
import y.C2308p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackgroundElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13125a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13126b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final D f13127c;

    public BackgroundElement(long j, D d10) {
        this.f13125a = j;
        this.f13127c = d10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, y.p] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f26499C = this.f13125a;
        lVar.f26500D = this.f13127c;
        lVar.f26501E = 9205357640488583168L;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        C2308p c2308p = (C2308p) lVar;
        c2308p.f26499C = this.f13125a;
        c2308p.f26500D = this.f13127c;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && n.c(this.f13125a, backgroundElement.f13125a) && kotlin.jvm.internal.l.a(null, null) && this.f13126b == backgroundElement.f13126b && kotlin.jvm.internal.l.a(this.f13127c, backgroundElement.f13127c);
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return this.f13127c.hashCode() + o.e(this.f13126b, Long.hashCode(this.f13125a) * 961, 31);
    }
}
