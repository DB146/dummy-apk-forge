package z;

import Q.C0487e0;

/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2566m extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28029a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T6.a f28031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.e f28032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2566m(T6.a aVar, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f28031c = aVar;
        this.f28032d = eVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2566m c2566m = new C2566m(this.f28031c, this.f28032d, dVar);
        c2566m.f28030b = obj;
        return c2566m;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2566m) create((Z) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28029a;
        T6.a aVar2 = this.f28031c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                Z z8 = (Z) this.f28030b;
                ((C0487e0) aVar2.f9323d).setValue(Boolean.TRUE);
                Rb.e eVar = this.f28032d;
                this.f28029a = 1;
                if (eVar.invoke(z8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            ((C0487e0) aVar2.f9323d).setValue(Boolean.FALSE);
            return Db.q.f3365a;
        } catch (Throwable th) {
            ((C0487e0) aVar2.f9323d).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
