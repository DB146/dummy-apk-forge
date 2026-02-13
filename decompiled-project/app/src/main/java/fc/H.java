package fc;

/* loaded from: classes2.dex */
public final class H extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17072a;

    /* renamed from: b, reason: collision with root package name */
    public int f17073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.J f17074c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17075d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162i f17076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(A8.J j, Hb.d dVar) {
        super(dVar);
        this.f17074c = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17072a = obj;
        this.f17073b |= Integer.MIN_VALUE;
        return this.f17074c.emit(null, this);
    }
}
