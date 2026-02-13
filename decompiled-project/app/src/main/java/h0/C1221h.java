package h0;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0011d;
import A0.C0018g0;
import A0.InterfaceC0024m;
import A0.L;
import B0.C0200s;
import B0.C0204u;
import B0.C0206v;
import B0.C0208w;
import B0.D;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import c0.l;
import d0.C1033a;
import d0.C1034b;
import h0.C1221h;
import h3.H;
import java.util.ArrayList;
import u.C2039B;
import u.C2042E;
import u.Q;
import x0.AbstractC2256a;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221h implements InterfaceC1220g {

    /* renamed from: a, reason: collision with root package name */
    public final C0206v f17604a;

    /* renamed from: b, reason: collision with root package name */
    public final C0200s f17605b;

    /* renamed from: c, reason: collision with root package name */
    public final C0208w f17606c;

    /* renamed from: d, reason: collision with root package name */
    public final C1229p f17607d = new C1229p(2, null, 6);

    /* renamed from: e, reason: collision with root package name */
    public final C1218e f17608e;

    /* renamed from: f, reason: collision with root package name */
    public final C1230q f17609f;
    public final FocusOwnerImpl$modifier$1 g;

    /* renamed from: h, reason: collision with root package name */
    public C2039B f17610h;

    /* renamed from: i, reason: collision with root package name */
    public final C2042E f17611i;
    public C1229p j;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, h0.q] */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C1221h(C0204u c0204u, C0206v c0206v, C0200s c0200s, C0208w c0208w) {
        this.f17604a = c0206v;
        this.f17605b = c0200s;
        this.f17606c = c0208w;
        this.f17608e = new C1218e(c0204u, new C0200s(0, this, C1221h.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 7), new E.k(0, 1, C1221h.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new C0208w(0, 1, C1221h.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        ?? obj = new Object();
        Q.b();
        this.f17609f = obj;
        this.g = new AbstractC0012d0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // A0.AbstractC0012d0
            public final l d() {
                return C1221h.this.f17607d;
            }

            @Override // A0.AbstractC0012d0
            public final /* bridge */ /* synthetic */ void e(l lVar) {
            }

            public final boolean equals(Object obj2) {
                return obj2 == this;
            }

            public final int hashCode() {
                return C1221h.this.f17607d.hashCode();
            }
        };
        this.f17611i = new C2042E(1);
    }

    public final boolean a(boolean z8) {
        C0018g0 c0018g0;
        C1229p c1229p = this.j;
        if (c1229p == null) {
            return true;
        }
        e(null);
        c1229p.p0(EnumC1228o.f17627a, EnumC1228o.f17630d);
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar = c1229p.f14113a.f14117e;
        L t5 = AbstractC0017g.t(c1229p);
        while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                while (lVar != null) {
                    if ((lVar.f14115c & 1024) != 0) {
                        S.e eVar = null;
                        c0.l lVar2 = lVar;
                        while (lVar2 != null) {
                            if (lVar2 instanceof C1229p) {
                                ((C1229p) lVar2).p0(EnumC1228o.f17628b, EnumC1228o.f17630d);
                            } else if ((lVar2.f14115c & 1024) != 0 && (lVar2 instanceof AbstractC0025n)) {
                                int i7 = 0;
                                for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                    if ((lVar3.f14115c & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            lVar2 = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new S.e(new c0.l[16]);
                                            }
                                            if (lVar2 != null) {
                                                eVar.b(lVar2);
                                                lVar2 = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            lVar2 = AbstractC0017g.e(eVar);
                        }
                    }
                    lVar = lVar.f14117e;
                }
            }
            t5 = t5.t();
            lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        return true;
    }

    public final boolean b(int i7, boolean z8, boolean z10) {
        boolean z11 = true;
        if (z8) {
            a(z8);
        } else {
            int ordinal = AbstractC1217d.t(this.f17607d, i7).ordinal();
            if (ordinal == 0) {
                a(z8);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new Db.d(1);
                }
                z11 = false;
            }
        }
        if (z11 && z10) {
            this.f17605b.invoke();
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x0172, B:36:0x0178, B:37:0x017b, B:39:0x0186, B:42:0x0194, B:46:0x019e, B:81:0x01a4, B:82:0x01a9, B:75:0x01e3, B:48:0x01ad, B:50:0x01b3, B:52:0x01b7, B:54:0x01bf, B:56:0x01c5, B:62:0x01cd, B:64:0x01d6, B:65:0x01da, B:60:0x01dd, B:84:0x01e8, B:87:0x01eb, B:89:0x01f1, B:96:0x01f5, B:101:0x01fe, B:103:0x0206, B:111:0x021d, B:113:0x0222, B:147:0x0226, B:142:0x0268, B:115:0x0232, B:117:0x0238, B:119:0x023c, B:121:0x0244, B:123:0x024a, B:129:0x0252, B:131:0x025b, B:132:0x025f, B:127:0x0262, B:153:0x026d, B:157:0x027d, B:159:0x0282, B:193:0x0286, B:188:0x02c8, B:161:0x0292, B:163:0x0298, B:165:0x029c, B:167:0x02a4, B:169:0x02aa, B:175:0x02b2, B:177:0x02bb, B:178:0x02bf, B:173:0x02c2, B:200:0x02cf, B:202:0x02d6, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007d, B:227:0x0087, B:262:0x00dc, B:264:0x00e0, B:229:0x008c, B:231:0x0092, B:233:0x0096, B:235:0x009e, B:237:0x00a4, B:243:0x00ac, B:245:0x00b5, B:246:0x00b9, B:241:0x00bc, B:252:0x00c2, B:266:0x00c7, B:269:0x00ca, B:271:0x00d0, B:278:0x00d4, B:283:0x00e6, B:285:0x00ec, B:286:0x00ef, B:288:0x00f9, B:291:0x0107, B:295:0x0111, B:330:0x0166, B:332:0x016a, B:297:0x0116, B:299:0x011c, B:301:0x0120, B:303:0x0128, B:305:0x012e, B:311:0x0136, B:313:0x013f, B:314:0x0143, B:309:0x0146, B:320:0x014c, B:335:0x0151, B:338:0x0154, B:340:0x015a, B:347:0x015e), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [S.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [S.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v36, types: [S.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [S.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(KeyEvent keyEvent, Rb.a aVar) {
        InterfaceC0024m interfaceC0024m;
        c0.l lVar;
        C0018g0 c0018g0;
        InterfaceC0024m interfaceC0024m2;
        C0018g0 c0018g02;
        int size;
        C0018g0 c0018g03;
        C1229p c1229p = this.f17607d;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f17608e.f17602f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!f(keyEvent)) {
                return false;
            }
            C1229p g = AbstractC1217d.g(c1229p);
            if (g != null) {
                if (!g.f14113a.f14112B) {
                    AbstractC2256a.b("visitLocalDescendants called on an unattached node");
                }
                c0.l lVar2 = g.f14113a;
                if ((lVar2.f14116d & 9216) != 0) {
                    lVar = null;
                    for (c0.l lVar3 = lVar2.f14118f; lVar3 != null; lVar3 = lVar3.f14118f) {
                        int i7 = lVar3.f14115c;
                        if ((i7 & 9216) != 0) {
                            if ((i7 & 1024) != 0) {
                                break;
                            }
                            lVar = lVar3;
                        }
                    }
                } else {
                    lVar = null;
                }
            }
            if (g != null) {
                if (!g.f14113a.f14112B) {
                    AbstractC2256a.b("visitAncestors called on an unattached node");
                }
                c0.l lVar4 = g.f14113a;
                L t5 = AbstractC0017g.t(g);
                loop11: while (true) {
                    if (t5 == null) {
                        interfaceC0024m2 = null;
                        break;
                    }
                    if ((((c0.l) t5.f60S.f229f).f14116d & 8192) != 0) {
                        while (lVar4 != null) {
                            if ((lVar4.f14115c & 8192) != 0) {
                                S.e eVar = null;
                                c0.l lVar5 = lVar4;
                                while (lVar5 != null) {
                                    if (lVar5 instanceof s0.c) {
                                        interfaceC0024m2 = lVar5;
                                        break loop11;
                                    }
                                    if ((lVar5.f14115c & 8192) != 0 && (lVar5 instanceof AbstractC0025n)) {
                                        c0.l lVar6 = ((AbstractC0025n) lVar5).f269D;
                                        int i10 = 0;
                                        lVar5 = lVar5;
                                        eVar = eVar;
                                        while (lVar6 != null) {
                                            if ((lVar6.f14115c & 8192) != 0) {
                                                i10++;
                                                eVar = eVar;
                                                if (i10 == 1) {
                                                    lVar5 = lVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new S.e(new c0.l[16]);
                                                    }
                                                    if (lVar5 != null) {
                                                        eVar.b(lVar5);
                                                        lVar5 = null;
                                                    }
                                                    eVar.b(lVar6);
                                                }
                                            }
                                            lVar6 = lVar6.f14118f;
                                            lVar5 = lVar5;
                                            eVar = eVar;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    lVar5 = AbstractC0017g.e(eVar);
                                }
                            }
                            lVar4 = lVar4.f14117e;
                        }
                    }
                    t5 = t5.t();
                    lVar4 = (t5 == null || (c0018g02 = t5.f60S) == null) ? null : (B0) c0018g02.f228e;
                }
                InterfaceC0024m interfaceC0024m3 = (s0.c) interfaceC0024m2;
                if (interfaceC0024m3 != null) {
                    lVar = ((c0.l) interfaceC0024m3).f14113a;
                    if (lVar != null) {
                        if (!lVar.f14113a.f14112B) {
                            AbstractC2256a.b("visitAncestors called on an unattached node");
                        }
                        c0.l lVar7 = lVar.f14113a.f14117e;
                        L t10 = AbstractC0017g.t(lVar);
                        ArrayList arrayList = null;
                        while (t10 != null) {
                            if ((((c0.l) t10.f60S.f229f).f14116d & 8192) != 0) {
                                while (lVar7 != null) {
                                    if ((lVar7.f14115c & 8192) != 0) {
                                        c0.l lVar8 = lVar7;
                                        S.e eVar2 = null;
                                        while (lVar8 != null) {
                                            if (lVar8 instanceof s0.c) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(lVar8);
                                            } else if ((lVar8.f14115c & 8192) != 0 && (lVar8 instanceof AbstractC0025n)) {
                                                int i11 = 0;
                                                for (c0.l lVar9 = ((AbstractC0025n) lVar8).f269D; lVar9 != null; lVar9 = lVar9.f14118f) {
                                                    if ((lVar9.f14115c & 8192) != 0) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            lVar8 = lVar9;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new S.e(new c0.l[16]);
                                                            }
                                                            if (lVar8 != null) {
                                                                eVar2.b(lVar8);
                                                                lVar8 = null;
                                                            }
                                                            eVar2.b(lVar9);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                            lVar8 = AbstractC0017g.e(eVar2);
                                        }
                                    }
                                    lVar7 = lVar7.f14117e;
                                }
                            }
                            t10 = t10.t();
                            lVar7 = (t10 == null || (c0018g03 = t10.f60S) == null) ? null : (B0) c0018g03.f228e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i12 = size - 1;
                                if (((s0.c) arrayList.get(size)).d(keyEvent)) {
                                    return true;
                                }
                                if (i12 < 0) {
                                    break;
                                }
                                size = i12;
                            }
                        }
                        AbstractC0025n abstractC0025n = lVar.f14113a;
                        ?? r12 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof s0.c) {
                                if (((s0.c) abstractC0025n).d(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC0025n.f14115c & 8192) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar10 = abstractC0025n.f269D;
                                int i13 = 0;
                                abstractC0025n = abstractC0025n;
                                r12 = r12;
                                while (lVar10 != null) {
                                    if ((lVar10.f14115c & 8192) != 0) {
                                        i13++;
                                        r12 = r12;
                                        if (i13 == 1) {
                                            abstractC0025n = lVar10;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r12.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r12.b(lVar10);
                                        }
                                    }
                                    lVar10 = lVar10.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r12 = r12;
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r12);
                        }
                        if (((Boolean) aVar.invoke()).booleanValue()) {
                            return true;
                        }
                        AbstractC0025n abstractC0025n2 = lVar.f14113a;
                        ?? r02 = 0;
                        while (abstractC0025n2 != 0) {
                            if (abstractC0025n2 instanceof s0.c) {
                                if (((s0.c) abstractC0025n2).C(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC0025n2.f14115c & 8192) != 0 && (abstractC0025n2 instanceof AbstractC0025n)) {
                                c0.l lVar11 = abstractC0025n2.f269D;
                                int i14 = 0;
                                r02 = r02;
                                abstractC0025n2 = abstractC0025n2;
                                while (lVar11 != null) {
                                    if ((lVar11.f14115c & 8192) != 0) {
                                        i14++;
                                        r02 = r02;
                                        if (i14 == 1) {
                                            abstractC0025n2 = lVar11;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n2 != 0) {
                                                r02.b(abstractC0025n2);
                                                abstractC0025n2 = 0;
                                            }
                                            r02.b(lVar11);
                                        }
                                    }
                                    lVar11 = lVar11.f14118f;
                                    r02 = r02;
                                    abstractC0025n2 = abstractC0025n2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            abstractC0025n2 = AbstractC0017g.e(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (((s0.c) arrayList.get(i15)).C(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!c1229p.f14113a.f14112B) {
                AbstractC2256a.b("visitAncestors called on an unattached node");
            }
            c0.l lVar12 = c1229p.f14113a.f14117e;
            L t11 = AbstractC0017g.t(c1229p);
            loop15: while (true) {
                if (t11 == null) {
                    interfaceC0024m = null;
                    break;
                }
                if ((((c0.l) t11.f60S.f229f).f14116d & 8192) != 0) {
                    while (lVar12 != null) {
                        if ((lVar12.f14115c & 8192) != 0) {
                            c0.l lVar13 = lVar12;
                            S.e eVar3 = null;
                            while (lVar13 != null) {
                                if (lVar13 instanceof s0.c) {
                                    interfaceC0024m = lVar13;
                                    break loop15;
                                }
                                if ((lVar13.f14115c & 8192) != 0 && (lVar13 instanceof AbstractC0025n)) {
                                    c0.l lVar14 = ((AbstractC0025n) lVar13).f269D;
                                    int i16 = 0;
                                    lVar13 = lVar13;
                                    eVar3 = eVar3;
                                    while (lVar14 != null) {
                                        if ((lVar14.f14115c & 8192) != 0) {
                                            i16++;
                                            eVar3 = eVar3;
                                            if (i16 == 1) {
                                                lVar13 = lVar14;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new S.e(new c0.l[16]);
                                                }
                                                if (lVar13 != null) {
                                                    eVar3.b(lVar13);
                                                    lVar13 = null;
                                                }
                                                eVar3.b(lVar14);
                                            }
                                        }
                                        lVar14 = lVar14.f14118f;
                                        lVar13 = lVar13;
                                        eVar3 = eVar3;
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                lVar13 = AbstractC0017g.e(eVar3);
                            }
                        }
                        lVar12 = lVar12.f14117e;
                    }
                }
                t11 = t11.t();
                lVar12 = (t11 == null || (c0018g0 = t11.f60S) == null) ? null : (B0) c0018g0.f228e;
            }
            InterfaceC0024m interfaceC0024m4 = (s0.c) interfaceC0024m;
            lVar = interfaceC0024m4 != null ? ((c0.l) interfaceC0024m4).f14113a : null;
            if (lVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0148, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [Rb.c] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [S.e] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v18, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v19, types: [Rb.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean d(int i7, i0.c cVar, Rb.c cVar2) {
        C1229p c1229p;
        C1229p c1229p2;
        C0018g0 c0018g0;
        boolean a9;
        C1226m c1226m;
        C1226m c1226m2;
        C1226m c1226m3;
        C1229p c1229p3 = this.f17607d;
        C1229p g = AbstractC1217d.g(c1229p3);
        C0208w c0208w = this.f17606c;
        int i10 = 4;
        if (g != null) {
            V0.l lVar = (V0.l) c0208w.get();
            C1224k q02 = g.q0();
            if (C1216c.a(i7, 1)) {
                c1226m2 = q02.f17616b;
            } else if (C1216c.a(i7, 2)) {
                c1226m2 = q02.f17617c;
            } else if (C1216c.a(i7, 5)) {
                c1226m2 = q02.f17618d;
            } else if (C1216c.a(i7, 6)) {
                c1226m2 = q02.f17619e;
            } else if (C1216c.a(i7, 3)) {
                int ordinal = lVar.ordinal();
                if (ordinal == 0) {
                    c1226m3 = q02.f17621h;
                } else {
                    if (ordinal != 1) {
                        throw new Db.d(1);
                    }
                    c1226m3 = q02.f17622i;
                }
                if (c1226m3 == C1226m.f17623b) {
                    c1226m3 = null;
                }
                c1226m2 = c1226m3 == null ? q02.f17620f : c1226m3;
            } else {
                if (C1216c.a(i7, 4)) {
                    int ordinal2 = lVar.ordinal();
                    if (ordinal2 == 0) {
                        c1226m = q02.f17622i;
                    } else {
                        if (ordinal2 != 1) {
                            throw new Db.d(1);
                        }
                        c1226m = q02.f17621h;
                    }
                    if (c1226m == C1226m.f17623b) {
                        c1226m = null;
                    }
                    if (c1226m == null) {
                        c1226m2 = q02.g;
                    }
                } else {
                    if (!(C1216c.a(i7, 7) ? true : C1216c.a(i7, 8))) {
                        throw new IllegalStateException("invalid FocusDirection");
                    }
                    C1214a c1214a = new C1214a(i7);
                    AbstractC1217d.o(g);
                    C1221h c1221h = (C1221h) ((D) AbstractC0017g.u(g)).getFocusOwner();
                    C1229p c1229p4 = c1221h.j;
                    if (C1216c.a(i7, 7)) {
                        q02.j.invoke(c1214a);
                    } else {
                        q02.k.invoke(c1214a);
                    }
                    c1226m = c1214a.f17590b ? C1226m.f17624c : c1229p4 != c1221h.j ? C1226m.f17625d : C1226m.f17623b;
                }
                c1226m2 = c1226m;
            }
            C1226m c1226m4 = C1226m.f17624c;
            if (kotlin.jvm.internal.l.a(c1226m2, c1226m4)) {
                return null;
            }
            c1229p = null;
            if (kotlin.jvm.internal.l.a(c1226m2, C1226m.f17625d)) {
                C1229p g2 = AbstractC1217d.g(c1229p3);
                if (g2 != null) {
                    return (Boolean) cVar2.invoke(g2);
                }
                return null;
            }
            C1226m c1226m5 = C1226m.f17623b;
            if (!kotlin.jvm.internal.l.a(c1226m2, c1226m5)) {
                c1226m2.getClass();
                if (c1226m2 == c1226m5) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                if (c1226m2 == c1226m4) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                S.e eVar = c1226m2.f17626a;
                int i11 = eVar.f8961c;
                if (i11 == 0) {
                    throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                }
                Object[] objArr = eVar.f8959a;
                boolean z8 = false;
                for (int i12 = 0; i12 < i11; i12++) {
                    C0011d c0011d = (C0011d) objArr[i12];
                    if (!c0011d.f14113a.f14112B) {
                        AbstractC2256a.b("visitChildren called on an unattached node");
                    }
                    S.e eVar2 = new S.e(new c0.l[16]);
                    c0.l lVar2 = c0011d.f14113a;
                    c0.l lVar3 = lVar2.f14118f;
                    if (lVar3 == null) {
                        AbstractC0017g.b(eVar2, lVar2);
                    } else {
                        eVar2.b(lVar3);
                    }
                    while (true) {
                        int i13 = eVar2.f8961c;
                        if (i13 != 0) {
                            c0.l lVar4 = (c0.l) eVar2.l(i13 - 1);
                            if ((lVar4.f14116d & 1024) == 0) {
                                AbstractC0017g.b(eVar2, lVar4);
                            } else {
                                while (true) {
                                    if (lVar4 == null) {
                                        break;
                                    }
                                    if ((lVar4.f14115c & 1024) != 0) {
                                        S.e eVar3 = null;
                                        while (lVar4 != null) {
                                            if (lVar4 instanceof C1229p) {
                                                C1229p c1229p5 = (C1229p) lVar4;
                                                if (c1229p5.q0().f17615a ? ((Boolean) cVar2.invoke(c1229p5)).booleanValue() : AbstractC1217d.i(c1229p5, 7, cVar2)) {
                                                    z8 = true;
                                                    break;
                                                }
                                            } else if (((lVar4.f14115c & 1024) != 0) && (lVar4 instanceof AbstractC0025n)) {
                                                int i14 = 0;
                                                for (c0.l lVar5 = ((AbstractC0025n) lVar4).f269D; lVar5 != null; lVar5 = lVar5.f14118f) {
                                                    if ((lVar5.f14115c & 1024) != 0) {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            lVar4 = lVar5;
                                                        } else {
                                                            if (eVar3 == null) {
                                                                eVar3 = new S.e(new c0.l[16]);
                                                            }
                                                            if (lVar4 != null) {
                                                                eVar3.b(lVar4);
                                                                lVar4 = null;
                                                            }
                                                            eVar3.b(lVar5);
                                                        }
                                                    }
                                                }
                                                if (i14 == 1) {
                                                }
                                            }
                                            lVar4 = AbstractC0017g.e(eVar3);
                                        }
                                    } else {
                                        lVar4 = lVar4.f14118f;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z8);
            }
        } else {
            c1229p = null;
            g = null;
        }
        V0.l lVar6 = (V0.l) c0208w.get();
        C.D d10 = new C.D(g, this, cVar2);
        if (C1216c.a(i7, 1) ? true : C1216c.a(i7, 2)) {
            if (C1216c.a(i7, 1)) {
                a9 = AbstractC1217d.k(c1229p3, d10);
            } else {
                if (!C1216c.a(i7, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a9 = AbstractC1217d.a(c1229p3, d10);
            }
            return Boolean.valueOf(a9);
        }
        if (C1216c.a(i7, 3) ? true : C1216c.a(i7, 4) ? true : C1216c.a(i7, 5) ? true : C1216c.a(i7, 6)) {
            return AbstractC1217d.F(i7, d10, c1229p3, cVar);
        }
        if (C1216c.a(i7, 7)) {
            int ordinal3 = lVar6.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new Db.d(1);
                }
                i10 = 3;
            }
            C1229p g10 = AbstractC1217d.g(c1229p3);
            return g10 != null ? AbstractC1217d.F(i10, d10, g10, cVar) : c1229p;
        }
        if (!C1216c.a(i7, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C1216c.b(i7))).toString());
        }
        C1229p g11 = AbstractC1217d.g(c1229p3);
        if (g11 != null) {
            if (!g11.f14113a.f14112B) {
                AbstractC2256a.b("visitAncestors called on an unattached node");
            }
            c0.l lVar7 = g11.f14113a.f14117e;
            L t5 = AbstractC0017g.t(g11);
            loop5: while (t5 != null) {
                if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                    while (lVar7 != null) {
                        if ((lVar7.f14115c & 1024) != 0) {
                            c0.l lVar8 = lVar7;
                            ?? r52 = c1229p;
                            while (lVar8 != null) {
                                if (lVar8 instanceof C1229p) {
                                    C1229p c1229p6 = (C1229p) lVar8;
                                    if (c1229p6.q0().f17615a) {
                                        c1229p2 = c1229p6;
                                        break loop5;
                                    }
                                } else if ((lVar8.f14115c & 1024) != 0 && (lVar8 instanceof AbstractC0025n)) {
                                    c0.l lVar9 = ((AbstractC0025n) lVar8).f269D;
                                    int i15 = 0;
                                    r52 = r52;
                                    while (lVar9 != null) {
                                        if ((lVar9.f14115c & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                lVar8 = lVar9;
                                            } else {
                                                r52 = r52 == 0 ? new S.e(new c0.l[16]) : r52;
                                                if (lVar8 != null) {
                                                    r52.b(lVar8);
                                                    lVar8 = c1229p;
                                                }
                                                r52.b(lVar9);
                                                lVar9 = lVar9.f14118f;
                                                r52 = r52;
                                            }
                                        }
                                        lVar9 = lVar9.f14118f;
                                        r52 = r52;
                                    }
                                    if (i15 != 1) {
                                        lVar8 = AbstractC0017g.e(r52);
                                    }
                                }
                                lVar8 = AbstractC0017g.e(r52);
                            }
                        }
                        lVar7 = lVar7.f14117e;
                    }
                }
                t5 = t5.t();
                lVar7 = (t5 == null || (c0018g0 = t5.f60S) == null) ? c1229p : (B0) c0018g0.f228e;
            }
        }
        c1229p2 = c1229p;
        return Boolean.valueOf((c1229p2 == null || c1229p2.equals(c1229p3)) ? false : ((Boolean) d10.invoke(c1229p2)).booleanValue());
    }

    public final void e(C1229p c1229p) {
        L t5;
        H0.i v10;
        L t10;
        H0.i v11;
        C1229p c1229p2 = this.j;
        this.j = c1229p;
        C2042E c2042e = this.f17611i;
        Object[] objArr = c2042e.f24584a;
        int i7 = c2042e.f24585b;
        for (int i10 = 0; i10 < i7; i10++) {
            C1034b c1034b = (C1034b) objArr[i10];
            c1034b.getClass();
            if (c1229p2 != null && (t10 = AbstractC0017g.t(c1229p2)) != null && (v11 = t10.v()) != null) {
                if (v11.f4494a.b(H0.h.g)) {
                    ((AutofillManager) c1034b.f16300a.f8927b).notifyViewExited(c1034b.f16302c, t10.f70b);
                }
            }
            if (c1229p != null && (t5 = AbstractC0017g.t(c1229p)) != null && (v10 = t5.v()) != null) {
                if (v10.f4494a.b(H0.h.g)) {
                    int i11 = t5.f70b;
                    c1034b.f16303d.f4955a.I(i11, new C1033a(c1034b, i11));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x034d, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r3 = r4.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r4.f24571e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (((r4.f24567a[r3 >> 3] >> ((r3 & 7) << r6)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r3 = r4.f24569c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r3 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        if (java.lang.Long.compare((r4.f24570d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        r3 = r4.f24567a;
        r5 = r4.f24569c;
        r12 = r4.f24568b;
        r13 = (r5 + 7) >> r6;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        if (r14 >= r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        r34 = r7;
        r6 = Eb.n.Y(r3);
        r7 = r6 - 1;
        r3[r7] = (r3[r7] & 72057594037927935L) | (-72057594037927936L);
        r3[r6] = r3[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011b, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        r7 = r6 >> 3;
        r18 = (r6 & 7) << 3;
        r8 = (r3[r7] >> r18) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0130, code lost:
    
        if (r8 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        if (r8 == 254) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013c, code lost:
    
        r8 = java.lang.Long.hashCode(r12[r6]) * (-862048943);
        r9 = (r8 ^ (r8 << 16)) >>> 7;
        r19 = r4.b(r9);
        r9 = r9 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
    
        if ((((r19 - r9) & r5) / 8) != (((r6 - r9) & r5) / 8)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0185, code lost:
    
        r9 = r19 >> 3;
        r13 = r3[r9];
        r26 = (r19 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        if (((r13 >> r26) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019b, code lost:
    
        r35 = r1;
        r37 = r10;
        r3[r9] = ((r8 & 127) << r26) | ((~(255 << r26)) & r13);
        r3[r7] = (r3[r7] & (~(255 << r18))) | (128 << r18);
        r12[r19] = r12[r6];
        r12[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01db, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r1 = r35;
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bf, code lost:
    
        r35 = r1;
        r37 = r10;
        r3[r9] = ((r8 & 127) << r26) | ((~(255 << r26)) & r13);
        r0 = r12[r19];
        r12[r19] = r12[r6];
        r12[r6] = r0;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015d, code lost:
    
        r3[r7] = ((r8 & 127) << r18) | (r3[r7] & (~(255 << r18)));
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f4, code lost:
    
        r35 = r1;
        r37 = r10;
        r4.f24571e = u.Q.a(r4.f24569c) - r4.f24570d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027c, code lost:
    
        r0 = r4.b(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0282, code lost:
    
        r4.f24570d++;
        r1 = r4.f24571e;
        r2 = r4.f24567a;
        r3 = r0 >> 3;
        r5 = r2[r3];
        r7 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029d, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029f, code lost:
    
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a1, code lost:
    
        r4.f24571e = r1 - r24;
        r1 = r4.f24569c;
        r5 = (r5 & (~(255 << r7))) | (r37 << r7);
        r2[r3] = r5;
        r2[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0207, code lost:
    
        r35 = r1;
        r34 = r7;
        r37 = r10;
        r0 = u.Q.c(r4.f24569c);
        r1 = r4.f24567a;
        r2 = r4.f24568b;
        r3 = r4.f24569c;
        r4.c(r0);
        r0 = r4.f24567a;
        r5 = r4.f24568b;
        r6 = r4.f24569c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
    
        if (r7 >= r3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0236, code lost:
    
        if (((r1[r7 >> 3] >> ((r7 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0238, code lost:
    
        r8 = r2[r7];
        r10 = java.lang.Long.hashCode(r8) * (-862048943);
        r10 = r10 ^ (r10 << 16);
        r11 = r4.b(r10 >>> 7);
        r12 = r10 & 127;
        r10 = r11 >> 3;
        r14 = (r11 & 7) << 3;
        r20 = r1;
        r21 = r2;
        r1 = (r0[r10] & (~(255 << r14))) | (r12 << r14);
        r0[r10] = r1;
        r0[(((r11 - 7) & r6) + (r6 & 7)) >> 3] = r1;
        r5[r11] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0275, code lost:
    
        r7 = r7 + 1;
        r1 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0271, code lost:
    
        r20 = r1;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b5, code lost:
    
        r35 = r1;
        r37 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0281, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x034b, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(KeyEvent keyEvent) {
        int i7;
        long j;
        int i10;
        long a9 = c2.q.a(keyEvent.getKeyCode());
        int w10 = H.w(keyEvent);
        int i11 = 1;
        int i12 = 3;
        int i13 = 0;
        if (com.bumptech.glide.d.l(w10, 2)) {
            C2039B c2039b = this.f17610h;
            if (c2039b == null) {
                c2039b = new C2039B(3);
                this.f17610h = c2039b;
            }
            C2039B c2039b2 = c2039b;
            int hashCode = Long.hashCode(a9) * (-862048943);
            int i14 = hashCode ^ (hashCode << 16);
            int i15 = i14 >>> 7;
            int i16 = i14 & 127;
            int i17 = c2039b2.f24569c;
            int i18 = i15 & i17;
            int i19 = 0;
            loop0: while (true) {
                long[] jArr = c2039b2.f24567a;
                int i20 = i18 >> 3;
                int i21 = (i18 & 7) << 3;
                long j10 = (jArr[i20] >>> i21) | ((jArr[i20 + i11] << (64 - i21)) & ((-i21) >> 63));
                long j11 = i16;
                long j12 = j10 ^ (j11 * 72340172838076673L);
                long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
                while (true) {
                    if (j13 == 0) {
                        break;
                    }
                    i10 = (i18 + (Long.numberOfTrailingZeros(j13) >> i12)) & i17;
                    if (c2039b2.f24568b[i10] == a9) {
                        j = a9;
                        break loop0;
                    }
                    j13 &= j13 - 1;
                }
                i19 += 8;
                i18 = (i18 + i19) & i17;
                a9 = a9;
                i11 = 1;
                i12 = 3;
            }
            c2039b2.f24568b[i10] = j;
        } else {
            if (!com.bumptech.glide.d.l(w10, 1)) {
                return true;
            }
            C2039B c2039b3 = this.f17610h;
            if (c2039b3 == null || !c2039b3.a(a9)) {
                return false;
            }
            C2039B c2039b4 = this.f17610h;
            if (c2039b4 != null) {
                int hashCode2 = Long.hashCode(a9) * (-862048943);
                int i22 = hashCode2 ^ (hashCode2 << 16);
                int i23 = i22 & 127;
                int i24 = c2039b4.f24569c;
                int i25 = i22 >>> 7;
                loop5: while (true) {
                    int i26 = i25 & i24;
                    long[] jArr2 = c2039b4.f24567a;
                    int i27 = i26 >> 3;
                    int i28 = (i26 & 7) << 3;
                    long j14 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
                    long j15 = (i23 * 72340172838076673L) ^ j14;
                    long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j16 == 0) {
                            break;
                        }
                        i7 = ((Long.numberOfTrailingZeros(j16) >> 3) + i26) & i24;
                        if (c2039b4.f24568b[i7] == a9) {
                            break loop5;
                        }
                        j16 &= j16 - 1;
                    }
                    i13 += 8;
                    i25 = i26 + i13;
                }
                if (i7 >= 0) {
                    c2039b4.f24570d--;
                    long[] jArr3 = c2039b4.f24567a;
                    int i29 = c2039b4.f24569c;
                    int i30 = i7 >> 3;
                    int i31 = (i7 & 7) << 3;
                    long j17 = (jArr3[i30] & (~(255 << i31))) | (254 << i31);
                    jArr3[i30] = j17;
                    jArr3[(((i7 - 7) & i29) + (i29 & 7)) >> 3] = j17;
                }
            }
        }
        return true;
    }
}
