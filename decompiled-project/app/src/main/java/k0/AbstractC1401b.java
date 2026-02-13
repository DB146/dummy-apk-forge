package k0;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1401b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f18684a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f18685b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f18686c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f18687d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18688e = 0;

    static {
        long j = 3;
        long j10 = j << 32;
        f18684a = (0 & 4294967295L) | j10;
        f18685b = (1 & 4294967295L) | j10;
        f18686c = j10 | (2 & 4294967295L);
        f18687d = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        return a(j, f18684a) ? "Rgb" : a(j, f18685b) ? "Xyz" : a(j, f18686c) ? "Lab" : a(j, f18687d) ? "Cmyk" : "Unknown";
    }
}
