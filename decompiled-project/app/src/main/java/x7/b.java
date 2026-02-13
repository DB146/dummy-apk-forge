package x7;

/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final String f26241b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26242c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26243d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26244e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26245f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f26241b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f26242c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f26243d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f26244e = str4;
        this.f26245f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f26241b.equals(((b) nVar).f26241b)) {
            b bVar = (b) nVar;
            if (this.f26242c.equals(bVar.f26242c) && this.f26243d.equals(bVar.f26243d) && this.f26244e.equals(bVar.f26244e) && this.f26245f == bVar.f26245f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f26241b.hashCode() ^ 1000003) * 1000003) ^ this.f26242c.hashCode()) * 1000003) ^ this.f26243d.hashCode()) * 1000003) ^ this.f26244e.hashCode()) * 1000003;
        long j = this.f26245f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f26241b);
        sb2.append(", parameterKey=");
        sb2.append(this.f26242c);
        sb2.append(", parameterValue=");
        sb2.append(this.f26243d);
        sb2.append(", variantId=");
        sb2.append(this.f26244e);
        sb2.append(", templateVersion=");
        return X.c.f(this.f26245f, "}", sb2);
    }
}
