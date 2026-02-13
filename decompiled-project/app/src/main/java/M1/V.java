package M1;

import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class V extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public q3.n f6636a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1656a f6637b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.n f6639d;

    /* renamed from: e, reason: collision with root package name */
    public int f6640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(q3.n nVar, Jb.c cVar) {
        super(cVar);
        this.f6639d = nVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6638c = obj;
        this.f6640e |= Integer.MIN_VALUE;
        return this.f6639d.o(this);
    }
}
