package C;

import A0.InterfaceC0035y;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class L extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public float f2360C;

    /* renamed from: D, reason: collision with root package name */
    public float f2361D;

    /* renamed from: E, reason: collision with root package name */
    public float f2362E;

    /* renamed from: F, reason: collision with root package name */
    public float f2363F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2364G;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // A0.InterfaceC0035y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        int i7;
        int i10;
        int i11;
        int j10;
        int h10;
        int i12;
        int g;
        long a9;
        int i13 = 0;
        if (Float.isNaN(this.f2362E)) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = t5.B(this.f2362E);
            if (i7 < 0) {
                i7 = 0;
            }
        }
        if (Float.isNaN(this.f2363F)) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = t5.B(this.f2363F);
            if (i10 < 0) {
                i10 = 0;
            }
        }
        if (!Float.isNaN(this.f2360C)) {
            i11 = t5.B(this.f2360C);
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i7) {
                i11 = i7;
            }
        }
        i11 = 0;
        if (!Float.isNaN(this.f2361D)) {
            int B10 = t5.B(this.f2361D);
            if (B10 < 0) {
                B10 = 0;
            }
            if (B10 > i10) {
                B10 = i10;
            }
            if (B10 != Integer.MAX_VALUE) {
                i13 = B10;
            }
        }
        long a10 = V0.b.a(i11, i7, i13, i10);
        if (this.f2364G) {
            int j11 = V0.a.j(j);
            int h11 = V0.a.h(j);
            int i14 = V0.a.i(j);
            int g2 = V0.a.g(j);
            int j12 = V0.a.j(a10);
            if (j12 < j11) {
                j12 = j11;
            }
            if (j12 > h11) {
                j12 = h11;
            }
            int h12 = V0.a.h(a10);
            if (h12 >= j11) {
                j11 = h12;
            }
            if (j11 <= h11) {
                h11 = j11;
            }
            int i15 = V0.a.i(a10);
            if (i15 < i14) {
                i15 = i14;
            }
            if (i15 > g2) {
                i15 = g2;
            }
            int g10 = V0.a.g(a10);
            if (g10 >= i14) {
                i14 = g10;
            }
            if (i14 <= g2) {
                g2 = i14;
            }
            a9 = V0.b.a(j12, h11, i15, g2);
        } else {
            if (Float.isNaN(this.f2360C)) {
                j10 = V0.a.j(j);
                int h13 = V0.a.h(a10);
                if (j10 > h13) {
                    j10 = h13;
                }
            } else {
                j10 = V0.a.j(a10);
            }
            if (Float.isNaN(this.f2362E)) {
                h10 = V0.a.h(j);
                int j13 = V0.a.j(a10);
                if (h10 < j13) {
                    h10 = j13;
                }
            } else {
                h10 = V0.a.h(a10);
            }
            if (Float.isNaN(this.f2361D)) {
                i12 = V0.a.i(j);
                int g11 = V0.a.g(a10);
                if (i12 > g11) {
                    i12 = g11;
                }
            } else {
                i12 = V0.a.i(a10);
            }
            if (Float.isNaN(this.f2363F)) {
                g = V0.a.g(j);
                int i16 = V0.a.i(a10);
                if (g < i16) {
                    g = i16;
                }
            } else {
                g = V0.a.g(a10);
            }
            a9 = V0.b.a(j10, h10, i12, g);
        }
        AbstractC2323H b2 = zVar.b(a9);
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0225j(b2, 2));
    }
}
