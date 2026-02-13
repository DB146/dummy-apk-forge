package y3;

import A0.A0;
import A0.AbstractC0017g;
import A0.InterfaceC0026o;
import A0.InterfaceC0035y;
import A0.K;
import A0.N;
import A0.T;
import B0.D;
import C.C0225j;
import Eb.w;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import cc.D0;
import cc.F;
import ia.C1358d;
import l0.C1443b;
import o0.AbstractC1775c;
import u.C2042E;
import y0.AbstractC2323H;
import y0.AbstractC2327L;
import y0.AbstractC2328M;
import y0.InterfaceC2317B;
import y0.InterfaceC2342j;
import y0.z;
import z3.C2586a;

/* loaded from: classes.dex */
public final class p extends c0.l implements InterfaceC0026o, InterfaceC0035y, A0 {

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.k f26824C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2342j f26825D;

    /* renamed from: E, reason: collision with root package name */
    public c0.e f26826E;

    /* renamed from: F, reason: collision with root package name */
    public Y6.b f26827F;

    /* renamed from: H, reason: collision with root package name */
    public j0.i f26829H;

    /* renamed from: K, reason: collision with root package name */
    public D0 f26832K;
    public j L;

    /* renamed from: M, reason: collision with root package name */
    public AbstractC1775c f26833M;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC1775c f26834N;

    /* renamed from: O, reason: collision with root package name */
    public AbstractC1775c f26835O;

    /* renamed from: Q, reason: collision with root package name */
    public C2384g f26837Q;

    /* renamed from: R, reason: collision with root package name */
    public C2384g f26838R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f26839S;

    /* renamed from: T, reason: collision with root package name */
    public z3.i f26840T;

    /* renamed from: G, reason: collision with root package name */
    public float f26828G = 1.0f;

    /* renamed from: I, reason: collision with root package name */
    public C2378a f26830I = C2378a.f26793a;

    /* renamed from: J, reason: collision with root package name */
    public boolean f26831J = true;

    /* renamed from: P, reason: collision with root package name */
    public boolean f26836P = true;

    /* renamed from: U, reason: collision with root package name */
    public C2378a f26841U = C2378a.f26794b;

    /* renamed from: V, reason: collision with root package name */
    public final Db.o f26842V = android.support.v4.media.session.b.z(new k(this, 2));

