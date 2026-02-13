package Q;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8337a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8338b;

    public N(Integer num, Object obj) {
        this.f8337a = num;
        this.f8338b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return this.f8337a.equals(n6.f8337a) && kotlin.jvm.internal.l.a(this.f8338b, n6.f8338b);
    }

    public final int hashCode() {
        int hashCode = this.f8337a.hashCode() * 31;
        Object obj = this.f8338b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f8337a + ", right=" + this.f8338b + ')';
    }
}
