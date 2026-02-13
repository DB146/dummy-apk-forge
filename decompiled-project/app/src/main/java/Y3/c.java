package Y3;

import h3.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11148a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f11148a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f11148a.equals(((c) obj).f11148a);
    }

    public final int hashCode() {
        return this.f11148a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o.p(new StringBuilder("Encoding{name=\""), this.f11148a, "\"}");
    }
}
