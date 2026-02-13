package d9;

import P8.n;
import P8.o;
import P8.p;
import java.util.ArrayList;
import java.util.EnumMap;

/* renamed from: d9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1060b extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f16573a;

    static {
        int[] iArr = new int[6];
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 1;
        f16573a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, iArr, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x018f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x00ef. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0127. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0166 A[PHI: r25
      0x0166: PHI (r25v9 int) = (r25v5 int), (r25v14 int) binds: [B:120:0x018f, B:85:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c A[PHI: r25
      0x016c: PHI (r25v8 int) = (r25v5 int), (r25v14 int) binds: [B:120:0x018f, B:85:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a A[FALL_THROUGH, PHI: r24 r25
      0x012a: PHI (r24v10 int) = (r24v1 int), (r24v6 int), (r24v6 int), (r24v6 int), (r24v1 int), (r24v12 int), (r24v12 int), (r24v12 int) binds: [B:120:0x018f, B:124:0x01a5, B:128:0x01b1, B:127:0x01ad, B:85:0x0127, B:91:0x013e, B:95:0x014a, B:94:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x012a: PHI (r25v13 int) = (r25v5 int), (r25v5 int), (r25v5 int), (r25v5 int), (r25v14 int), (r25v14 int), (r25v14 int), (r25v14 int) binds: [B:120:0x018f, B:124:0x01a5, B:128:0x01b1, B:127:0x01ad, B:85:0x0127, B:91:0x013e, B:95:0x014a, B:94:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        int[][] iArr;
        float f4;
        char c10;
        char c11;
        boolean z8;
        int i10 = 1;
        boolean z10 = enumMap != null && enumMap.containsKey(P8.d.f8202v);
        int i11 = aVar.f10193b;
        int e2 = aVar.e(0);
        int i12 = 6;
        int[] iArr2 = new int[6];
        boolean z11 = false;
        int i13 = 0;
        int i14 = e2;
        while (e2 < i11) {
            if (aVar.d(e2) != z11) {
                iArr2[i13] = iArr2[i13] + i10;
            } else {
                if (i13 == 5) {
                    int i15 = 103;
                    int i16 = -1;
                    float f10 = 0.25f;
                    while (true) {
                        iArr = f16573a;
                        f4 = 0.7f;
                        if (i15 > 105) {
                            break;
                        }
                        float d10 = h.d(iArr2, iArr[i15], 0.7f);
                        if (d10 < f10) {
                            f10 = d10;
                            i16 = i15;
                        }
                        i15++;
                    }
                    if (i16 >= 0 && aVar.h(Math.max(0, i14 - ((e2 - i14) / 2)), i14)) {
                        int[] iArr3 = {i14, e2, i16};
                        int i17 = iArr3[2];
                        ArrayList arrayList = new ArrayList(20);
                        arrayList.add(Byte.valueOf((byte) i17));
                        switch (i17) {
                            case 103:
                                c10 = 'e';
                                break;
                            case 104:
                                c10 = 'd';
                                break;
                            case 105:
                                c10 = 'c';
                                break;
                            default:
                                throw P8.f.a();
                        }
                        StringBuilder sb2 = new StringBuilder(20);
                        int[] iArr4 = new int[i12];
                        int i18 = i10;
                        char c12 = c10;
                        boolean z12 = false;
                        boolean z13 = false;
                        boolean z14 = false;
                        boolean z15 = false;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = iArr3[0];
                        int i24 = iArr3[i10];
                        while (!z14) {
                            h.e(i24, aVar, iArr4);
                            int i25 = -1;
                            float f11 = 0.25f;
                            for (int i26 = 0; i26 < 107; i26++) {
                                float d11 = h.d(iArr4, iArr[i26], f4);
                                if (d11 < f11) {
                                    f11 = d11;
                                    i25 = i26;
                                }
                            }
                            if (i25 < 0) {
                                throw P8.j.a();
                            }
                            arrayList.add(Byte.valueOf((byte) i25));
                            if (i25 != 106) {
                                i18 = 1;
                            }
                            if (i25 != 106) {
                                i20++;
                                i17 = (i20 * i25) + i17;
                            }
                            int i27 = i24;
                            for (int i28 = 0; i28 < i12; i28++) {
                                i27 += iArr4[i28];
                            }
                            switch (i25) {
                                case 103:
                                case 104:
                                case 105:
                                    throw P8.f.a();
                                default:
                                    switch (c12) {
                                        case 'c':
                                            c11 = 'd';
                                            if (i25 >= 100) {
                                                if (i25 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i25 != 106) {
                                                    switch (i25) {
                                                        case 100:
                                                            c12 = 'd';
                                                            break;
                                                        case 101:
                                                            z8 = false;
                                                            c12 = 'e';
                                                            break;
                                                        case 102:
                                                            if (sb2.length() == 0) {
                                                                i22 = 1;
                                                            } else if (sb2.length() == 1) {
                                                                i22 = 2;
                                                            }
                                                            if (z10) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                    break;
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    z8 = false;
                                                    z14 = true;
                                                    break;
                                                }
                                            } else {
                                                if (i25 < 10) {
                                                    sb2.append('0');
                                                }
                                                sb2.append(i25);
                                            }
                                            z8 = false;
                                            break;
                                        case 'd':
                                            if (i25 < 96) {
                                                if (z13 == z12) {
                                                    sb2.append((char) (i25 + 32));
                                                } else {
                                                    sb2.append((char) (i25 + 160));
                                                }
                                                z8 = false;
                                                c11 = 'd';
                                                z13 = false;
                                                break;
                                            } else {
                                                if (i25 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i25 != 106) {
                                                    switch (i25) {
                                                        case 97:
                                                            z8 = false;
                                                            i22 = 4;
                                                            break;
                                                        case 98:
                                                            z8 = true;
                                                            c12 = 'e';
                                                            break;
                                                        case 99:
                                                            z8 = false;
                                                            c12 = 'c';
                                                            break;
                                                        case 100:
                                                            if (z12 || !z13) {
                                                                if (z12 && z13) {
                                                                    z8 = false;
                                                                    z12 = false;
                                                                }
                                                                z8 = false;
                                                                z13 = true;
                                                                break;
                                                            } else {
                                                                z8 = false;
                                                                z12 = true;
                                                            }
                                                            z13 = false;
                                                            break;
                                                        case 101:
                                                            z8 = false;
                                                            c12 = 'e';
                                                            break;
                                                        case 102:
                                                            if (sb2.length() == 0) {
                                                                i22 = 1;
                                                            } else if (sb2.length() == 1) {
                                                                i22 = 2;
                                                            }
                                                            if (z10) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                }
                                                            }
                                                        default:
                                                            z8 = false;
                                                            break;
                                                    }
                                                    c11 = 'd';
                                                    break;
                                                }
                                                z8 = false;
                                                z14 = true;
                                                c11 = 'd';
                                            }
                                        case 'e':
                                            if (i25 < 64) {
                                                if (z13 == z12) {
                                                    sb2.append((char) (i25 + 32));
                                                } else {
                                                    sb2.append((char) (i25 + 160));
                                                }
                                            } else if (i25 >= 96) {
                                                if (i25 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i25 != 106) {
                                                    switch (i25) {
                                                        case 98:
                                                            z8 = true;
                                                            c12 = 'd';
                                                            break;
                                                        case 100:
                                                            z8 = false;
                                                            c12 = 'd';
                                                            break;
                                                        case 101:
                                                            if (z12 || !z13) {
                                                                if (z12 && z13) {
                                                                    z8 = false;
                                                                    z12 = false;
                                                                }
                                                                z8 = false;
                                                                z13 = true;
                                                                break;
                                                            } else {
                                                                z8 = false;
                                                                z12 = true;
                                                            }
                                                            z13 = false;
                                                            break;
                                                        case 102:
                                                            if (sb2.length() == 0) {
                                                                i22 = 1;
                                                            } else if (sb2.length() == 1) {
                                                                i22 = 2;
                                                            }
                                                            if (z10) {
                                                                if (sb2.length() == 0) {
                                                                    sb2.append("]C1");
                                                                } else {
                                                                    sb2.append((char) 29);
                                                                }
                                                            }
                                                    }
                                                    c11 = 'd';
                                                    break;
                                                }
                                                z8 = false;
                                                z14 = true;
                                                c11 = 'd';
                                            } else if (z13 == z12) {
                                                sb2.append((char) (i25 - 64));
                                            } else {
                                                sb2.append((char) (i25 + 64));
                                            }
                                            z8 = false;
                                            c11 = 'd';
                                            z13 = false;
                                            break;
                                        default:
                                            c11 = 'd';
                                            z8 = false;
                                            break;
                                    }
                                    if (z15) {
                                        c12 = c12 == 'e' ? c11 : 'e';
                                    }
                                    z15 = z8;
                                    i23 = i24;
                                    i24 = i27;
                                    i12 = 6;
                                    f4 = 0.7f;
                                    i21 = i19;
                                    i19 = i25;
                            }
                        }
                        int i29 = i24 - i23;
                        int f12 = aVar.f(i24);
                        if (!aVar.h(f12, Math.min(aVar.f10193b, ((f12 - i23) / 2) + f12))) {
                            throw P8.j.a();
                        }
                        int i30 = i21;
                        if ((i17 - (i20 * i30)) % 103 != i30) {
                            throw P8.c.a();
                        }
                        int length = sb2.length();
                        if (length == 0) {
                            throw P8.j.a();
                        }
                        if (length > 0 && i18 != 0) {
                            if (c12 == 'c') {
                                sb2.delete(length - 2, length);
                            } else {
                                sb2.delete(length - 1, length);
                            }
                        }
                        float f13 = (iArr3[1] + iArr3[0]) / 2.0f;
                        float f14 = (i29 / 2.0f) + i23;
                        int size = arrayList.size();
                        byte[] bArr = new byte[size];
                        for (int i31 = 0; i31 < size; i31++) {
                            bArr[i31] = ((Byte) arrayList.get(i31)).byteValue();
                        }
                        float f15 = i7;
                        n nVar = new n(sb2.toString(), bArr, new p[]{new p(f13, f15), new p(f14, f15)}, P8.a.f8184e);
                        nVar.b(o.f8235A, "]C" + i22);
                        return nVar;
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i32 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i32);
                    iArr2[i32] = 0;
                    iArr2[i13] = 0;
                    i13--;
                } else {
                    i13++;
                }
                i10 = 1;
                iArr2[i13] = 1;
                z11 = !z11;
            }
            e2++;
            i12 = 6;
        }
        throw P8.j.a();
    }
}
