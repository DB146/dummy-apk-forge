package z;

/* renamed from: z.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2577y extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public p0 f28137a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f28139c;

    /* renamed from: d, reason: collision with root package name */
    public int f28140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2577y(p0 p0Var, Jb.c cVar) {
        super(cVar);
        this.f28139c = p0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f28138b = obj;
        this.f28140d |= Integer.MIN_VALUE;
        return p0.s0(this.f28139c, this);
    }
}
