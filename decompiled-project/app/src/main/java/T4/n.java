package T4;

import java.util.List;
import n5.D;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f9297d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9298e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9299f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9300h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9301i;

    public n(j jVar, long j, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j, j10);
        this.f9297d = j11;
        this.f9298e = j12;
        this.f9299f = list;
        this.f9301i = j13;
        this.g = j14;
        this.f9300h = j15;
    }

    public final long b(long j, long j10) {
        long d10 = d(j);
        return d10 != -1 ? d10 : (int) (f((j10 - this.f9300h) + this.f9301i, j) - c(j, j10));
    }

    public final long c(long j, long j10) {
        long d10 = d(j);
        long j11 = this.f9297d;
        if (d10 == -1) {
            long j12 = this.g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.f9300h) - j12, j));
            }
        }
        return j11;
    }

    public abstract long d(long j);

    public final long e(long j, long j10) {
        long j11 = this.f9308b;
        long j12 = this.f9297d;
        List list = this.f9299f;
        if (list != null) {
            return (((q) list.get((int) (j - j12))).f9304b * 1000000) / j11;
        }
        long d10 = d(j10);
        return (d10 == -1 || j != (j12 + d10) - 1) ? (this.f9298e * 1000000) / j11 : j10 - g(j);
    }

    public final long f(long j, long j10) {
        long d10 = d(j10);
        long j11 = this.f9297d;
        if (d10 == 0) {
            return j11;
        }
        if (this.f9299f == null) {
            long j12 = (j / ((this.f9298e * 1000000) / this.f9308b)) + j11;
            return j12 < j11 ? j11 : d10 == -1 ? j12 : Math.min(j12, (j11 + d10) - 1);
        }
        long j13 = (d10 + j11) - 1;
        long j14 = j11;
        while (j14 <= j13) {
            long j15 = ((j13 - j14) / 2) + j14;
            long g = g(j15);
            if (g < j) {
                j14 = j15 + 1;
            } else {
                if (g <= j) {
                    return j15;
                }
                j13 = j15 - 1;
            }
        }
        return j14 == j11 ? j14 : j13;
    }

    public final long g(long j) {
        long j10 = this.f9297d;
        List list = this.f9299f;
        return D.T(list != null ? ((q) list.get((int) (j - j10))).f9303a - this.f9309c : (j - j10) * this.f9298e, 1000000L, this.f9308b);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        return this.f9299f != null;
    }
}
