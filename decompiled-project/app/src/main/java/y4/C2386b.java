package y4;

import java.util.ArrayDeque;
import o7.o;
import s4.C1979g;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2386b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26848a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f26849b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f26850c = new e();

    /* renamed from: d, reason: collision with root package name */
    public o f26851d;

    /* renamed from: e, reason: collision with root package name */
    public int f26852e;

    /* renamed from: f, reason: collision with root package name */
    public int f26853f;
    public long g;

    public final long a(C1979g c1979g, int i7) {
        c1979g.h(this.f26848a, 0, i7, false);
        long j = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j = (j << 8) | (r0[i10] & 255);
        }
        return j;
    }
}
