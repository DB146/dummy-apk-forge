package J;

import A0.A0;
import A0.AbstractC0017g;
import A0.InterfaceC0026o;
import A0.InterfaceC0035y;
import A0.J;
import A0.N;
import A0.T;
import C.C0225j;
import Eb.v;
import H0.i;
import H0.q;
import H0.s;
import H0.t;
import K0.C0371a;
import K0.C0374d;
import K0.F;
import K0.o;
import K0.x;
import L0.j;
import Yb.h;
import c0.l;
import h3.H;
import j0.AbstractC1362A;
import j0.C;
import j0.n;
import java.util.HashMap;
import l0.AbstractC1444c;
import l0.C1447f;
import y0.AbstractC2323H;
import y0.AbstractC2335c;
import y0.C2344l;
import y0.InterfaceC2317B;
import y0.InterfaceC2318C;
import y0.z;
import y7.u0;

/* loaded from: classes.dex */
public final class g extends l implements InterfaceC0035y, InterfaceC0026o, A0 {

    /* renamed from: C, reason: collision with root package name */
    public String f5402C;

    /* renamed from: D, reason: collision with root package name */
    public F f5403D;

    /* renamed from: E, reason: collision with root package name */
    public N0.d f5404E;

    /* renamed from: F, reason: collision with root package name */
    public int f5405F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5406G;

    /* renamed from: H, reason: collision with root package name */
    public int f5407H;

    /* renamed from: I, reason: collision with root package name */
    public int f5408I;

    /* renamed from: J, reason: collision with root package name */
    public HashMap f5409J;

    /* renamed from: K, reason: collision with root package name */
    public d f5410K;
    public f L;

    /* renamed from: M, reason: collision with root package name */
    public e f5411M;

