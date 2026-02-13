package C;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public float f2352a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2353b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return Float.compare(this.f2352a, h10.f2352a) == 0 && this.f2353b == h10.f2353b && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        return h3.o.g(this.f2353b, Float.hashCode(this.f2352a) * 31, 961);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f2352a + ", fill=" + this.f2353b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
