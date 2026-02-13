package C;

import A0.InterfaceC0035y;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* renamed from: C.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226k extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public float f2406C;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        long q02 = q0(j, true);
        if (V0.k.a(q02, 0L)) {
            q02 = p0(j, true);
            if (V0.k.a(q02, 0L)) {
                q02 = s0(j, true);
                if (V0.k.a(q02, 0L)) {
                    q02 = r0(j, true);
                    if (V0.k.a(q02, 0L)) {
                        q02 = q0(j, false);
                        if (V0.k.a(q02, 0L)) {
                            q02 = p0(j, false);
                            if (V0.k.a(q02, 0L)) {
                                q02 = s0(j, false);
                                if (V0.k.a(q02, 0L)) {
                                    q02 = r0(j, false);
                                    if (V0.k.a(q02, 0L)) {
                                        q02 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!V0.k.a(q02, 0L)) {
            int i7 = (int) (q02 >> 32);
            int i10 = (int) (q02 & 4294967295L);
            if (!((i10 >= 0) & (i7 >= 0))) {
                V0.h.a("width and height must be >= 0");
            }
            j = V0.b.g(i7, i7, i10, i10);
        }
        AbstractC2323H b2 = zVar.b(j);
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0225j(b2, 0));
    }

    public final long p0(long j, boolean z8) {
        int round;
        int g = V0.a.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.f2406C)) <= 0) {
            return 0L;
        }
        if (!z8 || androidx.compose.foundation.layout.a.b(round, g, j)) {
            return (round << 32) | (g & 4294967295L);
        }
        return 0L;
    }

    public final long q0(long j, boolean z8) {
        int round;
        int h10 = V0.a.h(j);
        if (h10 == Integer.MAX_VALUE || (round = Math.round(h10 / this.f2406C)) <= 0) {
            return 0L;
        }
        if (!z8 || androidx.compose.foundation.layout.a.b(h10, round, j)) {
            return (h10 << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long r0(long j, boolean z8) {
        int i7 = V0.a.i(j);
        int round = Math.round(i7 * this.f2406C);
        if (round <= 0) {
            return 0L;
        }
        if (!z8 || androidx.compose.foundation.layout.a.b(round, i7, j)) {
            return (round << 32) | (i7 & 4294967295L);
        }
        return 0L;
    }

    public final long s0(long j, boolean z8) {
        int j10 = V0.a.j(j);
        int round = Math.round(j10 / this.f2406C);
        if (round <= 0) {
            return 0L;
        }
        if (!z8 || androidx.compose.foundation.layout.a.b(j10, round, j)) {
            return (j10 << 32) | (round & 4294967295L);
        }
        return 0L;
    }
}
