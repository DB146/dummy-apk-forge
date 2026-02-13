package Y0;

import cc.E;

/* loaded from: classes.dex */
public final class g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f11084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j, Hb.d dVar) {
        super(2, dVar);
        this.f11085b = jVar;
        this.f11086c = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new g(this.f11085b, this.f11086c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f11084a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            j jVar = this.f11085b;
            this.f11084a = 1;
            if (jVar.f11105a.b(this.f11086c, this) == aVar) {
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
