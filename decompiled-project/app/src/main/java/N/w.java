package N;

import B0.C0170c0;
import C.C0216a;
import C.O;
import C.P;
import C.S;
import C.T;
import Q.AbstractC0499k0;
import Q.C0480b;
import Q.C0498k;
import Q.C0501l0;
import Q.C0505n0;
import Q.C0506o;
import Q.C0523z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ia.C1358d;
import j0.AbstractC1362A;
import java.util.WeakHashMap;
import y0.AbstractC2328M;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7112a = 16;

    public static final void a(c0.m mVar, Y.e eVar, Y.e eVar2, Y.e eVar3, Y.e eVar4, int i7, long j, long j10, C0216a c0216a, Y.e eVar5, C0506o c0506o, int i10) {
        Y.e eVar6;
        Y.e eVar7;
        Y.e eVar8;
        Y.e eVar9;
        long j11;
        long j12;
        P p10;
        C0216a c0216a2;
        Y.e eVar10;
        Y.e eVar11;
        Y.e eVar12;
        Y.e eVar13;
        int i11;
        C0216a c0216a3;
        long j13;
        long j14;
        int i12 = 0;
        c0506o.U(-1219521777);
        int i13 = 2;
        if (((i10 | (c0506o.g(mVar) ? 4 : 2) | 38497712) & 306783379) == 306783378 && c0506o.x()) {
            c0506o.N();
            eVar10 = eVar;
            eVar13 = eVar2;
            eVar11 = eVar3;
            eVar12 = eVar4;
            i11 = i7;
            j13 = j;
            j14 = j10;
            c0216a3 = c0216a;
        } else {
            c0506o.P();
            if ((i10 & 1) == 0 || c0506o.w()) {
                eVar6 = AbstractC0416f.f7039a;
                eVar7 = AbstractC0416f.f7040b;
                eVar8 = AbstractC0416f.f7041c;
                eVar9 = AbstractC0416f.f7042d;
                AbstractC0499k0 abstractC0499k0 = AbstractC0413c.f7031a;
                j11 = ((C0411a) c0506o.k(abstractC0499k0)).f7007n;
                c0506o.S(-1680936624);
                C0411a c0411a = (C0411a) c0506o.k(abstractC0499k0);
                if (j0.n.c(j11, c0411a.f6997a)) {
                    j12 = c0411a.f6998b;
                } else if (j0.n.c(j11, c0411a.f7002f)) {
                    j12 = c0411a.g;
                } else if (j0.n.c(j11, c0411a.j)) {
                    j12 = c0411a.k;
                } else if (j0.n.c(j11, c0411a.f7007n)) {
                    j12 = c0411a.f7008o;
                } else if (j0.n.c(j11, c0411a.f7016w)) {
                    j12 = c0411a.f7017x;
                } else if (j0.n.c(j11, c0411a.f6999c)) {
                    j12 = c0411a.f7000d;
                } else if (j0.n.c(j11, c0411a.f7003h)) {
                    j12 = c0411a.f7004i;
                } else if (j0.n.c(j11, c0411a.f7005l)) {
                    j12 = c0411a.f7006m;
                } else if (j0.n.c(j11, c0411a.f7018y)) {
                    j12 = c0411a.f7019z;
                } else if (j0.n.c(j11, c0411a.f7014u)) {
                    j12 = c0411a.f7015v;
                } else {
                    boolean c10 = j0.n.c(j11, c0411a.f7009p);
                    long j15 = c0411a.f7010q;
                    if (!c10) {
                        if (j0.n.c(j11, c0411a.f7011r)) {
                            j12 = c0411a.f7012s;
                        } else if (!j0.n.c(j11, c0411a.f6990D) && !j0.n.c(j11, c0411a.f6992F) && !j0.n.c(j11, c0411a.f6993G) && !j0.n.c(j11, c0411a.f6994H) && !j0.n.c(j11, c0411a.f6995I) && !j0.n.c(j11, c0411a.f6996J)) {
                            j12 = j0.n.g;
                        }
                    }
                    j12 = j15;
                }
                if (j12 == 16) {
                    j12 = ((j0.n) c0506o.k(AbstractC0417g.f7043a)).f18554a;
                }
                c0506o.p(false);
                WeakHashMap weakHashMap = P.f2369u;
                View view = (View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f);
                WeakHashMap weakHashMap2 = P.f2369u;
                synchronized (weakHashMap2) {
                    try {
                        Object obj = weakHashMap2.get(view);
                        if (obj == null) {
                            obj = new P(view);
                            weakHashMap2.put(view, obj);
                        }
                        p10 = (P) obj;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                boolean i14 = c0506o.i(p10) | c0506o.i(view);
                Object H10 = c0506o.H();
                if (i14 || H10 == C0498k.f8409a) {
                    H10 = new C0170c0(5, p10, view);
                    c0506o.d0(H10);
                }
                C0480b.c(p10, (Rb.c) H10, c0506o);
                c0216a2 = p10.g;
            } else {
                c0506o.N();
                eVar6 = eVar;
                eVar7 = eVar2;
                eVar8 = eVar3;
                eVar9 = eVar4;
                i13 = i7;
                j11 = j;
                j12 = j10;
                c0216a2 = c0216a;
            }
            c0506o.q();
            boolean g = c0506o.g(c0216a2);
            Object H11 = c0506o.H();
            if (g || H11 == C0498k.f8409a) {
                H11 = new O.b(c0216a2);
                c0506o.d0(H11);
            }
            O.b bVar = (O.b) H11;
            boolean g2 = c0506o.g(bVar) | c0506o.g(c0216a2);
            Object H12 = c0506o.H();
            if (g2 || H12 == C0498k.f8409a) {
                H12 = new C0170c0(11, bVar, c0216a2);
                c0506o.d0(H12);
            }
            C1358d c1358d = T.f2390a;
            c0.m c11 = mVar.c(new c0.h(new S((Rb.c) H12, i12)));
            Y.e d10 = Y.f.d(-1979205334, new s(i13, eVar6, eVar5, eVar8, eVar9, bVar, eVar7), c0506o);
            C0523z c0523z = E.f6958a;
            Y5.A a9 = AbstractC1362A.f18492a;
            float f4 = 0;
            AbstractC0499k0 abstractC0499k02 = E.f6958a;
            Y.e eVar14 = eVar6;
            float f10 = ((V0.f) c0506o.k(abstractC0499k02)).f9973a + f4;
            int i15 = i13;
            Y.e eVar15 = eVar7;
            C0480b.b(new C0501l0[]{AbstractC0417g.f7043a.a(new j0.n(j12)), abstractC0499k02.a(new V0.f(f10))}, Y.f.d(-70914509, new D(c11, a9, j11, f10, f4, d10), c0506o), c0506o, 56);
            eVar10 = eVar14;
            eVar11 = eVar8;
            eVar12 = eVar9;
            eVar13 = eVar15;
            i11 = i15;
            c0216a3 = c0216a2;
            j13 = j11;
            j14 = j12;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new t(mVar, eVar10, eVar13, eVar11, eVar12, i11, j13, j14, c0216a3, eVar5, i10);
        }
    }

    public static final void b(int i7, Y.e eVar, Y.e eVar2, Y.e eVar3, Y.e eVar4, O o10, Y.e eVar5, C0506o c0506o, int i10) {
        int i11;
        c0506o.U(-975511942);
        if ((i10 & 6) == 0) {
            i11 = (c0506o.e(i7) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0506o.i(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0506o.i(eVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0506o.i(eVar3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0506o.i(eVar4) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0506o.g(o10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0506o.i(eVar5) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && c0506o.x()) {
            c0506o.N();
        } else {
            boolean z8 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048) | ((458752 & i11) == 131072) | ((57344 & i11) == 16384) | ((i11 & 14) == 4) | ((3670016 & i11) == 1048576) | ((i11 & 896) == 256);
            Object H10 = c0506o.H();
            if (z8 || H10 == C0498k.f8409a) {
                H10 = new s(eVar, eVar3, eVar4, i7, o10, eVar5, eVar2);
                c0506o.d0(H10);
            }
            AbstractC2328M.a(null, (Rb.e) H10, c0506o, 0);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new v(i7, eVar, eVar2, eVar3, eVar4, o10, eVar5, i10);
        }
    }
}
