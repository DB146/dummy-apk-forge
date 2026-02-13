package C4;

import java.util.Collections;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o4.AbstractC1787a;
import o4.M;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2847b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.f f2848c;

    /* renamed from: d, reason: collision with root package name */
    public s4.v f2849d;

    /* renamed from: e, reason: collision with root package name */
    public String f2850e;

    /* renamed from: f, reason: collision with root package name */
    public L f2851f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f2852h;

    /* renamed from: i, reason: collision with root package name */
    public int f2853i;
    public int j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2854l;

    /* renamed from: m, reason: collision with root package name */
    public int f2855m;

    /* renamed from: n, reason: collision with root package name */
    public int f2856n;

    /* renamed from: o, reason: collision with root package name */
    public int f2857o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2858p;

    /* renamed from: q, reason: collision with root package name */
    public long f2859q;

    /* renamed from: r, reason: collision with root package name */
    public int f2860r;

    /* renamed from: s, reason: collision with root package name */
    public long f2861s;

    /* renamed from: t, reason: collision with root package name */
    public int f2862t;

    /* renamed from: u, reason: collision with root package name */
    public String f2863u;

    public t(String str) {
        this.f2846a = str;
        n5.v vVar = new n5.v(1024);
        this.f2847b = vVar;
        byte[] bArr = vVar.f21229a;
        this.f2848c = new b5.f(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    @Override // C4.i
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.f2854l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0192, code lost:
    
        if (r23.f2854l == false) goto L68;
     */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        int i7;
        boolean h10;
        AbstractC1705a.n(this.f2849d);
        while (vVar.a() > 0) {
            int i10 = this.g;
            if (i10 != 0) {
                if (i10 != 1) {
                    n5.v vVar2 = this.f2847b;
                    b5.f fVar = this.f2848c;
                    if (i10 == 2) {
                        int v10 = ((this.j & (-225)) << 8) | vVar.v();
                        this.f2853i = v10;
                        if (v10 > vVar2.f21229a.length) {
                            vVar2.D(v10);
                            byte[] bArr = vVar2.f21229a;
                            fVar.getClass();
                            fVar.n(bArr.length, bArr);
                        }
                        this.f2852h = 0;
                        this.g = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(vVar.a(), this.f2853i - this.f2852h);
                        vVar.f(this.f2852h, fVar.f13953b, min);
                        int i11 = this.f2852h + min;
                        this.f2852h = i11;
                        if (i11 == this.f2853i) {
                            fVar.p(0);
                            if (!fVar.h()) {
                                this.f2854l = true;
                                int i12 = fVar.i(1);
                                int i13 = i12 == 1 ? fVar.i(1) : 0;
                                this.f2855m = i13;
                                if (i13 != 0) {
                                    throw C1586o0.a(null, null);
                                }
                                if (i12 == 1) {
                                    fVar.i((fVar.i(2) + 1) * 8);
                                }
                                if (!fVar.h()) {
                                    throw C1586o0.a(null, null);
                                }
                                this.f2856n = fVar.i(6);
                                int i14 = fVar.i(4);
                                int i15 = fVar.i(3);
                                if (i14 != 0 || i15 != 0) {
                                    throw C1586o0.a(null, null);
                                }
                                if (i12 == 0) {
                                    int g = fVar.g();
                                    int b2 = fVar.b();
                                    M k = AbstractC1787a.k(fVar, true);
                                    this.f2863u = (String) k.f21768c;
                                    this.f2860r = k.f21766a;
                                    this.f2862t = k.f21767b;
                                    int b10 = b2 - fVar.b();
                                    fVar.p(g);
                                    byte[] bArr2 = new byte[(b10 + 7) / 8];
                                    fVar.j(b10, bArr2);
                                    K k7 = new K();
                                    k7.f19976a = this.f2850e;
                                    k7.k = "audio/mp4a-latm";
                                    k7.f19982h = this.f2863u;
                                    k7.f19996x = this.f2862t;
                                    k7.f19997y = this.f2860r;
                                    k7.f19985m = Collections.singletonList(bArr2);
                                    k7.f19978c = this.f2846a;
                                    L l10 = new L(k7);
                                    if (!l10.equals(this.f2851f)) {
                                        this.f2851f = l10;
                                        this.f2861s = 1024000000 / l10.f20076N;
                                        this.f2849d.a(l10);
                                    }
                                } else {
                                    int b11 = fVar.b();
                                    M k10 = AbstractC1787a.k(fVar, true);
                                    this.f2863u = (String) k10.f21768c;
                                    this.f2860r = k10.f21766a;
                                    this.f2862t = k10.f21767b;
                                    fVar.s(fVar.i((fVar.i(2) + 1) * 8) - (b11 - fVar.b()));
                                }
                                int i16 = fVar.i(3);
                                this.f2857o = i16;
                                if (i16 == 0) {
                                    fVar.s(8);
                                } else if (i16 == 1) {
                                    fVar.s(9);
                                } else if (i16 == 3 || i16 == 4 || i16 == 5) {
                                    fVar.s(6);
                                } else {
                                    if (i16 != 6 && i16 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    fVar.s(1);
                                }
                                boolean h11 = fVar.h();
                                this.f2858p = h11;
                                this.f2859q = 0L;
                                if (h11) {
                                    if (i12 == 1) {
                                        this.f2859q = fVar.i((fVar.i(2) + 1) * 8);
                                    }
                                    do {
                                        h10 = fVar.h();
                                        this.f2859q = (this.f2859q << 8) + fVar.i(8);
                                    } while (h10);
                                }
                                if (fVar.h()) {
                                    fVar.s(8);
                                }
                            }
                            if (this.f2855m != 0) {
                                throw C1586o0.a(null, null);
                            }
                            if (this.f2856n != 0) {
                                throw C1586o0.a(null, null);
                            }
                            if (this.f2857o != 0) {
                                throw C1586o0.a(null, null);
                            }
                            int i17 = 0;
                            do {
                                i7 = fVar.i(8);
                                i17 += i7;
                            } while (i7 == 255);
                            int g2 = fVar.g();
                            if ((g2 & 7) == 0) {
                                vVar2.G(g2 >> 3);
                            } else {
                                fVar.j(i17 * 8, vVar2.f21229a);
                                vVar2.G(0);
                            }
                            this.f2849d.c(i17, vVar2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.f2849d.e(j, 1, i17, 0, null);
                                this.k += this.f2861s;
                            }
                            if (this.f2858p) {
                                fVar.s((int) this.f2859q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int v11 = vVar.v();
                    if ((v11 & 224) == 224) {
                        this.j = v11;
                        this.g = 2;
                    } else if (v11 != 86) {
                        this.g = 0;
                    }
                }
            } else if (vVar.v() == 86) {
                this.g = 1;
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
        this.f2849d = interfaceC1984l.u(f4.f2683d, 1);
        f4.b();
        this.f2850e = f4.f2684e;
    }
}
