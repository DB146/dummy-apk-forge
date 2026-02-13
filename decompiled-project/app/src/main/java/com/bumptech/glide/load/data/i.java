package com.bumptech.glide.load.data;

import h3.o;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14681c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f14682d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f14683a;

    /* renamed from: b, reason: collision with root package name */
    public int f14684b;

    public i(InputStream inputStream, int i7) {
        super(inputStream);
        if (i7 < -1 || i7 > 8) {
            throw new IllegalArgumentException(o.l(i7, "Cannot add invalid orientation: "));
        }
        this.f14683a = (byte) i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i7;
        int i10 = this.f14684b;
        int read = (i10 < 2 || i10 > (i7 = f14682d)) ? super.read() : i10 == i7 ? this.f14683a : f14681c[i10 - 2] & 255;
        if (read != -1) {
            this.f14684b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        int i11;
        int i12 = this.f14684b;
        int i13 = f14682d;
        if (i12 > i13) {
            i11 = super.read(bArr, i7, i10);
        } else if (i12 == i13) {
            bArr[i7] = this.f14683a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i7, 2 - i12);
        } else {
            int min = Math.min(i13 - i12, i10);
            System.arraycopy(f14681c, this.f14684b - 2, bArr, i7, min);
            i11 = min;
        }
        if (i11 > 0) {
            this.f14684b += i11;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f14684b = (int) (this.f14684b + skip);
        }
        return skip;
    }
}
