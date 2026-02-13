package C4;

import java.util.Arrays;
import java.util.Collections;
import m4.K;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f2776l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final q3.s f2777a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f2778b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f2779c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f2780d;

    /* renamed from: e, reason: collision with root package name */
    public final v f2781e;

    /* renamed from: f, reason: collision with root package name */
    public m f2782f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public String f2783h;

    /* renamed from: i, reason: collision with root package name */
    public s4.v f2784i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r3v3, types: [C4.l, java.lang.Object] */
    public n(q3.s sVar) {
        this.f2777a = sVar;
        ?? obj = new Object();
        obj.f2768e = new byte[128];
        this.f2780d = obj;
        this.k = -9223372036854775807L;
        this.f2781e = new v(178);
        this.f2778b = new n5.v();
    }

    @Override // C4.i
    public final void a() {
        AbstractC1705a.q(this.f2779c);
        l lVar = this.f2780d;
        lVar.f2764a = false;
        lVar.f2766c = 0;
        lVar.f2765b = 0;
        m mVar = this.f2782f;
        if (mVar != null) {
            mVar.f2770b = false;
            mVar.f2771c = false;
            mVar.f2772d = false;
            mVar.f2773e = -1;
        }
        v vVar = this.f2781e;
        if (vVar != null) {
            vVar.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    @Override // C4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n5.v vVar) {
        int i7;
        int i10;
        boolean z8;
        m mVar;
        long j;
        int i11;
        float f4;
        n5.v vVar2 = vVar;
        boolean z10 = true;
        AbstractC1705a.n(this.f2782f);
        AbstractC1705a.n(this.f2784i);
        int i12 = vVar2.f21230b;
        int i13 = vVar2.f21231c;
        byte[] bArr = vVar2.f21229a;
        this.g += vVar.a();
        this.f2784i.c(vVar.a(), vVar2);
        while (true) {
            int w10 = AbstractC1705a.w(bArr, i12, i13, this.f2779c);
            l lVar = this.f2780d;
            v vVar3 = this.f2781e;
            if (w10 == i13) {
                if (!this.j) {
                    lVar.a(i12, bArr, i13);
                }
                this.f2782f.a(i12, bArr, i13);
                if (vVar3 != null) {
                    vVar3.a(i12, bArr, i13);
                    return;
                }
                return;
            }
            int i14 = w10 + 3;
            byte b2 = vVar2.f21229a[i14];
            int i15 = b2 & 255;
            int i16 = w10 - i12;
            if (this.j) {
                i7 = i13;
                i10 = i14;
            } else {
                if (i16 > 0) {
                    lVar.a(i12, bArr, w10);
                }
                int i17 = i16 < 0 ? -i16 : 0;
                int i18 = lVar.f2765b;
                if (i18 != 0) {
                    i10 = i14;
                    if (i18 == z10) {
                        i7 = i13;
                        if (i15 != 181) {
                            AbstractC1705a.S("H263Reader", "Unexpected start code value");
                            lVar.f2764a = false;
                            lVar.f2766c = 0;
                            lVar.f2765b = 0;
                        } else {
                            lVar.f2765b = 2;
                        }
                    } else if (i18 != 2) {
                        i7 = i13;
                        if (i18 != 3) {
                            if (i18 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i15 == 179 || i15 == 181) {
                                lVar.f2766c -= i17;
                                lVar.f2764a = false;
                                s4.v vVar4 = this.f2784i;
                                int i19 = lVar.f2767d;
                                String str = this.f2783h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.f2768e, lVar.f2766c);
                                b5.f fVar = new b5.f(copyOf, copyOf.length);
                                fVar.t(i19);
                                fVar.t(4);
                                fVar.r();
                                fVar.s(8);
                                if (fVar.h()) {
                                    fVar.s(4);
                                    fVar.s(3);
                                }
                                int i20 = fVar.i(4);
                                if (i20 == 15) {
                                    int i21 = fVar.i(8);
                                    int i22 = fVar.i(8);
                                    if (i22 == 0) {
                                        AbstractC1705a.S("H263Reader", "Invalid aspect ratio");
                                        f4 = 1.0f;
                                        if (fVar.h()) {
                                            fVar.s(2);
                                            fVar.s(1);
                                            if (fVar.h()) {
                                                fVar.s(15);
                                                fVar.r();
                                                fVar.s(15);
                                                fVar.r();
                                                fVar.s(15);
                                                fVar.r();
                                                fVar.s(3);
                                                fVar.s(11);
                                                fVar.r();
                                                fVar.s(15);
                                                fVar.r();
                                            }
                                        }
                                        if (fVar.i(2) != 0) {
                                            AbstractC1705a.S("H263Reader", "Unhandled video object layer shape");
                                        }
                                        fVar.r();
                                        int i23 = fVar.i(16);
                                        fVar.r();
                                        if (fVar.h()) {
                                            if (i23 == 0) {
                                                AbstractC1705a.S("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i24 = 0;
                                                for (int i25 = i23 - 1; i25 > 0; i25 >>= 1) {
                                                    i24++;
                                                }
                                                fVar.s(i24);
                                            }
                                        }
                                        fVar.r();
                                        int i26 = fVar.i(13);
                                        fVar.r();
                                        int i27 = fVar.i(13);
                                        fVar.r();
                                        fVar.r();
                                        K k = new K();
                                        k.f19976a = str;
                                        k.k = "video/mp4v-es";
                                        k.f19988p = i26;
                                        k.f19989q = i27;
                                        k.f19992t = f4;
                                        k.f19985m = Collections.singletonList(copyOf);
                                        h3.o.w(k, vVar4);
                                        this.j = true;
                                    } else {
                                        f4 = i21 / i22;
                                        if (fVar.h()) {
                                        }
                                        if (fVar.i(2) != 0) {
                                        }
                                        fVar.r();
                                        int i232 = fVar.i(16);
                                        fVar.r();
                                        if (fVar.h()) {
                                        }
                                        fVar.r();
                                        int i262 = fVar.i(13);
                                        fVar.r();
                                        int i272 = fVar.i(13);
                                        fVar.r();
                                        fVar.r();
                                        K k7 = new K();
                                        k7.f19976a = str;
                                        k7.k = "video/mp4v-es";
                                        k7.f19988p = i262;
                                        k7.f19989q = i272;
                                        k7.f19992t = f4;
                                        k7.f19985m = Collections.singletonList(copyOf);
                                        h3.o.w(k7, vVar4);
                                        this.j = true;
                                    }
                                } else if (i20 < 7) {
                                    f4 = f2776l[i20];
                                    if (fVar.h()) {
                                    }
                                    if (fVar.i(2) != 0) {
                                    }
                                    fVar.r();
                                    int i2322 = fVar.i(16);
                                    fVar.r();
                                    if (fVar.h()) {
                                    }
                                    fVar.r();
                                    int i2622 = fVar.i(13);
                                    fVar.r();
                                    int i2722 = fVar.i(13);
                                    fVar.r();
                                    fVar.r();
                                    K k72 = new K();
                                    k72.f19976a = str;
                                    k72.k = "video/mp4v-es";
                                    k72.f19988p = i2622;
                                    k72.f19989q = i2722;
                                    k72.f19992t = f4;
                                    k72.f19985m = Collections.singletonList(copyOf);
                                    h3.o.w(k72, vVar4);
                                    this.j = true;
                                } else {
                                    AbstractC1705a.S("H263Reader", "Invalid aspect ratio");
                                    f4 = 1.0f;
                                    if (fVar.h()) {
                                    }
                                    if (fVar.i(2) != 0) {
                                    }
                                    fVar.r();
                                    int i23222 = fVar.i(16);
                                    fVar.r();
                                    if (fVar.h()) {
                                    }
                                    fVar.r();
                                    int i26222 = fVar.i(13);
                                    fVar.r();
                                    int i27222 = fVar.i(13);
                                    fVar.r();
                                    fVar.r();
                                    K k722 = new K();
                                    k722.f19976a = str;
                                    k722.k = "video/mp4v-es";
                                    k722.f19988p = i26222;
                                    k722.f19989q = i27222;
                                    k722.f19992t = f4;
                                    k722.f19985m = Collections.singletonList(copyOf);
                                    h3.o.w(k722, vVar4);
                                    this.j = true;
                                }
                            }
                        } else if ((b2 & 240) != 32) {
                            AbstractC1705a.S("H263Reader", "Unexpected start code value");
                            lVar.f2764a = false;
                            lVar.f2766c = 0;
                            lVar.f2765b = 0;
                        } else {
                            lVar.f2767d = lVar.f2766c;
                            lVar.f2765b = 4;
                        }
                    } else {
                        i7 = i13;
                        if (i15 > 31) {
                            AbstractC1705a.S("H263Reader", "Unexpected start code value");
                            lVar.f2764a = false;
                            lVar.f2766c = 0;
                            lVar.f2765b = 0;
                        } else {
                            lVar.f2765b = 3;
                        }
                    }
                } else {
                    i7 = i13;
                    i10 = i14;
                    if (i15 == 176) {
                        lVar.f2765b = 1;
                        lVar.f2764a = true;
                    }
                }
                lVar.a(0, l.f2763f, 3);
                this.f2782f.a(i12, bArr, w10);
                if (vVar3 != null) {
                    if (i16 > 0) {
                        vVar3.a(i12, bArr, w10);
                        i11 = 0;
                    } else {
                        i11 = -i16;
                    }
                    if (vVar3.e(i11)) {
                        int Q3 = AbstractC1705a.Q(vVar3.f2875c, (byte[]) vVar3.f2878f);
                        int i28 = n5.D.f21141a;
                        byte[] bArr2 = (byte[]) vVar3.f2878f;
                        n5.v vVar5 = this.f2778b;
                        vVar5.E(Q3, bArr2);
                        this.f2777a.n(this.k, vVar5);
                    }
                    if (i15 == 178) {
                        vVar2 = vVar;
                        z8 = true;
                        if (vVar2.f21229a[w10 + 2] == 1) {
                            vVar3.g(i15);
                        }
                        int i29 = i7 - w10;
                        long j10 = this.g - i29;
                        mVar = this.f2782f;
                        boolean z11 = this.j;
                        if (mVar.f2773e == 182 && z11 && mVar.f2770b) {
                            j = mVar.f2775h;
                            if (j != -9223372036854775807L) {
                                mVar.f2769a.e(j, mVar.f2772d ? 1 : 0, (int) (j10 - mVar.g), i29, null);
                            }
                        }
                        if (mVar.f2773e != 179) {
                            mVar.g = j10;
                        }
                        m mVar2 = this.f2782f;
                        long j11 = this.k;
                        mVar2.f2773e = i15;
                        mVar2.f2772d = false;
                        mVar2.f2770b = (i15 != 182 || i15 == 179) ? z8 : false;
                        mVar2.f2771c = i15 == 182 ? z8 : false;
                        mVar2.f2774f = 0;
                        mVar2.f2775h = j11;
                        z10 = z8;
                        i12 = i10;
                        i13 = i7;
                    }
                }
                vVar2 = vVar;
                z8 = true;
                int i292 = i7 - w10;
                long j102 = this.g - i292;
                mVar = this.f2782f;
                boolean z112 = this.j;
                if (mVar.f2773e == 182) {
                    j = mVar.f2775h;
                    if (j != -9223372036854775807L) {
                    }
                }
                if (mVar.f2773e != 179) {
                }
                m mVar22 = this.f2782f;
                long j112 = this.k;
                mVar22.f2773e = i15;
                mVar22.f2772d = false;
                mVar22.f2770b = (i15 != 182 || i15 == 179) ? z8 : false;
                mVar22.f2771c = i15 == 182 ? z8 : false;
                mVar22.f2774f = 0;
                mVar22.f2775h = j112;
                z10 = z8;
                i12 = i10;
                i13 = i7;
            }
            this.f2782f.a(i12, bArr, w10);
            if (vVar3 != null) {
            }
            vVar2 = vVar;
            z8 = true;
            int i2922 = i7 - w10;
            long j1022 = this.g - i2922;
            mVar = this.f2782f;
            boolean z1122 = this.j;
            if (mVar.f2773e == 182) {
            }
            if (mVar.f2773e != 179) {
            }
            m mVar222 = this.f2782f;
            long j1122 = this.k;
            mVar222.f2773e = i15;
            mVar222.f2772d = false;
            mVar222.f2770b = (i15 != 182 || i15 == 179) ? z8 : false;
            mVar222.f2771c = i15 == 182 ? z8 : false;
            mVar222.f2774f = 0;
            mVar222.f2775h = j1122;
            z10 = z8;
            i12 = i10;
            i13 = i7;
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
        this.f2783h = f4.f2684e;
        f4.b();
        s4.v u3 = interfaceC1984l.u(f4.f2683d, 2);
        this.f2784i = u3;
        this.f2782f = new m(u3);
        this.f2777a.p(interfaceC1984l, f4);
    }
}
