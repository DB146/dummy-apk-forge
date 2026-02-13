package L7;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public String f6365a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6366b;

    /* renamed from: c, reason: collision with root package name */
    public String f6367c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6366b == kVar.f6366b && this.f6365a.equals(kVar.f6365a)) {
            return this.f6367c.equals(kVar.f6367c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6367c.hashCode() + (((this.f6365a.hashCode() * 31) + (this.f6366b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("http");
        sb2.append(this.f6366b ? "s" : "");
        sb2.append("://");
        sb2.append(this.f6365a);
        return sb2.toString();
    }
}
