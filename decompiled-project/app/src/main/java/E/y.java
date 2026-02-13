package E;

import y.EnumC2292N;

/* loaded from: classes.dex */
public final class y extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public A f3508a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC2292N f3509b;

    /* renamed from: c, reason: collision with root package name */
    public Rb.e f3510c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f3512e;

    /* renamed from: f, reason: collision with root package name */
    public int f3513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a9, Jb.c cVar) {
        super(cVar);
        this.f3512e = a9;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f3511d = obj;
        this.f3513f |= Integer.MIN_VALUE;
        return this.f3512e.f(null, null, this);
    }
}
