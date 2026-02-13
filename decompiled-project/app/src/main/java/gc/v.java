package gc;

/* loaded from: classes2.dex */
public final class v implements Hb.i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f17560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hb.i f17561b;

    public v(Hb.i iVar, Throwable th) {
        this.f17560a = th;
        this.f17561b = iVar;
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return this.f17561b.fold(obj, eVar);
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        return this.f17561b.get(hVar);
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        return this.f17561b.minusKey(hVar);
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        return this.f17561b.plus(iVar);
    }
}
