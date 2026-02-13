package F;

import A0.C0005a;
import A0.j0;
import B0.C0170c0;
import Q.AbstractC0499k0;
import Q.C0480b;
import Q.C0487e0;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.S0;
import a0.AbstractC0682i;
import a0.AbstractC0692s;
import y0.AbstractC2321F;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final A0.B f4022a = new A0.B(3);

    public static final void a(Yb.g gVar, c0.m mVar, D d10, Rb.e eVar, C0506o c0506o, int i7) {
        c0506o.U(2002163445);
        int i10 = (c0506o.i(gVar) ? 4 : 2) | i7 | (c0506o.g(mVar) ? 32 : 16) | (c0506o.g(d10) ? 256 : 128) | (c0506o.i(eVar) ? 2048 : 1024);
        if (c0506o.K(i10 & 1, (i10 & 1171) != 1170)) {
            c(Y.f.d(-1488997347, new androidx.compose.foundation.lazy.layout.c(d10, mVar, eVar, C0480b.r(gVar, c0506o)), c0506o), c0506o, 6);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0277v(gVar, mVar, d10, eVar, i7);
        }
    }

    public static final void b(Object obj, int i7, A a9, Y.e eVar, C0506o c0506o, int i10) {
        int i11;
        c0506o.U(-2079116560);
        if ((i10 & 6) == 0) {
            i11 = (c0506o.i(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0506o.e(i7) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0506o.i(a9) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0506o.i(eVar) ? 2048 : 1024;
        }
        if (c0506o.K(i11 & 1, (i11 & 1171) != 1170)) {
            boolean g = c0506o.g(obj) | c0506o.g(a9);
            Object H10 = c0506o.H();
            Object obj2 = C0498k.f8409a;
            if (g || H10 == obj2) {
                H10 = new z(obj, a9);
                c0506o.d0(H10);
            }
            z zVar = (z) H10;
            zVar.f4027c = i7;
            C0487e0 c0487e0 = zVar.g;
            AbstractC0499k0 abstractC0499k0 = AbstractC2321F.f26552a;
            z zVar2 = (z) c0506o.k(abstractC0499k0);
            AbstractC0682i c10 = AbstractC0692s.c();
            Rb.c e2 = c10 != null ? c10.e() : null;
            AbstractC0682i d10 = AbstractC0692s.d(c10);
            try {
                if (zVar2 != ((z) c0487e0.getValue())) {
                    c0487e0.setValue(zVar2);
                    if (zVar.f4028d > 0) {
                        z zVar3 = zVar.f4029e;
                        if (zVar3 != null) {
                            zVar3.b();
                        }
                        if (zVar2 != null) {
                            zVar2.a();
                        } else {
                            zVar2 = null;
                        }
                        zVar.f4029e = zVar2;
                    }
                }
                AbstractC0692s.f(c10, d10, e2);
                boolean g2 = c0506o.g(zVar);
                Object H11 = c0506o.H();
                if (g2 || H11 == obj2) {
                    H11 = new C0005a(zVar, 10);
                    c0506o.d0(H11);
                }
                C0480b.c(zVar, (Rb.c) H11, c0506o);
                C0480b.a(abstractC0499k0.a(zVar), eVar, c0506o, ((i11 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC0692s.f(c10, d10, e2);
                throw th;
            }
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0275t(obj, i7, a9, eVar, i10);
        }
    }

    public static final void c(Y.e eVar, C0506o c0506o, int i7) {
        boolean z8 = false;
        c0506o.U(674185128);
        if (c0506o.K(1 & i7, (i7 & 3) != 2)) {
            S0 s02 = Z.l.f12101a;
            Z.j jVar = (Z.j) c0506o.k(s02);
            Z.g z10 = q3.f.z(c0506o);
            Object[] objArr = {jVar};
            M m10 = M.f3925a;
            C0170c0 c0170c0 = new C0170c0(8, jVar, z10);
            q3.s sVar = Z.n.f12102a;
            q3.s sVar2 = new q3.s(24, m10, c0170c0, z8);
            boolean i10 = c0506o.i(jVar) | c0506o.i(z10);
            Object H10 = c0506o.H();
            if (i10 || H10 == C0498k.f8409a) {
                H10 = new A0.K(9, jVar, z10);
                c0506o.d0(H10);
            }
            N n6 = (N) c2.i.w(objArr, sVar2, (Rb.a) H10, c0506o, 0, 4);
            C0480b.a(s02.a(n6), Y.f.d(1863926504, new j0(4, eVar, n6), c0506o), c0506o, 56);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new O(eVar, i7);
        }
    }

    public static final void d(E.j jVar, Object obj, int i7, Object obj2, C0506o c0506o, int i10) {
        int i11;
        c0506o.U(1439843069);
        if ((i10 & 6) == 0) {
            i11 = (c0506o.g(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0506o.g(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0506o.e(i7) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0506o.g(obj2) ? 2048 : 1024;
        }
        if (c0506o.K(i11 & 1, (i11 & 1171) != 1170)) {
            ((Z.c) obj).d(obj2, Y.f.d(980966366, new C0274s(i7, jVar, obj2), c0506o), c0506o, 48);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0275t(jVar, obj, i7, obj2, i10);
        }
    }

    public static final int e(int i7, S.e eVar) {
        int i10 = eVar.f8961c - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = eVar.f8959a;
            int i13 = ((C0265i) objArr[i12]).f3975a;
            if (i13 != i7) {
                if (i13 < i7) {
                    i11 = i12 + 1;
                    if (i7 < ((C0265i) objArr[i11]).f3975a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    public static final int f(int i7, E.j jVar, Object obj) {
        int m10;
        return (obj == null || jVar.b() == 0 || (i7 < jVar.b() && obj.equals(jVar.c(i7))) || (m10 = jVar.f3417d.m(obj)) == -1) ? i7 : m10;
    }
}
