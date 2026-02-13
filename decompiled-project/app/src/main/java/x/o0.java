package x;

import ea.C1111f;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC2249t {

    /* renamed from: a, reason: collision with root package name */
    public final int f26131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26132b;

    /* renamed from: c, reason: collision with root package name */
    public final r f26133c;

    public o0(int i7, int i10, r rVar) {
        this.f26131a = i7;
        this.f26132b = i10;
        this.f26133c = rVar;
    }

    @Override // x.InterfaceC2237g
    public final q0 a(C1111f c1111f) {
        return new A4.h(this.f26131a, this.f26132b, this.f26133c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return o0Var.f26131a == this.f26131a && o0Var.f26132b == this.f26132b && kotlin.jvm.internal.l.a(o0Var.f26133c, this.f26133c);
    }

    public final int hashCode() {
        return ((this.f26133c.hashCode() + (this.f26131a * 31)) * 31) + this.f26132b;
    }
}
