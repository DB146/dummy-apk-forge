package k0;

import j0.AbstractC1362A;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1405f extends C1406g {

    /* renamed from: e, reason: collision with root package name */
    public final C1416q f18714e;

    /* renamed from: f, reason: collision with root package name */
    public final C1416q f18715f;
    public final float[] g;

    public C1405f(C1416q c1416q, C1416q c1416q2) {
        super(c1416q2, c1416q, c1416q2, null);
        float[] g;
        this.f18714e = c1416q;
        this.f18715f = c1416q2;
        C1418s c1418s = c1416q2.f18739d;
        C1418s c1418s2 = c1416q.f18739d;
        boolean d10 = AbstractC1409j.d(c1418s2, c1418s);
        float[] fArr = c1416q.f18743i;
        float[] fArr2 = c1416q2.j;
        if (d10) {
            g = AbstractC1409j.g(fArr2, fArr);
        } else {
            float[] a9 = c1418s2.a();
            C1418s c1418s3 = c1416q2.f18739d;
            float[] a10 = c1418s3.a();
            C1418s c1418s4 = AbstractC1409j.f18722b;
            boolean d11 = AbstractC1409j.d(c1418s2, c1418s4);
            float[] fArr3 = C1400a.f18682b.f18683a;
            g = AbstractC1409j.g(AbstractC1409j.d(c1418s3, c1418s4) ? fArr2 : AbstractC1409j.f(AbstractC1409j.g(AbstractC1409j.c(fArr3, a10, new float[]{0.964212f, 1.0f, 0.825188f}), c1416q2.f18743i)), d11 ? fArr : AbstractC1409j.g(AbstractC1409j.c(fArr3, a9, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.g = g;
    }

    @Override // k0.C1406g
    public final long a(long j) {
        float h10 = j0.n.h(j);
        float g = j0.n.g(j);
        float e2 = j0.n.e(j);
        float d10 = j0.n.d(j);
        C1412m c1412m = this.f18714e.f18748p;
        float a9 = (float) c1412m.a(h10);
        float a10 = (float) c1412m.a(g);
        float a11 = (float) c1412m.a(e2);
        float[] fArr = this.g;
        float f4 = (fArr[6] * a11) + (fArr[3] * a10) + (fArr[0] * a9);
        float f10 = (fArr[7] * a11) + (fArr[4] * a10) + (fArr[1] * a9);
        float f11 = (fArr[8] * a11) + (fArr[5] * a10) + (fArr[2] * a9);
        C1416q c1416q = this.f18715f;
        float a12 = (float) c1416q.f18745m.a(f4);
        double d11 = f10;
        C1412m c1412m2 = c1416q.f18745m;
        return AbstractC1362A.a(a12, (float) c1412m2.a(d11), (float) c1412m2.a(f11), d10, c1416q);
    }
}
