package x;

/* loaded from: classes.dex */
public final class T implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f25981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25982b;

    public T(q0 q0Var, long j) {
        this.f25981a = q0Var;
        this.f25982b = j;
    }

    @Override // x.q0
    public final boolean b() {
        return this.f25981a.b();
    }

    @Override // x.q0
    public final AbstractC2243m d(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        long j10 = this.f25982b;
        return j < j10 ? abstractC2243m3 : this.f25981a.d(j - j10, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        T t5 = (T) obj;
        return t5.f25982b == this.f25982b && kotlin.jvm.internal.l.a(t5.f25981a, this.f25981a);
    }

    @Override // x.q0
    public final long h(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return this.f25981a.h(abstractC2243m, abstractC2243m2, abstractC2243m3) + this.f25982b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25982b) + (this.f25981a.hashCode() * 31);
    }

    @Override // x.q0
    public final AbstractC2243m n(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        long j10 = this.f25982b;
        return j < j10 ? abstractC2243m : this.f25981a.n(j - j10, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }
}
