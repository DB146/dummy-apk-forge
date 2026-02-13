package fc;

/* renamed from: fc.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1172t extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17185a;

    /* renamed from: b, reason: collision with root package name */
    public int f17186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.K f17187c;

    /* renamed from: d, reason: collision with root package name */
    public A8.K f17188d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162i f17189e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f17190f;

    /* renamed from: u, reason: collision with root package name */
    public long f17191u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172t(A8.K k, Hb.d dVar) {
        super(dVar);
        this.f17187c = k;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17185a = obj;
        this.f17186b |= Integer.MIN_VALUE;
        return this.f17187c.a(null, this);
    }
}
