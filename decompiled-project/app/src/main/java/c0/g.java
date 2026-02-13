package c0;

/* loaded from: classes.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final m f14106a;

    /* renamed from: b, reason: collision with root package name */
    public final m f14107b;

    public g(m mVar, m mVar2) {
        this.f14106a = mVar;
        this.f14107b = mVar2;
    }

    @Override // c0.m
    public final Object a(Object obj, Rb.e eVar) {
        return this.f14107b.a(this.f14106a.a(obj, eVar), eVar);
    }

    @Override // c0.m
    public final boolean b(Rb.c cVar) {
        return this.f14106a.b(cVar) && this.f14107b.b(cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.l.a(this.f14106a, gVar.f14106a) && kotlin.jvm.internal.l.a(this.f14107b, gVar.f14107b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14107b.hashCode() * 31) + this.f14106a.hashCode();
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("["), (String) a("", f.f14105a), ']');
    }
}
