package X;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f10900a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f10900a == ((a) obj).f10900a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10900a);
    }

    public final String toString() {
        return c.k(new StringBuilder("DeltaCounter(count="), this.f10900a, ')');
    }
}
