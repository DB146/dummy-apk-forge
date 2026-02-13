package N;

import A0.InterfaceC0024m;
import y.InterfaceC2291M;

/* loaded from: classes.dex */
public final class r implements InterfaceC2291M {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7070a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7071b;

    public r(long j, boolean z8) {
        this.f7070a = z8;
        this.f7071b = j;
    }

    @Override // y.InterfaceC2291M
    public final InterfaceC0024m b(A.i iVar) {
        return new C0419i(iVar, this.f7070a, new D5.i(this, 26));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f7070a == rVar.f7070a && V0.f.a(Float.NaN, Float.NaN) && kotlin.jvm.internal.l.a(null, null)) {
            return j0.n.c(this.f7071b, rVar.f7071b);
        }
        return false;
    }

    @Override // y.InterfaceC2291M
    public final int hashCode() {
        int e2 = h3.o.e(Float.NaN, Boolean.hashCode(this.f7070a) * 31, 961);
        int i7 = j0.n.f18553h;
        return Long.hashCode(this.f7071b) + e2;
    }
}
