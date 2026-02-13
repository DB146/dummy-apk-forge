package gc;

import fc.InterfaceC1162i;
import fc.Q;

/* renamed from: gc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1210e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17508a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f17510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1212g f17511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210e(InterfaceC1162i interfaceC1162i, AbstractC1212g abstractC1212g, Hb.d dVar) {
        super(2, dVar);
        this.f17510c = interfaceC1162i;
        this.f17511d = abstractC1212g;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C1210e c1210e = new C1210e(this.f17510c, this.f17511d, dVar);
        c1210e.f17509b = obj;
        return c1210e;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1210e) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17508a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            ec.t g = this.f17511d.g((cc.E) this.f17509b);
            this.f17508a = 1;
            Object i10 = Q.i(this.f17510c, g, true, this);
            if (i10 != aVar) {
                i10 = qVar;
            }
            if (i10 == aVar) {
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
