package C4;

import java.util.Collections;
import m4.K;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final q3.e f2835a;

    /* renamed from: b, reason: collision with root package name */
    public String f2836b;

    /* renamed from: c, reason: collision with root package name */
    public s4.v f2837c;

    /* renamed from: d, reason: collision with root package name */
    public r f2838d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2839e;

    /* renamed from: l, reason: collision with root package name */
    public long f2843l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f2840f = new boolean[3];
    public final v g = new v(32);

    /* renamed from: h, reason: collision with root package name */
    public final v f2841h = new v(33);

    /* renamed from: i, reason: collision with root package name */
    public final v f2842i = new v(34);
    public final v j = new v(39);
    public final v k = new v(40);

    /* renamed from: m, reason: collision with root package name */
    public long f2844m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final n5.v f2845n = new n5.v();

    public s(q3.e eVar) {
        this.f2835a = eVar;
    }

    @Override // C4.i
    public final void a() {
        this.f2843l = 0L;
        this.f2844m = -9223372036854775807L;
        AbstractC1705a.q(this.f2840f);
        this.g.f();
        this.f2841h.f();
        this.f2842i.f();
        this.j.f();
        this.k.f();
        r rVar = this.f2838d;
        if (rVar != null) {
            rVar.f2830f = false;
            rVar.g = false;
            rVar.f2831h = false;
            rVar.f2832i = false;
            rVar.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        int i7;
        byte[] bArr;
        int i10;
        int i11;
        boolean z8;
        int i12;
        v vVar2;
        v vVar3;
        v vVar4;
        int i13;
        int i14;
        int i15;
        boolean e2;
        v vVar5;
        int i16;
        char c10;
        boolean z10;
        boolean z11;
        n5.v vVar6 = vVar;
        AbstractC1705a.n(this.f2837c);
        int i17 = n5.D.f21141a;
        while (vVar.a() > 0) {
            int i18 = vVar6.f21230b;
            int i19 = vVar6.f21231c;
            byte[] bArr2 = vVar6.f21229a;
            this.f2843l += vVar.a();
            this.f2837c.c(vVar.a(), vVar6);
            while (i18 < i19) {
                int w10 = AbstractC1705a.w(bArr2, i18, i19, this.f2840f);
                if (w10 == i19) {
                    f(i18, bArr2, i19);
                    return;
                }
                int i20 = w10 + 3;
                int i21 = (bArr2[i20] & 126) >> 1;
                int i22 = w10 - i18;
                if (i22 > 0) {
                    f(i18, bArr2, w10);
                }
                int i23 = i19 - w10;
                long j = this.f2843l - i23;
                int i24 = i22 < 0 ? -i22 : 0;
                long j10 = this.f2844m;
                r rVar = this.f2838d;
                boolean z12 = this.f2839e;
                if (rVar.j && rVar.g) {
                    rVar.f2834m = rVar.f2827c;
                    rVar.j = false;
                } else if (rVar.f2831h || rVar.g) {
                    if (z12 && rVar.f2832i) {
                        i10 = i20;
                        long j11 = rVar.f2826b;
                        i11 = i24;
                        int i25 = i23 + ((int) (j - j11));
                        long j12 = rVar.f2833l;
                        if (j12 == -9223372036854775807L) {
                            i7 = i19;
                            bArr = bArr2;
                        } else {
                            i7 = i19;
                            bArr = bArr2;
                            rVar.f2825a.e(j12, rVar.f2834m ? 1 : 0, (int) (j11 - rVar.k), i25, null);
                        }
                    } else {
                        i7 = i19;
                        bArr = bArr2;
                        i10 = i20;
                        i11 = i24;
                    }
                    rVar.k = rVar.f2826b;
                    rVar.f2833l = rVar.f2829e;
                    rVar.f2834m = rVar.f2827c;
                    rVar.f2832i = true;
                    z8 = this.f2839e;
                    v vVar7 = this.f2842i;
                    v vVar8 = this.f2841h;
                    v vVar9 = this.g;
                    if (z8) {
                        i14 = i11;
                        vVar9.e(i14);
                        vVar8.e(i14);
                        vVar7.e(i14);
                        if (vVar9.f2877e && vVar8.f2877e && vVar7.f2877e) {
                            s4.v vVar10 = this.f2837c;
                            String str = this.f2836b;
                            int i26 = vVar9.f2875c;
                            i15 = i10;
                            byte[] bArr3 = new byte[vVar8.f2875c + i26 + vVar7.f2875c];
                            i12 = i23;
                            System.arraycopy((byte[]) vVar9.f2878f, 0, bArr3, 0, i26);
                            i13 = i21;
                            System.arraycopy((byte[]) vVar8.f2878f, 0, bArr3, vVar9.f2875c, vVar8.f2875c);
                            System.arraycopy((byte[]) vVar7.f2878f, 0, bArr3, vVar9.f2875c + vVar8.f2875c, vVar7.f2875c);
                            n5.p I6 = AbstractC1705a.I(3, (byte[]) vVar8.f2878f, vVar8.f2875c);
                            vVar2 = vVar7;
                            vVar3 = vVar8;
                            vVar4 = vVar9;
                            String f4 = AbstractC1705a.f(I6.f21195a, I6.f21196b, I6.f21197c, I6.f21198d, I6.f21199e, I6.f21200f);
                            K k = new K();
                            k.f19976a = str;
                            k.k = "video/hevc";
                            k.f19982h = f4;
                            k.f19988p = I6.g;
                            k.f19989q = I6.f21201h;
                            k.f19992t = I6.f21202i;
                            k.f19985m = Collections.singletonList(bArr3);
                            h3.o.w(k, vVar10);
                            this.f2839e = true;
                        } else {
                            i15 = i10;
                            i12 = i23;
                            vVar2 = vVar7;
                            vVar3 = vVar8;
                            vVar4 = vVar9;
                            i13 = i21;
                        }
                    } else {
                        i12 = i23;
                        vVar2 = vVar7;
                        vVar3 = vVar8;
                        vVar4 = vVar9;
                        i13 = i21;
                        i14 = i11;
                        i15 = i10;
                    }
                    v vVar11 = this.j;
                    e2 = vVar11.e(i14);
                    s4.v[] vVarArr = (s4.v[]) this.f2835a.f23377c;
                    n5.v vVar12 = this.f2845n;
                    if (e2) {
                        vVar12.E(AbstractC1705a.Q(vVar11.f2875c, (byte[]) vVar11.f2878f), (byte[]) vVar11.f2878f);
                        vVar12.H(5);
                        c2.i.i(j10, vVar12, vVarArr);
                    }
                    vVar5 = this.k;
                    if (vVar5.e(i14)) {
                        vVar12.E(AbstractC1705a.Q(vVar5.f2875c, (byte[]) vVar5.f2878f), (byte[]) vVar5.f2878f);
                        vVar12.H(5);
                        c2.i.i(j10, vVar12, vVarArr);
                    }
                    long j13 = this.f2844m;
                    r rVar2 = this.f2838d;
                    boolean z13 = this.f2839e;
                    rVar2.g = false;
                    rVar2.f2831h = false;
                    rVar2.f2829e = j13;
                    rVar2.f2828d = 0;
                    rVar2.f2826b = j;
                    i16 = i13;
                    if (i16 >= 32 || i16 == 40) {
                        c10 = 3;
                        z10 = false;
                    } else {
                        if (!rVar2.f2832i || rVar2.j) {
                            c10 = 3;
                            z10 = false;
                        } else {
                            if (z13) {
                                long j14 = rVar2.f2833l;
                                if (j14 != -9223372036854775807L) {
                                    c10 = 3;
                                    rVar2.f2825a.e(j14, rVar2.f2834m ? 1 : 0, (int) (j - rVar2.k), i12, null);
                                    z10 = false;
                                    rVar2.f2832i = false;
                                }
                            }
                            c10 = 3;
                            z10 = false;
                            rVar2.f2832i = false;
                        }
                        if ((32 <= i16 && i16 <= 35) || i16 == 39) {
                            z11 = true;
                            rVar2.f2831h = !rVar2.j;
                            rVar2.j = true;
                            boolean z14 = (i16 >= 16 || i16 > 21) ? z10 : z11;
                            rVar2.f2827c = z14;
                            rVar2.f2830f = (!z14 || i16 <= 9) ? z11 : z10;
                            if (!this.f2839e) {
                                vVar4.g(i16);
                                vVar3.g(i16);
                                vVar2.g(i16);
                            }
                            vVar11.g(i16);
                            vVar5.g(i16);
                            i18 = i15;
                            i19 = i7;
                            bArr2 = bArr;
                        }
                    }
                    z11 = true;
                    if (i16 >= 16) {
                    }
                    rVar2.f2827c = z14;
                    rVar2.f2830f = (!z14 || i16 <= 9) ? z11 : z10;
                    if (!this.f2839e) {
                    }
                    vVar11.g(i16);
                    vVar5.g(i16);
                    i18 = i15;
                    i19 = i7;
                    bArr2 = bArr;
                }
                i7 = i19;
                bArr = bArr2;
                i10 = i20;
                i11 = i24;
                z8 = this.f2839e;
                v vVar72 = this.f2842i;
                v vVar82 = this.f2841h;
                v vVar92 = this.g;
                if (z8) {
                }
                v vVar112 = this.j;
                e2 = vVar112.e(i14);
                s4.v[] vVarArr2 = (s4.v[]) this.f2835a.f23377c;
                n5.v vVar122 = this.f2845n;
                if (e2) {
                }
                vVar5 = this.k;
                if (vVar5.e(i14)) {
                }
                long j132 = this.f2844m;
                r rVar22 = this.f2838d;
                boolean z132 = this.f2839e;
                rVar22.g = false;
                rVar22.f2831h = false;
                rVar22.f2829e = j132;
                rVar22.f2828d = 0;
                rVar22.f2826b = j;
                i16 = i13;
                if (i16 >= 32) {
                }
                c10 = 3;
                z10 = false;
                z11 = true;
                if (i16 >= 16) {
                }
                rVar22.f2827c = z14;
                rVar22.f2830f = (!z14 || i16 <= 9) ? z11 : z10;
                if (!this.f2839e) {
                }
                vVar112.g(i16);
                vVar5.g(i16);
                i18 = i15;
                i19 = i7;
                bArr2 = bArr;
            }
            vVar6 = vVar;
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f2844m = j;
        }
    }

    @Override // C4.i
    public final void d() {
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        f4.a();
        f4.b();
        this.f2836b = f4.f2684e;
        f4.b();
        s4.v u3 = interfaceC1984l.u(f4.f2683d, 2);
        this.f2837c = u3;
        this.f2838d = new r(u3);
        this.f2835a.h(interfaceC1984l, f4);
    }

    public final void f(int i7, byte[] bArr, int i10) {
        r rVar = this.f2838d;
        if (rVar.f2830f) {
            int i11 = rVar.f2828d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                rVar.g = (bArr[i12] & 128) != 0;
                rVar.f2830f = false;
            } else {
                rVar.f2828d = (i10 - i7) + i11;
            }
        }
        if (!this.f2839e) {
            this.g.a(i7, bArr, i10);
            this.f2841h.a(i7, bArr, i10);
            this.f2842i.a(i7, bArr, i10);
        }
        this.j.a(i7, bArr, i10);
        this.k.a(i7, bArr, i10);
    }
}
