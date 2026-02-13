package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f14674a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14675b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.f f14676c;

    /* renamed from: d, reason: collision with root package name */
    public int f14677d;

    public c(FileOutputStream fileOutputStream, D3.f fVar) {
        this.f14674a = fileOutputStream;
        this.f14676c = fVar;
        this.f14675b = (byte[]) fVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f14674a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f14675b;
            if (bArr != null) {
                this.f14676c.g(bArr);
                this.f14675b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i7 = this.f14677d;
        FileOutputStream fileOutputStream = this.f14674a;
        if (i7 > 0) {
            fileOutputStream.write(this.f14675b, 0, i7);
            this.f14677d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        byte[] bArr = this.f14675b;
        int i10 = this.f14677d;
        int i11 = i10 + 1;
        this.f14677d = i11;
        bArr[i10] = (byte) i7;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f14674a.write(bArr, 0, i11);
        this.f14677d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i7 + i11;
            int i14 = this.f14677d;
            FileOutputStream fileOutputStream = this.f14674a;
            if (i14 == 0 && i12 >= this.f14675b.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int min = Math.min(i12, this.f14675b.length - i14);
            System.arraycopy(bArr, i13, this.f14675b, this.f14677d, min);
            int i15 = this.f14677d + min;
            this.f14677d = i15;
            i11 += min;
            byte[] bArr2 = this.f14675b;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f14677d = 0;
            }
        } while (i11 < i10);
    }
}
