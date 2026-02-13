package y3;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final A3.a f26845a;

    public s(A3.a dataSource) {
        kotlin.jvm.internal.l.e(dataSource, "dataSource");
        this.f26845a = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f26845a == ((s) obj).f26845a;
    }

    public final int hashCode() {
        return this.f26845a.hashCode();
    }

    public final String toString() {
        return "Success(dataSource=" + this.f26845a + ')';
    }
}
