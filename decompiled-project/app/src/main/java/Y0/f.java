package Y0;

import cc.E;

/* loaded from: classes.dex */
public final class f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f11080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f11082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z8, j jVar, long j, Hb.d dVar) {
        super(2, dVar);
        this.f11081b = z8;
        this.f11082c = jVar;
        this.f11083d = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new f(this.f11081b, this.f11082c, this.f11083d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f11080a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            j jVar = this.f11082c;
            if (this.f11081b) {
                this.f11080a = 2;
                if (jVar.f11105a.a(this.f11083d, 0L, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f11080a = 1;
                if (jVar.f11105a.a(0L, this.f11083d, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
