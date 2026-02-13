package s4;

import java.util.Arrays;
import n5.D;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f24046a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24047b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f24048c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f24049d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f24050e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24051f;

    public C1978f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f24047b = iArr;
        this.f24048c = jArr;
        this.f24049d = jArr2;
        this.f24050e = jArr3;
        int length = iArr.length;
        this.f24046a = length;
        if (length > 0) {
            this.f24051f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f24051f = 0L;
        }
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        long[] jArr = this.f24050e;
        int e2 = D.e(jArr, j, true);
        long j10 = jArr[e2];
        long[] jArr2 = this.f24048c;
        t tVar = new t(j10, jArr2[e2]);
        if (j10 >= j || e2 == this.f24046a - 1) {
            return new r(tVar, tVar);
        }
        int i7 = e2 + 1;
        return new r(tVar, new t(jArr[i7], jArr2[i7]));
    }

    @Override // s4.s
    public final long i() {
        return this.f24051f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f24046a + ", sizes=" + Arrays.toString(this.f24047b) + ", offsets=" + Arrays.toString(this.f24048c) + ", timeUs=" + Arrays.toString(this.f24050e) + ", durationsUs=" + Arrays.toString(this.f24049d) + ")";
    }
}
