package G0;

/* loaded from: classes.dex */
public final class c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public f f4246a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4247b;

    /* renamed from: c, reason: collision with root package name */
    public V0.j f4248c;

    /* renamed from: d, reason: collision with root package name */
    public int f4249d;

    /* renamed from: e, reason: collision with root package name */
    public int f4250e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4251f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f4252u;

    /* renamed from: v, reason: collision with root package name */
    public int f4253v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Jb.c cVar) {
        super(cVar);
        this.f4252u = fVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f4251f = obj;
        this.f4253v |= Integer.MIN_VALUE;
        return f.a(this.f4252u, null, null, this);
    }
}
