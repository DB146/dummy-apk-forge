package x;

/* loaded from: classes.dex */
public final class N extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public O f25952a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25953b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f25955d;

    /* renamed from: e, reason: collision with root package name */
    public int f25956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, Jb.c cVar) {
        super(cVar);
        this.f25955d = o10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f25954c = obj;
        this.f25956e |= Integer.MIN_VALUE;
        return O.O(this.f25955d, this);
    }
}
