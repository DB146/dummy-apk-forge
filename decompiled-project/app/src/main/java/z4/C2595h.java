package z4;

import n5.AbstractC1705a;
import n5.D;
import s4.r;
import s4.t;

/* renamed from: z4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2595h implements InterfaceC2593f {

    /* renamed from: a, reason: collision with root package name */
    public final long f28269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28270b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28271c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28272d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28273e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f28274f;

    public C2595h(long j, int i7, long j10, long j11, long[] jArr) {
        this.f28269a = j;
        this.f28270b = i7;
        this.f28271c = j10;
        this.f28274f = jArr;
        this.f28272d = j11;
        this.f28273e = j11 != -1 ? j + j11 : -1L;
    }

    @Override // z4.InterfaceC2593f
    public final long b(long j) {
        long j10 = j - this.f28269a;
        if (!g() || j10 <= this.f28270b) {
            return 0L;
        }
        long[] jArr = this.f28274f;
        AbstractC1705a.n(jArr);
        double d10 = (j10 * 256.0d) / this.f28272d;
        int e2 = D.e(jArr, (long) d10, true);
        long j11 = this.f28271c;
        long j12 = (e2 * j11) / 100;
        long j13 = jArr[e2];
        int i7 = e2 + 1;
        long j14 = (j11 * i7) / 100;
        return Math.round((j13 == (e2 == 99 ? 256L : jArr[i7]) ? 0.0d : (d10 - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // z4.InterfaceC2593f
    public final long d() {
        return this.f28273e;
    }

    @Override // s4.s
    public final boolean g() {
        return this.f28274f != null;
    }

    @Override // s4.s
    public final r h(long j) {
        double d10;
        boolean g = g();
        int i7 = this.f28270b;
        long j10 = this.f28269a;
        if (!g) {
            t tVar = new t(0L, j10 + i7);
            return new r(tVar, tVar);
        }
        long j11 = D.j(j, 0L, this.f28271c);
        double d11 = (j11 * 100.0d) / this.f28271c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d10 = 256.0d;
                d12 = 256.0d;
                double d13 = d12 / d10;
                long j12 = this.f28272d;
                t tVar2 = new t(j11, j10 + D.j(Math.round(d13 * j12), i7, j12 - 1));
                return new r(tVar2, tVar2);
            }
            int i10 = (int) d11;
            long[] jArr = this.f28274f;
            AbstractC1705a.n(jArr);
            double d14 = jArr[i10];
            d12 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d14) * (d11 - i10)) + d14;
        }
        d10 = 256.0d;
        double d132 = d12 / d10;
        long j122 = this.f28272d;
        t tVar22 = new t(j11, j10 + D.j(Math.round(d132 * j122), i7, j122 - 1));
        return new r(tVar22, tVar22);
    }

    @Override // s4.s
    public final long i() {
        return this.f28271c;
    }
}
