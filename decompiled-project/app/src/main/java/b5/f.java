package b5;

import n5.AbstractC1705a;
import n5.D;
import n5.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13952a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13953b;

    /* renamed from: c, reason: collision with root package name */
    public int f13954c;

    /* renamed from: d, reason: collision with root package name */
    public int f13955d;

    /* renamed from: e, reason: collision with root package name */
    public int f13956e;

    public f() {
        this.f13952a = 1;
        this.f13953b = D.f21146f;
    }

    public f(int i7, int i10) {
        this.f13952a = 0;
        this.f13954c = i7;
        this.f13955d = i10;
        this.f13953b = new byte[(i10 * 2) - 1];
        this.f13956e = 0;
    }

    public f(byte[] bArr) {
        this.f13952a = 3;
        this.f13953b = bArr;
        this.f13954c = bArr.length;
    }

    public f(byte[] bArr, int i7) {
        this.f13952a = 1;
        this.f13953b = bArr;
        this.f13956e = i7;
    }

    public f(byte[] bArr, int i7, int i10) {
        this.f13952a = 2;
        this.f13953b = bArr;
        this.f13955d = i7;
        this.f13954c = i10;
        this.f13956e = 0;
        a();
    }

    public void a() {
        int i7;
        int i10;
        switch (this.f13952a) {
            case 1:
                int i11 = this.f13954c;
                AbstractC1705a.m(i11 >= 0 && (i11 < (i7 = this.f13956e) || (i11 == i7 && this.f13955d == 0)));
                return;
            default:
                int i12 = this.f13955d;
                AbstractC1705a.m(i12 >= 0 && (i12 < (i10 = this.f13954c) || (i12 == i10 && this.f13956e == 0)));
                return;
        }
    }

    public int b() {
        return ((this.f13956e - this.f13954c) * 8) - this.f13955d;
    }

    public void c() {
        if (this.f13955d == 0) {
            return;
        }
        this.f13955d = 0;
        this.f13954c++;
        a();
    }

    public boolean d(int i7) {
        int i10 = this.f13955d;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f13956e + i7) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f13954c) {
                break;
            }
            if (q(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f13954c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i7 = this.f13955d;
        int i10 = this.f13956e;
        int i11 = 0;
        while (this.f13955d < this.f13954c && !h()) {
            i11++;
        }
        boolean z8 = this.f13955d == this.f13954c;
        this.f13955d = i7;
        this.f13956e = i10;
        return !z8 && d((i11 * 2) + 1);
    }

    public int f() {
        AbstractC1705a.m(this.f13955d == 0);
        return this.f13954c;
    }

    public int g() {
        return (this.f13954c * 8) + this.f13955d;
    }

    public boolean h() {
        switch (this.f13952a) {
            case 1:
                boolean z8 = (this.f13953b[this.f13954c] & (128 >> this.f13955d)) != 0;
                r();
                return z8;
            case 2:
                boolean z10 = (this.f13953b[this.f13955d] & (128 >> this.f13956e)) != 0;
                r();
                return z10;
            default:
                boolean z11 = (((this.f13953b[this.f13955d] & 255) >> this.f13956e) & 1) == 1;
                s(1);
                return z11;
        }
    }

    public int i(int i7) {
        switch (this.f13952a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                this.f13955d += i7;
                int i10 = 0;
                while (true) {
                    int i11 = this.f13955d;
                    if (i11 <= 8) {
                        byte[] bArr = this.f13953b;
                        int i12 = this.f13954c;
                        int i13 = ((-1) >>> (32 - i7)) & (i10 | ((bArr[i12] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f13955d = 0;
                            this.f13954c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                    int i14 = i11 - 8;
                    this.f13955d = i14;
                    byte[] bArr2 = this.f13953b;
                    int i15 = this.f13954c;
                    this.f13954c = i15 + 1;
                    i10 |= (bArr2[i15] & 255) << i14;
                }
            case 2:
                this.f13956e += i7;
                int i16 = 0;
                while (true) {
                    int i17 = this.f13956e;
                    if (i17 <= 8) {
                        byte[] bArr3 = this.f13953b;
                        int i18 = this.f13955d;
                        int i19 = ((-1) >>> (32 - i7)) & (i16 | ((bArr3[i18] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f13956e = 0;
                            this.f13955d = i18 + (q(i18 + 1) ? 2 : 1);
                        }
                        a();
                        return i19;
                    }
                    int i20 = i17 - 8;
                    this.f13956e = i20;
                    byte[] bArr4 = this.f13953b;
                    int i21 = this.f13955d;
                    i16 |= (bArr4[i21] & 255) << i20;
                    if (!q(i21 + 1)) {
                        r3 = 1;
                    }
                    this.f13955d = i21 + r3;
                }
            default:
                int i22 = this.f13955d;
                int min = Math.min(i7, 8 - this.f13956e);
                int i23 = i22 + 1;
                byte[] bArr5 = this.f13953b;
                int i24 = ((bArr5[i22] & 255) >> this.f13956e) & (255 >> (8 - min));
                while (min < i7) {
                    i24 |= (bArr5[i23] & 255) << min;
                    min += 8;
                    i23++;
                }
                int i25 = i24 & ((-1) >>> (32 - i7));
                s(i7);
                return i25;
        }
    }

    public void j(int i7, byte[] bArr) {
        int i10 = i7 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f13953b;
            int i12 = this.f13954c;
            int i13 = i12 + 1;
            this.f13954c = i13;
            byte b2 = bArr2[i12];
            int i14 = this.f13955d;
            byte b10 = (byte) (b2 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i7 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f13955d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f13953b;
            int i17 = this.f13954c;
            this.f13954c = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f13955d = i16 - 8;
        }
        int i18 = this.f13955d + i15;
        this.f13955d = i18;
        byte[] bArr4 = this.f13953b;
        int i19 = this.f13954c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f13955d = 0;
            this.f13954c = i19 + 1;
        }
        a();
    }

    public void k(int i7, byte[] bArr) {
        AbstractC1705a.m(this.f13955d == 0);
        System.arraycopy(this.f13953b, this.f13954c, bArr, 0, i7);
        this.f13954c += i7;
        a();
    }

    public int l() {
        int i7 = 0;
        while (!h()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? i(i7) : 0);
    }

    public int m() {
        int l10 = l();
        return ((l10 + 1) / 2) * (l10 % 2 == 0 ? -1 : 1);
    }

    public void n(int i7, byte[] bArr) {
        this.f13953b = bArr;
        this.f13954c = 0;
        this.f13955d = 0;
        this.f13956e = i7;
    }

    public void o(v vVar) {
        n(vVar.f21231c, vVar.f21229a);
        p(vVar.f21230b * 8);
    }

    public void p(int i7) {
        int i10 = i7 / 8;
        this.f13954c = i10;
        this.f13955d = i7 - (i10 * 8);
        a();
    }

    public boolean q(int i7) {
        if (2 <= i7 && i7 < this.f13954c) {
            byte[] bArr = this.f13953b;
            if (bArr[i7] == 3 && bArr[i7 - 2] == 0 && bArr[i7 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void r() {
        switch (this.f13952a) {
            case 1:
                int i7 = this.f13955d + 1;
                this.f13955d = i7;
                if (i7 == 8) {
                    this.f13955d = 0;
                    this.f13954c++;
                }
                a();
                return;
            default:
                int i10 = this.f13956e + 1;
                this.f13956e = i10;
                if (i10 == 8) {
                    this.f13956e = 0;
                    int i11 = this.f13955d;
                    this.f13955d = i11 + (q(i11 + 1) ? 2 : 1);
                }
                a();
                return;
        }
    }

    public void s(int i7) {
        int i10;
        switch (this.f13952a) {
            case 1:
                int i11 = i7 / 8;
                int i12 = this.f13954c + i11;
                this.f13954c = i12;
                int i13 = (i7 - (i11 * 8)) + this.f13955d;
                this.f13955d = i13;
                if (i13 > 7) {
                    this.f13954c = i12 + 1;
                    this.f13955d = i13 - 8;
                }
                a();
                return;
            case 2:
                int i14 = this.f13955d;
                int i15 = i7 / 8;
                int i16 = i14 + i15;
                this.f13955d = i16;
                int i17 = (i7 - (i15 * 8)) + this.f13956e;
                this.f13956e = i17;
                if (i17 > 7) {
                    this.f13955d = i16 + 1;
                    this.f13956e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.f13955d) {
                        a();
                        return;
                    } else if (q(i14)) {
                        this.f13955d++;
                        i14 += 2;
                    }
                }
            default:
                int i18 = i7 / 8;
                int i19 = this.f13955d + i18;
                this.f13955d = i19;
                int i20 = (i7 - (i18 * 8)) + this.f13956e;
                this.f13956e = i20;
                boolean z8 = true;
                if (i20 > 7) {
                    this.f13955d = i19 + 1;
                    this.f13956e = i20 - 8;
                }
                int i21 = this.f13955d;
                if (i21 < 0 || (i21 >= (i10 = this.f13954c) && (i21 != i10 || this.f13956e != 0))) {
                    z8 = false;
                }
                AbstractC1705a.m(z8);
                return;
        }
    }

    public void t(int i7) {
        AbstractC1705a.m(this.f13955d == 0);
        this.f13954c += i7;
        a();
    }
}
