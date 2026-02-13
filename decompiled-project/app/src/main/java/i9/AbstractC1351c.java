package i9;

import Q7.h;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.math.BigInteger;

/* renamed from: i9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1351c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f18472a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f18473b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger[] f18474c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f18474c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i7 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f18474c;
            if (i7 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i7] = bigIntegerArr2[i7 - 1].multiply(valueOf);
            i7++;
        }
    }

    public static String a(int[] iArr, int i7) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i10 = 0; i10 < i7; i10++) {
            bigInteger = bigInteger.add(f18474c[(i7 - i10) - 1].multiply(BigInteger.valueOf(iArr[i10])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw P8.f.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x00c8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(int[] iArr, int[] iArr2, int i7, h hVar, int i10) {
        int i11;
        char c10;
        char c11;
        int i12;
        int i13 = i10;
        int i14 = i13;
        int i15 = i14;
        for (int i16 = 0; i16 < i7; i16++) {
            int i17 = iArr[i16];
            int b2 = P.c.b(i14);
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        char[] cArr = f18472a;
                        if (b2 != 3) {
                            if (b2 != 4) {
                                if (b2 == 5) {
                                    if (i17 < 29) {
                                        c10 = cArr[i17];
                                    } else if (i17 == 29 || i17 == 900) {
                                        c10 = 0;
                                        i14 = 1;
                                    } else {
                                        if (i17 == 913) {
                                            hVar.l((char) iArr2[i16]);
                                        }
                                        i14 = i15;
                                    }
                                }
                                c10 = 0;
                            } else if (i17 < 26) {
                                c10 = (char) (i17 + 65);
                            } else {
                                if (i17 != 26) {
                                    i12 = i17 != 900 ? i15 : 1;
                                    c11 = 0;
                                } else {
                                    i12 = i15;
                                    c11 = ' ';
                                }
                                i14 = i12;
                            }
                            i14 = i15;
                        } else if (i17 < 29) {
                            c10 = cArr[i17];
                        } else {
                            if (i17 == 29 || i17 == 900) {
                                i13 = 1;
                                i14 = 1;
                            } else if (i17 == 913) {
                                hVar.l((char) iArr2[i16]);
                            }
                            c10 = 0;
                        }
                    } else if (i17 < 25) {
                        c10 = f18473b[i17];
                    } else {
                        if (i17 != 900) {
                            if (i17 != 913) {
                                switch (i17) {
                                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                        i13 = 4;
                                        i14 = i13;
                                    case 26:
                                        c11 = ' ';
                                        break;
                                    case 27:
                                        i13 = 2;
                                        i14 = i13;
                                    case 29:
                                        i15 = i14;
                                        i14 = 6;
                                }
                            } else {
                                hVar.l((char) iArr2[i16]);
                            }
                            c11 = 0;
                        }
                        i13 = 1;
                        i14 = 1;
                        c11 = 0;
                    }
                } else if (i17 < 26) {
                    i11 = i17 + 97;
                    c10 = (char) i11;
                } else {
                    if (i17 == 900) {
                        i13 = 1;
                        i14 = 1;
                    } else if (i17 != 913) {
                        switch (i17) {
                            case 27:
                                i15 = i14;
                                i14 = 5;
                            case 28:
                                i13 = 3;
                                i14 = 3;
                            case 29:
                                i15 = i14;
                                i14 = 6;
                        }
                    } else {
                        hVar.l((char) iArr2[i16]);
                    }
                    c11 = 0;
                }
                c10 = c11;
            } else if (i17 < 26) {
                i11 = i17 + 65;
                c10 = (char) i11;
            } else {
                if (i17 == 900) {
                    i13 = 1;
                    i14 = 1;
                } else if (i17 != 913) {
                    switch (i17) {
                        case 26:
                            break;
                        case 27:
                            i13 = 2;
                            i14 = i13;
                        case 28:
                            i13 = 3;
                            i14 = i13;
                        case 29:
                            i15 = i14;
                            i14 = 6;
                        default:
                            c11 = 0;
                            break;
                    }
                    c10 = c11;
                } else {
                    hVar.l((char) iArr2[i16]);
                }
                c11 = 0;
                c10 = c11;
            }
            if (c10 != 0) {
                hVar.l(c10);
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        ((java.lang.StringBuilder) r10.f8695b).append(a(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int[] iArr, int i7, h hVar) {
        int[] iArr2 = new int[15];
        boolean z8 = false;
        int i10 = 0;
        while (true) {
            int i11 = iArr[0];
            if (i7 < i11 && !z8) {
                int i12 = i7 + 1;
                int i13 = iArr[i7];
                if (i12 == i11) {
                    z8 = true;
                }
                if (i13 < 900) {
                    iArr2[i10] = i13;
                    i10++;
                } else {
                    if (i13 != 900 && i13 != 901 && i13 != 927 && i13 != 928) {
                        switch (i13) {
                        }
                        if (i10 % 15 == 0 || i13 == 902 || z8) {
                        }
                    }
                    z8 = true;
                    if (i10 % 15 == 0) {
                    }
                }
                i7 = i12;
                if (i10 % 15 == 0) {
                }
            }
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0039. Please report as an issue. */
    public static int d(int[] iArr, int i7, h hVar) {
        int i10 = (iArr[0] - i7) * 2;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        boolean z8 = false;
        int i11 = 0;
        int i12 = 1;
        while (i7 < iArr[0] && !z8) {
            int i13 = i7 + 1;
            int i14 = iArr[i7];
            if (i14 < 900) {
                iArr2[i11] = i14 / 30;
                iArr2[i11 + 1] = i14 % 30;
                i11 += 2;
            } else if (i14 == 913) {
                iArr2[i11] = 913;
                i7 += 2;
                iArr3[i11] = iArr[i13];
                i11++;
            } else if (i14 != 927) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                z8 = true;
            } else {
                i12 = b(iArr2, iArr3, i11, hVar, i12);
                i7 += 2;
                hVar.m(iArr[i13]);
                int i15 = iArr[0];
                if (i7 > i15) {
                    throw P8.f.a();
                }
                int i16 = (i15 - i7) * 2;
                iArr2 = new int[i16];
                iArr3 = new int[i16];
                i11 = 0;
            }
            i7 = i13;
        }
        b(iArr2, iArr3, i11, hVar, i12);
        return i7;
    }
}
