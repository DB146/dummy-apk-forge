package gc;

import I2.Q;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class m extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17531a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f17533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f17534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        super(2, dVar);
        this.f17533c = nVar;
        this.f17534d = interfaceC1162i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        m mVar = new m(this.f17533c, this.f17534d, dVar);
        mVar.f17532b = obj;
        return mVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17531a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.E e2 = (cc.E) this.f17532b;
            ?? obj2 = new Object();
            n nVar = this.f17533c;
            InterfaceC1161h interfaceC1161h = nVar.f17521d;
            Q q10 = new Q(obj2, e2, nVar, this.f17534d);
            this.f17531a = 1;
            if (interfaceC1161h.a(q10, this) == aVar) {
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