    public static boolean r0(long j) {
        if (j != 9205357640488583168L) {
            float b2 = i0.e.b(j);
            if (b2 > 0.0f && !Float.isInfinite(b2) && !Float.isNaN(b2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(long j) {
        if (j != 9205357640488583168L) {
            float c10 = i0.e.c(j);
            if (c10 > 0.0f && !Float.isInfinite(c10) && !Float.isNaN(c10)) {
                return true;
            }
        }
        return false;
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        kotlin.jvm.internal.l.e(iVar, "<this>");
        k kVar = new k(this, 0);
        Yb.h[] hVarArr = AbstractC2383f.f26802a;
        Yb.h hVar = hVarArr[0];
        AbstractC2383f.f26804c.a(iVar, kVar);
        k kVar2 = new k(this, 1);
        Yb.h hVar2 = hVarArr[1];
        AbstractC2383f.f26805d.a(iVar, kVar2);
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, z measurable, long j) {
        AbstractC1775c b2;
        kotlin.jvm.internal.l.e(measurable, "measurable");
        this.f26837Q = null;
        this.f26838R = null;
        this.f26839S = V0.a.f(j) && V0.a.e(j);
        int h10 = V0.a.d(j) ? V0.a.h(j) : Integer.MIN_VALUE;
        int g = V0.a.c(j) ? V0.a.g(j) : Integer.MIN_VALUE;
        z3.i iVar = (W3.o.i(h10) && W3.o.i(g)) ? new z3.i(h10, g) : null;
        this.f26840T = iVar;
        Y6.b bVar = this.f26827F;
        if (bVar == null) {
            kotlin.jvm.internal.l.j("resolvableGlideSize");
            throw null;
        }
        if (!(bVar instanceof C2586a)) {
            boolean z8 = bVar instanceof z3.f;
        } else if (iVar != null) {
            ((C2586a) bVar).k.J(iVar);
        }
        if (V0.a.f(j) && V0.a.e(j)) {
            j = V0.a.a(V0.a.h(j), V0.a.g(j), j);
        } else {
            j jVar = this.L;
            if (jVar != null && (b2 = jVar.b()) != null) {
                long e2 = b2.e();
                int h11 = V0.a.f(j) ? V0.a.h(j) : s0(e2) ? Tb.a.F(i0.e.c(e2)) : V0.a.j(j);
                int g2 = V0.a.e(j) ? V0.a.g(j) : r0(e2) ? Tb.a.F(i0.e.b(e2)) : V0.a.i(j);
                int f4 = V0.b.f(h11, j);
                int e10 = V0.b.e(g2, j);
                long a9 = com.bumptech.glide.d.a(h11, g2);
                InterfaceC2342j interfaceC2342j = this.f26825D;
                if (interfaceC2342j == null) {
                    kotlin.jvm.internal.l.j("contentScale");
                    throw null;
                }
                long a10 = interfaceC2342j.a(a9, com.bumptech.glide.d.a(f4, e10));
                if (a10 != AbstractC2327L.f26565a) {
                    long i7 = AbstractC2328M.i(a9, a10);
                    j = V0.a.a(V0.b.f(Tb.a.F(i0.e.c(i7)), j), V0.b.e(Tb.a.F(i0.e.b(i7)), j), j);
                }
            }
        }
        AbstractC2323H b10 = measurable.b(j);
        return t5.Q(b10.f26554a, b10.f26555b, w.f3892a, new C0225j(b10, 10));
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        com.bumptech.glide.k kVar = this.f26824C;
        if (kVar == null) {
            kotlin.jvm.internal.l.j("requestBuilder");
            throw null;
        }
        p pVar = (p) obj;
        com.bumptech.glide.k kVar2 = pVar.f26824C;
        if (kVar2 == null) {
            kotlin.jvm.internal.l.j("requestBuilder");
            throw null;
        }
        if (!kotlin.jvm.internal.l.a(kVar, kVar2)) {
            return false;
        }
        InterfaceC2342j interfaceC2342j = this.f26825D;
        if (interfaceC2342j == null) {
            kotlin.jvm.internal.l.j("contentScale");
            throw null;
        }
        InterfaceC2342j interfaceC2342j2 = pVar.f26825D;
        if (interfaceC2342j2 == null) {
            kotlin.jvm.internal.l.j("contentScale");
            throw null;
        }
        if (!kotlin.jvm.internal.l.a(interfaceC2342j, interfaceC2342j2)) {
            return false;
        }
        c0.e eVar = this.f26826E;
        if (eVar == null) {
            kotlin.jvm.internal.l.j("alignment");
            throw null;
        }
        c0.e eVar2 = pVar.f26826E;
        if (eVar2 != null) {
            return kotlin.jvm.internal.l.a(eVar, eVar2) && kotlin.jvm.internal.l.a(this.f26829H, pVar.f26829H) && kotlin.jvm.internal.l.a(null, null) && this.f26831J == pVar.f26831J && kotlin.jvm.internal.l.a(this.f26830I, pVar.f26830I) && this.f26828G == pVar.f26828G && kotlin.jvm.internal.l.a(this.f26833M, pVar.f26833M) && kotlin.jvm.internal.l.a(this.f26834N, pVar.f26834N);
        }
        kotlin.jvm.internal.l.j("alignment");
        throw null;
    }

    @Override // c0.l
    public final void h0() {
        if (this.f26832K == null) {
            com.bumptech.glide.k kVar = this.f26824C;
            if (kVar == null) {
                kotlin.jvm.internal.l.j("requestBuilder");
                throw null;
            }
            K k = new K(18, this, kVar);
            C2042E c2042e = ((D) AbstractC0017g.u(this)).f1591H0;
            if (c2042e.f(k) >= 0) {
                return;
            }
            c2042e.a(k);
        }
    }

    public final int hashCode() {
        com.bumptech.glide.k kVar = this.f26824C;
        if (kVar == null) {
            kotlin.jvm.internal.l.j("requestBuilder");
            throw null;
        }
        int hashCode = kVar.hashCode() * 31;
        InterfaceC2342j interfaceC2342j = this.f26825D;
        if (interfaceC2342j == null) {
            kotlin.jvm.internal.l.j("contentScale");
            throw null;
        }
        int hashCode2 = (interfaceC2342j.hashCode() + hashCode) * 31;
        c0.e eVar = this.f26826E;
        if (eVar == null) {
            kotlin.jvm.internal.l.j("alignment");
            throw null;
        }
        int hashCode3 = (eVar.hashCode() + hashCode2) * 31;
        j0.i iVar = this.f26829H;
        int e2 = h3.o.e(this.f26828G, (this.f26830I.hashCode() + ((h3.o.g(this.f26831J, (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31) + 0) * 31)) * 31, 31);
        AbstractC1775c abstractC1775c = this.f26833M;
        int hashCode4 = (e2 + (abstractC1775c != null ? abstractC1775c.hashCode() : 0)) * 31;
        AbstractC1775c abstractC1775c2 = this.f26834N;
        return hashCode4 + (abstractC1775c2 != null ? abstractC1775c2.hashCode() : 0);
    }

    @Override // c0.l
    public final void i0() {
        p0();
        if (kotlin.jvm.internal.l.a(this.f26841U, C2378a.f26794b)) {
            return;
        }
        F.B(d0(), null, 0, new o(this, null), 3);
    }

    @Override // c0.l
    public final void j0() {
        p0();
        t0(null);
    }

    public final void p0() {
        this.f26836P = true;
        D0 d02 = this.f26832K;
        if (d02 != null) {
            d02.cancel(null);
        }
        this.f26832K = null;
        t0(null);
    }

    public final C2384g q0(N n6, AbstractC1775c abstractC1775c, C2384g c2384g, Rb.e eVar) {
        long j;
        C2384g c2384g2;
        C1443b c1443b;
        if (abstractC1775c == null) {
            return null;
        }
        C1443b c1443b2 = n6.f90a;
        if (c2384g != null) {
            c2384g2 = c2384g;
            c1443b = c1443b2;
        } else {
            long a9 = com.bumptech.glide.d.a(s0(abstractC1775c.e()) ? i0.e.c(abstractC1775c.e()) : i0.e.c(c1443b2.v()), r0(abstractC1775c.e()) ? i0.e.b(abstractC1775c.e()) : i0.e.b(c1443b2.v()));
            long v10 = c1443b2.v();
            if (s0(v10) && r0(v10)) {
                InterfaceC2342j interfaceC2342j = this.f26825D;
                if (interfaceC2342j == null) {
                    kotlin.jvm.internal.l.j("contentScale");
                    throw null;
                }
                j = AbstractC2328M.i(a9, interfaceC2342j.a(a9, c1443b2.v()));
            } else {
                j = 0;
            }
            c0.e eVar2 = this.f26826E;
            if (eVar2 == null) {
                kotlin.jvm.internal.l.j("alignment");
                throw null;
            }
            long v11 = c1443b2.v();
            c1443b = c1443b2;
            long a10 = eVar2.a((Tb.a.F(i0.e.c(j)) << 32) | (Tb.a.F(i0.e.b(j)) & 4294967295L), (Tb.a.F(i0.e.c(v11)) << 32) | (Tb.a.F(i0.e.b(v11)) & 4294967295L), n6.getLayoutDirection());
            c2384g2 = new C2384g(new PointF((int) (a10 >> 32), (int) (a10 & 4294967295L)), j);
        }
        float c10 = i0.e.c(c1443b.v());
        float b2 = i0.e.b(c1443b.v());
        C1443b c1443b3 = c1443b;
        Q7.h hVar = c1443b3.f19142b;
        long D10 = hVar.D();
        hVar.x().i();
        ((Q7.h) ((C1358d) hVar.f8695b).f18487b).x().e(0.0f, 0.0f, c10, b2, 1);
        PointF pointF = c2384g2.f26806a;
        float f4 = pointF.x;
        float f10 = pointF.y;
        ((C1358d) c1443b3.f19142b.f8695b).u(f4, f10);
        eVar.invoke(n6, new i0.e(c2384g2.f26807b));
        ((C1358d) c1443b3.f19142b.f8695b).u(-f4, -f10);
        hVar.x().g();
        hVar.U(D10);
        return c2384g2;
    }

    @Override // A0.InterfaceC0026o
    public final void t(N n6) {
        AbstractC1775c b2;
        if (this.f26831J) {
            this.f26841U.getClass();
            AbstractC1775c abstractC1775c = this.f26835O;
            C1443b c1443b = n6.f90a;
            if (abstractC1775c != null) {
                j0.l x2 = c1443b.f19142b.x();
                try {
                    x2.i();
                    this.f26837Q = q0(n6, abstractC1775c, this.f26837Q, new l(abstractC1775c, this));
                    x2.g();
                } finally {
                }
            }
            j jVar = this.L;
            if (jVar != null && (b2 = jVar.b()) != null) {
                try {
                    c1443b.f19142b.x().i();
                    this.f26838R = q0(n6, b2, this.f26838R, new l(this, b2));
                } finally {
                }
            }
        }
        n6.a();
    }

    public final void t0(j jVar) {
        j jVar2 = this.L;
        if (jVar2 != null) {
            jVar2.d();
        }
        this.L = jVar;
        if (jVar != null) {
            jVar.c((Drawable.Callback) this.f26842V.getValue());
        }
        this.f26838R = null;
    }
}
