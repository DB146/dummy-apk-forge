package y8;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f27424b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27425c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27426d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27427e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27428f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f27424b = str;
        this.f27425c = str2;
        this.f27426d = str3;
        this.f27427e = str4;
        this.f27428f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f27424b.equals(((c) eVar).f27424b)) {
            c cVar = (c) eVar;
            if (this.f27425c.equals(cVar.f27425c) && this.f27426d.equals(cVar.f27426d) && this.f27427e.equals(cVar.f27427e) && this.f27428f == cVar.f27428f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f27424b.hashCode() ^ 1000003) * 1000003) ^ this.f27425c.hashCode()) * 1000003) ^ this.f27426d.hashCode()) * 1000003) ^ this.f27427e.hashCode()) * 1000003;
        long j = this.f27428f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f27424b);
        sb2.append(", variantId=");
        sb2.append(this.f27425c);
        sb2.append(", parameterKey=");
        sb2.append(this.f27426d);
        sb2.append(", parameterValue=");
        sb2.append(this.f27427e);
        sb2.append(", templateVersion=");
        return X.c.f(this.f27428f, "}", sb2);
    }
}
