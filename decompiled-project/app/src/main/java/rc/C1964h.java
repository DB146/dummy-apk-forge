package rc;

import ac.AbstractC0796a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: rc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1964h implements InterfaceC1966j, InterfaceC1965i, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public D f23965a;

    /* renamed from: b, reason: collision with root package name */
    public long f23966b;

    public final void F(C1964h out, long j, long j10) {
        kotlin.jvm.internal.l.e(out, "out");
        AbstractC1958b.e(this.f23966b, j, j10);
        if (j10 == 0) {
            return;
        }
        out.f23966b += j10;
        D d10 = this.f23965a;
        while (true) {
            kotlin.jvm.internal.l.b(d10);
            long j11 = d10.f23933c - d10.f23932b;
            if (j < j11) {
                break;
            }
            j -= j11;
            d10 = d10.f23936f;
        }
        while (j10 > 0) {
            kotlin.jvm.internal.l.b(d10);
            D c10 = d10.c();
            int i7 = c10.f23932b + ((int) j);
            c10.f23932b = i7;
            c10.f23933c = Math.min(i7 + ((int) j10), c10.f23933c);
            D d11 = out.f23965a;
            if (d11 == null) {
                c10.g = c10;
                c10.f23936f = c10;
                out.f23965a = c10;
            } else {
                D d12 = d11.g;
                kotlin.jvm.internal.l.b(d12);
                d12.b(c10);
            }
            j10 -= c10.f23933c - c10.f23932b;
            d10 = d10.f23936f;
            j = 0;
        }
    }

    @Override // rc.InterfaceC1965i
    public final /* bridge */ /* synthetic */ InterfaceC1965i H(int i7, byte[] bArr) {
        j0(bArr, 0, i7);
        return this;
    }

    @Override // rc.InterfaceC1965i
    public final /* bridge */ /* synthetic */ InterfaceC1965i I(C1967k c1967k) {
        i0(c1967k);
        return this;
    }

    public final boolean K() {
        return this.f23966b == 0;
    }

    @Override // rc.InterfaceC1965i
    public final /* bridge */ /* synthetic */ InterfaceC1965i L(String str) {
        r0(str);
        return this;
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        long j10 = this.f23966b;
        if (j10 == 0) {
            return -1L;
        }
        if (j > j10) {
            j = j10;
        }
        sink.m(j, this);
        return j;
    }

    public final byte P(long j) {
        AbstractC1958b.e(this.f23966b, j, 1L);
        D d10 = this.f23965a;
        if (d10 == null) {
            kotlin.jvm.internal.l.b(null);
            throw null;
        }
        long j10 = this.f23966b;
        if (j10 - j < j) {
            while (j10 > j) {
                d10 = d10.g;
                kotlin.jvm.internal.l.b(d10);
                j10 -= d10.f23933c - d10.f23932b;
            }
            return d10.f23931a[(int) ((d10.f23932b + j) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i7 = d10.f23933c;
            int i10 = d10.f23932b;
            long j12 = (i7 - i10) + j11;
            if (j12 > j) {
                return d10.f23931a[(int) ((i10 + j) - j11)];
            }
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
            j11 = j12;
        }
    }

    @Override // rc.InterfaceC1966j
    public final String Q(Charset charset) {
        kotlin.jvm.internal.l.e(charset, "charset");
        return c0(this.f23966b, charset);
    }

    @Override // rc.InterfaceC1966j
    public final InputStream S() {
        return new C1963g(this, 0);
    }

    public final long T(C1967k targetBytes) {
        int i7;
        int i10;
        kotlin.jvm.internal.l.e(targetBytes, "targetBytes");
        D d10 = this.f23965a;
        if (d10 == null) {
            return -1L;
        }
        long j = this.f23966b;
        long j10 = 0;
        byte[] bArr = targetBytes.f23968a;
        if (j < 0) {
            while (j > 0) {
                d10 = d10.g;
                kotlin.jvm.internal.l.b(d10);
                j -= d10.f23933c - d10.f23932b;
            }
            if (bArr.length == 2) {
                byte b2 = bArr[0];
                byte b10 = bArr[1];
                while (j < this.f23966b) {
                    i7 = (int) ((d10.f23932b + j10) - j);
                    int i11 = d10.f23933c;
                    while (i7 < i11) {
                        byte b11 = d10.f23931a[i7];
                        if (b11 != b2 && b11 != b10) {
                            i7++;
                        }
                        i10 = d10.f23932b;
                    }
                    j10 = (d10.f23933c - d10.f23932b) + j;
                    d10 = d10.f23936f;
                    kotlin.jvm.internal.l.b(d10);
                    j = j10;
                }
                return -1L;
            }
            while (j < this.f23966b) {
                i7 = (int) ((d10.f23932b + j10) - j);
                int i12 = d10.f23933c;
                while (i7 < i12) {
                    byte b12 = d10.f23931a[i7];
                    for (byte b13 : bArr) {
                        if (b12 == b13) {
                            i10 = d10.f23932b;
                        }
                    }
                    i7++;
                }
                j10 = (d10.f23933c - d10.f23932b) + j;
                d10 = d10.f23936f;
                kotlin.jvm.internal.l.b(d10);
                j = j10;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j11 = (d10.f23933c - d10.f23932b) + j;
            if (j11 > 0) {
                break;
            }
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
            j = j11;
        }
        if (bArr.length == 2) {
            byte b14 = bArr[0];
            byte b15 = bArr[1];
            while (j < this.f23966b) {
                i7 = (int) ((d10.f23932b + j10) - j);
                int i13 = d10.f23933c;
                while (i7 < i13) {
                    byte b16 = d10.f23931a[i7];
                    if (b16 != b14 && b16 != b15) {
                        i7++;
                    }
                    i10 = d10.f23932b;
                }
                j10 = (d10.f23933c - d10.f23932b) + j;
                d10 = d10.f23936f;
                kotlin.jvm.internal.l.b(d10);
                j = j10;
            }
            return -1L;
        }
        while (j < this.f23966b) {
            i7 = (int) ((d10.f23932b + j10) - j);
            int i14 = d10.f23933c;
            while (i7 < i14) {
                byte b17 = d10.f23931a[i7];
                for (byte b18 : bArr) {
                    if (b17 == b18) {
                        i10 = d10.f23932b;
                    }
                }
                i7++;
            }
            j10 = (d10.f23933c - d10.f23932b) + j;
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
            j = j10;
        }
        return -1L;
        return (i7 - i10) + j;
    }

    public final int U(byte[] sink, int i7, int i10) {
        kotlin.jvm.internal.l.e(sink, "sink");
        AbstractC1958b.e(sink.length, i7, i10);
        D d10 = this.f23965a;
        if (d10 == null) {
            return -1;
        }
        int min = Math.min(i10, d10.f23933c - d10.f23932b);
        int i11 = d10.f23932b;
        Eb.n.N(d10.f23931a, i7, sink, i11, i11 + min);
        int i12 = d10.f23932b + min;
        d10.f23932b = i12;
        this.f23966b -= min;
        if (i12 == d10.f23933c) {
            this.f23965a = d10.a();
            E.a(d10);
        }
        return min;
    }

    public final byte V() {
        if (this.f23966b == 0) {
            throw new EOFException();
        }
        D d10 = this.f23965a;
        kotlin.jvm.internal.l.b(d10);
        int i7 = d10.f23932b;
        int i10 = d10.f23933c;
        int i11 = i7 + 1;
        byte b2 = d10.f23931a[i7];
        this.f23966b--;
        if (i11 == i10) {
            this.f23965a = d10.a();
            E.a(d10);
        } else {
            d10.f23932b = i11;
        }
        return b2;
    }

    public final byte[] W(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(A3.c.h("byteCount: ", j).toString());
        }
        if (this.f23966b < j) {
            throw new EOFException();
        }
        byte[] sink = new byte[(int) j];
        kotlin.jvm.internal.l.e(sink, "sink");
        int i7 = 0;
        while (i7 < sink.length) {
            int U8 = U(sink, i7, sink.length - i7);
            if (U8 == -1) {
                throw new EOFException();
            }
            i7 += U8;
        }
        return sink;
    }

    public final C1967k X(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(A3.c.h("byteCount: ", j).toString());
        }
        if (this.f23966b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C1967k(W(j));
        }
        C1967k g02 = g0((int) j);
        f0(j);
        return g02;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Y() {
        int i7;
        if (this.f23966b == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z8 = false;
        long j = 0;
        do {
            D d10 = this.f23965a;
            kotlin.jvm.internal.l.b(d10);
            int i11 = d10.f23932b;
            int i12 = d10.f23933c;
            while (i11 < i12) {
                byte b2 = d10.f23931a[i11];
                if (b2 >= 48 && b2 <= 57) {
                    i7 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i7 = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i7 = b2 - 55;
                } else {
                    if (i10 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(AbstractC1958b.j(b2)));
                    }
                    z8 = true;
                    if (i11 != i12) {
                        this.f23965a = d10.a();
                        E.a(d10);
                    } else {
                        d10.f23932b = i11;
                    }
                    if (!z8) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    ?? obj = new Object();
                    obj.n0(j);
                    obj.l0(b2);
                    throw new NumberFormatException("Number too large: ".concat(obj.d0()));
                }
                j = (j << 4) | i7;
                i11++;
                i10++;
            }
            if (i11 != i12) {
            }
            if (!z8) {
            }
        } while (this.f23965a != null);
        this.f23966b -= i10;
        return j;
    }

    public final int Z() {
        if (this.f23966b < 4) {
            throw new EOFException();
        }
        D d10 = this.f23965a;
        kotlin.jvm.internal.l.b(d10);
        int i7 = d10.f23932b;
        int i10 = d10.f23933c;
        if (i10 - i7 < 4) {
            return ((V() & 255) << 24) | ((V() & 255) << 16) | ((V() & 255) << 8) | (V() & 255);
        }
        byte[] bArr = d10.f23931a;
        int i11 = i7 + 3;
        int i12 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i13 = i7 + 4;
        int i14 = i12 | (bArr[i11] & 255);
        this.f23966b -= 4;
        if (i13 == i10) {
            this.f23965a = d10.a();
            E.a(d10);
        } else {
            d10.f23932b = i13;
        }
        return i14;
    }

    public final short a0() {
        if (this.f23966b < 2) {
            throw new EOFException();
        }
        D d10 = this.f23965a;
        kotlin.jvm.internal.l.b(d10);
        int i7 = d10.f23932b;
        int i10 = d10.f23933c;
        if (i10 - i7 < 2) {
            return (short) (((V() & 255) << 8) | (V() & 255));
        }
        int i11 = i7 + 1;
        byte[] bArr = d10.f23931a;
        int i12 = (bArr[i7] & 255) << 8;
        int i13 = i7 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f23966b -= 2;
        if (i13 == i10) {
            this.f23965a = d10.a();
            E.a(d10);
        } else {
            d10.f23932b = i13;
        }
        return (short) i14;
    }

    public final short b0() {
        short a02 = a0();
        return (short) (((a02 & 255) << 8) | ((65280 & a02) >>> 8));
    }

    @Override // rc.InterfaceC1966j
    public final C1964h c() {
        return this;
    }

    public final String c0(long j, Charset charset) {
        kotlin.jvm.internal.l.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(A3.c.h("byteCount: ", j).toString());
        }
        if (this.f23966b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        D d10 = this.f23965a;
        kotlin.jvm.internal.l.b(d10);
        int i7 = d10.f23932b;
        if (i7 + j > d10.f23933c) {
            return new String(W(j), charset);
        }
        int i10 = (int) j;
        String str = new String(d10.f23931a, i7, i10, charset);
        int i11 = d10.f23932b + i10;
        d10.f23932b = i11;
        this.f23966b -= j;
        if (i11 == d10.f23933c) {
            this.f23965a = d10.a();
            E.a(d10);
        }
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, rc.G
    public final void close() {
    }

    @Override // rc.InterfaceC1966j
    public final boolean d(long j) {
        return this.f23966b >= Long.MAX_VALUE;
    }

    public final String d0() {
        return c0(this.f23966b, AbstractC0796a.f12815a);
    }

    @Override // rc.H
    public final J e() {
        return J.f23942d;
    }

    public final int e0() {
        int i7;
        int i10;
        int i11;
        if (this.f23966b == 0) {
            throw new EOFException();
        }
        byte P10 = P(0L);
        if ((P10 & 128) == 0) {
            i7 = P10 & Byte.MAX_VALUE;
            i11 = 0;
            i10 = 1;
        } else if ((P10 & 224) == 192) {
            i7 = P10 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((P10 & 240) == 224) {
            i7 = P10 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((P10 & 248) != 240) {
                f0(1L);
                return 65533;
            }
            i7 = P10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j = i10;
        if (this.f23966b < j) {
            StringBuilder r10 = h3.o.r(i10, "size < ", ": ");
            r10.append(this.f23966b);
            r10.append(" (to read code point prefixed 0x");
            r10.append(AbstractC1958b.j(P10));
            r10.append(')');
            throw new EOFException(r10.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte P11 = P(j10);
            if ((P11 & 192) != 128) {
                f0(j10);
                return 65533;
            }
            i7 = (i7 << 6) | (P11 & 63);
        }
        f0(j);
        if (i7 > 1114111) {
            return 65533;
        }
        if ((55296 > i7 || i7 >= 57344) && i7 >= i11) {
            return i7;
        }
        return 65533;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1964h) {
                long j = this.f23966b;
                C1964h c1964h = (C1964h) obj;
                if (j == c1964h.f23966b) {
                    if (j != 0) {
                        D d10 = this.f23965a;
                        kotlin.jvm.internal.l.b(d10);
                        D d11 = c1964h.f23965a;
                        kotlin.jvm.internal.l.b(d11);
                        int i7 = d10.f23932b;
                        int i10 = d11.f23932b;
                        long j10 = 0;
                        while (j10 < this.f23966b) {
                            long min = Math.min(d10.f23933c - i7, d11.f23933c - i10);
                            long j11 = 0;
                            while (j11 < min) {
                                int i11 = i7 + 1;
                                byte b2 = d10.f23931a[i7];
                                int i12 = i10 + 1;
                                if (b2 == d11.f23931a[i10]) {
                                    j11++;
                                    i10 = i12;
                                    i7 = i11;
                                }
                            }
                            if (i7 == d10.f23933c) {
                                D d12 = d10.f23936f;
                                kotlin.jvm.internal.l.b(d12);
                                i7 = d12.f23932b;
                                d10 = d12;
                            }
                            if (i10 == d11.f23933c) {
                                d11 = d11.f23936f;
                                kotlin.jvm.internal.l.b(d11);
                                i10 = d11.f23932b;
                            }
                            j10 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f0(long j) {
        while (j > 0) {
            D d10 = this.f23965a;
            if (d10 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, d10.f23933c - d10.f23932b);
            long j10 = min;
            this.f23966b -= j10;
            j -= j10;
            int i7 = d10.f23932b + min;
            d10.f23932b = i7;
            if (i7 == d10.f23933c) {
                this.f23965a = d10.a();
                E.a(d10);
            }
        }
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
    }

    public final C1967k g0(int i7) {
        if (i7 == 0) {
            return C1967k.f23967d;
        }
        AbstractC1958b.e(this.f23966b, 0L, i7);
        D d10 = this.f23965a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i7) {
            kotlin.jvm.internal.l.b(d10);
            int i13 = d10.f23933c;
            int i14 = d10.f23932b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            d10 = d10.f23936f;
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        D d11 = this.f23965a;
        int i15 = 0;
        while (i10 < i7) {
            kotlin.jvm.internal.l.b(d11);
            bArr[i15] = d11.f23931a;
            i10 += d11.f23933c - d11.f23932b;
            iArr[i15] = Math.min(i10, i7);
            iArr[i15 + i12] = d11.f23932b;
            d11.f23934d = true;
            i15++;
            d11 = d11.f23936f;
        }
        return new F(bArr, iArr);
    }

    public final D h0(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d10 = this.f23965a;
        if (d10 == null) {
            D b2 = E.b();
            this.f23965a = b2;
            b2.g = b2;
            b2.f23936f = b2;
            return b2;
        }
        D d11 = d10.g;
        kotlin.jvm.internal.l.b(d11);
        if (d11.f23933c + i7 <= 8192 && d11.f23935e) {
            return d11;
        }
        D b10 = E.b();
        d11.b(b10);
        return b10;
    }

    public final int hashCode() {
        D d10 = this.f23965a;
        if (d10 == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i10 = d10.f23933c;
            for (int i11 = d10.f23932b; i11 < i10; i11++) {
                i7 = (i7 * 31) + d10.f23931a[i11];
            }
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
        } while (d10 != this.f23965a);
        return i7;
    }

    public final void i0(C1967k byteString) {
        kotlin.jvm.internal.l.e(byteString, "byteString");
        byteString.F(this, byteString.f());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(byte[] source, int i7, int i10) {
        kotlin.jvm.internal.l.e(source, "source");
        long j = i10;
        AbstractC1958b.e(source.length, i7, j);
        int i11 = i10 + i7;
        while (i7 < i11) {
            D h02 = h0(1);
            int min = Math.min(i11 - i7, 8192 - h02.f23933c);
            int i12 = i7 + min;
            Eb.n.N(source, h02.f23933c, h02.f23931a, i7, i12);
            h02.f23933c += min;
            i7 = i12;
        }
        this.f23966b += j;
    }

    public final long k0(H source) {
        kotlin.jvm.internal.l.e(source, "source");
        long j = 0;
        while (true) {
            long O10 = source.O(8192L, this);
            if (O10 == -1) {
                return j;
            }
            j += O10;
        }
    }

    public final void l() {
        f0(this.f23966b);
    }

    public final void l0(int i7) {
        D h02 = h0(1);
        int i10 = h02.f23933c;
        h02.f23933c = i10 + 1;
        h02.f23931a[i10] = (byte) i7;
        this.f23966b++;
    }

    @Override // rc.G
    public final void m(long j, C1964h source) {
        D b2;
        kotlin.jvm.internal.l.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1958b.e(source.f23966b, 0L, j);
        while (j > 0) {
            D d10 = source.f23965a;
            kotlin.jvm.internal.l.b(d10);
            int i7 = d10.f23933c;
            D d11 = source.f23965a;
            kotlin.jvm.internal.l.b(d11);
            long j10 = i7 - d11.f23932b;
            int i10 = 0;
            if (j < j10) {
                D d12 = this.f23965a;
                D d13 = d12 != null ? d12.g : null;
                if (d13 != null && d13.f23935e) {
                    if ((d13.f23933c + j) - (d13.f23934d ? 0 : d13.f23932b) <= 8192) {
                        D d14 = source.f23965a;
                        kotlin.jvm.internal.l.b(d14);
                        d14.d(d13, (int) j);
                        source.f23966b -= j;
                        this.f23966b += j;
                        return;
                    }
                }
                D d15 = source.f23965a;
                kotlin.jvm.internal.l.b(d15);
                int i11 = (int) j;
                if (i11 <= 0 || i11 > d15.f23933c - d15.f23932b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    b2 = d15.c();
                } else {
                    b2 = E.b();
                    int i12 = d15.f23932b;
                    Eb.n.N(d15.f23931a, 0, b2.f23931a, i12, i12 + i11);
                }
                b2.f23933c = b2.f23932b + i11;
                d15.f23932b += i11;
                D d16 = d15.g;
                kotlin.jvm.internal.l.b(d16);
                d16.b(b2);
                source.f23965a = b2;
            }
            D d17 = source.f23965a;
            kotlin.jvm.internal.l.b(d17);
            long j11 = d17.f23933c - d17.f23932b;
            source.f23965a = d17.a();
            D d18 = this.f23965a;
            if (d18 == null) {
                this.f23965a = d17;
                d17.g = d17;
                d17.f23936f = d17;
            } else {
                D d19 = d18.g;
                kotlin.jvm.internal.l.b(d19);
                d19.b(d17);
                D d20 = d17.g;
                if (d20 == d17) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.l.b(d20);
                if (d20.f23935e) {
                    int i13 = d17.f23933c - d17.f23932b;
                    D d21 = d17.g;
                    kotlin.jvm.internal.l.b(d21);
                    int i14 = 8192 - d21.f23933c;
                    D d22 = d17.g;
                    kotlin.jvm.internal.l.b(d22);
                    if (!d22.f23934d) {
                        D d23 = d17.g;
                        kotlin.jvm.internal.l.b(d23);
                        i10 = d23.f23932b;
                    }
                    if (i13 <= i14 + i10) {
                        D d24 = d17.g;
                        kotlin.jvm.internal.l.b(d24);
                        d17.d(d24, i13);
                        d17.a();
                        E.a(d17);
                    }
                }
            }
            source.f23966b -= j11;
            this.f23966b += j11;
            j -= j11;
        }
    }

    public final void m0(long j) {
        boolean z8;
        byte[] bArr;
        if (j == 0) {
            l0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                r0("-9223372036854775808");
                return;
            }
            z8 = true;
        } else {
            z8 = false;
        }
        byte[] bArr2 = sc.a.f24355a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i7 = numberOfLeadingZeros + (j > sc.a.f24356b[numberOfLeadingZeros] ? 1 : 0);
        if (z8) {
            i7++;
        }
        D h02 = h0(i7);
        int i10 = h02.f23933c + i7;
        while (true) {
            bArr = h02.f23931a;
            if (j == 0) {
                break;
            }
            long j10 = 10;
            i10--;
            bArr[i10] = sc.a.f24355a[(int) (j % j10)];
            j /= j10;
        }
        if (z8) {
            bArr[i10 - 1] = 45;
        }
        h02.f23933c += i7;
        this.f23966b += i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rc.h] */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C1964h clone() {
        ?? obj = new Object();
        if (this.f23966b != 0) {
            D d10 = this.f23965a;
            kotlin.jvm.internal.l.b(d10);
            D c10 = d10.c();
            obj.f23965a = c10;
            c10.g = c10;
            c10.f23936f = c10;
            for (D d11 = d10.f23936f; d11 != d10; d11 = d11.f23936f) {
                D d12 = c10.g;
                kotlin.jvm.internal.l.b(d12);
                kotlin.jvm.internal.l.b(d11);
                d12.b(d11.c());
            }
            obj.f23966b = this.f23966b;
        }
        return obj;
    }

    public final void n0(long j) {
        if (j == 0) {
            l0(48);
            return;
        }
        long j10 = (j >>> 1) | j;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i7 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        D h02 = h0(i7);
        int i10 = h02.f23933c;
        for (int i11 = (i10 + i7) - 1; i11 >= i10; i11--) {
            h02.f23931a[i11] = sc.a.f24355a[(int) (15 & j)];
            j >>>= 4;
        }
        h02.f23933c += i7;
        this.f23966b += i7;
    }

    public final void o0(int i7) {
        D h02 = h0(4);
        int i10 = h02.f23933c;
        byte[] bArr = h02.f23931a;
        bArr[i10] = (byte) ((i7 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i7 & 255);
        h02.f23933c = i10 + 4;
        this.f23966b += 4;
    }

    public final void p0(int i7) {
        D h02 = h0(2);
        int i10 = h02.f23933c;
        byte[] bArr = h02.f23931a;
        bArr[i10] = (byte) ((i7 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i7 & 255);
        h02.f23933c = i10 + 2;
        this.f23966b += 2;
    }

    public final void q0(int i7, int i10, String string) {
        char charAt;
        kotlin.jvm.internal.l.e(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(h3.o.l(i7, "beginIndex < 0: ").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(X.c.e(i10, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder r10 = h3.o.r(i10, "endIndex > string.length: ", " > ");
            r10.append(string.length());
            throw new IllegalArgumentException(r10.toString().toString());
        }
        while (i7 < i10) {
            char charAt2 = string.charAt(i7);
            if (charAt2 < 128) {
                D h02 = h0(1);
                int i11 = h02.f23933c - i7;
                int min = Math.min(i10, 8192 - i11);
                int i12 = i7 + 1;
                byte[] bArr = h02.f23931a;
                bArr[i7 + i11] = (byte) charAt2;
                while (true) {
                    i7 = i12;
                    if (i7 >= min || (charAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i12 = i7 + 1;
                    bArr[i7 + i11] = (byte) charAt;
                }
                int i13 = h02.f23933c;
                int i14 = (i11 + i7) - i13;
                h02.f23933c = i13 + i14;
                this.f23966b += i14;
            } else {
                if (charAt2 < 2048) {
                    D h03 = h0(2);
                    int i15 = h03.f23933c;
                    byte[] bArr2 = h03.f23931a;
                    bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                    h03.f23933c = i15 + 2;
                    this.f23966b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    D h04 = h0(3);
                    int i16 = h04.f23933c;
                    byte[] bArr3 = h04.f23931a;
                    bArr3[i16] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                    h04.f23933c = i16 + 3;
                    this.f23966b += 3;
                } else {
                    int i17 = i7 + 1;
                    char charAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        l0(63);
                        i7 = i17;
                    } else {
                        int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        D h05 = h0(4);
                        int i19 = h05.f23933c;
                        byte[] bArr4 = h05.f23931a;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        h05.f23933c = i19 + 4;
                        this.f23966b += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void r0(String string) {
        kotlin.jvm.internal.l.e(string, "string");
        q0(0, string.length(), string);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        D d10 = this.f23965a;
        if (d10 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), d10.f23933c - d10.f23932b);
        sink.put(d10.f23931a, d10.f23932b, min);
        int i7 = d10.f23932b + min;
        d10.f23932b = i7;
        this.f23966b -= min;
        if (i7 == d10.f23933c) {
            this.f23965a = d10.a();
            E.a(d10);
        }
        return min;
    }

    public final void s0(int i7) {
        if (i7 < 128) {
            l0(i7);
            return;
        }
        if (i7 < 2048) {
            D h02 = h0(2);
            int i10 = h02.f23933c;
            byte[] bArr = h02.f23931a;
            bArr[i10] = (byte) ((i7 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i7 & 63) | 128);
            h02.f23933c = i10 + 2;
            this.f23966b += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            l0(63);
            return;
        }
        if (i7 < 65536) {
            D h03 = h0(3);
            int i11 = h03.f23933c;
            byte[] bArr2 = h03.f23931a;
            bArr2[i11] = (byte) ((i7 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i7 & 63) | 128);
            h03.f23933c = i11 + 3;
            this.f23966b += 3;
            return;
        }
        if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC1958b.k(i7)));
        }
        D h04 = h0(4);
        int i12 = h04.f23933c;
        byte[] bArr3 = h04.f23931a;
        bArr3[i12] = (byte) ((i7 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i7 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i7 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i7 & 63) | 128);
        h04.f23933c = i12 + 4;
        this.f23966b += 4;
    }

    @Override // rc.InterfaceC1966j
    public final int t(y options) {
        kotlin.jvm.internal.l.e(options, "options");
        int c10 = sc.a.c(this, options, false);
        if (c10 == -1) {
            return -1;
        }
        f0(options.f24004a[c10].f());
        return c10;
    }

    public final String toString() {
        long j = this.f23966b;
        if (j <= 2147483647L) {
            return g0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f23966b).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.l.e(source, "source");
        int remaining = source.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            D h02 = h0(1);
            int min = Math.min(i7, 8192 - h02.f23933c);
            source.get(h02.f23931a, h02.f23933c, min);
            i7 -= min;
            h02.f23933c += min;
        }
        this.f23966b += remaining;
        return remaining;
    }
}
