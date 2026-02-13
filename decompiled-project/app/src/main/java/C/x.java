package C;

/* loaded from: classes.dex */
public final class x implements O {

    /* renamed from: a, reason: collision with root package name */
    public final C0216a f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final O f2447b;

    public x(C0216a c0216a, O o10) {
        this.f2446a = c0216a;
        this.f2447b = o10;
    }

    @Override // C.O
    public final int a(V0.c cVar) {
        int a9 = this.f2446a.e().f23344d - this.f2447b.a(cVar);
        if (a9 < 0) {
            return 0;
        }
        return a9;
    }

    @Override // C.O
    public final int b(V0.c cVar) {
        int b2 = this.f2446a.e().f23342b - this.f2447b.b(cVar);
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }

    @Override // C.O
    public final int c(V0.c cVar, V0.l lVar) {
        int c10 = this.f2446a.e().f23343c - this.f2447b.c(cVar, lVar);
        if (c10 < 0) {
            return 0;
        }
        return c10;
    }

    @Override // C.O
    public final int d(V0.c cVar, V0.l lVar) {
        int d10 = this.f2446a.e().f23341a - this.f2447b.d(cVar, lVar);
        if (d10 < 0) {
            return 0;
        }
        return d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.l.a(xVar.f2446a, this.f2446a) && kotlin.jvm.internal.l.a(xVar.f2447b, this.f2447b);
    }

    public final int hashCode() {
        return this.f2447b.hashCode() + (this.f2446a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f2446a + " - " + this.f2447b + ')';
    }
}
