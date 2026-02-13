package x;

import ea.C1111f;

/* loaded from: classes.dex */
public final class Q implements InterfaceC2249t {

    /* renamed from: a, reason: collision with root package name */
    public final float f25977a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25978b;

    public Q(float f4, Object obj) {
        this.f25977a = f4;
        this.f25978b = obj;
    }

    @Override // x.InterfaceC2237g
    public final q0 a(C1111f c1111f) {
        Object obj = this.f25978b;
        return new o7.o(this.f25977a, obj == null ? null : (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        q10.getClass();
        return q10.f25977a == this.f25977a && kotlin.jvm.internal.l.a(q10.f25978b, this.f25978b);
    }

    public final int hashCode() {
        Object obj = this.f25978b;
        return Float.hashCode(this.f25977a) + h3.o.e(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
