package N0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f7148a;

    /* renamed from: b, reason: collision with root package name */
    public final k f7149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7151d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7152e;

    public r(q qVar, k kVar, int i7, int i10, Object obj) {
        this.f7148a = qVar;
        this.f7149b = kVar;
        this.f7150c = i7;
        this.f7151d = i10;
        this.f7152e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(this.f7148a, rVar.f7148a) && kotlin.jvm.internal.l.a(this.f7149b, rVar.f7149b) && i.a(this.f7150c, rVar.f7150c) && this.f7151d == rVar.f7151d && kotlin.jvm.internal.l.a(this.f7152e, rVar.f7152e);
    }

    public final int hashCode() {
        q qVar = this.f7148a;
        int c10 = A3.c.c(this.f7151d, A3.c.c(this.f7150c, (((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f7149b.f7143a) * 31, 31), 31);
        Object obj = this.f7152e;
        return c10 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f7148a);
        sb2.append(", fontWeight=");
        sb2.append(this.f7149b);
        sb2.append(", fontStyle=");
        int i7 = this.f7150c;
        sb2.append((Object) (i.a(i7, 0) ? "Normal" : i.a(i7, 1) ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        sb2.append((Object) j.a(this.f7151d));
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f7152e);
        sb2.append(')');
        return sb2.toString();
    }
}
