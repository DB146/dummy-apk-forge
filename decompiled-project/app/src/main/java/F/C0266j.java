package F;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3979b;

    public C0266j(int i7, int i10) {
        this.f3978a = i7;
        this.f3979b = i10;
        if (!(i7 >= 0)) {
            B.a.a("negative start index");
        }
        if (i10 >= i7) {
            return;
        }
        B.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0266j)) {
            return false;
        }
        C0266j c0266j = (C0266j) obj;
        return this.f3978a == c0266j.f3978a && this.f3979b == c0266j.f3979b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3979b) + (Integer.hashCode(this.f3978a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f3978a);
        sb2.append(", end=");
        return X.c.k(sb2, this.f3979b, ')');
    }
}
