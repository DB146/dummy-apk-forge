package A8;

/* loaded from: classes.dex */
public final class V extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public W f591a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f593c;

    /* renamed from: d, reason: collision with root package name */
    public int f594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w10, Jb.c cVar) {
        super(cVar);
        this.f593c = w10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f592b = obj;
        this.f594d |= Integer.MIN_VALUE;
        return W.a(this.f593c, this);
    }
}
