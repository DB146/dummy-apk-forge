package x;

/* loaded from: classes.dex */
public final class K extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f25937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f25940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f25941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f25942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Object obj, Object obj2, O o10, i0 i0Var, float f4, Hb.d dVar) {
        super(1, dVar);
        this.f25938b = obj;
        this.f25939c = obj2;
        this.f25940d = o10;
        this.f25941e = i0Var;
        this.f25942f = f4;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new K(this.f25938b, this.f25939c, this.f25940d, this.f25941e, this.f25942f, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((K) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25937a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            J j = new J(this.f25938b, this.f25939c, this.f25940d, this.f25941e, this.f25942f, null);
            this.f25937a = 1;
            if (cc.F.k(j, this) == aVar) {
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
