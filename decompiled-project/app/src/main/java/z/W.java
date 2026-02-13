package z;

/* loaded from: classes.dex */
public final class W extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Y f27946a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f27948c;

    /* renamed from: d, reason: collision with root package name */
    public int f27949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y10, Jb.c cVar) {
        super(cVar);
        this.f27948c = y10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27947b = obj;
        this.f27949d |= Integer.MIN_VALUE;
        return this.f27948c.a(this);
    }
}
