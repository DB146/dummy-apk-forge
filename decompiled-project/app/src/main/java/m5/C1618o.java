package m5;

import java.io.InputStream;
import n5.AbstractC1705a;

/* renamed from: m5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618o extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1616m f20622a;

    /* renamed from: b, reason: collision with root package name */
    public final C1619p f20623b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20625d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20626e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f20624c = new byte[1];

    public C1618o(InterfaceC1616m interfaceC1616m, C1619p c1619p) {
        this.f20622a = interfaceC1616m;
        this.f20623b = c1619p;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20626e) {
            return;
        }
        this.f20622a.close();
        this.f20626e = true;
    }

    public final void l() {
        if (this.f20625d) {
            return;
        }
        this.f20622a.d(this.f20623b);
        this.f20625d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20624c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        AbstractC1705a.m(!this.f20626e);
        l();
        int D10 = this.f20622a.D(bArr, i7, i10);
        if (D10 == -1) {
            return -1;
        }
        return D10;
    }
}
