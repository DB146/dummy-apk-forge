package W3;

import J3.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f10600c;

    /* renamed from: a, reason: collision with root package name */
    public x f10601a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f10602b;

    static {
        char[] cArr = o.f10619a;
        f10600c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10601a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10601a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f10601a.mark(i7);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f10601a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f10601a.read();
        } catch (IOException e2) {
            this.f10602b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f10601a.read(bArr);
        } catch (IOException e2) {
            this.f10602b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        try {
            return this.f10601a.read(bArr, i7, i10);
        } catch (IOException e2) {
            this.f10602b = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f10601a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.f10601a.skip(j);
        } catch (IOException e2) {
            this.f10602b = e2;
            throw e2;
        }
    }
}
