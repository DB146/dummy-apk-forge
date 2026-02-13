package x7;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f26260a;

    /* renamed from: b, reason: collision with root package name */
    public int f26261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f26262c;

    public j(l lVar, i iVar) {
        this.f26262c = lVar;
        this.f26260a = lVar.Y(iVar.f26258a + 4);
        this.f26261b = iVar.f26259b;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f26261b == 0) {
            return -1;
        }
        l lVar = this.f26262c;
        lVar.f26264a.seek(this.f26260a);
        int read = lVar.f26264a.read();
        this.f26260a = lVar.Y(this.f26260a + 1);
        this.f26261b--;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i7 | i10) < 0 || i10 > bArr.length - i7) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f26261b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f26260a;
        l lVar = this.f26262c;
        lVar.V(i12, bArr, i7, i10);
        this.f26260a = lVar.Y(this.f26260a + i10);
        this.f26261b -= i10;
        return i10;
    }
}
