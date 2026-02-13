package y;

import A0.A0;
import A0.AbstractC0025n;
import A0.E0;
import A0.InterfaceC0024m;
import A0.y0;
import B0.C0204u;
import android.view.KeyEvent;
import u.AbstractC2063p;
import u.C2038A;
import u0.AbstractC2090t;
import u0.C2075e;
import u0.EnumC2076f;

/* loaded from: classes.dex */
public final class r extends AbstractC0025n implements y0, s0.c, A0, E0 {

    /* renamed from: S, reason: collision with root package name */
    public static final C2285G f26510S = new C2285G(3);

    /* renamed from: E, reason: collision with root package name */
    public A.i f26511E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC2291M f26512F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f26513G = true;

    /* renamed from: H, reason: collision with root package name */
    public Rb.a f26514H;

    /* renamed from: I, reason: collision with root package name */
    public final C2281C f26515I;

    /* renamed from: J, reason: collision with root package name */
    public u0.y f26516J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC0024m f26517K;
    public A.k L;

    /* renamed from: M, reason: collision with root package name */
    public A.f f26518M;

    /* renamed from: N, reason: collision with root package name */
    public final C2038A f26519N;

    /* renamed from: O, reason: collision with root package name */
    public long f26520O;

    /* renamed from: P, reason: collision with root package name */
    public A.i f26521P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f26522Q;

    /* renamed from: R, reason: collision with root package name */
    public final C2285G f26523R;

    public r(A.i iVar, InterfaceC2291M interfaceC2291M, Rb.a aVar) {
        this.f26511E = iVar;
        this.f26512F = interfaceC2291M;
        this.f26514H = aVar;
        this.f26515I = new C2281C(iVar, new C0204u(1, this, r.class, "onFocusChange", "onFocusChange(Z)V", 0, 3));
        int i7 = AbstractC2063p.f24708a;
        this.f26519N = new C2038A(6);
        this.f26520O = 0L;
        A.i iVar2 = this.f26511E;
        this.f26521P = iVar2;
        this.f26522Q = iVar2 == null && this.f26512F != null;
        this.f26523R = f26510S;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [Hb.d, Hb.a] */
    /* JADX WARN: Type inference failed for: r4v17 */
    @Override // s0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(KeyEvent keyEvent) {
        boolean z8;
        int i7;
        ?? r42;
        Object obj;
        t0();
        long a9 = c2.q.a(keyEvent.getKeyCode());
        boolean z10 = this.f26513G;
        int i10 = 3;
        C2038A c2038a = this.f26519N;
        if (!z10 || !com.bumptech.glide.d.l(h3.H.w(keyEvent), 2) || !androidx.compose.foundation.a.d(keyEvent)) {
            if (this.f26513G && com.bumptech.glide.d.l(h3.H.w(keyEvent), 1) && androidx.compose.foundation.a.d(keyEvent)) {
                c2038a.getClass();
                int hashCode = Long.hashCode(a9) * (-862048943);
                int i11 = hashCode ^ (hashCode << 16);
                int i12 = i11 & 127;
                int i13 = c2038a.f24564d;
                int i14 = (i11 >>> 7) & i13;
                int i15 = 0;
                loop0: while (true) {
                    long[] jArr = c2038a.f24561a;
                    int i16 = i14 >> 3;
                    int i17 = (i14 & 7) << i10;
                    long j = (((-i17) >> 63) & (jArr[i16 + 1] << (64 - i17))) | (jArr[i16] >>> i17);
                    long j10 = (i12 * 72340172838076673L) ^ j;
                    long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j11 == 0) {
                            break;
                        }
                        i7 = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                        if (c2038a.f24562b[i7] == a9) {
                            break loop0;
                        }
                        j11 &= j11 - 1;
                    }
                    i10 = 3;
                    i15 += 8;
                    i14 = (i14 + i15) & i13;
                }
                if (i7 >= 0) {
                    c2038a.f24565e--;
                    long[] jArr2 = c2038a.f24561a;
                    int i18 = c2038a.f24564d;
                    int i19 = i7 >> 3;
                    int i20 = (i7 & 7) << 3;
                    long j12 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
                    jArr2[i19] = j12;
                    jArr2[(((i7 - 7) & i18) + (i18 & 7)) >> 3] = j12;
                    Object[] objArr = c2038a.f24563c;
                    obj = objArr[i7];
                    r42 = 0;
                    objArr[i7] = null;
                } else {
                    r42 = 0;
                    obj = null;
                }
                A.k kVar = (A.k) obj;
                if (kVar != null) {
                    if (this.f26511E != null) {
                        z8 = false;
                        cc.F.B(d0(), r42, 0, new C2299g(this, kVar, r42), 3);
                    } else {
                        z8 = false;
                    }
                    this.f26514H.invoke();
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            return z8;
        }
        if (c2038a.b(a9)) {
            return false;
        }
        A.k kVar2 = new A.k(this.f26520O);
        c2038a.f(kVar2, a9);
        if (this.f26511E != null) {
            cc.F.B(d0(), null, 0, new C2298f(this, kVar2, null), 3);
        }
        return true;
    }

