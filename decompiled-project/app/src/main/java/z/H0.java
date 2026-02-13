package z;

/* loaded from: classes.dex */
public final class H0 extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public J0 f27872a;

    /* renamed from: b, reason: collision with root package name */
    public Db.c f27873b;

    /* renamed from: c, reason: collision with root package name */
    public Rb.a f27874c;

    /* renamed from: d, reason: collision with root package name */
    public float f27875d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f27876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J0 f27877f;

    /* renamed from: u, reason: collision with root package name */
    public int f27878u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(J0 j02, Jb.c cVar) {
        super(cVar);
        this.f27877f = j02;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27876e = obj;
        this.f27878u |= Integer.MIN_VALUE;
        return this.f27877f.a(null, null, this);
    }
}
