package z;

import x.C2239i;

/* loaded from: classes.dex */
public final class I0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f27882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f27883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.c f27884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(J0 j02, float f4, Rb.c cVar) {
        super(1);
        this.f27882a = j02;
        this.f27883b = f4;
        this.f27884c = cVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        long G9;
        long longValue = ((Number) obj).longValue();
        J0 j02 = this.f27882a;
        if (j02.f27889b == Long.MIN_VALUE) {
            j02.f27889b = longValue;
        }
        float f4 = j02.f27892e;
        C2239i c2239i = new C2239i(f4);
        float f10 = this.f27883b;
        C2239i c2239i2 = J0.f27887f;
        if (f10 == 0.0f) {
            G9 = j02.f27888a.h(new C2239i(f4), c2239i2, j02.f27890c);
        } else {
            G9 = Tb.a.G(((float) (longValue - j02.f27889b)) / f10);
        }
        long j = G9;
        float f11 = ((C2239i) j02.f27888a.n(j, c2239i, c2239i2, j02.f27890c)).f26098a;
        j02.f27890c = (C2239i) j02.f27888a.d(j, c2239i, c2239i2, j02.f27890c);
        j02.f27889b = longValue;
        float f12 = j02.f27892e - f11;
        j02.f27892e = f11;
        this.f27884c.invoke(Float.valueOf(f12));
        return Db.q.f3365a;
    }
}
