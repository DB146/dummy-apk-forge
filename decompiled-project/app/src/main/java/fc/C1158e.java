package fc;

/* renamed from: fc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1158e extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1159f f17141b;

    /* renamed from: c, reason: collision with root package name */
    public int f17142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158e(C1159f c1159f, Hb.d dVar) {
        super(dVar);
        this.f17141b = c1159f;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17140a = obj;
        this.f17142c |= Integer.MIN_VALUE;
        return this.f17141b.emit(null, this);
    }
}
