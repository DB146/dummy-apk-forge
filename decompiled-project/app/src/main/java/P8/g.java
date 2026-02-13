package P8;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: d, reason: collision with root package name */
    public final h f8217d;

    public g(h hVar) {
        super(hVar.f8219b, hVar.f8220c, 0, (byte) 0);
        this.f8217d = hVar;
    }

    @Override // P8.h
    public final byte[] g() {
        byte[] g = this.f8217d.g();
        int i7 = this.f8219b * this.f8220c;
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) (255 - (g[i10] & 255));
        }
        return bArr;
    }

    @Override // P8.h
    public final byte[] h(int i7, byte[] bArr) {
        byte[] h10 = this.f8217d.h(i7, bArr);
        for (int i10 = 0; i10 < this.f8219b; i10++) {
            h10[i10] = (byte) (255 - (h10[i10] & 255));
        }
        return h10;
    }

    @Override // P8.h
    public final boolean i() {
        return this.f8217d.i();
    }

    @Override // P8.h
    public final h k() {
        return new g(this.f8217d.k());
    }
}
