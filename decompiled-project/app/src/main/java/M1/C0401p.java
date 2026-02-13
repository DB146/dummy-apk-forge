package M1;

/* renamed from: M1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401p extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6708a;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Hb.d, M1.p] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? iVar = new Jb.i(2, dVar);
        iVar.f6708a = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0401p) create((b0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Boolean.valueOf(!(((b0) this.f6708a) instanceof S));
    }
}
