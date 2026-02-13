package l0;

import V0.l;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442a {

    /* renamed from: a, reason: collision with root package name */
    public V0.c f19137a;

    /* renamed from: b, reason: collision with root package name */
    public l f19138b;

    /* renamed from: c, reason: collision with root package name */
    public j0.l f19139c;

    /* renamed from: d, reason: collision with root package name */
    public long f19140d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1442a)) {
            return false;
        }
        C1442a c1442a = (C1442a) obj;
        return kotlin.jvm.internal.l.a(this.f19137a, c1442a.f19137a) && this.f19138b == c1442a.f19138b && kotlin.jvm.internal.l.a(this.f19139c, c1442a.f19139c) && i0.e.a(this.f19140d, c1442a.f19140d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19140d) + ((this.f19139c.hashCode() + ((this.f19138b.hashCode() + (this.f19137a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f19137a + ", layoutDirection=" + this.f19138b + ", canvas=" + this.f19139c + ", size=" + ((Object) i0.e.e(this.f19140d)) + ')';
    }
}
