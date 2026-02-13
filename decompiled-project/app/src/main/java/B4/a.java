package B4;

import java.math.BigInteger;
import n5.D;
import s4.r;
import s4.s;
import s4.t;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2045a;

    public a(b bVar) {
        this.f2045a = bVar;
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        b bVar = this.f2045a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f2049d.f2084i * j) / 1000000);
        long j10 = bVar.f2048c;
        long j11 = bVar.f2047b;
        t tVar = new t(j, D.j((valueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(bVar.f2051f)).longValue() + j11) - 30000, bVar.f2047b, j10 - 1));
        return new r(tVar, tVar);
    }

    @Override // s4.s
    public final long i() {
        return (this.f2045a.f2051f * 1000000) / r0.f2049d.f2084i;
    }
}
