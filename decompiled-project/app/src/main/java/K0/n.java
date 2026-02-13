package K0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final R0.c f5922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5924c;

    public n(R0.c cVar, int i7, int i10) {
        this.f5922a = cVar;
        this.f5923b = i7;
        this.f5924c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5922a.equals(nVar.f5922a) && this.f5923b == nVar.f5923b && this.f5924c == nVar.f5924c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5924c) + A3.c.c(this.f5923b, this.f5922a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f5922a);
        sb2.append(", startIndex=");
        sb2.append(this.f5923b);
        sb2.append(", endIndex=");
        return X.c.k(sb2, this.f5924c, ')');
    }
}
