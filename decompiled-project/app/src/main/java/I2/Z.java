package I2;

/* loaded from: classes.dex */
public final class Z extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public q3.s f5113a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5115c;

    /* renamed from: d, reason: collision with root package name */
    public int f5116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(c0 c0Var, Jb.c cVar) {
        super(cVar);
        this.f5115c = c0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5114b = obj;
        this.f5116d |= Integer.MIN_VALUE;
        return this.f5115c.f(this);
    }
}
