package B4;

import N6.H;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Arrays;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.v;
import y7.u0;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: n, reason: collision with root package name */
    public j f2094n;

    /* renamed from: o, reason: collision with root package name */
    public int f2095o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2096p;

    /* renamed from: q, reason: collision with root package name */
    public W8.a f2097q;

    /* renamed from: r, reason: collision with root package name */
    public C1358d f2098r;

    @Override // B4.i
    public final void a(long j) {
        this.g = j;
        this.f2096p = j != 0;
        W8.a aVar = this.f2097q;
        this.f2095o = aVar != null ? aVar.f10851e : 0;
    }

    @Override // B4.i
    public final long b(v vVar) {
        byte b2 = vVar.f21229a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f2094n;
        AbstractC1705a.n(jVar);
        boolean z8 = ((N7.a[]) jVar.f2093f)[(b2 >> 1) & (255 >>> (8 - jVar.f2089b))].f7385a;
        W8.a aVar = (W8.a) jVar.f2090c;
        int i7 = !z8 ? aVar.f10851e : aVar.f10852f;
        long j = this.f2096p ? (this.f2095o + i7) / 4 : 0;
        byte[] bArr = vVar.f21229a;
        int length = bArr.length;
        int i10 = vVar.f21231c + 4;
        if (length < i10) {
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            vVar.E(copyOf.length, copyOf);
        } else {
            vVar.F(i10);
        }
        byte[] bArr2 = vVar.f21229a;
        int i11 = vVar.f21231c;
        bArr2[i11 - 4] = (byte) (j & 255);
        bArr2[i11 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j >>> 24) & 255);
        this.f2096p = true;
        this.f2095o = i7;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [N7.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, W8.a] */
    @Override // B4.i
    public final boolean c(v vVar, long j, q3.c cVar) {
        j jVar;
        W8.a aVar;
        W8.a aVar2;
        byte[] bArr;
        long j10;
        if (this.f2094n != null) {
            ((L) cVar.f23371b).getClass();
            return false;
        }
        W8.a aVar3 = this.f2097q;
        int i7 = 4;
        if (aVar3 == null) {
            u0.Q(1, vVar, false);
            vVar.n();
            int v10 = vVar.v();
            int n6 = vVar.n();
            int j11 = vVar.j();
            if (j11 <= 0) {
                j11 = -1;
            }
            int j12 = vVar.j();
            int i10 = j12 <= 0 ? -1 : j12;
            vVar.j();
            int v11 = vVar.v();
            int pow = (int) Math.pow(2.0d, v11 & 15);
            int pow2 = (int) Math.pow(2.0d, (v11 & 240) >> 4);
            vVar.v();
            byte[] copyOf = Arrays.copyOf(vVar.f21229a, vVar.f21231c);
            ?? obj = new Object();
            obj.f10847a = v10;
            obj.f10848b = n6;
            obj.f10849c = j11;
            obj.f10850d = i10;
            obj.f10851e = pow;
            obj.f10852f = pow2;
            obj.g = copyOf;
            this.f2097q = obj;
        } else {
            C1358d c1358d = this.f2098r;
            if (c1358d == null) {
                this.f2098r = u0.F(vVar, true, true);
            } else {
                int i11 = vVar.f21231c;
                byte[] bArr2 = new byte[i11];
                System.arraycopy(vVar.f21229a, 0, bArr2, 0, i11);
                int i12 = 5;
                u0.Q(5, vVar, false);
                int v12 = vVar.v() + 1;
                b5.f fVar = new b5.f(vVar.f21229a);
                fVar.s(vVar.f21230b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    int i15 = 16;
                    if (i13 >= v12) {
                        W8.a aVar4 = aVar3;
                        byte[] bArr3 = bArr2;
                        int i16 = 6;
                        int i17 = fVar.i(6) + 1;
                        for (int i18 = 0; i18 < i17; i18++) {
                            if (fVar.i(16) != 0) {
                                throw C1586o0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = fVar.i(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < i19) {
                                int i22 = fVar.i(i15);
                                if (i22 == 0) {
                                    int i23 = 8;
                                    fVar.s(8);
                                    fVar.s(16);
                                    fVar.s(16);
                                    fVar.s(6);
                                    fVar.s(8);
                                    int i24 = fVar.i(4) + 1;
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        fVar.s(i23);
                                        i25++;
                                        i23 = 8;
                                    }
                                } else {
                                    if (i22 != 1) {
                                        throw C1586o0.a("floor type greater than 1 not decodable: " + i22, null);
                                    }
                                    int i26 = fVar.i(5);
                                    int[] iArr = new int[i26];
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < i26; i28++) {
                                        int i29 = fVar.i(4);
                                        iArr[i28] = i29;
                                        if (i29 > i27) {
                                            i27 = i29;
                                        }
                                    }
                                    int i30 = i27 + 1;
                                    int[] iArr2 = new int[i30];
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        iArr2[i31] = fVar.i(i21) + 1;
                                        int i32 = fVar.i(i14);
                                        int i33 = 8;
                                        if (i32 > 0) {
                                            fVar.s(8);
                                        }
                                        int i34 = 0;
                                        while (i34 < (1 << i32)) {
                                            fVar.s(i33);
                                            i34++;
                                            i33 = 8;
                                        }
                                        i31++;
                                        i21 = 3;
                                        i14 = 2;
                                    }
                                    fVar.s(i14);
                                    int i35 = fVar.i(4);
                                    int i36 = 0;
                                    int i37 = 0;
                                    for (int i38 = 0; i38 < i26; i38++) {
                                        i36 += iArr2[iArr[i38]];
                                        while (i37 < i36) {
                                            fVar.s(i35);
                                            i37++;
                                        }
                                    }
                                }
                                i20++;
                                i16 = 6;
                                i15 = 16;
                                i14 = 2;
                            } else {
                                int i39 = fVar.i(i16) + 1;
                                int i40 = 0;
                                while (i40 < i39) {
                                    if (fVar.i(16) > 2) {
                                        throw C1586o0.a("residueType greater than 2 is not decodable", null);
                                    }
                                    fVar.s(24);
                                    fVar.s(24);
                                    fVar.s(24);
                                    int i41 = fVar.i(i16) + 1;
                                    int i42 = 8;
                                    fVar.s(8);
                                    int[] iArr3 = new int[i41];
                                    for (int i43 = 0; i43 < i41; i43++) {
                                        iArr3[i43] = ((fVar.h() ? fVar.i(5) : 0) * 8) + fVar.i(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < i41) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr3[i44] & (1 << i45)) != 0) {
                                                fVar.s(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i40++;
                                    i16 = 6;
                                }
                                int i46 = fVar.i(i16) + 1;
                                int i47 = 0;
                                while (i47 < i46) {
                                    int i48 = fVar.i(16);
                                    if (i48 != 0) {
                                        AbstractC1705a.t("VorbisUtil", "mapping type other than 0 not supported: " + i48);
                                        aVar = aVar4;
                                    } else {
                                        int i49 = fVar.h() ? fVar.i(4) + 1 : 1;
                                        boolean h10 = fVar.h();
                                        aVar = aVar4;
                                        int i50 = aVar.f10847a;
                                        if (h10) {
                                            int i51 = fVar.i(8) + 1;
                                            for (int i52 = 0; i52 < i51; i52++) {
                                                int i53 = i50 - 1;
                                                fVar.s(u0.w(i53));
                                                fVar.s(u0.w(i53));
                                            }
                                        }
                                        if (fVar.i(2) != 0) {
                                            throw C1586o0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i49 > 1) {
                                            for (int i54 = 0; i54 < i50; i54++) {
                                                fVar.s(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < i49; i55++) {
                                            fVar.s(8);
                                            fVar.s(8);
                                            fVar.s(8);
                                        }
                                    }
                                    i47++;
                                    aVar4 = aVar;
                                }
                                W8.a aVar5 = aVar4;
                                int i56 = fVar.i(6);
                                int i57 = i56 + 1;
                                N7.a[] aVarArr = new N7.a[i57];
                                for (int i58 = 0; i58 < i57; i58++) {
                                    boolean h11 = fVar.h();
                                    fVar.i(16);
                                    fVar.i(16);
                                    fVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f7385a = h11;
                                    aVarArr[i58] = obj2;
                                }
                                if (!fVar.h()) {
                                    throw C1586o0.a("framing bit after modes not set as expected", null);
                                }
                                jVar = new j(aVar5, c1358d, bArr3, aVarArr, u0.w(i56));
                            }
                        }
                    } else {
                        if (fVar.i(24) != 5653314) {
                            throw C1586o0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.f13955d * 8) + fVar.f13956e), null);
                        }
                        int i59 = fVar.i(16);
                        int i60 = fVar.i(24);
                        if (fVar.h()) {
                            fVar.s(i12);
                            for (int i61 = 0; i61 < i60; i61 += fVar.i(u0.w(i60 - i61))) {
                            }
                        } else {
                            boolean h12 = fVar.h();
                            for (int i62 = 0; i62 < i60; i62++) {
                                if (!h12) {
                                    fVar.s(i12);
                                } else if (fVar.h()) {
                                    fVar.s(i12);
                                }
                            }
                        }
                        int i63 = fVar.i(i7);
                        if (i63 > 2) {
                            throw C1586o0.a("lookup type greater than 2 not decodable: " + i63, null);
                        }
                        if (i63 == 1 || i63 == 2) {
                            fVar.s(32);
                            fVar.s(32);
                            int i64 = fVar.i(i7) + 1;
                            fVar.s(1);
                            if (i63 != 1) {
                                aVar2 = aVar3;
                                bArr = bArr2;
                                j10 = i60 * i59;
                            } else if (i59 != 0) {
                                aVar2 = aVar3;
                                bArr = bArr2;
                                j10 = (long) Math.floor(Math.pow(i60, 1.0d / i59));
                            } else {
                                aVar2 = aVar3;
                                bArr = bArr2;
                                j10 = 0;
                            }
                            fVar.s((int) (j10 * i64));
                        } else {
                            aVar2 = aVar3;
                            bArr = bArr2;
                        }
                        i13++;
                        aVar3 = aVar2;
                        bArr2 = bArr;
                        i7 = 4;
                        i12 = 5;
                    }
                }
            }
        }
        jVar = null;
        this.f2094n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        W8.a aVar6 = (W8.a) jVar.f2090c;
        arrayList.add((byte[]) aVar6.g);
        arrayList.add((byte[]) jVar.f2092e);
        F4.c D10 = u0.D(H.G((String[]) ((C1358d) jVar.f2091d).f18487b));
        K k = new K();
        k.k = "audio/vorbis";
        k.f19981f = aVar6.f10850d;
        k.g = aVar6.f10849c;
        k.f19996x = aVar6.f10847a;
        k.f19997y = aVar6.f10848b;
        k.f19985m = arrayList;
        k.f19983i = D10;
        cVar.f23371b = new L(k);
        return true;
    }

    @Override // B4.i
    public final void d(boolean z8) {
        super.d(z8);
        if (z8) {
            this.f2094n = null;
            this.f2097q = null;
            this.f2098r = null;
        }
        this.f2095o = 0;
        this.f2096p = false;
    }
}
