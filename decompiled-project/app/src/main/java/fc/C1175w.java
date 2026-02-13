package fc;

/* renamed from: fc.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1175w extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17200a;

    /* renamed from: b, reason: collision with root package name */
    public int f17201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.K f17202c;

    /* renamed from: d, reason: collision with root package name */
    public A8.J f17203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175w(A8.K k, Hb.d dVar) {
        super(dVar);
        this.f17202c = k;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17200a = obj;
        this.f17201b |= Integer.MIN_VALUE;
        return this.f17202c.a(null, this);
    }
}
