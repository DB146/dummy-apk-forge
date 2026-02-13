package p7;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f23152a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f23153b;

    public p(Class cls, Class cls2) {
        this.f23152a = cls;
        this.f23153b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f23153b.equals(pVar.f23153b)) {
            return this.f23152a.equals(pVar.f23152a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23152a.hashCode() + (this.f23153b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f23153b;
        Class cls2 = this.f23152a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
