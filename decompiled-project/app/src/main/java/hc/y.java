package hc;

/* loaded from: classes2.dex */
public final class y implements Hb.g {

    /* renamed from: a, reason: collision with root package name */
    public final K2.x f17978a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f17979b;

    /* renamed from: c, reason: collision with root package name */
    public final z f17980c;

    public y(K2.x xVar, ThreadLocal threadLocal) {
        this.f17978a = xVar;
        this.f17979b = threadLocal;
        this.f17980c = new z(threadLocal);
    }

    public final void a(Object obj) {
        this.f17979b.set(obj);
    }

    public final Object b(Hb.i iVar) {
        ThreadLocal threadLocal = this.f17979b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f17978a);
        return obj;
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        if (this.f17980c.equals(hVar)) {
            return this;
        }
        return null;
    }

    @Override // Hb.g
    public final Hb.h getKey() {
        return this.f17980c;
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        return this.f17980c.equals(hVar) ? Hb.j.f4919a : this;
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        return E6.b.w(this, iVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f17978a + ", threadLocal = " + this.f17979b + ')';
    }
}
