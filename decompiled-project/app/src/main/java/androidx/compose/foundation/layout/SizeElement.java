package androidx.compose.foundation.layout;

import A0.AbstractC0012d0;
import C.L;
import V0.f;
import c0.l;
import h3.o;

/* loaded from: classes.dex */
final class SizeElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f13150a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13151b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13152c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13153d;

    public SizeElement(float f4, float f10, float f11, float f12) {
        this.f13150a = f4;
        this.f13151b = f10;
        this.f13152c = f11;
        this.f13153d = f12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [C.L, c0.l] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f2360C = this.f13150a;
        lVar.f2361D = this.f13151b;
        lVar.f2362E = this.f13152c;
        lVar.f2363F = this.f13153d;
        lVar.f2364G = true;
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        L l10 = (L) lVar;
        l10.f2360C = this.f13150a;
        l10.f2361D = this.f13151b;
        l10.f2362E = this.f13152c;
        l10.f2363F = this.f13153d;
        l10.f2364G = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f13150a, sizeElement.f13150a) && f.a(this.f13151b, sizeElement.f13151b) && f.a(this.f13152c, sizeElement.f13152c) && f.a(this.f13153d, sizeElement.f13153d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + o.e(this.f13153d, o.e(this.f13152c, o.e(this.f13151b, Float.hashCode(this.f13150a) * 31, 31), 31), 31);
    }
}
