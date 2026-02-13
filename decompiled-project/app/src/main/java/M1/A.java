package M1;

import cc.C0953t;
import fc.InterfaceC1161h;

/* loaded from: classes.dex */
public final class A extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Q q10, Hb.d dVar) {
        super(2, dVar);
        this.f6553b = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new A(this.f6553b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6552a;
        Db.q qVar = Db.q.f3365a;
        Q q10 = this.f6553b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6552a = 1;
            Object o10 = ((C0953t) q10.f6628i.f23397c).o(this);
            if (o10 != aVar) {
                o10 = qVar;
            }
            if (o10 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    com.bumptech.glide.c.c0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        InterfaceC1161h f4 = fc.Q.f(q10.g().f6657c, -1);
        A8.F f10 = new A8.F(q10, 2);
        this.f6552a = 2;
        return f4.a(f10, this) == aVar ? aVar : qVar;
    }
}
