package Q;

/* loaded from: classes.dex */
public final class D implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Rb.c f8298a;

    /* renamed from: b, reason: collision with root package name */
    public E f8299b;

    public D(Rb.c cVar) {
        this.f8298a = cVar;
    }

    @Override // Q.v0
    public final void b() {
        this.f8299b = (E) this.f8298a.invoke(C0480b.f8376b);
    }

    @Override // Q.v0
    public final void c() {
    }

    @Override // Q.v0
    public final void d() {
        E e2 = this.f8299b;
        if (e2 != null) {
            e2.b();
        }
        this.f8299b = null;
    }
}
