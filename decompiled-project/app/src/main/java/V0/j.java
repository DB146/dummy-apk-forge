package V0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f9976e = new j(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f9977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9980d;

    public j(int i7, int i10, int i11, int i12) {
        this.f9977a = i7;
        this.f9978b = i10;
        this.f9979c = i11;
        this.f9980d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9977a == jVar.f9977a && this.f9978b == jVar.f9978b && this.f9979c == jVar.f9979c && this.f9980d == jVar.f9980d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9980d) + A3.c.c(this.f9979c, A3.c.c(this.f9978b, Integer.hashCode(this.f9977a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f9977a);
        sb2.append(", ");
        sb2.append(this.f9978b);
        sb2.append(", ");
        sb2.append(this.f9979c);
        sb2.append(", ");
        return X.c.k(sb2, this.f9980d, ')');
    }
}
