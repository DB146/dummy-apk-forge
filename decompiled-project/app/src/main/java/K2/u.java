package K2;

/* loaded from: classes.dex */
public final class u extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public x f6085a;

    /* renamed from: b, reason: collision with root package name */
    public i f6086b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6087c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6089e;

    /* renamed from: f, reason: collision with root package name */
    public int f6090f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, Jb.c cVar) {
        super(cVar);
        this.f6089e = xVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6088d = obj;
        this.f6090f |= Integer.MIN_VALUE;
        return this.f6089e.f(false, this);
    }
}
