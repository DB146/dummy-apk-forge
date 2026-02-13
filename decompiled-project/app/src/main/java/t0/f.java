package t0;

/* loaded from: classes.dex */
public final class f extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public g f24426a;

    /* renamed from: b, reason: collision with root package name */
    public long f24427b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f24429d;

    /* renamed from: e, reason: collision with root package name */
    public int f24430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Jb.c cVar) {
        super(cVar);
        this.f24429d = gVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24428c = obj;
        this.f24430e |= Integer.MIN_VALUE;
        return this.f24429d.b(0L, this);
    }
}
