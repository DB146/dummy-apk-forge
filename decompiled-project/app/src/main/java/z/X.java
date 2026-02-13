package z;

/* loaded from: classes.dex */
public final class X extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Y f27950a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f27952c;

    /* renamed from: d, reason: collision with root package name */
    public int f27953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y10, Jb.c cVar) {
        super(cVar);
        this.f27952c = y10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27951b = obj;
        this.f27953d |= Integer.MIN_VALUE;
        return this.f27952c.b(this);
    }
}
