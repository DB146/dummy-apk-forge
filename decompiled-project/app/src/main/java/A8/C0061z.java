package A8;

/* renamed from: A8.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061z extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f726a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f728c;

    /* renamed from: d, reason: collision with root package name */
    public int f729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061z(A a9, Jb.c cVar) {
        super(cVar);
        this.f728c = a9;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f727b = obj;
        this.f729d |= Integer.MIN_VALUE;
        return this.f728c.a(null, this);
    }
}
