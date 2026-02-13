package L7;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final long f6311a;

    public A(long j) {
        this.f6311a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && A.class == obj.getClass() && this.f6311a == ((A) obj).f6311a;
    }

    public final int hashCode() {
        long j = this.f6311a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f6311a + '}';
    }
}
