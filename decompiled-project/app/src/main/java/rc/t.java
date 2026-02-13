package rc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class t implements H {

    /* renamed from: a, reason: collision with root package name */
    public byte f23990a;

    /* renamed from: b, reason: collision with root package name */
    public final C f23991b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f23992c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23993d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f23994e;

    public t(InterfaceC1966j source) {
        kotlin.jvm.internal.l.e(source, "source");
        C c10 = new C(source);
        this.f23991b = c10;
        Inflater inflater = new Inflater(true);
        this.f23992c = inflater;
        this.f23993d = new u(c10, inflater);
        this.f23994e = new CRC32();
    }

    public static void l(int i7, int i10, String str) {
        if (i10 == i7) {
            return;
        }
        StringBuilder n6 = A3.c.n(str, ": actual 0x");
        n6.append(ac.g.l0(8, AbstractC1958b.k(i10)));
        n6.append(" != expected 0x");
        n6.append(ac.g.l0(8, AbstractC1958b.k(i7)));
        throw new IOException(n6.toString());
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        C c10;
        C1964h c1964h;
        long j10;
        kotlin.jvm.internal.l.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = this.f23990a;
        CRC32 crc32 = this.f23994e;
        C c11 = this.f23991b;
        if (b2 == 0) {
            c11.Z(10L);
            C1964h c1964h2 = c11.f23929b;
            byte P10 = c1964h2.P(3L);
            boolean z8 = ((P10 >> 1) & 1) == 1;
            if (z8) {
                n(c1964h2, 0L, 10L);
            }
            l(8075, c11.V(), "ID1ID2");
            c11.a0(8L);
            if (((P10 >> 2) & 1) == 1) {
                c11.Z(2L);
                if (z8) {
                    n(c1964h2, 0L, 2L);
                }
                long b02 = c1964h2.b0() & 65535;
                c11.Z(b02);
                if (z8) {
                    n(c1964h2, 0L, b02);
                    j10 = b02;
                } else {
                    j10 = b02;
                }
                c11.a0(j10);
            }
            if (((P10 >> 3) & 1) == 1) {
                c1964h = c1964h2;
                long n6 = c11.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n6 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    c10 = c11;
                    n(c1964h, 0L, n6 + 1);
                } else {
                    c10 = c11;
                }
                c10.a0(n6 + 1);
            } else {
                c1964h = c1964h2;
                c10 = c11;
            }
            if (((P10 >> 4) & 1) == 1) {
                long n8 = c10.n((byte) 0, 0L, Long.MAX_VALUE);
                if (n8 == -1) {
                    throw new EOFException();
                }
                if (z8) {
                    n(c1964h, 0L, n8 + 1);
                }
                c10.a0(n8 + 1);
            }
            if (z8) {
                l(c10.W(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f23990a = (byte) 1;
        } else {
            c10 = c11;
        }
        if (this.f23990a == 1) {
            long j11 = sink.f23966b;
            long O10 = this.f23993d.O(j, sink);
            if (O10 != -1) {
                n(sink, j11, O10);
                return O10;
            }
            this.f23990a = (byte) 2;
        }
        if (this.f23990a != 2) {
            return -1L;
        }
        l(c10.T(), (int) crc32.getValue(), "CRC");
        l(c10.T(), (int) this.f23992c.getBytesWritten(), "ISIZE");
        this.f23990a = (byte) 3;
        if (c10.l()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23993d.close();
    }

    @Override // rc.H
    public final J e() {
        return this.f23991b.f23928a.e();
    }

    public final void n(C1964h c1964h, long j, long j10) {
        D d10 = c1964h.f23965a;
        kotlin.jvm.internal.l.b(d10);
        while (true) {
            int i7 = d10.f23933c;
            int i10 = d10.f23932b;
            if (j < i7 - i10) {
                break;
            }
            j -= i7 - i10;
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
        }
        while (j10 > 0) {
            int min = (int) Math.min(d10.f23933c - r6, j10);
            this.f23994e.update(d10.f23931a, (int) (d10.f23932b + j), min);
            j10 -= min;
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
            j = 0;
        }
    }
}
