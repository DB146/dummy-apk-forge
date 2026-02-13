package z;

import o4.C1798l;

/* loaded from: classes.dex */
public final class P extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1798l f27928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C1798l c1798l, Hb.d dVar) {
        super(2, dVar);
        this.f27928b = c1798l;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new P(this.f27928b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27927a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            ec.d dVar = (ec.d) this.f27928b.f21860f;
            this.f27927a = 1;
            obj = cc.F.k(new C2539K(dVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj;
    }
}
