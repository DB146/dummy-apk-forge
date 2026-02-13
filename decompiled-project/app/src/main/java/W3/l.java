package W3;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class l extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f10614a;

    public l(e eVar) {
        super(eVar);
        this.f10614a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i7 = this.f10614a;
        return i7 == Integer.MIN_VALUE ? super.available() : Math.min(i7, super.available());
    }

    public final long l(long j) {
        int i7 = this.f10614a;
        if (i7 == 0) {
            return -1L;
        }
        return (i7 == Integer.MIN_VALUE || j <= ((long) i7)) ? j : i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        super.mark(i7);
        this.f10614a = i7;
    }

    public final void n(long j) {
        int i7 = this.f10614a;
        if (i7 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f10614a = (int) (i7 - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (l(1L) == -1) {
            return -1;
        }
        int read = super.read();
        n(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        int l10 = (int) l(i10);
        if (l10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i7, l10);
        n(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f10614a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long l10 = l(j);
        if (l10 == -1) {
            return 0L;
        }
        long skip = super.skip(l10);
        n(skip);
        return skip;
    }
}
