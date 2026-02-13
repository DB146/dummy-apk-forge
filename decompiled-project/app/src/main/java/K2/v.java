package K2;

/* loaded from: classes.dex */
public final class v extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6091a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6092b;

    /* renamed from: c, reason: collision with root package name */
    public int f6093c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6095e;

    /* renamed from: f, reason: collision with root package name */
    public int f6096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Jb.c cVar) {
        super(cVar);
        this.f6095e = xVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6094d = obj;
        this.f6096f |= Integer.MIN_VALUE;
        return this.f6095e.g(null, null, this);
    }
}
