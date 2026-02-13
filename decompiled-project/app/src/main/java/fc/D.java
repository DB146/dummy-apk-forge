package fc;

/* loaded from: classes2.dex */
public final class D extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f17058a;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Hb.d, fc.D] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? iVar = new Jb.i(2, dVar);
        iVar.f17058a = ((Number) obj).intValue();
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create(Integer.valueOf(((Number) obj).intValue()), (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Boolean.valueOf(this.f17058a > 0);
    }
}
