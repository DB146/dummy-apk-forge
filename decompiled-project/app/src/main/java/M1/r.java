package M1;

/* loaded from: classes.dex */
public final class r extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6711a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f6712b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6713c;

    public /* synthetic */ r(int i7, Hb.d dVar) {
        super(i7, dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q q10, Hb.d dVar) {
        super(3, dVar);
        this.f6713c = q10;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f6711a) {
            case 0:
                return new r((Q) this.f6713c, (Hb.d) obj3).invokeSuspend(Db.q.f3365a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (Hb.d) obj3);
                rVar.f6713c = (O1.c) obj;
                return rVar.invokeSuspend(Db.q.f3365a);
        }
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6711a) {
            case 0:
                Ib.a aVar = Ib.a.f5345a;
                int i7 = this.f6712b;
                if (i7 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    this.f6712b = 1;
                    if (Q.b((Q) this.f6713c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return Db.q.f3365a;
            default:
                Ib.a aVar2 = Ib.a.f5345a;
                int i10 = this.f6712b;
                if (i10 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    O1.c cVar = (O1.c) this.f6713c;
                    this.f6712b = 1;
                    cVar.getClass();
                    obj = O1.c.a(cVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return obj;
        }
    }
}
