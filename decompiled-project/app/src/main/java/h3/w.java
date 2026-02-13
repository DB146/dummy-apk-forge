package h3;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: a, reason: collision with root package name */
    public final C1249k f17717a;

    public w(C1249k c1249k) {
        this.f17717a = c1249k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return this.f17717a.equals(((w) obj).f17717a);
    }

    public final int hashCode() {
        return this.f17717a.hashCode() + (w.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f17717a + '}';
    }
}
