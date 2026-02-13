package E8;

/* loaded from: classes.dex */
public final class i extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public j f3780a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3782c;

    /* renamed from: d, reason: collision with root package name */
    public int f3783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Jb.c cVar) {
        super(cVar);
        this.f3782c = jVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f3781b = obj;
        this.f3783d |= Integer.MIN_VALUE;
        return this.f3782c.b(this);
    }
}
