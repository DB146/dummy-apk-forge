package rc;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class B implements InterfaceC1965i {

    /* renamed from: a, reason: collision with root package name */
    public final G f23925a;

    /* renamed from: b, reason: collision with root package name */
    public final C1964h f23926b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23927c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rc.h] */
    public B(G sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        this.f23925a = sink;
        this.f23926b = new Object();
    }

    public final InterfaceC1965i F(int i7) {
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.o0(i7);
        l();
        return this;
    }

    @Override // rc.InterfaceC1965i
    public final InterfaceC1965i H(int i7, byte[] source) {
        kotlin.jvm.internal.l.e(source, "source");
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.j0(source, 0, i7);
        l();
        return this;
    }

    @Override // rc.InterfaceC1965i
    public final InterfaceC1965i I(C1967k byteString) {
        kotlin.jvm.internal.l.e(byteString, "byteString");
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.i0(byteString);
        l();
        return this;
    }

    @Override // rc.InterfaceC1965i
    public final InterfaceC1965i L(String string) {
        kotlin.jvm.internal.l.e(string, "string");
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.r0(string);
        l();
        return this;
    }

    @Override // rc.InterfaceC1965i
    public final C1964h c() {
        return this.f23926b;
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        G g = this.f23925a;
        if (this.f23927c) {
            return;
        }
        try {
            C1964h c1964h = this.f23926b;
            long j = c1964h.f23966b;
            if (j > 0) {
                g.m(j, c1964h);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f23927c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // rc.G
    public final J e() {
        return this.f23925a.e();
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        C1964h c1964h = this.f23926b;
        long j = c1964h.f23966b;
        G g = this.f23925a;
        if (j > 0) {
            g.m(j, c1964h);
        }
        g.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f23927c;
    }

    public final InterfaceC1965i l() {
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        C1964h c1964h = this.f23926b;
        long j = c1964h.f23966b;
        if (j == 0) {
            j = 0;
        } else {
            D d10 = c1964h.f23965a;
            kotlin.jvm.internal.l.b(d10);
            D d11 = d10.g;
            kotlin.jvm.internal.l.b(d11);
            if (d11.f23933c < 8192 && d11.f23935e) {
                j -= r6 - d11.f23932b;
            }
        }
        if (j > 0) {
            this.f23925a.m(j, c1964h);
        }
        return this;
    }

    @Override // rc.G
    public final void m(long j, C1964h source) {
        kotlin.jvm.internal.l.e(source, "source");
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.m(j, source);
        l();
    }

    public final InterfaceC1965i n(int i7) {
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        this.f23926b.l0(i7);
        l();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f23925a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.l.e(source, "source");
        if (this.f23927c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f23926b.write(source);
        l();
        return write;
    }
}
