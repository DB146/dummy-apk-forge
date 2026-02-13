package n5;

/* renamed from: n5.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704A {

    /* renamed from: a, reason: collision with root package name */
    public long f21136a;

    /* renamed from: b, reason: collision with root package name */
    public long f21137b;

    /* renamed from: c, reason: collision with root package name */
    public long f21138c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f21139d = new ThreadLocal();

    public C1704A(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!d()) {
                long j10 = this.f21136a;
                if (j10 == 9223372036854775806L) {
                    Long l10 = (Long) this.f21139d.get();
                    l10.getClass();
                    j10 = l10.longValue();
                }
                this.f21137b = j10 - j;
                notifyAll();
            }
            this.f21138c = j;
            return j + this.f21137b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f21138c;
            if (j10 != -9223372036854775807L) {
                long j11 = (j10 * 90000) / 1000000;
                long j12 = (4294967296L + j11) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j;
                long j14 = (j12 * 8589934592L) + j;
                j = Math.abs(j13 - j11) < Math.abs(j14 - j11) ? j13 : j14;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f21136a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean d() {
        return this.f21137b != -9223372036854775807L;
    }

    public final synchronized void e(long j) {
        this.f21136a = j;
        this.f21137b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f21138c = -9223372036854775807L;
    }

    public final synchronized void f(long j, boolean z8) {
        try {
            AbstractC1705a.m(this.f21136a == 9223372036854775806L);
            if (d()) {
                return;
            }
            if (z8) {
                this.f21139d.set(Long.valueOf(j));
            } else {
                while (!d()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
