package rc;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class s implements G {

    /* renamed from: a, reason: collision with root package name */
    public final B f23985a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f23986b;

    /* renamed from: c, reason: collision with root package name */
    public final l f23987c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23988d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f23989e;

    public s(InterfaceC1965i interfaceC1965i) {
        B b2 = new B(interfaceC1965i);
        this.f23985a = b2;
        Deflater deflater = new Deflater(-1, true);
        this.f23986b = deflater;
        this.f23987c = new l(b2, deflater);
        this.f23989e = new CRC32();
        C1964h c1964h = b2.f23926b;
        c1964h.p0(8075);
        c1964h.l0(8);
        c1964h.l0(0);
        c1964h.o0(0);
        c1964h.l0(0);
        c1964h.l0(0);
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int value;
        Deflater deflater = this.f23986b;
        B b2 = this.f23985a;
        if (this.f23988d) {
            return;
        }
        try {
            l lVar = this.f23987c;
            lVar.f23972b.finish();
            lVar.l(false);
            value = (int) this.f23989e.getValue();
        } catch (Throwable th) {
            th = th;
        }
        if (b2.f23927c) {
            throw new IllegalStateException("closed");
        }
        int g = AbstractC1958b.g(value);
        C1964h c1964h = b2.f23926b;
        c1964h.o0(g);
        b2.l();
        int bytesRead = (int) deflater.getBytesRead();
        if (b2.f23927c) {
            throw new IllegalStateException("closed");
        }
        c1964h.o0(AbstractC1958b.g(bytesRead));
        b2.l();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            b2.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f23988d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // rc.G
    public final J e() {
        return this.f23985a.f23925a.e();
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
        this.f23987c.flush();
    }

    @Override // rc.G
    public final void m(long j, C1964h c1964h) {
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return;
        }
        D d10 = c1964h.f23965a;
        kotlin.jvm.internal.l.b(d10);
        long j10 = j;
        while (j10 > 0) {
            int min = (int) Math.min(j10, d10.f23933c - d10.f23932b);
            this.f23989e.update(d10.f23931a, d10.f23932b, min);
            j10 -= min;
            d10 = d10.f23936f;
            kotlin.jvm.internal.l.b(d10);
        }
        this.f23987c.m(j, c1964h);
    }
}
