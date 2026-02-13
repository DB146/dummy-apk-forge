package d9;

import P8.n;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class e extends k {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f16583l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16584h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f16585i;

    public e(int i7) {
        this.f16584h = i7;
        switch (i7) {
            case 1:
                this.f16585i = new int[4];
                return;
            case 2:
                this.f16585i = new int[4];
                return;
            case 3:
                this.f16585i = new e(0);
                return;
            default:
                this.f16585i = new int[4];
                return;
        }
    }

    public static n o(n nVar) {
        String str = nVar.f8230a;
        if (str.charAt(0) != '0') {
            throw P8.f.a();
        }
        n nVar2 = new n(str.substring(1), null, nVar.f8232c, P8.a.f8176C);
        EnumMap enumMap = nVar.f8234e;
        if (enumMap != null) {
            nVar2.a(enumMap);
        }
        return nVar2;
    }

    @Override // d9.h, P8.l
    public n a(P8.b bVar, EnumMap enumMap) {
        switch (this.f16584h) {
            case 3:
                return o(((e) this.f16585i).a(bVar, enumMap));
            default:
                return super.a(bVar, enumMap);
        }
    }

    @Override // d9.k, d9.h
    public n b(int i7, V8.a aVar, EnumMap enumMap) {
        switch (this.f16584h) {
            case 3:
                return o(((e) this.f16585i).b(i7, aVar, enumMap));
            default:
                return super.b(i7, aVar, enumMap);
        }
    }

    @Override // d9.k
    public boolean g(String str) {
        switch (this.f16584h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(str.charAt(0));
                char c10 = cArr[5];
                switch (c10) {
                    case '0':
                    case '1':
                    case '2':
                        sb2.append(cArr, 0, 2);
                        sb2.append(c10);
                        sb2.append("0000");
                        sb2.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb2.append(cArr, 0, 3);
                        sb2.append("00000");
                        sb2.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb2.append(cArr, 0, 4);
                        sb2.append("00000");
                        sb2.append(cArr[4]);
                        break;
                    default:
                        sb2.append(cArr, 0, 5);
                        sb2.append("0000");
                        sb2.append(c10);
                        break;
                }
                if (str.length() >= 8) {
                    sb2.append(str.charAt(7));
                }
                return super.g(sb2.toString());
            default:
                return super.g(str);
        }
    }

    @Override // d9.k
    public int[] i(V8.a aVar, int i7) {
        switch (this.f16584h) {
            case 1:
                return k.l(aVar, i7, true, k, new int[6]);
            default:
                return super.i(aVar, i7);
        }
    }

    @Override // d9.k
    public final int j(V8.a aVar, int[] iArr, StringBuilder sb2) {
        int[][] iArr2;
        switch (this.f16584h) {
            case 0:
                int[] iArr3 = (int[]) this.f16585i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i7 = aVar.f10193b;
                int i10 = iArr[1];
                int i11 = 0;
                for (int i12 = 0; i12 < 6 && i10 < i7; i12++) {
                    int h10 = k.h(aVar, iArr3, i10, k.g);
                    sb2.append((char) ((h10 % 10) + 48));
                    for (int i13 : iArr3) {
                        i10 += i13;
                    }
                    if (h10 >= 10) {
                        i11 |= 1 << (5 - i12);
                    }
                }
                for (int i14 = 0; i14 < 10; i14++) {
                    if (i11 == j[i14]) {
                        sb2.insert(0, (char) (i14 + 48));
                        int i15 = k.l(aVar, i10, true, k.f16602e, new int[5])[1];
                        for (int i16 = 0; i16 < 6 && i15 < i7; i16++) {
                            sb2.append((char) (k.h(aVar, iArr3, i15, k.f16603f) + 48));
                            for (int i17 : iArr3) {
                                i15 += i17;
                            }
                        }
                        return i15;
                    }
                }
                throw P8.j.a();
            case 1:
                int[] iArr4 = (int[]) this.f16585i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i18 = aVar.f10193b;
                int i19 = iArr[1];
                int i20 = 0;
                for (int i21 = 0; i21 < 6 && i19 < i18; i21++) {
                    int h11 = k.h(aVar, iArr4, i19, k.g);
                    sb2.append((char) ((h11 % 10) + 48));
                    for (int i22 : iArr4) {
                        i19 += i22;
                    }
                    if (h11 >= 10) {
                        i20 |= 1 << (5 - i21);
                    }
                }
                for (int i23 = 0; i23 <= 1; i23++) {
                    for (int i24 = 0; i24 < 10; i24++) {
                        if (i20 == f16583l[i23][i24]) {
                            sb2.insert(0, (char) (i23 + 48));
                            sb2.append((char) (i24 + 48));
                            return i19;
                        }
                    }
                }
                throw P8.j.a();
            case 2:
                int[] iArr5 = (int[]) this.f16585i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i25 = aVar.f10193b;
                int i26 = iArr[1];
                int i27 = 0;
                while (true) {
                    iArr2 = k.f16603f;
                    if (i27 < 4 && i26 < i25) {
                        sb2.append((char) (k.h(aVar, iArr5, i26, iArr2) + 48));
                        for (int i28 : iArr5) {
                            i26 += i28;
                        }
                        i27++;
                    }
                }
                int i29 = k.l(aVar, i26, true, k.f16602e, new int[5])[1];
                for (int i30 = 0; i30 < 4 && i29 < i25; i30++) {
                    sb2.append((char) (k.h(aVar, iArr5, i29, iArr2) + 48));
                    for (int i31 : iArr5) {
                        i29 += i31;
                    }
                }
                return i29;
            default:
                return ((e) this.f16585i).j(aVar, iArr, sb2);
        }
    }

    @Override // d9.k
    public n k(int i7, V8.a aVar, int[] iArr, EnumMap enumMap) {
        switch (this.f16584h) {
            case 3:
                return o(((e) this.f16585i).k(i7, aVar, iArr, enumMap));
            default:
                return super.k(i7, aVar, iArr, enumMap);
        }
    }

    @Override // d9.k
    public final P8.a n() {
        switch (this.f16584h) {
            case 0:
                return P8.a.f8187v;
            case 1:
                return P8.a.f8177D;
            case 2:
                return P8.a.f8186u;
            default:
                return P8.a.f8176C;
        }
    }
}
