package T7;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Double f9347c;

    public j(Double d10, s sVar) {
        super(sVar);
        this.f9347c = d10;
    }

    @Override // T7.o
    public final int b(o oVar) {
        return this.f9347c.compareTo(((j) oVar).f9347c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9347c.equals(jVar.f9347c) && this.f9354a.equals(jVar.f9354a);
    }

    @Override // T7.s
    public final Object getValue() {
        return this.f9347c;
    }

    public final int hashCode() {
        return this.f9354a.hashCode() + this.f9347c.hashCode();
    }

    @Override // T7.o
    public final int i() {
        return 3;
    }

    @Override // T7.s
    public final String m(int i7) {
        StringBuilder m10 = X.c.m(X.c.h(o(i7), "number:"));
        m10.append(O7.k.a(this.f9347c.doubleValue()));
        return m10.toString();
    }

    @Override // T7.s
    public final s s(s sVar) {
        O7.k.c(com.bumptech.glide.c.I(sVar));
        return new j(this.f9347c, sVar);
    }
}
