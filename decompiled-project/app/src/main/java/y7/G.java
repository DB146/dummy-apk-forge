package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class G extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f27121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27122b;

    public G(List list, String str) {
        this.f27121a = list;
        this.f27122b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f27121a.equals(((G) t0Var).f27121a)) {
            String str = this.f27122b;
            if (str == null) {
                if (((G) t0Var).f27122b == null) {
                    return true;
                }
            } else if (str.equals(((G) t0Var).f27122b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f27121a.hashCode() ^ 1000003) * 1000003;
        String str = this.f27122b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f27121a);
        sb2.append(", orgId=");
        return h3.o.p(sb2, this.f27122b, "}");
    }
}
