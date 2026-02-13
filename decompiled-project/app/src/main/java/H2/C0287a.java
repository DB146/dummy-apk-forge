package H2;

/* renamed from: H2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287a {

    /* renamed from: a, reason: collision with root package name */
    public int f4633a;

    /* renamed from: b, reason: collision with root package name */
    public int f4634b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4635c;

    /* renamed from: d, reason: collision with root package name */
    public int f4636d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0287a)) {
            return false;
        }
        C0287a c0287a = (C0287a) obj;
        int i7 = this.f4633a;
        if (i7 != c0287a.f4633a) {
            return false;
        }
        if (i7 == 8 && Math.abs(this.f4636d - this.f4634b) == 1 && this.f4636d == c0287a.f4634b && this.f4634b == c0287a.f4636d) {
            return true;
        }
        if (this.f4636d != c0287a.f4636d || this.f4634b != c0287a.f4634b) {
            return false;
        }
        Object obj2 = this.f4635c;
        if (obj2 != null) {
            if (!obj2.equals(c0287a.f4635c)) {
                return false;
            }
        } else if (c0287a.f4635c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4633a * 31) + this.f4634b) * 31) + this.f4636d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i7 = this.f4633a;
        sb2.append(i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f4634b);
        sb2.append("c:");
        sb2.append(this.f4636d);
        sb2.append(",p:");
        sb2.append(this.f4635c);
        sb2.append("]");
        return sb2.toString();
    }
}
