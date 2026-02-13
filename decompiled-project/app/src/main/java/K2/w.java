package K2;

/* loaded from: classes.dex */
public final class w extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public x f6097a;

    /* renamed from: b, reason: collision with root package name */
    public String f6098b;

    /* renamed from: c, reason: collision with root package name */
    public Rb.c f6099c;

    /* renamed from: d, reason: collision with root package name */
    public i f6100d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f6102f;

    /* renamed from: u, reason: collision with root package name */
    public int f6103u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Jb.c cVar) {
        super(cVar);
        this.f6102f = xVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6101e = obj;
        this.f6103u |= Integer.MIN_VALUE;
        return this.f6102f.b(null, null, this);
    }
}
