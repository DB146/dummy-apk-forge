package x;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f25998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f25999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2233c f26000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2238h f26001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rb.c f26002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(kotlin.jvm.internal.v vVar, float f4, InterfaceC2233c interfaceC2233c, C2238h c2238h, Rb.c cVar) {
        super(1);
        this.f25998a = vVar;
        this.f25999b = f4;
        this.f26000c = interfaceC2233c;
        this.f26001d = c2238h;
        this.f26002e = cVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f25998a.f19134a;
        kotlin.jvm.internal.l.b(obj2);
        AbstractC2232b.h((C2236f) obj2, longValue, this.f25999b, this.f26000c, this.f26001d, this.f26002e);
        return Db.q.f3365a;
    }
}
