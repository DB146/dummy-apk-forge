package z;

import y.EnumC2292N;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567n extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T6.a f28037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC2292N f28038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.e f28039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2567n(T6.a aVar, EnumC2292N enumC2292N, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f28037b = aVar;
        this.f28038c = enumC2292N;
        this.f28039d = eVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2567n(this.f28037b, this.f28038c, this.f28039d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2567n) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28036a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            T6.a aVar2 = this.f28037b;
            y.Q q10 = (y.Q) aVar2.f9322c;
            C2568o c2568o = (C2568o) aVar2.f9321b;
            C2566m c2566m = new C2566m(aVar2, this.f28039d, null);
            this.f28036a = 1;
            q10.getClass();
            if (cc.F.k(new y.P(this.f28038c, q10, c2566m, c2568o, null), this) == aVar) {
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
