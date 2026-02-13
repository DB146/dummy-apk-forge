package x;

/* loaded from: classes.dex */
public final class H extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public O f25924a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f25926c;

    /* renamed from: d, reason: collision with root package name */
    public int f25927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(O o10, Jb.c cVar) {
        super(cVar);
        this.f25926c = o10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f25925b = obj;
        this.f25927d |= Integer.MIN_VALUE;
        return O.M(this.f25926c, this);
    }
}
