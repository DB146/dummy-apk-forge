package C4;

import java.util.Arrays;
import java.util.Collections;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o4.AbstractC1787a;
import o4.M;
import s4.C1981i;
import s4.InterfaceC1984l;

/* renamed from: C4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243e implements i {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f2709v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2710a;

    /* renamed from: d, reason: collision with root package name */
    public final String f2713d;

    /* renamed from: e, reason: collision with root package name */
    public String f2714e;

    /* renamed from: f, reason: collision with root package name */
    public s4.v f2715f;
    public s4.v g;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2718l;

    /* renamed from: o, reason: collision with root package name */
    public int f2721o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2722p;

    /* renamed from: r, reason: collision with root package name */
    public int f2724r;

    /* renamed from: t, reason: collision with root package name */
    public s4.v f2726t;

    /* renamed from: u, reason: collision with root package name */
    public long f2727u;

    /* renamed from: b, reason: collision with root package name */
    public final b5.f f2711b = new b5.f(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2712c = new n5.v(Arrays.copyOf(f2709v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f2716h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f2717i = 0;
    public int j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f2719m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f2720n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f2723q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f2725s = -9223372036854775807L;

    public C0243e(String str, boolean z8) {
        this.f2710a = z8;
        this.f2713d = str;
    }

    @Override // C4.i
    public final void a() {
        this.f2725s = -9223372036854775807L;
        this.f2718l = false;
        this.f2716h = 0;
        this.f2717i = 0;
        this.j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e7  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        int i7;
        byte b2;
        byte[] bArr;
        int i10;
        char c10;
        char c11;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 7;
        this.f2715f.getClass();
        int i15 = n5.D.f21141a;
        while (vVar.a() > 0) {
            int i16 = this.f2716h;
            b5.f fVar = this.f2711b;
            int i17 = 4;
            int i18 = 0;
            n5.v vVar2 = this.f2712c;
            if (i16 == 0) {
                byte[] bArr2 = vVar.f21229a;
                int i19 = vVar.f21230b;
                int i20 = vVar.f21231c;
                while (true) {
                    if (i19 >= i20) {
                        vVar.G(i19);
                        break;
                    }
                    i7 = i19 + 1;
                    b2 = bArr2[i19];
                    int i21 = b2 & 255;
                    if (this.j == 512 && ((65280 | (((byte) i21) & 255)) & 65526) == 65520) {
                        if (this.f2718l) {
                            break;
                        }
                        int i22 = i19 - 1;
                        vVar.G(i19);
                        byte[] bArr3 = fVar.f13953b;
                        if (vVar.a() >= 1) {
                            vVar.f(i18, bArr3, 1);
                            fVar.p(i17);
                            int i23 = fVar.i(1);
                            int i24 = this.f2719m;
                            if (i24 == -1 || i23 == i24) {
                                if (this.f2720n != -1) {
                                    byte[] bArr4 = fVar.f13953b;
                                    if (vVar.a() < 1) {
                                        break;
                                    }
                                    vVar.f(i18, bArr4, 1);
                                    fVar.p(i13);
                                    i12 = 4;
                                    if (fVar.i(4) == this.f2720n) {
                                        vVar.G(i7);
                                    }
                                } else {
                                    i12 = 4;
                                }
                                byte[] bArr5 = fVar.f13953b;
                                if (vVar.a() >= i12) {
                                    vVar.f(i18, bArr5, i12);
                                    fVar.p(14);
                                    int i25 = fVar.i(13);
                                    if (i25 >= 7) {
                                        byte[] bArr6 = vVar.f21229a;
                                        int i26 = vVar.f21231c;
                                        int i27 = i22 + i25;
                                        if (i27 < i26) {
                                            byte b10 = bArr6[i27];
                                            bArr = bArr2;
                                            if (b10 != -1) {
                                                if (b10 == 73) {
                                                    int i28 = i27 + 1;
                                                    if (i28 != i26) {
                                                        if (bArr6[i28] == 68) {
                                                            int i29 = i27 + 2;
                                                            if (i29 != i26) {
                                                                if (bArr6[i29] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i30 = i27 + 1;
                                                if (i30 != i26) {
                                                    byte b11 = bArr6[i30];
                                                    if (((65280 | (b11 & 255)) & 65526) == 65520 && ((b11 & 8) >> 3) == i23) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                bArr = bArr2;
                            }
                            int i31 = this.j;
                            i10 = i31 | i21;
                            if (i10 != 329) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                i11 = 0;
                                this.j = 768;
                            } else if (i10 == 511) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                i11 = 0;
                                this.j = 512;
                            } else if (i10 == 836) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                i11 = 0;
                                this.j = 1024;
                            } else {
                                if (i10 == 1075) {
                                    i13 = 2;
                                    this.f2716h = 2;
                                    this.f2717i = 3;
                                    this.f2724r = 0;
                                    vVar2.G(0);
                                    vVar.G(i7);
                                    break;
                                }
                                c10 = 256;
                                if (i31 != 256) {
                                    this.j = 256;
                                    i13 = 2;
                                    c11 = 3;
                                    i11 = 0;
                                    i18 = i11;
                                    bArr2 = bArr;
                                    i17 = 4;
                                } else {
                                    i13 = 2;
                                    c11 = 3;
                                    i11 = 0;
                                }
                            }
                            i19 = i7;
                            i18 = i11;
                            bArr2 = bArr;
                            i17 = 4;
                        }
                    }
                    bArr = bArr2;
                    int i312 = this.j;
                    i10 = i312 | i21;
                    if (i10 != 329) {
                    }
                    i19 = i7;
                    i18 = i11;
                    bArr2 = bArr;
                    i17 = 4;
                }
                this.f2721o = (b2 & 8) >> 3;
                this.k = (b2 & 1) == 0;
                if (this.f2718l) {
                    this.f2716h = 3;
                    this.f2717i = 0;
                } else {
                    this.f2716h = 1;
                    this.f2717i = 0;
                }
                vVar.G(i7);
                i13 = 2;
                i14 = 7;
            } else if (i16 != 1) {
                if (i16 == i13) {
                    byte[] bArr7 = vVar2.f21229a;
                    int min = Math.min(vVar.a(), 10 - this.f2717i);
                    vVar.f(this.f2717i, bArr7, min);
                    int i32 = this.f2717i + min;
                    this.f2717i = i32;
                    if (i32 == 10) {
                        this.g.c(10, vVar2);
                        vVar2.G(6);
                        s4.v vVar3 = this.g;
                        int u3 = vVar2.u() + 10;
                        this.f2716h = 4;
                        this.f2717i = 10;
                        this.f2726t = vVar3;
                        this.f2727u = 0L;
                        this.f2724r = u3;
                    }
                } else if (i16 == 3) {
                    int i33 = this.k ? i14 : 5;
                    byte[] bArr8 = fVar.f13953b;
                    int min2 = Math.min(vVar.a(), i33 - this.f2717i);
                    vVar.f(this.f2717i, bArr8, min2);
                    int i34 = this.f2717i + min2;
                    this.f2717i = i34;
                    if (i34 == i33) {
                        fVar.p(0);
                        if (this.f2722p) {
                            fVar.s(10);
                        } else {
                            int i35 = fVar.i(i13) + 1;
                            if (i35 != i13) {
                                AbstractC1705a.S("AdtsReader", "Detected audio object type: " + i35 + ", but assuming AAC LC.");
                                i35 = i13;
                            }
                            fVar.s(5);
                            byte[] b12 = AbstractC1787a.b(i35, this.f2720n, fVar.i(3));
                            M k = AbstractC1787a.k(new b5.f(b12, i13), false);
                            K k7 = new K();
                            k7.f19976a = this.f2714e;
                            k7.k = "audio/mp4a-latm";
                            k7.f19982h = (String) k.f21768c;
                            k7.f19996x = k.f21767b;
                            k7.f19997y = k.f21766a;
                            k7.f19985m = Collections.singletonList(b12);
                            k7.f19978c = this.f2713d;
                            L l10 = new L(k7);
                            this.f2723q = 1024000000 / l10.f20076N;
                            this.f2715f.a(l10);
                            this.f2722p = true;
                        }
                        fVar.s(4);
                        int i36 = fVar.i(13);
                        int i37 = i36 - 7;
                        if (this.k) {
                            i37 = i36 - 9;
                        }
                        s4.v vVar4 = this.f2715f;
                        long j = this.f2723q;
                        this.f2716h = 4;
                        this.f2717i = 0;
                        this.f2726t = vVar4;
                        this.f2727u = j;
                        this.f2724r = i37;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(vVar.a(), this.f2724r - this.f2717i);
                    this.f2726t.c(min3, vVar);
                    int i38 = this.f2717i + min3;
                    this.f2717i = i38;
                    int i39 = this.f2724r;
                    if (i38 == i39) {
                        long j10 = this.f2725s;
                        if (j10 != -9223372036854775807L) {
                            this.f2726t.e(j10, 1, i39, 0, null);
                            this.f2725s += this.f2727u;
                        }
                        this.f2716h = 0;
                        this.f2717i = 0;
                        this.j = 256;
                    }
                }
            } else if (vVar.a() != 0) {
                fVar.f13953b[0] = vVar.f21229a[vVar.f21230b];
                fVar.p(i13);
                int i40 = fVar.i(4);
                int i41 = this.f2720n;
                if (i41 == -1 || i40 == i41) {
                    if (!this.f2718l) {
                        this.f2718l = true;
                        this.f2719m = this.f2721o;
                        this.f2720n = i40;
                    }
                    this.f2716h = 3;
                    this.f2717i = 0;
                } else {
                    this.f2718l = false;
                    this.f2716h = 0;
                    this.f2717i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f2725s = j;
        }
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2714e = f4.f2684e;
        f4.b();
        s4.v u3 = interfaceC1984l.u(f4.f2683d, 1);
        this.f2715f = u3;
        this.f2726t = u3;
        if (!this.f2710a) {
            this.g = new C1981i();
            return;
        }
        f4.a();
        f4.b();
        s4.v u10 = interfaceC1984l.u(f4.f2683d, 5);
        this.g = u10;
        K k = new K();
        f4.b();
        k.f19976a = f4.f2684e;
        k.k = "application/id3";
        h3.o.w(k, u10);
    }
}
