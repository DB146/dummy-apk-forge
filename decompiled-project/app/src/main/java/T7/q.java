package T7;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f9357c = new q(c.f9328b, k.f9348e);

    /* renamed from: d, reason: collision with root package name */
    public static final q f9358d = new q(c.f9329c, s.k);

    /* renamed from: a, reason: collision with root package name */
    public final c f9359a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9360b;

    public q(c cVar, s sVar) {
        this.f9359a = cVar;
        this.f9360b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9359a.equals(qVar.f9359a) && this.f9360b.equals(qVar.f9360b);
    }

    public final int hashCode() {
        return this.f9360b.hashCode() + (this.f9359a.f9331a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f9359a + ", node=" + this.f9360b + '}';
    }
}
