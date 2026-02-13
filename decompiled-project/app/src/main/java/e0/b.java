package e0;

import ec.C1116a;

/* loaded from: classes.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public c f16636a;

    /* renamed from: b, reason: collision with root package name */
    public C1116a f16637b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f16639d;

    /* renamed from: e, reason: collision with root package name */
    public int f16640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Jb.c cVar2) {
        super(cVar2);
        this.f16639d = cVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f16638c = obj;
        this.f16640e |= Integer.MIN_VALUE;
        return this.f16639d.a(this);
    }
}
