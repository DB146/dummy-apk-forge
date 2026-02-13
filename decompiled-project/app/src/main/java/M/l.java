package M;

import A8.J;
import cc.E;
import fc.P;

/* loaded from: classes.dex */
public final class l extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6507a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f6509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, Hb.d dVar) {
        super(2, dVar);
        this.f6509c = bVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        l lVar = new l(this.f6509c, dVar);
        lVar.f6508b = obj;
        return lVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6507a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
            return Db.q.f3365a;
        }
        com.bumptech.glide.c.c0(obj);
        E e2 = (E) this.f6508b;
        b bVar = this.f6509c;
        P p10 = bVar.f6472C.f4a;
        J j = new J(3, bVar, e2);
        this.f6507a = 1;
        p10.getClass();
        P.j(p10, j, this);
        return aVar;
    }
}
