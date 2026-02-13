package k0;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1406g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1402c f18716a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1402c f18717b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1402c f18718c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f18719d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1406g(AbstractC1402c abstractC1402c, AbstractC1402c abstractC1402c2, int i7) {
        this(abstractC1402c2, r4, r5, r8);
        long j = abstractC1402c.f18690b;
        long j10 = AbstractC1401b.f18684a;
        AbstractC1402c a9 = AbstractC1401b.a(j, j10) ? AbstractC1409j.a(abstractC1402c) : abstractC1402c;
        AbstractC1402c a10 = AbstractC1401b.a(abstractC1402c2.f18690b, j10) ? AbstractC1409j.a(abstractC1402c2) : abstractC1402c2;
        float[] fArr = null;
        if (i7 == 3) {
            boolean a11 = AbstractC1401b.a(abstractC1402c.f18690b, j10);
            boolean a12 = AbstractC1401b.a(abstractC1402c2.f18690b, j10);
            if ((!a11 || !a12) && (a11 || a12)) {
                abstractC1402c = a11 ? abstractC1402c : abstractC1402c2;
                float[] fArr2 = AbstractC1409j.f18725e;
                C1418s c1418s = ((C1416q) abstractC1402c).f18739d;
                float[] a13 = a11 ? c1418s.a() : fArr2;
                fArr2 = a12 ? c1418s.a() : fArr2;
                fArr = new float[]{a13[0] / fArr2[0], a13[1] / fArr2[1], a13[2] / fArr2[2]};
            }
        }
    }

    public C1406g(AbstractC1402c abstractC1402c, AbstractC1402c abstractC1402c2, AbstractC1402c abstractC1402c3, float[] fArr) {
        this.f18716a = abstractC1402c;
        this.f18717b = abstractC1402c2;
        this.f18718c = abstractC1402c3;
        this.f18719d = fArr;
    }

    public long a(long j) {
        float h10 = j0.n.h(j);
        float g = j0.n.g(j);
        float e2 = j0.n.e(j);
        float d10 = j0.n.d(j);
        AbstractC1402c abstractC1402c = this.f18717b;
        long d11 = abstractC1402c.d(h10, g, e2);
        float intBitsToFloat = Float.intBitsToFloat((int) (d11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d11 & 4294967295L));
        float e10 = abstractC1402c.e(h10, g, e2);
        float[] fArr = this.f18719d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e10 *= fArr[2];
        }
        float f4 = intBitsToFloat;
        float f10 = intBitsToFloat2;
        return this.f18718c.f(f4, f10, e10, d10, this.f18716a);
    }
}
