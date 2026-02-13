package y3;

import cc.E;

/* loaded from: classes.dex */
public final class n extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f26821b = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new n(this.f26821b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26820a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C2378a c2378a = this.f26821b.f26841U;
            this.f26820a = 1;
            c2378a.getClass();
            if (qVar == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
