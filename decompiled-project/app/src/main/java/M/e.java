package M;

import A8.J;
import cc.E;
import fc.P;

/* loaded from: classes.dex */
public final class e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6485a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.i f6487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f6488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(A.i iVar, a aVar, Hb.d dVar) {
        super(2, dVar);
        this.f6487c = iVar;
        this.f6488d = aVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        e eVar = new e(this.f6487c, this.f6488d, dVar);
        eVar.f6486b = obj;
        return eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6485a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
            return Db.q.f3365a;
        }
        com.bumptech.glide.c.c0(obj);
        E e2 = (E) this.f6486b;
        P p10 = this.f6487c.f4a;
        J j = new J(2, this.f6488d, e2);
        this.f6485a = 1;
        p10.getClass();
        P.j(p10, j, this);
        return aVar;
    }
}
