package T7;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: c, reason: collision with root package name */
    public final long f9356c;

    public p(Long l10, s sVar) {
        super(sVar);
        this.f9356c = l10.longValue();
    }

    @Override // T7.o
    public final int b(o oVar) {
        long j = ((p) oVar).f9356c;
        char[] cArr = O7.k.f7501a;
        long j10 = this.f9356c;
        if (j10 < j) {
            return -1;
        }
        return j10 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9356c == pVar.f9356c && this.f9354a.equals(pVar.f9354a);
    }

    @Override // T7.s
    public final Object getValue() {
        return Long.valueOf(this.f9356c);
    }

    public final int hashCode() {
        long j = this.f9356c;
        return this.f9354a.hashCode() + ((int) (j ^ (j >>> 32)));
    }

    @Override // T7.o
    public final int i() {
        return 3;
    }

    @Override // T7.s
    public final String m(int i7) {
        StringBuilder m10 = X.c.m(X.c.h(o(i7), "number:"));
        m10.append(O7.k.a(this.f9356c));
        return m10.toString();
    }

    @Override // T7.s
    public final s s(s sVar) {
        return new p(Long.valueOf(this.f9356c), sVar);
    }
}
