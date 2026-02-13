package I2;

/* loaded from: classes.dex */
public final class N extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5060a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5062c;

    /* renamed from: d, reason: collision with root package name */
    public int f5063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(c0 c0Var, Jb.c cVar) {
        super(cVar);
        this.f5062c = c0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5061b = obj;
        this.f5063d |= Integer.MIN_VALUE;
        return c0.a(this.f5062c, null, this);
    }
}
