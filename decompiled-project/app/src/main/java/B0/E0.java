package B0;

import A0.C0005a;
import a.AbstractC0672a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import i0.C1288a;
import i0.C1289b;
import j0.AbstractC1362A;
import j0.AbstractC1365c;
import j0.C1368f;
import l0.C1443b;
import m0.C1533b;
import m0.InterfaceC1535d;
import u.C2047J;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class E0 implements A0.s0 {

    /* renamed from: A, reason: collision with root package name */
    public final C1443b f1655A;

    /* renamed from: B, reason: collision with root package name */
    public int f1656B;

    /* renamed from: C, reason: collision with root package name */
    public long f1657C;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC1362A f1658D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1659E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1660F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1661G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1662H;

    /* renamed from: I, reason: collision with root package name */
    public final C0005a f1663I;

    /* renamed from: a, reason: collision with root package name */
    public C1533b f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.s f1665b;

    /* renamed from: c, reason: collision with root package name */
    public final D f1666c;

    /* renamed from: d, reason: collision with root package name */
    public Rb.e f1667d;

    /* renamed from: e, reason: collision with root package name */
    public A0.k0 f1668e;

    /* renamed from: f, reason: collision with root package name */
    public long f1669f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1670u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f1671v;

    /* renamed from: w, reason: collision with root package name */
    public float[] f1672w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1673x;

    /* renamed from: y, reason: collision with root package name */
    public V0.c f1674y;

    /* renamed from: z, reason: collision with root package name */
    public V0.l f1675z;

    public E0(C1533b c1533b, j0.s sVar, D d10, Rb.e eVar, A0.k0 k0Var) {
        this.f1664a = c1533b;
        this.f1665b = sVar;
        this.f1666c = d10;
        this.f1667d = eVar;
        this.f1668e = k0Var;
        long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1669f = (j & 4294967295L) | (j << 32);
        this.f1671v = AbstractC1362A.g();
        this.f1674y = Y6.b.a();
        this.f1675z = V0.l.f9982a;
        this.f1655A = new C1443b();
        this.f1657C = j0.G.f18526b;
        this.f1661G = true;
        this.f1663I = new C0005a(this, 5);
    }

    @Override // A0.s0
    public final long a(long j, boolean z8) {
        float[] k;
        if (z8) {
            k = j();
            if (k == null) {
                return 9187343241974906880L;
            }
        } else {
            k = k();
        }
        return this.f1661G ? j : AbstractC1362A.s(j, k);
    }

    @Override // A0.s0
    public final void b(long j) {
        if (V0.k.a(j, this.f1669f)) {
            return;
        }
        this.f1669f = j;
        if (this.f1673x || this.f1670u) {
            return;
        }
        D d10 = this.f1666c;
        d10.invalidate();
        if (true != this.f1673x) {
            this.f1673x = true;
            d10.v(this, true);
        }
    }

    @Override // A0.s0
    public final void c(C1288a c1288a, boolean z8) {
        float[] j = z8 ? j() : k();
        if (this.f1661G) {
            return;
        }
        if (j != null) {
            AbstractC1362A.t(j, c1288a);
            return;
        }
        c1288a.f18168a = 0.0f;
        c1288a.f18169b = 0.0f;
        c1288a.f18170c = 0.0f;
        c1288a.f18171d = 0.0f;
    }

    @Override // A0.s0
    public final void d(j0.B b2) {
        A0.k0 k0Var;
        int i7;
        A0.k0 k0Var2;
        int i10 = b2.f18499a | this.f1656B;
        this.f1675z = b2.f18497B;
        this.f1674y = b2.f18496A;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f1657C = b2.f18507w;
        }
        if ((i10 & 1) != 0) {
            C1533b c1533b = this.f1664a;
            float f4 = b2.f18500b;
            InterfaceC1535d interfaceC1535d = c1533b.f19684a;
            if (interfaceC1535d.e() != f4) {
                interfaceC1535d.h(f4);
            }
        }
        if ((i10 & 2) != 0) {
            C1533b c1533b2 = this.f1664a;
            float f10 = b2.f18501c;
            InterfaceC1535d interfaceC1535d2 = c1533b2.f19684a;
            if (interfaceC1535d2.G() != f10) {
                interfaceC1535d2.l(f10);
            }
        }
        if ((i10 & 4) != 0) {
            C1533b c1533b3 = this.f1664a;
            float f11 = b2.f18502d;
            InterfaceC1535d interfaceC1535d3 = c1533b3.f19684a;
            if (interfaceC1535d3.a() != f11) {
                interfaceC1535d3.c(f11);
            }
        }
        if ((i10 & 8) != 0) {
            InterfaceC1535d interfaceC1535d4 = this.f1664a.f19684a;
            if (interfaceC1535d4.u() != 0.0f) {
                interfaceC1535d4.j();
            }
        }
        if ((i10 & 16) != 0) {
            InterfaceC1535d interfaceC1535d5 = this.f1664a.f19684a;
            if (interfaceC1535d5.p() != 0.0f) {
                interfaceC1535d5.f();
            }
        }
        boolean z8 = true;
        if ((i10 & 32) != 0) {
            C1533b c1533b4 = this.f1664a;
            float f12 = b2.f18503e;
            InterfaceC1535d interfaceC1535d6 = c1533b4.f19684a;
            if (interfaceC1535d6.F() != f12) {
                interfaceC1535d6.m(f12);
                c1533b4.g = true;
                c1533b4.a();
            }
            if (b2.f18503e > 0.0f && !this.f1662H && (k0Var2 = this.f1668e) != null) {
                k0Var2.invoke();
            }
        }
        if ((i10 & 64) != 0) {
            C1533b c1533b5 = this.f1664a;
            long j = b2.f18504f;
            InterfaceC1535d interfaceC1535d7 = c1533b5.f19684a;
            if (!j0.n.c(j, interfaceC1535d7.K())) {
                interfaceC1535d7.r(j);
            }
        }
        if ((i10 & 128) != 0) {
            C1533b c1533b6 = this.f1664a;
            long j10 = b2.f18505u;
            InterfaceC1535d interfaceC1535d8 = c1533b6.f19684a;
            if (!j0.n.c(j10, interfaceC1535d8.q())) {
                interfaceC1535d8.A(j10);
            }
        }
        if ((i10 & 1024) != 0) {
            InterfaceC1535d interfaceC1535d9 = this.f1664a.f19684a;
            if (interfaceC1535d9.H() != 0.0f) {
                interfaceC1535d9.k();
            }
        }
        if ((i10 & 256) != 0) {
            InterfaceC1535d interfaceC1535d10 = this.f1664a.f19684a;
            if (interfaceC1535d10.x() != 0.0f) {
                interfaceC1535d10.b();
            }
        }
        if ((i10 & 512) != 0) {
            InterfaceC1535d interfaceC1535d11 = this.f1664a.f19684a;
            if (interfaceC1535d11.E() != 0.0f) {
                interfaceC1535d11.g();
            }
        }
        if ((i10 & 2048) != 0) {
            C1533b c1533b7 = this.f1664a;
            float f13 = b2.f18506v;
            InterfaceC1535d interfaceC1535d12 = c1533b7.f19684a;
            if (interfaceC1535d12.t() != f13) {
                interfaceC1535d12.n(f13);
            }
        }
        if (i11 != 0) {
            if (j0.G.a(this.f1657C, j0.G.f18526b)) {
                C1533b c1533b8 = this.f1664a;
                if (!C1289b.b(c1533b8.f19702v, 9205357640488583168L)) {
                    c1533b8.f19702v = 9205357640488583168L;
                    c1533b8.f19684a.J(9205357640488583168L);
                }
            } else {
                C1533b c1533b9 = this.f1664a;
                float b10 = j0.G.b(this.f1657C) * ((int) (this.f1669f >> 32));
                long floatToRawIntBits = (Float.floatToRawIntBits(j0.G.c(this.f1657C) * ((int) (this.f1669f & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(b10) << 32);
                if (!C1289b.b(c1533b9.f19702v, floatToRawIntBits)) {
                    c1533b9.f19702v = floatToRawIntBits;
                    c1533b9.f19684a.J(floatToRawIntBits);
                }
            }
        }
        if ((i10 & 16384) != 0) {
            C1533b c1533b10 = this.f1664a;
            boolean z10 = b2.f18509y;
            if (c1533b10.f19703w != z10) {
                c1533b10.f19703w = z10;
                c1533b10.g = true;
                c1533b10.a();
            }
        }
        if ((131072 & i10) != 0) {
            InterfaceC1535d interfaceC1535d13 = this.f1664a.f19684a;
            if (!kotlin.jvm.internal.l.a(null, null)) {
                interfaceC1535d13.d();
            }
        }
        if ((32768 & i10) != 0) {
            C1533b c1533b11 = this.f1664a;
            if (AbstractC1362A.i(0)) {
                i7 = 0;
            } else if (AbstractC1362A.i(1)) {
                i7 = 1;
            } else {
                i7 = 2;
                if (!AbstractC1362A.i(2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC1535d interfaceC1535d14 = c1533b11.f19684a;
            if (!h3.H.q(interfaceC1535d14.w(), i7)) {
                interfaceC1535d14.z(i7);
            }
        }
        if ((i10 & 7963) != 0) {
            this.f1659E = true;
            this.f1660F = true;
        }
        if (kotlin.jvm.internal.l.a(this.f1658D, b2.f18498C)) {
            z8 = false;
        } else {
            AbstractC1362A abstractC1362A = b2.f18498C;
            this.f1658D = abstractC1362A;
            if (abstractC1362A != null) {
                C1533b c1533b12 = this.f1664a;
                if (abstractC1362A instanceof j0.w) {
                    i0.c cVar = ((j0.w) abstractC1362A).f18560e;
                    long floatToRawIntBits2 = Float.floatToRawIntBits(cVar.f18174a);
                    float f14 = cVar.f18175b;
                    c1533b12.f((Float.floatToRawIntBits(f14) & 4294967295L) | (floatToRawIntBits2 << 32), (Float.floatToRawIntBits(cVar.f18176c - r7) << 32) | (Float.floatToRawIntBits(cVar.f18177d - f14) & 4294967295L), 0.0f);
                } else if (abstractC1362A instanceof j0.v) {
                    c1533b12.k = null;
                    c1533b12.f19691i = 9205357640488583168L;
                    c1533b12.f19690h = 0L;
                    c1533b12.j = 0.0f;
                    c1533b12.g = true;
                    c1533b12.f19694n = false;
                    c1533b12.f19692l = ((j0.v) abstractC1362A).f18559e;
                    c1533b12.a();
                } else if (abstractC1362A instanceof j0.x) {
                    j0.x xVar = (j0.x) abstractC1362A;
                    C1368f c1368f = xVar.f18562f;
                    if (c1368f != null) {
                        c1533b12.k = null;
                        c1533b12.f19691i = 9205357640488583168L;
                        c1533b12.f19690h = 0L;
                        c1533b12.j = 0.0f;
                        c1533b12.g = true;
                        c1533b12.f19694n = false;
                        c1533b12.f19692l = c1368f;
                        c1533b12.a();
                    } else {
                        c1533b12.f((Float.floatToRawIntBits(r5.f18178a) << 32) | (Float.floatToRawIntBits(r5.f18179b) & 4294967295L), (Float.floatToRawIntBits(r5.b()) << 32) | (Float.floatToRawIntBits(r5.a()) & 4294967295L), Float.intBitsToFloat((int) (xVar.f18561e.f18184h >> 32)));
                    }
                }
                if ((abstractC1362A instanceof j0.v) && Build.VERSION.SDK_INT < 33 && (k0Var = this.f1668e) != null) {
                    k0Var.invoke();
                }
            }
        }
        this.f1656B = b2.f18499a;
        if (i10 != 0 || z8) {
            int i12 = Build.VERSION.SDK_INT;
            D d10 = this.f1666c;
            if (i12 < 26) {
                d10.invalidate();
                return;
            }
            ViewParent parent = d10.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(d10, d10);
            }
        }
    }

    @Override // A0.s0
    public final void destroy() {
        this.f1667d = null;
        this.f1668e = null;
        this.f1670u = true;
        boolean z8 = this.f1673x;
        D d10 = this.f1666c;
        if (z8) {
            this.f1673x = false;
            d10.v(this, false);
        }
        j0.s sVar = this.f1665b;
        if (sVar != null) {
            sVar.a(this.f1664a);
            d10.E(this);
        }
    }

    @Override // A0.s0
    public final void e(Rb.e eVar, A0.k0 k0Var) {
        j0.s sVar = this.f1665b;
        if (sVar == null) {
            throw X.c.c("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f1664a.f19699s) {
            AbstractC2256a.a("layer should have been released before reuse");
        }
        this.f1664a = sVar.b();
        this.f1670u = false;
        this.f1667d = eVar;
        this.f1668e = k0Var;
        this.f1659E = false;
        this.f1660F = false;
        this.f1661G = true;
        AbstractC1362A.u(this.f1671v);
        float[] fArr = this.f1672w;
        if (fArr != null) {
            AbstractC1362A.u(fArr);
        }
        this.f1657C = j0.G.f18526b;
        this.f1662H = false;
        long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1669f = (j & 4294967295L) | (j << 32);
        this.f1658D = null;
        this.f1656B = 0;
    }

    @Override // A0.s0
    public final void f(long j) {
        C1533b c1533b = this.f1664a;
        if (!V0.i.a(c1533b.f19700t, j)) {
            c1533b.f19700t = j;
            long j10 = c1533b.f19701u;
            c1533b.f19684a.D((int) (j >> 32), (int) (j & 4294967295L), j10);
        }
        int i7 = Build.VERSION.SDK_INT;
        D d10 = this.f1666c;
        if (i7 < 26) {
            d10.invalidate();
            return;
        }
        ViewParent parent = d10.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(d10, d10);
        }
    }

    @Override // A0.s0
    public final void g() {
        if (this.f1673x) {
            if (!j0.G.a(this.f1657C, j0.G.f18526b) && !V0.k.a(this.f1664a.f19701u, this.f1669f)) {
                C1533b c1533b = this.f1664a;
                float b2 = j0.G.b(this.f1657C) * ((int) (this.f1669f >> 32));
                float c10 = j0.G.c(this.f1657C) * ((int) (this.f1669f & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c10) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
                if (!C1289b.b(c1533b.f19702v, floatToRawIntBits)) {
                    c1533b.f19702v = floatToRawIntBits;
                    c1533b.f19684a.J(floatToRawIntBits);
                }
            }
            C1533b c1533b2 = this.f1664a;
            V0.c cVar = this.f1674y;
            V0.l lVar = this.f1675z;
            long j = this.f1669f;
            boolean a9 = V0.k.a(c1533b2.f19701u, j);
            InterfaceC1535d interfaceC1535d = c1533b2.f19684a;
            if (!a9) {
                c1533b2.f19701u = j;
                long j10 = c1533b2.f19700t;
                interfaceC1535d.D((int) (j10 >> 32), (int) (4294967295L & j10), j);
                if (c1533b2.f19691i == 9205357640488583168L) {
                    c1533b2.g = true;
                    c1533b2.a();
                }
            }
            c1533b2.f19685b = cVar;
            c1533b2.f19686c = lVar;
            c1533b2.f19687d = this.f1663I;
            interfaceC1535d.C(cVar, lVar, c1533b2, c1533b2.f19688e);
            if (this.f1673x) {
                this.f1673x = false;
                this.f1666c.v(this, false);
            }
        }
    }

    @Override // A0.s0
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return k();
    }

    @Override // A0.s0
    public final void h(j0.l lVar, C1533b c1533b) {
        Object obj;
        Canvas canvas;
        boolean z8;
        int i7;
        boolean z10;
        float f4;
        float f10;
        g();
        this.f1662H = this.f1664a.f19684a.F() > 0.0f;
        C1443b c1443b = this.f1655A;
        Q7.h hVar = c1443b.f19142b;
        hVar.P(lVar);
        hVar.f8696c = c1533b;
        C1533b c1533b2 = this.f1664a;
        j0.l x2 = c1443b.u().x();
        C1533b c1533b3 = (C1533b) c1443b.u().f8696c;
        if (c1533b2.f19699s) {
            return;
        }
        c1533b2.a();
        InterfaceC1535d interfaceC1535d = c1533b2.f19684a;
        if (!interfaceC1535d.o()) {
            try {
                interfaceC1535d.C(c1533b2.f19685b, c1533b2.f19686c, c1533b2, c1533b2.f19688e);
            } catch (Throwable unused) {
            }
        }
        boolean z11 = interfaceC1535d.F() > 0.0f;
        if (z11) {
            x2.o();
        }
        Canvas a9 = AbstractC1365c.a(x2);
        boolean isHardwareAccelerated = a9.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            obj = null;
        } else {
            long j = c1533b2.f19700t;
            float f11 = (int) (j >> 32);
            float f12 = (int) (j & 4294967295L);
            long j10 = c1533b2.f19701u;
            float f13 = ((int) (j10 >> 32)) + f11;
            float f14 = ((int) (j10 & 4294967295L)) + f12;
            float a10 = interfaceC1535d.a();
            int I6 = interfaceC1535d.I();
            if (a10 < 1.0f || !AbstractC1362A.j(I6, 3) || h3.H.q(interfaceC1535d.w(), 1)) {
                E5.o oVar = c1533b2.f19696p;
                if (oVar == null) {
                    oVar = AbstractC1362A.e();
                    c1533b2.f19696p = oVar;
                }
                oVar.b(a10);
                oVar.c(I6);
                oVar.f(null);
                f4 = f12;
                f10 = f11;
                obj = null;
                a9.saveLayer(f11, f12, f13, f14, (Paint) oVar.f3713b);
            } else {
                a9.save();
                f4 = f12;
                f10 = f11;
                obj = null;
            }
            a9.translate(f10, f4);
            a9.concat(interfaceC1535d.B());
        }
        boolean z12 = !isHardwareAccelerated && c1533b2.f19703w;
        if (z12) {
            x2.i();
            AbstractC1362A d10 = c1533b2.d();
            if (d10 instanceof j0.w) {
                i0.c p10 = d10.p();
                x2.e(p10.f18174a, p10.f18175b, p10.f18176c, p10.f18177d, 1);
            } else if (d10 instanceof j0.x) {
                C1368f c1368f = c1533b2.f19693m;
                if (c1368f != null) {
                    c1368f.f18539a.rewind();
                } else {
                    c1368f = j0.h.a();
                    c1533b2.f19693m = c1368f;
                }
                j0.z.a(c1368f, ((j0.x) d10).f18561e);
                x2.a(c1368f);
            } else if (d10 instanceof j0.v) {
                x2.a(((j0.v) d10).f18559e);
            }
        }
        if (c1533b3 != null) {
            E.u uVar = c1533b3.f19698r;
            if (!uVar.f3498a) {
                j0.u.a("Only add dependencies during a tracking");
            }
            C2047J c2047j = (C2047J) uVar.f3501d;
            if (c2047j != null) {
                c2047j.a(c1533b2);
            } else if (((C1533b) uVar.f3499b) != null) {
                int i10 = u.S.f24634a;
                C2047J c2047j2 = new C2047J();
                C1533b c1533b4 = (C1533b) uVar.f3499b;
                kotlin.jvm.internal.l.b(c1533b4);
                c2047j2.a(c1533b4);
                c2047j2.a(c1533b2);
                uVar.f3501d = c2047j2;
                uVar.f3499b = obj;
            } else {
                uVar.f3499b = c1533b2;
            }
            C2047J c2047j3 = (C2047J) uVar.f3502e;
            if (c2047j3 != null) {
                boolean l10 = c2047j3.l(c1533b2);
                i7 = 1;
                z10 = !l10;
            } else {
                i7 = 1;
                if (((C1533b) uVar.f3500c) != c1533b2) {
                    z10 = true;
                } else {
                    uVar.f3500c = obj;
                    z10 = false;
                }
            }
            if (z10) {
                c1533b2.f19697q += i7;
            }
        }
        if (AbstractC1365c.a(x2).isHardwareAccelerated()) {
            canvas = a9;
            z8 = isHardwareAccelerated;
            interfaceC1535d.y(x2);
        } else {
            C1443b c1443b2 = c1533b2.f19695o;
            if (c1443b2 == null) {
                c1443b2 = new C1443b();
                c1533b2.f19695o = c1443b2;
            }
            V0.c cVar = c1533b2.f19685b;
            V0.l lVar2 = c1533b2.f19686c;
            long u3 = AbstractC0672a.u(c1533b2.f19701u);
            Q7.h hVar2 = c1443b2.f19142b;
            V0.c y10 = hVar2.y();
            V0.l B10 = hVar2.B();
            j0.l x10 = hVar2.x();
            canvas = a9;
            long D10 = hVar2.D();
            z8 = isHardwareAccelerated;
            C1533b c1533b5 = (C1533b) hVar2.f8696c;
            hVar2.Q(cVar);
            hVar2.S(lVar2);
            hVar2.P(x2);
            hVar2.U(u3);
            hVar2.f8696c = c1533b2;
            x2.i();
            try {
                c1533b2.c(c1443b2);
            } finally {
                x2.g();
                hVar2.Q(y10);
                hVar2.S(B10);
                hVar2.P(x10);
                hVar2.U(D10);
                hVar2.f8696c = c1533b5;
            }
        }
        if (z12) {
            x2.g();
        }
        if (z11) {
            x2.j();
        }
        if (z8) {
            return;
        }
        canvas.restore();
    }

    @Override // A0.s0
    public final boolean i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C1533b c1533b = this.f1664a;
        if (c1533b.f19703w) {
            return X.k(c1533b.d(), intBitsToFloat, intBitsToFloat2);
        }
        return true;
    }

    @Override // A0.s0
    public final void invalidate() {
        if (this.f1673x || this.f1670u) {
            return;
        }
        D d10 = this.f1666c;
        d10.invalidate();
        if (true != this.f1673x) {
            this.f1673x = true;
            d10.v(this, true);
        }
    }

    public final float[] j() {
        float[] fArr = this.f1672w;
        if (fArr == null) {
            fArr = AbstractC1362A.g();
            this.f1672w = fArr;
        }
        if (!this.f1660F) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
            return fArr;
        }
        this.f1660F = false;
        float[] k = k();
        if (this.f1661G) {
            return k;
        }
        if (X.h(k, fArr)) {
            return fArr;
        }
        fArr[0] = Float.NaN;
        return null;
    }

    public final float[] k() {
        boolean z8 = this.f1659E;
        float[] fArr = this.f1671v;
        if (z8) {
            C1533b c1533b = this.f1664a;
            long j = c1533b.f19702v;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = com.bumptech.glide.d.o(AbstractC0672a.u(this.f1669f));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            InterfaceC1535d interfaceC1535d = c1533b.f19684a;
            float u3 = interfaceC1535d.u();
            float p10 = interfaceC1535d.p();
            float x2 = interfaceC1535d.x();
            float E10 = interfaceC1535d.E();
            float H10 = interfaceC1535d.H();
            float e2 = interfaceC1535d.e();
            float G9 = interfaceC1535d.G();
            double d10 = x2 * 0.017453292519943295d;
            float sin = (float) Math.sin(d10);
            float cos = (float) Math.cos(d10);
            float f4 = -sin;
            float f10 = (p10 * cos) - (1.0f * sin);
            float f11 = (1.0f * cos) + (p10 * sin);
            double d11 = E10 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d11);
            float cos2 = (float) Math.cos(d11);
            float f12 = -sin2;
            float f13 = sin * sin2;
            float f14 = sin * cos2;
            float f15 = cos * sin2;
            float f16 = cos * cos2;
            float f17 = (f11 * sin2) + (u3 * cos2);
            float f18 = (f11 * cos2) + ((-u3) * sin2);
            double d12 = H10 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d12);
            float cos3 = (float) Math.cos(d12);
            float f19 = -sin3;
            float f20 = (cos3 * f13) + (f19 * cos2);
            float f21 = (f13 * sin3) + (cos2 * cos3);
            float f22 = sin3 * cos;
            float f23 = cos3 * f14;
            float f24 = sin3 * f14;
            float f25 = f21 * e2;
            float f26 = f22 * e2;
            float f27 = (f24 + (cos3 * f12)) * e2;
            float f28 = f20 * G9;
            float f29 = cos * cos3 * G9;
            float f30 = (f23 + (f19 * f12)) * G9;
            float f31 = f15 * 1.0f;
            float f32 = f4 * 1.0f;
            float f33 = f16 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f25;
                fArr[1] = f26;
                fArr[2] = f27;
                fArr[3] = 0.0f;
                fArr[4] = f28;
                fArr[5] = f29;
                fArr[6] = f30;
                fArr[7] = 0.0f;
                fArr[8] = f31;
                fArr[9] = f32;
                fArr[10] = f33;
                fArr[11] = 0.0f;
                float f34 = -intBitsToFloat;
                fArr[12] = ((f25 * f34) - (f28 * intBitsToFloat2)) + f17 + intBitsToFloat;
                fArr[13] = ((f26 * f34) - (f29 * intBitsToFloat2)) + f10 + intBitsToFloat2;
                fArr[14] = ((f34 * f27) - (intBitsToFloat2 * f30)) + f18;
                fArr[15] = 1.0f;
            }
            this.f1659E = false;
            this.f1661G = AbstractC1362A.q(fArr);
        }
        return fArr;
    }
}
