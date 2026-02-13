package androidx.compose.animation;

import A0.C0021j;
import A0.InterfaceC0022k;
import B0.C0170c0;
import C.S;
import C9.h;
import Db.q;
import Q.C0480b;
import Q.C0487e0;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q.J0;
import Q.W;
import Rb.e;
import Rb.f;
import V0.k;
import a0.C0676c;
import c0.d;
import c0.j;
import c0.m;
import ea.C1111f;
import h3.o;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import w.AbstractC2173C;
import w.C2171A;
import w.C2172B;
import w.C2176c;
import w.C2180g;
import w.C2188o;
import w.C2189p;
import w.C2191s;
import w.C2193u;
import w.C2194v;
import w.H;
import w.I;
import w.J;
import w.N;
import w.V;
import w.r;
import w.x;
import w.y;
import x.AbstractC2232b;
import x.C2253x;
import x.Q;
import x.b0;
import x.i0;
import x.n0;
import x.p0;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(i0 i0Var, Rb.c cVar, m mVar, H h10, I i7, e eVar, Y.e eVar2, C0506o c0506o, int i10) {
        int i11;
        Object obj;
        boolean z8;
        V v10;
        V v11;
        H h11;
        b0 b0Var;
        b0 b0Var2;
        V v12;
        boolean z10;
        boolean z11;
        boolean z12;
        b0 b0Var3;
        b0 b0Var4;
        b0 b0Var5;
        b0 b0Var6;
        b0 b0Var7;
        b0 b0Var8;
        boolean i12;
        Object H10;
        boolean h12;
        Object H11;
        Object H12;
        int i13;
        c0506o.U(-891967166);
        if ((i10 & 6) == 0) {
            i11 = (c0506o.g(i0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0506o.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0506o.g(mVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0506o.g(h10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0506o.g(i7) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0506o.i(eVar) ? 131072 : 65536;
        }
        int i14 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i14 |= c0506o.i(eVar2) ? 8388608 : 4194304;
        }
        int i15 = i14;
        if (c0506o.K(i15 & 1, (i15 & 4793491) != 4793490)) {
            boolean booleanValue = ((Boolean) cVar.invoke(i0Var.f26102d.getValue())).booleanValue();
            h hVar = i0Var.f26099a;
            if (booleanValue || ((Boolean) cVar.invoke(hVar.l())).booleanValue() || i0Var.g() || i0Var.d()) {
                c0506o.S(1788522886);
                int i16 = i15 & 14;
                int i17 = i16 | 48;
                int i18 = i17 & 14;
                boolean z13 = ((i18 ^ 6) > 4 && c0506o.g(i0Var)) || (i17 & 6) == 4;
                Object H13 = c0506o.H();
                Object obj2 = C0498k.f8409a;
                if (z13 || H13 == obj2) {
                    H13 = hVar.l();
                    c0506o.d0(H13);
                }
                if (i0Var.g()) {
                    H13 = hVar.l();
                }
                c0506o.S(-466616829);
                x d10 = d(i0Var, cVar, H13, c0506o);
                c0506o.p(false);
                Object value = i0Var.f26102d.getValue();
                c0506o.S(-466616829);
                x d11 = d(i0Var, cVar, value, c0506o);
                c0506o.p(false);
                int i19 = i18 | 3072;
                Object obj3 = n0.f26126a;
                int i20 = (i19 & 14) ^ 6;
                boolean z14 = (i20 > 4 && c0506o.g(i0Var)) || (i19 & 6) == 4;
                Object H14 = c0506o.H();
                if (z14 || H14 == obj2) {
                    H14 = new i0(new C2253x(d10), i0Var, o.p(new StringBuilder(), i0Var.f26101c, " > EnterExitTransition"));
                    c0506o.d0(H14);
                }
                i0 i0Var2 = (i0) H14;
                boolean g = ((i20 > 4 && c0506o.g(i0Var)) || (i19 & 6) == 4) | c0506o.g(i0Var2);
                Object H15 = c0506o.H();
                if (g || H15 == obj2) {
                    H15 = new C0170c0(28, i0Var, i0Var2);
                    c0506o.d0(H15);
                }
                C0480b.c(i0Var2, (Rb.c) H15, c0506o);
                if (i0Var.g()) {
                    i0Var2.k(d10, d11);
                } else {
                    i0Var2.p(d11);
                    i0Var2.k.setValue(Boolean.FALSE);
                }
                W r10 = C0480b.r(eVar, c0506o);
                Object l10 = i0Var2.f26099a.l();
                C0487e0 c0487e0 = i0Var2.f26102d;
                Object invoke = eVar.invoke(l10, c0487e0.getValue());
                boolean g2 = c0506o.g(i0Var2) | c0506o.g(r10);
                Object H16 = c0506o.H();
                if (g2 || H16 == obj2) {
                    H16 = new r(i0Var2, r10, null);
                    c0506o.d0(H16);
                }
                e eVar3 = (e) H16;
                Object H17 = c0506o.H();
                if (H17 == obj2) {
                    H17 = C0480b.o(invoke);
                    c0506o.d0(H17);
                }
                W w10 = (W) H17;
                q qVar = q.f3365a;
                boolean i21 = c0506o.i(eVar3);
                Object H18 = c0506o.H();
                if (i21 || H18 == obj2) {
                    H18 = new J0(eVar3, w10, null);
                    c0506o.d0(H18);
                }
                C0480b.e(c0506o, (e) H18, qVar);
                h hVar2 = i0Var2.f26099a;
                Object l11 = hVar2.l();
                x xVar = x.f25627c;
                if (l11 == xVar && c0487e0.getValue() == xVar && ((Boolean) w10.getValue()).booleanValue()) {
                    c0506o.S(1790688794);
                    c0506o.p(false);
                    z8 = false;
                } else {
                    c0506o.S(1789551931);
                    boolean z15 = i16 == 4;
                    Object H19 = c0506o.H();
                    if (z15 || H19 == obj2) {
                        H19 = new C2193u();
                        c0506o.d0(H19);
                    }
                    C2193u c2193u = (C2193u) H19;
                    C1111f c1111f = AbstractC2173C.f25487a;
                    C2171A c2171a = C2171A.f25484a;
                    boolean g10 = c0506o.g(i0Var2);
                    Object H20 = c0506o.H();
                    if (g10 || H20 == obj2) {
                        H20 = C0480b.o(h10);
                        c0506o.d0(H20);
                    }
                    W w11 = (W) H20;
                    if (hVar2.l() == c0487e0.getValue() && hVar2.l() == x.f25626b) {
                        if (i0Var2.g()) {
                            w11.setValue(h10);
                        } else {
                            w11.setValue(H.f25509b);
                        }
                    } else if (c0487e0.getValue() == x.f25626b) {
                        w11.setValue(((H) w11.getValue()).a(h10));
                    }
                    H h13 = (H) w11.getValue();
                    boolean g11 = c0506o.g(i0Var2);
                    Object H21 = c0506o.H();
                    if (g11 || H21 == obj2) {
                        H21 = C0480b.o(i7);
                        c0506o.d0(H21);
                    }
                    W w12 = (W) H21;
                    if (hVar2.l() == c0487e0.getValue() && hVar2.l() == x.f25626b) {
                        if (i0Var2.g()) {
                            w12.setValue(i7);
                        } else {
                            w12.setValue(I.f25511b);
                        }
                    } else if (c0487e0.getValue() != x.f25626b) {
                        w12.setValue(((I) w12.getValue()).a(i7));
                    }
                    I i22 = (I) w12.getValue();
                    V v13 = h13.f25510a;
                    V v14 = i22.f25513a;
                    boolean z16 = (v13.f25541b == null && v14.f25541b == null) ? false : true;
                    c0506o.S(-821053656);
                    c0506o.p(false);
                    if (z16) {
                        c0506o.S(-820961865);
                        C1111f c1111f2 = p0.f26147h;
                        Object H22 = c0506o.H();
                        if (H22 == obj2) {
                            H22 = "Built-in shrink/expand";
                            c0506o.d0("Built-in shrink/expand");
                        }
                        obj = obj2;
                        v10 = v14;
                        v11 = v13;
                        h11 = h13;
                        z8 = false;
                        b0 a9 = n0.a(i0Var2, c1111f2, (String) H22, c0506o, 384, 0);
                        c0506o.p(false);
                        b0Var = a9;
                    } else {
                        obj = obj2;
                        z8 = false;
                        v10 = v14;
                        v11 = v13;
                        h11 = h13;
                        c0506o.S(-820851041);
                        c0506o.p(false);
                        b0Var = null;
                    }
                    if (z16) {
                        c0506o.S(-820777446);
                        C1111f c1111f3 = p0.g;
                        Object H23 = c0506o.H();
                        if (H23 == obj) {
                            H23 = "Built-in InterruptionHandlingOffset";
                            c0506o.d0("Built-in InterruptionHandlingOffset");
                        }
                        b0 a10 = n0.a(i0Var2, c1111f3, (String) H23, c0506o, 384, 0);
                        c0506o.p(z8);
                        b0Var2 = a10;
                    } else {
                        c0506o.S(-820608001);
                        c0506o.p(z8);
                        b0Var2 = null;
                    }
                    boolean z17 = !z16;
                    if (v11.f25540a == null) {
                        v12 = v10;
                        if (v12.f25540a == null) {
                            z10 = z8;
                            z11 = (v11.f25542c == null || v12.f25542c != null) ? true : z8;
                            if (z10) {
                                z12 = z17;
                                c0506o.S(-674857617);
                                c0506o.p(z8);
                                b0Var3 = null;
                            } else {
                                c0506o.S(-675026101);
                                C1111f c1111f4 = p0.f26141a;
                                Object H24 = c0506o.H();
                                if (H24 == obj) {
                                    H24 = "Built-in alpha";
                                    c0506o.d0("Built-in alpha");
                                }
                                z12 = z17;
                                b0 a11 = n0.a(i0Var2, c1111f4, (String) H24, c0506o, 384, 0);
                                c0506o.p(z8);
                                b0Var3 = a11;
                            }
                            if (z11) {
                                b0Var4 = b0Var3;
                                c0506o.S(-674621521);
                                c0506o.p(z8);
                                b0Var5 = null;
                            } else {
                                c0506o.S(-674790005);
                                C1111f c1111f5 = p0.f26141a;
                                Object H25 = c0506o.H();
                                if (H25 == obj) {
                                    H25 = "Built-in scale";
                                    c0506o.d0("Built-in scale");
                                }
                                b0Var4 = b0Var3;
                                b0 a12 = n0.a(i0Var2, c1111f5, (String) H25, c0506o, 384, 0);
                                c0506o.p(z8);
                                b0Var5 = a12;
                            }
                            if (z11) {
                                b0Var6 = b0Var5;
                                c0506o.S(-674372529);
                                c0506o.p(z8);
                                b0Var7 = b0Var4;
                                b0Var8 = null;
                            } else {
                                c0506o.S(-674543896);
                                b0Var6 = b0Var5;
                                b0Var8 = n0.a(i0Var2, AbstractC2173C.f25487a, "TransformOriginInterruptionHandling", c0506o, 384, 0);
                                c0506o.p(z8);
                                b0Var7 = b0Var4;
                            }
                            H h14 = h11;
                            i12 = c0506o.i(b0Var7) | c0506o.g(h14) | c0506o.g(i22) | c0506o.i(b0Var6) | c0506o.g(i0Var2) | c0506o.i(b0Var8);
                            H10 = c0506o.H();
                            if (!i12 || H10 == obj) {
                                H10 = new y(b0Var7, b0Var6, i0Var2, h14, i22, b0Var8);
                                c0506o.d0(H10);
                            }
                            y yVar = (y) H10;
                            j jVar = j.f14110a;
                            boolean z18 = z12;
                            h12 = c0506o.h(z18) | c0506o.g(c2171a);
                            H11 = c0506o.H();
                            if (!h12 || H11 == obj) {
                                H11 = new C2172B(z18, c2171a);
                                c0506o.d0(H11);
                            }
                            m c10 = androidx.compose.ui.graphics.a.a((Rb.c) H11).c(new EnterExitTransitionElement(i0Var2, b0Var, b0Var2, h14, i22, c2171a, yVar));
                            c0506o.S(1581779440);
                            c0506o.p(z8);
                            m c11 = mVar.c(c10.c(jVar));
                            H12 = c0506o.H();
                            if (H12 == obj) {
                                H12 = new C2188o(c2193u);
                                c0506o.d0(H12);
                            }
                            C2188o c2188o = (C2188o) H12;
                            i13 = c0506o.f8449P;
                            InterfaceC0493h0 m10 = c0506o.m();
                            m c12 = c0.o.c(c0506o, c11);
                            InterfaceC0022k.g.getClass();
                            Rb.a aVar = C0021j.f241b;
                            c0506o.W();
                            if (c0506o.f8448O) {
                                c0506o.g0();
                            } else {
                                c0506o.l(aVar);
                            }
                            C0480b.s(c0506o, C0021j.f244e, c2188o);
                            C0480b.s(c0506o, C0021j.f243d, m10);
                            e eVar4 = C0021j.f245f;
                            if (!c0506o.f8448O || !l.a(c0506o.H(), Integer.valueOf(i13))) {
                                c0506o.d0(Integer.valueOf(i13));
                                c0506o.c(Integer.valueOf(i13), eVar4);
                            }
                            C0480b.s(c0506o, C0021j.f242c, c12);
                            eVar2.a(c2193u, c0506o, Integer.valueOf((i15 >> 18) & 112));
                            c0506o.p(true);
                            c0506o.p(z8);
                        }
                    } else {
                        v12 = v10;
                    }
                    z10 = true;
                    if (v11.f25542c == null) {
                    }
                    if (z10) {
                    }
                    if (z11) {
                    }
                    if (z11) {
                    }
                    H h142 = h11;
                    i12 = c0506o.i(b0Var7) | c0506o.g(h142) | c0506o.g(i22) | c0506o.i(b0Var6) | c0506o.g(i0Var2) | c0506o.i(b0Var8);
                    H10 = c0506o.H();
                    if (!i12) {
                    }
                    H10 = new y(b0Var7, b0Var6, i0Var2, h142, i22, b0Var8);
                    c0506o.d0(H10);
                    y yVar2 = (y) H10;
                    j jVar2 = j.f14110a;
                    boolean z182 = z12;
                    h12 = c0506o.h(z182) | c0506o.g(c2171a);
                    H11 = c0506o.H();
                    if (!h12) {
                    }
                    H11 = new C2172B(z182, c2171a);
                    c0506o.d0(H11);
                    m c102 = androidx.compose.ui.graphics.a.a((Rb.c) H11).c(new EnterExitTransitionElement(i0Var2, b0Var, b0Var2, h142, i22, c2171a, yVar2));
                    c0506o.S(1581779440);
                    c0506o.p(z8);
                    m c112 = mVar.c(c102.c(jVar2));
                    H12 = c0506o.H();
                    if (H12 == obj) {
                    }
                    C2188o c2188o2 = (C2188o) H12;
                    i13 = c0506o.f8449P;
                    InterfaceC0493h0 m102 = c0506o.m();
                    m c122 = c0.o.c(c0506o, c112);
                    InterfaceC0022k.g.getClass();
                    Rb.a aVar2 = C0021j.f241b;
                    c0506o.W();
                    if (c0506o.f8448O) {
                    }
                    C0480b.s(c0506o, C0021j.f244e, c2188o2);
                    C0480b.s(c0506o, C0021j.f243d, m102);
                    e eVar42 = C0021j.f245f;
                    if (!c0506o.f8448O) {
                    }
                    c0506o.d0(Integer.valueOf(i13));
                    c0506o.c(Integer.valueOf(i13), eVar42);
                    C0480b.s(c0506o, C0021j.f242c, c122);
                    eVar2.a(c2193u, c0506o, Integer.valueOf((i15 >> 18) & 112));
                    c0506o.p(true);
                    c0506o.p(z8);
                }
                c0506o.p(z8);
            } else {
                c0506o.S(1790694746);
                c0506o.p(false);
            }
        } else {
            c0506o.N();
        }
        C0505n0 r11 = c0506o.r();
        if (r11 != null) {
            r11.f8432d = new C2189p(i0Var, cVar, mVar, h10, i7, eVar, eVar2, i10);
        }
    }

    public static final void b(boolean z8, j jVar, H h10, I i7, String str, Y.e eVar, C0506o c0506o, int i10) {
        j jVar2;
        H h11;
        I i11;
        String str2;
        c0506o.U(1766503102);
        int i12 = i10 | (c0506o.h(z8) ? 32 : 16) | 224640;
        if (c0506o.K(i12 & 1, (599185 & i12) != 599184)) {
            j jVar3 = j.f14110a;
            d dVar = c0.b.f14099y;
            H a9 = AbstractC2173C.a(null, 3);
            long j = 1;
            Q j10 = AbstractC2232b.j(1, new k((j & 4294967295L) | (j << 32)));
            C2176c c2176c = C2176c.f25554v;
            d dVar2 = c0.b.f14098x;
            boolean a10 = l.a(dVar, dVar2);
            c0.e eVar2 = c0.b.f14093e;
            c0.e eVar3 = c0.b.f14096v;
            c0.e eVar4 = c0.b.f14090b;
            H a11 = a9.a(new H(new V((J) null, new C2194v(a10 ? eVar4 : l.a(dVar, dVar) ? eVar3 : eVar2, new C0676c(c2176c, 1), j10), (N) null, (LinkedHashMap) null, 59)));
            long j11 = 1;
            I a12 = AbstractC2173C.b(null, 3).a(new I(new V((J) null, new C2194v(l.a(dVar, dVar2) ? eVar4 : l.a(dVar, dVar) ? eVar3 : eVar2, new C0676c(C2176c.f25555w, 2), AbstractC2232b.j(1, new k((j11 & 4294967295L) | (j11 << 32)))), (N) null, (LinkedHashMap) null, 59)));
            str2 = "AnimatedVisibility";
            c(n0.b(Boolean.valueOf(z8), "AnimatedVisibility", c0506o, ((i12 >> 3) & 14) | 48), a11, a12, eVar, c0506o, 224688);
            jVar2 = jVar3;
            h11 = a11;
            i11 = a12;
        } else {
            c0506o.N();
            jVar2 = jVar;
            h11 = h10;
            i11 = i7;
            str2 = str;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C2191s(z8, jVar2, h11, i11, str2, eVar, i10);
        }
    }

    public static final void c(i0 i0Var, H h10, I i7, Y.e eVar, C0506o c0506o, int i10) {
        int i11;
        C2176c c2176c = C2176c.f25550d;
        Object obj = j.f14110a;
        c0506o.U(429978603);
        if ((i10 & 6) == 0) {
            i11 = (c0506o.g(i0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0506o.i(c2176c) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0506o.g(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0506o.g(h10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0506o.g(i7) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i11 |= c0506o.i(eVar) ? 131072 : 65536;
        }
        if (c0506o.K(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z8 = (i12 == 32) | (i13 == 4);
            Object H10 = c0506o.H();
            if (z8 || H10 == C0498k.f8409a) {
                H10 = new S(i0Var, 2);
                c0506o.d0(H10);
            }
            a(i0Var, c2176c, androidx.compose.ui.layout.a.a((f) H10), h10, i7, C2180g.f25576c, eVar, c0506o, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new N.m(i0Var, h10, i7, eVar, i10);
        }
    }

    public static final x d(i0 i0Var, Rb.c cVar, Object obj, C0506o c0506o) {
        x xVar;
        c0506o.O(i0Var, -902032957, 0, null);
        boolean g = i0Var.g();
        h hVar = i0Var.f26099a;
        if (g) {
            c0506o.S(2101770115);
            c0506o.p(false);
            xVar = ((Boolean) cVar.invoke(obj)).booleanValue() ? x.f25626b : ((Boolean) cVar.invoke(hVar.l())).booleanValue() ? x.f25627c : x.f25625a;
        } else {
            c0506o.S(2102044248);
            Object H10 = c0506o.H();
            if (H10 == C0498k.f8409a) {
                H10 = C0480b.o(Boolean.FALSE);
                c0506o.d0(H10);
            }
            W w10 = (W) H10;
            if (((Boolean) cVar.invoke(hVar.l())).booleanValue()) {
                w10.setValue(Boolean.TRUE);
            }
            xVar = ((Boolean) cVar.invoke(obj)).booleanValue() ? x.f25626b : ((Boolean) w10.getValue()).booleanValue() ? x.f25627c : x.f25625a;
            c0506o.p(false);
        }
        c0506o.p(false);
        return xVar;
    }
}
