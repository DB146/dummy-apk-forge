package K2;

import cc.E;

/* loaded from: classes.dex */
public final class g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.e f6028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f6029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Rb.e eVar, kotlin.jvm.internal.v vVar, Hb.d dVar) {
        super(2, dVar);
        this.f6028b = eVar;
        this.f6029c = vVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new g(this.f6028b, this.f6029c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6027a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Object obj2 = this.f6029c.f19134a;
            this.f6027a = 1;
            obj = this.f6028b.invoke(obj2, this);
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
