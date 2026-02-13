package C4;

import n5.AbstractC1705a;
import n5.C1704A;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class w implements G {

    /* renamed from: a, reason: collision with root package name */
    public final i f2879a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.f f2880b = new b5.f(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f2881c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2882d;

    /* renamed from: e, reason: collision with root package name */
    public C1704A f2883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2884f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2885h;

    /* renamed from: i, reason: collision with root package name */
    public int f2886i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f2887l;

    public w(i iVar) {
        this.f2879a = iVar;
    }

    @Override // C4.G
    public final void a() {
        this.f2881c = 0;
        this.f2882d = 0;
        this.f2885h = false;
        this.f2879a.a();
    }

    @Override // C4.G
    public final void b(int i7, n5.v vVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC1705a.n(this.f2883e);
        int i14 = i7 & 1;
        i iVar = this.f2879a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        if (i14 != 0) {
            int i18 = this.f2881c;
            if (i18 != 0 && i18 != 1) {
                if (i18 == 2) {
                    AbstractC1705a.S("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i18 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        AbstractC1705a.S("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.d();
                }
            }
            this.f2881c = 1;
            this.f2882d = 0;
        }
        int i19 = i7;
        while (vVar.a() > 0) {
            int i20 = this.f2881c;
            if (i20 != 0) {
                b5.f fVar = this.f2880b;
                if (i20 == 1) {
                    i12 = i16;
                    if (d(vVar, fVar.f13953b, 9)) {
                        fVar.p(0);
                        int i21 = fVar.i(24);
                        if (i21 != 1) {
                            h3.o.u(i21, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            i13 = 0;
                            i11 = -1;
                            i10 = 2;
                        } else {
                            fVar.s(8);
                            int i22 = fVar.i(16);
                            fVar.s(5);
                            this.k = fVar.h();
                            i10 = 2;
                            fVar.s(2);
                            this.f2884f = fVar.h();
                            this.g = fVar.h();
                            fVar.s(6);
                            int i23 = fVar.i(8);
                            this.f2886i = i23;
                            if (i22 == 0) {
                                this.j = -1;
                                i11 = -1;
                            } else {
                                int i24 = (i22 - 3) - i23;
                                this.j = i24;
                                if (i24 < 0) {
                                    AbstractC1705a.S("PesReader", "Found negative packet payload size: " + this.j);
                                    i11 = -1;
                                    this.j = -1;
                                } else {
                                    i11 = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f2881c = i13;
                        this.f2882d = 0;
                    } else {
                        i11 = -1;
                        i10 = 2;
                    }
                } else if (i20 == i17) {
                    if (d(vVar, fVar.f13953b, Math.min(10, this.f2886i)) && d(vVar, null, this.f2886i)) {
                        fVar.p(0);
                        this.f2887l = -9223372036854775807L;
                        if (this.f2884f) {
                            fVar.s(4);
                            fVar.s(1);
                            fVar.s(1);
                            long i25 = (fVar.i(15) << 15) | (fVar.i(i16) << 30) | fVar.i(15);
                            fVar.s(1);
                            if (!this.f2885h && this.g) {
                                fVar.s(4);
                                fVar.s(1);
                                fVar.s(1);
                                fVar.s(1);
                                this.f2883e.b((fVar.i(3) << 30) | (fVar.i(15) << 15) | fVar.i(15));
                                this.f2885h = true;
                            }
                            this.f2887l = this.f2883e.b(i25);
                        }
                        i19 |= this.k ? 4 : 0;
                        iVar.c(i19, this.f2887l);
                        this.f2881c = 3;
                        this.f2882d = 0;
                        i16 = 3;
                        i15 = -1;
                        i17 = 2;
                    } else {
                        i12 = i16;
                        i10 = i17;
                        i11 = -1;
                    }
                } else {
                    if (i20 != i16) {
                        throw new IllegalStateException();
                    }
                    int a9 = vVar.a();
                    int i26 = this.j;
                    int i27 = i26 == i15 ? 0 : a9 - i26;
                    if (i27 > 0) {
                        a9 -= i27;
                        vVar.F(vVar.f21230b + a9);
                    }
                    iVar.b(vVar);
                    int i28 = this.j;
                    if (i28 != i15) {
                        int i29 = i28 - a9;
                        this.j = i29;
                        if (i29 == 0) {
                            iVar.d();
                            this.f2881c = 1;
                            this.f2882d = 0;
                        }
                    }
                    i10 = i17;
                    int i30 = i16;
                    i11 = i15;
                    i12 = i30;
                }
            } else {
                i10 = i17;
                int i31 = i16;
                i11 = i15;
                i12 = i31;
                vVar.H(vVar.a());
            }
            i17 = i10;
            int i32 = i11;
            i16 = i12;
            i15 = i32;
        }
    }

    @Override // C4.G
    public final void c(C1704A c1704a, InterfaceC1984l interfaceC1984l, F f4) {
        this.f2883e = c1704a;
        this.f2879a.e(interfaceC1984l, f4);
    }

    public final boolean d(n5.v vVar, byte[] bArr, int i7) {
        int min = Math.min(vVar.a(), i7 - this.f2882d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.H(min);
        } else {
            vVar.f(this.f2882d, bArr, min);
        }
        int i10 = this.f2882d + min;
        this.f2882d = i10;
        return i10 == i7;
    }
}
