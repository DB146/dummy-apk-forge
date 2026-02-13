package ec;

/* loaded from: classes2.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f16891a;

    public i(Throwable th) {
        this.f16891a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (kotlin.jvm.internal.l.a(this.f16891a, ((i) obj).f16891a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f16891a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // ec.j
    public final String toString() {
        return "Closed(" + this.f16891a + ')';
    }
}
