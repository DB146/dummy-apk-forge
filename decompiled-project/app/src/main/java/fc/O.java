package fc;

import cc.InterfaceC0937i0;

/* loaded from: classes2.dex */
public final class O extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public P f17083a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1162i f17084b;

    /* renamed from: c, reason: collision with root package name */
    public S f17085c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0937i0 f17086d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f17087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f17088f;

    /* renamed from: u, reason: collision with root package name */
    public int f17089u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p10, Hb.d dVar) {
        super(dVar);
        this.f17088f = p10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17087e = obj;
        this.f17089u |= Integer.MIN_VALUE;
        P.j(this.f17088f, null, this);
        return Ib.a.f5345a;
    }
}
