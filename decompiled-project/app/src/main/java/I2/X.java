package I2;

/* loaded from: classes.dex */
public final class X extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f5095a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0333w f5096b;

    /* renamed from: c, reason: collision with root package name */
    public String f5097c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f5098d;

    /* renamed from: e, reason: collision with root package name */
    public int f5099e;

    /* renamed from: f, reason: collision with root package name */
    public int f5100f;

    /* renamed from: u, reason: collision with root package name */
    public int f5101u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5102v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f5103w;

    /* renamed from: x, reason: collision with root package name */
    public int f5104x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(c0 c0Var, Jb.c cVar) {
        super(cVar);
        this.f5103w = c0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5102v = obj;
        this.f5104x |= Integer.MIN_VALUE;
        return c0.c(this.f5103w, null, 0, this);
    }
}
