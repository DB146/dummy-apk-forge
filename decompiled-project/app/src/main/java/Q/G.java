package Q;

/* loaded from: classes.dex */
public final class G implements U0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0487e0 f8303a;

    public G(C0487e0 c0487e0) {
        this.f8303a = c0487e0;
    }

    @Override // Q.U0
    public final Object a(InterfaceC0493h0 interfaceC0493h0) {
        return this.f8303a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && this.f8303a.equals(((G) obj).f8303a);
    }

    public final int hashCode() {
        return this.f8303a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f8303a + ')';
    }
}
