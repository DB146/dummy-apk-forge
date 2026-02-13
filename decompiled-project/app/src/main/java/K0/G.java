package K0;

/* loaded from: classes.dex */
public final class G implements InterfaceC0372b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5858a;

    public G(String str) {
        this.f5858a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return kotlin.jvm.internal.l.a(this.f5858a, ((G) obj).f5858a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5858a.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("UrlAnnotation(url="), this.f5858a, ')');
    }
}
