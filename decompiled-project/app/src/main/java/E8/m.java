package E8;

import Db.q;

/* loaded from: classes.dex */
public final class m extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q1.g f3794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f3795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, Q1.g gVar, n nVar, Hb.d dVar) {
        super(2, dVar);
        this.f3793b = obj;
        this.f3794c = gVar;
        this.f3795d = nVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        m mVar = new m(this.f3793b, this.f3794c, this.f3795d, dVar);
        mVar.f3792a = obj;
        return mVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((Q1.b) obj, (Hb.d) obj2);
        q qVar = q.f3365a;
        mVar.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Q1.b bVar = (Q1.b) this.f3792a;
        Object obj2 = this.f3793b;
        Q1.g key = this.f3794c;
        if (obj2 != null) {
            bVar.getClass();
            kotlin.jvm.internal.l.e(key, "key");
            bVar.d(key, obj2);
        } else {
            bVar.getClass();
            kotlin.jvm.internal.l.e(key, "key");
            bVar.b();
            bVar.f8603a.remove(key);
        }
        n.a(this.f3795d, bVar);
        return q.f3365a;
    }
}
