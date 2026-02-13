package d9;

import P8.n;
import P8.o;
import P8.p;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16595c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16596a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16597b;

    public i(int i7) {
        switch (i7) {
            case 1:
                this.f16596a = new int[4];
                this.f16597b = new StringBuilder();
                return;
            default:
                this.f16596a = new int[4];
                this.f16597b = new StringBuilder();
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        if (r1.equals("99991") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n a(int i7, V8.a aVar, int[] iArr) {
        String str;
        String str2;
        EnumMap enumMap;
        char c10 = 2;
        StringBuilder sb2 = this.f16597b;
        int i10 = 0;
        sb2.setLength(0);
        int[] iArr2 = this.f16596a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i11 = aVar.f10193b;
        int i12 = iArr[1];
        int i13 = 0;
        int i14 = 0;
        while (i13 < 5 && i12 < i11) {
            int h10 = k.h(aVar, iArr2, i12, k.g);
            sb2.append((char) ((h10 % 10) + 48));
            int length = iArr2.length;
            while (i10 < length) {
                i12 += iArr2[i10];
                i10++;
            }
            if (h10 >= 10) {
                i14 |= 1 << (4 - i13);
            }
            if (i13 != 4) {
                i12 = aVar.f(aVar.e(i12));
            }
            i13++;
            i10 = 0;
        }
        if (sb2.length() != 5) {
            throw P8.j.a();
        }
        for (int i15 = 0; i15 < 10; i15++) {
            if (i14 == f16595c[i15]) {
                String sb3 = sb2.toString();
                int length2 = sb3.length();
                int i16 = 0;
                for (int i17 = length2 - 2; i17 >= 0; i17 -= 2) {
                    i16 += sb3.charAt(i17) - '0';
                }
                int i18 = i16 * 3;
                for (int i19 = length2 - 1; i19 >= 0; i19 -= 2) {
                    i18 += sb3.charAt(i19) - '0';
                }
                if ((i18 * 3) % 10 != i15) {
                    throw P8.j.a();
                }
                String sb4 = sb2.toString();
                if (sb4.length() == 5) {
                    char charAt = sb4.charAt(0);
                    if (charAt == '0') {
                        str = "£";
                    } else if (charAt != '5') {
                        str = "";
                        if (charAt == '9') {
                            switch (sb4.hashCode()) {
                                case 54118329:
                                    if (sb4.equals("90000")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 54395376:
                                    if (sb4.equals("99990")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 54395377:
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    str2 = null;
                                    break;
                                case 1:
                                    str2 = "Used";
                                    break;
                                case 2:
                                    str2 = "0.00";
                                    break;
                            }
                            if (str2 != null) {
                                enumMap = new EnumMap(o.class);
                                enumMap.put((EnumMap) o.f8243u, (o) str2);
                                float f4 = i7;
                                n nVar = new n(sb4, null, new p[]{new p((iArr[0] + iArr[1]) / 2.0f, f4), new p(i12, f4)}, P8.a.f8178E);
                                if (enumMap != null) {
                                    nVar.a(enumMap);
                                }
                                return nVar;
                            }
                        }
                    } else {
                        str = "$";
                    }
                    int parseInt = Integer.parseInt(sb4.substring(1));
                    String valueOf = String.valueOf(parseInt / 100);
                    int i20 = parseInt % 100;
                    str2 = str + valueOf + '.' + (i20 < 10 ? h3.o.l(i20, "0") : String.valueOf(i20));
                    if (str2 != null) {
                    }
                }
                enumMap = null;
                float f42 = i7;
                n nVar2 = new n(sb4, null, new p[]{new p((iArr[0] + iArr[1]) / 2.0f, f42), new p(i12, f42)}, P8.a.f8178E);
                if (enumMap != null) {
                }
                return nVar2;
            }
        }
        throw P8.j.a();
    }
}
