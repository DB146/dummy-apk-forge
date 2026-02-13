package h3;

/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: a, reason: collision with root package name */
    public final C1249k f17716a = C1249k.f17698b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f17716a.equals(((u) obj).f17716a);
    }

    public final int hashCode() {
        return this.f17716a.hashCode() + (u.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f17716a + '}';
    }
}
