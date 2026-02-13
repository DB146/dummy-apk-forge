package k0;

/* renamed from: k0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1409j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1418s f18721a = new C1418s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final C1418s f18722b = new C1418s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final C1418s f18723c = new C1418s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final C1418s f18724d = new C1418s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f18725e = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC1402c a(AbstractC1402c abstractC1402c) {
        C1418s c1418s = f18722b;
        C1400a c1400a = C1400a.f18682b;
        if (!AbstractC1401b.a(abstractC1402c.f18690b, AbstractC1401b.f18684a)) {
            return abstractC1402c;
        }
        C1416q c1416q = (C1416q) abstractC1402c;
        C1418s c1418s2 = c1416q.f18739d;
        if (d(c1418s2, c1418s)) {
            return abstractC1402c;
        }
        float[] g = g(c(c1400a.f18683a, c1418s2.a(), c1418s.a()), c1416q.f18743i);
        return new C1416q(c1416q.f18689a, c1416q.f18742h, c1418s, g, c1416q.k, c1416q.f18746n, c1416q.f18740e, c1416q.f18741f, c1416q.g, -1);
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f4 * f12))) - (f12 * f13)) - (f10 * f11)) - (f4 * f14)) * 0.5f;
        return f15 < 0.0f ? -f15 : f15;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f4 = f(fArr);
        float f10 = fArr4[0];
        float f11 = fArr[0] * f10;
        float f12 = fArr4[1];
        float f13 = fArr[1] * f12;
        float f14 = fArr4[2];
        return g(f4, new float[]{f11, f13, fArr[2] * f14, fArr[3] * f10, fArr[4] * f12, fArr[5] * f14, f10 * fArr[6], f12 * fArr[7], f14 * fArr[8]});
    }

    public static final boolean d(C1418s c1418s, C1418s c1418s2) {
        if (c1418s == c1418s2) {
            return true;
        }
        return Math.abs(c1418s.f18756a - c1418s2.f18756a) < 0.001f && Math.abs(c1418s.f18757b - c1418s2.f18757b) < 0.001f;
    }

    public static final C1406g e(AbstractC1402c abstractC1402c, AbstractC1402c abstractC1402c2) {
        if (abstractC1402c == abstractC1402c2) {
            return new C1406g(abstractC1402c, abstractC1402c, 1);
        }
        long j = AbstractC1401b.f18684a;
        return (AbstractC1401b.a(abstractC1402c.f18690b, j) && AbstractC1401b.a(abstractC1402c2.f18690b, j)) ? new C1405f((C1416q) abstractC1402c, (C1416q) abstractC1402c2) : new C1406g(abstractC1402c, abstractC1402c2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f4 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f4 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f4) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f4)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f4)) / f21;
        fArr2[8] = ((f4 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f4 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f4;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f4 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f4);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f4);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f4);
        return fArr2;
    }
}
