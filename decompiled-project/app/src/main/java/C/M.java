package C;

/* loaded from: classes.dex */
public final class M implements O {

    /* renamed from: a, reason: collision with root package name */
    public final O f2365a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2366b;

    public M(O o10, O o11) {
        this.f2365a = o10;
        this.f2366b = o11;
    }

    @Override // C.O
    public final int a(V0.c cVar) {
        return Math.max(this.f2365a.a(cVar), this.f2366b.a(cVar));
    }

    @Override // C.O
    public final int b(V0.c cVar) {
        return Math.max(this.f2365a.b(cVar), this.f2366b.b(cVar));
    }

    @Override // C.O
    public final int c(V0.c cVar, V0.l lVar) {
        return Math.max(this.f2365a.c(cVar, lVar), this.f2366b.c(cVar, lVar));
    }

    @Override // C.O
    public final int d(V0.c cVar, V0.l lVar) {
        return Math.max(this.f2365a.d(cVar, lVar), this.f2366b.d(cVar, lVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return kotlin.jvm.internal.l.a(m10.f2365a, this.f2365a) && kotlin.jvm.internal.l.a(m10.f2366b, this.f2366b);
    }

    public final int hashCode() {
        return (this.f2366b.hashCode() * 31) + this.f2365a.hashCode();
    }

    public final String toString() {
        return "(" + this.f2365a + " ∪ " + this.f2366b + ')';
    }
}
