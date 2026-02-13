package x;

/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26059a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26060b;

    public d0(Object obj, Object obj2) {
        this.f26059a = obj;
        this.f26060b = obj2;
    }

    @Override // x.c0
    public final Object a() {
        return this.f26059a;
    }

    @Override // x.c0
    public final Object c() {
        return this.f26060b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (kotlin.jvm.internal.l.a(this.f26059a, c0Var.a())) {
                if (kotlin.jvm.internal.l.a(this.f26060b, c0Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f26059a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f26060b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
