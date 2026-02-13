package N2;

import Db.q;
import Hb.d;
import I2.E;
import Jb.i;
import P2.j;
import Rb.e;

/* loaded from: classes.dex */
public final class b extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f7158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f7159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.c f7160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E e2, Rb.c cVar, d dVar) {
        super(2, dVar);
        this.f7159b = e2;
        this.f7160c = cVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new b(this.f7159b, this.f7160c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((cc.E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f7158a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f7158a = 1;
            obj = j.m(this.f7159b, true, true, this.f7160c, this);
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
