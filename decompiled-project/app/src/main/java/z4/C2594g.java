package z4;

import n5.D;
import s4.r;
import s4.t;

/* renamed from: z4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2594g implements InterfaceC2593f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f28265a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f28266b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28267c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28268d;

    public C2594g(long[] jArr, long[] jArr2, long j, long j10) {
        this.f28265a = jArr;
        this.f28266b = jArr2;
        this.f28267c = j;
        this.f28268d = j10;
    }

    @Override // z4.InterfaceC2593f
    public final long b(long j) {
        return this.f28265a[D.e(this.f28266b, j, true)];
    }

    @Override // z4.InterfaceC2593f
    public final long d() {
        return this.f28268d;
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        long[] jArr = this.f28265a;
        int e2 = D.e(jArr, j, true);
        long j10 = jArr[e2];
        long[] jArr2 = this.f28266b;
        t tVar = new t(j10, jArr2[e2]);
        if (j10 >= j || e2 == jArr.length - 1) {
            return new r(tVar, tVar);
        }
        int i7 = e2 + 1;
        return new r(tVar, new t(jArr[i7], jArr2[i7]));
    }

    @Override // s4.s
    public final long i() {
        return this.f28267c;
    }
}
