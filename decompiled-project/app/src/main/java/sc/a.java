package sc;

import ac.AbstractC0796a;
import kotlin.jvm.internal.l;
import rc.C1964h;
import rc.D;
import rc.y;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24355a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f24356b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0796a.f12815a);
        l.d(bytes, "getBytes(...)");
        f24355a = bytes;
        f24356b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean a(D d10, int i7, byte[] bArr, int i10, int i11) {
        int i12 = d10.f23933c;
        byte[] bArr2 = d10.f23931a;
        while (i10 < i11) {
            if (i7 == i12) {
                d10 = d10.f23936f;
                l.b(d10);
                i7 = d10.f23932b;
                i12 = d10.f23933c;
                bArr2 = d10.f23931a;
            }
            if (bArr2[i7] != bArr[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    public static final String b(long j, C1964h c1964h) {
        l.e(c1964h, "<this>");
        if (j > 0) {
            long j10 = j - 1;
            if (c1964h.P(j10) == 13) {
                String c02 = c1964h.c0(j10, AbstractC0796a.f12815a);
                c1964h.f0(2L);
                return c02;
            }
        }
        String c03 = c1964h.c0(j, AbstractC0796a.f12815a);
        c1964h.f0(1L);
        return c03;
    }

    public static final int c(C1964h c1964h, y options, boolean z8) {
        int i7;
        int i10;
        D d10;
        byte[] bArr;
        int i11;
        l.e(c1964h, "<this>");
        l.e(options, "options");
        D d11 = c1964h.f23965a;
        int i12 = -2;
        if (d11 == null) {
            return z8 ? -2 : -1;
        }
        int i13 = d11.f23932b;
        int i14 = d11.f23933c;
        byte[] bArr2 = d11.f23931a;
        D d12 = d11;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int[] iArr = options.f24005b;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (d12 == null) {
                break;
            }
            if (i18 >= 0) {
                int i21 = i13 + 1;
                int i22 = bArr2[i13] & 255;
                int i23 = i19 + i18;
                while (i19 != i23) {
                    if (i22 == iArr[i19]) {
                        i7 = iArr[i19 + i18];
                        if (i21 == i14) {
                            d12 = d12.f23936f;
                            l.b(d12);
                            i10 = d12.f23932b;
                            i14 = d12.f23933c;
                            bArr2 = d12.f23931a;
                            if (d12 == d11) {
                                d12 = null;
                            }
                        } else {
                            i10 = i21;
                        }
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            int i24 = (i18 * (-1)) + i19;
            while (true) {
                int i25 = i13 + 1;
                int i26 = i19 + 1;
                if ((bArr2[i13] & 255) != iArr[i19]) {
                    return i15;
                }
                boolean z10 = i26 == i24;
                if (i25 == i14) {
                    l.b(d12);
                    D d13 = d12.f23936f;
                    l.b(d13);
                    i11 = d13.f23932b;
                    int i27 = d13.f23933c;
                    bArr = d13.f23931a;
                    if (d13 != d11) {
                        d10 = d13;
                        i14 = i27;
                    } else {
                        if (!z10) {
                            break loop0;
                        }
                        i14 = i27;
                        d10 = null;
                    }
                } else {
                    d10 = d12;
                    bArr = bArr2;
                    i11 = i25;
                }
                if (z10) {
                    i7 = iArr[i26];
                    i10 = i11;
                    bArr2 = bArr;
                    d12 = d10;
                    break;
                }
                i13 = i11;
                bArr2 = bArr;
                d12 = d10;
                i19 = i26;
            }
            if (i7 >= 0) {
                return i7;
            }
            i16 = -i7;
            i13 = i10;
            i12 = -2;
        }
        return z8 ? i12 : i15;
    }
}
