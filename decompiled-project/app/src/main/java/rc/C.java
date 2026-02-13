package rc;

import ac.AbstractC0796a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class C implements InterfaceC1966j {

    /* renamed from: a, reason: collision with root package name */
    public final H f23928a;

    /* renamed from: b, reason: collision with root package name */
    public final C1964h f23929b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23930c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rc.h] */
    public C(H source) {
        kotlin.jvm.internal.l.e(source, "source");
        this.f23928a = source;
        this.f23929b = new Object();
    }

    public final byte F() {
        Z(1L);
        return this.f23929b.V();
    }

    public final C1967k K(long j) {
        Z(j);
        return this.f23929b.X(j);
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        if (this.f23930c) {
            throw new IllegalStateException("closed");
        }
        C1964h c1964h = this.f23929b;
        if (c1964h.f23966b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f23928a.O(8192L, c1964h) == -1) {
                return -1L;
            }
        }
        return c1964h.O(Math.min(j, c1964h.f23966b), sink);
    }

    public final int P() {
        Z(4L);
        return this.f23929b.Z();
    }

    @Override // rc.InterfaceC1966j
    public final String Q(Charset charset) {
        kotlin.jvm.internal.l.e(charset, "charset");
        H h10 = this.f23928a;
        C1964h c1964h = this.f23929b;
        c1964h.k0(h10);
        return c1964h.Q(charset);
    }

    @Override // rc.InterfaceC1966j
    public final InputStream S() {
        return new C1963g(this, 1);
    }

    public final int T() {
        Z(4L);
        return AbstractC1958b.g(this.f23929b.Z());
    }

    public final long U() {
        long j;
        Z(8L);
        C1964h c1964h = this.f23929b;
        if (c1964h.f23966b < 8) {
            throw new EOFException();
        }
        D d10 = c1964h.f23965a;
        kotlin.jvm.internal.l.b(d10);
        int i7 = d10.f23932b;
        int i10 = d10.f23933c;
        if (i10 - i7 < 8) {
            j = ((c1964h.Z() & 4294967295L) << 32) | (4294967295L & c1964h.Z());
        } else {
            byte[] bArr = d10.f23931a;
            int i11 = i7 + 7;
            long j10 = ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7] & 255) << 56) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
            int i12 = i7 + 8;
            long j11 = j10 | (bArr[i11] & 255);
            c1964h.f23966b -= 8;
            if (i12 == i10) {
                c1964h.f23965a = d10.a();
                E.a(d10);
            } else {
                d10.f23932b = i12;
            }
            j = j11;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public final short V() {
        Z(2L);
        return this.f23929b.a0();
    }

    public final short W() {
        Z(2L);
        return this.f23929b.b0();
    }

    public final String X(long j) {
        Z(j);
        C1964h c1964h = this.f23929b;
        c1964h.getClass();
        return c1964h.c0(j, AbstractC0796a.f12815a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, rc.h] */
    public final String Y(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("limit < 0: ", j).toString());
        }
        long j10 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long n6 = n((byte) 10, 0L, j10);
        C1964h c1964h = this.f23929b;
        if (n6 != -1) {
            return sc.a.b(n6, c1964h);
        }
        if (j10 < Long.MAX_VALUE && d(j10) && c1964h.P(j10 - 1) == 13 && d(1 + j10) && c1964h.P(j10) == 10) {
            return sc.a.b(j10, c1964h);
        }
        ?? obj = new Object();
        c1964h.F(obj, 0L, Math.min(32, c1964h.f23966b));
        throw new EOFException("\\n not found: limit=" + Math.min(c1964h.f23966b, j) + " content=" + obj.X(obj.f23966b).g() + (char) 8230);
    }

    public final void Z(long j) {
        if (!d(j)) {
            throw new EOFException();
        }
    }

    public final void a0(long j) {
        if (this.f23930c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1964h c1964h = this.f23929b;
            if (c1964h.f23966b == 0 && this.f23928a.O(8192L, c1964h) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, c1964h.f23966b);
            c1964h.f0(min);
            j -= min;
        }
    }

    @Override // rc.InterfaceC1966j
    public final C1964h c() {
        return this.f23929b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f23930c) {
            return;
        }
        this.f23930c = true;
        this.f23928a.close();
        this.f23929b.l();
    }

    @Override // rc.InterfaceC1966j
    public final boolean d(long j) {
        C1964h c1964h;
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        if (this.f23930c) {
            throw new IllegalStateException("closed");
        }
        do {
            c1964h = this.f23929b;
            if (c1964h.f23966b >= j) {
                return true;
            }
        } while (this.f23928a.O(8192L, c1964h) != -1);
        return false;
    }

    @Override // rc.H
    public final J e() {
        return this.f23928a.e();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f23930c;
    }

    public final boolean l() {
        if (this.f23930c) {
            throw new IllegalStateException("closed");
        }
        C1964h c1964h = this.f23929b;
        return c1964h.K() && this.f23928a.O(8192L, c1964h) == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException(("size=" + r6.f23966b + " fromIndex=" + r4 + " toIndex=" + r2).toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(byte b2, long j, long j10) {
        long j11;
        D d10;
        C c10 = this;
        long j12 = j10;
        if (c10.f23930c) {
            throw new IllegalStateException("closed");
        }
        long j13 = 0;
        if (0 > j12) {
            throw new IllegalArgumentException(A3.c.h("fromIndex=0 toIndex=", j12).toString());
        }
        while (true) {
            if (j13 >= j12) {
                j11 = -1;
                break;
            }
            C1964h c1964h = c10.f23929b;
            c1964h.getClass();
            long j14 = 0;
            if (0 > j13 || j13 > j12) {
                break;
            }
            long j15 = c1964h.f23966b;
            long j16 = j12 > j15 ? j15 : j12;
            long j17 = -1;
            if (j13 != j16 && (d10 = c1964h.f23965a) != null) {
                if (j15 - j13 >= j13) {
                    while (true) {
                        long j18 = (d10.f23933c - d10.f23932b) + j14;
                        if (j18 > j13) {
                            break;
                        }
                        d10 = d10.f23936f;
                        kotlin.jvm.internal.l.b(d10);
                        j14 = j18;
                    }
                    long j19 = j13;
                    while (true) {
                        if (j14 >= j16) {
                            break;
                        }
                        int min = (int) Math.min(d10.f23933c, (d10.f23932b + j16) - j14);
                        for (int i7 = (int) ((d10.f23932b + j19) - j14); i7 < min; i7++) {
                            if (d10.f23931a[i7] == b2) {
                                j17 = (i7 - d10.f23932b) + j14;
                                break;
                            }
                        }
                        j19 = (d10.f23933c - d10.f23932b) + j14;
                        d10 = d10.f23936f;
                        kotlin.jvm.internal.l.b(d10);
                        j14 = j19;
                    }
                } else {
                    while (j15 > j13) {
                        d10 = d10.g;
                        kotlin.jvm.internal.l.b(d10);
                        j15 -= d10.f23933c - d10.f23932b;
                    }
                    long j20 = j13;
                    while (true) {
                        if (j15 >= j16) {
                            break;
                        }
                        int min2 = (int) Math.min(d10.f23933c, (d10.f23932b + j16) - j15);
                        for (int i10 = (int) ((d10.f23932b + j20) - j15); i10 < min2; i10++) {
                            if (d10.f23931a[i10] == b2) {
                                j17 = (i10 - d10.f23932b) + j15;
                                break;
                            }
                        }
                        j20 = j15 + (d10.f23933c - d10.f23932b);
                        d10 = d10.f23936f;
                        kotlin.jvm.internal.l.b(d10);
                        j15 = j20;
                    }
                }
            }
            j11 = -1;
            if (j17 != -1) {
                return j17;
            }
            long j21 = c1964h.f23966b;
            if (j21 >= j10) {
                break;
            }
            c10 = this;
            if (c10.f23928a.O(8192L, c1964h) == -1) {
                break;
            }
            j13 = Math.max(j13, j21);
            j12 = j10;
        }
        return j11;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        C1964h c1964h = this.f23929b;
        if (c1964h.f23966b == 0 && this.f23928a.O(8192L, c1964h) == -1) {
            return -1;
        }
        return c1964h.read(sink);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // rc.InterfaceC1966j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(y options) {
        kotlin.jvm.internal.l.e(options, "options");
        if (this.f23930c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C1964h c1964h = this.f23929b;
            int c10 = sc.a.c(c1964h, options, true);
            if (c10 != -2) {
                if (c10 != -1) {
                    c1964h.f0(options.f24004a[c10].f());
                    return c10;
                }
            } else if (this.f23928a.O(8192L, c1964h) == -1) {
                break;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f23928a + ')';
    }
}
