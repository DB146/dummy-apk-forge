package ec;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final j f16892b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f16893a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l.a(this.f16893a, ((k) obj).f16893a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f16893a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f16893a;
        if (obj instanceof i) {
            return ((i) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
