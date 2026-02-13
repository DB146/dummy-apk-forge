package a0;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676c extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f12372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0676c(Rb.c cVar, int i7) {
        super(1);
        this.f12371a = i7;
        this.f12372b = cVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f12371a) {
            case 0:
                C0686m c0686m = (C0686m) obj;
                synchronized (AbstractC0688o.f12405b) {
                    j = AbstractC0688o.f12407d;
                    AbstractC0688o.f12407d = 1 + j;
                }
                return new C0681h(j, c0686m, this.f12372b);
            case 1:
                long j10 = ((V0.k) obj).f9981a;
                return new V0.k((((int) (j10 >> 32)) << 32) | (4294967295L & ((Number) this.f12372b.invoke(Integer.valueOf((int) (j10 & 4294967295L)))).intValue()));
            default:
                long j11 = ((V0.k) obj).f9981a;
                return new V0.k((((int) (j11 >> 32)) << 32) | (4294967295L & ((Number) this.f12372b.invoke(Integer.valueOf((int) (j11 & 4294967295L)))).intValue()));
        }
    }
}
