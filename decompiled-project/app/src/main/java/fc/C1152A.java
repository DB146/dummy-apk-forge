package fc;

/* renamed from: fc.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1152A extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public A8.J f17044a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17045b;

    /* renamed from: c, reason: collision with root package name */
    public int f17046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A8.J f17047d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152A(A8.J j, Hb.d dVar) {
        super(dVar);
        this.f17047d = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17045b = obj;
        this.f17046c |= Integer.MIN_VALUE;
        return this.f17047d.emit(null, this);
    }
}
