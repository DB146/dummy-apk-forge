package G0;

/* loaded from: classes.dex */
public final class i extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public j f4269a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4271c;

    /* renamed from: d, reason: collision with root package name */
    public int f4272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Jb.c cVar) {
        super(cVar);
        this.f4271c = jVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f4270b = obj;
        this.f4272d |= Integer.MIN_VALUE;
        return this.f4271c.a(0.0f, this);
    }
}
