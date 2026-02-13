package M1;

/* loaded from: classes.dex */
public final class O extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.t f6610a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6612c;

    /* renamed from: d, reason: collision with root package name */
    public int f6613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6612c = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6611b = obj;
        this.f6613d |= Integer.MIN_VALUE;
        return this.f6612c.j(null, false, this);
    }
}
