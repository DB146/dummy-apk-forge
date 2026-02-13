package P4;

import m4.J0;
import m4.K0;
import m4.L0;

/* renamed from: P4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457e extends AbstractC0468p {

    /* renamed from: c, reason: collision with root package name */
    public final long f8027c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8028d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8029e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8030f;

    public C0457e(L0 l02, long j, long j10) {
        super(l02);
        boolean z8 = false;
        if (l02.h() != 1) {
            throw new C0458f(0);
        }
        K0 m10 = l02.m(0, new K0(), 0L);
        long max = Math.max(0L, j);
        if (!m10.f20030z && max != 0 && !m10.f20026v) {
            throw new C0458f(1);
        }
        long max2 = j10 == Long.MIN_VALUE ? m10.f20015B : Math.max(0L, j10);
        long j11 = m10.f20015B;
        if (j11 != -9223372036854775807L) {
            max2 = max2 > j11 ? j11 : max2;
            if (max > max2) {
                throw new C0458f(2);
            }
        }
        this.f8027c = max;
        this.f8028d = max2;
        this.f8029e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m10.f20027w && (max2 == -9223372036854775807L || (j11 != -9223372036854775807L && max2 == j11))) {
            z8 = true;
        }
        this.f8030f = z8;
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        this.f8122b.f(0, j02, z8);
        long j = j02.f19967e - this.f8027c;
        long j10 = this.f8029e;
        j02.i(j02.f19963a, j02.f19964b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - j, j, Q4.b.f8638f, false);
        return j02;
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final K0 m(int i7, K0 k02, long j) {
        this.f8122b.m(0, k02, 0L);
        long j10 = k02.f20018E;
        long j11 = this.f8027c;
        k02.f20018E = j10 + j11;
        k02.f20015B = this.f8029e;
        k02.f20027w = this.f8030f;
        long j12 = k02.f20014A;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            k02.f20014A = max;
            long j13 = this.f8028d;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            k02.f20014A = max - j11;
        }
        long Z7 = n5.D.Z(j11);
        long j14 = k02.f20023e;
        if (j14 != -9223372036854775807L) {
            k02.f20023e = j14 + Z7;
        }
        long j15 = k02.f20024f;
        if (j15 != -9223372036854775807L) {
            k02.f20024f = j15 + Z7;
        }
        return k02;
    }
}
