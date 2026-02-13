package m4;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573i {

    /* renamed from: a, reason: collision with root package name */
    public final long f20388a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20389b;

    /* renamed from: c, reason: collision with root package name */
    public long f20390c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f20391d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f20393f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f20395i = 1.03f;
    public float k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f20396l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f20392e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f20394h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f20397m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f20398n = -9223372036854775807L;

    public C1573i(long j, long j10) {
        this.f20388a = j;
        this.f20389b = j10;
    }

    public final void a() {
        long j = this.f20390c;
        if (j != -9223372036854775807L) {
            long j10 = this.f20391d;
            if (j10 != -9223372036854775807L) {
                j = j10;
            }
            long j11 = this.f20393f;
            if (j11 != -9223372036854775807L && j < j11) {
                j = j11;
            }
            long j12 = this.g;
            if (j12 != -9223372036854775807L && j > j12) {
                j = j12;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f20392e == j) {
            return;
        }
        this.f20392e = j;
        this.f20394h = j;
        this.f20397m = -9223372036854775807L;
        this.f20398n = -9223372036854775807L;
        this.f20396l = -9223372036854775807L;
    }
}
