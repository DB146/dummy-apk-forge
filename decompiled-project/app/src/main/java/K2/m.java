package K2;

/* loaded from: classes.dex */
public final class m extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public p f6051a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f6053c;

    /* renamed from: d, reason: collision with root package name */
    public int f6054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Jb.c cVar) {
        super(cVar);
        this.f6053c = pVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6052b = obj;
        this.f6054d |= Integer.MIN_VALUE;
        return this.f6053c.a(this);
    }
}
