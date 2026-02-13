package N;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f7065a = j0.n.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return j0.n.c(this.f7065a, ((o) obj).f7065a) && kotlin.jvm.internal.l.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = j0.n.f18553h;
        return Long.hashCode(this.f7065a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) j0.n.i(this.f7065a)) + ", rippleAlpha=null)";
    }
}
