package M6;

/* loaded from: classes.dex */
public final class o extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6807a;

    public o(Object obj) {
        this.f6807a = obj;
    }

    @Override // M6.k
    public final Object a() {
        return this.f6807a;
    }

    @Override // M6.k
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6807a.equals(((o) obj).f6807a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6807a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f6807a + ")";
    }
}
