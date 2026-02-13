package y7;

/* renamed from: y7.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2422d0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27262a;

    public C2422d0(String str) {
        this.f27262a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        return this.f27262a.equals(((C2422d0) ((G0) obj)).f27262a);
    }

    public final int hashCode() {
        return this.f27262a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return h3.o.p(new StringBuilder("Log{content="), this.f27262a, "}");
    }
}
