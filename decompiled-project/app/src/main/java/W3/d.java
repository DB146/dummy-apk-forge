package W3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f10598a;

    /* renamed from: b, reason: collision with root package name */
    public int f10599b;

    public d(InputStream inputStream, long j) {
        super(inputStream);
        this.f10598a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f10598a - this.f10599b, ((FilterInputStream) this).in.available());
    }

    public final void l(int i7) {
        if (i7 >= 0) {
            this.f10599b += i7;
            return;
        }
        long j = this.f10599b;
        long j10 = this.f10598a;
        if (j10 - j <= 0) {
            return;
        }
        StringBuilder l10 = X.c.l(j10, "Failed to read all expected data, expected: ", ", but read: ");
        l10.append(this.f10599b);
        throw new IOException(l10.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        l(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i7, int i10) {
        int read;
        read = super.read(bArr, i7, i10);
        l(read);
        return read;
    }
}
