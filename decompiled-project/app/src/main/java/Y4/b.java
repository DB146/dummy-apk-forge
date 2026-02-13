package Y4;

import A4.s;
import P4.C0463k;
import P4.InterfaceC0475x;
import P4.InterfaceC0476y;
import P4.d0;
import P4.e0;
import P4.f0;
import P4.m0;
import P4.n0;
import R4.g;
import S4.j;
import Y5.B;
import h8.e;
import java.util.ArrayList;
import m4.E0;
import m4.L;
import m5.C1620q;
import m5.InterfaceC1616m;
import m5.K;
import m5.T;
import r4.C1941m;
import r4.q;

/* loaded from: classes.dex */
public final class b implements InterfaceC0476y, e0 {

    /* renamed from: A, reason: collision with root package name */
    public g[] f11160A;

    /* renamed from: B, reason: collision with root package name */
    public C0463k f11161B;

    /* renamed from: a, reason: collision with root package name */
    public final j f11162a;

    /* renamed from: b, reason: collision with root package name */
    public final T f11163b;

    /* renamed from: c, reason: collision with root package name */
    public final K f11164c;

    /* renamed from: d, reason: collision with root package name */
    public final q f11165d;

    /* renamed from: e, reason: collision with root package name */
    public final C1941m f11166e;

    /* renamed from: f, reason: collision with root package name */
    public final B f11167f;

    /* renamed from: u, reason: collision with root package name */
    public final s f11168u;

    /* renamed from: v, reason: collision with root package name */
    public final C1620q f11169v;

    /* renamed from: w, reason: collision with root package name */
    public final n0 f11170w;

    /* renamed from: x, reason: collision with root package name */
    public final e f11171x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0475x f11172y;

    /* renamed from: z, reason: collision with root package name */
    public Z4.c f11173z;

    public b(Z4.c cVar, j jVar, T t5, e eVar, q qVar, C1941m c1941m, B b2, s sVar, K k, C1620q c1620q) {
        this.f11173z = cVar;
        this.f11162a = jVar;
        this.f11163b = t5;
        this.f11164c = k;
        this.f11165d = qVar;
        this.f11166e = c1941m;
        this.f11167f = b2;
        this.f11168u = sVar;
        this.f11169v = c1620q;
        this.f11171x = eVar;
        m0[] m0VarArr = new m0[cVar.f12170f.length];
        int i7 = 0;
        while (true) {
            Z4.b[] bVarArr = cVar.f12170f;
            if (i7 >= bVarArr.length) {
                this.f11170w = new n0(m0VarArr);
                g[] gVarArr = new g[0];
                this.f11160A = gVarArr;
                eVar.getClass();
                this.f11161B = new C0463k(gVarArr, 0);
                return;
            }
            L[] lArr = bVarArr[i7].j;
            L[] lArr2 = new L[lArr.length];
            for (int i10 = 0; i10 < lArr.length; i10++) {
                L l10 = lArr[i10];
                int e2 = qVar.e(l10);
                m4.K a9 = l10.a();
                a9.f19975F = e2;
                lArr2[i10] = new L(a9);
            }
            m0VarArr[i7] = new m0(Integer.toString(i7), lArr2);
            i7++;
        }
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        for (g gVar : this.f11160A) {
            if (gVar.f8894a == 2) {
                return gVar.f8898e.c(j, e02);
            }
        }
        return j;
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f11161B.d();
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        this.f11172y.i(this);
    }

    @Override // P4.f0
    public final long j() {
        return this.f11161B.j();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        return this.f11170w;
    }

    @Override // P4.f0
    public final long n() {
        return this.f11161B.n();
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        this.f11164c.a();
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f11172y = interfaceC0475x;
        interfaceC0475x.a(this);
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        for (g gVar : this.f11160A) {
            gVar.C(j);
        }
        return j;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        for (g gVar : this.f11160A) {
            gVar.s(j);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        int i7;
        k5.s sVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < sVarArr.length) {
            d0 d0Var = d0VarArr[i10];
            if (d0Var != null) {
                g gVar = (g) d0Var;
                k5.s sVar2 = sVarArr[i10];
                if (sVar2 == null || !zArr[i10]) {
                    gVar.B(null);
                    d0VarArr[i10] = null;
                } else {
                    ((a) gVar.f8898e).f11157e = sVar2;
                    arrayList.add(gVar);
                }
            }
            if (d0VarArr[i10] != null || (sVar = sVarArr[i10]) == null) {
                i7 = i10;
            } else {
                int b2 = this.f11170w.b(sVar.k());
                Z4.c cVar = this.f11173z;
                InterfaceC1616m e2 = this.f11162a.f9128a.e();
                T t5 = this.f11163b;
                if (t5 != null) {
                    e2.a(t5);
                }
                i7 = i10;
                g gVar2 = new g(this.f11173z.f12170f[b2].f12152a, null, null, new a(this.f11164c, cVar, b2, sVar, e2), this, this.f11169v, j, this.f11165d, this.f11166e, this.f11167f, this.f11168u);
                arrayList.add(gVar2);
                d0VarArr[i7] = gVar2;
                zArr2[i7] = true;
            }
            i10 = i7 + 1;
        }
        g[] gVarArr = new g[arrayList.size()];
        this.f11160A = gVarArr;
        arrayList.toArray(gVarArr);
        g[] gVarArr2 = this.f11160A;
        this.f11171x.getClass();
        this.f11161B = new C0463k(gVarArr2, 0);
        return j;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        return this.f11161B.x(j);
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f11161B.y(j);
    }
}
