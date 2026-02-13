package T4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m4.L;

/* loaded from: classes.dex */
public final class p extends n {
    public final E5.o j;
    public final E5.o k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9302l;

    public p(j jVar, long j, long j10, long j11, long j12, long j13, List list, long j14, E5.o oVar, E5.o oVar2, long j15, long j16) {
        super(jVar, j, j10, j11, j13, list, j14, j15, j16);
        this.j = oVar;
        this.k = oVar2;
        this.f9302l = j12;
    }

    @Override // T4.s
    public final j a(m mVar) {
        E5.o oVar = this.j;
        if (oVar == null) {
            return this.f9307a;
        }
        L l10 = mVar.f9292a;
        return new j(0L, -1L, oVar.a(l10.f20085a, 0L, 0L, l10.f20092v));
    }

    @Override // T4.n
    public final long d(long j) {
        if (this.f9299f != null) {
            return r0.size();
        }
        long j10 = this.f9302l;
        if (j10 != -1) {
            return (j10 - this.f9297d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f9308b));
        BigInteger multiply2 = BigInteger.valueOf(this.f9298e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i7 = P6.a.f8163a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // T4.n
    public final j h(k kVar, long j) {
        long j10 = this.f9297d;
        List list = this.f9299f;
        long j11 = list != null ? ((q) list.get((int) (j - j10))).f9303a : (j - j10) * this.f9298e;
        L l10 = kVar.f9292a;
        return new j(0L, -1L, this.k.a(l10.f20085a, j, j11, l10.f20092v));
    }
}
