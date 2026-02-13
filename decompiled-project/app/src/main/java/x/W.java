package x;

import ea.C1111f;

/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f25991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2233c f25993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2243m f25994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2238h f25995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f25996f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rb.c f25997u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(kotlin.jvm.internal.v vVar, Object obj, InterfaceC2233c interfaceC2233c, AbstractC2243m abstractC2243m, C2238h c2238h, float f4, Rb.c cVar) {
        super(1);
        this.f25991a = vVar;
        this.f25992b = obj;
        this.f25993c = interfaceC2233c;
        this.f25994d = abstractC2243m;
        this.f25995e = c2238h;
        this.f25996f = f4;
        this.f25997u = cVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC2233c interfaceC2233c = this.f25993c;
        C1111f e2 = interfaceC2233c.e();
        Object f4 = interfaceC2233c.f();
        V v10 = new V(this.f25995e, 0);
        C2236f c2236f = new C2236f(this.f25992b, e2, this.f25994d, longValue, f4, longValue, v10);
        AbstractC2232b.h(c2236f, longValue, this.f25996f, this.f25993c, this.f25995e, this.f25997u);
        this.f25991a.f19134a = c2236f;
        return Db.q.f3365a;
    }
}
