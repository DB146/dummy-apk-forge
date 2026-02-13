package N;

import A0.j0;
import Q.AbstractC0499k0;
import Q.C0480b;
import Q.C0505n0;
import Q.C0506o;
import Q.C0523z;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final C0523z f6973a = new C0523z(C0412b.f7028x);

    public static final void a(K0.F f4, Y.e eVar, C0506o c0506o, int i7) {
        c0506o.U(-460300127);
        int i10 = (c0506o.g(f4) ? 4 : 2) | i7 | (c0506o.i(eVar) ? 32 : 16);
        if ((i10 & 19) == 18 && c0506o.x()) {
            c0506o.N();
        } else {
            AbstractC0499k0 abstractC0499k0 = f6973a;
            K0.F f10 = (K0.F) c0506o.k(abstractC0499k0);
            f10.getClass();
            if (f4 != null && !f4.equals(K0.F.f5854d)) {
                f10 = new K0.F(f10.f5855a.c(f4.f5855a), f10.f5856b.a(f4.f5856b));
            }
            C0480b.a(abstractC0499k0.a(f10), eVar, c0506o, (i10 & 112) | 8);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new j0(f4, eVar, i7, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, c0.m mVar, long j, long j10, long j11, long j12, int i7, boolean z8, int i10, int i11, K0.F f4, C0506o c0506o, int i12, int i13, int i14) {
        c0.m mVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        c0.m mVar3;
        long j13;
        long j14;
        int i19;
        boolean z10;
        int i20;
        int i21;
        long j15;
        long j16;
        long b2;
        boolean z11;
        c0.m mVar4;
        long j17;
        long j18;
        long j19;
        int i22;
        long j20;
        C0505n0 r10;
        c0506o.U(-2055108902);
        int i23 = i12 | (c0506o.g(str) ? 4 : 2);
        int i24 = i14 & 2;
        if (i24 != 0) {
            i23 |= 48;
        } else if ((i12 & 48) == 0) {
            mVar2 = mVar;
            i23 |= c0506o.g(mVar2) ? 32 : 16;
            i15 = i23 | 920350080;
            int i25 = i13 | 3510;
            i16 = i14 & 16384;
            if (i16 == 0) {
                i25 = i13 | 28086;
            } else if ((i13 & 24576) == 0) {
                i17 = i11;
                i25 |= c0506o.e(i17) ? 16384 : 8192;
                i18 = i25 | 196608;
                if ((1572864 & i13) == 0) {
                    i18 |= c0506o.g(f4) ? 1048576 : 524288;
                }
                if ((306783379 & i15) != 306783378 && (599187 & i18) == 599186 && c0506o.x()) {
                    c0506o.N();
                    j18 = j10;
                    j19 = j12;
                    i22 = i7;
                    z10 = z8;
                    i20 = i10;
                    mVar4 = mVar2;
                    i21 = i17;
                    j20 = j;
                    j17 = j11;
                } else {
                    c0506o.P();
                    if ((i12 & 1) != 0 || c0506o.w()) {
                        mVar3 = i24 != 0 ? c0.j.f14110a : mVar2;
                        j13 = j0.n.g;
                        j14 = V0.n.f9987c;
                        i19 = 1;
                        if (i16 != 0) {
                            i17 = 1;
                        }
                        z10 = true;
                        i20 = Integer.MAX_VALUE;
                        i21 = i17;
                        j15 = j14;
                        j16 = j15;
                    } else {
                        c0506o.N();
                        j13 = j;
                        j14 = j10;
                        j16 = j12;
                        z10 = z8;
                        i20 = i10;
                        mVar3 = mVar2;
                        i21 = i17;
                        j15 = j11;
                        i19 = i7;
                    }
                    c0506o.q();
                    c0506o.S(-1827892941);
                    long j21 = j13;
                    if (j13 != 16) {
                        b2 = j21;
                        z11 = false;
                    } else {
                        c0506o.S(-1827892168);
                        b2 = f4.b();
                        if (b2 == 16) {
                            b2 = ((j0.n) c0506o.k(AbstractC0417g.f7043a)).f18554a;
                        }
                        z11 = false;
                        c0506o.p(false);
                    }
                    c0506o.p(z11);
                    O5.b.b(str, mVar3, K0.F.c(f4, b2, j14, j15, Integer.MIN_VALUE, j16, 16609104), i19, z10, i20, i21, c0506o, (i15 & 126) | 1797120 | ((i18 << 9) & 29360128));
                    mVar4 = mVar3;
                    j17 = j15;
                    j18 = j14;
                    j19 = j16;
                    i22 = i19;
                    j20 = j21;
                }
                r10 = c0506o.r();
                if (r10 != null) {
                    r10.f8432d = new F(str, mVar4, j20, j18, j17, j19, i22, z10, i20, i21, f4, i12, i13, i14);
                    return;
                }
                return;
            }
            i17 = i11;
            i18 = i25 | 196608;
            if ((1572864 & i13) == 0) {
            }
            if ((306783379 & i15) != 306783378) {
            }
            c0506o.P();
            if ((i12 & 1) != 0) {
            }
            if (i24 != 0) {
            }
            j13 = j0.n.g;
            j14 = V0.n.f9987c;
            i19 = 1;
            if (i16 != 0) {
            }
            z10 = true;
            i20 = Integer.MAX_VALUE;
            i21 = i17;
            j15 = j14;
            j16 = j15;
            c0506o.q();
            c0506o.S(-1827892941);
            long j212 = j13;
            if (j13 != 16) {
            }
            c0506o.p(z11);
            O5.b.b(str, mVar3, K0.F.c(f4, b2, j14, j15, Integer.MIN_VALUE, j16, 16609104), i19, z10, i20, i21, c0506o, (i15 & 126) | 1797120 | ((i18 << 9) & 29360128));
            mVar4 = mVar3;
            j17 = j15;
            j18 = j14;
            j19 = j16;
            i22 = i19;
            j20 = j212;
            r10 = c0506o.r();
            if (r10 != null) {
            }
        }
        mVar2 = mVar;
        i15 = i23 | 920350080;
        int i252 = i13 | 3510;
        i16 = i14 & 16384;
        if (i16 == 0) {
        }
        i17 = i11;
        i18 = i252 | 196608;
        if ((1572864 & i13) == 0) {
        }
        if ((306783379 & i15) != 306783378) {
        }
        c0506o.P();
        if ((i12 & 1) != 0) {
        }
        if (i24 != 0) {
        }
        j13 = j0.n.g;
        j14 = V0.n.f9987c;
        i19 = 1;
        if (i16 != 0) {
        }
        z10 = true;
        i20 = Integer.MAX_VALUE;
        i21 = i17;
        j15 = j14;
        j16 = j15;
        c0506o.q();
        c0506o.S(-1827892941);
        long j2122 = j13;
        if (j13 != 16) {
        }
        c0506o.p(z11);
        O5.b.b(str, mVar3, K0.F.c(f4, b2, j14, j15, Integer.MIN_VALUE, j16, 16609104), i19, z10, i20, i21, c0506o, (i15 & 126) | 1797120 | ((i18 << 9) & 29360128));
        mVar4 = mVar3;
        j17 = j15;
        j18 = j14;
        j19 = j16;
        i22 = i19;
        j20 = j2122;
        r10 = c0506o.r();
        if (r10 != null) {
        }
    }
}
