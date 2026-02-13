package i3;

/* loaded from: classes.dex */
public final class z extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C1340B f18396a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1340B f18398c;

    /* renamed from: d, reason: collision with root package name */
    public int f18399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C1340B c1340b, Jb.c cVar) {
        super(cVar);
        this.f18398c = c1340b;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f18397b = obj;
        this.f18399d |= Integer.MIN_VALUE;
        return C1340B.a(this.f18398c, this);
    }
}
