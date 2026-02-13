package M1;

/* loaded from: classes.dex */
public final class C extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f6559a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f6560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6561c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6563e;

    /* renamed from: f, reason: collision with root package name */
    public int f6564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Q q10, Hb.d dVar) {
        super(dVar);
        this.f6563e = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6562d = obj;
        this.f6564f |= Integer.MIN_VALUE;
        return Q.e(this.f6563e, false, this);
    }
}
