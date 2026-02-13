package P2;

import Db.q;
import K2.r;

/* loaded from: classes.dex */
public final class f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f7783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Rb.c cVar, Hb.d dVar) {
        super(2, dVar);
        this.f7783b = cVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        f fVar = new f(this.f7783b, dVar);
        fVar.f7782a = obj;
        return fVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((r) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        r rVar = (r) this.f7782a;
        kotlin.jvm.internal.l.c(rVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        return this.f7783b.invoke(rVar.c());
    }
}
