package W3;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Class f10615a;

    /* renamed from: b, reason: collision with root package name */
    public Class f10616b;

    /* renamed from: c, reason: collision with root package name */
    public Class f10617c;

    public m(Class cls, Class cls2, Class cls3) {
        this.f10615a = cls;
        this.f10616b = cls2;
        this.f10617c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f10615a.equals(mVar.f10615a) && this.f10616b.equals(mVar.f10616b) && o.b(this.f10617c, mVar.f10617c);
    }

    public final int hashCode() {
        int hashCode = (this.f10616b.hashCode() + (this.f10615a.hashCode() * 31)) * 31;
        Class cls = this.f10617c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f10615a + ", second=" + this.f10616b + '}';
    }
}
