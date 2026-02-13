package W3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f10594a;

    /* renamed from: b, reason: collision with root package name */
    public int f10595b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f10594a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10594a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i7) {
        this.f10595b = this.f10594a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f10594a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        ByteBuffer byteBuffer = this.f10594a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i7, min);
        return min;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i7 = this.f10595b;
        if (i7 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f10594a.position(i7);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f10594a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }
}
