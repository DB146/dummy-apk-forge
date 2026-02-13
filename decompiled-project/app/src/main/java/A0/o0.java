package A0;

import B0.C0200s;
import F.C0261e;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import h0.C1218e;
import h0.C1221h;
import h0.C1229p;
import h0.InterfaceC1225l;
import u.C2041D;
import u0.C2086p;
import w.C2183j;
import w0.C2195a;
import x0.AbstractC2256a;
import y.C2289K;
import z0.InterfaceC2581c;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2041D f294a;

    static {
        C2041D c2041d = u.N.f24629a;
        f294a = new C2041D();
    }

    public static final void a(c0.l lVar, int i7, int i10) {
        if (!(lVar instanceof AbstractC0025n)) {
            b(lVar, i7 & lVar.f14115c, i10);
            return;
        }
        AbstractC0025n abstractC0025n = (AbstractC0025n) lVar;
        b(lVar, abstractC0025n.f268C & i7, i10);
        int i11 = (~abstractC0025n.f268C) & i7;
        for (c0.l lVar2 = abstractC0025n.f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
            a(lVar2, i11, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c0.l lVar, int i7, int i10) {
        if (i10 != 0 || lVar.e0()) {
            if ((i7 & 2) != 0 && (lVar instanceof InterfaceC0035y)) {
                AbstractC0017g.l((InterfaceC0035y) lVar);
                if (i10 == 2) {
                    n0 r10 = AbstractC0017g.r(lVar, 2);
                    r10.f276C = true;
                    r10.f290R.invoke();
                    if (r10.f292T != null) {
                        r10.M0(null, false);
                        r10.f293z.R(false);
                    }
                }
            }
            if ((i7 & 128) != 0 && (lVar instanceof InterfaceC0034x) && i10 != 2) {
                AbstractC0017g.t(lVar).C();
            }
            if ((i7 & 256) != 0 && (lVar instanceof InterfaceC0027p) && i10 != 2) {
                L t5 = AbstractC0017g.t(lVar);
                if (!t5.p() && !t5.q() && !t5.f71b0) {
                    B0.D d10 = (B0.D) O.a(t5);
                    ((S.e) d10.f1621d0.f161e.f23391b).b(t5);
                    t5.f71b0 = true;
                    d10.F(null);
                }
            }
            if ((i7 & 4) != 0 && (lVar instanceof InterfaceC0026o)) {
                AbstractC0017g.k((InterfaceC0026o) lVar);
            }
            if ((i7 & 8) != 0 && (lVar instanceof A0)) {
                AbstractC0017g.t(lVar).f48F = true;
            }
            if ((i7 & 64) != 0 && (lVar instanceof w0)) {
                P p10 = AbstractC0017g.t((w0) lVar).f61T;
                p10.f105p.f172D = true;
                Y y10 = p10.f106q;
                if (y10 != null) {
                    y10.f142I = true;
                }
            }
            if ((i7 & 2048) != 0 && (lVar instanceof InterfaceC1225l)) {
                InterfaceC1225l interfaceC1225l = (InterfaceC1225l) lVar;
                C0019h.f233b = null;
                interfaceC1225l.x(C0019h.f232a);
                if (C0019h.f233b != null) {
                    c0.l lVar2 = (c0.l) interfaceC1225l;
                    if (!lVar2.f14113a.f14112B) {
                        AbstractC2256a.b("visitChildren called on an unattached node");
                    }
                    S.e eVar = new S.e(new c0.l[16]);
                    c0.l lVar3 = lVar2.f14113a;
                    c0.l lVar4 = lVar3.f14118f;
                    if (lVar4 == null) {
                        AbstractC0017g.b(eVar, lVar3);
                    } else {
                        eVar.b(lVar4);
                    }
                    while (true) {
                        int i11 = eVar.f8961c;
                        if (i11 == 0) {
                            break;
                        }
                        c0.l lVar5 = (c0.l) eVar.l(i11 - 1);
                        if ((lVar5.f14116d & 1024) == 0) {
                            AbstractC0017g.b(eVar, lVar5);
                        } else {
                            while (true) {
                                if (lVar5 == null) {
                                    break;
                                }
                                if ((lVar5.f14115c & 1024) != 0) {
                                    S.e eVar2 = null;
                                    while (lVar5 != null) {
                                        if (lVar5 instanceof C1229p) {
                                            C1229p c1229p = (C1229p) lVar5;
                                            C1218e c1218e = ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).f17608e;
                                            if (c1218e.f17600d.a(c1229p) && !c1218e.f17602f) {
                                                c1218e.f17597a.invoke(new C0200s(0, c1218e, C1218e.class, "invalidateNodes", "invalidateNodes()V", 0, 6));
                                                c1218e.f17602f = true;
                                            }
                                        } else if ((lVar5.f14115c & 1024) != 0 && (lVar5 instanceof AbstractC0025n)) {
                                            int i12 = 0;
                                            for (c0.l lVar6 = ((AbstractC0025n) lVar5).f269D; lVar6 != null; lVar6 = lVar6.f14118f) {
                                                if ((lVar6.f14115c & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        lVar5 = lVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new S.e(new c0.l[16]);
                                                        }
                                                        if (lVar5 != null) {
                                                            eVar2.b(lVar5);
                                                            lVar5 = null;
                                                        }
                                                        eVar2.b(lVar6);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        lVar5 = AbstractC0017g.e(eVar2);
                                    }
                                } else {
                                    lVar5 = lVar5.f14118f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i7 & 4096) == 0 || !(lVar instanceof C0011d)) {
                return;
            }
            C0011d c0011d = (C0011d) lVar;
            C1218e c1218e2 = ((C1221h) ((B0.D) AbstractC0017g.u(c0011d)).getFocusOwner()).f17608e;
            if (!c1218e2.f17601e.a(c0011d) || c1218e2.f17602f) {
                return;
            }
            c1218e2.f17597a.invoke(new C0200s(0, c1218e2, C1218e.class, "invalidateNodes", "invalidateNodes()V", 0, 6));
            c1218e2.f17602f = true;
        }
    }

    public static final void c(c0.l lVar) {
        if (!lVar.f14112B) {
            AbstractC2256a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(lVar, -1, 0);
    }

    public static final int d(c0.k kVar) {
        int i7 = kVar instanceof C2289K ? 5 : 1;
        if (kVar instanceof AppendedSemanticsElement) {
            i7 |= 8;
        }
        if (kVar instanceof C2086p) {
            i7 |= 16;
        }
        if (kVar instanceof C.v) {
            i7 |= 32;
        }
        if (kVar instanceof C0261e) {
            i7 |= 256;
        }
        if (kVar instanceof C2183j) {
            i7 |= 64;
        }
        return kVar instanceof E0.a ? i7 | 524288 : i7;
    }

    public static final int e(c0.l lVar) {
        int i7 = lVar.f14115c;
        if (i7 != 0) {
            return i7;
        }
        Class<?> cls = lVar.getClass();
        C2041D c2041d = f294a;
        int d10 = c2041d.d(cls);
        if (d10 >= 0) {
            return c2041d.f24580c[d10];
        }
        int i10 = lVar instanceof InterfaceC0035y ? 3 : 1;
        if (lVar instanceof InterfaceC0026o) {
            i10 |= 4;
        }
        if (lVar instanceof A0) {
            i10 |= 8;
        }
        if (lVar instanceof y0) {
            i10 |= 16;
        }
        if (lVar instanceof InterfaceC2581c) {
            i10 |= 32;
        }
        if (lVar instanceof w0) {
            i10 |= 64;
        }
        if (lVar instanceof InterfaceC0034x) {
            i10 |= 128;
        }
        if (lVar instanceof InterfaceC0027p) {
            i10 |= 256;
        }
        if (lVar instanceof C1229p) {
            i10 |= 1024;
        }
        if (lVar instanceof InterfaceC1225l) {
            i10 |= 2048;
        }
        if (lVar instanceof C0011d) {
            i10 |= 4096;
        }
        if (lVar instanceof s0.c) {
            i10 |= 8192;
        }
        if (lVar instanceof C2195a) {
            i10 |= 16384;
        }
        if (lVar instanceof InterfaceC0023l) {
            i10 |= 32768;
        }
        if (lVar instanceof E0) {
            i10 |= 262144;
        }
        int i11 = lVar instanceof E0.a ? 524288 | i10 : i10;
        c2041d.g(i11, cls);
        return i11;
    }

    public static final int f(c0.l lVar) {
        if (!(lVar instanceof AbstractC0025n)) {
            return e(lVar);
        }
        AbstractC0025n abstractC0025n = (AbstractC0025n) lVar;
        int i7 = abstractC0025n.f268C;
        for (c0.l lVar2 = abstractC0025n.f269D; lVar2 != null; lVar2 = lVar2.f14118f) {
            i7 |= f(lVar2);
        }
        return i7;
    }

    public static final boolean g(int i7) {
        return (i7 & 128) != 0;
    }
}
