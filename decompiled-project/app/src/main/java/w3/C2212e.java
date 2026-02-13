package w3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: w3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2212e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f25774a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f25775b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f25776c;

    /* renamed from: d, reason: collision with root package name */
    public int f25777d;

    /* renamed from: e, reason: collision with root package name */
    public int f25778e;

    public C2212e(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC2213f.f25779a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f25774a = fileInputStream;
        this.f25775b = charset;
        this.f25776c = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f25774a) {
            try {
                if (this.f25776c != null) {
                    this.f25776c = null;
                    this.f25774a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String l() {
        int i7;
        synchronized (this.f25774a) {
            try {
                byte[] bArr = this.f25776c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f25777d >= this.f25778e) {
                    int read = this.f25774a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f25777d = 0;
                    this.f25778e = read;
                }
                for (int i10 = this.f25777d; i10 != this.f25778e; i10++) {
                    byte[] bArr2 = this.f25776c;
                    if (bArr2[i10] == 10) {
                        int i11 = this.f25777d;
                        if (i10 != i11) {
                            i7 = i10 - 1;
                            if (bArr2[i7] == 13) {
                                String str = new String(bArr2, i11, i7 - i11, this.f25775b.name());
                                this.f25777d = i10 + 1;
                                return str;
                            }
                        }
                        i7 = i10;
                        String str2 = new String(bArr2, i11, i7 - i11, this.f25775b.name());
                        this.f25777d = i10 + 1;
                        return str2;
                    }
                }
                C2211d c2211d = new C2211d(this, (this.f25778e - this.f25777d) + 80);
                while (true) {
                    byte[] bArr3 = this.f25776c;
                    int i12 = this.f25777d;
                    c2211d.write(bArr3, i12, this.f25778e - i12);
                    this.f25778e = -1;
                    byte[] bArr4 = this.f25776c;
                    int read2 = this.f25774a.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f25777d = 0;
                    this.f25778e = read2;
                    for (int i13 = 0; i13 != this.f25778e; i13++) {
                        byte[] bArr5 = this.f25776c;
                        if (bArr5[i13] == 10) {
                            int i14 = this.f25777d;
                            if (i13 != i14) {
                                c2211d.write(bArr5, i14, i13 - i14);
                            }
                            this.f25777d = i13 + 1;
                            return c2211d.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
