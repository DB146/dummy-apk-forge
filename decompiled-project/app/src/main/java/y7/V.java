package y7;

/* loaded from: classes.dex */
public final class V extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27200b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27201c;

    public V(long j, String str, String str2) {
        this.f27199a = str;
        this.f27200b = str2;
        this.f27201c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f27199a.equals(((V) z0Var).f27199a)) {
            V v10 = (V) z0Var;
            if (this.f27200b.equals(v10.f27200b) && this.f27201c == v10.f27201c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f27199a.hashCode() ^ 1000003) * 1000003) ^ this.f27200b.hashCode()) * 1000003;
        long j = this.f27201c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f27199a);
        sb2.append(", code=");
        sb2.append(this.f27200b);
        sb2.append(", address=");
        return X.c.f(this.f27201c, "}", sb2);
    }
}
