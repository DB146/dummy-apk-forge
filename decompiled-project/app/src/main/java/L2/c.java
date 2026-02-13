package L2;

/* loaded from: classes.dex */
public final class c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public d f6266a;

    /* renamed from: b, reason: collision with root package name */
    public U2.a f6267b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f6269d;

    /* renamed from: e, reason: collision with root package name */
    public int f6270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Jb.c cVar) {
        super(cVar);
        this.f6269d = dVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6268c = obj;
        this.f6270e |= Integer.MIN_VALUE;
        return this.f6269d.e(null, null, this);
    }
}
