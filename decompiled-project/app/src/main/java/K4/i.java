package K4;

import N6.B;
import N6.F;
import N6.H;
import N6.r;
import N6.t0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import y7.u0;

/* loaded from: classes.dex */
public final class i extends Q5.e {

    /* renamed from: e, reason: collision with root package name */
    public static final A4.p f6139e = new A4.p(27);

    /* renamed from: d, reason: collision with root package name */
    public final g f6140d;

    public i(g gVar) {
        this.f6140d = gVar;
    }

    public static a X(v vVar, int i7, int i10) {
        int k02;
        String concat;
        int v10 = vVar.v();
        Charset h02 = h0(v10);
        int i11 = i7 - 1;
        byte[] bArr = new byte[i11];
        vVar.f(0, bArr, i11);
        if (i10 == 2) {
            concat = "image/" + u0.N(new String(bArr, 0, 3, M6.e.f6798b));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            k02 = 2;
        } else {
            k02 = k0(0, bArr);
            String N10 = u0.N(new String(bArr, 0, k02, M6.e.f6798b));
            concat = N10.indexOf(47) == -1 ? "image/".concat(N10) : N10;
        }
        int i12 = bArr[k02 + 1] & 255;
        int i13 = k02 + 2;
        int j02 = j0(i13, bArr, v10);
        String str = new String(bArr, i13, j02 - i13, h02);
        int g02 = g0(v10) + j02;
        return new a(i12, concat, str, i11 <= g02 ? D.f21146f : Arrays.copyOfRange(bArr, g02, i11));
    }

