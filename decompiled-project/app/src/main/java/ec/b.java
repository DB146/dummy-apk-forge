package ec;

/* loaded from: classes2.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16856b;

    /* renamed from: c, reason: collision with root package name */
    public int f16857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Jb.c cVar) {
        super(cVar);
        this.f16856b = dVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f16855a = obj;
        this.f16857c |= Integer.MIN_VALUE;
        Object B10 = d.B(this.f16856b, this);
        return B10 == Ib.a.f5345a ? B10 : new k(B10);
    }
}
