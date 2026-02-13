package N;

import A0.j0;
import Q.C0480b;
import Q.C0498k;
import Q.C0501l0;
import Q.C0505n0;
import Q.C0506o;
import Q.Q;
import Q.S;
import Q.S0;
import Q.W;
import x.o0;

/* loaded from: classes.dex */
public abstract class n {
    static {
        new Q(C0412b.f7023e);
    }

    public static final void a(C0411a c0411a, z zVar, H h10, Y.e eVar, C0506o c0506o, int i7) {
        int i10;
        z zVar2;
        Object rVar;
        z zVar3;
        c0506o.U(-2127166334);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.g(c0411a) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0506o.g(h10) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= c0506o.i(eVar) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && c0506o.x()) {
            c0506o.N();
            zVar3 = zVar;
        } else {
            c0506o.P();
            if ((i7 & 1) == 0 || c0506o.w()) {
                zVar2 = (z) c0506o.k(A.f6949a);
            } else {
                c0506o.N();
                zVar2 = zVar;
            }
            c0506o.q();
            S0 s02 = q.f7067a;
            long j = j0.n.g;
            c0506o.S(-1280632857);
            boolean booleanValue = ((Boolean) c0506o.k(q.f7067a)).booleanValue();
            S s3 = C0498k.f8409a;
            if (booleanValue) {
                o0 o0Var = M.k.f6506a;
                W r10 = C0480b.r(new j0.n(j), c0506o);
                boolean h11 = c0506o.h(true) | c0506o.d(Float.NaN);
                Object H10 = c0506o.H();
                if (h11 || H10 == s3) {
                    H10 = new M.d(r10);
                    c0506o.d0(H10);
                }
                rVar = (M.d) H10;
            } else {
                rVar = (V0.f.a(Float.NaN, Float.NaN) && j0.n.c(j, j)) ? q.f7069c : new r(j, true);
            }
            c0506o.p(false);
            long j10 = c0411a.f6997a;
            boolean f4 = c0506o.f(j10);
            Object H11 = c0506o.H();
            if (f4 || H11 == s3) {
                H11 = new K.c(j10, j0.n.b(j10, 0.4f));
                c0506o.d0(H11);
            }
            C0480b.b(new C0501l0[]{AbstractC0413c.f7031a.a(c0411a), androidx.compose.foundation.c.f13141a.a(rVar), M.o.f6511a.a(C0414d.f7033a), A.f6949a.a(zVar2), K.d.f5830a.a((K.c) H11), I.f6986a.a(h10)}, Y.f.d(-1066563262, new j0(5, h10, eVar), c0506o), c0506o, 56);
            zVar3 = zVar2;
        }
        C0505n0 r11 = c0506o.r();
        if (r11 != null) {
            r11.f8432d = new m(c0411a, zVar3, h10, eVar, i7);
        }
    }
}
