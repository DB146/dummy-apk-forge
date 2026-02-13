package E8;

import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3752a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1656a f3753b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3755d;

    /* renamed from: e, reason: collision with root package name */
    public int f3756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Jb.c cVar) {
        super(cVar);
        this.f3755d = eVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f3754c = obj;
        this.f3756e |= Integer.MIN_VALUE;
        return this.f3755d.d(this);
    }
}
