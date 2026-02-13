package z;

import y.EnumC2292N;

/* loaded from: classes.dex */
public final class l0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f28027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, long j, Hb.d dVar) {
        super(2, dVar);
        this.f28027b = p0Var;
        this.f28028c = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new l0(this.f28027b, this.f28028c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28026a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            w0 w0Var = this.f28027b.f28061R;
            EnumC2292N enumC2292N = EnumC2292N.f26417b;
            C2564k0 c2564k0 = new C2564k0(this.f28028c, null);
            this.f28026a = 1;
            if (w0Var.e(enumC2292N, c2564k0, this) == aVar) {
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
