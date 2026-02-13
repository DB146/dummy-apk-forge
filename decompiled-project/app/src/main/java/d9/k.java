package d9;

import P8.m;
import P8.n;
import P8.o;
import P8.p;
import P8.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public abstract class k extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16601d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16602e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f16603f;
    public static final int[][] g;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f16604a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final j f16605b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public final j f16606c = new j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f16603f = iArr;
        int[][] iArr2 = new int[20];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i7 = 10; i7 < 20; i7++) {
            int[] iArr3 = f16603f[i7 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            g[i7] = iArr4;
        }
    }

    public static int h(V8.a aVar, int[] iArr, int i7, int[][] iArr2) {
        h.e(i7, aVar, iArr);
        int length = iArr2.length;
        float f4 = 0.48f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float d10 = h.d(iArr, iArr2[i11], 0.7f);
            if (d10 < f4) {
                i10 = i11;
                f4 = d10;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw P8.j.a();
    }

    public static int[] l(V8.a aVar, int i7, boolean z8, int[] iArr, int[] iArr2) {
        int i10 = aVar.f10193b;
        int f4 = z8 ? aVar.f(i7) : aVar.e(i7);
        int length = iArr.length;
        boolean z10 = z8;
        int i11 = 0;
        int i12 = f4;
        while (f4 < i10) {
            if (aVar.d(f4) != z10) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (h.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, f4};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z10 = !z10;
            }
            f4++;
        }
        throw P8.j.a();
    }

    public static int[] m(V8.a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z8 = false;
        int i7 = 0;
        while (!z8) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = l(aVar, i7, false, f16601d, iArr);
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                z8 = aVar.h(i12, i10);
            }
            i7 = i11;
        }
        return iArr2;
    }

    @Override // d9.h
    public n b(int i7, V8.a aVar, EnumMap enumMap) {
        return k(i7, aVar, m(aVar), enumMap);
    }

    public boolean g(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i7 = length - 1;
        int digit = Character.digit(str.charAt(i7), 10);
        CharSequence subSequence = str.subSequence(0, i7);
        int length2 = subSequence.length();
        int i10 = 0;
        for (int i11 = length2 - 1; i11 >= 0; i11 -= 2) {
            int charAt = subSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw P8.f.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length2 - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = subSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw P8.f.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10 == digit;
    }

    public int[] i(V8.a aVar, int i7) {
        return l(aVar, i7, false, f16601d, new int[3]);
    }

    public abstract int j(V8.a aVar, int[] iArr, StringBuilder sb2);

    public n k(int i7, V8.a aVar, int[] iArr, EnumMap enumMap) {
        int i10;
        String str = null;
        q qVar = enumMap == null ? null : (q) enumMap.get(P8.d.f8204x);
        if (qVar != null) {
            qVar.a(new p((iArr[0] + iArr[1]) / 2.0f, i7));
        }
        StringBuilder sb2 = this.f16604a;
        sb2.setLength(0);
        int j = j(aVar, iArr, sb2);
        if (qVar != null) {
            qVar.a(new p(j, i7));
        }
        int[] i11 = i(aVar, j);
        if (qVar != null) {
            qVar.a(new p((i11[0] + i11[1]) / 2.0f, i7));
        }
        int i12 = i11[1];
        int i13 = (i12 - i11[0]) + i12;
        if (i13 >= aVar.f10193b || !aVar.h(i12, i13)) {
            throw P8.j.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw P8.f.a();
        }
        if (!g(sb3)) {
            throw P8.c.a();
        }
        P8.a n6 = n();
        float f4 = i7;
        n nVar = new n(sb3, null, new p[]{new p((iArr[1] + iArr[0]) / 2.0f, f4), new p((i11[1] + i11[0]) / 2.0f, f4)}, n6);
        try {
            n b2 = this.f16605b.b(i7, i11[1], aVar);
            nVar.b(o.f8245w, b2.f8230a);
            nVar.a(b2.f8234e);
            p[] pVarArr = b2.f8232c;
            p[] pVarArr2 = nVar.f8232c;
            if (pVarArr2 == null) {
                nVar.f8232c = pVarArr;
            } else if (pVarArr != null && pVarArr.length > 0) {
                p[] pVarArr3 = new p[pVarArr2.length + pVarArr.length];
                System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
                System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
                nVar.f8232c = pVarArr3;
            }
            i10 = b2.f8230a.length();
        } catch (m unused) {
            i10 = 0;
        }
        int[] iArr2 = enumMap == null ? null : (int[]) enumMap.get(P8.d.f8205y);
        if (iArr2 != null) {
            for (int i14 : iArr2) {
                if (i10 != i14) {
                }
            }
            throw P8.j.a();
        }
        if (n6 == P8.a.f8187v || n6 == P8.a.f8176C) {
            j jVar = this.f16606c;
            synchronized (jVar) {
                if (((ArrayList) jVar.f16599a).isEmpty()) {
                    jVar.a(new int[]{0, 19}, "US/CA");
                    jVar.a(new int[]{30, 39}, "US");
                    jVar.a(new int[]{60, 139}, "US/CA");
                    jVar.a(new int[]{300, 379}, "FR");
                    jVar.a(new int[]{380}, "BG");
                    jVar.a(new int[]{383}, "SI");
                    jVar.a(new int[]{385}, "HR");
                    jVar.a(new int[]{387}, "BA");
                    jVar.a(new int[]{400, 440}, "DE");
                    jVar.a(new int[]{450, 459}, "JP");
                    jVar.a(new int[]{460, 469}, "RU");
                    jVar.a(new int[]{471}, "TW");
                    jVar.a(new int[]{474}, "EE");
                    jVar.a(new int[]{475}, "LV");
                    jVar.a(new int[]{476}, "AZ");
                    jVar.a(new int[]{477}, "LT");
                    jVar.a(new int[]{478}, "UZ");
                    jVar.a(new int[]{479}, "LK");
                    jVar.a(new int[]{480}, "PH");
                    jVar.a(new int[]{481}, "BY");
                    jVar.a(new int[]{482}, "UA");
                    jVar.a(new int[]{484}, "MD");
                    jVar.a(new int[]{485}, "AM");
                    jVar.a(new int[]{486}, "GE");
                    jVar.a(new int[]{487}, "KZ");
                    jVar.a(new int[]{489}, "HK");
                    jVar.a(new int[]{490, 499}, "JP");
                    jVar.a(new int[]{500, 509}, "GB");
                    jVar.a(new int[]{520}, "GR");
                    jVar.a(new int[]{528}, "LB");
                    jVar.a(new int[]{529}, "CY");
                    jVar.a(new int[]{531}, "MK");
                    jVar.a(new int[]{535}, "MT");
                    jVar.a(new int[]{539}, "IE");
                    jVar.a(new int[]{540, 549}, "BE/LU");
                    jVar.a(new int[]{560}, "PT");
                    jVar.a(new int[]{569}, "IS");
                    jVar.a(new int[]{570, 579}, "DK");
                    jVar.a(new int[]{590}, "PL");
                    jVar.a(new int[]{594}, "RO");
                    jVar.a(new int[]{599}, "HU");
                    jVar.a(new int[]{600, 601}, "ZA");
                    jVar.a(new int[]{603}, "GH");
                    jVar.a(new int[]{608}, "BH");
                    jVar.a(new int[]{609}, "MU");
                    jVar.a(new int[]{611}, "MA");
                    jVar.a(new int[]{613}, "DZ");
                    jVar.a(new int[]{616}, "KE");
                    jVar.a(new int[]{618}, "CI");
                    jVar.a(new int[]{619}, "TN");
                    jVar.a(new int[]{621}, "SY");
                    jVar.a(new int[]{622}, "EG");
                    jVar.a(new int[]{624}, "LY");
                    jVar.a(new int[]{625}, "JO");
                    jVar.a(new int[]{626}, "IR");
                    jVar.a(new int[]{627}, "KW");
                    jVar.a(new int[]{628}, "SA");
                    jVar.a(new int[]{629}, "AE");
                    jVar.a(new int[]{640, 649}, "FI");
                    jVar.a(new int[]{690, 695}, "CN");
                    jVar.a(new int[]{700, 709}, "NO");
                    jVar.a(new int[]{729}, "IL");
                    jVar.a(new int[]{730, 739}, "SE");
                    jVar.a(new int[]{740}, "GT");
                    jVar.a(new int[]{741}, "SV");
                    jVar.a(new int[]{742}, "HN");
                    jVar.a(new int[]{743}, "NI");
                    jVar.a(new int[]{744}, "CR");
                    jVar.a(new int[]{745}, "PA");
                    jVar.a(new int[]{746}, "DO");
                    jVar.a(new int[]{750}, "MX");
                    jVar.a(new int[]{754, 755}, "CA");
                    jVar.a(new int[]{759}, "VE");
                    jVar.a(new int[]{760, 769}, "CH");
                    jVar.a(new int[]{770}, "CO");
                    jVar.a(new int[]{773}, "UY");
                    jVar.a(new int[]{775}, "PE");
                    jVar.a(new int[]{777}, "BO");
                    jVar.a(new int[]{779}, "AR");
                    jVar.a(new int[]{780}, "CL");
                    jVar.a(new int[]{784}, "PY");
                    jVar.a(new int[]{785}, "PE");
                    jVar.a(new int[]{786}, "EC");
                    jVar.a(new int[]{789, 790}, "BR");
                    jVar.a(new int[]{800, 839}, "IT");
                    jVar.a(new int[]{840, 849}, "ES");
                    jVar.a(new int[]{850}, "CU");
                    jVar.a(new int[]{858}, "SK");
                    jVar.a(new int[]{859}, "CZ");
                    jVar.a(new int[]{860}, "YU");
                    jVar.a(new int[]{865}, "MN");
                    jVar.a(new int[]{867}, "KP");
                    jVar.a(new int[]{868, 869}, "TR");
                    jVar.a(new int[]{870, 879}, "NL");
                    jVar.a(new int[]{880}, "KR");
                    jVar.a(new int[]{885}, "TH");
                    jVar.a(new int[]{888}, "SG");
                    jVar.a(new int[]{890}, "IN");
                    jVar.a(new int[]{893}, "VN");
                    jVar.a(new int[]{896}, "PK");
                    jVar.a(new int[]{899}, "ID");
                    jVar.a(new int[]{900, 919}, "AT");
                    jVar.a(new int[]{930, 939}, "AU");
                    jVar.a(new int[]{940, 949}, "AZ");
                    jVar.a(new int[]{955}, "MY");
                    jVar.a(new int[]{958}, "MO");
                }
            }
            int parseInt = Integer.parseInt(sb3.substring(0, 3));
            int size = ((ArrayList) jVar.f16599a).size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                int[] iArr3 = (int[]) ((ArrayList) jVar.f16599a).get(i15);
                int i16 = iArr3[0];
                if (parseInt < i16) {
                    break;
                }
                if (iArr3.length != 1) {
                    i16 = iArr3[1];
                }
                if (parseInt <= i16) {
                    str = (String) ((ArrayList) jVar.f16600b).get(i15);
                    break;
                }
                i15++;
            }
            if (str != null) {
                nVar.b(o.f8244v, str);
            }
        }
        nVar.b(o.f8235A, "]E" + (n6 == P8.a.f8186u ? 4 : 0));
        return nVar;
    }

    public abstract P8.a n();
}
