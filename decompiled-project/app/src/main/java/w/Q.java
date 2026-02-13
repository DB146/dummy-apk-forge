package w;

import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f25527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0.T f25531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC2323H f25532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s3, long j, int i7, int i10, A0.T t5, AbstractC2323H abstractC2323H) {
        super(1);
        this.f25527a = s3;
        this.f25528b = j;
        this.f25529c = i7;
        this.f25530d = i10;
        this.f25531e = t5;
        this.f25532f = abstractC2323H;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
        this.f25527a.getClass();
        long j = (this.f25529c << 32) | (this.f25530d & 4294967295L);
        V0.l layoutDirection = this.f25531e.getLayoutDirection();
        long j10 = this.f25528b;
        float f4 = (((int) (j >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f10 = (((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f11 = layoutDirection == V0.l.f9982a ? -1.0f : (-1) * (-1.0f);
        float f12 = 1;
        float f13 = (f11 + f12) * f4;
        float f14 = (f12 - 1.0f) * f10;
        AbstractC2322G.f(abstractC2322G, this.f25532f, (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32));
        return Db.q.f3365a;
    }
}
