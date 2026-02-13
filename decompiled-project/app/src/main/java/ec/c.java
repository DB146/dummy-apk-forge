package ec;

/* loaded from: classes2.dex */
public final class c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16859b;

    /* renamed from: c, reason: collision with root package name */
    public int f16860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Jb.c cVar) {
        super(cVar);
        this.f16859b = dVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f16858a = obj;
        this.f16860c |= Integer.MIN_VALUE;
        Object C2 = this.f16859b.C(null, 0, 0L, this);
        return C2 == Ib.a.f5345a ? C2 : new k(C2);
    }
}
