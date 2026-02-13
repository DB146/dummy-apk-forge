package Hb;

/* loaded from: classes2.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f4914a;

    public a(h hVar) {
        this.f4914a = hVar;
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Hb.i
    public g get(h hVar) {
        return E6.b.l(this, hVar);
    }

    @Override // Hb.g
    public final h getKey() {
        return this.f4914a;
    }

    @Override // Hb.i
    public i minusKey(h hVar) {
        return E6.b.v(this, hVar);
    }

    @Override // Hb.i
    public final i plus(i iVar) {
        return E6.b.w(this, iVar);
    }
}