    @Override // A0.A0
    public final void c0(i iVar) {
        f fVar = this.L;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.L = fVar;
        }
        C0374d c0374d = new C0374d(this.f5402C);
        h[] hVarArr = s.f4563a;
        iVar.z(q.f4560y, u0.x(c0374d));
        e eVar = this.f5411M;
        if (eVar != null) {
            boolean z8 = eVar.f5398c;
            t tVar = q.f4528A;
            h[] hVarArr2 = s.f4563a;
            h hVar = hVarArr2[15];
            tVar.a(iVar, Boolean.valueOf(z8));
            C0374d c0374d2 = new C0374d(eVar.f5397b);
            t tVar2 = q.f4561z;
            h hVar2 = hVarArr2[14];
            tVar2.a(iVar, c0374d2);
        }
        iVar.z(H0.h.k, new H0.a(null, new f(this, 1)));
        iVar.z(H0.h.f4479l, new H0.a(null, new f(this, 2)));
        iVar.z(H0.h.f4480m, new H0.a(null, new J(this, 5)));
        iVar.z(H0.h.f4471a, new H0.a(null, fVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // A0.InterfaceC0035y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2317B e(T t5, z zVar, long j) {
        d p02;
        long j10;
        int i7;
        boolean z8;
        o oVar;
        int i10;
        e eVar = this.f5411M;
        if (eVar != null) {
            if (!eVar.f5398c) {
                eVar = null;
            }
            if (eVar != null) {
                p02 = eVar.f5399d;
            }
        }
        p02 = p0();
        p02.b(t5);
        V0.l layoutDirection = t5.getLayoutDirection();
        if (p02.g > 1) {
            F f4 = p02.f5384b;
            b bVar = p02.f5392m;
            InterfaceC2318C interfaceC2318C = p02.f5390i;
            kotlin.jvm.internal.l.b(interfaceC2318C);
            N0.d dVar = p02.f5385c;
            if ((bVar == null || layoutDirection != bVar.f5375a || !O5.b.E(f4, layoutDirection).equals(bVar.f5376b) || interfaceC2318C.k() != bVar.f5377c.f9968a || dVar != bVar.f5378d) && ((bVar = b.f5374h) == null || layoutDirection != bVar.f5375a || !O5.b.E(f4, layoutDirection).equals(bVar.f5376b) || interfaceC2318C.k() != bVar.f5377c.f9968a || dVar != bVar.f5378d)) {
                bVar = new b(layoutDirection, O5.b.E(f4, layoutDirection), new V0.d(interfaceC2318C.k(), interfaceC2318C.f()), dVar);
                b.f5374h = bVar;
            }
            p02.f5392m = bVar;
            int i11 = p02.g;
            float f10 = bVar.g;
            float f11 = bVar.f5380f;
            if (Float.isNaN(f10) || Float.isNaN(f11)) {
                String str = c.f5381a;
                long b2 = V0.b.b(0, 0, 15);
                V0.d dVar2 = bVar.f5377c;
                float b10 = u0.d(str, bVar.f5379e, b2, dVar2, bVar.f5378d, 1).b();
                f11 = u0.d(c.f5382b, bVar.f5379e, V0.b.b(0, 0, 15), dVar2, bVar.f5378d, 2).b() - b10;
                bVar.g = b10;
                bVar.f5380f = f11;
                f10 = b10;
            }
            if (i11 != 1) {
                int round = Math.round((f11 * (i11 - 1)) + f10);
                i10 = round >= 0 ? round : 0;
                int g = V0.a.g(j);
                if (i10 > g) {
                    i10 = g;
                }
            } else {
                i10 = V0.a.i(j);
            }
            j10 = V0.b.a(V0.a.j(j), V0.a.h(j), i10, V0.a.g(j));
        } else {
            j10 = j;
        }
        C0371a c0371a = p02.j;
        if (c0371a == null || (oVar = p02.f5393n) == null || oVar.a() || layoutDirection != p02.f5394o || (!V0.a.b(j10, p02.f5395p) && (V0.a.h(j10) != V0.a.h(p02.f5395p) || V0.a.j(j10) != V0.a.j(p02.f5395p) || V0.a.g(j10) < c0371a.b() || c0371a.f5863d.f6251d))) {
            o oVar2 = p02.f5393n;
            if (oVar2 == null || layoutDirection != p02.f5394o || oVar2.a()) {
                p02.f5394o = layoutDirection;
                String str2 = p02.f5383a;
                F E10 = O5.b.E(p02.f5384b, layoutDirection);
                InterfaceC2318C interfaceC2318C2 = p02.f5390i;
                kotlin.jvm.internal.l.b(interfaceC2318C2);
                N0.d dVar3 = p02.f5385c;
                v vVar = v.f3891a;
                oVar2 = new R0.c(str2, E10, vVar, vVar, dVar3, interfaceC2318C2);
            }
            p02.f5393n = oVar2;
            boolean z10 = p02.f5387e;
            int i12 = p02.f5386d;
            float c10 = oVar2.c();
            int h10 = ((z10 || tc.b.t(i12, 2) || tc.b.t(i12, 4) || tc.b.t(i12, 5)) && V0.a.d(j10)) ? V0.a.h(j10) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (V0.a.j(j10) != h10) {
                h10 = H.k(Q5.e.i(c10), V0.a.j(j10), h10);
            }
            long l10 = Tb.a.l(0, h10, 0, V0.a.g(j10));
            boolean z11 = p02.f5387e;
            int i13 = p02.f5386d;
            int i14 = p02.f5388f;
            if (z11 || !(tc.b.t(i13, 2) || tc.b.t(i13, 4) || tc.b.t(i13, 5))) {
                if (i14 < 1) {
                    i14 = 1;
                }
                i7 = i14;
            } else {
                i7 = 1;
            }
            C0371a c0371a2 = new C0371a((R0.c) oVar2, i7, p02.f5386d, l10);
            p02.f5395p = j10;
            long d10 = V0.b.d(j10, (Q5.e.i(c0371a2.b()) & 4294967295L) | (Q5.e.i(c0371a2.c()) << 32));
            p02.f5391l = d10;
            p02.k = !tc.b.t(p02.f5386d, 3) && (((float) ((int) (d10 >> 32))) < c0371a2.c() || ((float) ((int) (d10 & 4294967295L))) < c0371a2.b());
            p02.j = c0371a2;
            z8 = true;
        } else {
            if (!V0.a.b(j10, p02.f5395p)) {
                C0371a c0371a3 = p02.j;
                kotlin.jvm.internal.l.b(c0371a3);
                long d11 = V0.b.d(j10, (Q5.e.i(c0371a3.b()) & 4294967295L) | (Q5.e.i(Math.min(c0371a3.f5860a.f8791w.c(), c0371a3.c())) << 32));
                p02.f5391l = d11;
                p02.k = !tc.b.t(p02.f5386d, 3) && (((float) ((int) (d11 >> 32))) < c0371a3.c() || ((float) ((int) (d11 & 4294967295L))) < c0371a3.b());
                p02.f5395p = j10;
            }
            z8 = false;
        }
        o oVar3 = p02.f5393n;
        if (oVar3 != null) {
            oVar3.a();
        }
        C0371a c0371a4 = p02.j;
        kotlin.jvm.internal.l.b(c0371a4);
        long j11 = p02.f5391l;
        if (z8) {
            AbstractC0017g.r(this, 2).A0();
            HashMap hashMap = this.f5409J;
            if (hashMap == null) {
                hashMap = new HashMap(2);
                this.f5409J = hashMap;
            }
            C2344l c2344l = AbstractC2335c.f26577a;
            j jVar = c0371a4.f5863d;
            hashMap.put(c2344l, Integer.valueOf(Math.round(jVar.c(0))));
            hashMap.put(AbstractC2335c.f26578b, Integer.valueOf(Math.round(jVar.c(jVar.f6253f - 1))));
        }
        int i15 = (int) (j11 >> 32);
        int i16 = (int) (j11 & 4294967295L);
        AbstractC2323H b11 = zVar.b(Tb.a.l(i15, i15, i16, i16));
        HashMap hashMap2 = this.f5409J;
        kotlin.jvm.internal.l.b(hashMap2);
        return t5.q(i15, i16, hashMap2, new C0225j(b11, 4));
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    public final d p0() {
        if (this.f5410K == null) {
            this.f5410K = new d(this.f5402C, this.f5403D, this.f5404E, this.f5405F, this.f5406G, this.f5407H, this.f5408I);
        }
        d dVar = this.f5410K;
        kotlin.jvm.internal.l.b(dVar);
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // A0.InterfaceC0026o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(N n6) {
        d p02;
        if (this.f14112B) {
            e eVar = this.f5411M;
            if (eVar != null) {
                if (!eVar.f5398c) {
                    eVar = null;
                }
                if (eVar != null) {
                    p02 = eVar.f5399d;
                }
            }
            p02 = p0();
            C0371a c0371a = p02.j;
            if (c0371a == null) {
                B.a.b("no paragraph (layoutCache=" + this.f5410K + ", textSubstitution=" + this.f5411M + ')');
                throw new Db.d(0);
            }
            j0.l x2 = n6.f90a.f19142b.x();
            boolean z8 = p02.k;
            if (z8) {
                long j = p02.f5391l;
                x2.i();
                x2.e(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                x xVar = this.f5403D.f5855a;
                U0.l lVar = xVar.f5995m;
                if (lVar == null) {
                    lVar = U0.l.f9432b;
                }
                C c10 = xVar.f5996n;
                if (c10 == null) {
                    c10 = C.f18511d;
                }
                AbstractC1444c abstractC1444c = xVar.f5997o;
                if (abstractC1444c == null) {
                    abstractC1444c = C1447f.f19147b;
                }
                AbstractC1362A c11 = xVar.f5986a.c();
                if (c11 != null) {
                    float a9 = this.f5403D.f5855a.f5986a.a();
                    R0.d dVar = c0371a.f5860a.f8789u;
                    int i7 = dVar.f8796c;
                    float c12 = c0371a.c();
                    dVar.c(c11, (Float.floatToRawIntBits(c0371a.b()) & 4294967295L) | (Float.floatToRawIntBits(c12) << 32), a9);
                    dVar.f(c10);
                    dVar.g(lVar);
                    dVar.e(abstractC1444c);
                    dVar.b(3);
                    c0371a.d(x2);
                    dVar.b(i7);
                } else {
                    long j10 = n.g;
                    if (j10 == 16) {
                        j10 = this.f5403D.b() != 16 ? this.f5403D.b() : n.f18548b;
                    }
                    R0.d dVar2 = c0371a.f5860a.f8789u;
                    int i10 = dVar2.f8796c;
                    dVar2.d(j10);
                    dVar2.f(c10);
                    dVar2.g(lVar);
                    dVar2.e(abstractC1444c);
                    dVar2.b(3);
                    c0371a.d(x2);
                    dVar2.b(i10);
                }
                if (z8) {
                    x2.g();
                }
            } catch (Throwable th) {
                if (z8) {
                    x2.g();
                }
                throw th;
            }
        }
    }
}
