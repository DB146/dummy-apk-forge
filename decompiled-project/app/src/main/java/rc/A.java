package rc;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class A extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f23924a;

    public A(B b2) {
        this.f23924a = b2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23924a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        B b2 = this.f23924a;
        if (b2.f23927c) {
            return;
        }
        b2.flush();
    }

    public final String toString() {
        return this.f23924a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        B b2 = this.f23924a;
        if (b2.f23927c) {
            throw new IOException("closed");
        }
        b2.f23926b.l0((byte) i7);
        b2.l();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i7, int i10) {
        kotlin.jvm.internal.l.e(data, "data");
        B b2 = this.f23924a;
        if (b2.f23927c) {
            throw new IOException("closed");
        }
        b2.f23926b.j0(data, i7, i10);
        b2.l();
    }
}
