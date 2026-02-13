package q3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f23378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23380c;

    public g(String workSpecId, int i7, int i10) {
        kotlin.jvm.internal.l.e(workSpecId, "workSpecId");
        this.f23378a = workSpecId;
        this.f23379b = i7;
        this.f23380c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.f23378a, gVar.f23378a) && this.f23379b == gVar.f23379b && this.f23380c == gVar.f23380c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23380c) + A3.c.c(this.f23379b, this.f23378a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f23378a);
        sb2.append(", generation=");
        sb2.append(this.f23379b);
        sb2.append(", systemId=");
        return X.c.k(sb2, this.f23380c, ')');
    }
}
