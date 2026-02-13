package m3;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f19778a;

    public b(int i7) {
        this.f19778a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f19778a == ((b) obj).f19778a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19778a);
    }

    public final String toString() {
        return X.c.k(new StringBuilder("ConstraintsNotMet(reason="), this.f19778a, ')');
    }
}
