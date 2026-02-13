package z;

/* loaded from: classes.dex */
public final class n0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f28041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f28042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f28043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, float f4, float f10, Hb.d dVar) {
        super(2, dVar);
        this.f28041b = p0Var;
        this.f28042c = f4;
        this.f28043d = f10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new n0(this.f28041b, this.f28042c, this.f28043d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28040a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            w0 w0Var = this.f28041b.f28061R;
            long floatToRawIntBits = (Float.floatToRawIntBits(this.f28042c) << 32) | (Float.floatToRawIntBits(this.f28043d) & 4294967295L);
            this.f28040a = 1;
            if (AbstractC2556g0.a(w0Var, floatToRawIntBits, this) == aVar) {
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
