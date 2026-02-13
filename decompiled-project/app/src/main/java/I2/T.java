package I2;

/* loaded from: classes.dex */
public final class T extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f5081a;

    /* renamed from: b, reason: collision with root package name */
    public q3.s f5082b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f5084d;

    /* renamed from: e, reason: collision with root package name */
    public int f5085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(c0 c0Var, Jb.c cVar) {
        super(cVar);
        this.f5084d = c0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5083c = obj;
        this.f5085e |= Integer.MIN_VALUE;
        return c0.b(this.f5084d, this);
    }
}
