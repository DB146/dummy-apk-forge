package K2;

import cc.E;

/* loaded from: classes.dex */
public final class f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f6026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Rb.e eVar, x xVar, Hb.d dVar) {
        super(2, dVar);
        this.f6025b = (Jb.i) eVar;
        this.f6026c = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new f(this.f6025b, this.f6026c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6024a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6024a = 1;
            obj = this.f6025b.invoke(this.f6026c, this);
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
