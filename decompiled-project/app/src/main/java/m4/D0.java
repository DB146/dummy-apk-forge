package m4;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: b, reason: collision with root package name */
    public static final D0 f19881b = new D0(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19882a;

    public D0(boolean z8) {
        this.f19882a = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && D0.class == obj.getClass() && this.f19882a == ((D0) obj).f19882a;
    }

    public final int hashCode() {
        return !this.f19882a ? 1 : 0;
    }
}