    public static c Y(v vVar, int i7, int i10, boolean z8, int i11, g gVar) {
        int i12 = vVar.f21230b;
        int k02 = k0(i12, vVar.f21229a);
        String str = new String(vVar.f21229a, i12, k02 - i12, M6.e.f6798b);
        vVar.G(k02 + 1);
        int h10 = vVar.h();
        int h11 = vVar.h();
        long w10 = vVar.w();
        long j = w10 == 4294967295L ? -1L : w10;
        long w11 = vVar.w();
        long j10 = w11 == 4294967295L ? -1L : w11;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i7;
        while (vVar.f21230b < i13) {
            j b02 = b0(i10, vVar, z8, i11, gVar);
            if (b02 != null) {
                arrayList.add(b02);
            }
        }
        return new c(str, h10, h11, j, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d Z(v vVar, int i7, int i10, boolean z8, int i11, g gVar) {
        int i12 = vVar.f21230b;
        int k02 = k0(i12, vVar.f21229a);
        String str = new String(vVar.f21229a, i12, k02 - i12, M6.e.f6798b);
        vVar.G(k02 + 1);
        int v10 = vVar.v();
        boolean z10 = (v10 & 2) != 0;
        boolean z11 = (v10 & 1) != 0;
        int v11 = vVar.v();
        String[] strArr = new String[v11];
        for (int i13 = 0; i13 < v11; i13++) {
            int i14 = vVar.f21230b;
            int k03 = k0(i14, vVar.f21229a);
            strArr[i13] = new String(vVar.f21229a, i14, k03 - i14, M6.e.f6798b);
            vVar.G(k03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i7;
        while (vVar.f21230b < i15) {
            j b02 = b0(i10, vVar, z8, i11, gVar);
            if (b02 != null) {
                arrayList.add(b02);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e a0(int i7, v vVar) {
        if (i7 < 4) {
            return null;
        }
        int v10 = vVar.v();
        Charset h02 = h0(v10);
        byte[] bArr = new byte[3];
        vVar.f(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i7 - 4;
        byte[] bArr2 = new byte[i10];
        vVar.f(0, bArr2, i10);
        int j02 = j0(0, bArr2, v10);
        String str2 = new String(bArr2, 0, j02, h02);
        int g02 = g0(v10) + j02;
        return new e(str, str2, e0(bArr2, g02, j0(g02, bArr2, v10), h02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0229, code lost:
    
        if (r14 == 67) goto L146;
     */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [K4.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j b0(int i7, v vVar, boolean z8, int i10, g gVar) {
        int y10;
        String str;
        int i11;
        ?? r15;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j bVar;
        j nVar;
        int v10 = vVar.v();
        int v11 = vVar.v();
        int v12 = vVar.v();
        int v13 = i7 >= 3 ? vVar.v() : 0;
        if (i7 == 4) {
            y10 = vVar.y();
            if (!z8) {
                y10 = (((y10 >> 24) & 255) << 21) | (y10 & 255) | (((y10 >> 8) & 255) << 7) | (((y10 >> 16) & 255) << 14);
            }
        } else {
            y10 = i7 == 3 ? vVar.y() : vVar.x();
        }
        int i13 = y10;
        int A10 = i7 >= 3 ? vVar.A() : 0;
        if (v10 == 0 && v11 == 0 && v12 == 0 && v13 == 0 && i13 == 0 && A10 == 0) {
            vVar.G(vVar.f21231c);
            return null;
        }
        int i14 = vVar.f21230b + i13;
        if (i14 > vVar.f21231c) {
            AbstractC1705a.S("Id3Decoder", "Frame size exceeds remaining tag data");
            vVar.G(vVar.f21231c);
            return null;
        }
        if (gVar != null) {
            str = "Id3Decoder";
            i11 = i14;
            r15 = 0;
            i12 = A10;
            if (!gVar.a(i7, v10, v11, v12, v13)) {
                vVar.G(i11);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i11 = i14;
            r15 = 0;
            i12 = A10;
        }
        if (i7 == 3) {
            int i15 = i12;
            z11 = (i15 & 128) != 0;
            z12 = (i15 & 64) != 0;
            z10 = (i15 & 32) != 0;
            z13 = z11;
        } else {
            int i16 = i12;
            if (i7 == 4) {
                boolean z15 = (i16 & 64) != 0;
                boolean z16 = (i16 & 8) != 0;
                boolean z17 = (i16 & 4) != 0;
                z14 = (i16 & 2) != 0;
                boolean z18 = z17;
                z13 = (i16 & 1) != 0;
                z10 = z15;
                z11 = z16;
                z12 = z18;
                if (!z11 || z12) {
                    AbstractC1705a.S(str, "Skipping unsupported compressed or encrypted frame");
                    vVar.G(i11);
                    return r15;
                }
                if (z10) {
                    i13--;
                    vVar.H(1);
                }
                if (z13) {
                    i13 -= 4;
                    vVar.H(4);
                }
                int i17 = i13;
                if (z14) {
                    i17 = l0(i17, vVar);
                }
                int i18 = i17;
                try {
                    if (v10 == 84 && v11 == 88 && v12 == 88 && (i7 == 2 || v13 == 88)) {
                        if (i18 >= 1) {
                            int v14 = vVar.v();
                            int i19 = i18 - 1;
                            byte[] bArr = new byte[i19];
                            vVar.f(0, bArr, i19);
                            int j02 = j0(0, bArr, v14);
                            nVar = new o("TXXX", new String(bArr, 0, j02, h0(v14)), f0(v14, bArr, g0(v14) + j02));
                            bVar = nVar;
                        }
                        bVar = r15;
                    } else if (v10 == 84) {
                        String i02 = i0(i7, v10, v11, v12, v13);
                        if (i18 >= 1) {
                            int v15 = vVar.v();
                            int i20 = i18 - 1;
                            byte[] bArr2 = new byte[i20];
                            vVar.f(0, bArr2, i20);
                            bVar = new o(i02, r15, f0(v15, bArr2, 0));
                        }
                        bVar = r15;
                    } else {
                        if (v10 == 87 && v11 == 88 && v12 == 88 && (i7 == 2 || v13 == 88)) {
                            if (i18 < 1) {
                                bVar = r15;
                            } else {
                                int v16 = vVar.v();
                                int i21 = i18 - 1;
                                byte[] bArr3 = new byte[i21];
                                vVar.f(0, bArr3, i21);
                                int j03 = j0(0, bArr3, v16);
                                String str2 = new String(bArr3, 0, j03, h0(v16));
                                int g02 = g0(v16) + j03;
                                nVar = new p("WXXX", str2, e0(bArr3, g02, k0(g02, bArr3), M6.e.f6798b));
                            }
                        } else if (v10 == 87) {
                            String i03 = i0(i7, v10, v11, v12, v13);
                            byte[] bArr4 = new byte[i18];
                            vVar.f(0, bArr4, i18);
                            nVar = new p(i03, r15, new String(bArr4, 0, k0(0, bArr4), M6.e.f6798b));
                        } else if (v10 == 80 && v11 == 82 && v12 == 73 && v13 == 86) {
                            byte[] bArr5 = new byte[i18];
                            vVar.f(0, bArr5, i18);
                            int k02 = k0(0, bArr5);
                            String str3 = new String(bArr5, 0, k02, M6.e.f6798b);
                            int i22 = k02 + 1;
                            nVar = new n(str3, i18 <= i22 ? D.f21146f : Arrays.copyOfRange(bArr5, i22, i18));
                        } else if (v10 == 71 && v11 == 69 && v12 == 79 && (v13 == 66 || i7 == 2)) {
                            bVar = c0(i18, vVar);
                        } else if (i7 == 2) {
                            if (v10 == 80 && v11 == 73 && v12 == 67) {
                                bVar = X(vVar, i18, i7);
                            }
                            if (v10 != 67 && v11 == 79 && v12 == 77 && (v13 == 77 || i7 == 2)) {
                                bVar = a0(i18, vVar);
                            } else if (v10 != 67 && v11 == 72 && v12 == 65 && v13 == 80) {
                                bVar = Y(vVar, i18, i7, z8, i10, gVar);
                            } else if (v10 != 67 && v11 == 84 && v12 == 79 && v13 == 67) {
                                bVar = Z(vVar, i18, i7, z8, i10, gVar);
                            } else if (v10 != 77 && v11 == 76 && v12 == 76 && v13 == 84) {
                                bVar = d0(i18, vVar);
                            } else {
                                String i04 = i0(i7, v10, v11, v12, v13);
                                byte[] bArr6 = new byte[i18];
                                vVar.f(0, bArr6, i18);
                                bVar = new b(i04, bArr6);
                            }
                        } else {
                            if (v10 == 65) {
                                if (v11 == 80) {
                                    if (v12 == 73) {
                                    }
                                }
                            }
                            if (v10 != 67) {
                            }
                            if (v10 != 67) {
                            }
                            if (v10 != 67) {
                            }
                            if (v10 != 77) {
                            }
                            String i042 = i0(i7, v10, v11, v12, v13);
                            byte[] bArr62 = new byte[i18];
                            vVar.f(0, bArr62, i18);
                            bVar = new b(i042, bArr62);
                        }
                        bVar = nVar;
                    }
                    if (bVar == null) {
                        AbstractC1705a.S(str, "Failed to decode frame: id=" + i0(i7, v10, v11, v12, v13) + ", frameSize=" + i18);
                    }
                    vVar.G(i11);
                    return bVar;
                } catch (Throwable th) {
                    vVar.G(i11);
                    throw th;
                }
            }
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        z14 = false;
        if (z11) {
        }
        AbstractC1705a.S(str, "Skipping unsupported compressed or encrypted frame");
        vVar.G(i11);
        return r15;
    }

    public static f c0(int i7, v vVar) {
        int v10 = vVar.v();
        Charset h02 = h0(v10);
        int i10 = i7 - 1;
        byte[] bArr = new byte[i10];
        vVar.f(0, bArr, i10);
        int k02 = k0(0, bArr);
        String str = new String(bArr, 0, k02, M6.e.f6798b);
        int i11 = k02 + 1;
        int j02 = j0(i11, bArr, v10);
        String e02 = e0(bArr, i11, j02, h02);
        int g02 = g0(v10) + j02;
        int j03 = j0(g02, bArr, v10);
        String e03 = e0(bArr, g02, j03, h02);
        int g03 = g0(v10) + j03;
        return new f(str, e02, e03, i10 <= g03 ? D.f21146f : Arrays.copyOfRange(bArr, g03, i10));
    }

    public static m d0(int i7, v vVar) {
        int A10 = vVar.A();
        int x2 = vVar.x();
        int x10 = vVar.x();
        int v10 = vVar.v();
        int v11 = vVar.v();
        b5.f fVar = new b5.f();
        fVar.o(vVar);
        int i10 = ((i7 - 10) * 8) / (v10 + v11);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = fVar.i(v10);
            int i13 = fVar.i(v11);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new m(A10, x2, x10, iArr, iArr2);
    }

    public static String e0(byte[] bArr, int i7, int i10, Charset charset) {
        return (i10 <= i7 || i10 > bArr.length) ? "" : new String(bArr, i7, i10 - i7, charset);
    }

    public static t0 f0(int i7, byte[] bArr, int i10) {
        Object[] objArr;
        if (i10 >= bArr.length) {
            return H.K("");
        }
        F f4 = H.f7232b;
        r.e(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        int j02 = j0(i10, bArr, i7);
        int i11 = 0;
        boolean z8 = false;
        while (i10 < j02) {
            String str = new String(bArr, i10, j02 - i10, h0(i7));
            int i12 = i11 + 1;
            if (objArr2.length < i12) {
                objArr = Arrays.copyOf(objArr2, B.f(objArr2.length, i12));
            } else if (z8) {
                objArr = (Object[]) objArr2.clone();
            } else {
                objArr2[i11] = str;
                int g02 = j02 + g0(i7);
                i11++;
                i10 = g02;
                j02 = j0(g02, bArr, i7);
            }
            objArr2 = objArr;
            z8 = false;
            objArr2[i11] = str;
            int g022 = j02 + g0(i7);
            i11++;
            i10 = g022;
            j02 = j0(g022, bArr, i7);
        }
        t0 D10 = H.D(i11, objArr2);
        return D10.isEmpty() ? H.K("") : D10;
    }

    public static int g0(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset h0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? M6.e.f6798b : M6.e.f6799c : M6.e.f6800d : M6.e.f6802f;
    }

    public static String i0(int i7, int i10, int i11, int i12, int i13) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int j0(int i7, byte[] bArr, int i10) {
        int k02 = k0(i7, bArr);
        if (i10 == 0 || i10 == 3) {
            return k02;
        }
        while (k02 < bArr.length - 1) {
            if ((k02 - i7) % 2 == 0 && bArr[k02 + 1] == 0) {
                return k02;
            }
            k02 = k0(k02 + 1, bArr);
        }
        return bArr.length;
    }

    public static int k0(int i7, byte[] bArr) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int l0(int i7, v vVar) {
        byte[] bArr = vVar.f21229a;
        int i10 = vVar.f21230b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i7) {
                return i7;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i7 - (i11 - i10)) - 2);
                i7--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m0(v vVar, int i7, int i10, boolean z8) {
        int x2;
        long x10;
        int i11;
        int i12;
        int i13 = vVar.f21230b;
        while (true) {
            try {
                boolean z10 = true;
                if (vVar.a() < i10) {
                    vVar.G(i13);
                    return true;
                }
                if (i7 >= 3) {
                    x2 = vVar.h();
                    x10 = vVar.w();
                    i11 = vVar.A();
                } else {
                    x2 = vVar.x();
                    x10 = vVar.x();
                    i11 = 0;
                }
                if (x2 == 0 && x10 == 0 && i11 == 0) {
                    vVar.G(i13);
                    return true;
                }
                if (i7 == 4 && !z8) {
                    if ((8421504 & x10) != 0) {
                        vVar.G(i13);
                        return false;
                    }
                    x10 = (((x10 >> 24) & 255) << 21) | (x10 & 255) | (((x10 >> 8) & 255) << 7) | (((x10 >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i12 = (i11 & 64) != 0 ? 1 : 0;
                } else {
                    if (i7 == 3) {
                        i12 = (i11 & 32) != 0 ? 1 : 0;
                    } else {
                        i12 = 0;
                        z10 = false;
                    }
                    if (z10) {
                        i12 += 4;
                    }
                    if (x10 < i12) {
                        vVar.G(i13);
                        return false;
                    }
                    if (vVar.a() < x10) {
                        vVar.G(i13);
                        return false;
                    }
                    vVar.H((int) x10);
                }
            } catch (Throwable th) {
                vVar.G(i13);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F4.c W(int i7, byte[] bArr) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        v vVar = new v(bArr, i7);
        boolean z8 = false;
        if (vVar.a() < 10) {
            AbstractC1705a.S("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int x2 = vVar.x();
            if (x2 == 4801587) {
                int v10 = vVar.v();
                vVar.H(1);
                int v11 = vVar.v();
                int u3 = vVar.u();
                if (v10 == 2) {
                    if ((v11 & 64) != 0) {
                        AbstractC1705a.S("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    hVar = new h(v10 >= 4 && (v11 & 128) != 0, v10, u3);
                } else {
                    if (v10 == 3) {
                        if ((v11 & 64) != 0) {
                            int h10 = vVar.h();
                            vVar.H(h10);
                            u3 -= h10 + 4;
                        }
                    } else if (v10 == 4) {
                        if ((v11 & 64) != 0) {
                            int u10 = vVar.u();
                            vVar.H(u10 - 4);
                            u3 -= u10;
                        }
                        if ((v11 & 16) != 0) {
                            u3 -= 10;
                        }
                    } else {
                        h3.o.u(v10, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    hVar = new h(v10 >= 4 && (v11 & 128) != 0, v10, u3);
                }
                if (hVar != null) {
                    return null;
                }
                int i10 = vVar.f21230b;
                int i11 = hVar.f6136a;
                int i12 = i11 == 2 ? 6 : 10;
                boolean z10 = hVar.f6137b;
                int i13 = hVar.f6138c;
                if (z10) {
                    i13 = l0(i13, vVar);
                }
                vVar.F(i10 + i13);
                if (!m0(vVar, i11, i12, false)) {
                    if (i11 != 4 || !m0(vVar, 4, i12, true)) {
                        h3.o.u(i11, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z8 = true;
                }
                while (vVar.a() >= i12) {
                    j b02 = b0(i11, vVar, z8, i12, this.f6140d);
                    if (b02 != null) {
                        arrayList.add(b02);
                    }
                }
                return new F4.c(arrayList);
            }
            AbstractC1705a.S("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(x2))));
        }
        hVar = null;
        if (hVar != null) {
        }
    }

    @Override // Q5.e
    public final F4.c u(F4.e eVar, ByteBuffer byteBuffer) {
        return W(byteBuffer.limit(), byteBuffer.array());
    }
}
