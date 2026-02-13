package t0;

/* loaded from: classes.dex */
public final class e extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public g f24420a;

    /* renamed from: b, reason: collision with root package name */
    public long f24421b;

    /* renamed from: c, reason: collision with root package name */
    public long f24422c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f24424e;

    /* renamed from: f, reason: collision with root package name */
    public int f24425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Jb.c cVar) {
        super(cVar);
        this.f24424e = gVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24423d = obj;
        this.f24425f |= Integer.MIN_VALUE;
        return this.f24424e.b0(0L, 0L, this);
    }
}
