package C4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import m4.K;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final q3.e f2813a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2814b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2815c;
    public long g;

    /* renamed from: i, reason: collision with root package name */
    public String f2820i;
    public s4.v j;
    public p k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2821l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2823n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f2819h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final v f2816d = new v(7);

    /* renamed from: e, reason: collision with root package name */
    public final v f2817e = new v(8);

    /* renamed from: f, reason: collision with root package name */
    public final v f2818f = new v(6);

    /* renamed from: m, reason: collision with root package name */
    public long f2822m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final n5.v f2824o = new n5.v();

    public q(q3.e eVar, boolean z8, boolean z10) {
        this.f2813a = eVar;
        this.f2814b = z8;
        this.f2815c = z10;
    }

    @Override // C4.i
    public final void a() {
        this.g = 0L;
        this.f2823n = false;
        this.f2822m = -9223372036854775807L;
        AbstractC1705a.q(this.f2819h);
        this.f2816d.f();
        this.f2817e.f();
        this.f2818f.f();
        p pVar = this.k;
        if (pVar != null) {
            pVar.k = false;
            pVar.f2809o = false;
            o oVar = pVar.f2808n;
            oVar.f2786b = false;
            oVar.f2785a = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f6, code lost:
    
        if (r7.f2795n != r8.f2795n) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0207, code lost:
    
        if (r7.f2797p != r8.f2797p) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0215, code lost:
    
        if (r7.f2793l != r8.f2793l) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a9, code lost:
    
        if (r2 != 1) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ac  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        int i7;
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        char c10;
        v vVar2;
        p pVar;
        boolean z8;
        long j;
        boolean z10;
        int i13;
        p pVar2;
        int i14;
        int i15;
        int i16;
        char c11 = 3;
        AbstractC1705a.n(this.j);
        int i17 = n5.D.f21141a;
        int i18 = vVar.f21230b;
        int i19 = vVar.f21231c;
        byte[] bArr2 = vVar.f21229a;
        this.g += vVar.a();
        this.j.c(vVar.a(), vVar);
        while (true) {
            int w10 = AbstractC1705a.w(bArr2, i18, i19, this.f2819h);
            if (w10 == i19) {
                f(i18, bArr2, i19);
                return;
            }
            int i20 = w10 + 3;
            int i21 = bArr2[i20] & 31;
            int i22 = w10 - i18;
            if (i22 > 0) {
                f(i18, bArr2, w10);
            }
            int i23 = i19 - w10;
            long j10 = this.g - i23;
            int i24 = i22 < 0 ? -i22 : 0;
            long j11 = this.f2822m;
            boolean z11 = this.f2821l;
            v vVar3 = this.f2817e;
            v vVar4 = this.f2816d;
            if (!z11 || this.k.f2800c) {
                vVar4.e(i24);
                vVar3.e(i24);
                if (this.f2821l) {
                    i7 = i23;
                    i10 = i19;
                    bArr = bArr2;
                    i11 = i20;
                    i12 = i21;
                    if (vVar4.f2877e) {
                        c10 = 3;
                        n5.r J10 = AbstractC1705a.J(3, (byte[]) vVar4.f2878f, vVar4.f2875c);
                        this.k.f2801d.append(J10.f21209d, J10);
                        vVar4.f();
                    } else {
                        c10 = 3;
                        if (vVar3.f2877e) {
                            b5.f fVar = new b5.f((byte[]) vVar3.f2878f, 4, vVar3.f2875c);
                            int l10 = fVar.l();
                            int l11 = fVar.l();
                            fVar.r();
                            this.k.f2802e.append(l10, new n5.q(fVar.h(), l10, l11));
                            vVar3.f();
                        }
                    }
                } else if (vVar4.f2877e && vVar3.f2877e) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) vVar4.f2878f, vVar4.f2875c));
                    arrayList.add(Arrays.copyOf((byte[]) vVar3.f2878f, vVar3.f2875c));
                    i10 = i19;
                    n5.r J11 = AbstractC1705a.J(3, (byte[]) vVar4.f2878f, vVar4.f2875c);
                    bArr = bArr2;
                    i11 = i20;
                    b5.f fVar2 = new b5.f((byte[]) vVar3.f2878f, 4, vVar3.f2875c);
                    int l12 = fVar2.l();
                    int l13 = fVar2.l();
                    fVar2.r();
                    n5.q qVar = new n5.q(fVar2.h(), l12, l13);
                    i12 = i21;
                    String e2 = AbstractC1705a.e(J11.f21206a, J11.f21207b, J11.f21208c);
                    s4.v vVar5 = this.j;
                    K k = new K();
                    i7 = i23;
                    k.f19976a = this.f2820i;
                    k.k = "video/avc";
                    k.f19982h = e2;
                    k.f19988p = J11.f21210e;
                    k.f19989q = J11.f21211f;
                    k.f19992t = J11.g;
                    k.f19985m = arrayList;
                    h3.o.w(k, vVar5);
                    this.f2821l = true;
                    this.k.f2801d.append(J11.f21209d, J11);
                    this.k.f2802e.append(l12, qVar);
                    vVar4.f();
                    vVar3.f();
                    c10 = 3;
                }
                vVar2 = this.f2818f;
                if (vVar2.e(i24)) {
                    int Q3 = AbstractC1705a.Q(vVar2.f2875c, (byte[]) vVar2.f2878f);
                    byte[] bArr3 = (byte[]) vVar2.f2878f;
                    n5.v vVar6 = this.f2824o;
                    vVar6.E(Q3, bArr3);
                    vVar6.G(4);
                    c2.i.i(j11, vVar6, (s4.v[]) this.f2813a.f23377c);
                }
                pVar = this.k;
                z8 = this.f2821l;
                boolean z12 = this.f2823n;
                if (pVar.f2805i != 9) {
                    if (pVar.f2800c) {
                        o oVar = pVar.f2808n;
                        o oVar2 = pVar.f2807m;
                        if (oVar.f2785a) {
                            if (oVar2.f2785a) {
                                n5.r rVar = oVar.f2787c;
                                AbstractC1705a.n(rVar);
                                n5.r rVar2 = oVar2.f2787c;
                                AbstractC1705a.n(rVar2);
                                if (oVar.f2790f == oVar2.f2790f && oVar.g == oVar2.g && oVar.f2791h == oVar2.f2791h && ((!oVar.f2792i || !oVar2.f2792i || oVar.j == oVar2.j) && ((i15 = oVar.f2788d) == (i16 = oVar2.f2788d) || (i15 != 0 && i16 != 0)))) {
                                    int i25 = rVar2.k;
                                    int i26 = rVar.k;
                                    if (i26 == 0) {
                                        if (i25 == 0) {
                                            if (oVar.f2794m == oVar2.f2794m) {
                                            }
                                        }
                                    }
                                    if (i26 == 1) {
                                        if (i25 == 1) {
                                            if (oVar.f2796o == oVar2.f2796o) {
                                            }
                                        }
                                    }
                                    boolean z13 = oVar.k;
                                    if (z13 == oVar2.k) {
                                        if (z13) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (pVar.f2799b) {
                        o oVar3 = pVar.f2808n;
                        z12 = oVar3.f2786b && ((i14 = oVar3.f2789e) == 7 || i14 == 2);
                    }
                    boolean z14 = pVar.f2812r;
                    int i27 = pVar.f2805i;
                    z10 = z14 | (i27 != 5 || (z12 && i27 == 1));
                    pVar.f2812r = z10;
                    if (z10) {
                        this.f2823n = false;
                    }
                    long j12 = this.f2822m;
                    if (this.f2821l || this.k.f2800c) {
                        i13 = i12;
                        vVar4.g(i13);
                        vVar3.g(i13);
                    } else {
                        i13 = i12;
                    }
                    vVar2.g(i13);
                    pVar2 = this.k;
                    pVar2.f2805i = i13;
                    pVar2.f2806l = j12;
                    pVar2.j = j10;
                    int i28 = pVar2.f2799b ? 1 : 1;
                    if (pVar2.f2800c) {
                        if (i13 != 5 && i13 != i28 && i13 != 2) {
                        }
                        o oVar4 = pVar2.f2807m;
                        pVar2.f2807m = pVar2.f2808n;
                        pVar2.f2808n = oVar4;
                        oVar4.f2786b = false;
                        oVar4.f2785a = false;
                        pVar2.f2804h = 0;
                        pVar2.k = true;
                    }
                    c11 = c10;
                    i19 = i10;
                    bArr2 = bArr;
                    i18 = i11;
                }
                if (z8 && pVar.f2809o) {
                    long j13 = pVar.j;
                    int i29 = i7 + ((int) (j10 - j13));
                    j = pVar.f2811q;
                    if (j != -9223372036854775807L) {
                        pVar.f2798a.e(j, pVar.f2812r ? 1 : 0, (int) (j13 - pVar.f2810p), i29, null);
                    }
                }
                pVar.f2810p = pVar.j;
                pVar.f2811q = pVar.f2806l;
                pVar.f2812r = false;
                pVar.f2809o = true;
                if (pVar.f2799b) {
                }
                boolean z142 = pVar.f2812r;
                int i272 = pVar.f2805i;
                z10 = z142 | (i272 != 5 || (z12 && i272 == 1));
                pVar.f2812r = z10;
                if (z10) {
                }
                long j122 = this.f2822m;
                if (this.f2821l) {
                }
                i13 = i12;
                vVar4.g(i13);
                vVar3.g(i13);
                vVar2.g(i13);
                pVar2 = this.k;
                pVar2.f2805i = i13;
                pVar2.f2806l = j122;
                pVar2.j = j10;
                if (pVar2.f2799b) {
                }
                if (pVar2.f2800c) {
                }
                c11 = c10;
                i19 = i10;
                bArr2 = bArr;
                i18 = i11;
            }
            i7 = i23;
            i10 = i19;
            bArr = bArr2;
            i11 = i20;
            i12 = i21;
            c10 = c11;
            vVar2 = this.f2818f;
            if (vVar2.e(i24)) {
            }
            pVar = this.k;
            z8 = this.f2821l;
            boolean z122 = this.f2823n;
            if (pVar.f2805i != 9) {
            }
            if (z8) {
                long j132 = pVar.j;
                int i292 = i7 + ((int) (j10 - j132));
                j = pVar.f2811q;
                if (j != -9223372036854775807L) {
                }
            }
            pVar.f2810p = pVar.j;
            pVar.f2811q = pVar.f2806l;
            pVar.f2812r = false;
            pVar.f2809o = true;
            if (pVar.f2799b) {
            }
            boolean z1422 = pVar.f2812r;
            int i2722 = pVar.f2805i;
            z10 = z1422 | (i2722 != 5 || (z122 && i2722 == 1));
            pVar.f2812r = z10;
            if (z10) {
            }
            long j1222 = this.f2822m;
            if (this.f2821l) {
            }
            i13 = i12;
            vVar4.g(i13);
            vVar3.g(i13);
            vVar2.g(i13);
            pVar2 = this.k;
            pVar2.f2805i = i13;
            pVar2.f2806l = j1222;
            pVar2.j = j10;
            if (pVar2.f2799b) {
            }
            if (pVar2.f2800c) {
            }
            c11 = c10;
            i19 = i10;
            bArr2 = bArr;
            i18 = i11;
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f2822m = j;
        }
        this.f2823n = ((i7 & 2) != 0) | this.f2823n;
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2820i = f4.f2684e;
        f4.b();
        s4.v u3 = interfaceC1984l.u(f4.f2683d, 2);
        this.j = u3;
        this.k = new p(u3, this.f2814b, this.f2815c);
        this.f2813a.h(interfaceC1984l, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i7, byte[] bArr, int i10) {
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        int m10;
        int i15;
        if (!this.f2821l || this.k.f2800c) {
            this.f2816d.a(i7, bArr, i10);
            this.f2817e.a(i7, bArr, i10);
        }
        this.f2818f.a(i7, bArr, i10);
        p pVar = this.k;
        if (pVar.k) {
            int i16 = i10 - i7;
            byte[] bArr2 = pVar.g;
            int length = bArr2.length;
            int i17 = pVar.f2804h + i16;
            if (length < i17) {
                pVar.g = Arrays.copyOf(bArr2, i17 * 2);
            }
            System.arraycopy(bArr, i7, pVar.g, pVar.f2804h, i16);
            int i18 = pVar.f2804h + i16;
            pVar.f2804h = i18;
            byte[] bArr3 = pVar.g;
            b5.f fVar = pVar.f2803f;
            fVar.f13953b = bArr3;
            fVar.f13955d = 0;
            fVar.f13954c = i18;
            fVar.f13956e = 0;
            fVar.a();
            if (fVar.d(8)) {
                fVar.r();
                int i19 = fVar.i(2);
                fVar.s(5);
                if (fVar.e()) {
                    fVar.l();
                    if (fVar.e()) {
                        int l10 = fVar.l();
                        if (!pVar.f2800c) {
                            pVar.k = false;
                            o oVar = pVar.f2808n;
                            oVar.f2789e = l10;
                            oVar.f2786b = true;
                            return;
                        }
                        if (fVar.e()) {
                            int l11 = fVar.l();
                            SparseArray sparseArray = pVar.f2802e;
                            if (sparseArray.indexOfKey(l11) < 0) {
                                pVar.k = false;
                                return;
                            }
                            n5.q qVar = (n5.q) sparseArray.get(l11);
                            n5.r rVar = (n5.r) pVar.f2801d.get(qVar.f21204a);
                            if (rVar.f21212h) {
                                if (!fVar.d(2)) {
                                    return;
                                } else {
                                    fVar.s(2);
                                }
                            }
                            int i20 = rVar.j;
                            if (fVar.d(i20)) {
                                int i21 = fVar.i(i20);
                                if (rVar.f21213i) {
                                    z8 = false;
                                    z10 = false;
                                } else {
                                    if (!fVar.d(1)) {
                                        return;
                                    }
                                    z8 = fVar.h();
                                    if (z8) {
                                        if (fVar.d(1)) {
                                            z10 = fVar.h();
                                            z11 = true;
                                            z12 = pVar.f2805i != 5;
                                            if (z12) {
                                                i11 = 0;
                                            } else if (!fVar.e()) {
                                                return;
                                            } else {
                                                i11 = fVar.l();
                                            }
                                            boolean z13 = qVar.f21205b;
                                            i12 = rVar.k;
                                            if (i12 != 0) {
                                                int i22 = rVar.f21214l;
                                                if (!fVar.d(i22)) {
                                                    return;
                                                }
                                                i13 = fVar.i(i22);
                                                if (z13 && !z8) {
                                                    if (fVar.e()) {
                                                        i15 = fVar.m();
                                                        i14 = 0;
                                                        m10 = 0;
                                                        o oVar2 = pVar.f2808n;
                                                        oVar2.f2787c = rVar;
                                                        oVar2.f2788d = i19;
                                                        oVar2.f2789e = l10;
                                                        oVar2.f2790f = i21;
                                                        oVar2.g = l11;
                                                        oVar2.f2791h = z8;
                                                        oVar2.f2792i = z11;
                                                        oVar2.j = z10;
                                                        oVar2.k = z12;
                                                        oVar2.f2793l = i11;
                                                        oVar2.f2794m = i13;
                                                        oVar2.f2795n = i15;
                                                        oVar2.f2796o = i14;
                                                        oVar2.f2797p = m10;
                                                        oVar2.f2785a = true;
                                                        oVar2.f2786b = true;
                                                        pVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i14 = 0;
                                            } else if (i12 != 1 || rVar.f21215m) {
                                                i13 = 0;
                                                i14 = 0;
                                            } else {
                                                if (!fVar.e()) {
                                                    return;
                                                }
                                                int m11 = fVar.m();
                                                if (z13 && !z8) {
                                                    if (fVar.e()) {
                                                        m10 = fVar.m();
                                                        i15 = 0;
                                                        i14 = m11;
                                                        i13 = 0;
                                                        o oVar22 = pVar.f2808n;
                                                        oVar22.f2787c = rVar;
                                                        oVar22.f2788d = i19;
                                                        oVar22.f2789e = l10;
                                                        oVar22.f2790f = i21;
                                                        oVar22.g = l11;
                                                        oVar22.f2791h = z8;
                                                        oVar22.f2792i = z11;
                                                        oVar22.j = z10;
                                                        oVar22.k = z12;
                                                        oVar22.f2793l = i11;
                                                        oVar22.f2794m = i13;
                                                        oVar22.f2795n = i15;
                                                        oVar22.f2796o = i14;
                                                        oVar22.f2797p = m10;
                                                        oVar22.f2785a = true;
                                                        oVar22.f2786b = true;
                                                        pVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i14 = m11;
                                                i13 = 0;
                                            }
                                            m10 = 0;
                                            i15 = 0;
                                            o oVar222 = pVar.f2808n;
                                            oVar222.f2787c = rVar;
                                            oVar222.f2788d = i19;
                                            oVar222.f2789e = l10;
                                            oVar222.f2790f = i21;
                                            oVar222.g = l11;
                                            oVar222.f2791h = z8;
                                            oVar222.f2792i = z11;
                                            oVar222.j = z10;
                                            oVar222.k = z12;
                                            oVar222.f2793l = i11;
                                            oVar222.f2794m = i13;
                                            oVar222.f2795n = i15;
                                            oVar222.f2796o = i14;
                                            oVar222.f2797p = m10;
                                            oVar222.f2785a = true;
                                            oVar222.f2786b = true;
                                            pVar.k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                }
                                z11 = z10;
                                if (pVar.f2805i != 5) {
                                }
                                if (z12) {
                                }
                                boolean z132 = qVar.f21205b;
                                i12 = rVar.k;
                                if (i12 != 0) {
                                }
                                m10 = 0;
                                i15 = 0;
                                o oVar2222 = pVar.f2808n;
                                oVar2222.f2787c = rVar;
                                oVar2222.f2788d = i19;
                                oVar2222.f2789e = l10;
                                oVar2222.f2790f = i21;
                                oVar2222.g = l11;
                                oVar2222.f2791h = z8;
                                oVar2222.f2792i = z11;
                                oVar2222.j = z10;
                                oVar2222.k = z12;
                                oVar2222.f2793l = i11;
                                oVar2222.f2794m = i13;
                                oVar2222.f2795n = i15;
                                oVar2222.f2796o = i14;
                                oVar2222.f2797p = m10;
                                oVar2222.f2785a = true;
                                oVar2222.f2786b = true;
                                pVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
