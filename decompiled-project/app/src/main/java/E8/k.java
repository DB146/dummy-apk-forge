package E8;

import Db.q;
import Eb.B;
import cc.E;
import fc.InterfaceC1161h;
import fc.Q;

/* loaded from: classes.dex */
public final class k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public n f3786a;

    /* renamed from: b, reason: collision with root package name */
    public int f3787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f3788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Hb.d dVar) {
        super(2, dVar);
        this.f3788c = nVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new k(this.f3788c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3787b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            n nVar2 = this.f3788c;
            InterfaceC1161h data = nVar2.f3800a.getData();
            this.f3786a = nVar2;
            this.f3787b = 1;
            Object j = Q.j(data, this);
            if (j == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = j;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f3786a;
            com.bumptech.glide.c.c0(obj);
        }
        n.a(nVar, new Q1.b(B.M(((Q1.b) obj).a()), true));
        return q.f3365a;
    }
}
