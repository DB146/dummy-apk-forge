package z3;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends Y6.b {
    public final i k;

    public f(i size) {
        l.e(size, "size");
        this.k = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && l.a(this.k, ((f) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.k + ')';
    }
}
