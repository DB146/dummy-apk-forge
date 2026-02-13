package b9;

import P8.b;
import P8.f;
import P8.j;
import P8.l;
import P8.n;
import P8.o;
import P8.p;
import c9.AbstractC0916a;
import c9.C0917b;
import java.text.DecimalFormat;
import java.util.EnumMap;

/* renamed from: b9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0848a implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f13990b = new p[0];

    /* renamed from: a, reason: collision with root package name */
    public final C0917b f13991a = new C0917b(0);

    @Override // P8.l
    public final n a(b bVar, EnumMap enumMap) {
        int a9;
        byte[] bArr;
        String sb2;
        V8.b a10 = bVar.a();
        int i7 = a10.f10194a;
        int i10 = a10.f10195b;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < a10.f10195b; i13++) {
            int i14 = 0;
            while (true) {
                int i15 = a10.f10196c;
                if (i14 < i15) {
                    int i16 = a10.f10197d[(i15 * i13) + i14];
                    if (i16 != 0) {
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        int i17 = i14 * 32;
                        if (i17 < i7) {
                            int i18 = 0;
                            while ((i16 << (31 - i18)) == 0) {
                                i18++;
                            }
                            int i19 = i18 + i17;
                            if (i19 < i7) {
                                i7 = i19;
                            }
                        }
                        if (i17 + 31 > i11) {
                            int i20 = 31;
                            while ((i16 >>> i20) == 0) {
                                i20--;
                            }
                            int i21 = i17 + i20;
                            if (i21 > i11) {
                                i11 = i21;
                            }
                        }
                    }
                    i14++;
                }
            }
        }
        int[] iArr = (i11 < i7 || i12 < i10) ? null : new int[]{i7, i10, (i11 - i7) + 1, (i12 - i10) + 1};
        if (iArr == null) {
            throw j.a();
        }
        int i22 = iArr[0];
        int i23 = iArr[1];
        int i24 = iArr[2];
        int i25 = iArr[3];
        int[] iArr2 = new int[33];
        for (int i26 = 0; i26 < 33; i26++) {
            int min = Math.min(((i25 / 2) + (i26 * i25)) / 33, i25 - 1) + i23;
            for (int i27 = 0; i27 < 30; i27++) {
                if (a10.b(Math.min(((((i26 & 1) * i24) / 2) + ((i24 / 2) + (i27 * i24))) / 30, i24 - 1) + i22, min)) {
                    int i28 = (i27 / 32) + i26;
                    iArr2[i28] = iArr2[i28] | (1 << (i27 & 31));
                }
            }
        }
        C0917b c0917b = this.f13991a;
        c0917b.getClass();
        byte[] bArr2 = new byte[144];
        for (int i29 = 0; i29 < 33; i29++) {
            int[] iArr3 = AbstractC0916a.f14456a[i29];
            for (int i30 = 0; i30 < 30; i30++) {
                int i31 = iArr3[i30];
                if (i31 >= 0 && ((iArr2[(i30 / 32) + i29] >>> (i30 & 31)) & 1) != 0) {
                    int i32 = i31 / 6;
                    bArr2[i32] = (byte) (bArr2[i32] | ((byte) (1 << (5 - (i31 % 6)))));
                }
            }
        }
        int a11 = c0917b.a(bArr2, 0, 10, 10, 0);
        int i33 = bArr2[0] & 15;
        if (i33 == 2 || i33 == 3 || i33 == 4) {
            a9 = a11 + c0917b.a(bArr2, 20, 84, 40, 1) + c0917b.a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i33 != 5) {
                throw f.a();
            }
            a9 = a11 + c0917b.a(bArr2, 20, 68, 56, 1) + c0917b.a(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb3 = new StringBuilder(144);
        if (i33 == 2 || i33 == 3) {
            if (i33 == 2) {
                int a12 = AbstractC0916a.a(bArr, AbstractC0916a.f14460e);
                int a13 = AbstractC0916a.a(bArr, AbstractC0916a.f14459d);
                if (a13 > 10) {
                    throw f.a();
                }
                sb2 = new DecimalFormat("0000000000".substring(0, a13)).format(a12);
            } else {
                StringBuilder sb4 = new StringBuilder(6);
                byte[][] bArr3 = AbstractC0916a.f14461f;
                for (int i34 = 0; i34 < 6; i34++) {
                    sb4.append(AbstractC0916a.g[0].charAt(AbstractC0916a.a(bArr, bArr3[i34])));
                }
                sb2 = sb4.toString();
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(AbstractC0916a.a(bArr, AbstractC0916a.f14457b));
            String format2 = decimalFormat.format(AbstractC0916a.a(bArr, AbstractC0916a.f14458c));
            sb3.append(AbstractC0916a.b(10, bArr, 84));
            if (sb3.toString().startsWith("[)>\u001e01\u001d")) {
                sb3.insert(9, sb2 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb3.insert(0, sb2 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        } else if (i33 == 4) {
            sb3.append(AbstractC0916a.b(1, bArr, 93));
        } else if (i33 == 5) {
            sb3.append(AbstractC0916a.b(1, bArr, 77));
        }
        String sb5 = sb3.toString();
        String valueOf = String.valueOf(i33);
        Integer valueOf2 = Integer.valueOf(a9);
        n nVar = new n(sb5, bArr, f13990b, P8.a.f8189x);
        nVar.b(o.f8240d, valueOf2);
        if (valueOf != null) {
            nVar.b(o.f8239c, valueOf);
        }
        return nVar;
    }

    @Override // P8.l
    public final void reset() {
    }
}
