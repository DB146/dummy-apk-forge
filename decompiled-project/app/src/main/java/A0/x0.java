package A0;

import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class x0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2317B f325a;

    /* renamed from: b, reason: collision with root package name */
    public final T f326b;

    public x0(InterfaceC2317B interfaceC2317B, T t5) {
        this.f325a = interfaceC2317B;
        this.f326b = t5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.l.a(this.f325a, x0Var.f325a) && kotlin.jvm.internal.l.a(this.f326b, x0Var.f326b);
    }

    public final int hashCode() {
        return this.f326b.hashCode() + (this.f325a.hashCode() * 31);
    }

    @Override // A0.u0
    public final boolean r() {
        return this.f326b.V().w();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f325a + ", placeable=" + this.f326b + ')';
    }
}
