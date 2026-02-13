package z4;

import android.util.Pair;
import n5.D;
import s4.r;
import s4.t;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2590c implements InterfaceC2593f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f28246a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f28247b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28248c;

    public C2590c(long[] jArr, long[] jArr2, long j) {
        this.f28246a = jArr;
        this.f28247b = jArr2;
        this.f28248c = j == -9223372036854775807L ? D.M(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long[] jArr, long[] jArr2, long j) {
        int e2 = D.e(jArr, j, true);
        long j10 = jArr[e2];
        long j11 = jArr2[e2];
        int i7 = e2 + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i7] == j10 ? 0.0d : (j - j10) / (r6 - j10)) * (jArr2[i7] - j11))) + j11));
    }

    @Override // z4.InterfaceC2593f
    public final long b(long j) {
        return D.M(((Long) a(this.f28246a, this.f28247b, j).second).longValue());
    }

    @Override // z4.InterfaceC2593f
    public final long d() {
        return -1L;
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        Pair a9 = a(this.f28247b, this.f28246a, D.Z(D.j(j, 0L, this.f28248c)));
        t tVar = new t(D.M(((Long) a9.first).longValue()), ((Long) a9.second).longValue());
        return new r(tVar, tVar);
    }

    @Override // s4.s
    public final long i() {
        return this.f28248c;
    }
}
