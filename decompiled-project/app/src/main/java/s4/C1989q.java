package s4;

import n5.AbstractC1705a;
import n5.D;

/* renamed from: s4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24080a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24081b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24083d;

    public C1989q(long[] jArr, long[] jArr2, long j) {
        AbstractC1705a.h(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z8 = length > 0;
        this.f24083d = z8;
        if (!z8 || jArr2[0] <= 0) {
            this.f24080a = jArr;
            this.f24081b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f24080a = jArr3;
            long[] jArr4 = new long[i7];
            this.f24081b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f24082c = j;
    }

    @Override // s4.s
    public final boolean g() {
        return this.f24083d;
    }

    @Override // s4.s
    public final r h(long j) {
        if (!this.f24083d) {
            t tVar = t.f24086c;
            return new r(tVar, tVar);
        }
        long[] jArr = this.f24081b;
        int e2 = D.e(jArr, j, true);
        long j10 = jArr[e2];
        long[] jArr2 = this.f24080a;
        t tVar2 = new t(j10, jArr2[e2]);
        if (j10 == j || e2 == jArr.length - 1) {
            return new r(tVar2, tVar2);
        }
        int i7 = e2 + 1;
        return new r(tVar2, new t(jArr[i7], jArr2[i7]));
    }

    @Override // s4.s
    public final long i() {
        return this.f24082c;
    }
}
