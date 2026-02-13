package z;

import y.C2279A;

/* renamed from: z.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2560i0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28000a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2530B f28002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f28003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2560i0(C2530B c2530b, w0 w0Var, Hb.d dVar) {
        super(2, dVar);
        this.f28002c = c2530b;
        this.f28003d = w0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2560i0 c2560i0 = new C2560i0(this.f28002c, this.f28003d, dVar);
        c2560i0.f28001b = obj;
        return c2560i0;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2560i0) create((t0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28000a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C2279A c2279a = new C2279A(2, (t0) this.f28001b, this.f28003d);
            this.f28000a = 1;
            if (this.f28002c.invoke(c2279a, this) == aVar) {
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
