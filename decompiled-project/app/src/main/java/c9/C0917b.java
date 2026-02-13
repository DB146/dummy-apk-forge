package c9;

import H2.O;
import I2.C0330t;
import P8.f;
import V8.d;
import V8.e;
import X8.c;
import java.util.ArrayList;
import java.util.EnumMap;
import m9.AbstractC1644a;
import m9.AbstractC1645b;
import m9.C1646c;
import m9.C1649f;
import m9.EnumC1647d;

/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0917b {

    /* renamed from: a, reason: collision with root package name */
    public final R7.b f14462a;

    public C0917b(int i7) {
        switch (i7) {
            case 1:
                this.f14462a = new R7.b(X8.a.f11005l, 9);
                return;
            default:
                this.f14462a = new R7.b(X8.a.f11008o, 9);
                return;
        }
    }

    public int a(byte[] bArr, int i7, int i10, int i11, int i12) {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i7] & 255;
            }
        }
        try {
            int n6 = this.f14462a.n(iArr, i11 / i14);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i7] = (byte) iArr[i16 / i14];
                }
            }
            return n6;
        } catch (c unused) {
            throw P8.c.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03da A[LOOP:21: B:146:0x0226->B:176:0x03da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0346 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e b(C0330t c0330t, EnumMap enumMap) {
        int i7;
        int b2;
        EnumC1647d enumC1647d;
        boolean z8;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        int i10;
        String str;
        int b10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 1;
        C1649f r10 = c0330t.r();
        int i15 = c0330t.q().f20791a;
        C1646c q10 = c0330t.q();
        C1649f r11 = c0330t.r();
        int i16 = P.c.c(8)[q10.f20792b];
        V8.b bVar = (V8.b) c0330t.f5200b;
        int i17 = bVar.f10195b;
        for (int i18 = 0; i18 < i17; i18++) {
            for (int i19 = 0; i19 < i17; i19++) {
                if (AbstractC1645b.a(i16, i18, i19)) {
                    bVar.a(i19, i18);
                }
            }
        }
        int i20 = r11.f20808a * 4;
        int i21 = i20 + 17;
        V8.b bVar2 = new V8.b(i21, i21);
        bVar2.i(0, 0, 9, 9);
        int i22 = i20 + 9;
        bVar2.i(i22, 0, 8, 9);
        bVar2.i(0, i22, 9, 8);
        int[] iArr = r11.f20809b;
        int length = iArr.length;
        for (int i23 = 0; i23 < length; i23++) {
            int i24 = iArr[i23] - 2;
            for (int i25 = 0; i25 < length; i25++) {
                if ((i23 != 0 || (i25 != 0 && i25 != length - 1)) && (i23 != length - 1 || i25 != 0)) {
                    bVar2.i(iArr[i25] - 2, i24, 5, 5);
                }
            }
        }
        int i26 = 6;
        bVar2.i(6, 9, 1, i20);
        bVar2.i(9, 6, i20, 1);
        if (r11.f20808a > 6) {
            int i27 = i20 + 6;
            bVar2.i(i27, 0, 3, 6);
            bVar2.i(0, i27, 6, 3);
        }
        int i28 = r11.f20811d;
        byte[] bArr = new byte[i28];
        int i29 = i17 - 1;
        int i30 = i29;
        boolean z12 = true;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (i30 > 0) {
            if (i30 == i26) {
                i30--;
            }
            int i34 = i33;
            int i35 = i32;
            int i36 = i31;
            int i37 = 0;
            while (i37 < i17) {
                int i38 = z12 ? i29 - i37 : i37;
                int i39 = i34;
                int i40 = i35;
                int i41 = i36;
                int i42 = 0;
                while (i42 < i13) {
                    int i43 = i30 - i42;
                    if (bVar2.b(i43, i38)) {
                        i11 = i38;
                    } else {
                        int i44 = i40 + 1;
                        int i45 = i39 << 1;
                        if (bVar.b(i43, i38)) {
                            i12 = i45 | 1;
                            i11 = i38;
                        } else {
                            i11 = i38;
                            i12 = i45;
                        }
                        if (i44 == 8) {
                            bArr[i41] = (byte) i12;
                            i41++;
                            i40 = 0;
                            i39 = 0;
                        } else {
                            i40 = i44;
                            i39 = i12;
                        }
                    }
                    i42++;
                    i38 = i11;
                    i13 = 2;
                }
                i37++;
                i36 = i41;
                i35 = i40;
                i34 = i39;
                i13 = 2;
            }
            z12 = !z12;
            i30 -= 2;
            i31 = i36;
            i32 = i35;
            i33 = i34;
            i26 = 6;
            i13 = 2;
        }
        if (i31 != i28) {
            throw f.a();
        }
        if (i28 != r10.f20811d) {
            throw new IllegalArgumentException();
        }
        A7.a aVar = r10.f20810c[P.c.b(i15)];
        O[] oArr = (O[]) aVar.f532b;
        int i46 = 0;
        for (O o10 : oArr) {
            i46 += o10.f4603b;
        }
        Z8.a[] aVarArr = new Z8.a[i46];
        int length2 = oArr.length;
        int i47 = 0;
        int i48 = 0;
        while (true) {
            i7 = aVar.f531a;
            if (i47 >= length2) {
                break;
            }
            O o11 = oArr[i47];
            int i49 = i48;
            int i50 = 0;
            while (i50 < o11.f4603b) {
                int i51 = o11.f4604c;
                aVarArr[i49] = new Z8.a(i51, new byte[i7 + i51]);
                i14 = 1;
                i50++;
                i49++;
            }
            i47 += i14;
            i48 = i49;
        }
        int length3 = aVarArr[0].f12208b.length;
        int i52 = i46 - 1;
        while (i52 >= 0 && aVarArr[i52].f12208b.length != length3) {
            i52--;
        }
        int i53 = i52 + i14;
        int i54 = length3 - i7;
        int i55 = 0;
        int i56 = 0;
        while (i55 < i54) {
            int i57 = i56;
            int i58 = 0;
            while (i58 < i48) {
                aVarArr[i58].f12208b[i55] = bArr[i57];
                i58 += i14;
                i57++;
            }
            i55 += i14;
            i56 = i57;
        }
        int i59 = i53;
        while (i59 < i48) {
            aVarArr[i59].f12208b[i54] = bArr[i56];
            i59 += i14;
            i56++;
        }
        boolean z13 = false;
        int length4 = aVarArr[0].f12208b.length;
        while (i54 < length4) {
            int i60 = i56;
            int i61 = 0;
            while (i61 < i48) {
                aVarArr[i61].f12208b[i61 < i53 ? i54 : i54 + 1] = bArr[i60];
                i61 += i14;
                i60++;
            }
            i54 += i14;
            i56 = i60;
        }
        int i62 = 0;
        for (int i63 = 0; i63 < i46; i63 += i14) {
            i62 += aVarArr[i63].f12207a;
        }
        byte[] bArr2 = new byte[i62];
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        while (i65 < i46) {
            Z8.a aVar2 = aVarArr[i65];
            byte[] bArr3 = aVar2.f12208b;
            int i67 = aVar2.f12207a;
            int length5 = bArr3.length;
            int[] iArr2 = new int[length5];
            for (int i68 = 0; i68 < length5; i68++) {
                iArr2[i68] = bArr3[i68] & 255;
            }
            try {
                int n6 = this.f14462a.n(iArr2, bArr3.length - i67);
                for (int i69 = 0; i69 < i67; i69++) {
                    bArr3[i69] = (byte) iArr2[i69];
                }
                i64 += n6;
                int i70 = i66;
                int i71 = 0;
                while (i71 < i67) {
                    bArr2[i70] = bArr3[i71];
                    i71++;
                    i70++;
                }
                i65++;
                i66 = i70;
            } catch (c unused) {
                throw P8.c.a();
            }
        }
        char[] cArr = AbstractC1644a.f20788a;
        V8.c cVar = new V8.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        boolean z14 = false;
        boolean z15 = false;
        int i72 = -1;
        d dVar = null;
        int i73 = -1;
        while (true) {
            try {
                int a9 = cVar.a();
                EnumC1647d enumC1647d2 = EnumC1647d.TERMINATOR;
                if (a9 < 4 || (b2 = cVar.b(4)) == 0) {
                    enumC1647d = enumC1647d2;
                } else if (b2 == 1) {
                    enumC1647d = EnumC1647d.NUMERIC;
                } else if (b2 == 2) {
                    enumC1647d = EnumC1647d.ALPHANUMERIC;
                } else if (b2 == 3) {
                    enumC1647d = EnumC1647d.STRUCTURED_APPEND;
                } else if (b2 == 4) {
                    enumC1647d = EnumC1647d.BYTE;
                } else if (b2 == 5) {
                    enumC1647d = EnumC1647d.FNC1_FIRST_POSITION;
                } else if (b2 == 7) {
                    enumC1647d = EnumC1647d.ECI;
                } else if (b2 == 8) {
                    enumC1647d = EnumC1647d.KANJI;
                } else if (b2 == 9) {
                    enumC1647d = EnumC1647d.FNC1_SECOND_POSITION;
                } else {
                    if (b2 != 13) {
                        throw new IllegalArgumentException();
                    }
                    enumC1647d = EnumC1647d.HANZI;
                }
                int ordinal = enumC1647d.ordinal();
                if (ordinal != 0) {
                    z8 = z14;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            boolean z16 = z15;
                            int b11 = cVar.b(8);
                            if ((b11 & 128) == 0) {
                                b10 = b11 & 127;
                                z10 = z13;
                            } else {
                                z10 = z13;
                                if ((b11 & 192) == 128) {
                                    b10 = ((b11 & 63) << 8) | cVar.b(8);
                                } else {
                                    if ((b11 & 224) != 192) {
                                        throw f.a();
                                    }
                                    b10 = ((b11 & 31) << 16) | cVar.b(16);
                                    dVar = d.a(b10);
                                    if (dVar != null) {
                                        throw f.a();
                                    }
                                    z15 = z16;
                                }
                            }
                            dVar = d.a(b10);
                            if (dVar != null) {
                            }
                        } else if (ordinal == 7) {
                            z10 = true;
                            z8 = true;
                        } else if (ordinal != 8) {
                            if (ordinal != 9) {
                                int b12 = cVar.b(enumC1647d.a(r10));
                                int ordinal2 = enumC1647d.ordinal();
                                z11 = z15;
                                if (ordinal2 == 1) {
                                    AbstractC1644a.e(cVar, sb2, b12);
                                } else if (ordinal2 == 2) {
                                    AbstractC1644a.a(cVar, sb2, b12, z13);
                                } else if (ordinal2 == 4) {
                                    AbstractC1644a.b(cVar, sb2, b12, dVar, arrayList2, enumMap);
                                } else {
                                    if (ordinal2 != 6) {
                                        throw f.a();
                                    }
                                    AbstractC1644a.d(cVar, sb2, b12);
                                }
                            } else {
                                z11 = z15;
                                int b13 = cVar.b(4);
                                int b14 = cVar.b(enumC1647d.a(r10));
                                if (b13 == 1) {
                                    AbstractC1644a.c(cVar, sb2, b14);
                                }
                            }
                            z10 = z13;
                        } else {
                            z15 = true;
                            z10 = true;
                        }
                        if (enumC1647d == enumC1647d2) {
                            int i74 = dVar != null ? z8 ? 4 : z15 ? 6 : 2 : z8 ? 3 : z15 ? 5 : 1;
                            String sb3 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                i10 = 1;
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                                i10 = 1;
                            }
                            if (i15 == i10) {
                                str = "L";
                            } else if (i15 == 2) {
                                str = "M";
                            } else if (i15 == 3) {
                                str = "Q";
                            } else {
                                if (i15 != 4) {
                                    throw null;
                                }
                                str = "H";
                            }
                            e eVar = new e(bArr2, sb3, arrayList, str, i73, i72, i74);
                            eVar.f10210e = Integer.valueOf(i64);
                            return eVar;
                        }
                        z13 = z10;
                        z14 = z8;
                    } else {
                        z10 = z13;
                        z11 = z15;
                        if (cVar.a() < 16) {
                            throw f.a();
                        }
                        int b15 = cVar.b(8);
                        i72 = cVar.b(8);
                        i73 = b15;
                        z15 = z11;
                        if (enumC1647d == enumC1647d2) {
                        }
                    }
                } else {
                    z8 = z14;
                    z10 = z13;
                    z11 = z15;
                }
                z15 = z11;
                if (enumC1647d == enumC1647d2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw f.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: c | f -> 0x0052, TryCatch #2 {c | f -> 0x0052, blocks: (B:10:0x0011, B:11:0x0022, B:13:0x002a, B:14:0x002d, B:16:0x0031, B:18:0x003b, B:20:0x0041, B:25:0x0046), top: B:9:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e c(V8.b bVar, EnumMap enumMap) {
        P8.c cVar;
        int i7;
        V8.b bVar2;
        C0330t c0330t = new C0330t(bVar);
        try {
            return b(c0330t, enumMap);
        } catch (P8.c e2) {
            cVar = e2;
            e = null;
            try {
                c0330t.s();
                c0330t.f5201c = null;
                c0330t.f5202d = null;
                c0330t.f5199a = true;
                c0330t.r();
                c0330t.q();
                i7 = 0;
                while (true) {
                    bVar2 = (V8.b) c0330t.f5200b;
                    if (i7 < bVar2.f10194a) {
                        e b2 = b(c0330t, enumMap);
                        b2.g = new Object();
                        return b2;
                    }
                    int i10 = i7 + 1;
                    for (int i11 = i10; i11 < bVar2.f10195b; i11++) {
                        if (bVar2.b(i7, i11) != bVar2.b(i11, i7)) {
                            bVar2.a(i11, i7);
                            bVar2.a(i7, i11);
                        }
                    }
                    i7 = i10;
                }
            } catch (P8.c | f unused) {
                if (e != null) {
                    throw e;
                }
                throw cVar;
            }
        } catch (f e10) {
            e = e10;
            cVar = null;
            c0330t.s();
            c0330t.f5201c = null;
            c0330t.f5202d = null;
            c0330t.f5199a = true;
            c0330t.r();
            c0330t.q();
            i7 = 0;
            while (true) {
                bVar2 = (V8.b) c0330t.f5200b;
                if (i7 < bVar2.f10194a) {
                }
                i7 = i10;
            }
        }
    }
}
