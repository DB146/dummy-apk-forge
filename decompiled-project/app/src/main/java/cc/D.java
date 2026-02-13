package cc;

/* loaded from: classes2.dex */
public final class D extends Hb.a {

    /* renamed from: c, reason: collision with root package name */
    public static final B f14468c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f14469b;

    public D() {
        super(f14468c);
        this.f14469b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.l.a(this.f14469b, ((D) obj).f14469b);
    }

    public final int hashCode() {
        return this.f14469b.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("CoroutineName("), this.f14469b, ')');
    }
}
