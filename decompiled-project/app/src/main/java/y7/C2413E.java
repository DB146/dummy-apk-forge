package y7;

/* renamed from: y7.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2413E extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27116a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27117b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27118c;

    public C2413E(String str, String str2, String str3) {
        this.f27116a = str;
        this.f27117b = str2;
        this.f27118c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.f27116a.equals(((C2413E) p0Var).f27116a)) {
            C2413E c2413e = (C2413E) p0Var;
            if (this.f27117b.equals(c2413e.f27117b) && this.f27118c.equals(c2413e.f27118c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27116a.hashCode() ^ 1000003) * 1000003) ^ this.f27117b.hashCode()) * 1000003) ^ this.f27118c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f27116a);
        sb2.append(", libraryName=");
        sb2.append(this.f27117b);
        sb2.append(", buildId=");
        return h3.o.p(sb2, this.f27118c, "}");
    }
}
