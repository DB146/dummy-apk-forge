package E8;

/* loaded from: classes.dex */
public final class l extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3790b;

    /* renamed from: c, reason: collision with root package name */
    public int f3791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Jb.c cVar) {
        super(cVar);
        this.f3790b = nVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f3789a = obj;
        this.f3791c |= Integer.MIN_VALUE;
        return this.f3790b.c(null, null, this);
    }
}
