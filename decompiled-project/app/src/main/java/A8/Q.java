package A8;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f578a;

    /* renamed from: b, reason: collision with root package name */
    public final C0038b f579b;

    public Q(a0 a0Var, C0038b c0038b) {
        this.f578a = a0Var;
        this.f579b = c0038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        q10.getClass();
        return this.f578a.equals(q10.f578a) && this.f579b.equals(q10.f579b);
    }

    public final int hashCode() {
        return this.f579b.hashCode() + ((this.f578a.hashCode() + (EnumC0050n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC0050n.SESSION_START + ", sessionData=" + this.f578a + ", applicationInfo=" + this.f579b + ')';
    }
}
