package M1;

import mc.C1659d;

/* loaded from: classes.dex */
public final class X extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6644a;

    /* renamed from: b, reason: collision with root package name */
    public C1659d f6645b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f6647d;

    /* renamed from: e, reason: collision with root package name */
    public int f6648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(a0 a0Var, Jb.c cVar) {
        super(cVar);
        this.f6647d = a0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6646c = obj;
        this.f6648e |= Integer.MIN_VALUE;
        return this.f6647d.b(null, this);
    }
}
