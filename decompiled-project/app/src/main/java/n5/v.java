package n5;

import N6.L;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f21226d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f21227e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final L f21228f = L.E(5, M6.e.f6797a, M6.e.f6799c, M6.e.f6802f, M6.e.f6800d, M6.e.f6801e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f21229a;

    /* renamed from: b, reason: collision with root package name */
    public int f21230b;

    /* renamed from: c, reason: collision with root package name */
    public int f21231c;

    public v() {
        this.f21229a = D.f21146f;
    }

    public v(int i7) {
        this.f21229a = new byte[i7];
        this.f21231c = i7;
    }

    public v(byte[] bArr) {
        this.f21229a = bArr;
        this.f21231c = bArr.length;
    }

    public v(byte[] bArr, int i7) {
        this.f21229a = bArr;
        this.f21231c = i7;
    }

    public final int A() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = (bArr[i7] & 255) << 8;
        this.f21230b = i7 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long B() {
        int i7;
        int i10;
        long j = this.f21229a[this.f21230b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j) != 0) {
                i11--;
            } else if (i11 < 6) {
                j &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(A3.c.h("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i7 = 1; i7 < i10; i7++) {
            if ((this.f21229a[this.f21230b + i7] & 192) != 128) {
                throw new NumberFormatException(A3.c.h("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f21230b += i10;
        return j;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f21229a;
            int i7 = this.f21230b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f21230b = i7 + 3;
                return M6.e.f6799c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f21229a;
        int i10 = this.f21230b;
        byte b2 = bArr2[i10];
        if (b2 == -2 && bArr2[i10 + 1] == -1) {
            this.f21230b = i10 + 2;
            return M6.e.f6800d;
        }
        if (b2 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f21230b = i10 + 2;
        return M6.e.f6801e;
    }

    public final void D(int i7) {
        byte[] bArr = this.f21229a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        E(i7, bArr);
    }

    public final void E(int i7, byte[] bArr) {
        this.f21229a = bArr;
        this.f21231c = i7;
        this.f21230b = 0;
    }

    public final void F(int i7) {
        AbstractC1705a.h(i7 >= 0 && i7 <= this.f21229a.length);
        this.f21231c = i7;
    }

    public final void G(int i7) {
        AbstractC1705a.h(i7 >= 0 && i7 <= this.f21231c);
        this.f21230b = i7;
    }

    public final void H(int i7) {
        G(this.f21230b + i7);
    }

    public final int a() {
        return this.f21231c - this.f21230b;
    }

    public final void b(int i7) {
        byte[] bArr = this.f21229a;
        if (i7 > bArr.length) {
            this.f21229a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        AbstractC1705a.g("Unsupported charset: " + charset, f21228f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b2;
        int i7;
        byte b10;
        byte b11;
        if ((charset.equals(M6.e.f6799c) || charset.equals(M6.e.f6797a)) && a() >= 1) {
            long j = this.f21229a[this.f21230b] & 255;
            char c10 = (char) j;
            Q5.e.j(j, "Out of range: %s", ((long) c10) == j);
            b2 = (byte) c10;
            i7 = 1;
        } else {
            i7 = 2;
            if ((charset.equals(M6.e.f6802f) || charset.equals(M6.e.f6800d)) && a() >= 2) {
                byte[] bArr = this.f21229a;
                int i10 = this.f21230b;
                b10 = bArr[i10];
                b11 = bArr[i10 + 1];
            } else {
                if (!charset.equals(M6.e.f6801e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f21229a;
                int i11 = this.f21230b;
                b10 = bArr2[i11 + 1];
                b11 = bArr2[i11];
            }
            b2 = (byte) ((char) ((b11 & 255) | (b10 << 8)));
        }
        long j10 = b2;
        char c11 = (char) j10;
        Q5.e.j(j10, "Out of range: %s", ((long) c11) == j10);
        return (c11 << 16) + i7;
    }

    public final int e() {
        return this.f21229a[this.f21230b] & 255;
    }

    public final void f(int i7, byte[] bArr, int i10) {
        System.arraycopy(this.f21229a, this.f21230b, bArr, i7, i10);
        this.f21230b += i10;
    }

    public final char g(Charset charset, char[] cArr) {
        int d10 = d(charset);
        if (d10 != 0) {
            char c10 = (char) (d10 >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f21230b += d10 & 65535;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = (bArr[i7] & 255) << 24;
        int i12 = i7 + 2;
        this.f21230b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i7 + 3;
        this.f21230b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f21230b = i7 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final String i(Charset charset) {
        int i7;
        AbstractC1705a.g("Unsupported charset: " + charset, f21228f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = M6.e.f6797a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(M6.e.f6799c) || charset.equals(charset2)) {
            i7 = 1;
        } else {
            if (!charset.equals(M6.e.f6802f) && !charset.equals(M6.e.f6801e) && !charset.equals(M6.e.f6800d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        }
        int i10 = this.f21230b;
        while (true) {
            int i11 = this.f21231c;
            if (i10 >= i11 - (i7 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(M6.e.f6799c) || charset.equals(M6.e.f6797a)) && D.K(this.f21229a[i10])) {
                break;
            }
            if (charset.equals(M6.e.f6802f) || charset.equals(M6.e.f6800d)) {
                byte[] bArr = this.f21229a;
                if (bArr[i10] == 0 && D.K(bArr[i10 + 1])) {
                    break;
                }
            }
            if (charset.equals(M6.e.f6801e)) {
                byte[] bArr2 = this.f21229a;
                if (bArr2[i10 + 1] == 0 && D.K(bArr2[i10])) {
                    break;
                }
            }
            i10 += i7;
        }
        String t5 = t(i10 - this.f21230b, charset);
        if (this.f21230b != this.f21231c && g(charset, f21226d) == '\r') {
            g(charset, f21227e);
        }
        return t5;
    }

    public final int j() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = bArr[i7] & 255;
        int i12 = i7 + 2;
        this.f21230b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i7 + 3;
        this.f21230b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f21230b = i7 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long k() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        this.f21230b = i7 + 1;
        this.f21230b = i7 + 2;
        this.f21230b = i7 + 3;
        long j = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f21230b = i7 + 4;
        long j10 = j | ((bArr[r8] & 255) << 24);
        this.f21230b = i7 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.f21230b = i7 + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.f21230b = i7 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.f21230b = i7 + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    public final short l() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = bArr[i7] & 255;
        this.f21230b = i7 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long m() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        this.f21230b = i7 + 1;
        this.f21230b = i7 + 2;
        this.f21230b = i7 + 3;
        long j = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f21230b = i7 + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int n() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(h3.o.l(j, "Top bit not zero: "));
    }

    public final int o() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = bArr[i7] & 255;
        this.f21230b = i7 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long p() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        this.f21230b = i7 + 1;
        this.f21230b = i7 + 2;
        this.f21230b = i7 + 3;
        long j = ((bArr[i7] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f21230b = i7 + 4;
        long j10 = j | ((bArr[r4] & 255) << 32);
        this.f21230b = i7 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 24);
        this.f21230b = i7 + 6;
        long j12 = j11 | ((bArr[r4] & 255) << 16);
        this.f21230b = i7 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 8);
        this.f21230b = i7 + 8;
        return (bArr[r4] & 255) | j13;
    }

    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f21230b;
        while (i7 < this.f21231c && this.f21229a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f21229a;
        int i10 = this.f21230b;
        int i11 = D.f21141a;
        String str = new String(bArr, i10, i7 - i10, M6.e.f6799c);
        this.f21230b = i7;
        if (i7 < this.f21231c) {
            this.f21230b = i7 + 1;
        }
        return str;
    }

    public final String r(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i10 = this.f21230b;
        int i11 = (i10 + i7) - 1;
        int i12 = (i11 >= this.f21231c || this.f21229a[i11] != 0) ? i7 : i7 - 1;
        byte[] bArr = this.f21229a;
        int i13 = D.f21141a;
        String str = new String(bArr, i10, i12, M6.e.f6799c);
        this.f21230b += i7;
        return str;
    }

    public final short s() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = (bArr[i7] & 255) << 8;
        this.f21230b = i7 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String t(int i7, Charset charset) {
        String str = new String(this.f21229a, this.f21230b, i7, charset);
        this.f21230b += i7;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        this.f21230b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final long w() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        this.f21230b = i7 + 1;
        this.f21230b = i7 + 2;
        this.f21230b = i7 + 3;
        long j = ((bArr[i7] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f21230b = i7 + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int x() {
        byte[] bArr = this.f21229a;
        int i7 = this.f21230b;
        int i10 = i7 + 1;
        this.f21230b = i10;
        int i11 = (bArr[i7] & 255) << 16;
        int i12 = i7 + 2;
        this.f21230b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.f21230b = i7 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int y() {
        int h10 = h();
        if (h10 >= 0) {
            return h10;
        }
        throw new IllegalStateException(h3.o.l(h10, "Top bit not zero: "));
    }

    public final long z() {
        long p10 = p();
        if (p10 >= 0) {
            return p10;
        }
        throw new IllegalStateException(A3.c.h("Top bit not zero: ", p10));
    }
}
