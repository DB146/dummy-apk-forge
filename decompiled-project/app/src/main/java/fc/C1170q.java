package fc;

/* renamed from: fc.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1170q extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17173a;

    /* renamed from: b, reason: collision with root package name */
    public int f17174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.K f17175c;

    /* renamed from: d, reason: collision with root package name */
    public A8.K f17176d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162i f17177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170q(A8.K k, Hb.d dVar) {
        super(dVar);
        this.f17175c = k;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17173a = obj;
        this.f17174b |= Integer.MIN_VALUE;
        return this.f17175c.a(null, this);
    }
}
