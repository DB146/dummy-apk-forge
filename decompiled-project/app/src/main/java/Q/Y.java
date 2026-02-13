package Q;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final String f8371a;

    public Y(String str) {
        this.f8371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && kotlin.jvm.internal.l.a(this.f8371a, ((Y) obj).f8371a);
    }

    public final int hashCode() {
        return this.f8371a.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("OpaqueKey(key="), this.f8371a, ')');
    }
}
