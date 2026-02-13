package I0;

import A0.C0010c0;
import A0.C0018g0;
import A0.C0031u;
import A0.J;
import A0.L;
import A0.n0;
import A0.s0;
import A4.s;
import A9.S2;
import S.e;
import V0.i;
import Z9.x;
import android.os.Handler;
import i0.C1288a;
import j0.AbstractC1362A;
import u.C2042E;
import u.C2070x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f4955a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4956b;

    /* renamed from: c, reason: collision with root package name */
    public final C2042E f4957c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4958d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4960f;
    public S2 g;

    /* renamed from: h, reason: collision with root package name */
    public long f4961h;

    /* renamed from: i, reason: collision with root package name */
    public final J f4962i;
    public final C1288a j;

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.s, java.lang.Object] */
    public a() {
        ?? obj = new Object();
        obj.f471b = new long[192];
        obj.f472c = new long[192];
        this.f4955a = obj;
        this.f4956b = new b();
        this.f4957c = new C2042E();
        this.f4961h = -1L;
        this.f4962i = new J(this, 4);
        this.j = new C1288a();
    }

    public static long g(L l10) {
        float[] mo0getUnderlyingMatrixsQKQjiQ;
        int a9;
        C0018g0 c0018g0 = l10.f60S;
        n0 n0Var = (n0) c0018g0.f227d;
        n0 n0Var2 = (C0031u) c0018g0.f226c;
        long j = 0;
        while (n0Var2 != null && n0Var2 != n0Var) {
            s0 s0Var = n0Var2.f292T;
            j = x.M(j, n0Var2.f284K);
            n0Var2 = n0Var2.f275B;
            if (s0Var != null && (a9 = Tb.a.a((mo0getUnderlyingMatrixsQKQjiQ = s0Var.mo0getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((a9 & 2) == 0) {
                    return 9223372034707292159L;
                }
                j = AbstractC1362A.s(j, mo0getUnderlyingMatrixsQKQjiQ);
            }
        }
        return x.O(j);
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        Handler handler = c0.a.f14087a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z8 = this.f4958d;
        boolean z10 = z8 || this.f4959e;
        s sVar = this.f4955a;
        b bVar = this.f4956b;
        if (z8) {
            this.f4958d = false;
            C2042E c2042e = this.f4957c;
            Object[] objArr = c2042e.f24584a;
            int i12 = c2042e.f24585b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((Rb.a) objArr[i13]).invoke();
            }
            long[] jArr = (long[]) sVar.f471b;
            int i14 = sVar.f470a;
            for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
                long j = jArr[i15 + 2];
                if ((((int) (j >> 61)) & 1) != 0) {
                    long j10 = jArr[i15];
                    long j11 = jArr[i15 + 1];
                    if (bVar.f4963a.b(((int) j) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            long[] jArr2 = (long[]) sVar.f471b;
            int i16 = sVar.f470a;
            for (int i17 = 0; i17 < jArr2.length - 2 && i17 < i16; i17 += 3) {
                int i18 = i17 + 2;
                jArr2[i18] = jArr2[i18] & (-2305843009213693953L);
            }
        }
        if (this.f4959e) {
            this.f4959e = false;
            C2070x c2070x = bVar.f4963a;
            Object[] objArr2 = c2070x.f24693c;
            long[] jArr3 = c2070x.f24691a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i19 = 0;
                while (true) {
                    long j12 = jArr3[i19];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i19 - length)) >>> 31);
                        for (int i21 = 0; i21 < i20; i21++) {
                            if ((j12 & 255) < 128 && objArr2[(i19 << 3) + i21] != null) {
                                throw new ClassCastException();
                            }
                            j12 >>= 8;
                        }
                        i11 = 1;
                        if (i20 != 8) {
                            break;
                        }
                    } else {
                        i11 = 1;
                    }
                    if (i19 == length) {
                        break;
                    } else {
                        i19 += i11;
                    }
                }
            }
        }
        if (z10) {
            bVar.getClass();
        }
        if (this.f4960f) {
            i7 = 0;
            this.f4960f = false;
            long[] jArr4 = (long[]) sVar.f471b;
            int i22 = sVar.f470a;
            long[] jArr5 = (long[]) sVar.f472c;
            int i23 = 0;
            for (int i24 = 0; i24 < jArr4.length - 2 && i23 < jArr5.length - 2 && i24 < i22; i24 += 3) {
                int i25 = i24 + 2;
                if (jArr4[i25] != 2305843009213693951L) {
                    jArr5[i23] = jArr4[i24];
                    jArr5[i23 + 1] = jArr4[i24 + 1];
                    jArr5[i23 + 2] = jArr4[i25];
                    i23 += 3;
                }
            }
            sVar.f470a = i23;
            sVar.f471b = jArr5;
            sVar.f472c = jArr4;
        } else {
            i7 = 0;
        }
        if (bVar.f4964b > currentTimeMillis) {
            return;
        }
        C2070x c2070x2 = bVar.f4963a;
        Object[] objArr3 = c2070x2.f24693c;
        long[] jArr6 = c2070x2.f24691a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i26 = i7;
            while (true) {
                long j13 = jArr6[i26];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                    for (int i28 = i7; i28 < i27; i28++) {
                        if ((j13 & 255) < 128 && objArr3[(i26 << 3) + i28] != null) {
                            throw new ClassCastException();
                        }
                        j13 >>= 8;
                    }
                    i10 = 1;
                    if (i27 != 8) {
                        break;
                    }
                } else {
                    i10 = 1;
                }
                if (i26 == length2) {
                    break;
                } else {
                    i26 += i10;
                }
            }
        }
        bVar.f4964b = -1L;
    }

    public final void b(L l10, long j, boolean z8) {
        n0 n0Var = (n0) l10.f60S.f227d;
        C0010c0 c0010c0 = l10.f61T.f105p;
        int i7 = (int) (j >> 32);
        float f4 = i7;
        int i10 = (int) (j & 4294967295L);
        float I6 = i7 + c0010c0.I();
        float H10 = i10 + c0010c0.H();
        C1288a c1288a = this.j;
        c1288a.f18168a = f4;
        c1288a.f18169b = i10;
        c1288a.f18170c = I6;
        c1288a.f18171d = H10;
        while (n0Var != null) {
            s0 s0Var = n0Var.f292T;
            long j10 = n0Var.f284K;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            c1288a.f18168a += intBitsToFloat;
            c1288a.f18169b += intBitsToFloat2;
            c1288a.f18170c += intBitsToFloat;
            c1288a.f18171d += intBitsToFloat2;
            n0Var = n0Var.f275B;
            if (s0Var != null) {
                float[] mo0getUnderlyingMatrixsQKQjiQ = s0Var.mo0getUnderlyingMatrixsQKQjiQ();
                if (!AbstractC1362A.q(mo0getUnderlyingMatrixsQKQjiQ)) {
                    AbstractC1362A.t(mo0getUnderlyingMatrixsQKQjiQ, c1288a);
                }
            }
        }
        int i11 = (int) c1288a.f18168a;
        int i12 = (int) c1288a.f18169b;
        int i13 = (int) c1288a.f18170c;
        int i14 = (int) c1288a.f18171d;
        int i15 = l10.f70b;
        s sVar = this.f4955a;
        if (!z8) {
            int i16 = i15 & 67108863;
            long[] jArr = (long[]) sVar.f471b;
            int i17 = sVar.f470a;
            for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                long j11 = jArr[i19];
                if ((((int) j11) & 67108863) == i16) {
                    jArr[i18] = (i11 << 32) | (i12 & 4294967295L);
                    jArr[i18 + 1] = (i13 << 32) | (i14 & 4294967295L);
                    jArr[i19] = j11 | 2305843009213693952L;
                    break;
                }
            }
        }
        L t5 = l10.t();
        s.o(sVar, i15, i11, i12, i13, i14, t5 != null ? t5.f70b : -1);
        this.f4958d = true;
    }

    public final void c(L l10) {
        e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            b(l11, ((n0) l11.f60S.f227d).f284K, false);
            c(l11);
        }
    }

    public final void d(L l10) {
        this.f4958d = true;
        int i7 = l10.f70b & 67108863;
        s sVar = this.f4955a;
        long[] jArr = (long[]) sVar.f471b;
        int i10 = sVar.f470a;
        int i11 = 0;
        while (true) {
            if (i11 >= jArr.length - 2 || i11 >= i10) {
                break;
            }
            int i12 = i11 + 2;
            long j = jArr[i12];
            if ((((int) j) & 67108863) == i7) {
                jArr[i12] = 2305843009213693952L | j;
                break;
            }
            i11 += 3;
        }
        S2 s22 = this.g;
        boolean z8 = s22 != null;
        long j10 = this.f4956b.f4964b;
        if (j10 >= 0 || !z8) {
            if (this.f4961h == j10 && z8) {
                return;
            }
            if (s22 != null) {
                Handler handler = c0.a.f14087a;
                c0.a.f14087a.removeCallbacks(s22);
            }
            Handler handler2 = c0.a.f14087a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j10, 16 + currentTimeMillis);
            this.f4961h = max;
            S2 s23 = new S2(this.f4962i, 23);
            c0.a.f14087a.postDelayed(s23, max - currentTimeMillis);
            this.g = s23;
        }
    }

    public final void e(L l10) {
        long g = g(l10);
        if (i.a(g, 9223372034707292159L)) {
            c(l10);
            return;
        }
        l10.f75e = g;
        l10.f76f = false;
        e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            f(l11, ((n0) l11.f60S.f227d).f284K, false);
        }
        d(l10);
    }

    public final void f(L l10, long j, boolean z8) {
        long j10;
        int i7;
        long j11;
        boolean z10;
        char c10;
        int i10;
        char c11;
        float[] mo0getUnderlyingMatrixsQKQjiQ;
        int a9;
        C0010c0 c0010c0 = l10.f61T.f105p;
        int I6 = c0010c0.I();
        int H10 = c0010c0.H();
        L t5 = l10.t();
        long j12 = l10.f72c;
        long j13 = l10.f74d;
        int i11 = (int) (j13 >> 32);
        int i12 = (int) (j13 & 4294967295L);
        if (t5 != null) {
            boolean z11 = t5.f76f;
            i7 = i11;
            long j14 = t5.f72c;
            j10 = j12;
            long j15 = t5.f75e;
            if (!i.a(j14, 9223372034707292159L)) {
                if (z11) {
                    j15 = g(t5);
                    t5.f75e = j15;
                    t5.f76f = false;
                }
                z10 = i.a(j15, 9223372034707292159L);
                j11 = i.c(i.c(j14, j15), j);
                if (!z10 || i.a(j11, 9223372034707292159L)) {
                    b(l10, j, z8);
                }
                l10.f72c = j11;
                l10.f74d = (I6 << 32) | (H10 & 4294967295L);
                int i13 = (int) (j11 >> 32);
                int i14 = (int) (j11 & 4294967295L);
                int i15 = i13 + I6;
                int i16 = i14 + H10;
                if (!z8 && i.a(j11, j10) && i7 == I6 && i12 == H10) {
                    return;
                }
                int i17 = l10.f70b;
                s sVar = this.f4955a;
                if (!z8) {
                    int i18 = 67108863;
                    int i19 = i17 & 67108863;
                    long[] jArr = (long[]) sVar.f471b;
                    int i20 = sVar.f470a;
                    int i21 = 0;
                    while (i21 < jArr.length - 2 && i21 < i20) {
                        int i22 = i21 + 2;
                        int i23 = i14;
                        long j16 = jArr[i22];
                        if ((((int) j16) & i18) == i19) {
                            long j17 = jArr[i21];
                            jArr[i21] = (i23 & 4294967295L) | (i13 << 32);
                            jArr[i21 + 1] = (i15 << 32) | (i16 & 4294967295L);
                            jArr[i22] = j16 | 2305843009213693952L;
                            int i24 = i23 - ((int) j17);
                            if ((i13 - ((int) (j17 >> 32)) != 0) | (i24 != 0)) {
                                char c12 = 26;
                                long j18 = (j16 & (-4503599560261633L)) | (((i21 + 3) & 67108863) << 26);
                                long[] jArr2 = (long[]) sVar.f471b;
                                long[] jArr3 = (long[]) sVar.f472c;
                                int i25 = sVar.f470a / 3;
                                jArr3[0] = j18;
                                int i26 = 1;
                                while (i26 > 0) {
                                    i26--;
                                    long j19 = jArr3[i26];
                                    int i27 = ((int) j19) & 67108863;
                                    int i28 = ((int) (j19 >> c12)) & 67108863;
                                    int i29 = ((int) (j19 >> 52)) & 511;
                                    int i30 = i29 == 511 ? i25 : i29 + i28;
                                    if (i28 < 0) {
                                        break;
                                    }
                                    while (i28 < jArr2.length - 2 && i28 < i30) {
                                        int i31 = i28 + 2;
                                        long j20 = jArr2[i31];
                                        int i32 = i25;
                                        if ((((int) (j20 >> c12)) & 67108863) == i27) {
                                            long j21 = jArr2[i28];
                                            int i33 = i28 + 1;
                                            long j22 = jArr2[i33];
                                            i10 = i24;
                                            jArr2[i28] = ((((int) j21) + i10) & 4294967295L) | ((((int) (j21 >> 32)) + r4) << 32);
                                            jArr2[i33] = ((((int) j22) + i10) & 4294967295L) | ((((int) (j22 >> 32)) + r4) << 32);
                                            jArr2[i31] = j20 | 2305843009213693952L;
                                            c11 = '4';
                                            if ((((int) (j20 >> 52)) & 511) > 0) {
                                                c10 = 26;
                                                jArr3[i26] = (j20 & (-4503599560261633L)) | (((i28 + 3) & 67108863) << 26);
                                                i26++;
                                            } else {
                                                c10 = 26;
                                            }
                                        } else {
                                            c10 = c12;
                                            i10 = i24;
                                            c11 = '4';
                                        }
                                        i28 += 3;
                                        i24 = i10;
                                        i25 = i32;
                                        c12 = c10;
                                    }
                                    i25 = i25;
                                    c12 = c12;
                                    i24 = i24;
                                }
                            }
                            this.f4958d = true;
                            return;
                        }
                        i21 += 3;
                        i14 = i23;
                        i18 = i18;
                    }
                }
                int i34 = i14;
                L t10 = l10.t();
                s.o(sVar, i17, i13, i34, i15, i16, t10 != null ? t10.f70b : -1);
                this.f4958d = true;
                return;
            }
            n0 n0Var = (n0) l10.f60S.f227d;
            long j23 = 0;
            while (true) {
                if (n0Var == null) {
                    j11 = x.O(j23);
                    break;
                }
                s0 s0Var = n0Var.f292T;
                j23 = x.M(j23, n0Var.f284K);
                n0Var = n0Var.f275B;
                if (s0Var != null && (a9 = Tb.a.a((mo0getUnderlyingMatrixsQKQjiQ = s0Var.mo0getUnderlyingMatrixsQKQjiQ()))) != 3) {
                    if ((a9 & 2) == 0) {
                        j11 = 9223372034707292159L;
                        break;
                    }
                    j23 = AbstractC1362A.s(j23, mo0getUnderlyingMatrixsQKQjiQ);
                }
            }
        } else {
            j10 = j12;
            i7 = i11;
            j11 = j;
        }
        z10 = false;
        if (z10) {
        }
        b(l10, j, z8);
    }

    public final void h(L l10) {
        int i7 = l10.f70b & 67108863;
        s sVar = this.f4955a;
        long[] jArr = (long[]) sVar.f471b;
        int i10 = sVar.f470a;
        int i11 = 0;
        while (true) {
            if (i11 >= jArr.length - 2 || i11 >= i10) {
                break;
            }
            int i12 = i11 + 2;
            if ((((int) jArr[i12]) & 67108863) == i7) {
                jArr[i11] = -1;
                jArr[i11 + 1] = -1;
                jArr[i12] = 2305843009213693951L;
                break;
            }
            i11 += 3;
        }
        this.f4958d = true;
        this.f4960f = true;
    }
}
