package h0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0018g0;
import A0.J;
import A0.L;
import A0.n0;
import C.C0234t;
import C.D;
import E.A;
import E.s;
import E.t;
import F.C0266j;
import F.C0267k;
import F.C0269m;
import F.C0270n;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import h3.H;
import ia.C1358d;
import java.util.Arrays;
import x0.AbstractC2256a;
import y0.AbstractC2328M;
import y0.AbstractC2338f;
import z.V;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1217d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17596a = new int[2];

    /* JADX WARN: Type inference failed for: r13v45, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final Object A(C1229p c1229p, int i7, Rb.c cVar) {
        int i10;
        int i11;
        Object obj;
        c0.l lVar;
        int max;
        int i12;
        C0018g0 c0018g0;
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = c1229p.f14113a.f14117e;
        L t5 = AbstractC0017g.t(c1229p);
        loop0: while (true) {
            i10 = 1;
            i11 = 0;
            obj = null;
            if (t5 == null) {
                lVar = null;
                break;
            }
            if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f14115c & 1024) != 0) {
                        lVar = lVar2;
                        S.e eVar = null;
                        while (lVar != null) {
                            if (lVar instanceof C1229p) {
                                break loop0;
                            }
                            if ((lVar.f14115c & 1024) != 0 && (lVar instanceof AbstractC0025n)) {
                                int i13 = 0;
                                for (c0.l lVar3 = ((AbstractC0025n) lVar).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                    if ((lVar3.f14115c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            lVar = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new S.e(new c0.l[16]);
                                            }
                                            if (lVar != null) {
                                                eVar.b(lVar);
                                                lVar = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            lVar = AbstractC0017g.e(eVar);
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        C1229p c1229p2 = (C1229p) lVar;
        if (c1229p2 != null) {
            C1358d c1358d = AbstractC2338f.f26582a;
            if (kotlin.jvm.internal.l.a((C0270n) c1229p2.w(c1358d), (C0270n) c1229p.w(c1358d))) {
                return null;
            }
        }
        C0270n c0270n = (C0270n) c1229p.w(AbstractC2338f.f26582a);
        if (c0270n == null) {
            return null;
        }
        int i14 = 5;
        if (!C1216c.a(i7, 5)) {
            i14 = 6;
            if (!C1216c.a(i7, 6)) {
                i14 = 3;
                if (!C1216c.a(i7, 3)) {
                    i14 = 4;
                    if (!C1216c.a(i7, 4)) {
                        if (C1216c.a(i7, 1)) {
                            i14 = 2;
                        } else {
                            if (!C1216c.a(i7, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i14 = 1;
                        }
                    }
                }
            }
        }
        if (c0270n.f3985C.f3406a.d().f3479n <= 0 || c0270n.f3985C.f3406a.d().k.isEmpty() || !c0270n.f14112B) {
            return cVar.invoke(C0270n.f3984F);
        }
        if (c0270n.q0(i14)) {
            E.e eVar2 = c0270n.f3985C;
            max = Math.min(eVar2.f3406a.d().f3479n - 1, ((t) Eb.o.e0(eVar2.f3406a.d().k)).f3483a);
        } else {
            max = Math.max(0, c0270n.f3985C.f3406a.f3372d.b());
        }
        ?? obj2 = new Object();
        C0267k c0267k = c0270n.f3986D;
        c0267k.getClass();
        C0266j c0266j = new C0266j(max, max);
        c0267k.f3980a.b(c0266j);
        obj2.f19134a = c0266j;
        A a9 = c0270n.f3985C.f3406a;
        if (a9.d().k.isEmpty()) {
            i10 = 0;
        } else {
            s d10 = a9.d();
            int e2 = (int) (d10.f3480o == V.f27943a ? d10.e() & 4294967295L : d10.e() >> 32);
            s d11 = a9.d();
            ?? r72 = d11.k;
            int size = r72.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                i15 += ((t) r72.get(i16)).f3492m;
            }
            int size2 = (i15 / r72.size()) + d11.f3482q;
            if (size2 != 0 && (i12 = e2 / size2) >= 1) {
                i10 = i12;
            }
        }
        int i17 = i10 * 2;
        int i18 = c0270n.f3985C.f3406a.d().f3479n;
        if (i17 > i18) {
            i17 = i18;
        }
        while (obj == null && c0270n.p0((C0266j) obj2.f19134a, i14) && i11 < i17) {
            C0266j c0266j2 = (C0266j) obj2.f19134a;
            int i19 = c0266j2.f3978a;
            boolean q02 = c0270n.q0(i14);
            int i20 = c0266j2.f3979b;
            if (q02) {
                i20++;
            } else {
                i19--;
            }
            C0267k c0267k2 = c0270n.f3986D;
            c0267k2.getClass();
            C0266j c0266j3 = new C0266j(i19, i20);
            c0267k2.f3980a.b(c0266j3);
            c0270n.f3986D.f3980a.k((C0266j) obj2.f19134a);
            obj2.f19134a = c0266j3;
            i11++;
            AbstractC0017g.t(c0270n).l();
            obj = cVar.invoke(new C0269m(c0270n, obj2, i14));
        }
        c0270n.f3986D.f3980a.k((C0266j) obj2.f19134a);
        AbstractC0017g.t(c0270n).l();
        return obj;
    }

    public static final boolean B(int i7, D d10, C1229p c1229p, i0.c cVar) {
        C1229p h10;
        S.e eVar = new S.e(new C1229p[16]);
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar2 = new S.e(new c0.l[16]);
        c0.l lVar = c1229p.f14113a;
        c0.l lVar2 = lVar.f14118f;
        if (lVar2 == null) {
            AbstractC0017g.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i10 = eVar2.f8961c;
            if (i10 == 0) {
                break;
            }
            c0.l lVar3 = (c0.l) eVar2.l(i10 - 1);
            if ((lVar3.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar2, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f14115c & 1024) != 0) {
                        S.e eVar3 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof C1229p) {
                                C1229p c1229p2 = (C1229p) lVar3;
                                if (c1229p2.f14112B) {
                                    eVar.b(c1229p2);
                                }
                            } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i11 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new S.e(new c0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar3.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar3.b(lVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVar3 = AbstractC0017g.e(eVar3);
                        }
                    } else {
                        lVar3 = lVar3.f14118f;
                    }
                }
            }
        }
        while (eVar.f8961c != 0 && (h10 = h(eVar, cVar, i7)) != null) {
            if (h10.q0().f17615a) {
                return ((Boolean) d10.invoke(h10)).booleanValue();
            }
            if (l(i7, d10, h10, cVar)) {
                return true;
            }
            eVar.k(h10);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean C(C1229p c1229p, C1229p c1229p2, int i7, D d10) {
        c0.l lVar;
        C0018g0 c0018g0;
        if (c1229p.r0() != EnumC1228o.f17628b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        C1229p[] c1229pArr = new C1229p[16];
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar2 = c1229p.f14113a;
        c0.l lVar3 = lVar2.f14118f;
        if (lVar3 == null) {
            AbstractC0017g.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f8961c;
            lVar = null;
            if (i11 == 0) {
                break;
            }
            c0.l lVar4 = (c0.l) eVar.l(i11 - 1);
            if ((lVar4.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar, lVar4);
            } else {
                while (true) {
                    if (lVar4 == null) {
                        break;
                    }
                    if ((lVar4.f14115c & 1024) != 0) {
                        S.e eVar2 = null;
                        while (lVar4 != null) {
                            if (lVar4 instanceof C1229p) {
                                C1229p c1229p3 = (C1229p) lVar4;
                                int i12 = i10 + 1;
                                if (c1229pArr.length < i12) {
                                    int length = c1229pArr.length;
                                    ?? r11 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(c1229pArr, 0, r11, 0, length);
                                    c1229pArr = r11;
                                }
                                c1229pArr[i10] = c1229p3;
                                i10 = i12;
                            } else if ((lVar4.f14115c & 1024) != 0 && (lVar4 instanceof AbstractC0025n)) {
                                int i13 = 0;
                                for (c0.l lVar5 = ((AbstractC0025n) lVar4).f269D; lVar5 != null; lVar5 = lVar5.f14118f) {
                                    if ((lVar5.f14115c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            lVar4 = lVar5;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new S.e(new c0.l[16]);
                                            }
                                            if (lVar4 != null) {
                                                eVar2.b(lVar4);
                                                lVar4 = null;
                                            }
                                            eVar2.b(lVar5);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            lVar4 = AbstractC0017g.e(eVar2);
                        }
                    } else {
                        lVar4 = lVar4.f14118f;
                    }
                }
            }
        }
        Arrays.sort(c1229pArr, 0, i10, C1231r.f17636a);
        if (C1216c.a(i7, 1)) {
            Xb.g I6 = H.I(0, i10);
            int i14 = I6.f11025a;
            int i15 = I6.f11026b;
            if (i14 <= i15) {
                boolean z8 = false;
                while (true) {
                    if (z8) {
                        C1229p c1229p4 = c1229pArr[i14];
                        if (s(c1229p4) && k(c1229p4, d10)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(c1229pArr[i14], c1229p2)) {
                        z8 = true;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            if (!C1216c.a(i7, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            Xb.g I10 = H.I(0, i10);
            int i16 = I10.f11025a;
            int i17 = I10.f11026b;
            if (i16 <= i17) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        C1229p c1229p5 = c1229pArr[i17];
                        if (s(c1229p5) && a(c1229p5, d10)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(c1229pArr[i17], c1229p2)) {
                        z10 = true;
                    }
                    if (i17 == i16) {
                        break;
                    }
                    i17--;
                }
            }
        }
        if (!C1216c.a(i7, 1) && c1229p.q0().f17615a) {
            if (!c1229p.f14113a.f14112B) {
                AbstractC2256a.b("visitAncestors called on an unattached node");
            }
            c0.l lVar6 = c1229p.f14113a.f14117e;
            L t5 = AbstractC0017g.t(c1229p);
            loop5: while (true) {
                if (t5 == null) {
                    break;
                }
                if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                    while (lVar6 != null) {
                        if ((lVar6.f14115c & 1024) != 0) {
                            c0.l lVar7 = lVar6;
                            S.e eVar3 = null;
                            while (lVar7 != null) {
                                if (lVar7 instanceof C1229p) {
                                    lVar = lVar7;
                                    break loop5;
                                }
                                if ((lVar7.f14115c & 1024) != 0 && (lVar7 instanceof AbstractC0025n)) {
                                    int i18 = 0;
                                    for (c0.l lVar8 = ((AbstractC0025n) lVar7).f269D; lVar8 != null; lVar8 = lVar8.f14118f) {
                                        if ((lVar8.f14115c & 1024) != 0) {
                                            i18++;
                                            if (i18 == 1) {
                                                lVar7 = lVar8;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new S.e(new c0.l[16]);
                                                }
                                                if (lVar7 != null) {
                                                    eVar3.b(lVar7);
                                                    lVar7 = null;
                                                }
                                                eVar3.b(lVar8);
                                            }
                                        }
                                    }
                                    if (i18 == 1) {
                                    }
                                }
                                lVar7 = AbstractC0017g.e(eVar3);
                            }
                        }
                        lVar6 = lVar6.f14117e;
                    }
                }
                t5 = t5.t();
                lVar6 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
            }
            if (lVar != null) {
                return ((Boolean) d10.invoke(c1229p)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer D(int i7) {
        if (C1216c.a(i7, 5)) {
            return 33;
        }
        if (C1216c.a(i7, 6)) {
            return 130;
        }
        if (C1216c.a(i7, 3)) {
            return 17;
        }
        if (C1216c.a(i7, 4)) {
            return 66;
        }
        if (C1216c.a(i7, 1)) {
            return 2;
        }
        return C1216c.a(i7, 2) ? 1 : null;
    }

    public static final C1216c E(int i7) {
        if (i7 == 1) {
            return new C1216c(2);
        }
        if (i7 == 2) {
            return new C1216c(1);
        }
        if (i7 == 17) {
            return new C1216c(3);
        }
        if (i7 == 33) {
            return new C1216c(5);
        }
        if (i7 == 66) {
            return new C1216c(4);
        }
        if (i7 != 130) {
            return null;
        }
        return new C1216c(6);
    }

    public static final Boolean F(int i7, D d10, C1229p c1229p, i0.c cVar) {
        int ordinal = c1229p.r0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1229p n6 = n(c1229p);
                if (n6 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n6.r0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean F10 = F(i7, d10, n6, cVar);
                        if (!kotlin.jvm.internal.l.a(F10, Boolean.FALSE)) {
                            return F10;
                        }
                        if (cVar == null) {
                            if (n6.r0() != EnumC1228o.f17628b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C1229p g = g(n6);
                            if (g == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = j(g);
                        }
                        return Boolean.valueOf(l(i7, d10, c1229p, cVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new Db.d(1);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = j(n6);
                }
                return Boolean.valueOf(l(i7, d10, c1229p, cVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c1229p.q0().f17615a ? (Boolean) d10.invoke(c1229p) : cVar == null ? Boolean.valueOf(i(c1229p, i7, d10)) : Boolean.valueOf(B(i7, d10, c1229p, cVar));
                }
                throw new Db.d(1);
            }
        }
        return Boolean.valueOf(i(c1229p, i7, d10));
    }

    public static final boolean a(C1229p c1229p, D d10) {
        int ordinal = c1229p.r0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1229p n6 = n(c1229p);
                if (n6 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n6.r0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new Db.d(1);
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(n6, d10) && !m(c1229p, n6, 2, d10) && (!n6.q0().f17615a || !((Boolean) d10.invoke(n6)).booleanValue())) {
                        return false;
                    }
                }
                return m(c1229p, n6, 2, d10);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new Db.d(1);
                }
                if (!x(c1229p, d10)) {
                    if (!(c1229p.q0().f17615a ? ((Boolean) d10.invoke(c1229p)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return x(c1229p, d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (h0.C1216c.a(r20, 3) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (h0.C1216c.a(r20, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (h0.C1216c.a(r20, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r18.f18176c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r1 >= 0.0f) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (h0.C1216c.a(r20, 3) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (r0 >= 1.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r1 >= r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (h0.C1216c.a(r20, 4) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (h0.C1216c.a(r20, 5) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (h0.C1216c.a(r20, 6) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (h0.C1216c.a(r20, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        r1 = r18.f18174a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        if (h0.C1216c.a(r20, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        r1 = r5 - r18.f18177d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        if (h0.C1216c.a(r20, 6) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        r1 = r18.f18175b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c0, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(i0.c cVar, i0.c cVar2, i0.c cVar3, int i7) {
        if (!c(i7, cVar3, cVar) && c(i7, cVar2, cVar)) {
            boolean a9 = C1216c.a(i7, 3);
            float f4 = cVar3.f18175b;
            float f10 = cVar3.f18177d;
            float f11 = cVar3.f18174a;
            float f12 = cVar3.f18176c;
            float f13 = cVar.f18177d;
            float f14 = cVar.f18175b;
            float f15 = cVar.f18176c;
            float f16 = cVar.f18174a;
            if (!a9) {
                if (!C1216c.a(i7, 4)) {
                    if (!C1216c.a(i7, 5)) {
                        if (!C1216c.a(i7, 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i7, i0.c cVar, i0.c cVar2) {
        if (C1216c.a(i7, 3) ? true : C1216c.a(i7, 4)) {
            if (cVar.f18177d > cVar2.f18175b && cVar.f18175b < cVar2.f18177d) {
                return true;
            }
        } else {
            if (!(C1216c.a(i7, 5) ? true : C1216c.a(i7, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (cVar.f18176c > cVar2.f18174a && cVar.f18174a < cVar2.f18176c) {
                return true;
            }
        }
        return false;
    }

    public static final i0.c d(View view, B0.D d10) {
        int[] iArr = f17596a;
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        d10.getLocationInWindow(iArr);
        float f4 = i7 - iArr[0];
        float f10 = i10 - iArr[1];
        return new i0.c(f4, f10, view.getWidth() + f4, view.getHeight() + f10);
    }

    public static final boolean e(C1229p c1229p, boolean z8) {
        int ordinal = c1229p.r0().ordinal();
        if (ordinal == 0) {
            ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).e(null);
            c1229p.p0(EnumC1228o.f17627a, EnumC1228o.f17630d);
        } else if (ordinal == 1) {
            C1229p n6 = n(c1229p);
            if (!(n6 != null ? e(n6, z8) : true)) {
                return false;
            }
            c1229p.p0(EnumC1228o.f17628b, EnumC1228o.f17630d);
        } else {
            if (ordinal == 2) {
                if (!z8) {
                    return z8;
                }
                ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).e(null);
                c1229p.p0(EnumC1228o.f17629c, EnumC1228o.f17630d);
                return z8;
            }
            if (ordinal != 3) {
                throw new Db.d(1);
            }
        }
        return true;
    }

    public static final void f(C1229p c1229p, S.e eVar) {
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar2 = new S.e(new c0.l[16]);
        c0.l lVar = c1229p.f14113a;
        c0.l lVar2 = lVar.f14118f;
        if (lVar2 == null) {
            AbstractC0017g.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i7 = eVar2.f8961c;
            if (i7 == 0) {
                return;
            }
            c0.l lVar3 = (c0.l) eVar2.l(i7 - 1);
            if ((lVar3.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar2, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f14115c & 1024) != 0) {
                        S.e eVar3 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof C1229p) {
                                C1229p c1229p2 = (C1229p) lVar3;
                                if (c1229p2.f14112B && !AbstractC0017g.t(c1229p2).f73c0) {
                                    if (c1229p2.q0().f17615a) {
                                        eVar.b(c1229p2);
                                    } else {
                                        f(c1229p2, eVar);
                                    }
                                }
                            } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i10 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new S.e(new c0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar3.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar3.b(lVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            lVar3 = AbstractC0017g.e(eVar3);
                        }
                    } else {
                        lVar3 = lVar3.f14118f;
                    }
                }
            }
        }
    }

    public static final C1229p g(C1229p c1229p) {
        C1229p c1229p2 = ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).j;
        if (c1229p2 == null || !c1229p2.f14112B) {
            return null;
        }
        return c1229p2;
    }

    public static final C1229p h(S.e eVar, i0.c cVar, int i7) {
        i0.c d10;
        if (C1216c.a(i7, 3)) {
            d10 = cVar.d((cVar.f18176c - cVar.f18174a) + 1, 0.0f);
        } else if (C1216c.a(i7, 4)) {
            d10 = cVar.d(-((cVar.f18176c - cVar.f18174a) + 1), 0.0f);
        } else if (C1216c.a(i7, 5)) {
            d10 = cVar.d(0.0f, (cVar.f18177d - cVar.f18175b) + 1);
        } else {
            if (!C1216c.a(i7, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d10 = cVar.d(0.0f, -((cVar.f18177d - cVar.f18175b) + 1));
        }
        Object[] objArr = eVar.f8959a;
        int i10 = eVar.f8961c;
        C1229p c1229p = null;
        for (int i11 = 0; i11 < i10; i11++) {
            C1229p c1229p2 = (C1229p) objArr[i11];
            if (s(c1229p2)) {
                i0.c j = j(c1229p2);
                if (p(j, d10, cVar, i7)) {
                    c1229p = c1229p2;
                    d10 = j;
                }
            }
        }
        return c1229p;
    }

    public static final boolean i(C1229p c1229p, int i7, Rb.c cVar) {
        i0.c cVar2;
        S.e eVar = new S.e(new C1229p[16]);
        f(c1229p, eVar);
        int i10 = eVar.f8961c;
        if (i10 <= 1) {
            C1229p c1229p2 = (C1229p) (i10 == 0 ? null : eVar.f8959a[0]);
            if (c1229p2 != null) {
                return ((Boolean) cVar.invoke(c1229p2)).booleanValue();
            }
            return false;
        }
        if (C1216c.a(i7, 7)) {
            i7 = 4;
        }
        if (C1216c.a(i7, 4) ? true : C1216c.a(i7, 6)) {
            i0.c j = j(c1229p);
            float f4 = j.f18175b;
            float f10 = j.f18174a;
            cVar2 = new i0.c(f10, f4, f10, f4);
        } else {
            if (!(C1216c.a(i7, 3) ? true : C1216c.a(i7, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            i0.c j10 = j(c1229p);
            float f11 = j10.f18177d;
            float f12 = j10.f18176c;
            cVar2 = new i0.c(f12, f11, f12, f11);
        }
        C1229p h10 = h(eVar, cVar2, i7);
        if (h10 != null) {
            return ((Boolean) cVar.invoke(h10)).booleanValue();
        }
        return false;
    }

    public static final i0.c j(C1229p c1229p) {
        n0 n0Var = c1229p.f14120v;
        return n0Var != null ? AbstractC2328M.g(n0Var).x(n0Var, false) : i0.c.f18173e;
    }

    public static final boolean k(C1229p c1229p, D d10) {
        int ordinal = c1229p.r0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1229p n6 = n(c1229p);
                if (n6 != null) {
                    return k(n6, d10) || m(c1229p, n6, 1, d10);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c1229p.q0().f17615a ? ((Boolean) d10.invoke(c1229p)).booleanValue() : y(c1229p, d10);
                }
                throw new Db.d(1);
            }
        }
        return y(c1229p, d10);
    }

    public static final boolean l(int i7, D d10, C1229p c1229p, i0.c cVar) {
        if (B(i7, d10, c1229p, cVar)) {
            return true;
        }
        C1230q c1230q = ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).f17609f;
        c1230q.getClass();
        Boolean bool = (Boolean) A(c1229p, i7, new C0234t(c1230q, ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).j, c1229p, cVar, i7, d10, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(C1229p c1229p, C1229p c1229p2, int i7, D d10) {
        if (C(c1229p, c1229p2, i7, d10)) {
            return true;
        }
        C1230q c1230q = ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).f17609f;
        c1230q.getClass();
        Boolean bool = (Boolean) A(c1229p, i7, new C0234t(c1230q, ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).j, c1229p, c1229p2, i7, d10, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0025, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1229p n(C1229p c1229p) {
        C1229p c1229p2;
        int ordinal;
        boolean z8 = c1229p.f14113a.f14112B;
        if (!z8) {
            return null;
        }
        if (!z8) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar = c1229p.f14113a;
        c0.l lVar2 = lVar.f14118f;
        if (lVar2 == null) {
            AbstractC0017g.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        loop0: while (true) {
            int i7 = eVar.f8961c;
            if (i7 == 0) {
                return null;
            }
            c0.l lVar3 = (c0.l) eVar.l(i7 - 1);
            if ((lVar3.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f14115c & 1024) != 0) {
                        S.e eVar2 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof C1229p) {
                                c1229p2 = (C1229p) lVar3;
                                if (c1229p2.f14113a.f14112B && ((ordinal = c1229p2.r0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                    break loop0;
                                }
                            } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i10 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 1024) != 0) {
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
                        lVar3 = lVar3.f14118f;
                    }
                }
            }
        }
        return c1229p2;
    }

    public static final void o(C1229p c1229p) {
        L l10;
        B0.D d10;
        n0 n0Var = c1229p.f14113a.f14120v;
        if (n0Var == null || (l10 = n0Var.f293z) == null || (d10 = l10.f44B) == null) {
            return;
        }
        d10.getFocusOwner();
    }

    public static final boolean p(i0.c cVar, i0.c cVar2, i0.c cVar3, int i7) {
        if (q(i7, cVar, cVar3)) {
            return !q(i7, cVar2, cVar3) || b(cVar3, cVar, cVar2, i7) || (!b(cVar3, cVar2, cVar, i7) && r(i7, cVar3, cVar) < r(i7, cVar3, cVar2));
        }
        return false;
    }

    public static final boolean q(int i7, i0.c cVar, i0.c cVar2) {
        boolean a9 = C1216c.a(i7, 3);
        float f4 = cVar.f18174a;
        float f10 = cVar.f18176c;
        if (a9) {
            float f11 = cVar2.f18176c;
            float f12 = cVar2.f18174a;
            if ((f11 <= f10 && f12 < f10) || f12 <= f4) {
                return false;
            }
        } else if (C1216c.a(i7, 4)) {
            float f13 = cVar2.f18174a;
            float f14 = cVar2.f18176c;
            if ((f13 >= f4 && f14 > f4) || f14 >= f10) {
                return false;
            }
        } else {
            boolean a10 = C1216c.a(i7, 5);
            float f15 = cVar.f18175b;
            float f16 = cVar.f18177d;
            if (a10) {
                float f17 = cVar2.f18177d;
                float f18 = cVar2.f18175b;
                if ((f17 <= f16 && f18 < f16) || f18 <= f15) {
                    return false;
                }
            } else {
                if (!C1216c.a(i7, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f19 = cVar2.f18175b;
                float f20 = cVar2.f18177d;
                if ((f19 >= f15 && f20 > f15) || f20 >= f16) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long r(int i7, i0.c cVar, i0.c cVar2) {
        float f4;
        float f10;
        boolean a9 = C1216c.a(i7, 3);
        float f11 = cVar2.f18175b;
        float f12 = cVar2.f18177d;
        float f13 = cVar2.f18174a;
        float f14 = cVar2.f18176c;
        if (a9) {
            f4 = cVar.f18174a - f14;
        } else if (C1216c.a(i7, 4)) {
            f4 = f13 - cVar.f18176c;
        } else if (C1216c.a(i7, 5)) {
            f4 = cVar.f18175b - f12;
        } else {
            if (!C1216c.a(i7, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f4 = f11 - cVar.f18177d;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        long j = f4;
        if (C1216c.a(i7, 3) ? true : C1216c.a(i7, 4)) {
            float f15 = cVar.f18177d;
            float f16 = cVar.f18175b;
            float f17 = 2;
            f10 = (((f15 - f16) / f17) + f16) - (((f12 - f11) / f17) + f11);
        } else {
            if (!(C1216c.a(i7, 5) ? true : C1216c.a(i7, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f18176c;
            float f19 = cVar.f18174a;
            float f20 = 2;
            f10 = (((f18 - f19) / f20) + f19) - (((f14 - f13) / f20) + f13);
        }
        long j10 = f10;
        return (j10 * j10) + (13 * j * j);
    }

    public static final boolean s(C1229p c1229p) {
        L l10;
        n0 n0Var;
        L l11;
        n0 n0Var2 = c1229p.f14120v;
        return (n0Var2 == null || (l10 = n0Var2.f293z) == null || !l10.G() || (n0Var = c1229p.f14120v) == null || (l11 = n0Var.f293z) == null || !l11.F()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [Rb.c, kotlin.jvm.internal.m] */
    public static final EnumC1215b t(C1229p c1229p, int i7) {
        EnumC1215b enumC1215b;
        int ordinal = c1229p.r0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1229p n6 = n(c1229p);
                if (n6 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC1215b t5 = t(n6, i7);
                EnumC1215b enumC1215b2 = EnumC1215b.f17591a;
                if (t5 == enumC1215b2) {
                    t5 = null;
                }
                if (t5 != null) {
                    return t5;
                }
                if (!c1229p.f17633D) {
                    c1229p.f17633D = true;
                    try {
                        C1224k q02 = c1229p.q0();
                        C1214a c1214a = new C1214a(i7);
                        o(c1229p);
                        InterfaceC1220g focusOwner = ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner();
                        C1229p c1229p2 = ((C1221h) focusOwner).j;
                        q02.k.invoke(c1214a);
                        C1229p c1229p3 = ((C1221h) focusOwner).j;
                        if (c1214a.f17590b) {
                            C1226m c1226m = C1226m.f17623b;
                            enumC1215b = EnumC1215b.f17592b;
                        } else if (c1229p2 != c1229p3 && c1229p3 != null) {
                            enumC1215b = C1226m.f17625d == C1226m.f17624c ? EnumC1215b.f17592b : EnumC1215b.f17593c;
                        }
                        c1229p.f17633D = false;
                        return enumC1215b;
                    } finally {
                        c1229p.f17633D = false;
                    }
                }
                return enumC1215b2;
            }
            if (ordinal == 2) {
                return EnumC1215b.f17592b;
            }
            if (ordinal != 3) {
                throw new Db.d(1);
            }
        }
        return EnumC1215b.f17591a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Rb.c, kotlin.jvm.internal.m] */
    public static final EnumC1215b u(C1229p c1229p, int i7) {
        if (!c1229p.f17634E) {
            c1229p.f17634E = true;
            try {
                C1224k q02 = c1229p.q0();
                C1214a c1214a = new C1214a(i7);
                o(c1229p);
                InterfaceC1220g focusOwner = ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner();
                C1229p c1229p2 = ((C1221h) focusOwner).j;
                q02.j.invoke(c1214a);
                C1229p c1229p3 = ((C1221h) focusOwner).j;
                if (c1214a.f17590b) {
                    C1226m c1226m = C1226m.f17623b;
                    return EnumC1215b.f17592b;
                }
                if (c1229p2 != c1229p3 && c1229p3 != null) {
                    return C1226m.f17625d == C1226m.f17624c ? EnumC1215b.f17592b : EnumC1215b.f17593c;
                }
            } finally {
                c1229p.f17634E = false;
            }
        }
        return EnumC1215b.f17591a;
    }

    public static final EnumC1215b v(C1229p c1229p, int i7) {
        c0.l lVar;
        C0018g0 c0018g0;
        int ordinal = c1229p.r0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C1229p n6 = n(c1229p);
                if (n6 != null) {
                    return t(n6, i7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new Db.d(1);
                }
                if (!c1229p.f14113a.f14112B) {
                    AbstractC2256a.b("visitAncestors called on an unattached node");
                }
                c0.l lVar2 = c1229p.f14113a.f14117e;
                L t5 = AbstractC0017g.t(c1229p);
                loop0: while (true) {
                    if (t5 == null) {
                        lVar = null;
                        break;
                    }
                    if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                        while (lVar2 != null) {
                            if ((lVar2.f14115c & 1024) != 0) {
                                lVar = lVar2;
                                S.e eVar = null;
                                while (lVar != null) {
                                    if (lVar instanceof C1229p) {
                                        break loop0;
                                    }
                                    if ((lVar.f14115c & 1024) != 0 && (lVar instanceof AbstractC0025n)) {
                                        int i10 = 0;
                                        for (c0.l lVar3 = ((AbstractC0025n) lVar).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                            if ((lVar3.f14115c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    lVar = lVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new S.e(new c0.l[16]);
                                                    }
                                                    if (lVar != null) {
                                                        eVar.b(lVar);
                                                        lVar = null;
                                                    }
                                                    eVar.b(lVar3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    lVar = AbstractC0017g.e(eVar);
                                }
                            }
                            lVar2 = lVar2.f14117e;
                        }
                    }
                    t5 = t5.t();
                    lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
                }
                C1229p c1229p2 = (C1229p) lVar;
                if (c1229p2 == null) {
                    return EnumC1215b.f17591a;
                }
                int ordinal2 = c1229p2.r0().ordinal();
                if (ordinal2 == 0) {
                    return u(c1229p2, i7);
                }
                if (ordinal2 == 1) {
                    return v(c1229p2, i7);
                }
                if (ordinal2 == 2) {
                    return EnumC1215b.f17592b;
                }
                if (ordinal2 != 3) {
                    throw new Db.d(1);
                }
                EnumC1215b v10 = v(c1229p2, i7);
                EnumC1215b enumC1215b = v10 != EnumC1215b.f17591a ? v10 : null;
                return enumC1215b == null ? u(c1229p2, i7) : enumC1215b;
            }
        }
        return EnumC1215b.f17591a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean] */
    public static final boolean w(C1229p c1229p) {
        S.e eVar;
        boolean z8;
        C0018g0 c0018g0;
        char c10;
        C0018g0 c0018g02;
        C1221h c1221h = (C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner();
        C1229p c1229p2 = c1221h.j;
        EnumC1228o r02 = c1229p.r0();
        if (c1229p2 == c1229p) {
            c1229p.p0(r02, r02);
            return true;
        }
        S.e eVar2 = null;
        int i7 = 0;
        if (c1229p2 != null || ((Boolean) ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).f17604a.invoke(null, null)).booleanValue()) {
            char c11 = 16;
            if (c1229p2 != null) {
                eVar = new S.e(new C1229p[16]);
                if (!c1229p2.f14113a.f14112B) {
                    AbstractC2256a.b("visitAncestors called on an unattached node");
                }
                c0.l lVar = c1229p2.f14113a.f14117e;
                L t5 = AbstractC0017g.t(c1229p2);
                while (t5 != null) {
                    if ((((c0.l) t5.f60S.f229f).f14116d & 1024) != 0) {
                        while (lVar != null) {
                            if ((lVar.f14115c & 1024) != 0) {
                                S.e eVar3 = eVar2;
                                c0.l lVar2 = lVar;
                                while (lVar2 != null) {
                                    if (lVar2 instanceof C1229p) {
                                        eVar.b((C1229p) lVar2);
                                    } else if ((lVar2.f14115c & 1024) != 0 && (lVar2 instanceof AbstractC0025n)) {
                                        int i10 = 0;
                                        for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                            if ((lVar3.f14115c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    lVar2 = lVar3;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new S.e(new c0.l[16]);
                                                    }
                                                    if (lVar2 != null) {
                                                        eVar3.b(lVar2);
                                                        lVar2 = null;
                                                    }
                                                    eVar3.b(lVar3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    lVar2 = AbstractC0017g.e(eVar3);
                                }
                            }
                            lVar = lVar.f14117e;
                            eVar2 = null;
                        }
                    }
                    t5 = t5.t();
                    lVar = (t5 == null || (c0018g02 = t5.f60S) == null) ? null : (B0) c0018g02.f228e;
                    eVar2 = null;
                }
            } else {
                eVar = null;
            }
            C1229p[] c1229pArr = new C1229p[16];
            if (!c1229p.f14113a.f14112B) {
                AbstractC2256a.b("visitAncestors called on an unattached node");
            }
            c0.l lVar4 = c1229p.f14113a.f14117e;
            L t10 = AbstractC0017g.t(c1229p);
            int i11 = 1;
            int i12 = 0;
            while (t10 != null) {
                if ((((c0.l) t10.f60S.f229f).f14116d & 1024) != 0) {
                    while (lVar4 != null) {
                        if ((lVar4.f14115c & 1024) != 0) {
                            c0.l lVar5 = lVar4;
                            S.e eVar4 = null;
                            while (lVar5 != null) {
                                if (lVar5 instanceof C1229p) {
                                    C1229p c1229p3 = (C1229p) lVar5;
                                    Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.k(c1229p3)) : null;
                                    if (valueOf == null || !valueOf.booleanValue()) {
                                        int i13 = i12 + 1;
                                        if (c1229pArr.length < i13) {
                                            int length = c1229pArr.length;
                                            ?? r42 = new Object[Math.max(i13, length * 2)];
                                            System.arraycopy(c1229pArr, i7, r42, i7, length);
                                            c1229pArr = r42;
                                        }
                                        c1229pArr[i12] = c1229p3;
                                        i12 = i13;
                                    }
                                    if (c1229p3 == c1229p2) {
                                        i11 = i7;
                                    }
                                } else if ((lVar5.f14115c & 1024) != 0 && (lVar5 instanceof AbstractC0025n)) {
                                    int i14 = i7;
                                    for (c0.l lVar6 = ((AbstractC0025n) lVar5).f269D; lVar6 != null; lVar6 = lVar6.f14118f) {
                                        if ((lVar6.f14115c & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                lVar5 = lVar6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new S.e(new c0.l[16]);
                                                }
                                                if (lVar5 != null) {
                                                    eVar4.b(lVar5);
                                                    lVar5 = null;
                                                }
                                                eVar4.b(lVar6);
                                            }
                                        }
                                    }
                                    c10 = 16;
                                    if (i14 == 1) {
                                        c11 = 16;
                                        i7 = 0;
                                    }
                                    lVar5 = AbstractC0017g.e(eVar4);
                                    c11 = c10;
                                    i7 = 0;
                                }
                                c10 = 16;
                                lVar5 = AbstractC0017g.e(eVar4);
                                c11 = c10;
                                i7 = 0;
                            }
                        }
                        lVar4 = lVar4.f14117e;
                        c11 = c11;
                        i7 = 0;
                    }
                }
                char c12 = c11;
                t10 = t10.t();
                lVar4 = (t10 == null || (c0018g0 = t10.f60S) == null) ? null : (B0) c0018g0.f228e;
                c11 = c12;
                i7 = 0;
            }
            if (i11 == 0 || c1229p2 == null) {
                z8 = false;
            } else {
                z8 = false;
                if (!e(c1229p2, false)) {
                    return false;
                }
            }
            AbstractC0017g.q(c1229p, new J(c1229p, 17));
            int ordinal = c1229p.r0().ordinal();
            if (ordinal == 1 || ordinal == 3) {
                ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).e(c1229p);
            }
            if (eVar != null) {
                int i15 = eVar.f8961c - 1;
                Object[] objArr = eVar.f8959a;
                if (i15 < objArr.length) {
                    while (i15 >= 0) {
                        C1229p c1229p4 = (C1229p) objArr[i15];
                        if (c1221h.j != c1229p) {
                            return z8;
                        }
                        c1229p4.p0(EnumC1228o.f17628b, EnumC1228o.f17630d);
                        i15--;
                    }
                }
            }
            i7 = 1;
            int i16 = i12 - 1;
            if (i16 < c1229pArr.length) {
                while (i16 >= 0) {
                    C1229p c1229p5 = c1229pArr[i16];
                    if (c1221h.j != c1229p) {
                        return z8;
                    }
                    c1229p5.p0(c1229p5 == c1229p2 ? EnumC1228o.f17627a : EnumC1228o.f17630d, EnumC1228o.f17628b);
                    i16--;
                }
            }
            if (c1221h.j != c1229p) {
                return z8;
            }
            c1229p.p0(r02, EnumC1228o.f17627a);
            if (c1221h.j != c1229p) {
                return z8;
            }
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean x(C1229p c1229p, D d10) {
        C1229p[] c1229pArr = new C1229p[16];
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar = c1229p.f14113a;
        c0.l lVar2 = lVar.f14118f;
        if (lVar2 == null) {
            AbstractC0017g.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i7 = 0;
        while (true) {
            int i10 = eVar.f8961c;
            if (i10 == 0) {
                break;
            }
            c0.l lVar3 = (c0.l) eVar.l(i10 - 1);
            if ((lVar3.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f14115c & 1024) != 0) {
                        S.e eVar2 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof C1229p) {
                                C1229p c1229p2 = (C1229p) lVar3;
                                int i11 = i7 + 1;
                                if (c1229pArr.length < i11) {
                                    int length = c1229pArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(c1229pArr, 0, r10, 0, length);
                                    c1229pArr = r10;
                                }
                                c1229pArr[i7] = c1229p2;
                                i7 = i11;
                            } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i12 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
                                }
                            }
                            lVar3 = AbstractC0017g.e(eVar2);
                        }
                    } else {
                        lVar3 = lVar3.f14118f;
                    }
                }
            }
        }
        Arrays.sort(c1229pArr, 0, i7, C1231r.f17636a);
        int i13 = i7 - 1;
        if (i13 < c1229pArr.length) {
            while (i13 >= 0) {
                C1229p c1229p3 = c1229pArr[i13];
                if (s(c1229p3) && a(c1229p3, d10)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean y(C1229p c1229p, D d10) {
        C1229p[] c1229pArr = new C1229p[16];
        if (!c1229p.f14113a.f14112B) {
            AbstractC2256a.b("visitChildren called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar = c1229p.f14113a;
        c0.l lVar2 = lVar.f14118f;
        if (lVar2 == null) {
            AbstractC0017g.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i7 = 0;
        while (true) {
            int i10 = eVar.f8961c;
            if (i10 == 0) {
                break;
            }
            c0.l lVar3 = (c0.l) eVar.l(i10 - 1);
            if ((lVar3.f14116d & 1024) == 0) {
                AbstractC0017g.b(eVar, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f14115c & 1024) != 0) {
                        S.e eVar2 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof C1229p) {
                                C1229p c1229p2 = (C1229p) lVar3;
                                int i11 = i7 + 1;
                                if (c1229pArr.length < i11) {
                                    int length = c1229pArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(c1229pArr, 0, r10, 0, length);
                                    c1229pArr = r10;
                                }
                                c1229pArr[i7] = c1229p2;
                                i7 = i11;
                            } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i12 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
                                }
                            }
                            lVar3 = AbstractC0017g.e(eVar2);
                        }
                    } else {
                        lVar3 = lVar3.f14118f;
                    }
                }
            }
        }
        Arrays.sort(c1229pArr, 0, i7, C1231r.f17636a);
        for (int i13 = 0; i13 < i7; i13++) {
            C1229p c1229p3 = c1229pArr[i13];
            if (s(c1229p3) && k(c1229p3, d10)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof B0.D)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }
}
