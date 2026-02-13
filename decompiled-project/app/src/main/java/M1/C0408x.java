package M1;

/* renamed from: M1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408x extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f6730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f6731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408x(H h10, Hb.d dVar) {
        super(1, dVar);
        this.f6731b = h10;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new C0408x(this.f6731b, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((C0408x) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6730a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6730a = 1;
            obj = this.f6731b.invoke(this);
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
