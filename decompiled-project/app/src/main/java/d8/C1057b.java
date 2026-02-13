package d8;

import java.io.OutputStream;

/* renamed from: d8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f16551a;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f16551a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f16551a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) {
        int i11;
        if (i7 < 0 || i7 > bArr.length || i10 < 0 || (i11 = i7 + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f16551a += i10;
    }
}
