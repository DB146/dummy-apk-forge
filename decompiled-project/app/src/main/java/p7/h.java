package p7;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f23137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23139c;

    public h(int i7, int i10, Class cls) {
        this(p.a(cls), i7, i10);
    }

    public h(p pVar, int i7, int i10) {
        c2.i.e(pVar, "Null dependency anInterface.");
        this.f23137a = pVar;
        this.f23138b = i7;
        this.f23139c = i10;
    }

    public static h a(Class cls) {
        return new h(0, 2, cls);
    }

    public static h b(Class cls) {
        return new h(0, 1, cls);
    }

    public static h c(Class cls) {
        return new h(1, 0, cls);
    }

    public static h d(p pVar) {
        return new h(pVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f23137a.equals(hVar.f23137a) && this.f23138b == hVar.f23138b && this.f23139c == hVar.f23139c;
    }

    public final int hashCode() {
        return ((((this.f23137a.hashCode() ^ 1000003) * 1000003) ^ this.f23138b) * 1000003) ^ this.f23139c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f23137a);
        sb2.append(", type=");
        int i7 = this.f23138b;
        sb2.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f23139c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(h3.o.l(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return h3.o.p(sb2, str, "}");
    }
}
