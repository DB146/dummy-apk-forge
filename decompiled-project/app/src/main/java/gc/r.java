package gc;

/* loaded from: classes2.dex */
public final class r extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f17541b;

    /* renamed from: c, reason: collision with root package name */
    public int f17542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Hb.d dVar) {
        super(dVar);
        this.f17541b = sVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17540a = obj;
        this.f17542c |= Integer.MIN_VALUE;
        return this.f17541b.emit(null, this);
    }
}
