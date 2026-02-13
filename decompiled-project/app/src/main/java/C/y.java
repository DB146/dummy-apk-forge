package C;

import A0.InterfaceC0035y;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class y extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public w f2448C;

    /* renamed from: D, reason: collision with root package name */
    public float f2449D;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        int j10;
        int h10;
        int g;
        int i7;
        if (!V0.a.d(j) || this.f2448C == w.f2442a) {
            j10 = V0.a.j(j);
            h10 = V0.a.h(j);
        } else {
            int round = Math.round(V0.a.h(j) * this.f2449D);
            int j11 = V0.a.j(j);
            j10 = V0.a.h(j);
            if (round < j11) {
                round = j11;
            }
            if (round <= j10) {
                j10 = round;
            }
            h10 = j10;
        }
        if (!V0.a.c(j) || this.f2448C == w.f2443b) {
            int i10 = V0.a.i(j);
            g = V0.a.g(j);
            i7 = i10;
        } else {
            int round2 = Math.round(V0.a.g(j) * this.f2449D);
            int i11 = V0.a.i(j);
            i7 = V0.a.g(j);
            if (round2 < i11) {
                round2 = i11;
            }
            if (round2 <= i7) {
                i7 = round2;
            }
            g = i7;
        }
        AbstractC2323H b2 = zVar.b(V0.b.a(j10, h10, i7, g));
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0225j(b2, 1));
    }
}
