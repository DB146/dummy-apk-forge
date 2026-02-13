package D4;

import A4.i;
import n5.D;
import s4.r;
import s4.s;
import s4.t;

/* loaded from: classes.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3227b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3228c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3229d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3230e;

    public f(i iVar, int i7, long j, long j10) {
        this.f3226a = iVar;
        this.f3227b = i7;
        this.f3228c = j;
        long j11 = (j10 - j) / iVar.f390c;
        this.f3229d = j11;
        this.f3230e = D.T(j11 * i7, 1000000L, iVar.f389b);
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        i iVar = this.f3226a;
        int i7 = this.f3227b;
        long j10 = (iVar.f389b * j) / (i7 * 1000000);
        long j11 = this.f3229d - 1;
        long j12 = D.j(j10, 0L, j11);
        int i10 = iVar.f390c;
        long j13 = this.f3228c;
        long T10 = D.T(j12 * i7, 1000000L, iVar.f389b);
        t tVar = new t(T10, (i10 * j12) + j13);
        if (T10 >= j || j12 == j11) {
            return new r(tVar, tVar);
        }
        long j14 = j12 + 1;
        return new r(tVar, new t(D.T(j14 * i7, 1000000L, iVar.f389b), (i10 * j14) + j13));
    }

    @Override // s4.s
    public final long i() {
        return this.f3230e;
    }
}
