package K0;

/* loaded from: classes.dex */
public final class H implements InterfaceC0372b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5859a;

    public H(String str) {
        this.f5859a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return kotlin.jvm.internal.l.a(this.f5859a, ((H) obj).f5859a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5859a.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f5859a, ')');
    }
}
