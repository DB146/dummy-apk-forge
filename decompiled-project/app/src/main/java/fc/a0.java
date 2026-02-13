package fc;

import cc.InterfaceC0937i0;

/* loaded from: classes2.dex */
public final class a0 extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public b0 f17119a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1162i f17120b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f17121c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0937i0 f17122d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17123e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17124f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f17125u;

    /* renamed from: v, reason: collision with root package name */
    public int f17126v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Hb.d dVar) {
        super(dVar);
        this.f17125u = b0Var;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17124f = obj;
        this.f17126v |= Integer.MIN_VALUE;
        this.f17125u.a(null, this);
        return Ib.a.f5345a;
    }
}
