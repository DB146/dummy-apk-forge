package z;

import y.EnumC2292N;

/* loaded from: classes.dex */
public final class U extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f27941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2542N f27942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(w0 w0Var, C2542N c2542n, Hb.d dVar) {
        super(2, dVar);
        this.f27941b = w0Var;
        this.f27942c = c2542n;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new U(this.f27941b, this.f27942c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27940a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            EnumC2292N enumC2292N = EnumC2292N.f26417b;
            this.f27940a = 1;
            if (this.f27941b.e(enumC2292N, this.f27942c, this) == aVar) {
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