    @Override // A0.y0
    public final void H(C2075e c2075e, EnumC2076f enumC2076f, long j) {
        int i7 = 0;
        long j10 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f26520O = (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L);
        t0();
        if (this.f26513G && enumC2076f == EnumC2076f.f24758b) {
            int i10 = c2075e.f24756c;
            if (u0.u.c(i10, 4)) {
                cc.F.B(d0(), null, 0, new C2300h(this, null), 3);
            } else if (u0.u.c(i10, 5)) {
                cc.F.B(d0(), null, 0, new C2301i(this, null), 3);
            }
        }
        if (this.f26516J == null) {
            C2302j c2302j = new C2302j(this, i7);
            C2075e c2075e2 = AbstractC2090t.f24799a;
            u0.y yVar = new u0.y(null, null, c2302j);
            p0(yVar);
            this.f26516J = yVar;
        }
        u0.y yVar2 = this.f26516J;
        if (yVar2 != null) {
            yVar2.H(c2075e, enumC2076f, j);
        }
    }

    @Override // A0.y0
    public final void L() {
        A.f fVar;
        A.i iVar = this.f26511E;
        if (iVar != null && (fVar = this.f26518M) != null) {
            iVar.b(new A.g(fVar));
        }
        this.f26518M = null;
        u0.y yVar = this.f26516J;
        if (yVar != null) {
            yVar.L();
        }
    }

    @Override // A0.A0
    public final boolean O() {
        return true;
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        A0.J j = new A0.J(this, 23);
        Yb.h[] hVarArr = H0.s.f4563a;
        iVar.z(H0.h.f4472b, new H0.a(null, j));
        if (this.f26513G) {
            this.f26515I.c0(iVar);
        } else {
            iVar.z(H0.q.f4546i, Db.q.f3365a);
        }
    }

    @Override // s0.c
    public final boolean d(KeyEvent keyEvent) {
        return false;
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // c0.l
    public final void h0() {
        if (!this.f26522Q) {
            t0();
        }
        if (this.f26513G) {
            p0(this.f26515I);
        }
    }

    @Override // c0.l
    public final void i0() {
        s0();
        if (this.f26521P == null) {
            this.f26511E = null;
        }
        InterfaceC0024m interfaceC0024m = this.f26517K;
        if (interfaceC0024m != null) {
            q0(interfaceC0024m);
        }
        this.f26517K = null;
    }

    @Override // A0.E0
    public final Object j() {
        return this.f26523R;
    }

    public final void s0() {
        A.i iVar = this.f26511E;
        C2038A c2038a = this.f26519N;
        if (iVar != null) {
            A.k kVar = this.L;
            if (kVar != null) {
                iVar.b(new A.j(kVar));
            }
            A.f fVar = this.f26518M;
            if (fVar != null) {
                iVar.b(new A.g(fVar));
            }
            Object[] objArr = c2038a.f24563c;
            long[] jArr = c2038a.f24561a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                iVar.b(new A.j((A.k) objArr[(i7 << 3) + i11]));
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        this.L = null;
        this.f26518M = null;
        c2038a.a();
    }

    public final void t0() {
        InterfaceC2291M interfaceC2291M;
        if (this.f26517K == null && (interfaceC2291M = this.f26512F) != null) {
            if (this.f26511E == null) {
                this.f26511E = new A.i();
            }
            this.f26515I.u0(this.f26511E);
            A.i iVar = this.f26511E;
            kotlin.jvm.internal.l.b(iVar);
            InterfaceC0024m b2 = interfaceC2291M.b(iVar);
            p0(b2);
            this.f26517K = b2;
        }
    }
}
