package T7;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9326c;

    public a(Boolean bool, s sVar) {
        super(sVar);
        this.f9326c = bool.booleanValue();
    }

    @Override // T7.o
    public final int b(o oVar) {
        boolean z8 = ((a) oVar).f9326c;
        boolean z10 = this.f9326c;
        if (z10 == z8) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9326c == aVar.f9326c && this.f9354a.equals(aVar.f9354a);
    }

    @Override // T7.s
    public final Object getValue() {
        return Boolean.valueOf(this.f9326c);
    }

    public final int hashCode() {
        return this.f9354a.hashCode() + (this.f9326c ? 1 : 0);
    }

    @Override // T7.o
    public final int i() {
        return 2;
    }

    @Override // T7.s
    public final String m(int i7) {
        return o(i7) + "boolean:" + this.f9326c;
    }

    @Override // T7.s
    public final s s(s sVar) {
        return new a(Boolean.valueOf(this.f9326c), sVar);
    }
}
