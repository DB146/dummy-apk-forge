package s4;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final t f24084a;

    /* renamed from: b, reason: collision with root package name */
    public final t f24085b;

    public r(t tVar, t tVar2) {
        this.f24084a = tVar;
        this.f24085b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f24084a.equals(rVar.f24084a) && this.f24085b.equals(rVar.f24085b);
    }

    public final int hashCode() {
        return this.f24085b.hashCode() + (this.f24084a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        t tVar = this.f24084a;
        sb2.append(tVar);
        t tVar2 = this.f24085b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return h3.o.p(sb2, str, "]");
    }
}
