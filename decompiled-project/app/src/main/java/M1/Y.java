package M1;

import mc.C1659d;

/* loaded from: classes.dex */
public final class Y extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C1659d f6649a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6650b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f6652d;

    /* renamed from: e, reason: collision with root package name */
    public int f6653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, Jb.c cVar) {
        super(cVar);
        this.f6652d = a0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6651c = obj;
        this.f6653e |= Integer.MIN_VALUE;
        return this.f6652d.c(null, this);
    }
}
