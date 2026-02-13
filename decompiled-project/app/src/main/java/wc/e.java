package wc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class e extends FilterInputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final ha.g f25876f = new ha.g(new d(0));

    /* renamed from: a, reason: collision with root package name */
    public byte[] f25877a;

    /* renamed from: b, reason: collision with root package name */
    public int f25878b;

    /* renamed from: c, reason: collision with root package name */
    public int f25879c;

    /* renamed from: d, reason: collision with root package name */
    public int f25880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25881e;

    public e(InputStream inputStream) {
        super(inputStream);
        this.f25880d = -1;
        this.f25881e = false;
        if (inputStream == null) {
            this.f25881e = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i7;
        if (this.f25877a != null && (i7 = this.f25879c - this.f25878b) > 0) {
            return i7;
        }
        if (this.f25881e) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (((FilterInputStream) this).in != null) {
            super.close();
        }
        byte[] bArr = this.f25877a;
        if (bArr == null) {
            return;
        }
        f25876f.o(bArr);
        this.f25877a = null;
    }

    public final void l() {
        if (this.f25881e) {
            return;
        }
        if (this.f25877a == null) {
            this.f25877a = (byte[]) f25876f.d();
        }
        int i7 = this.f25880d;
        if (i7 < 0) {
            this.f25878b = 0;
        } else {
            int i10 = this.f25878b;
            if (i10 >= 8192) {
                if (i7 > 0) {
                    int i11 = i10 - i7;
                    byte[] bArr = this.f25877a;
                    System.arraycopy(bArr, i7, bArr, 0, i11);
                    this.f25878b = i11;
                    this.f25880d = 0;
                } else {
                    this.f25880d = -1;
                    this.f25878b = 0;
                }
            }
        }
        this.f25879c = this.f25878b;
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr2 = this.f25877a;
        int i12 = this.f25878b;
        int read = inputStream.read(bArr2, i12, bArr2.length - i12);
        if (read > 0) {
            this.f25879c = this.f25878b + read;
            while (this.f25877a.length - this.f25879c > 0 && ((FilterInputStream) this).in.available() >= 1) {
                InputStream inputStream2 = ((FilterInputStream) this).in;
                byte[] bArr3 = this.f25877a;
                int i13 = this.f25879c;
                read = inputStream2.read(bArr3, i13, bArr3.length - i13);
                if (read <= 0) {
                    break;
                } else {
                    this.f25879c += read;
                }
            }
        }
        if (read == -1) {
            this.f25881e = true;
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        if (i7 > 8192) {
            throw new IllegalArgumentException("Read-ahead limit is greater than buffer size");
        }
        this.f25880d = this.f25878b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f25878b >= this.f25879c) {
            l();
            if (this.f25878b >= this.f25879c) {
                return -1;
            }
        }
        vc.i.D(this.f25877a);
        byte[] bArr = this.f25877a;
        int i7 = this.f25878b;
        this.f25878b = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        vc.i.D(bArr);
        if (i7 < 0 || i10 < 0 || i10 > bArr.length - i7) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f25879c - this.f25878b;
        if (i11 <= 0) {
            if (!this.f25881e && this.f25880d < 0) {
                int read = ((FilterInputStream) this).in.read(bArr, i7, i10);
                if (read == -1) {
                    this.f25881e = true;
                    super.close();
                }
                return read;
            }
            l();
            i11 = this.f25879c - this.f25878b;
        }
        int min = Math.min(i11, i10);
        if (min <= 0) {
            return -1;
        }
        vc.i.D(this.f25877a);
        System.arraycopy(this.f25877a, this.f25878b, bArr, i7, min);
        this.f25878b += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        int i7 = this.f25880d;
        if (i7 < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f25878b = i7;
    }
}
