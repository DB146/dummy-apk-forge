package A4;

import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final v f507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f508b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f509c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f511e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f512f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final long f513h;

    public y(v vVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j) {
        AbstractC1705a.h(iArr.length == jArr2.length);
        AbstractC1705a.h(jArr.length == jArr2.length);
        AbstractC1705a.h(iArr2.length == jArr2.length);
        this.f507a = vVar;
        this.f509c = jArr;
        this.f510d = iArr;
        this.f511e = i7;
        this.f512f = jArr2;
        this.g = iArr2;
        this.f513h = j;
        this.f508b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f512f;
        for (int b2 = D.b(jArr, j, true); b2 < jArr.length; b2++) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
