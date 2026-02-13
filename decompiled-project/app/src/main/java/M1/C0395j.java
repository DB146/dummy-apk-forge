package M1;

/* renamed from: M1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395j extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public q3.n f6679a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3.n f6681c;

    /* renamed from: d, reason: collision with root package name */
    public int f6682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0395j(q3.n nVar, Jb.c cVar) {
        super(cVar);
        this.f6681c = nVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6680b = obj;
        this.f6682d |= Integer.MIN_VALUE;
        return this.f6681c.c(this);
    }
}
