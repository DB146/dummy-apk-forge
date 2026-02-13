package t0;

/* loaded from: classes.dex */
public final class c extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f24414b;

    /* renamed from: c, reason: collision with root package name */
    public int f24415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Jb.c cVar) {
        super(cVar);
        this.f24414b = dVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24413a = obj;
        this.f24415c |= Integer.MIN_VALUE;
        return this.f24414b.b(0L, this);
    }
}
