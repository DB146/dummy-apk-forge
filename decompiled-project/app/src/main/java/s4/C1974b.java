package s4;

import n5.D;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974b {

    /* renamed from: a, reason: collision with root package name */
    public final long f24035a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24036b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24037c;

    /* renamed from: d, reason: collision with root package name */
    public long f24038d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f24039e;

    /* renamed from: f, reason: collision with root package name */
    public long f24040f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f24041h;

    public C1974b(long j, long j10, long j11, long j12, long j13, long j14) {
        this.f24035a = j;
        this.f24036b = j10;
        this.f24039e = j11;
        this.f24040f = j12;
        this.g = j13;
        this.f24037c = j14;
        this.f24041h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || j10 + 1 >= j11) {
            return j12;
        }
        long j15 = ((float) (j - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
        return D.j(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
    }
}
