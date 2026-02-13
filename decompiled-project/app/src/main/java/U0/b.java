package U0;

import j0.AbstractC1362A;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final float f9415a;

    public b(j0.k kVar, float f4) {
        this.f9415a = f4;
    }

    @Override // U0.p
    public final float a() {
        return this.f9415a;
    }

    @Override // U0.p
    public final long b() {
        int i7 = j0.n.f18553h;
        return j0.n.g;
    }

    @Override // U0.p
    public final AbstractC1362A c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return kotlin.jvm.internal.l.a(null, null) && Float.compare(this.f9415a, bVar.f9415a) == 0;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BrushStyle(value=" + ((Object) null) + ", alpha=" + this.f9415a + ')';
    }
}
