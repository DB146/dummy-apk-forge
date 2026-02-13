package x;

/* loaded from: classes.dex */
public final class M extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public O f25947a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25948b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f25950d;

    /* renamed from: e, reason: collision with root package name */
    public int f25951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o10, Jb.c cVar) {
        super(cVar);
        this.f25950d = o10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f25949c = obj;
        this.f25951e |= Integer.MIN_VALUE;
        return O.N(this.f25950d, this);
    }
}
