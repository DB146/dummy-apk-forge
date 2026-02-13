package A4;

import N6.H;
import N6.t0;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import o4.M;
import o5.C1806a;
import o5.C1807b;
import p4.C1848a;
import r4.C1936h;
import s4.C1988p;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f393a;

    static {
        int i7 = D.f21141a;
        f393a = "OpusHead".getBytes(M6.e.f6799c);
    }

    public static e a(int i7, n5.v vVar) {
        vVar.G(i7 + 12);
        vVar.H(1);
        b(vVar);
        vVar.H(2);
        int v10 = vVar.v();
        if ((v10 & 128) != 0) {
            vVar.H(2);
        }
        if ((v10 & 64) != 0) {
            vVar.H(vVar.v());
        }
        if ((v10 & 32) != 0) {
            vVar.H(2);
        }
        vVar.H(1);
        b(vVar);
        String e2 = n5.o.e(vVar.v());
        if ("audio/mpeg".equals(e2) || "audio/vnd.dts".equals(e2) || "audio/vnd.dts.hd".equals(e2)) {
            return new e(e2, null, -1L, -1L);
        }
        vVar.H(4);
        long w10 = vVar.w();
        long w11 = vVar.w();
        vVar.H(1);
        int b2 = b(vVar);
        byte[] bArr = new byte[b2];
        vVar.f(0, bArr, b2);
        return new e(e2, bArr, w11 > 0 ? w11 : -1L, w10 > 0 ? w10 : -1L);
    }

    public static int b(n5.v vVar) {
        int v10 = vVar.v();
        int i7 = v10 & 127;
        while ((v10 & 128) == 128) {
            v10 = vVar.v();
            i7 = (i7 << 7) | (v10 & 127);
        }
        return i7;
    }

    public static f c(n5.v vVar) {
        long j;
        vVar.G(8);
        if (c.F(vVar.h()) == 0) {
            j = vVar.w();
            vVar.H(4);
        } else {
            long p10 = vVar.p();
            vVar.H(8);
            j = p10;
        }
        return new f(new F4.c(new C1848a((j - 2082844800) * 1000)), 0, vVar.w());
    }

    public static Pair d(n5.v vVar, int i7, int i10) {
        Integer num;
        w wVar;
        Pair create;
        int i11;
        int i12;
        byte[] bArr;
        int i13 = vVar.f21230b;
        while (i13 - i7 < i10) {
            vVar.G(i13);
            int h10 = vVar.h();
            q3.f.g("childAtomSize must be positive", h10 > 0);
            if (vVar.h() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - i13 < h10) {
                    vVar.G(i14);
                    int h11 = vVar.h();
                    int h12 = vVar.h();
                    if (h12 == 1718775137) {
                        num2 = Integer.valueOf(vVar.h());
                    } else if (h12 == 1935894637) {
                        vVar.H(4);
                        str = vVar.t(4, M6.e.f6799c);
                    } else if (h12 == 1935894633) {
                        i16 = i14;
                        i15 = h11;
                    }
                    i14 += h11;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    q3.f.g("frma atom is mandatory", num2 != null);
                    q3.f.g("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num2;
                            wVar = null;
                            break;
                        }
                        vVar.G(i17);
                        int h13 = vVar.h();
                        if (vVar.h() == 1952804451) {
                            int F10 = c.F(vVar.h());
                            vVar.H(1);
                            if (F10 == 0) {
                                vVar.H(1);
                                i11 = 0;
                                i12 = 0;
                            } else {
                                int v10 = vVar.v();
                                int i18 = (v10 & 240) >> 4;
                                i11 = v10 & 15;
                                i12 = i18;
                            }
                            boolean z8 = vVar.v() == 1;
                            int v11 = vVar.v();
                            byte[] bArr2 = new byte[16];
                            vVar.f(0, bArr2, 16);
                            if (z8 && v11 == 0) {
                                int v12 = vVar.v();
                                byte[] bArr3 = new byte[v12];
                                vVar.f(0, bArr3, v12);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            wVar = new w(z8, str, v11, bArr2, i12, i11, bArr);
                        } else {
                            i17 += h13;
                        }
                    }
                    q3.f.g("tenc atom is mandatory", wVar != null);
                    int i19 = D.f21141a;
                    create = Pair.create(num, wVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += h10;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0434  */
    /* JADX WARN: Type inference failed for: r6v0, types: [A4.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y e(v vVar, a aVar, C1988p c1988p) {
        h hVar;
        boolean z8;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10;
        L l10;
        int i13;
        int[] iArr;
        long j;
        boolean z11;
        int i14;
        v vVar2;
        long[] jArr;
        int i15;
        int[] iArr2;
        long[] jArr2;
        int i16;
        int[] iArr3;
        long[] jArr3;
        int i17;
        int i18;
        int i19;
        int[] iArr4;
        int i20;
        long[] jArr4;
        long j10;
        int i21;
        int i22;
        long[] jArr5;
        int i23;
        long[] jArr6;
        int i24;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int i25;
        int i26;
        int i27;
        long[] jArr7;
        long[] jArr8;
        int[] iArr8;
        int i28;
        int i29;
        int i30;
        b H10 = aVar.H(1937011578);
        L l11 = vVar.f485f;
        if (H10 != null) {
            hVar = new h(H10, l11);
        } else {
            b H11 = aVar.H(1937013298);
            if (H11 == null) {
                throw C1586o0.a("Track has no sample table size information", null);
            }
            ?? obj = new Object();
            n5.v vVar3 = H11.f366c;
            obj.f392e = vVar3;
            vVar3.G(12);
            obj.f389b = vVar3.y() & 255;
            obj.f388a = vVar3.y();
            hVar = obj;
        }
        int c10 = hVar.c();
        if (c10 == 0) {
            return new y(vVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        b H12 = aVar.H(1937007471);
        if (H12 == null) {
            H12 = aVar.H(1668232756);
            H12.getClass();
            z8 = true;
        } else {
            z8 = false;
        }
        b H13 = aVar.H(1937011555);
        H13.getClass();
        b H14 = aVar.H(1937011827);
        H14.getClass();
        b H15 = aVar.H(1937011571);
        n5.v vVar4 = H15 != null ? H15.f366c : null;
        b H16 = aVar.H(1668576371);
        n5.v vVar5 = H16 != null ? H16.f366c : null;
        d dVar = new d(H13.f366c, H12.f366c, z8);
        n5.v vVar6 = H14.f366c;
        vVar6.G(12);
        int y10 = vVar6.y() - 1;
        int y11 = vVar6.y();
        int y12 = vVar6.y();
        if (vVar5 != null) {
            vVar5.G(12);
            i7 = vVar5.y();
        } else {
            i7 = 0;
        }
        if (vVar4 != null) {
            vVar4.G(12);
            i11 = vVar4.y();
            if (i11 > 0) {
                i10 = vVar4.y() - 1;
            } else {
                i10 = -1;
                vVar4 = null;
            }
        } else {
            i10 = -1;
            i11 = 0;
        }
        int a9 = hVar.a();
        String str = l11.f20096z;
        if (a9 == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && y10 == 0 && i7 == 0 && i11 == 0)) {
            i12 = i11;
            z10 = false;
        } else {
            i12 = i11;
            z10 = true;
        }
        if (z10) {
            int i31 = dVar.f369a;
            long[] jArr9 = new long[i31];
            int[] iArr9 = new int[i31];
            while (dVar.a()) {
                int i32 = dVar.f370b;
                jArr9[i32] = dVar.f372d;
                iArr9[i32] = dVar.f371c;
            }
            long j11 = y12;
            int i33 = 8192 / a9;
            int i34 = 0;
            for (int i35 = 0; i35 < i31; i35++) {
                i34 += D.f(iArr9[i35], i33);
            }
            long[] jArr10 = new long[i34];
            int[] iArr10 = new int[i34];
            long[] jArr11 = new long[i34];
            int[] iArr11 = new int[i34];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i37 < i31) {
                int i40 = iArr9[i37];
                long j12 = jArr9[i37];
                int i41 = i39;
                int i42 = i31;
                int i43 = i38;
                int i44 = i41;
                long[] jArr12 = jArr9;
                int i45 = i40;
                while (i45 > 0) {
                    int min = Math.min(i33, i45);
                    jArr10[i44] = j12;
                    int[] iArr12 = iArr9;
                    int i46 = a9 * min;
                    iArr10[i44] = i46;
                    i43 = Math.max(i43, i46);
                    jArr11[i44] = i36 * j11;
                    iArr11[i44] = 1;
                    j12 += iArr10[i44];
                    i36 += min;
                    i45 -= min;
                    i44++;
                    iArr9 = iArr12;
                    a9 = a9;
                }
                i37++;
                jArr9 = jArr12;
                int i47 = i44;
                i38 = i43;
                i31 = i42;
                i39 = i47;
            }
            long j13 = j11 * i36;
            i15 = c10;
            l10 = l11;
            jArr2 = jArr11;
            iArr3 = iArr11;
            jArr3 = jArr10;
            iArr2 = iArr10;
            i16 = i38;
            vVar2 = vVar;
            j = j13;
        } else {
            long[] jArr13 = new long[c10];
            int[] iArr13 = new int[c10];
            long[] jArr14 = new long[c10];
            int[] iArr14 = new int[c10];
            int i48 = i12;
            l10 = l11;
            int i49 = y10;
            int i50 = i10;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            long j14 = 0;
            int i54 = 0;
            int i55 = 0;
            long j15 = 0;
            while (true) {
                if (i51 >= c10) {
                    i13 = i53;
                    iArr = iArr13;
                    break;
                }
                boolean z12 = true;
                while (i53 == 0) {
                    z12 = dVar.a();
                    if (!z12) {
                        break;
                    }
                    j15 = dVar.f372d;
                    i53 = dVar.f371c;
                    c10 = c10;
                    i50 = i50;
                }
                int i56 = c10;
                int i57 = i50;
                if (!z12) {
                    AbstractC1705a.S("AtomParsers", "Unexpected end of chunk data");
                    jArr13 = Arrays.copyOf(jArr13, i51);
                    iArr = Arrays.copyOf(iArr13, i51);
                    jArr14 = Arrays.copyOf(jArr14, i51);
                    iArr14 = Arrays.copyOf(iArr14, i51);
                    c10 = i51;
                    i13 = i53;
                    break;
                }
                if (vVar5 != null) {
                    while (i55 == 0 && i7 > 0) {
                        i55 = vVar5.y();
                        i54 = vVar5.h();
                        i7--;
                    }
                    i55--;
                }
                int i58 = i54;
                jArr13[i51] = j15;
                int i59 = hVar.i();
                iArr13[i51] = i59;
                if (i59 > i52) {
                    i52 = i59;
                }
                int[] iArr15 = iArr13;
                jArr14[i51] = j14 + i58;
                iArr14[i51] = vVar4 == null ? 1 : 0;
                i50 = i57;
                if (i51 == i50) {
                    iArr14[i51] = 1;
                    i48--;
                    if (i48 > 0) {
                        vVar4.getClass();
                        i50 = vVar4.y() - 1;
                    }
                }
                long[] jArr15 = jArr13;
                j14 += y12;
                int i60 = y11 - 1;
                if (i60 != 0 || i49 <= 0) {
                    i17 = i60;
                    i18 = i49;
                } else {
                    i17 = vVar6.y();
                    i18 = i49 - 1;
                    y12 = vVar6.h();
                }
                int i61 = i17;
                j15 += iArr15[i51];
                i53--;
                i51++;
                jArr13 = jArr15;
                i54 = i58;
                iArr13 = iArr15;
                c10 = i56;
                int i62 = i18;
                y11 = i61;
                i49 = i62;
            }
            j = j14 + i54;
            if (vVar5 != null) {
                while (i7 > 0) {
                    if (vVar5.y() != 0) {
                        z11 = false;
                        break;
                    }
                    vVar5.h();
                    i7--;
                }
            }
            z11 = true;
            if (i48 == 0 && y11 == 0 && i13 == 0 && i49 == 0) {
                i14 = i55;
                if (i14 == 0 && z11) {
                    vVar2 = vVar;
                    jArr = jArr13;
                    i15 = c10;
                    iArr2 = iArr;
                    jArr2 = jArr14;
                    i16 = i52;
                    iArr3 = iArr14;
                    jArr3 = jArr;
                }
            } else {
                i14 = i55;
            }
            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
            vVar2 = vVar;
            jArr = jArr13;
            sb2.append(vVar2.f480a);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i48);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(y11);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i13);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i49);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i14);
            sb2.append(!z11 ? ", ctts invalid" : "");
            AbstractC1705a.S("AtomParsers", sb2.toString());
            i15 = c10;
            iArr2 = iArr;
            jArr2 = jArr14;
            i16 = i52;
            iArr3 = iArr14;
            jArr3 = jArr;
        }
        long T10 = D.T(j, 1000000L, vVar2.f482c);
        long j16 = vVar2.f482c;
        long[] jArr16 = vVar2.f486h;
        if (jArr16 == null) {
            D.U(jArr2, j16);
            return new y(vVar, jArr3, iArr2, i16, jArr2, iArr3, T10);
        }
        int length = jArr16.length;
        int i63 = vVar2.f481b;
        long[] jArr17 = vVar2.f487i;
        if (length == 1 && i63 == 1 && jArr2.length >= 2) {
            jArr17.getClass();
            long j17 = jArr17[0];
            jArr4 = jArr17;
            i20 = i63;
            long T11 = j17 + D.T(jArr16[0], vVar2.f482c, vVar2.f483d);
            int length2 = jArr2.length - 1;
            i19 = i15;
            int i64 = D.i(4, 0, length2);
            iArr4 = iArr3;
            int i65 = D.i(jArr2.length - 4, 0, length2);
            long j18 = jArr2[0];
            if (j18 <= j17 && j17 < jArr2[i64] && jArr2[i65] < T11 && T11 <= j) {
                L l12 = l10;
                long T12 = D.T(j17 - j18, l12.f20076N, vVar2.f482c);
                j10 = j;
                long T13 = D.T(j - T11, l12.f20076N, vVar2.f482c);
                if ((T12 != 0 || T13 != 0) && T12 <= 2147483647L && T13 <= 2147483647L) {
                    c1988p.f24078a = (int) T12;
                    c1988p.f24079b = (int) T13;
                    D.U(jArr2, j16);
                    return new y(vVar, jArr3, iArr2, i16, jArr2, iArr4, D.T(jArr16[0], 1000000L, vVar2.f483d));
                }
                if (jArr16.length != 1) {
                    i21 = 0;
                    if (jArr16[0] == 0) {
                        jArr4.getClass();
                        long j19 = jArr4[0];
                        for (int i66 = 0; i66 < jArr2.length; i66++) {
                            jArr2[i66] = D.T(jArr2[i66] - j19, 1000000L, vVar2.f482c);
                        }
                        return new y(vVar, jArr3, iArr2, i16, jArr2, iArr4, D.T(j10 - j19, 1000000L, vVar2.f482c));
                    }
                } else {
                    i21 = 0;
                }
                int i67 = i20;
                boolean z13 = i67 != 1 ? 1 : i21;
                int[] iArr16 = new int[jArr16.length];
                int[] iArr17 = new int[jArr16.length];
                jArr4.getClass();
                i22 = i21;
                int i68 = i22;
                int i69 = i68;
                int i70 = i69;
                while (i22 < jArr16.length) {
                    int i71 = i67;
                    long j20 = jArr4[i22];
                    if (j20 != -1) {
                        iArr8 = iArr2;
                        i28 = i16;
                        jArr7 = jArr16;
                        jArr8 = jArr3;
                        long T14 = D.T(jArr16[i22], vVar2.f482c, vVar2.f483d);
                        int i72 = 1;
                        iArr16[i22] = D.e(jArr2, j20, true);
                        iArr17[i22] = D.b(jArr2, j20 + T14, z13);
                        while (true) {
                            i29 = iArr16[i22];
                            i30 = iArr17[i22];
                            if (i29 >= i30 || (iArr4[i29] & i72) != 0) {
                                break;
                            }
                            iArr16[i22] = i29 + 1;
                            i72 = 1;
                        }
                        int i73 = (i30 - i29) + i69;
                        i68 |= i70 != i29 ? 1 : 0;
                        i70 = i30;
                        i69 = i73;
                    } else {
                        jArr7 = jArr16;
                        jArr8 = jArr3;
                        iArr8 = iArr2;
                        i28 = i16;
                    }
                    i22++;
                    iArr2 = iArr8;
                    i16 = i28;
                    jArr3 = jArr8;
                    jArr16 = jArr7;
                    i67 = i71;
                }
                jArr5 = jArr16;
                long[] jArr18 = jArr3;
                int[] iArr18 = iArr2;
                int i74 = i16;
                int i75 = i67;
                int i76 = i68 | (i69 == i19 ? 1 : 0);
                long[] jArr19 = i76 == 0 ? new long[i69] : jArr18;
                int[] iArr19 = i76 == 0 ? new int[i69] : iArr18;
                int i77 = i76 == 0 ? 0 : i74;
                int[] iArr20 = i76 == 0 ? new int[i69] : iArr4;
                long[] jArr20 = new long[i69];
                int[] iArr21 = iArr18;
                i23 = 0;
                int i78 = 0;
                long j21 = 0;
                while (i23 < jArr5.length) {
                    long j22 = jArr4[i23];
                    int i79 = iArr16[i23];
                    int[] iArr22 = iArr16;
                    int i80 = iArr17[i23];
                    if (i76 != 0) {
                        iArr5 = iArr17;
                        int i81 = i80 - i79;
                        i24 = i77;
                        System.arraycopy(jArr18, i79, jArr19, i78, i81);
                        iArr7 = iArr21;
                        System.arraycopy(iArr7, i79, iArr19, i78, i81);
                        jArr6 = jArr19;
                        iArr6 = iArr4;
                        System.arraycopy(iArr6, i79, iArr20, i78, i81);
                    } else {
                        jArr6 = jArr19;
                        i24 = i77;
                        iArr5 = iArr17;
                        iArr6 = iArr4;
                        iArr7 = iArr21;
                    }
                    int i82 = i24;
                    while (i79 < i80) {
                        int i83 = i23;
                        int[] iArr23 = iArr6;
                        long T15 = D.T(j21, 1000000L, vVar2.f483d);
                        long[] jArr21 = jArr2;
                        int[] iArr24 = iArr20;
                        long T16 = D.T(jArr2[i79] - j22, 1000000L, vVar2.f482c);
                        int i84 = i80;
                        int i85 = i75;
                        if (i85 != 1) {
                            i25 = i82;
                            T16 = Math.max(0L, T16);
                        } else {
                            i25 = i82;
                        }
                        jArr20[i78] = T15 + T16;
                        if (i76 != 0) {
                            i26 = i25;
                            if (iArr19[i78] > i26) {
                                i27 = iArr7[i79];
                                i78++;
                                i79++;
                                iArr6 = iArr23;
                                iArr20 = iArr24;
                                i82 = i27;
                                i75 = i85;
                                jArr2 = jArr21;
                                i80 = i84;
                                i23 = i83;
                                vVar2 = vVar;
                            }
                        } else {
                            i26 = i25;
                        }
                        i27 = i26;
                        i78++;
                        i79++;
                        iArr6 = iArr23;
                        iArr20 = iArr24;
                        i82 = i27;
                        i75 = i85;
                        jArr2 = jArr21;
                        i80 = i84;
                        i23 = i83;
                        vVar2 = vVar;
                    }
                    int i86 = i23;
                    iArr4 = iArr6;
                    int i87 = i82;
                    j21 += jArr5[i86];
                    i23 = i86 + 1;
                    iArr20 = iArr20;
                    iArr21 = iArr7;
                    iArr16 = iArr22;
                    jArr2 = jArr2;
                    iArr17 = iArr5;
                    vVar2 = vVar;
                    i77 = i87;
                    jArr19 = jArr6;
                }
                return new y(vVar, jArr19, iArr19, i77, jArr20, iArr20, D.T(j21, 1000000L, vVar.f483d));
            }
        } else {
            i19 = i15;
            iArr4 = iArr3;
            i20 = i63;
            jArr4 = jArr17;
        }
        j10 = j;
        if (jArr16.length != 1) {
        }
        int i672 = i20;
        if (i672 != 1) {
        }
        int[] iArr162 = new int[jArr16.length];
        int[] iArr172 = new int[jArr16.length];
        jArr4.getClass();
        i22 = i21;
        int i682 = i22;
        int i692 = i682;
        int i702 = i692;
        while (i22 < jArr16.length) {
        }
        jArr5 = jArr16;
        long[] jArr182 = jArr3;
        int[] iArr182 = iArr2;
        int i742 = i16;
        int i752 = i672;
        int i762 = i682 | (i692 == i19 ? 1 : 0);
        if (i762 == 0) {
        }
        if (i762 == 0) {
        }
        if (i762 == 0) {
        }
        if (i762 == 0) {
        }
        long[] jArr202 = new long[i692];
        int[] iArr212 = iArr182;
        i23 = 0;
        int i782 = 0;
        long j212 = 0;
        while (i23 < jArr5.length) {
        }
        return new y(vVar, jArr19, iArr19, i77, jArr202, iArr20, D.T(j212, 1000000L, vVar.f483d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r11 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r11 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0e82 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(a aVar, C1988p c1988p, long j, C1936h c1936h, boolean z8, boolean z10, M6.i iVar) {
        long j10;
        int i7;
        int i10;
        b H10;
        ArrayList arrayList;
        int i11;
        long[] jArr;
        long[] jArr2;
        v vVar;
        M6.i iVar2;
        Pair create;
        int i12;
        a aVar2;
        Pair pair;
        int i13;
        w[] wVarArr;
        int i14;
        int i15;
        C1936h c1936h2;
        String str;
        byte[] bArr;
        int i16;
        int i17;
        float f4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str2;
        byte[] bArr2;
        int i28;
        int i29;
        L l10;
        int i30;
        int h10;
        int i31;
        int i32;
        int i33;
        int i34;
        C1936h c1936h3;
        String str3;
        int i35;
        int i36;
        String str4;
        int i37;
        String str5;
        List list;
        int i38;
        int i39;
        List K10;
        int i40;
        String str6;
        long j11;
        t0 t0Var;
        a aVar3 = aVar;
        C1936h c1936h4 = c1936h;
        ArrayList arrayList2 = new ArrayList();
        int i41 = 0;
        while (true) {
            ArrayList arrayList3 = aVar3.f365e;
            if (i41 >= arrayList3.size()) {
                return arrayList2;
            }
            a aVar4 = (a) arrayList3.get(i41);
            if (aVar4.f368b != 1953653099) {
                i11 = i41;
            } else {
                b H11 = aVar3.H(1836476516);
                H11.getClass();
                a G9 = aVar4.G(1835297121);
                G9.getClass();
                b H12 = G9.H(1751411826);
                H12.getClass();
                n5.v vVar2 = H12.f366c;
                vVar2.G(16);
                int h11 = vVar2.h();
                int i42 = h11 == 1936684398 ? 1 : h11 == 1986618469 ? 2 : (h11 == 1952807028 || h11 == 1935832172 || h11 == 1937072756 || h11 == 1668047728) ? 3 : h11 == 1835365473 ? 5 : -1;
                if (i42 == -1) {
                    iVar2 = iVar;
                    arrayList = arrayList2;
                    i11 = i41;
                    vVar = null;
                } else {
                    b H13 = aVar4.H(1953196132);
                    H13.getClass();
                    n5.v vVar3 = H13.f366c;
                    vVar3.G(8);
                    int F10 = c.F(vVar3.h());
                    vVar3.H(F10 == 0 ? 8 : 16);
                    int h12 = vVar3.h();
                    vVar3.H(4);
                    int i43 = vVar3.f21230b;
                    int i44 = F10 == 0 ? 4 : 8;
                    int i45 = 0;
                    while (true) {
                        if (i45 >= i44) {
                            vVar3.H(i44);
                            break;
                        }
                        if (vVar3.f21229a[i43 + i45] != -1) {
                            j10 = F10 == 0 ? vVar3.w() : vVar3.z();
                        } else {
                            i45++;
                        }
                    }
                    vVar3.H(16);
                    int h13 = vVar3.h();
                    int h14 = vVar3.h();
                    vVar3.H(4);
                    int h15 = vVar3.h();
                    int h16 = vVar3.h();
                    if (h13 == 0 && h14 == 65536) {
                        i7 = -65536;
                        if (h15 == -65536 && h16 == 0) {
                            i10 = 90;
                            long j12 = j == -9223372036854775807L ? j10 : j;
                            long j13 = c(H11.f366c).f382b;
                            long T10 = j12 != -9223372036854775807L ? D.T(j12, 1000000L, j13) : -9223372036854775807L;
                            a G10 = G9.G(1835626086);
                            G10.getClass();
                            a G11 = G10.G(1937007212);
                            G11.getClass();
                            b H14 = G9.H(1835296868);
                            H14.getClass();
                            n5.v vVar4 = H14.f366c;
                            vVar4.G(8);
                            int F11 = c.F(vVar4.h());
                            vVar4.H(F11 == 0 ? 8 : 16);
                            long w10 = vVar4.w();
                            vVar4.H(F11 == 0 ? 4 : 8);
                            int A10 = vVar4.A();
                            Pair create2 = Pair.create(Long.valueOf(w10), "" + ((char) (((A10 >> 10) & 31) + 96)) + ((char) (((A10 >> 5) & 31) + 96)) + ((char) ((A10 & 31) + 96)));
                            H10 = G11.H(1937011556);
                            if (H10 == null) {
                                throw C1586o0.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            String str7 = (String) create2.second;
                            n5.v vVar5 = H10.f366c;
                            vVar5.G(12);
                            int h17 = vVar5.h();
                            w[] wVarArr2 = new w[h17];
                            int i46 = 0;
                            L l11 = null;
                            int i47 = 0;
                            int i48 = 0;
                            while (i46 < h17) {
                                int i49 = h17;
                                int i50 = vVar5.f21230b;
                                int i51 = i41;
                                int h18 = vVar5.h();
                                ArrayList arrayList4 = arrayList2;
                                long j14 = j13;
                                String str8 = "childAtomSize must be positive";
                                q3.f.g("childAtomSize must be positive", h18 > 0);
                                int h19 = vVar5.h();
                                if (h19 == 1635148593 || h19 == 1635148595 || h19 == 1701733238 || h19 == 1831958048 || h19 == 1836070006 || h19 == 1752589105 || h19 == 1751479857 || h19 == 1932670515 || h19 == 1211250227 || h19 == 1987063864 || h19 == 1987063865 || h19 == 1635135537 || h19 == 1685479798 || h19 == 1685479729 || h19 == 1685481573 || h19 == 1685481521) {
                                    i12 = i46;
                                    int i52 = i10;
                                    aVar2 = aVar4;
                                    pair = create2;
                                    i13 = i42;
                                    String str9 = "childAtomSize must be positive";
                                    wVarArr = wVarArr2;
                                    L l12 = l11;
                                    vVar5.G(i50 + 16);
                                    vVar5.H(16);
                                    int A11 = vVar5.A();
                                    int A12 = vVar5.A();
                                    vVar5.H(50);
                                    int i53 = vVar5.f21230b;
                                    if (h19 == 1701733238) {
                                        i14 = h18;
                                        i15 = i50;
                                        Pair d10 = d(vVar5, i15, i14);
                                        if (d10 != null) {
                                            h19 = ((Integer) d10.first).intValue();
                                            c1936h2 = c1936h == null ? null : c1936h.a(((w) d10.second).f489b);
                                            wVarArr[i12] = (w) d10.second;
                                        } else {
                                            c1936h2 = c1936h;
                                        }
                                        vVar5.G(i53);
                                    } else {
                                        i14 = h18;
                                        i15 = i50;
                                        c1936h2 = c1936h;
                                    }
                                    boolean z11 = false;
                                    int i54 = i53;
                                    str = str7;
                                    C1936h c1936h5 = c1936h2;
                                    String str10 = h19 == 1831958048 ? "video/mpeg" : h19 == 1211250227 ? "video/3gpp" : null;
                                    float f10 = 1.0f;
                                    int i55 = i48;
                                    byte[] bArr3 = null;
                                    int i56 = -1;
                                    int i57 = -1;
                                    String str11 = null;
                                    ByteBuffer byteBuffer = null;
                                    e eVar = null;
                                    int i58 = -1;
                                    List list2 = null;
                                    int i59 = -1;
                                    while (true) {
                                        if (i54 - i15 >= i14) {
                                            bArr = bArr3;
                                            i16 = A11;
                                            i17 = A12;
                                            f4 = f10;
                                            break;
                                        }
                                        vVar5.G(i54);
                                        int i60 = vVar5.f21230b;
                                        bArr = bArr3;
                                        int h20 = vVar5.h();
                                        f4 = f10;
                                        if (h20 == 0 && vVar5.f21230b - i15 == i14) {
                                            i16 = A11;
                                            i17 = A12;
                                            break;
                                        }
                                        q3.f.g(str9, h20 > 0);
                                        int h21 = vVar5.h();
                                        String str12 = str9;
                                        if (h21 == 1635148611) {
                                            q3.f.g(null, str10 == null);
                                            vVar5.G(i60 + 8);
                                            C1806a a9 = C1806a.a(vVar5);
                                            float f11 = !z11 ? a9.f21933h : f4;
                                            ArrayList arrayList5 = a9.f21927a;
                                            int i61 = a9.f21928b;
                                            String str13 = a9.f21934i;
                                            int i62 = a9.f21931e;
                                            float f12 = f11;
                                            int i63 = a9.f21932f;
                                            i56 = a9.g;
                                            i22 = A11;
                                            i23 = h19;
                                            i24 = A12;
                                            list2 = arrayList5;
                                            i55 = i61;
                                            i25 = i15;
                                            i26 = i14;
                                            i27 = h12;
                                            i58 = i63;
                                            f10 = f12;
                                            str10 = "video/avc";
                                            i57 = i62;
                                            str11 = str13;
                                        } else if (h21 == 1752589123) {
                                            q3.f.g(null, str10 == null);
                                            vVar5.G(i60 + 8);
                                            o5.e a10 = o5.e.a(vVar5);
                                            float f13 = !z11 ? a10.f21963f : f4;
                                            int i64 = a10.f21959b;
                                            List list3 = a10.f21958a;
                                            String str14 = a10.g;
                                            int i65 = a10.f21960c;
                                            float f14 = f13;
                                            int i66 = a10.f21961d;
                                            i56 = a10.f21962e;
                                            i22 = A11;
                                            i23 = h19;
                                            i24 = A12;
                                            i55 = i64;
                                            i25 = i15;
                                            i26 = i14;
                                            list2 = list3;
                                            i27 = h12;
                                            i57 = i65;
                                            str11 = str14;
                                            str10 = "video/hevc";
                                            i58 = i66;
                                            f10 = f14;
                                        } else if (h21 == 1685480259 || h21 == 1685485123) {
                                            i22 = A11;
                                            i23 = h19;
                                            i24 = A12;
                                            i25 = i15;
                                            i26 = i14;
                                            i27 = h12;
                                            String str15 = str11;
                                            D9.a a11 = D9.a.a(vVar5);
                                            if (a11 != null) {
                                                str11 = a11.f3289a;
                                                str10 = "video/dolby-vision";
                                            } else {
                                                str11 = str15;
                                            }
                                            f10 = f4;
                                        } else if (h21 == 1987076931) {
                                            q3.f.g(null, str10 == null);
                                            String str16 = h19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            vVar5.G(i60 + 12);
                                            vVar5.H(2);
                                            boolean z12 = (vVar5.v() & 1) != 0;
                                            int v10 = vVar5.v();
                                            int v11 = vVar5.v();
                                            int b2 = C1807b.b(v10);
                                            i22 = A11;
                                            i23 = h19;
                                            i24 = A12;
                                            str10 = str16;
                                            i58 = z12 ? 1 : 2;
                                            i25 = i15;
                                            i26 = i14;
                                            i56 = C1807b.c(v11);
                                            i27 = h12;
                                            f10 = f4;
                                            i57 = b2;
                                        } else {
                                            if (h21 == 1635135811) {
                                                q3.f.g(null, str10 == null);
                                                i22 = A11;
                                                i23 = h19;
                                                i24 = A12;
                                                str10 = "video/av01";
                                            } else if (h21 == 1668050025) {
                                                if (byteBuffer == null) {
                                                    byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer2 = byteBuffer;
                                                byteBuffer2.position(21);
                                                byteBuffer2.putShort(vVar5.s());
                                                byteBuffer2.putShort(vVar5.s());
                                                i22 = A11;
                                                i23 = h19;
                                                i24 = A12;
                                                byteBuffer = byteBuffer2;
                                            } else {
                                                if (h21 == 1835295606) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                    short s3 = vVar5.s();
                                                    short s10 = vVar5.s();
                                                    i23 = h19;
                                                    short s11 = vVar5.s();
                                                    i25 = i15;
                                                    short s12 = vVar5.s();
                                                    i26 = i14;
                                                    short s13 = vVar5.s();
                                                    i24 = A12;
                                                    short s14 = vVar5.s();
                                                    i22 = A11;
                                                    short s15 = vVar5.s();
                                                    str2 = str11;
                                                    short s16 = vVar5.s();
                                                    long w11 = vVar5.w();
                                                    long w12 = vVar5.w();
                                                    i27 = h12;
                                                    byteBuffer3.position(1);
                                                    byteBuffer3.putShort(s13);
                                                    byteBuffer3.putShort(s14);
                                                    byteBuffer3.putShort(s3);
                                                    byteBuffer3.putShort(s10);
                                                    byteBuffer3.putShort(s11);
                                                    byteBuffer3.putShort(s12);
                                                    byteBuffer3.putShort(s15);
                                                    byteBuffer3.putShort(s16);
                                                    byteBuffer3.putShort((short) (w11 / 10000));
                                                    byteBuffer3.putShort((short) (w12 / 10000));
                                                    byteBuffer = byteBuffer3;
                                                } else {
                                                    i22 = A11;
                                                    i23 = h19;
                                                    i24 = A12;
                                                    i25 = i15;
                                                    i26 = i14;
                                                    i27 = h12;
                                                    str2 = str11;
                                                    if (h21 == 1681012275) {
                                                        q3.f.g(null, str10 == null);
                                                        str10 = "video/3gpp";
                                                    } else {
                                                        if (h21 == 1702061171) {
                                                            q3.f.g(null, str10 == null);
                                                            e a12 = a(i60, vVar5);
                                                            byte[] bArr4 = (byte[]) a12.f380d;
                                                            List K11 = bArr4 != null ? H.K(bArr4) : list2;
                                                            eVar = a12;
                                                            str10 = (String) a12.f379c;
                                                            list2 = K11;
                                                        } else if (h21 == 1885434736) {
                                                            vVar5.G(i60 + 8);
                                                            f10 = vVar5.y() / vVar5.y();
                                                            str11 = str2;
                                                            z11 = true;
                                                        } else if (h21 == 1937126244) {
                                                            int i67 = i60 + 8;
                                                            while (true) {
                                                                if (i67 - i60 >= h20) {
                                                                    bArr2 = null;
                                                                    break;
                                                                }
                                                                vVar5.G(i67);
                                                                int h22 = vVar5.h();
                                                                if (vVar5.h() == 1886547818) {
                                                                    bArr2 = Arrays.copyOfRange(vVar5.f21229a, i67, h22 + i67);
                                                                    break;
                                                                }
                                                                i67 += h22;
                                                            }
                                                            bArr = bArr2;
                                                        } else {
                                                            if (h21 == 1936995172) {
                                                                int v12 = vVar5.v();
                                                                vVar5.H(3);
                                                                if (v12 == 0) {
                                                                    int v13 = vVar5.v();
                                                                    if (v13 == 0) {
                                                                        i59 = 0;
                                                                    } else if (v13 == 1) {
                                                                        i59 = 1;
                                                                    } else if (v13 == 2) {
                                                                        i59 = 2;
                                                                    } else if (v13 == 3) {
                                                                        i59 = 3;
                                                                    }
                                                                }
                                                            } else if (h21 == 1668246642 && i57 == -1 && i56 == -1) {
                                                                int h23 = vVar5.h();
                                                                if (h23 == 1852009592 || h23 == 1852009571) {
                                                                    int A13 = vVar5.A();
                                                                    int A14 = vVar5.A();
                                                                    vVar5.H(2);
                                                                    boolean z13 = h20 == 19 && (vVar5.v() & 128) != 0;
                                                                    int b10 = C1807b.b(A13);
                                                                    int i68 = z13 ? 1 : 2;
                                                                    i56 = C1807b.c(A14);
                                                                    i57 = b10;
                                                                    i58 = i68;
                                                                } else {
                                                                    AbstractC1705a.S("AtomParsers", "Unsupported color type: " + c.g(h23));
                                                                }
                                                            }
                                                            f10 = f4;
                                                            str11 = str2;
                                                        }
                                                        f10 = f4;
                                                        str11 = str2;
                                                    }
                                                }
                                                f10 = f4;
                                                str11 = str2;
                                            }
                                            i25 = i15;
                                            i26 = i14;
                                            i27 = h12;
                                            f10 = f4;
                                        }
                                        i54 += h20;
                                        bArr3 = bArr;
                                        str9 = str12;
                                        h19 = i23;
                                        i15 = i25;
                                        i14 = i26;
                                        A12 = i24;
                                        A11 = i22;
                                        h12 = i27;
                                    }
                                    i18 = i15;
                                    i19 = i14;
                                    i20 = h12;
                                    String str17 = str11;
                                    if (str10 == null) {
                                        l11 = l12;
                                        i21 = i52;
                                    } else {
                                        K k = new K();
                                        k.f19976a = Integer.toString(i20);
                                        k.k = str10;
                                        k.f19982h = str17;
                                        k.f19988p = i16;
                                        k.f19989q = i17;
                                        k.f19992t = f4;
                                        i21 = i52;
                                        k.f19991s = i21;
                                        k.f19993u = bArr;
                                        k.f19994v = i59;
                                        k.f19985m = list2;
                                        k.f19986n = c1936h5;
                                        int i69 = i58;
                                        if (i57 != -1 || i69 != -1 || i56 != -1 || byteBuffer != null) {
                                            k.f19995w = new C1807b(i57, byteBuffer != null ? byteBuffer.array() : null, i69, i56);
                                        }
                                        if (eVar != null) {
                                            e eVar2 = eVar;
                                            k.f19981f = h3.H.C(eVar2.f377a);
                                            k.g = h3.H.C(eVar2.f378b);
                                        }
                                        l11 = new L(k);
                                    }
                                    i48 = i55;
                                } else {
                                    i13 = i42;
                                    if (h19 == 1836069985 || h19 == 1701733217 || h19 == 1633889587 || h19 == 1700998451 || h19 == 1633889588 || h19 == 1835823201 || h19 == 1685353315 || h19 == 1685353317 || h19 == 1685353320 || h19 == 1685353324 || h19 == 1685353336 || h19 == 1935764850 || h19 == 1935767394 || h19 == 1819304813 || h19 == 1936684916 || h19 == 1953984371 || h19 == 778924082 || h19 == 778924083 || h19 == 1835557169 || h19 == 1835560241 || h19 == 1634492771 || h19 == 1634492791 || h19 == 1970037111 || h19 == 1332770163 || h19 == 1716281667) {
                                        pair = create2;
                                        vVar5.G(i50 + 16);
                                        if (z10) {
                                            i28 = vVar5.A();
                                            vVar5.H(6);
                                        } else {
                                            vVar5.H(8);
                                            i28 = 0;
                                        }
                                        if (i28 == 0 || i28 == 1) {
                                            i29 = i50;
                                            int A15 = vVar5.A();
                                            vVar5.H(6);
                                            byte[] bArr5 = vVar5.f21229a;
                                            int i70 = vVar5.f21230b;
                                            l10 = l11;
                                            int i71 = i70 + 1;
                                            vVar5.f21230b = i71;
                                            aVar2 = aVar4;
                                            int i72 = (bArr5[i70] & 255) << 8;
                                            i30 = i10;
                                            vVar5.f21230b = i70 + 2;
                                            int i73 = (bArr5[i71] & 255) | i72;
                                            vVar5.f21230b = i70 + 4;
                                            vVar5.G(i70);
                                            h10 = vVar5.h();
                                            if (i28 == 1) {
                                                vVar5.H(16);
                                            }
                                            i31 = i73;
                                            i32 = A15;
                                        } else if (i28 == 2) {
                                            vVar5.H(16);
                                            i29 = i50;
                                            i31 = (int) Math.round(Double.longBitsToDouble(vVar5.p()));
                                            i32 = vVar5.y();
                                            vVar5.H(20);
                                            i30 = i10;
                                            aVar2 = aVar4;
                                            l10 = l11;
                                            h10 = 0;
                                        } else {
                                            i12 = i46;
                                            i30 = i10;
                                            i34 = h18;
                                            aVar2 = aVar4;
                                            i33 = i50;
                                            wVarArr = wVarArr2;
                                            str = str7;
                                            i20 = h12;
                                            i19 = i34;
                                            i18 = i33;
                                            i21 = i30;
                                        }
                                        int i74 = vVar5.f21230b;
                                        if (h19 == 1701733217) {
                                            Pair d11 = d(vVar5, i29, h18);
                                            if (d11 != null) {
                                                h19 = ((Integer) d11.first).intValue();
                                                c1936h3 = c1936h4 == null ? null : c1936h4.a(((w) d11.second).f489b);
                                                wVarArr2[i46] = (w) d11.second;
                                            } else {
                                                c1936h3 = c1936h4;
                                            }
                                            vVar5.G(i74);
                                        } else {
                                            c1936h3 = c1936h4;
                                        }
                                        String str18 = "audio/ac3";
                                        int i75 = i31;
                                        if (h19 == 1633889587) {
                                            str3 = "audio/ac3";
                                        } else if (h19 == 1700998451) {
                                            str3 = "audio/eac3";
                                        } else if (h19 == 1633889588) {
                                            str3 = "audio/ac4";
                                        } else if (h19 == 1685353315) {
                                            str3 = "audio/vnd.dts";
                                        } else if (h19 == 1685353320 || h19 == 1685353324) {
                                            str3 = "audio/vnd.dts.hd";
                                        } else if (h19 == 1685353317) {
                                            str3 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (h19 == 1685353336) {
                                            str3 = "audio/vnd.dts.uhd;profile=p2";
                                        } else if (h19 == 1935764850) {
                                            str3 = "audio/3gpp";
                                        } else if (h19 == 1935767394) {
                                            str3 = "audio/amr-wb";
                                        } else {
                                            if (h19 == 1819304813 || h19 == 1936684916) {
                                                str3 = "audio/raw";
                                                i35 = 2;
                                            } else if (h19 == 1953984371) {
                                                i35 = 268435456;
                                                str3 = "audio/raw";
                                            } else {
                                                str3 = (h19 == 778924082 || h19 == 778924083) ? "audio/mpeg" : h19 == 1835557169 ? "audio/mha1" : h19 == 1835560241 ? "audio/mhm1" : h19 == 1634492771 ? "audio/alac" : h19 == 1634492791 ? "audio/g711-alaw" : h19 == 1970037111 ? "audio/g711-mlaw" : h19 == 1332770163 ? "audio/opus" : h19 == 1716281667 ? "audio/flac" : h19 == 1835823201 ? "audio/true-hd" : null;
                                            }
                                            i12 = i46;
                                            int i76 = i35;
                                            int i77 = i32;
                                            wVarArr = wVarArr2;
                                            i36 = i74;
                                            int i78 = i75;
                                            String str19 = null;
                                            List list4 = null;
                                            e eVar3 = null;
                                            while (i36 - i29 < h18) {
                                                vVar5.G(i36);
                                                int h24 = vVar5.h();
                                                int i79 = h18;
                                                q3.f.g(str8, h24 > 0);
                                                int h25 = vVar5.h();
                                                int i80 = i29;
                                                if (h25 == 1835557187) {
                                                    int i81 = h24 - 13;
                                                    byte[] bArr6 = new byte[i81];
                                                    vVar5.G(i36 + 13);
                                                    vVar5.f(0, bArr6, i81);
                                                    str4 = str18;
                                                    list4 = H.K(bArr6);
                                                    str5 = str8;
                                                    str19 = str19;
                                                } else {
                                                    String str20 = str19;
                                                    if (h25 == 1702061171 || (z10 && h25 == 2002876005)) {
                                                        str4 = str18;
                                                        String str21 = str8;
                                                        int i82 = i77;
                                                        if (h25 != 1702061171) {
                                                            i37 = vVar5.f21230b;
                                                            q3.f.g(null, i37 >= i36);
                                                            while (true) {
                                                                if (i37 - i36 >= h24) {
                                                                    str5 = str21;
                                                                    i37 = -1;
                                                                    break;
                                                                }
                                                                vVar5.G(i37);
                                                                int h26 = vVar5.h();
                                                                str5 = str21;
                                                                q3.f.g(str5, h26 > 0);
                                                                if (vVar5.h() == 1702061171) {
                                                                    break;
                                                                }
                                                                i37 += h26;
                                                                str21 = str5;
                                                            }
                                                        } else {
                                                            i37 = i36;
                                                            str5 = str21;
                                                        }
                                                        if (i37 != -1) {
                                                            e a13 = a(i37, vVar5);
                                                            str3 = (String) a13.f379c;
                                                            byte[] bArr7 = (byte[]) a13.f380d;
                                                            if (bArr7 != null) {
                                                                if ("audio/mp4a-latm".equals(str3)) {
                                                                    M k7 = AbstractC1787a.k(new b5.f(bArr7, bArr7.length), false);
                                                                    int i83 = k7.f21766a;
                                                                    int i84 = k7.f21767b;
                                                                    str19 = (String) k7.f21768c;
                                                                    i78 = i83;
                                                                    i82 = i84;
                                                                } else {
                                                                    str19 = str20;
                                                                }
                                                                eVar3 = a13;
                                                                list = H.K(bArr7);
                                                                list4 = list;
                                                                i77 = i82;
                                                                i36 += h24;
                                                                str8 = str5;
                                                                h18 = i79;
                                                                i29 = i80;
                                                                str18 = str4;
                                                            } else {
                                                                eVar3 = a13;
                                                            }
                                                        }
                                                        list = list4;
                                                        str19 = str20;
                                                        list4 = list;
                                                        i77 = i82;
                                                        i36 += h24;
                                                        str8 = str5;
                                                        h18 = i79;
                                                        i29 = i80;
                                                        str18 = str4;
                                                    } else {
                                                        int[] iArr = AbstractC1787a.f21821f;
                                                        int[] iArr2 = AbstractC1787a.f21819d;
                                                        String str22 = str8;
                                                        if (h25 == 1684103987) {
                                                            vVar5.G(i36 + 8);
                                                            String num = Integer.toString(h12);
                                                            b5.f fVar = new b5.f();
                                                            fVar.o(vVar5);
                                                            int i85 = i78;
                                                            int i86 = iArr2[fVar.i(2)];
                                                            fVar.s(8);
                                                            int i87 = iArr[fVar.i(3)];
                                                            if (fVar.i(1) != 0) {
                                                                i87++;
                                                            }
                                                            int i88 = AbstractC1787a.g[fVar.i(5)] * 1000;
                                                            fVar.c();
                                                            vVar5.G(fVar.f());
                                                            K k10 = new K();
                                                            k10.f19976a = num;
                                                            k10.k = str18;
                                                            k10.f19996x = i87;
                                                            k10.f19997y = i86;
                                                            k10.f19986n = c1936h3;
                                                            k10.f19978c = str7;
                                                            k10.f19981f = i88;
                                                            k10.g = i88;
                                                            l10 = new L(k10);
                                                            i38 = i77;
                                                            str4 = str18;
                                                            i39 = i85;
                                                        } else {
                                                            int i89 = i78;
                                                            if (h25 == 1684366131) {
                                                                vVar5.G(i36 + 8);
                                                                String num2 = Integer.toString(h12);
                                                                b5.f fVar2 = new b5.f();
                                                                fVar2.o(vVar5);
                                                                int i90 = fVar2.i(13) * 1000;
                                                                str4 = str18;
                                                                fVar2.s(3);
                                                                int i91 = iArr2[fVar2.i(2)];
                                                                fVar2.s(10);
                                                                int i92 = iArr[fVar2.i(3)];
                                                                if (fVar2.i(1) != 0) {
                                                                    i92++;
                                                                }
                                                                fVar2.s(3);
                                                                int i93 = fVar2.i(4);
                                                                fVar2.s(1);
                                                                if (i93 > 0) {
                                                                    i40 = i77;
                                                                    fVar2.s(6);
                                                                    if (fVar2.i(1) != 0) {
                                                                        i92 += 2;
                                                                    }
                                                                    fVar2.s(1);
                                                                } else {
                                                                    i40 = i77;
                                                                }
                                                                if (fVar2.b() > 7) {
                                                                    fVar2.s(7);
                                                                    if (fVar2.i(1) != 0) {
                                                                        str6 = "audio/eac3-joc";
                                                                        fVar2.c();
                                                                        vVar5.G(fVar2.f());
                                                                        K k11 = new K();
                                                                        k11.f19976a = num2;
                                                                        k11.k = str6;
                                                                        k11.f19996x = i92;
                                                                        k11.f19997y = i91;
                                                                        k11.f19986n = c1936h3;
                                                                        k11.f19978c = str7;
                                                                        k11.g = i90;
                                                                        l10 = new L(k11);
                                                                        i39 = i89;
                                                                        i38 = i40;
                                                                    }
                                                                }
                                                                str6 = "audio/eac3";
                                                                fVar2.c();
                                                                vVar5.G(fVar2.f());
                                                                K k112 = new K();
                                                                k112.f19976a = num2;
                                                                k112.k = str6;
                                                                k112.f19996x = i92;
                                                                k112.f19997y = i91;
                                                                k112.f19986n = c1936h3;
                                                                k112.f19978c = str7;
                                                                k112.g = i90;
                                                                l10 = new L(k112);
                                                                i39 = i89;
                                                                i38 = i40;
                                                            } else {
                                                                int i94 = i77;
                                                                str4 = str18;
                                                                if (h25 == 1684103988) {
                                                                    vVar5.G(i36 + 8);
                                                                    String num3 = Integer.toString(h12);
                                                                    vVar5.H(1);
                                                                    int i95 = ((vVar5.v() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                    K k12 = new K();
                                                                    k12.f19976a = num3;
                                                                    k12.k = "audio/ac4";
                                                                    k12.f19996x = 2;
                                                                    k12.f19997y = i95;
                                                                    k12.f19986n = c1936h3;
                                                                    k12.f19978c = str7;
                                                                    l10 = new L(k12);
                                                                    i39 = i89;
                                                                    i38 = i94;
                                                                    i78 = i39;
                                                                    i77 = i38;
                                                                    str19 = str20;
                                                                    str5 = str22;
                                                                } else if (h25 != 1684892784) {
                                                                    if (h25 == 1684305011 || h25 == 1969517683) {
                                                                        K k13 = new K();
                                                                        k13.f19976a = Integer.toString(h12);
                                                                        k13.k = str3;
                                                                        i38 = i94;
                                                                        k13.f19996x = i38;
                                                                        i39 = i89;
                                                                        k13.f19997y = i39;
                                                                        k13.f19986n = c1936h3;
                                                                        k13.f19978c = str7;
                                                                        l10 = new L(k13);
                                                                    } else {
                                                                        if (h25 == 1682927731) {
                                                                            int i96 = h24 - 8;
                                                                            byte[] bArr8 = f393a;
                                                                            byte[] copyOf = Arrays.copyOf(bArr8, bArr8.length + i96);
                                                                            vVar5.G(i36 + 8);
                                                                            vVar5.f(bArr8.length, copyOf, i96);
                                                                            K10 = AbstractC1787a.c(copyOf);
                                                                        } else if (h25 == 1684425825) {
                                                                            byte[] bArr9 = new byte[h24 - 8];
                                                                            bArr9[0] = 102;
                                                                            bArr9[1] = 76;
                                                                            bArr9[2] = 97;
                                                                            bArr9[3] = 67;
                                                                            vVar5.G(i36 + 12);
                                                                            vVar5.f(4, bArr9, h24 - 12);
                                                                            K10 = H.K(bArr9);
                                                                        } else if (h25 == 1634492771) {
                                                                            int i97 = h24 - 12;
                                                                            byte[] bArr10 = new byte[i97];
                                                                            vVar5.G(i36 + 12);
                                                                            vVar5.f(0, bArr10, i97);
                                                                            n5.v vVar6 = new n5.v(bArr10);
                                                                            vVar6.G(9);
                                                                            int v14 = vVar6.v();
                                                                            vVar6.G(20);
                                                                            Pair create3 = Pair.create(Integer.valueOf(vVar6.y()), Integer.valueOf(v14));
                                                                            int intValue = ((Integer) create3.first).intValue();
                                                                            i77 = ((Integer) create3.second).intValue();
                                                                            list4 = H.K(bArr10);
                                                                            i78 = intValue;
                                                                            str19 = str20;
                                                                            str5 = str22;
                                                                        } else {
                                                                            i39 = i89;
                                                                            i38 = i94;
                                                                        }
                                                                        list4 = K10;
                                                                        str19 = str20;
                                                                        str5 = str22;
                                                                        i78 = i89;
                                                                        i77 = i94;
                                                                    }
                                                                    i78 = i39;
                                                                    i77 = i38;
                                                                    str19 = str20;
                                                                    str5 = str22;
                                                                } else {
                                                                    if (h10 <= 0) {
                                                                        throw C1586o0.a("Invalid sample rate for Dolby TrueHD MLP stream: " + h10, null);
                                                                    }
                                                                    i78 = h10;
                                                                    str19 = str20;
                                                                    str5 = str22;
                                                                    i77 = 2;
                                                                }
                                                            }
                                                        }
                                                        i78 = i39;
                                                        i77 = i38;
                                                        str19 = str20;
                                                        str5 = str22;
                                                    }
                                                }
                                                i36 += h24;
                                                str8 = str5;
                                                h18 = i79;
                                                i29 = i80;
                                                str18 = str4;
                                            }
                                            int i98 = i77;
                                            i34 = h18;
                                            i33 = i29;
                                            String str23 = str19;
                                            if (l10 == null || str3 == null) {
                                                l11 = l10;
                                            } else {
                                                K k14 = new K();
                                                k14.f19976a = Integer.toString(h12);
                                                k14.k = str3;
                                                k14.f19982h = str23;
                                                k14.f19996x = i98;
                                                k14.f19997y = i78;
                                                k14.f19998z = i76;
                                                k14.f19985m = list4;
                                                k14.f19986n = c1936h3;
                                                k14.f19978c = str7;
                                                e eVar4 = eVar3;
                                                if (eVar4 != null) {
                                                    k14.f19981f = h3.H.C(eVar4.f377a);
                                                    k14.g = h3.H.C(eVar4.f378b);
                                                }
                                                l11 = new L(k14);
                                            }
                                            str = str7;
                                            i20 = h12;
                                            i19 = i34;
                                            i18 = i33;
                                            i21 = i30;
                                        }
                                        i35 = -1;
                                        i12 = i46;
                                        int i762 = i35;
                                        int i772 = i32;
                                        wVarArr = wVarArr2;
                                        i36 = i74;
                                        int i782 = i75;
                                        String str192 = null;
                                        List list42 = null;
                                        e eVar32 = null;
                                        while (i36 - i29 < h18) {
                                        }
                                        int i982 = i772;
                                        i34 = h18;
                                        i33 = i29;
                                        String str232 = str192;
                                        if (l10 == null) {
                                        }
                                        l11 = l10;
                                        str = str7;
                                        i20 = h12;
                                        i19 = i34;
                                        i18 = i33;
                                        i21 = i30;
                                    } else {
                                        if (h19 == 1414810956 || h19 == 1954034535 || h19 == 2004251764 || h19 == 1937010800 || h19 == 1664495672) {
                                            vVar5.G(i50 + 16);
                                            String str24 = "application/ttml+xml";
                                            if (h19 != 1414810956) {
                                                if (h19 == 1954034535) {
                                                    int i99 = h18 - 16;
                                                    byte[] bArr11 = new byte[i99];
                                                    vVar5.f(0, bArr11, i99);
                                                    t0Var = H.K(bArr11);
                                                    str24 = "application/x-quicktime-tx3g";
                                                    j11 = Long.MAX_VALUE;
                                                } else if (h19 == 2004251764) {
                                                    str24 = "application/x-mp4-vtt";
                                                } else if (h19 == 1937010800) {
                                                    j11 = 0;
                                                    t0Var = null;
                                                } else {
                                                    if (h19 != 1664495672) {
                                                        throw new IllegalStateException();
                                                    }
                                                    str24 = "application/x-mp4-cea-608";
                                                    j11 = Long.MAX_VALUE;
                                                    t0Var = null;
                                                    i47 = 1;
                                                }
                                                K k15 = new K();
                                                pair = create2;
                                                k15.f19976a = Integer.toString(h12);
                                                k15.k = str24;
                                                k15.f19978c = str7;
                                                k15.f19987o = j11;
                                                k15.f19985m = t0Var;
                                                i12 = i46;
                                                l11 = new L(k15);
                                                i21 = i10;
                                                i19 = h18;
                                                aVar2 = aVar4;
                                            }
                                            j11 = Long.MAX_VALUE;
                                            t0Var = null;
                                            K k152 = new K();
                                            pair = create2;
                                            k152.f19976a = Integer.toString(h12);
                                            k152.k = str24;
                                            k152.f19978c = str7;
                                            k152.f19987o = j11;
                                            k152.f19985m = t0Var;
                                            i12 = i46;
                                            l11 = new L(k152);
                                            i21 = i10;
                                            i19 = h18;
                                            aVar2 = aVar4;
                                        } else {
                                            if (h19 == 1835365492) {
                                                vVar5.G(i50 + 16);
                                                if (h19 == 1835365492) {
                                                    vVar5.q();
                                                    String q10 = vVar5.q();
                                                    if (q10 != null) {
                                                        K k16 = new K();
                                                        k16.f19976a = Integer.toString(h12);
                                                        k16.k = q10;
                                                        l11 = new L(k16);
                                                    }
                                                }
                                            } else if (h19 == 1667329389) {
                                                K k17 = new K();
                                                k17.f19976a = Integer.toString(h12);
                                                k17.k = "application/x-camera-motion";
                                                l11 = new L(k17);
                                            }
                                            i12 = i46;
                                            i21 = i10;
                                            i19 = h18;
                                            aVar2 = aVar4;
                                            pair = create2;
                                        }
                                        str = str7;
                                        i18 = i50;
                                        i20 = h12;
                                        wVarArr = wVarArr2;
                                    }
                                }
                                vVar5.G(i18 + i19);
                                i46 = i12 + 1;
                                i10 = i21;
                                h17 = i49;
                                i41 = i51;
                                arrayList2 = arrayList4;
                                j13 = j14;
                                str7 = str;
                                wVarArr2 = wVarArr;
                                create2 = pair;
                                i42 = i13;
                                h12 = i20;
                                aVar4 = aVar2;
                                c1936h4 = c1936h;
                            }
                            arrayList = arrayList2;
                            i11 = i41;
                            a aVar5 = aVar4;
                            Pair pair2 = create2;
                            int i100 = i42;
                            long j15 = j13;
                            int i101 = h12;
                            w[] wVarArr3 = wVarArr2;
                            L l13 = l11;
                            if (z8) {
                                aVar4 = aVar5;
                            } else {
                                aVar4 = aVar5;
                                a G12 = aVar4.G(1701082227);
                                if (G12 != null) {
                                    b H15 = G12.H(1701606260);
                                    if (H15 == null) {
                                        create = null;
                                    } else {
                                        n5.v vVar7 = H15.f366c;
                                        vVar7.G(8);
                                        int F12 = c.F(vVar7.h());
                                        int y10 = vVar7.y();
                                        long[] jArr3 = new long[y10];
                                        long[] jArr4 = new long[y10];
                                        for (int i102 = 0; i102 < y10; i102++) {
                                            jArr3[i102] = F12 == 1 ? vVar7.z() : vVar7.w();
                                            jArr4[i102] = F12 == 1 ? vVar7.p() : vVar7.h();
                                            if (vVar7.s() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            vVar7.H(2);
                                        }
                                        create = Pair.create(jArr3, jArr4);
                                    }
                                    if (create != null) {
                                        jArr = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        vVar = l13 != null ? null : new v(i101, i100, ((Long) pair2.first).longValue(), j15, T10, l13, i47, wVarArr3, i48, jArr, jArr2);
                                        iVar2 = iVar;
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (l13 != null) {
                            }
                            iVar2 = iVar;
                        }
                    } else {
                        i7 = -65536;
                    }
                    if (h13 == 0 && h14 == i7) {
                        if (h15 == 65536 && h16 == 0) {
                            i10 = 270;
                            if (j == -9223372036854775807L) {
                            }
                            long j132 = c(H11.f366c).f382b;
                            if (j12 != -9223372036854775807L) {
                            }
                            a G102 = G9.G(1835626086);
                            G102.getClass();
                            a G112 = G102.G(1937007212);
                            G112.getClass();
                            b H142 = G9.H(1835296868);
                            H142.getClass();
                            n5.v vVar42 = H142.f366c;
                            vVar42.G(8);
                            int F112 = c.F(vVar42.h());
                            vVar42.H(F112 == 0 ? 8 : 16);
                            long w102 = vVar42.w();
                            vVar42.H(F112 == 0 ? 4 : 8);
                            int A102 = vVar42.A();
                            Pair create22 = Pair.create(Long.valueOf(w102), "" + ((char) (((A102 >> 10) & 31) + 96)) + ((char) (((A102 >> 5) & 31) + 96)) + ((char) ((A102 & 31) + 96)));
                            H10 = G112.H(1937011556);
                            if (H10 == null) {
                            }
                        } else {
                            i7 = -65536;
                        }
                    }
                    i10 = (h13 == i7 && h14 == 0 && h15 == 0 && h16 == i7) ? 180 : 0;
                    if (j == -9223372036854775807L) {
                    }
                    long j1322 = c(H11.f366c).f382b;
                    if (j12 != -9223372036854775807L) {
                    }
                    a G1022 = G9.G(1835626086);
                    G1022.getClass();
                    a G1122 = G1022.G(1937007212);
                    G1122.getClass();
                    b H1422 = G9.H(1835296868);
                    H1422.getClass();
                    n5.v vVar422 = H1422.f366c;
                    vVar422.G(8);
                    int F1122 = c.F(vVar422.h());
                    vVar422.H(F1122 == 0 ? 8 : 16);
                    long w1022 = vVar422.w();
                    vVar422.H(F1122 == 0 ? 4 : 8);
                    int A1022 = vVar422.A();
                    Pair create222 = Pair.create(Long.valueOf(w1022), "" + ((char) (((A1022 >> 10) & 31) + 96)) + ((char) (((A1022 >> 5) & 31) + 96)) + ((char) ((A1022 & 31) + 96)));
                    H10 = G1122.H(1937011556);
                    if (H10 == null) {
                    }
                }
                v vVar8 = (v) iVar2.apply(vVar);
                if (vVar8 == null) {
                    arrayList2 = arrayList;
                } else {
                    a G13 = aVar4.G(1835297121);
                    G13.getClass();
                    a G14 = G13.G(1835626086);
                    G14.getClass();
                    a G15 = G14.G(1937007212);
                    G15.getClass();
                    y e2 = e(vVar8, G15, c1988p);
                    arrayList2 = arrayList;
                    arrayList2.add(e2);
                }
            }
            i41 = i11 + 1;
            aVar3 = aVar;
            c1936h4 = c1936h;
        }
    }
}
