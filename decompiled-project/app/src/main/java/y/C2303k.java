package y;

/* renamed from: y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2303k extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C2305m f26478a;

    /* renamed from: b, reason: collision with root package name */
    public long f26479b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2305m f26481d;

    /* renamed from: e, reason: collision with root package name */
    public int f26482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303k(C2305m c2305m, Jb.c cVar) {
        super(cVar);
        this.f26481d = c2305m;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f26480c = obj;
        this.f26482e |= Integer.MIN_VALUE;
        return this.f26481d.b(0L, null, this);
    }
}
