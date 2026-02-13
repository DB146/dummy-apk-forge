package V8;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f10198a;

    /* renamed from: b, reason: collision with root package name */
    public int f10199b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10200c;

    public c(byte[] bArr) {
        this.f10200c = bArr;
    }

    public /* synthetic */ c(byte[] bArr, int i7, int i10) {
        this.f10200c = bArr;
        this.f10198a = i7;
        this.f10199b = i10;
    }

    public int a() {
        return ((this.f10200c.length - this.f10198a) * 8) - this.f10199b;
    }

    public int b(int i7) {
        if (i7 < 1 || i7 > 32 || i7 > a()) {
            throw new IllegalArgumentException(String.valueOf(i7));
        }
        int i10 = this.f10199b;
        int i11 = 0;
        byte[] bArr = this.f10200c;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int min = Math.min(i7, i12);
            int i13 = i12 - min;
            int i14 = this.f10198a;
            int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
            i7 -= min;
            int i16 = this.f10199b + min;
            this.f10199b = i16;
            if (i16 == 8) {
                this.f10199b = 0;
                this.f10198a = i14 + 1;
            }
            i11 = i15;
        }
        if (i7 <= 0) {
            return i11;
        }
        while (i7 >= 8) {
            int i17 = i11 << 8;
            int i18 = this.f10198a;
            int i19 = i17 | (bArr[i18] & 255);
            this.f10198a = i18 + 1;
            i7 -= 8;
            i11 = i19;
        }
        if (i7 <= 0) {
            return i11;
        }
        int i20 = 8 - i7;
        int i21 = (i11 << i7) | ((((255 >> i20) << i20) & bArr[this.f10198a]) >> i20);
        this.f10199b += i7;
        return i21;
    }
}
