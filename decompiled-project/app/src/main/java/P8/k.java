package P8;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8225d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8226e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8227f;

    public k(byte[] bArr, int i7, int i10, int i11, int i12) {
        super(i11, i12, 0, (byte) 0);
        if (i11 > i7 || i12 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f8225d = bArr;
        this.f8226e = i7;
        this.f8227f = i10;
    }

    @Override // P8.h
    public final byte[] g() {
        byte[] bArr = this.f8225d;
        int i7 = this.f8226e;
        int i10 = this.f8219b;
        int i11 = this.f8220c;
        if (i10 == i7 && i11 == this.f8227f) {
            return bArr;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        if (i10 == i7) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i10, i10);
            i13 += i7;
        }
        return bArr2;
    }

    @Override // P8.h
    public final byte[] h(int i7, byte[] bArr) {
        if (i7 < 0 || i7 >= this.f8220c) {
            throw new IllegalArgumentException(h3.o.l(i7, "Requested row is outside the image: "));
        }
        int i10 = this.f8219b;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(this.f8225d, i7 * this.f8226e, bArr, 0, i10);
        return bArr;
    }
}
