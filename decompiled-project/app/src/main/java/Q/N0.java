package Q;

/* loaded from: classes.dex */
public final class N0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8339a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Hb.i f8341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc.Z f8342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(Hb.i iVar, fc.Z z8, Hb.d dVar) {
        super(2, dVar);
        this.f8341c = iVar;
        this.f8342d = z8;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        N0 n02 = new N0(this.f8341c, this.f8342d, dVar);
        n02.f8340b = obj;
        return n02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((C0497j0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8339a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0497j0 c0497j0 = (C0497j0) this.f8340b;
            Hb.j jVar = Hb.j.f4919a;
            Hb.i iVar = this.f8341c;
            boolean a9 = kotlin.jvm.internal.l.a(iVar, jVar);
            fc.Z z8 = this.f8342d;
            if (a9) {
                L0 l02 = new L0(c0497j0, 0);
                this.f8339a = 1;
                if (z8.a(l02, this) == aVar) {
                    return aVar;
                }
            } else {
                M0 m02 = new M0(z8, c0497j0, null);
                this.f8339a = 2;
                if (cc.F.K(iVar, m02, this) == aVar) {
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
