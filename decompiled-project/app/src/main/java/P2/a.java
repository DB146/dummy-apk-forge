package P2;

import Db.q;
import K2.r;

/* loaded from: classes.dex */
public final class a extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ba.o f7761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Hb.d dVar, Ba.o oVar) {
        super(2, dVar);
        this.f7761b = oVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        a aVar = new a(dVar, this.f7761b);
        aVar.f7760a = obj;
        return aVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((r) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        r rVar = (r) this.f7760a;
        kotlin.jvm.internal.l.c(rVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        return this.f7761b.invoke(rVar.c());
    }
}
