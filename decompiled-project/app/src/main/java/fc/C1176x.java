package fc;

/* renamed from: fc.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1176x extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public A8.J f17204a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17205b;

    /* renamed from: c, reason: collision with root package name */
    public int f17206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A8.J f17207d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176x(A8.J j, Hb.d dVar) {
        super(dVar);
        this.f17207d = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17205b = obj;
        this.f17206c |= Integer.MIN_VALUE;
        return this.f17207d.emit(null, this);
    }
}
