package m4;

import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: c, reason: collision with root package name */
    public static final E0 f19887c;

    /* renamed from: a, reason: collision with root package name */
    public final long f19888a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19889b;

    static {
        E0 e02 = new E0(0L, 0L);
        new E0(Long.MAX_VALUE, Long.MAX_VALUE);
        new E0(Long.MAX_VALUE, 0L);
        new E0(0L, Long.MAX_VALUE);
        f19887c = e02;
    }

    public E0(long j, long j10) {
        AbstractC1705a.h(j >= 0);
        AbstractC1705a.h(j10 >= 0);
        this.f19888a = j;
        this.f19889b = j10;
    }

    public final long a(long j, long j10, long j11) {
        long j12 = this.f19888a;
        long j13 = this.f19889b;
        if (j12 == 0 && j13 == 0) {
            return j;
        }
        int i7 = n5.D.f21141a;
        long j14 = j - j12;
        if (((j12 ^ j) & (j ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j + j13;
        if (((j13 ^ j15) & (j ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z8 = false;
        boolean z10 = j14 <= j10 && j10 <= j15;
        if (j14 <= j11 && j11 <= j15) {
            z8 = true;
        }
        return (z10 && z8) ? Math.abs(j10 - j) <= Math.abs(j11 - j) ? j10 : j11 : z10 ? j10 : z8 ? j11 : j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E0.class != obj.getClass()) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f19888a == e02.f19888a && this.f19889b == e02.f19889b;
    }

    public final int hashCode() {
        return (((int) this.f19888a) * 31) + ((int) this.f19889b);
    }
}
