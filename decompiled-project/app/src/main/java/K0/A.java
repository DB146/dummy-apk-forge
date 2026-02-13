package K0;

/* loaded from: classes.dex */
public final class A implements InterfaceC0372b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5832a;

    public /* synthetic */ A(String str) {
        this.f5832a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return kotlin.jvm.internal.l.a(this.f5832a, ((A) obj).f5832a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5832a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f5832a + ')';
    }
}
