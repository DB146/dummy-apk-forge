package z;

import o4.C1798l;

/* renamed from: z.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2541M extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1798l f27903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f27904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f27905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f27906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f27907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2541M(C1798l c1798l, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.s sVar, w0 w0Var, kotlin.jvm.internal.r rVar) {
        super(1);
        this.f27903a = c1798l;
        this.f27904b = vVar;
        this.f27905c = sVar;
        this.f27906d = w0Var;
        this.f27907e = rVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        C1798l c1798l = this.f27903a;
        C2537I i7 = C1798l.i((ec.d) c1798l.f21860f);
        if (i7 != null) {
            c1798l.j(i7);
            kotlin.jvm.internal.v vVar = this.f27904b;
            C2537I a9 = ((C2537I) vVar.f19134a).a(i7);
            vVar.f19134a = a9;
            long j = a9.f27879a;
            w0 w0Var = this.f27906d;
            this.f27905c.f19131a = w0Var.f(w0Var.d(j));
            this.f27907e.f19130a = !AbstractC2536H.a(r0 - floatValue);
        }
        return Boolean.valueOf(i7 != null);
    }
}
