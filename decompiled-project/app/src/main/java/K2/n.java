package K2;

/* loaded from: classes.dex */
public final class n extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public p f6055a;

    /* renamed from: b, reason: collision with root package name */
    public Rb.a f6056b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.v f6057c;

    /* renamed from: d, reason: collision with root package name */
    public long f6058d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f6060f;

    /* renamed from: u, reason: collision with root package name */
    public int f6061u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Jb.c cVar) {
        super(cVar);
        this.f6060f = pVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6059e = obj;
        this.f6061u |= Integer.MIN_VALUE;
        return this.f6060f.b(0L, null, this);
    }
}
