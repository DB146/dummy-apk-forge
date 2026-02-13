package x;

import ea.C1111f;

/* loaded from: classes.dex */
public final class S implements InterfaceC2237g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2249t f25979a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25980b;

    public S(InterfaceC2249t interfaceC2249t, long j) {
        this.f25979a = interfaceC2249t;
        this.f25980b = j;
    }

    @Override // x.InterfaceC2237g
    public final q0 a(C1111f c1111f) {
        return new T(this.f25979a.a(c1111f), this.f25980b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        S s3 = (S) obj;
        return s3.f25980b == this.f25980b && kotlin.jvm.internal.l.a(s3.f25979a, this.f25979a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f25980b) + (this.f25979a.hashCode() * 31);
    }
}
