package w;

import x.o0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final long f25519a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f25520b;

    public N(long j, o0 o0Var) {
        this.f25519a = j;
        this.f25520b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        n6.getClass();
        return Float.compare(0.92f, 0.92f) == 0 && j0.G.a(this.f25519a, n6.f25519a) && this.f25520b.equals(n6.f25520b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(0.92f) * 31;
        int i7 = j0.G.f18527c;
        return this.f25520b.hashCode() + h3.o.f(hashCode, 31, this.f25519a);
    }

    public final String toString() {
        return "Scale(scale=0.92, transformOrigin=" + ((Object) j0.G.d(this.f25519a)) + ", animationSpec=" + this.f25520b + ')';
    }
}
