package O1;

/* loaded from: classes.dex */
public final class g extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public i f7438a;

    /* renamed from: b, reason: collision with root package name */
    public c f7439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7440c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f7442e;

    /* renamed from: f, reason: collision with root package name */
    public int f7443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Jb.c cVar) {
        super(cVar);
        this.f7442e = iVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f7441d = obj;
        this.f7443f |= Integer.MIN_VALUE;
        return this.f7442e.a(null, this);
    }
}
