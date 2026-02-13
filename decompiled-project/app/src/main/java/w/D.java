package w;

import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2323H f25491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C.D f25494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC2323H abstractC2323H, long j, long j10, C.D d10) {
        super(1);
        this.f25491a = abstractC2323H;
        this.f25492b = j;
        this.f25493c = j10;
        this.f25494d = d10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
        long j = this.f25492b;
        long j10 = this.f25493c;
        int i7 = ((int) (j >> 32)) + ((int) (j10 >> 32));
        int i10 = ((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L));
        C.D d10 = this.f25494d;
        AbstractC2323H abstractC2323H = this.f25491a;
        abstractC2322G.getClass();
        AbstractC2322G.a(abstractC2322G, abstractC2323H);
        abstractC2323H.M(V0.i.c((i7 << 32) | (i10 & 4294967295L), abstractC2323H.f26558e), 0.0f, d10);
        return Db.q.f3365a;
    }
}
