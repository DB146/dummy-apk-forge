package J3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class x extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f5506a;

    /* renamed from: b, reason: collision with root package name */
    public int f5507b;

    /* renamed from: c, reason: collision with root package name */
    public int f5508c;

    /* renamed from: d, reason: collision with root package name */
    public int f5509d;

    /* renamed from: e, reason: collision with root package name */
    public int f5510e;

    /* renamed from: f, reason: collision with root package name */
    public final D3.f f5511f;

    public x(InputStream inputStream, D3.f fVar) {
        super(inputStream);
        this.f5509d = -1;
        this.f5511f = fVar;
        this.f5506a = (byte[]) fVar.c(65536, byte[].class);
    }

    public static void F() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5506a == null || inputStream == null) {
            F();
            throw null;
        }
        return (this.f5507b - this.f5510e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5506a != null) {
            this.f5511f.g(this.f5506a);
            this.f5506a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int l(InputStream inputStream, byte[] bArr) {
        int i7 = this.f5509d;
        if (i7 != -1) {
            int i10 = this.f5510e - i7;
            int i11 = this.f5508c;
            if (i10 < i11) {
                if (i7 == 0 && i11 > bArr.length && this.f5507b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5511f.c(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5506a = bArr2;
                    this.f5511f.g(bArr);
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i12 = this.f5510e - this.f5509d;
                this.f5510e = i12;
                this.f5509d = 0;
                this.f5507b = 0;
                int read = inputStream.read(bArr, i12, bArr.length - i12);
                int i13 = this.f5510e;
                if (read > 0) {
                    i13 += read;
                }
                this.f5507b = i13;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f5509d = -1;
            this.f5510e = 0;
            this.f5507b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        this.f5508c = Math.max(this.f5508c, i7);
        this.f5509d = this.f5510e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public final synchronized void n() {
        if (this.f5506a != null) {
            this.f5511f.g(this.f5506a);
            this.f5506a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f5506a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            F();
            throw null;
        }
        if (this.f5510e >= this.f5507b && l(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f5506a && (bArr = this.f5506a) == null) {
            F();
            throw null;
        }
        int i7 = this.f5507b;
        int i10 = this.f5510e;
        if (i7 - i10 <= 0) {
            return -1;
        }
        this.f5510e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f5506a;
        if (bArr2 == null) {
            F();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            F();
            throw null;
        }
        int i13 = this.f5510e;
        int i14 = this.f5507b;
        if (i13 < i14) {
            int i15 = i14 - i13;
            if (i15 >= i10) {
                i15 = i10;
            }
            System.arraycopy(bArr2, i13, bArr, i7, i15);
            this.f5510e += i15;
            if (i15 == i10 || inputStream.available() == 0) {
                return i15;
            }
            i7 += i15;
            i11 = i10 - i15;
        } else {
            i11 = i10;
        }
        while (true) {
            if (this.f5509d == -1 && i11 >= bArr2.length) {
                i12 = inputStream.read(bArr, i7, i11);
                if (i12 == -1) {
                    return i11 != i10 ? i10 - i11 : -1;
                }
            } else {
                if (l(inputStream, bArr2) == -1) {
                    return i11 != i10 ? i10 - i11 : -1;
                }
                if (bArr2 != this.f5506a && (bArr2 = this.f5506a) == null) {
                    F();
                    throw null;
                }
                int i16 = this.f5507b;
                int i17 = this.f5510e;
                i12 = i16 - i17;
                if (i12 >= i11) {
                    i12 = i11;
                }
                System.arraycopy(bArr2, i17, bArr, i7, i12);
                this.f5510e += i12;
            }
            i11 -= i12;
            if (i11 == 0) {
                return i10;
            }
            if (inputStream.available() == 0) {
                return i10 - i11;
            }
            i7 += i12;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f5506a == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f5509d;
        if (-1 == i7) {
            throw new IOException("Mark has been invalidated, pos: " + this.f5510e + " markLimit: " + this.f5508c);
        }
        this.f5510e = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f5506a;
        if (bArr == null) {
            F();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            F();
            throw null;
        }
        int i7 = this.f5507b;
        int i10 = this.f5510e;
        if (i7 - i10 >= j) {
            this.f5510e = (int) (i10 + j);
            return j;
        }
        long j10 = i7 - i10;
        this.f5510e = i7;
        if (this.f5509d == -1 || j > this.f5508c) {
            long skip = inputStream.skip(j - j10);
            if (skip > 0) {
                this.f5509d = -1;
            }
            return j10 + skip;
        }
        if (l(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f5507b;
        int i12 = this.f5510e;
        if (i11 - i12 >= j - j10) {
            this.f5510e = (int) ((i12 + j) - j10);
            return j;
        }
        long j11 = (j10 + i11) - i12;
        this.f5510e = i11;
        return j11;
    }
}
