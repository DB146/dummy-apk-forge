package M;

import E.u;
import cc.E;
import x.o0;

/* loaded from: classes.dex */
public final class q extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f6520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, o0 o0Var, Hb.d dVar) {
        super(2, dVar);
        this.f6519b = uVar;
        this.f6520c = o0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new q(this.f6519b, this.f6520c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6518a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Y.k kVar = (Y.k) this.f6519b.f3500c;
            Float f4 = new Float(0.0f);
            this.f6518a = 1;
            if (Y.k.c(kVar, f4, this.f6520c, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
