package J8;

/* renamed from: J8.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361p extends G8.z {

    /* renamed from: b, reason: collision with root package name */
    public static final C0360o f5711b = new C0360o(new C0361p(G8.x.f4397b), 0);

    /* renamed from: a, reason: collision with root package name */
    public final G8.x f5712a;

    public C0361p(G8.x xVar) {
        this.f5712a = xVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        int j02 = aVar.j0();
        int b2 = P.c.b(j02);
        if (b2 == 5 || b2 == 6) {
            return this.f5712a.a(aVar);
        }
        if (b2 == 8) {
            aVar.f0();
            return null;
        }
        throw new Db.d("Expecting number, got: " + A3.c.t(j02) + "; at path " + aVar.V(false), 4);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.d0((Number) obj);
    }
}
