package Q;

/* loaded from: classes.dex */
public final class A implements U0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f8265a;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Rb.c cVar) {
        this.f8265a = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Q.U0
    public final Object a(InterfaceC0493h0 interfaceC0493h0) {
        return this.f8265a.invoke(interfaceC0493h0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.f8265a.equals(((A) obj).f8265a);
    }

    public final int hashCode() {
        return this.f8265a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f8265a + ')';
    }
}
