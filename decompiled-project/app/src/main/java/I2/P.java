package I2;

/* loaded from: classes.dex */
public final class P extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f5066a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5067b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f5069d;

    /* renamed from: e, reason: collision with root package name */
    public int f5070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q10, Hb.d dVar) {
        super(dVar);
        this.f5069d = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5068c = obj;
        this.f5070e |= Integer.MIN_VALUE;
        return this.f5069d.a(null, this);
    }
}
