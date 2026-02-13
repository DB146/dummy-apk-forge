package rc;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class l implements G {

    /* renamed from: a, reason: collision with root package name */
    public final B f23971a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f23972b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23973c;

    public l(B b2, Deflater deflater) {
        this.f23971a = b2;
        this.f23972b = deflater;
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f23972b;
        if (this.f23973c) {
            return;
        }
        try {
            deflater.finish();
            l(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f23971a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f23973c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // rc.G
    public final J e() {
        return this.f23971a.f23925a.e();
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
        l(true);
        this.f23971a.flush();
    }

    public final void l(boolean z8) {
        D h02;
        int deflate;
        B b2 = this.f23971a;
        C1964h c1964h = b2.f23926b;
        while (true) {
            h02 = c1964h.h0(1);
            Deflater deflater = this.f23972b;
            byte[] bArr = h02.f23931a;
            if (z8) {
                try {
                    int i7 = h02.f23933c;
                    deflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                int i10 = h02.f23933c;
                deflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (deflate > 0) {
                h02.f23933c += deflate;
                c1964h.f23966b += deflate;
                b2.l();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (h02.f23932b == h02.f23933c) {
            c1964h.f23965a = h02.a();
            E.a(h02);
        }
    }

    @Override // rc.G
    public final void m(long j, C1964h c1964h) {
        AbstractC1958b.e(c1964h.f23966b, 0L, j);
        while (true) {
            Deflater deflater = this.f23972b;
            if (j <= 0) {
                deflater.setInput(sc.b.f24358b, 0, 0);
                return;
            }
            D d10 = c1964h.f23965a;
            kotlin.jvm.internal.l.b(d10);
            int min = (int) Math.min(j, d10.f23933c - d10.f23932b);
            deflater.setInput(d10.f23931a, d10.f23932b, min);
            l(false);
            long j10 = min;
            c1964h.f23966b -= j10;
            int i7 = d10.f23932b + min;
            d10.f23932b = i7;
            if (i7 == d10.f23933c) {
                c1964h.f23965a = d10.a();
                E.a(d10);
            }
            j -= j10;
        }
    }

    public final String toString() {
        return "DeflaterSink(" + this.f23971a + ')';
    }
}
