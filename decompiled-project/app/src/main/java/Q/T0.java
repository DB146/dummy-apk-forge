package Q;

/* loaded from: classes.dex */
public final class T0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8370a;

    public T0(Object obj) {
        this.f8370a = obj;
    }

    @Override // Q.U0
    public final Object a(InterfaceC0493h0 interfaceC0493h0) {
        return this.f8370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T0) && kotlin.jvm.internal.l.a(this.f8370a, ((T0) obj).f8370a);
    }

    public final int hashCode() {
        Object obj = this.f8370a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f8370a + ')';
    }
}
