package fc;

/* renamed from: fc.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1171s extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public A8.J f17181a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.J f17183c;

    /* renamed from: d, reason: collision with root package name */
    public int f17184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171s(A8.J j, Hb.d dVar) {
        super(dVar);
        this.f17183c = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17182b = obj;
        this.f17184d |= Integer.MIN_VALUE;
        return this.f17183c.emit(null, this);
    }
}
