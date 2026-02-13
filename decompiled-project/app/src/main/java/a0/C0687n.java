package a0;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687n extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f12403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0687n(Rb.c cVar, int i7) {
        super(1);
        this.f12402a = i7;
        switch (i7) {
            case 1:
                this.f12403b = (kotlin.jvm.internal.m) cVar;
                super(1);
                return;
            default:
                this.f12403b = (kotlin.jvm.internal.m) cVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12402a) {
            case 0:
                AbstractC0682i abstractC0682i = (AbstractC0682i) this.f12403b.invoke((C0686m) obj);
                synchronized (AbstractC0688o.f12405b) {
                    AbstractC0688o.f12406c = AbstractC0688o.f12406c.z(abstractC0682i.g());
                }
                return abstractC0682i;
            default:
                return this.f12403b.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }
}
