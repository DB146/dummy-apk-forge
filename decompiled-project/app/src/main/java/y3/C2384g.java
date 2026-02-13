package y3;

import android.graphics.PointF;

/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384g {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f26806a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26807b;

    public C2384g(PointF pointF, long j) {
        this.f26806a = pointF;
        this.f26807b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2384g)) {
            return false;
        }
        C2384g c2384g = (C2384g) obj;
        return this.f26806a.equals(c2384g.f26806a) && i0.e.a(this.f26807b, c2384g.f26807b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f26807b) + (this.f26806a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedPositionAndSize(position=" + this.f26806a + ", size=" + ((Object) i0.e.e(this.f26807b)) + ')';
    }
}
