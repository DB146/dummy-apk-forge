package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808k extends h3.H {
    public static final Logger g = Logger.getLogger(C0808k.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f13425h = j0.f13423e;

    /* renamed from: b, reason: collision with root package name */
    public E f13426b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13428d;

    /* renamed from: e, reason: collision with root package name */
    public int f13429e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f13430f;

    public C0808k(OutputStream outputStream, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i7, 20);
        this.f13427c = new byte[max];
        this.f13428d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f13430f = outputStream;
    }

    public static int R(int i7) {
        return h0(i7) + 1;
    }

    public static int S(int i7, C0804g c0804g) {
        int h02 = h0(i7);
        int size = c0804g.size();
        return j0(size) + size + h02;
    }

    public static int T(int i7) {
        return h0(i7) + 8;
    }

    public static int U(int i7, int i10) {
        return l0(i10) + h0(i7);
    }

    public static int V(int i7) {
        return h0(i7) + 4;
    }

    public static int W(int i7) {
        return h0(i7) + 8;
    }

    public static int X(int i7) {
        return h0(i7) + 4;
    }

    public static int Y(int i7, AbstractC0798a abstractC0798a, W w10) {
        return abstractC0798a.a(w10) + (h0(i7) * 2);
    }

    public static int Z(int i7, int i10) {
        return l0(i10) + h0(i7);
    }

    public static int a0(int i7, long j) {
        return l0(j) + h0(i7);
    }

    public static int b0(int i7) {
        return h0(i7) + 4;
    }

    public static int c0(int i7) {
        return h0(i7) + 8;
    }

    public static int d0(int i7, int i10) {
        return j0((i10 >> 31) ^ (i10 << 1)) + h0(i7);
    }

    public static int e0(int i7, long j) {
        return l0((j >> 63) ^ (j << 1)) + h0(i7);
    }

    public static int f0(int i7, String str) {
        return g0(str) + h0(i7);
    }

    public static int g0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0819w.f13467a).length;
        }
        return j0(length) + length;
    }

    public static int h0(int i7) {
        return j0(i7 << 3);
    }

    public static int i0(int i7, int i10) {
        return j0(i10) + h0(i7);
    }

    public static int j0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int k0(int i7, long j) {
        return l0(j) + h0(i7);
    }

    public static int l0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0(String str) {
        try {
            int length = str.length() * 3;
            int j02 = j0(length);
            int i7 = j02 + length;
            int i10 = this.f13428d;
            if (i7 > i10) {
                byte[] bArr = new byte[length];
                int m10 = m0.f13436a.m(str, bArr, 0, length);
                D0(m10);
                p0(bArr, 0, m10);
                return;
            }
            if (i7 > i10 - this.f13429e) {
                m0();
            }
            int j03 = j0(str.length());
            int i11 = this.f13429e;
            byte[] bArr2 = this.f13427c;
            try {
                try {
                    if (j03 == j02) {
                        int i12 = i11 + j03;
                        this.f13429e = i12;
                        int m11 = m0.f13436a.m(str, bArr2, i12, i10 - i12);
                        this.f13429e = i11;
                        P((m11 - i11) - j03);
                        this.f13429e = m11;
                    } else {
                        int a9 = m0.a(str);
                        P(a9);
                        this.f13429e = m0.f13436a.m(str, bArr2, this.f13429e, a9);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new A3.e(e2);
                }
            } catch (l0 e10) {
                this.f13429e = i11;
                throw e10;
            }
        } catch (l0 e11) {
            g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(AbstractC0819w.f13467a);
            try {
                D0(bytes.length);
                L(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new A3.e(e12);
            }
        }
    }

    public final void B0(int i7, int i10) {
        D0((i7 << 3) | i10);
    }

    public final void C0(int i7, int i10) {
        n0(20);
        O(i7, 0);
        P(i10);
    }

    public final void D0(int i7) {
        n0(5);
        P(i7);
    }

    public final void E0(int i7, long j) {
        n0(20);
        O(i7, 0);
        Q(j);
    }

    public final void F0(long j) {
        n0(10);
        Q(j);
    }

    @Override // h3.H
    public final void L(int i7, byte[] bArr, int i10) {
        p0(bArr, i7, i10);
    }

    public final void M(int i7) {
        int i10 = this.f13429e;
        int i11 = i10 + 1;
        this.f13429e = i11;
        byte[] bArr = this.f13427c;
        bArr[i10] = (byte) (i7 & 255);
        int i12 = i10 + 2;
        this.f13429e = i12;
        bArr[i11] = (byte) ((i7 >> 8) & 255);
        int i13 = i10 + 3;
        this.f13429e = i13;
        bArr[i12] = (byte) ((i7 >> 16) & 255);
        this.f13429e = i10 + 4;
        bArr[i13] = (byte) ((i7 >> 24) & 255);
    }

    public final void N(long j) {
        int i7 = this.f13429e;
        int i10 = i7 + 1;
        this.f13429e = i10;
        byte[] bArr = this.f13427c;
        bArr[i7] = (byte) (j & 255);
        int i11 = i7 + 2;
        this.f13429e = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i7 + 3;
        this.f13429e = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i7 + 4;
        this.f13429e = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i7 + 5;
        this.f13429e = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i7 + 6;
        this.f13429e = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i7 + 7;
        this.f13429e = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f13429e = i7 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void O(int i7, int i10) {
        P((i7 << 3) | i10);
    }

    public final void P(int i7) {
        boolean z8 = f13425h;
        byte[] bArr = this.f13427c;
        if (z8) {
            while ((i7 & (-128)) != 0) {
                int i10 = this.f13429e;
                this.f13429e = i10 + 1;
                j0.j(bArr, i10, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            int i11 = this.f13429e;
            this.f13429e = i11 + 1;
            j0.j(bArr, i11, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i12 = this.f13429e;
            this.f13429e = i12 + 1;
            bArr[i12] = (byte) ((i7 | 128) & 255);
            i7 >>>= 7;
        }
        int i13 = this.f13429e;
        this.f13429e = i13 + 1;
        bArr[i13] = (byte) i7;
    }

    public final void Q(long j) {
        boolean z8 = f13425h;
        byte[] bArr = this.f13427c;
        if (z8) {
            while ((j & (-128)) != 0) {
                int i7 = this.f13429e;
                this.f13429e = i7 + 1;
                j0.j(bArr, i7, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i10 = this.f13429e;
            this.f13429e = i10 + 1;
            j0.j(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f13429e;
            this.f13429e = i11 + 1;
            bArr[i11] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i12 = this.f13429e;
        this.f13429e = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void m0() {
        this.f13430f.write(this.f13427c, 0, this.f13429e);
        this.f13429e = 0;
    }

    public final void n0(int i7) {
        if (this.f13428d - this.f13429e < i7) {
            m0();
        }
    }

    public final void o0(byte b2) {
        if (this.f13429e == this.f13428d) {
            m0();
        }
        int i7 = this.f13429e;
        this.f13429e = i7 + 1;
        this.f13427c[i7] = b2;
    }

    public final void p0(byte[] bArr, int i7, int i10) {
        int i11 = this.f13429e;
        int i12 = this.f13428d;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f13427c;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, bArr2, i11, i10);
            this.f13429e += i10;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i11, i13);
        int i14 = i7 + i13;
        int i15 = i10 - i13;
        this.f13429e = i12;
        m0();
        if (i15 > i12) {
            this.f13430f.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f13429e = i15;
        }
    }

    public final void q0(int i7, boolean z8) {
        n0(11);
        O(i7, 0);
        byte b2 = z8 ? (byte) 1 : (byte) 0;
        int i10 = this.f13429e;
        this.f13429e = i10 + 1;
        this.f13427c[i10] = b2;
    }

    public final void r0(int i7, C0804g c0804g) {
        B0(i7, 2);
        s0(c0804g);
    }

    public final void s0(C0804g c0804g) {
        D0(c0804g.size());
        L(c0804g.y(), c0804g.f13399b, c0804g.size());
    }

    public final void t0(int i7, int i10) {
        n0(14);
        O(i7, 5);
        M(i10);
    }

    public final void u0(int i7) {
        n0(4);
        M(i7);
    }

    public final void v0(int i7, long j) {
        n0(18);
        O(i7, 1);
        N(j);
    }

    public final void w0(long j) {
        n0(8);
        N(j);
    }

    public final void x0(int i7, int i10) {
        n0(20);
        O(i7, 0);
        if (i10 >= 0) {
            P(i10);
        } else {
            Q(i10);
        }
    }

    public final void y0(int i7) {
        if (i7 >= 0) {
            D0(i7);
        } else {
            F0(i7);
        }
    }

    public final void z0(int i7, String str) {
        B0(i7, 2);
        A0(str);
    }
}
