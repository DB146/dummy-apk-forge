package k0;

import ha.C1265a;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403d {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f18692a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f18693b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1417r f18694c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1417r f18695d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1416q f18696e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1416q f18697f;
    public static final C1416q g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1416q f18698h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1416q f18699i;
    public static final C1416q j;
    public static final C1416q k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1416q f18700l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1416q f18701m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1416q f18702n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1416q f18703o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1416q f18704p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1416q f18705q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1416q f18706r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1410k f18707s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1410k f18708t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1416q f18709u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1416q f18710v;

    /* renamed from: w, reason: collision with root package name */
    public static final C1416q f18711w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1411l f18712x;

    /* renamed from: y, reason: collision with root package name */
    public static final AbstractC1402c[] f18713y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [k0.l, k0.c] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f18692a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f18693b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C1417r c1417r = new C1417r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1417r c1417r2 = new C1417r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1417r c1417r3 = new C1417r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f18694c = c1417r3;
        C1417r c1417r4 = new C1417r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f18695d = c1417r4;
        C1418s c1418s = AbstractC1409j.f18724d;
        C1416q c1416q = new C1416q("sRGB IEC61966-2.1", fArr, c1418s, c1417r, 0);
        f18696e = c1416q;
        C1416q c1416q2 = new C1416q("sRGB IEC61966-2.1 (Linear)", fArr, c1418s, 1.0d, 0.0f, 1.0f, 1);
        f18697f = c1416q2;
        C1416q c1416q3 = new C1416q("scRGB-nl IEC 61966-2-2:2003", fArr, c1418s, null, new C1265a(2), new C1265a(3), -0.799f, 2.399f, c1417r, 2);
        g = c1416q3;
        C1416q c1416q4 = new C1416q("scRGB IEC 61966-2-2:2003", fArr, c1418s, 1.0d, -0.5f, 7.499f, 3);
        f18698h = c1416q4;
        C1416q c1416q5 = new C1416q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1418s, new C1417r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f18699i = c1416q5;
        C1416q c1416q6 = new C1416q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1418s, new C1417r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = c1416q6;
        C1416q c1416q7 = new C1416q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1418s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = c1416q7;
        C1416q c1416q8 = new C1416q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1418s, c1417r, 7);
        f18700l = c1416q8;
        C1416q c1416q9 = new C1416q("NTSC (1953)", fArr2, AbstractC1409j.f18721a, new C1417r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f18701m = c1416q9;
        C1416q c1416q10 = new C1416q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1418s, new C1417r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f18702n = c1416q10;
        C1416q c1416q11 = new C1416q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1418s, 2.2d, 0.0f, 1.0f, 10);
        f18703o = c1416q11;
        C1416q c1416q12 = new C1416q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC1409j.f18722b, new C1417r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f18704p = c1416q12;
        C1418s c1418s2 = AbstractC1409j.f18723c;
        C1416q c1416q13 = new C1416q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c1418s2, 1.0d, -65504.0f, 65504.0f, 12);
        f18705q = c1416q13;
        C1416q c1416q14 = new C1416q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1418s2, 1.0d, -65504.0f, 65504.0f, 13);
        f18706r = c1416q14;
        C1410k c1410k = new C1410k(14, 1, AbstractC1401b.f18685b, "Generic XYZ");
        f18707s = c1410k;
        long j10 = AbstractC1401b.f18686c;
        C1410k c1410k2 = new C1410k(15, 0, j10, "Generic L*a*b*");
        f18708t = c1410k2;
        C1416q c1416q15 = new C1416q("None", fArr, c1418s, c1417r2, 16);
        f18709u = c1416q15;
        C1416q c1416q16 = new C1416q("Hybrid Log Gamma encoding", fArr3, c1418s, null, new C1265a(4), new C1265a(5), 0.0f, 1.0f, c1417r3, 17);
        f18710v = c1416q16;
        C1416q c1416q17 = new C1416q("Perceptual Quantizer encoding", fArr3, c1418s, null, new C1265a(6), new C1265a(7), 0.0f, 1.0f, c1417r4, 18);
        f18711w = c1416q17;
        ?? abstractC1402c = new AbstractC1402c("Oklab", j10, 19);
        f18712x = abstractC1402c;
        f18713y = new AbstractC1402c[]{c1416q, c1416q2, c1416q3, c1416q4, c1416q5, c1416q6, c1416q7, c1416q8, c1416q9, c1416q10, c1416q11, c1416q12, c1416q13, c1416q14, c1410k, c1410k2, c1416q15, c1416q16, c1416q17, abstractC1402c};
    }

    public static double a(C1417r c1417r, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = c1417r.f18751b;
        double d14 = d13 * d12;
        return (c1417r.g + 1.0d) * d11 * (d14 <= 1.0d ? Math.pow(d14, c1417r.f18752c) : Math.exp((d12 - c1417r.f18755f) * c1417r.f18753d) + c1417r.f18754e);
    }

    public static double b(C1417r c1417r, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / c1417r.f18751b;
        double d13 = 1.0d / c1417r.f18752c;
        double d14 = 1.0d / c1417r.f18753d;
        double d15 = (d10 * d11) / (c1417r.g + 1.0d);
        return d11 * (d15 <= 1.0d ? Math.pow(d15, d13) * d12 : (Math.log(d15 - c1417r.f18754e) * d14) + c1417r.f18755f);
    }

    public static double c(C1417r c1417r, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = c1417r.f18751b;
        double d14 = c1417r.f18753d;
        double pow = (Math.pow(d12, d14) * c1417r.f18752c) + d13;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d12, d14) * c1417r.f18755f) + c1417r.f18754e), c1417r.g) * d11;
    }

    public static double d(C1417r c1417r, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -c1417r.f18751b;
        double d14 = 1.0d / c1417r.g;
        return Math.pow(Math.max((Math.pow(d12, d14) * c1417r.f18754e) + d13, 0.0d) / ((Math.pow(d12, d14) * (-c1417r.f18755f)) + c1417r.f18752c), 1.0d / c1417r.f18753d) * d11;
    }
}
