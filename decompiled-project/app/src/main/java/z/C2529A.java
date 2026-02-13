package z;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2529A extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public p0 f27820a;

    /* renamed from: b, reason: collision with root package name */
    public C2571s f27821b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f27823d;

    /* renamed from: e, reason: collision with root package name */
    public int f27824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2529A(p0 p0Var, Jb.c cVar) {
        super(cVar);
        this.f27823d = p0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27822c = obj;
        this.f27824e |= Integer.MIN_VALUE;
        return p0.u0(this.f27823d, null, this);
    }
}
