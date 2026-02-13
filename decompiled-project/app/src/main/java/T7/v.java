package T7;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: c, reason: collision with root package name */
    public final String f9365c;

    public v(String str, s sVar) {
        super(sVar);
        this.f9365c = str;
    }

    @Override // T7.o
    public final int b(o oVar) {
        return this.f9365c.compareTo(((v) oVar).f9365c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f9365c.equals(vVar.f9365c) && this.f9354a.equals(vVar.f9354a);
    }

    @Override // T7.s
    public final Object getValue() {
        return this.f9365c;
    }

    public final int hashCode() {
        return this.f9354a.hashCode() + this.f9365c.hashCode();
    }

    @Override // T7.o
    public final int i() {
        return 4;
    }

    @Override // T7.s
    public final String m(int i7) {
        int b2 = P.c.b(i7);
        String str = this.f9365c;
        if (b2 == 0) {
            return o(i7) + "string:" + str;
        }
        if (b2 != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(A3.c.u(i7)));
        }
        return o(i7) + "string:" + O7.k.f(str);
    }

    @Override // T7.s
    public final s s(s sVar) {
        return new v(this.f9365c, sVar);
    }
}
