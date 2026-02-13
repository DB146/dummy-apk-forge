package y7;

/* renamed from: y7.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436k0 extends M0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27323a;

    public C2436k0(String str) {
        this.f27323a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        return this.f27323a.equals(((C2436k0) ((M0) obj)).f27323a);
    }

    public final int hashCode() {
        return this.f27323a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return h3.o.p(new StringBuilder("User{identifier="), this.f27323a, "}");
    }
}
