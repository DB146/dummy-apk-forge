package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f19128a;

    public p(Class jClass) {
        l.e(jClass, "jClass");
        this.f19128a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f19128a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (l.a(this.f19128a, ((p) obj).f19128a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19128a.hashCode();
    }

    public final String toString() {
        return this.f19128a + " (Kotlin reflection is not available)";
    }
}
