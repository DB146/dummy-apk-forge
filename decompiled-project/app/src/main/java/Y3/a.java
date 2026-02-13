package Y3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11144a;

    /* renamed from: b, reason: collision with root package name */
    public final d f11145b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11146c;

    public a(Object obj, d dVar, b bVar) {
        this.f11144a = obj;
        this.f11145b = dVar;
        this.f11146c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f11144a.equals(aVar.f11144a) && this.f11145b.equals(aVar.f11145b)) {
            b bVar = aVar.f11146c;
            b bVar2 = this.f11146c;
            if (bVar2 == null) {
                if (bVar == null) {
                    return true;
                }
            } else if (bVar2.equals(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f11144a.hashCode()) * 1000003) ^ this.f11145b.hashCode()) * 1000003;
        b bVar = this.f11146c;
        return (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f11144a + ", priority=" + this.f11145b + ", productData=" + this.f11146c + ", eventContext=null}";
    }
}
