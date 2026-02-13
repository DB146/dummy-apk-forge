package fc;

/* renamed from: fc.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1167n extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17160a;

    /* renamed from: b, reason: collision with root package name */
    public int f17161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1168o f17162c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17163d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162i f17164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167n(C1168o c1168o, Hb.d dVar) {
        super(dVar);
        this.f17162c = c1168o;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17160a = obj;
        this.f17161b |= Integer.MIN_VALUE;
        return this.f17162c.a(null, this);
    }
}
