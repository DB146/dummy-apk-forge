package C4;

import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o4.AbstractC1787a;
import o4.C1788b;
import s4.InterfaceC1984l;

/* renamed from: C4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.f f2689b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2690c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2691d;

    /* renamed from: e, reason: collision with root package name */
    public String f2692e;

    /* renamed from: f, reason: collision with root package name */
    public s4.v f2693f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f2694h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2695i;
    public long j;
    public L k;

    /* renamed from: l, reason: collision with root package name */
    public int f2696l;

    /* renamed from: m, reason: collision with root package name */
    public long f2697m;

    public C0240b(String str, int i7) {
        this.f2688a = i7;
        switch (i7) {
            case 1:
                b5.f fVar = new b5.f(new byte[16], 16);
                this.f2689b = fVar;
                this.f2690c = new n5.v(fVar.f13953b);
                this.g = 0;
                this.f2694h = 0;
                this.f2695i = false;
                this.f2697m = -9223372036854775807L;
                this.f2691d = str;
                return;
            default:
                b5.f fVar2 = new b5.f(new byte[128], 128);
                this.f2689b = fVar2;
                this.f2690c = new n5.v(fVar2.f13953b);
                this.g = 0;
                this.f2697m = -9223372036854775807L;
                this.f2691d = str;
                return;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // C4.i
    public final void a() {
        switch (this.f2688a) {
            case 0:
                this.g = 0;
                this.f2694h = 0;
                this.f2695i = false;
                this.f2697m = -9223372036854775807L;
                return;
            default:
                this.g = 0;
                this.f2694h = 0;
                this.f2695i = false;
                this.f2697m = -9223372036854775807L;
                return;
        }
    }

    @Override // C4.i
    public final void b(n5.v vVar) {
        switch (this.f2688a) {
            case 0:
                AbstractC1705a.n(this.f2693f);
                while (vVar.a() > 0) {
                    int i7 = this.g;
                    n5.v vVar2 = this.f2690c;
                    if (i7 == 0) {
                        while (true) {
                            if (vVar.a() <= 0) {
                                break;
                            }
                            if (this.f2695i) {
                                int v10 = vVar.v();
                                if (v10 == 119) {
                                    this.f2695i = false;
                                    this.g = 1;
                                    byte[] bArr = vVar2.f21229a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f2694h = 2;
                                } else {
                                    this.f2695i = v10 == 11;
                                }
                            } else {
                                this.f2695i = vVar.v() == 11;
                            }
                        }
                    } else if (i7 == 1) {
                        byte[] bArr2 = vVar2.f21229a;
                        int min = Math.min(vVar.a(), 128 - this.f2694h);
                        vVar.f(this.f2694h, bArr2, min);
                        int i10 = this.f2694h + min;
                        this.f2694h = i10;
                        if (i10 == 128) {
                            b5.f fVar = this.f2689b;
                            fVar.p(0);
                            C1788b i11 = AbstractC1787a.i(fVar);
                            L l10 = this.k;
                            String str = i11.f21832a;
                            int i12 = i11.f21833b;
                            int i13 = i11.f21834c;
                            if (l10 == null || i13 != l10.f20075M || i12 != l10.f20076N || !n5.D.a(str, l10.f20096z)) {
                                K k = new K();
                                k.f19976a = this.f2692e;
                                k.k = str;
                                k.f19996x = i13;
                                k.f19997y = i12;
                                k.f19978c = this.f2691d;
                                int i14 = i11.f21837f;
                                k.g = i14;
                                if ("audio/ac3".equals(str)) {
                                    k.f19981f = i14;
                                }
                                L l11 = new L(k);
                                this.k = l11;
                                this.f2693f.a(l11);
                            }
                            this.f2696l = i11.f21835d;
                            this.j = (i11.f21836e * 1000000) / this.k.f20076N;
                            vVar2.G(0);
                            this.f2693f.c(128, vVar2);
                            this.g = 2;
                        }
                    } else if (i7 == 2) {
                        int min2 = Math.min(vVar.a(), this.f2696l - this.f2694h);
                        this.f2693f.c(min2, vVar);
                        int i15 = this.f2694h + min2;
                        this.f2694h = i15;
                        int i16 = this.f2696l;
                        if (i15 == i16) {
                            long j = this.f2697m;
                            if (j != -9223372036854775807L) {
                                this.f2693f.e(j, 1, i16, 0, null);
                                this.f2697m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                return;
            default:
                AbstractC1705a.n(this.f2693f);
                while (vVar.a() > 0) {
                    int i17 = this.g;
                    n5.v vVar3 = this.f2690c;
                    if (i17 == 0) {
                        while (vVar.a() > 0) {
                            if (this.f2695i) {
                                int v11 = vVar.v();
                                this.f2695i = v11 == 172;
                                if (v11 == 64 || v11 == 65) {
                                    boolean z8 = v11 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = vVar3.f21229a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z8 ? 65 : 64);
                                    this.f2694h = 2;
                                }
                            } else {
                                this.f2695i = vVar.v() == 172;
                            }
                        }
                    } else if (i17 == 1) {
                        byte[] bArr4 = vVar3.f21229a;
                        int min3 = Math.min(vVar.a(), 16 - this.f2694h);
                        vVar.f(this.f2694h, bArr4, min3);
                        int i18 = this.f2694h + min3;
                        this.f2694h = i18;
                        if (i18 == 16) {
                            b5.f fVar2 = this.f2689b;
                            fVar2.p(0);
                            E3.h j10 = AbstractC1787a.j(fVar2);
                            L l12 = this.k;
                            int i19 = j10.f3537a;
                            if (l12 == null || 2 != l12.f20075M || i19 != l12.f20076N || !"audio/ac4".equals(l12.f20096z)) {
                                K k7 = new K();
                                k7.f19976a = this.f2692e;
                                k7.k = "audio/ac4";
                                k7.f19996x = 2;
                                k7.f19997y = i19;
                                k7.f19978c = this.f2691d;
                                L l13 = new L(k7);
                                this.k = l13;
                                this.f2693f.a(l13);
                            }
                            this.f2696l = j10.f3538b;
                            this.j = (j10.f3539c * 1000000) / this.k.f20076N;
                            vVar3.G(0);
                            this.f2693f.c(16, vVar3);
                            this.g = 2;
                        }
                    } else if (i17 == 2) {
                        int min4 = Math.min(vVar.a(), this.f2696l - this.f2694h);
                        this.f2693f.c(min4, vVar);
                        int i20 = this.f2694h + min4;
                        this.f2694h = i20;
                        int i21 = this.f2696l;
                        if (i20 == i21) {
                            long j11 = this.f2697m;
                            if (j11 != -9223372036854775807L) {
                                this.f2693f.e(j11, 1, i21, 0, null);
                                this.f2697m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                return;
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        switch (this.f2688a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f2697m = j;
                    return;
                }
                return;
            default:
                if (j != -9223372036854775807L) {
                    this.f2697m = j;
                    return;
                }
                return;
        }
    }

    @Override // C4.i
    public final void d() {
        int i7 = this.f2688a;
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        switch (this.f2688a) {
            case 0:
                f4.a();
                f4.b();
                this.f2692e = f4.f2684e;
                f4.b();
                this.f2693f = interfaceC1984l.u(f4.f2683d, 1);
                return;
            default:
                f4.a();
                f4.b();
                this.f2692e = f4.f2684e;
                f4.b();
                this.f2693f = interfaceC1984l.u(f4.f2683d, 1);
                return;
        }
    }
}
