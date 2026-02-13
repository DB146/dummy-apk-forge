package z;

import i0.C1289b;

/* loaded from: classes.dex */
public final class o0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28045a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f28046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f28047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, Hb.d dVar) {
        super(2, dVar);
        this.f28047c = p0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        o0 o0Var = new o0(this.f28047c, dVar);
        o0Var.f28046b = ((C1289b) obj).f18172a;
        return o0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((C1289b) obj).f18172a;
        o0 o0Var = new o0(this.f28047c, (Hb.d) obj2);
        o0Var.f28046b = j;
        return o0Var.invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28045a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            long j = this.f28046b;
            w0 w0Var = this.f28047c.f28061R;
            this.f28045a = 1;
            obj = AbstractC2556g0.a(w0Var, j, this);
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
