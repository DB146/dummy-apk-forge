package fc;

/* renamed from: fc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1155b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public ec.r f17127a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1156c f17129c;

    /* renamed from: d, reason: collision with root package name */
    public int f17130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1155b(C1156c c1156c, Jb.c cVar) {
        super(cVar);
        this.f17129c = c1156c;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17128b = obj;
        this.f17130d |= Integer.MIN_VALUE;
        return this.f17129c.d(null, this);
    }
}
