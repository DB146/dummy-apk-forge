package A8;

/* loaded from: classes.dex */
public final class L extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, Hb.d dVar) {
        super(2, dVar);
        this.f563b = str;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        L l10 = new L(this.f563b, dVar);
        l10.f562a = obj;
        return l10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        L l10 = (L) create((Q1.b) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        l10.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Q1.b bVar = (Q1.b) this.f562a;
        bVar.getClass();
        Q1.g key = AbstractC0055t.f718c;
        kotlin.jvm.internal.l.e(key, "key");
        bVar.d(key, this.f563b);
        return Db.q.f3365a;
    }
}
