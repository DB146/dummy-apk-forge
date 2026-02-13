package C4;

import java.util.Arrays;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o4.AbstractC1787a;
import s4.InterfaceC1984l;

/* renamed from: C4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245g implements i {

    /* renamed from: b, reason: collision with root package name */
    public final String f2731b;

    /* renamed from: c, reason: collision with root package name */
    public String f2732c;

    /* renamed from: d, reason: collision with root package name */
    public s4.v f2733d;

    /* renamed from: f, reason: collision with root package name */
    public int f2735f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public long f2736h;

    /* renamed from: i, reason: collision with root package name */
    public L f2737i;
    public int j;

    /* renamed from: a, reason: collision with root package name */
    public final n5.v f2730a = new n5.v(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    public int f2734e = 0;
    public long k = -9223372036854775807L;

    public C0245g(String str) {
        this.f2731b = str;
    }

    @Override // C4.i
    public final void a() {
        this.f2734e = 0;
        this.f2735f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        char c10;
        int i7;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        b5.f fVar;
        int i17;
        int i18;
        AbstractC1705a.n(this.f2733d);
        while (vVar.a() > 0) {
            int i19 = this.f2734e;
            int i20 = 2;
            int i21 = 8;
            n5.v vVar2 = this.f2730a;
            if (i19 == 0) {
                while (vVar.a() > 0) {
                    int i22 = this.g << 8;
                    this.g = i22;
                    int v10 = i22 | vVar.v();
                    this.g = v10;
                    if (v10 == 2147385345 || v10 == -25230976 || v10 == 536864768 || v10 == -14745368) {
                        byte[] bArr = vVar2.f21229a;
                        bArr[0] = (byte) ((v10 >> 24) & 255);
                        bArr[1] = (byte) ((v10 >> 16) & 255);
                        bArr[2] = (byte) ((v10 >> 8) & 255);
                        bArr[3] = (byte) (v10 & 255);
                        this.f2735f = 4;
                        this.g = 0;
                        this.f2734e = 1;
                        break;
                    }
                }
            } else if (i19 == 1) {
                byte[] bArr2 = vVar2.f21229a;
                int min = Math.min(vVar.a(), 18 - this.f2735f);
                vVar.f(this.f2735f, bArr2, min);
                int i23 = this.f2735f + min;
                this.f2735f = i23;
                if (i23 == 18) {
                    byte[] bArr3 = vVar2.f21229a;
                    if (this.f2737i == null) {
                        String str = this.f2732c;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            fVar = new b5.f(bArr3, bArr3.length);
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b2 = copyOf[0];
                            if (b2 == -2 || b2 == -1) {
                                for (int i24 = 0; i24 < copyOf.length - 1; i24 += 2) {
                                    byte b10 = copyOf[i24];
                                    int i25 = i24 + 1;
                                    copyOf[i24] = copyOf[i25];
                                    copyOf[i25] = b10;
                                }
                            }
                            b5.f fVar2 = new b5.f(copyOf, copyOf.length);
                            if (copyOf[0] == 31) {
                                b5.f fVar3 = new b5.f(copyOf, copyOf.length);
                                while (fVar3.b() >= 16) {
                                    fVar3.s(i20);
                                    int i26 = fVar3.i(14) & 16383;
                                    int min2 = Math.min(8 - fVar2.f13955d, 14);
                                    int i27 = fVar2.f13955d;
                                    int i28 = (8 - i27) - min2;
                                    byte[] bArr4 = fVar2.f13953b;
                                    int i29 = fVar2.f13954c;
                                    byte b11 = (byte) (bArr4[i29] & ((65280 >> i27) | ((1 << i28) - 1)));
                                    bArr4[i29] = b11;
                                    int i30 = 14 - min2;
                                    bArr4[i29] = (byte) (b11 | ((i26 >>> i30) << i28));
                                    int i31 = i29 + 1;
                                    while (i30 > i21) {
                                        fVar2.f13953b[i31] = (byte) (i26 >>> (i30 - 8));
                                        i30 -= 8;
                                        i31++;
                                        i21 = 8;
                                    }
                                    byte[] bArr5 = fVar2.f13953b;
                                    byte b12 = (byte) (bArr5[i31] & ((1 << r3) - 1));
                                    bArr5[i31] = b12;
                                    bArr5[i31] = (byte) (((i26 & ((1 << i30) - 1)) << (8 - i30)) | b12);
                                    fVar2.s(14);
                                    fVar2.a();
                                    i20 = 2;
                                    i21 = 8;
                                }
                            }
                            fVar2.n(copyOf.length, copyOf);
                            fVar = fVar2;
                        }
                        fVar.s(60);
                        int i32 = AbstractC1787a.j[fVar.i(6)];
                        int i33 = AbstractC1787a.k[fVar.i(4)];
                        int i34 = fVar.i(5);
                        if (i34 >= 29) {
                            i18 = -1;
                            i17 = 2;
                        } else {
                            int i35 = AbstractC1787a.f21824l[i34] * 1000;
                            i17 = 2;
                            i18 = i35 / 2;
                        }
                        fVar.s(10);
                        int i36 = i32 + (fVar.i(i17) > 0 ? 1 : 0);
                        K k = new K();
                        k.f19976a = str;
                        k.k = "audio/vnd.dts";
                        k.f19981f = i18;
                        k.f19996x = i36;
                        k.f19997y = i33;
                        k.f19986n = null;
                        k.f19978c = this.f2731b;
                        L l10 = new L(k);
                        this.f2737i = l10;
                        this.f2733d.a(l10);
                        c10 = 0;
                    } else {
                        c10 = 0;
                    }
                    byte b13 = bArr3[c10];
                    if (b13 != -2) {
                        if (b13 == -1) {
                            i15 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            i16 = (bArr3[9] & 60) >> 2;
                        } else if (b13 != 31) {
                            i7 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4) | ((bArr3[7] & 240) >> 4);
                        } else {
                            i15 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            i16 = (bArr3[8] & 60) >> 2;
                        }
                        i10 = (i15 | i16) + 1;
                        z8 = true;
                        if (z8) {
                            i10 = (i10 * 16) / 14;
                        }
                        this.j = i10;
                        if (b13 != -2) {
                            i11 = 2;
                            i12 = (bArr3[5] & 1) << 6;
                            i13 = bArr3[4] & 252;
                        } else if (b13 == -1) {
                            i14 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                            this.f2736h = (int) ((((i14 + 1) * 32) * 1000000) / this.f2737i.f20076N);
                            vVar2.G(0);
                            this.f2733d.c(18, vVar2);
                            this.f2734e = 2;
                        } else if (b13 != 31) {
                            i12 = (bArr3[4] & 1) << 6;
                            i13 = bArr3[5] & 252;
                            i11 = 2;
                        } else {
                            i11 = 2;
                            i12 = (7 & bArr3[5]) << 4;
                            i13 = bArr3[6] & 60;
                        }
                        i14 = (i13 >> i11) | i12;
                        this.f2736h = (int) ((((i14 + 1) * 32) * 1000000) / this.f2737i.f20076N);
                        vVar2.G(0);
                        this.f2733d.c(18, vVar2);
                        this.f2734e = 2;
                    } else {
                        i7 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4) | ((bArr3[6] & 240) >> 4);
                    }
                    i10 = i7 + 1;
                    z8 = false;
                    if (z8) {
                    }
                    this.j = i10;
                    if (b13 != -2) {
                    }
                    i14 = (i13 >> i11) | i12;
                    this.f2736h = (int) ((((i14 + 1) * 32) * 1000000) / this.f2737i.f20076N);
                    vVar2.G(0);
                    this.f2733d.c(18, vVar2);
                    this.f2734e = 2;
                }
            } else {
                if (i19 != 2) {
                    throw new IllegalStateException();
                }
                int min3 = Math.min(vVar.a(), this.j - this.f2735f);
                this.f2733d.c(min3, vVar);
                int i37 = this.f2735f + min3;
                this.f2735f = i37;
                int i38 = this.j;
                if (i37 == i38) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.f2733d.e(j, 1, i38, 0, null);
                        this.k += this.f2736h;
                    }
                    this.f2734e = 0;
                }
            }
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2732c = f4.f2684e;
        f4.b();
        this.f2733d = interfaceC1984l.u(f4.f2683d, 1);
    }
}
