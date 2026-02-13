package P2;

import Db.q;
import I2.E;

/* loaded from: classes.dex */
public final class c extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f7768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f7769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ba.o f7770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E e2, Ba.o oVar, Hb.d dVar) {
        super(2, dVar);
        this.f7769b = e2;
        this.f7770c = oVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new c(this.f7769b, this.f7770c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7768a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e2 = this.f7769b;
            b bVar = new b((e2.p() && e2.q()) ? false : true, e2, null, this.f7770c);
            this.f7768a = 1;
            obj = e2.w(false, bVar, this);
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
