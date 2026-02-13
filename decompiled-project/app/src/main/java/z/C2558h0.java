package z;

/* renamed from: z.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2558h0 extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public long f27991a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A9.O f27993c;

    /* renamed from: d, reason: collision with root package name */
    public int f27994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2558h0(A9.O o10, Jb.c cVar) {
        super(cVar);
        this.f27993c = o10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f27992b = obj;
        this.f27994d |= Integer.MIN_VALUE;
        return this.f27993c.b0(0L, 0L, this);
    }
}
