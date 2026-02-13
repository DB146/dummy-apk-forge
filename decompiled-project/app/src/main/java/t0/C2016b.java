package t0;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2016b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f24411b;

    /* renamed from: c, reason: collision with root package name */
    public int f24412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2016b(d dVar, Jb.c cVar) {
        super(cVar);
        this.f24411b = dVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24410a = obj;
        this.f24412c |= Integer.MIN_VALUE;
        return this.f24411b.a(0L, 0L, this);
    }
}
