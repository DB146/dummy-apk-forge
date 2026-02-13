package y0;

import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import A0.U;
import A0.j0;
import A0.n0;
import Q.C0480b;
import Q.C0498k;
import Q.C0502m;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;

/* renamed from: y0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2328M {

    /* renamed from: a, reason: collision with root package name */
    public static final C2319D f26567a = new C2319D(4);

    public static final void a(c0.j jVar, Rb.e eVar, C0506o c0506o, int i7) {
        c0506o.U(-1298353104);
        int i10 = i7 | 6 | (c0506o.i(eVar) ? 32 : 16);
        if (c0506o.K(i10 & 1, (i10 & 19) != 18)) {
            jVar = c0.j.f14110a;
            Object H10 = c0506o.H();
            if (H10 == C0498k.f8409a) {
                H10 = new C2331P(C2319D.f26549b);
                c0506o.d0(H10);
            }
            b((C2331P) H10, jVar, eVar, c0506o, (i10 << 3) & 1008);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new j0(jVar, eVar, i7, 9);
        }
    }

    public static final void b(C2331P c2331p, c0.m mVar, Rb.e eVar, C0506o c0506o, int i7) {
        int i10;
        c0506o.U(-511989831);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.i(c2331p) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.g(mVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0506o.i(eVar) ? 256 : 128;
        }
        if (c0506o.K(i10 & 1, (i10 & 147) != 146)) {
            int i11 = c0506o.f8449P;
            C0502m q10 = C0480b.q(c0506o);
            c0.m c10 = c0.o.c(c0506o, mVar);
            InterfaceC0493h0 m10 = c0506o.m();
            A0.C c11 = A0.C.f13a;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c11);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, c2331p.f26572c, c2331p);
            C0480b.s(c0506o, c2331p.f26573d, q10);
            C0480b.s(c0506o, c2331p.f26574e, eVar);
            InterfaceC0022k.g.getClass();
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0480b.s(c0506o, C0021j.f242c, c10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i11))) {
                c0506o.d0(Integer.valueOf(i11));
                c0506o.c(Integer.valueOf(i11), c0020i);
            }
            c0506o.p(true);
            if (c0506o.x()) {
                c0506o.S(-26267397);
                c0506o.p(false);
            } else {
                c0506o.S(-26326018);
                boolean i12 = c0506o.i(c2331p);
                Object H10 = c0506o.H();
                if (i12 || H10 == C0498k.f8409a) {
                    H10 = new A0.J(c2331p, 25);
                    c0506o.d0(H10);
                }
                C0480b.g((Rb.a) H10, c0506o);
                c0506o.p(false);
            }
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new Y.d(c2331p, mVar, eVar, i7, 2);
        }
    }

    public static final float c(long j, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final i0.c d(InterfaceC2345m interfaceC2345m) {
        InterfaceC2345m e2 = interfaceC2345m.e();
        return e2 != null ? e2.x(interfaceC2345m, true) : new i0.c(0.0f, 0.0f, (int) (interfaceC2345m.z() >> 32), (int) (interfaceC2345m.z() & 4294967295L));
    }

    public static final i0.c e(n0 n0Var) {
        InterfaceC2345m g = g(n0Var);
        float z8 = (int) (g.z() >> 32);
        float z10 = (int) (g.z() & 4294967295L);
        i0.c x2 = g.x(n0Var, true);
        float f4 = x2.f18174a;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > z8) {
            f4 = z8;
        }
        float f10 = x2.f18175b;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > z10) {
            f10 = z10;
        }
        float f11 = x2.f18176c;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 <= z8) {
            z8 = f11;
        }
        float f12 = x2.f18177d;
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        if (f13 <= z10) {
            z10 = f13;
        }
        if (f4 == z8 || f10 == z10) {
            return i0.c.f18173e;
        }
        long c10 = g.c((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        long c11 = g.c((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(z8) << 32));
        long c12 = g.c((Float.floatToRawIntBits(z8) << 32) | (Float.floatToRawIntBits(z10) & 4294967295L));
        long c13 = g.c((Float.floatToRawIntBits(z10) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (c10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c11 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (c13 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (c12 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (c10 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (c11 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (c13 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (c12 & 4294967295L));
        return new i0.c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean f(int i7, int i10) {
        return i7 == i10;
    }

    public static final InterfaceC2345m g(InterfaceC2345m interfaceC2345m) {
        InterfaceC2345m interfaceC2345m2;
        InterfaceC2345m e2 = interfaceC2345m.e();
        while (true) {
            InterfaceC2345m interfaceC2345m3 = e2;
            interfaceC2345m2 = interfaceC2345m;
            interfaceC2345m = interfaceC2345m3;
            if (interfaceC2345m == null) {
                break;
            }
            e2 = interfaceC2345m.e();
        }
        n0 n0Var = interfaceC2345m2 instanceof n0 ? (n0) interfaceC2345m2 : null;
        if (n0Var == null) {
            return interfaceC2345m2;
        }
        n0 n0Var2 = n0Var.f275B;
        while (true) {
            n0 n0Var3 = n0Var2;
            n0 n0Var4 = n0Var;
            n0Var = n0Var3;
            if (n0Var == null) {
                return n0Var4;
            }
            n0Var2 = n0Var.f275B;
        }
    }

    public static final U h(U u3) {
        A0.L l10 = u3.f124z.f293z;
        while (true) {
            A0.L t5 = l10.t();
            A0.L l11 = null;
            if ((t5 != null ? t5.f78v : null) == null) {
                U r02 = ((n0) l10.f60S.f227d).r0();
                kotlin.jvm.internal.l.b(r02);
                return r02;
            }
            A0.L t10 = l10.t();
            if (t10 != null) {
                l11 = t10.f78v;
            }
            kotlin.jvm.internal.l.b(l11);
            A0.L t11 = l10.t();
            kotlin.jvm.internal.l.b(t11);
            l10 = t11.f78v;
            kotlin.jvm.internal.l.b(l10);
        }
    }

    public static final long i(long j, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
