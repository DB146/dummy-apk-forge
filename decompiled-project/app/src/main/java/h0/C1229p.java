package h0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0011d;
import A0.C0018g0;
import A0.InterfaceC0023l;
import A0.InterfaceC0024m;
import A0.K;
import A0.L;
import A0.p0;
import B0.AbstractC0207v0;
import B0.C0200s;
import B0.C0206v;
import B0.D;
import android.os.Trace;
import kotlin.jvm.internal.v;
import r0.C1911a;
import r0.C1913c;
import r0.InterfaceC1912b;
import x0.AbstractC2256a;
import z0.InterfaceC2581c;

/* renamed from: h0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229p extends c0.l implements InterfaceC0023l, p0, InterfaceC2581c, InterfaceC0024m {

    /* renamed from: C, reason: collision with root package name */
    public final Rb.e f17632C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17633D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17634E;

    /* renamed from: F, reason: collision with root package name */
    public final int f17635F;

    public C1229p(int i7, C0206v c0206v, int i10) {
        i7 = (i10 & 1) != 0 ? 1 : i7;
        this.f17632C = (i10 & 2) != 0 ? null : c0206v;
        this.f17635F = i7;
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // c0.l
    public final void h0() {
    }

    @Override // c0.l
    public final void i0() {
        int ordinal = r0().ordinal();
        if (ordinal == 0 || (ordinal != 1 && ordinal == 2)) {
            C1221h c1221h = (C1221h) ((D) AbstractC0017g.u(this)).getFocusOwner();
            c1221h.b(8, true, false);
            C1218e c1218e = c1221h.f17608e;
            if (c1218e.f17602f) {
                return;
            }
            c1218e.f17597a.invoke(new C0200s(0, c1218e, C1218e.class, "invalidateNodes", "invalidateNodes()V", 0, 6));
            c1218e.f17602f = true;
        }
    }

    public final void p0(EnumC1228o enumC1228o, EnumC1228o enumC1228o2) {
        C0018g0 c0018g0;
        Rb.e eVar;
        C1221h c1221h = (C1221h) ((D) AbstractC0017g.u(this)).getFocusOwner();
        C1229p c1229p = c1221h.j;
        if (!enumC1228o.equals(enumC1228o2) && (eVar = this.f17632C) != null) {
            eVar.invoke(enumC1228o, enumC1228o2);
        }
        c0.l lVar = this.f14113a;
        if (!lVar.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = this.f14113a;
        L t5 = AbstractC0017g.t(this);
        while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 5120) != 0) {
                while (lVar2 != null) {
                    int i7 = lVar2.f14115c;
                    if ((i7 & 5120) != 0) {
                        if (lVar2 != lVar && (i7 & 1024) != 0) {
                            return;
                        }
                        if ((i7 & 4096) != 0) {
                            c0.l lVar3 = lVar2;
                            S.e eVar2 = null;
                            while (lVar3 != null) {
                                if (lVar3 instanceof C0011d) {
                                    C0011d c0011d = (C0011d) lVar3;
                                    if (c1229p == c1221h.j) {
                                        c0011d.q0();
                                        throw null;
                                    }
                                } else if ((lVar3.f14115c & 4096) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                    int i10 = 0;
                                    for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                        if ((lVar4.f14115c & 4096) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lVar3 = lVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new S.e(new c0.l[16]);
                                                }
                                                if (lVar3 != null) {
                                                    eVar2.b(lVar3);
                                                    lVar3 = null;
                                                }
                                                eVar2.b(lVar4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lVar3 = AbstractC0017g.e(eVar2);
                            }
                        } else {
                            continue;
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
    /* JADX WARN: Type inference failed for: r0v0, types: [h0.i, h0.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [h0.l] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [S.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [S.e] */
    public final C1224k q0() {
        boolean z8;
        C0018g0 c0018g0;
        ?? obj = new Object();
        obj.f17615a = true;
        C1226m c1226m = C1226m.f17623b;
        obj.f17616b = c1226m;
        obj.f17617c = c1226m;
        obj.f17618d = c1226m;
        obj.f17619e = c1226m;
        obj.f17620f = c1226m;
        obj.g = c1226m;
        obj.f17621h = c1226m;
        obj.f17622i = c1226m;
        obj.j = C1223j.f17612b;
        obj.k = C1223j.f17613c;
        int i7 = this.f17635F;
        if (i7 == 1) {
            z8 = true;
        } else if (i7 == 0) {
            z8 = !(((C1911a) ((C1913c) ((InterfaceC1912b) AbstractC0017g.h(this, AbstractC0207v0.f1996m))).f23645a.getValue()).f23644a == 1);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z8 = false;
        }
        obj.f17615a = z8;
        c0.l lVar = this.f14113a;
        if (!lVar.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = this.f14113a;
        L t5 = AbstractC0017g.t(this);
        loop0: while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 3072) != 0) {
                while (lVar2 != null) {
                    int i10 = lVar2.f14115c;
                    if ((i10 & 3072) != 0) {
                        if (lVar2 != lVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            AbstractC0025n abstractC0025n = lVar2;
                            ?? r82 = 0;
                            while (abstractC0025n != 0) {
                                if (abstractC0025n instanceof InterfaceC1225l) {
                                    ((InterfaceC1225l) abstractC0025n).x(obj);
                                } else if ((abstractC0025n.f14115c & 2048) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                    c0.l lVar3 = abstractC0025n.f269D;
                                    int i11 = 0;
                                    abstractC0025n = abstractC0025n;
                                    r82 = r82;
                                    while (lVar3 != null) {
                                        if ((lVar3.f14115c & 2048) != 0) {
                                            i11++;
                                            r82 = r82;
                                            if (i11 == 1) {
                                                abstractC0025n = lVar3;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new S.e(new c0.l[16]);
                                                }
                                                if (abstractC0025n != 0) {
                                                    r82.b(abstractC0025n);
                                                    abstractC0025n = 0;
                                                }
                                                r82.b(lVar3);
                                            }
                                        }
                                        lVar3 = lVar3.f14118f;
                                        abstractC0025n = abstractC0025n;
                                        r82 = r82;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC0025n = AbstractC0017g.e(r82);
                            }
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        return obj;
    }

    public final EnumC1228o r0() {
        C1221h c1221h;
        C1229p c1229p;
        C0018g0 c0018g0;
        if (this.f14112B && (c1229p = (c1221h = (C1221h) ((D) AbstractC0017g.u(this)).getFocusOwner()).j) != null) {
            if (this == c1229p) {
                c1221h.getClass();
                return EnumC1228o.f17627a;
            }
            if (c1229p.f14112B) {
                if (!c1229p.f14113a.f14112B) {
                    AbstractC2256a.b("visitAncestors called on an unattached node");
                }
                c0.l lVar = c1229p.f14113a.f14117e;
                L t5 = AbstractC0017g.t(c1229p);
                while (t5 != null) {
                    if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                        while (lVar != null) {
                            if ((lVar.f14115c & 1024) != 0) {
                                c0.l lVar2 = lVar;
                                S.e eVar = null;
                                while (lVar2 != null) {
                                    if (lVar2 instanceof C1229p) {
                                        if (this == ((C1229p) lVar2)) {
                                            return EnumC1228o.f17628b;
                                        }
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
            }
            return EnumC1228o.f17630d;
        }
        return EnumC1228o.f17630d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public final void s0() {
        int ordinal = r0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            ?? obj = new Object();
            AbstractC0017g.q(this, new K((v) obj, this, 12));
            Object obj2 = obj.f19134a;
            if (obj2 == null) {
                kotlin.jvm.internal.l.j("focusProperties");
                throw null;
            }
            if (((InterfaceC1222i) obj2).b()) {
                return;
            }
            ((C1221h) ((D) AbstractC0017g.u(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean t0(int i7) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z8 = false;
            if (!q0().f17615a) {
                Trace.endSection();
                return false;
            }
            int ordinal = AbstractC1217d.v(this, i7).ordinal();
            if (ordinal == 0) {
                z8 = AbstractC1217d.w(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z8 = true;
                } else if (ordinal != 3) {
                    throw new Db.d(1);
                }
            }
            return z8;
        } finally {
            Trace.endSection();
        }
    }

    @Override // A0.p0
    public final void z() {
        s0();
    }
}
