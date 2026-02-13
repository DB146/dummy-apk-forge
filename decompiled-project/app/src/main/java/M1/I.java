package M1;

/* loaded from: classes.dex */
public final class I extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q10, Hb.d dVar) {
        super(2, dVar);
        this.f6593b = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new I(this.f6593b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6592a;
        Q q10 = this.f6593b;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                if (q10.f6627h.u() instanceof S) {
                    return q10.f6627h.u();
                }
                this.f6592a = 1;
                if (q10.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                    return (b0) obj;
                }
                com.bumptech.glide.c.c0(obj);
            }
            this.f6592a = 2;
            obj = Q.e(q10, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (b0) obj;
        } catch (Throwable th) {
            return new U(-1, th);
        }
    }
}
