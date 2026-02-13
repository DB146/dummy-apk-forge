package Q;

/* renamed from: Q.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509p0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8487a;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Hb.d, Q.p0] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? iVar = new Jb.i(2, dVar);
        iVar.f8487a = obj;
        return iVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0509p0) create((EnumC0507o0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Boolean.valueOf(((EnumC0507o0) this.f8487a) == EnumC0507o0.f8474a);
    }
}
