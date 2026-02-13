package A0;

import android.graphics.Paint;
import j0.AbstractC1362A;
import m0.C1533b;
import x0.AbstractC2256a;
import y0.AbstractC2323H;
import y0.C2344l;

/* renamed from: A0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031u extends n0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final E5.o f309a0;

    /* renamed from: Y, reason: collision with root package name */
    public final B0 f310Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0030t f311Z;

    static {
        E5.o e2 = AbstractC1362A.e();
        e2.d(j0.n.f18550d);
        ((Paint) e2.f3713b).setStrokeWidth(1.0f);
        e2.i(1);
        f309a0 = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, A0.B0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [A0.U] */
    public C0031u(L l10) {
        super(l10);
        ?? lVar = new c0.l();
        lVar.f14116d = 0;
        this.f310Y = lVar;
        lVar.f14120v = this;
        this.f311Z = l10.f78v != null ? new U(this) : null;
    }

    @Override // A0.n0
    public final void I0(j0.l lVar, C1533b c1533b) {
        L l10 = this.f293z;
        t0 a9 = O.a(l10);
        S.e w10 = l10.w();
        Object[] objArr = w10.f8959a;
        int i7 = w10.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (l11.G()) {
                l11.j(lVar, c1533b);
            }
        }
        if (((B0.D) a9).getShowLayoutBounds()) {
            long j = this.f26556c;
            lVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f309a0);
        }
    }

    @Override // y0.AbstractC2323H
    public final void M(long j, float f4, Rb.c cVar) {
        J0(j, f4, cVar);
        if (this.f114u) {
            return;
        }
        this.f293z.f61T.f105p.V();
    }

    @Override // A0.T
    public final int R(C2344l c2344l) {
        C0030t c0030t = this.f311Z;
        if (c0030t != null) {
            return c0030t.R(c2344l);
        }
        C0010c0 c0010c0 = this.f293z.f61T.f105p;
        F f4 = c0010c0.f192f.f96d;
        F f10 = F.f20a;
        M m10 = c0010c0.f179K;
        if (f4 == f10) {
            m10.f86d = true;
            if (m10.f84b) {
                c0010c0.f177I = true;
                c0010c0.f178J = true;
            }
        } else {
            m10.f87e = true;
        }
        c0010c0.i().f115v = true;
        c0010c0.l();
        c0010c0.i().f115v = false;
        Integer num = (Integer) m10.g.get(c2344l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // y0.z
    public final AbstractC2323H b(long j) {
        O(j);
        L l10 = this.f293z;
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((L) objArr[i10]).f61T.f105p.f198z = H.f32c;
        }
        L0(l10.f53K.c(this, l10.f61T.f105p.R(), j));
        F0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A0.U, A0.t] */
    @Override // A0.n0
    public final void n0() {
        if (this.f311Z == null) {
            this.f311Z = new U(this);
        }
    }

    @Override // A0.n0
    public final U r0() {
        return this.f311Z;
    }

    @Override // A0.n0
    public final c0.l t0() {
        return this.f310Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [S.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // A0.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(C0013e c0013e, long j, C0029s c0029s, int i7, boolean z8) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        C0029s c0029s2;
        Object[] objArr;
        int i11;
        L l10;
        C0029s c0029s3 = c0029s;
        int i12 = 1;
        L l11 = this.f293z;
        switch (c0013e.f201a) {
            case 1:
                z10 = true;
                break;
            default:
                H0.i v10 = l11.v();
                z10 = !(v10 != null && v10.f4497d);
                break;
        }
        if (z10) {
            if (O0(j)) {
                z11 = z8;
                z12 = true;
            } else if (u0.u.e(i7, 1) && (Float.floatToRawIntBits(k0(j, s0())) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
                z12 = true;
                z11 = false;
            }
            if (z12) {
                return;
            }
            int i13 = c0029s3.f308c;
            S.e w10 = l11.w();
            Object[] objArr2 = w10.f8959a;
            int i14 = w10.f8961c - 1;
            while (true) {
                if (i14 >= 0) {
                    L l12 = (L) objArr2[i14];
                    if (l12.G()) {
                        switch (c0013e.f201a) {
                            case 1:
                                l10 = l12;
                                i10 = i13;
                                objArr = objArr2;
                                i11 = i12;
                                c0029s2 = c0029s3;
                                l12.y(j, c0029s, i7, z11);
                                break;
                            default:
                                C0018g0 c0018g0 = l12.f60S;
                                ((n0) c0018g0.f227d).y0(n0.f273X, ((n0) c0018g0.f227d).p0(j), c0029s, 1, z11);
                                l10 = l12;
                                i10 = i13;
                                objArr = objArr2;
                                i11 = i12;
                                c0029s2 = c0029s3;
                                break;
                        }
                        long b2 = c0029s.b();
                        if (AbstractC0017g.j(b2) < 0.0f && AbstractC0017g.o(b2) && !AbstractC0017g.n(b2)) {
                            n0 n0Var = (n0) l10.f60S.f227d;
                            n0Var.getClass();
                            c0.l v02 = n0Var.v0(o0.g(16));
                            if (v02 != null && v02.f14112B) {
                                if (!v02.f14113a.f14112B) {
                                    AbstractC2256a.b("visitLocalDescendants called on an unattached node");
                                }
                                c0.l lVar = v02.f14113a;
                                if ((lVar.f14116d & 16) != 0) {
                                    while (lVar != null) {
                                        if ((lVar.f14115c & 16) != 0) {
                                            AbstractC0025n abstractC0025n = lVar;
                                            ?? r62 = 0;
                                            while (abstractC0025n != 0) {
                                                if (abstractC0025n instanceof y0) {
                                                    if (((y0) abstractC0025n).E()) {
                                                        c0029s2.f308c = c0029s2.f306a.f24585b - i11;
                                                    }
                                                } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                                    c0.l lVar2 = abstractC0025n.f269D;
                                                    int i15 = 0;
                                                    abstractC0025n = abstractC0025n;
                                                    r62 = r62;
                                                    while (lVar2 != null) {
                                                        if ((lVar2.f14115c & 16) != 0) {
                                                            i15 += i11;
                                                            r62 = r62;
                                                            if (i15 == i11) {
                                                                abstractC0025n = lVar2;
                                                            } else {
                                                                if (r62 == 0) {
                                                                    r62 = new S.e(new c0.l[16]);
                                                                }
                                                                if (abstractC0025n != 0) {
                                                                    r62.b(abstractC0025n);
                                                                    abstractC0025n = 0;
                                                                }
                                                                r62.b(lVar2);
                                                            }
                                                        }
                                                        lVar2 = lVar2.f14118f;
                                                        abstractC0025n = abstractC0025n;
                                                        r62 = r62;
                                                    }
                                                    if (i15 == i11) {
                                                    }
                                                }
                                                abstractC0025n = AbstractC0017g.e(r62);
                                            }
                                        }
                                        lVar = lVar.f14118f;
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = i13;
                        objArr = objArr2;
                        i11 = i12;
                        c0029s2 = c0029s3;
                    }
                    i14--;
                    i13 = i10;
                    objArr2 = objArr;
                    i12 = i11;
                    c0029s3 = c0029s2;
                } else {
                    i10 = i13;
                    c0029s2 = c0029s3;
                }
            }
            c0029s2.f308c = i10;
            return;
        }
        z11 = z8;
        z12 = false;
        if (z12) {
        }
    }
}
