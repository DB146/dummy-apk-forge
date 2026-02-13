package M1;

/* loaded from: classes.dex */
public final class B extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f6554a;

    /* renamed from: b, reason: collision with root package name */
    public int f6555b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6557d;

    /* renamed from: e, reason: collision with root package name */
    public int f6558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6557d = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6556c = obj;
        this.f6558e |= Integer.MIN_VALUE;
        return this.f6557d.h(this);
    }
}
