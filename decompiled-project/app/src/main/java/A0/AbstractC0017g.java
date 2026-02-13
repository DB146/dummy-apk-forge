package A0;

import Q.AbstractC0499k0;
import Q.C0480b;
import android.view.View;
import x0.AbstractC2256a;
import y0.C2344l;

/* renamed from: A0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0017g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0013e f222a = new C0013e(0);

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f223b = new r0(1);

    public static final long a(float f4, boolean z8, boolean z10) {
        return (((z8 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final void b(S.e eVar, c0.l lVar) {
        S.e x2 = t(lVar).x();
        int i7 = x2.f8961c - 1;
        Object[] objArr = x2.f8959a;
        if (i7 < objArr.length) {
            while (i7 >= 0) {
                eVar.b((c0.l) ((L) objArr[i7]).f60S.f229f);
                i7--;
            }
        }
    }

    public static final int c(T t5, C2344l c2344l) {
        T U8 = t5.U();
        if (U8 == null) {
            AbstractC2256a.b("Child of " + t5 + " cannot be null when calculating alignment line");
        }
        if (t5.c0().a().containsKey(c2344l)) {
            Integer num = (Integer) t5.c0().a().get(c2344l);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int T10 = U8.T(c2344l);
        if (T10 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        U8.f114u = true;
        t5.f115v = true;
        t5.g0();
        U8.f114u = false;
        t5.f115v = false;
        return T10 + ((int) (c2344l instanceof C2344l ? U8.e0() & 4294967295L : U8.e0() >> 32));
    }

    public static final c0.l d(InterfaceC0024m interfaceC0024m, int i7) {
        c0.l lVar = ((c0.l) interfaceC0024m).f14113a.f14118f;
        if (lVar == null || (lVar.f14116d & i7) == 0) {
            return null;
        }
        while (lVar != null) {
            int i10 = lVar.f14115c;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & i7) != 0) {
                return lVar;
            }
            lVar = lVar.f14118f;
        }
        return null;
    }

    public static final c0.l e(S.e eVar) {
        int i7;
        if (eVar == null || (i7 = eVar.f8961c) == 0) {
            return null;
        }
        return (c0.l) eVar.l(i7 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0035y f(c0.l lVar) {
        if ((lVar.f14115c & 2) != 0) {
            if (lVar instanceof InterfaceC0035y) {
                return (InterfaceC0035y) lVar;
            }
            if (lVar instanceof AbstractC0025n) {
                c0.l lVar2 = ((AbstractC0025n) lVar).f269D;
                while (lVar2 != 0) {
                    if (lVar2 instanceof InterfaceC0035y) {
                        return (InterfaceC0035y) lVar2;
                    }
                    lVar2 = (!(lVar2 instanceof AbstractC0025n) || (lVar2.f14115c & 2) == 0) ? lVar2.f14118f : ((AbstractC0025n) lVar2).f269D;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j10) {
        boolean o10 = o(j);
        if (o10 != o(j10)) {
            return o10 ? -1 : 1;
        }
        int signum = (int) Math.signum(j(j) - j(j10));
        return (Math.min(j(j), j(j10)) >= 0.0f && n(j) != n(j10)) ? n(j) ? -1 : 1 : signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(InterfaceC0023l interfaceC0023l, AbstractC0499k0 abstractC0499k0) {
        if (!((c0.l) interfaceC0023l).f14113a.f14112B) {
            AbstractC2256a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        Y.j jVar = (Y.j) t(interfaceC0023l).f56O;
        jVar.getClass();
        return C0480b.p(jVar, abstractC0499k0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [A0.E0, A0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final E0 i(E0 e02) {
        C0018g0 c0018g0;
        c0.l lVar = (c0.l) e02;
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = lVar.f14113a.f14117e;
        L t5 = t(e02);
        while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f14115c & 262144) != 0) {
                        AbstractC0025n abstractC0025n = lVar2;
                        ?? r52 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof E0) {
                                E0 e03 = (E0) abstractC0025n;
                                if (kotlin.jvm.internal.l.a(e02.j(), e03.j()) && c0.o.a(e02, e03)) {
                                    return e03;
                                }
                            } else if ((abstractC0025n.f14115c & 262144) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar3 = abstractC0025n.f269D;
                                int i7 = 0;
                                abstractC0025n = abstractC0025n;
                                r52 = r52;
                                while (lVar3 != null) {
                                    if ((lVar3.f14115c & 262144) != 0) {
                                        i7++;
                                        r52 = r52;
                                        if (i7 == 1) {
                                            abstractC0025n = lVar3;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r52.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r52.b(lVar3);
                                        }
                                    }
                                    lVar3 = lVar3.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r52 = r52;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0025n = e(r52);
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        return null;
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(InterfaceC0026o interfaceC0026o) {
        if (((c0.l) interfaceC0026o).f14113a.f14112B) {
            r(interfaceC0026o, 1).A0();
        }
    }

    public static final void l(InterfaceC0035y interfaceC0035y) {
        t(interfaceC0035y).C();
    }

    public static final void m(A0 a02) {
        t(a02).D();
    }

    public static final boolean n(long j) {
        return (j & 2) != 0;
    }

    public static final boolean o(long j) {
        return (j & 1) != 0;
    }

    public static final boolean p(L l10) {
        if (l10.f78v != null) {
            L t5 = l10.t();
            if ((t5 != null ? t5.f78v : null) == null || l10.f61T.f94b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(c0.l lVar, Rb.a aVar) {
        q0 q0Var = lVar.f14119u;
        if (q0Var == null) {
            q0Var = new q0((p0) lVar);
            lVar.f14119u = q0Var;
        }
        ((B0.D) u(lVar)).getSnapshotObserver().a(q0Var, C0015f.f208f, aVar);
    }

    public static final n0 r(InterfaceC0024m interfaceC0024m, int i7) {
        n0 n0Var = ((c0.l) interfaceC0024m).f14113a.f14120v;
        kotlin.jvm.internal.l.b(n0Var);
        if (n0Var.t0() != interfaceC0024m || !o0.g(i7)) {
            return n0Var;
        }
        n0 n0Var2 = n0Var.f274A;
        kotlin.jvm.internal.l.b(n0Var2);
        return n0Var2;
    }

    public static final n0 s(InterfaceC0024m interfaceC0024m) {
        if (!((c0.l) interfaceC0024m).f14113a.f14112B) {
            AbstractC2256a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        n0 r10 = r(interfaceC0024m, 2);
        if (!r10.t0().f14112B) {
            AbstractC2256a.b("LayoutCoordinates is not attached.");
        }
        return r10;
    }

    public static final L t(InterfaceC0024m interfaceC0024m) {
        n0 n0Var = ((c0.l) interfaceC0024m).f14113a.f14120v;
        if (n0Var != null) {
            return n0Var.f293z;
        }
        throw X.c.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final t0 u(InterfaceC0024m interfaceC0024m) {
        B0.D d10 = t(interfaceC0024m).f44B;
        if (d10 != null) {
            return d10;
        }
        throw X.c.c("This node does not have an owner.");
    }

    public static final View v(InterfaceC0024m interfaceC0024m) {
        if (!((c0.l) interfaceC0024m).f14113a.f14112B) {
            AbstractC2256a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) O.a(t(interfaceC0024m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [A0.E0, A0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [Rb.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void w(E0 e02, Rb.c cVar) {
        C0018g0 c0018g0;
        c0.l lVar = (c0.l) e02;
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = lVar.f14113a.f14117e;
        L t5 = t(e02);
        while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f14115c & 262144) != 0) {
                        AbstractC0025n abstractC0025n = lVar2;
                        ?? r52 = 0;
                        while (abstractC0025n != 0) {
                            boolean z8 = true;
                            if (abstractC0025n instanceof E0) {
                                E0 e03 = (E0) abstractC0025n;
                                if (kotlin.jvm.internal.l.a(e02.j(), e03.j()) && c0.o.a(e02, e03)) {
                                    z8 = ((Boolean) cVar.invoke(e03)).booleanValue();
                                }
                                if (!z8) {
                                    return;
                                }
                            } else {
                                if (((abstractC0025n.f14115c & 262144) != 0) && (abstractC0025n instanceof AbstractC0025n)) {
                                    c0.l lVar3 = abstractC0025n.f269D;
                                    int i7 = 0;
                                    abstractC0025n = abstractC0025n;
                                    r52 = r52;
                                    while (lVar3 != null) {
                                        if ((lVar3.f14115c & 262144) != 0) {
                                            i7++;
                                            r52 = r52;
                                            if (i7 == 1) {
                                                abstractC0025n = lVar3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new S.e(new c0.l[16]);
                                                }
                                                if (abstractC0025n != 0) {
                                                    r52.b(abstractC0025n);
                                                    abstractC0025n = 0;
                                                }
                                                r52.b(lVar3);
                                            }
                                        }
                                        lVar3 = lVar3.f14118f;
                                        abstractC0025n = abstractC0025n;
                                        r52 = r52;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                            }
                            abstractC0025n = e(r52);
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [A0.E0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [Rb.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void x(E0 e02, Rb.c cVar) {
        c0.l lVar = (c0.l) e02;
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitSubtreeIf called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar2 = lVar.f14113a;
        c0.l lVar3 = lVar2.f14118f;
        if (lVar3 == null) {
            b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i7 = eVar.f8961c;
            if (i7 == 0) {
                return;
            }
            c0.l lVar4 = (c0.l) eVar.l(i7 - 1);
            if ((lVar4.f14116d & 262144) != 0) {
                for (c0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.f14118f) {
                    if ((lVar5.f14115c & 262144) != 0) {
                        AbstractC0025n abstractC0025n = lVar5;
                        ?? r72 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof E0) {
                                E0 e03 = (E0) abstractC0025n;
                                D0 d02 = (kotlin.jvm.internal.l.a(e02.j(), e03.j()) && c0.o.a(e02, e03)) ? (D0) cVar.invoke(e03) : D0.f16a;
                                if (d02 == D0.f18c) {
                                    return;
                                }
                                if (d02 == D0.f17b) {
                                    break;
                                }
                            } else if ((abstractC0025n.f14115c & 262144) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar6 = abstractC0025n.f269D;
                                int i10 = 0;
                                abstractC0025n = abstractC0025n;
                                r72 = r72;
                                while (lVar6 != null) {
                                    if ((lVar6.f14115c & 262144) != 0) {
                                        i10++;
                                        r72 = r72;
                                        if (i10 == 1) {
                                            abstractC0025n = lVar6;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r72.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r72.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r72 = r72;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0025n = e(r72);
                        }
                    }
                }
            }
            b(eVar, lVar4);
        }
    }
}
