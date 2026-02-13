package Q;

import A0.C0032v;
import F.C0274s;
import R.C0524a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import u.C2069w;
import v.AbstractC2121a;

/* renamed from: Q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8375a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F f8376b = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r12.f8469v != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [Q.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [V.c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [V.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C0501l0 c0501l0, Y.e eVar, C0506o c0506o, int i7) {
        U0 u02;
        InterfaceC0493h0 cVar;
        boolean z8;
        InterfaceC0493h0 interfaceC0493h0;
        C0505n0 r10;
        InterfaceC0493h0 interfaceC0493h02;
        InterfaceC0493h0 cVar2;
        c0506o.U(-1350970552);
        InterfaceC0493h0 m10 = c0506o.m();
        c0506o.Q(201, AbstractC0508p.f8482b);
        Object H10 = c0506o.H();
        if (kotlin.jvm.internal.l.a(H10, C0498k.f8409a)) {
            u02 = null;
        } else {
            kotlin.jvm.internal.l.c(H10, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            u02 = (U0) H10;
        }
        AbstractC0499k0 abstractC0499k0 = c0501l0.f8412a;
        U0 c10 = abstractC0499k0.c(c0501l0, u02);
        boolean equals = c10.equals(u02);
        if (!equals) {
            c0506o.d0(c10);
        }
        if (c0506o.f8448O) {
            if (!c0501l0.f8417f) {
                boolean containsKey = m10.containsKey(abstractC0499k0);
                cVar2 = m10;
            }
            Y.j jVar = (Y.j) m10;
            jVar.getClass();
            A7.a u3 = jVar.f9940a.u(abstractC0499k0, abstractC0499k0.hashCode(), 0, c10);
            cVar2 = jVar;
            if (u3 != null) {
                cVar2 = new V.c((V.l) u3.f532b, jVar.f9941b + u3.f531a);
            }
            c0506o.f8443I = true;
            interfaceC0493h02 = cVar2;
        } else {
            y0 y0Var = c0506o.f8440F;
            Object b2 = y0Var.b(y0Var.f8574b, y0Var.g);
            kotlin.jvm.internal.l.c(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0493h0 interfaceC0493h03 = (InterfaceC0493h0) b2;
            if (!(c0506o.x() && equals) && (c0501l0.f8417f || !m10.containsKey(abstractC0499k0))) {
                Y.j jVar2 = (Y.j) m10;
                jVar2.getClass();
                A7.a u10 = jVar2.f9940a.u(abstractC0499k0, abstractC0499k0.hashCode(), 0, c10);
                cVar = jVar2;
                if (u10 != null) {
                    cVar = new V.c((V.l) u10.f532b, jVar2.f9941b + u10.f531a);
                }
            } else {
                if (!equals || c0506o.f8469v) {
                    cVar = m10;
                }
                cVar = interfaceC0493h03;
            }
            interfaceC0493h02 = cVar;
            if (c0506o.f8471x || interfaceC0493h03 != cVar) {
                z8 = true;
                interfaceC0493h0 = cVar;
                if (z8 && !c0506o.f8448O) {
                    c0506o.F(interfaceC0493h0);
                }
                boolean z10 = c0506o.f8469v;
                C0032v c0032v = c0506o.f8470w;
                c0032v.c(z10 ? 1 : 0);
                c0506o.f8469v = z8;
                c0506o.f8444J = interfaceC0493h0;
                c0506o.O(AbstractC0508p.f8483c, 202, 0, interfaceC0493h0);
                eVar.invoke(c0506o, Integer.valueOf((i7 >> 3) & 14));
                c0506o.p(false);
                c0506o.p(false);
                c0506o.f8469v = c0032v.b() != 0;
                c0506o.f8444J = null;
                r10 = c0506o.r();
                if (r10 == null) {
                    r10.f8432d = new C0274s(c0501l0, eVar, i7, 2);
                    return;
                }
                return;
            }
        }
        z8 = false;
        interfaceC0493h0 = interfaceC0493h02;
        if (z8) {
            c0506o.F(interfaceC0493h0);
        }
        boolean z102 = c0506o.f8469v;
        C0032v c0032v2 = c0506o.f8470w;
        c0032v2.c(z102 ? 1 : 0);
        c0506o.f8469v = z8;
        c0506o.f8444J = interfaceC0493h0;
        c0506o.O(AbstractC0508p.f8483c, 202, 0, interfaceC0493h0);
        eVar.invoke(c0506o, Integer.valueOf((i7 >> 3) & 14));
        c0506o.p(false);
        c0506o.p(false);
        c0506o.f8469v = c0032v2.b() != 0;
        c0506o.f8444J = null;
        r10 = c0506o.r();
        if (r10 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Q.h0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0501l0[] c0501l0Arr, Y.e eVar, C0506o c0506o, int i7) {
        Y.j c02;
        boolean z8;
        C0505n0 r10;
        c0506o.U(-1390796515);
        InterfaceC0493h0 m10 = c0506o.m();
        c0506o.Q(201, AbstractC0508p.f8482b);
        if (c0506o.f8448O) {
            c02 = c0506o.c0(m10, v(c0501l0Arr, m10, Y.j.f11053d));
            c0506o.f8443I = true;
        } else {
            y0 y0Var = c0506o.f8440F;
            Object g = y0Var.g(y0Var.g, 0);
            kotlin.jvm.internal.l.c(g, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r12 = (InterfaceC0493h0) g;
            y0 y0Var2 = c0506o.f8440F;
            Object g2 = y0Var2.g(y0Var2.g, 1);
            kotlin.jvm.internal.l.c(g2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0493h0 interfaceC0493h0 = (InterfaceC0493h0) g2;
            Y.j v10 = v(c0501l0Arr, m10, interfaceC0493h0);
            if (c0506o.x() && !c0506o.f8471x && interfaceC0493h0.equals(v10)) {
                c0506o.k = c0506o.f8440F.p() + c0506o.k;
                c02 = r12;
            } else {
                c02 = c0506o.c0(m10, v10);
                if (c0506o.f8471x || !kotlin.jvm.internal.l.a(c02, r12)) {
                    z8 = true;
                    if (z8 && !c0506o.f8448O) {
                        c0506o.F(c02);
                    }
                    boolean z10 = c0506o.f8469v;
                    C0032v c0032v = c0506o.f8470w;
                    c0032v.c(z10 ? 1 : 0);
                    c0506o.f8469v = z8;
                    c0506o.f8444J = c02;
                    c0506o.O(AbstractC0508p.f8483c, 202, 0, c02);
                    eVar.invoke(c0506o, Integer.valueOf((i7 >> 3) & 14));
                    c0506o.p(false);
                    c0506o.p(false);
                    c0506o.f8469v = c0032v.b() != 0;
                    c0506o.f8444J = null;
                    r10 = c0506o.r();
                    if (r10 == null) {
                        r10.f8432d = new C0274s(c0501l0Arr, eVar, i7, 1);
                        return;
                    }
                    return;
                }
            }
        }
        z8 = false;
        if (z8) {
            c0506o.F(c02);
        }
        boolean z102 = c0506o.f8469v;
        C0032v c0032v2 = c0506o.f8470w;
        c0032v2.c(z102 ? 1 : 0);
        c0506o.f8469v = z8;
        c0506o.f8444J = c02;
        c0506o.O(AbstractC0508p.f8483c, 202, 0, c02);
        eVar.invoke(c0506o, Integer.valueOf((i7 >> 3) & 14));
        c0506o.p(false);
        c0506o.p(false);
        c0506o.f8469v = c0032v2.b() != 0;
        c0506o.f8444J = null;
        r10 = c0506o.r();
        if (r10 == null) {
        }
    }

    public static final void c(Object obj, Rb.c cVar, C0506o c0506o) {
        boolean g = c0506o.g(obj);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new D(cVar);
            c0506o.d0(H10);
        }
    }

    public static final void d(Object obj, Object obj2, Rb.c cVar, C0506o c0506o) {
        boolean g = c0506o.g(obj) | c0506o.g(obj2);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new D(cVar);
            c0506o.d0(H10);
        }
    }

    public static final void e(C0506o c0506o, Rb.e eVar, Object obj) {
        Hb.i h10 = c0506o.f8452b.h();
        boolean g = c0506o.g(obj);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new P(h10, eVar);
            c0506o.d0(H10);
        }
    }

    public static final void f(Object obj, Object obj2, Rb.e eVar, C0506o c0506o) {
        Hb.i h10 = c0506o.f8452b.h();
        boolean g = c0506o.g(obj) | c0506o.g(obj2);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new P(h10, eVar);
            c0506o.d0(H10);
        }
    }

    public static final void g(Rb.a aVar, C0506o c0506o) {
        C0524a c0524a = c0506o.L.f8747b;
        c0524a.getClass();
        R.A a9 = R.A.f8734d;
        R.I i7 = c0524a.f8745f;
        i7.N(a9);
        tc.b.I(i7, 0, aVar);
    }

    public static final void h(C2069w c2069w, int i7) {
        if (c2069w.f24728b == 0 || !(c2069w.b(0) == i7 || c2069w.b(c2069w.f24728b - 1) == i7)) {
            int i10 = c2069w.f24728b;
            c2069w.a(i7);
            while (i10 > 0) {
                int i11 = ((i10 + 1) >>> 1) - 1;
                int b2 = c2069w.b(i11);
                if (i7 <= b2) {
                    break;
                }
                c2069w.d(i10, b2);
                i10 = i11;
            }
            c2069w.d(i10, i7);
        }
    }

    public static void i(C0 c02, List list, C0517u c0517u) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int c10 = c02.c((C0478a) list.get(i7));
            int K10 = c02.K(c02.f8278b, c02.q(c10));
            Object obj = K10 < c02.f(c02.f8278b, c02.q(c10 + 1)) ? c02.f8279c[c02.g(K10)] : C0498k.f8409a;
            C0505n0 c0505n0 = obj instanceof C0505n0 ? (C0505n0) obj : null;
            if (c0505n0 != null) {
                c0505n0.f8430b = c0517u;
            }
        }
    }

    public static final W j(fc.Z z8, C0506o c0506o) {
        Hb.j jVar = Hb.j.f4919a;
        Object value = z8.getValue();
        boolean i7 = c0506o.i(jVar) | c0506o.i(z8);
        Object H10 = c0506o.H();
        Object obj = C0498k.f8409a;
        if (i7 || H10 == obj) {
            H10 = new N0(jVar, z8, null);
            c0506o.d0(H10);
        }
        Rb.e eVar = (Rb.e) H10;
        Object H11 = c0506o.H();
        if (H11 == obj) {
            H11 = o(value);
            c0506o.d0(H11);
        }
        W w10 = (W) H11;
        boolean i10 = c0506o.i(eVar);
        Object H12 = c0506o.H();
        if (i10 || H12 == obj) {
            H12 = new K0(eVar, w10, null);
            c0506o.d0(H12);
        }
        f(z8, jVar, (Rb.e) H12, c0506o);
        return w10;
    }

    public static final cc.E k(C0506o c0506o) {
        return new x0(c0506o.f8452b.h());
    }

    public static final S.e l() {
        Q7.h hVar = I0.f8309b;
        S.e eVar = (S.e) hVar.w();
        if (eVar != null) {
            return eVar;
        }
        S.e eVar2 = new S.e(new C0504n[0]);
        hVar.N(eVar2);
        return eVar2;
    }

    public static final T m(Hb.i iVar) {
        T t5 = (T) iVar.get(S.f8364b);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List n(C0 c02, int i7, C0 c03, boolean z8, boolean z10, boolean z11) {
        Eb.v vVar;
        boolean G9;
        int i10;
        int i11;
        int s3 = c02.s(i7);
        int i12 = i7 + s3;
        int f4 = c02.f(c02.f8278b, c02.q(i7));
        int f10 = c02.f(c02.f8278b, c02.q(i12));
        int i13 = f10 - f4;
        boolean z12 = i7 >= 0 && (c02.f8278b[(c02.q(i7) * 5) + 1] & 201326592) != 0;
        c03.u(s3);
        c03.v(i13, c03.f8293t);
        if (c02.g < i12) {
            c02.z(i12);
        }
        if (c02.k < f10) {
            c02.A(f10, i12);
        }
        int[] iArr = c03.f8278b;
        int i14 = c03.f8293t;
        int i15 = i14 * 5;
        Eb.n.M(i15, i7 * 5, i12 * 5, c02.f8278b, iArr);
        Object[] objArr = c03.f8279c;
        int i16 = c03.f8284i;
        System.arraycopy(c02.f8279c, f4, objArr, i16, i13);
        int i17 = c03.f8295v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i7;
        int i19 = i14 + s3;
        int f11 = i16 - c03.f(iArr, i14);
        int i20 = c03.f8286m;
        int i21 = c03.f8285l;
        int length = objArr.length;
        boolean z13 = z12;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int i25 = i14;
            int f12 = c03.f(iArr, i23) + f11;
            if (i22 < i23) {
                i10 = i19;
                i11 = 0;
            } else {
                i10 = i19;
                i11 = c03.k;
            }
            iArr[(i23 * 5) + 4] = C0.h(f12, i11, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i19 = i10;
            i14 = i25;
        }
        int i26 = i19;
        c03.f8286m = i22;
        int b2 = B0.b(c02.f8280d, i7, c02.n());
        int b10 = B0.b(c02.f8280d, i12, c02.n());
        if (b2 < b10) {
            ArrayList arrayList = c02.f8280d;
            ArrayList arrayList2 = new ArrayList(b10 - b2);
            for (int i27 = b2; i27 < b10; i27++) {
                C0478a c0478a = (C0478a) arrayList.get(i27);
                c0478a.f8373a += i18;
                arrayList2.add(c0478a);
            }
            c03.f8280d.addAll(B0.b(c03.f8280d, c03.f8293t, c03.n()), arrayList2);
            arrayList.subList(b2, b10).clear();
            vVar = arrayList2;
        } else {
            vVar = Eb.v.f3891a;
        }
        if (!vVar.isEmpty()) {
            HashMap hashMap = c02.f8281e;
            HashMap hashMap2 = c03.f8281e;
            if (hashMap != null && hashMap2 != null) {
                int size = vVar.size();
                for (int i28 = 0; i28 < size; i28++) {
                }
            }
        }
        int i29 = c03.f8295v;
        c03.N(i17);
        int C2 = c02.C(c02.f8278b, i7);
        if (!z11) {
            G9 = false;
        } else if (z8) {
            boolean z14 = C2 >= 0;
            if (z14) {
                c02.O();
                c02.a(C2 - c02.f8293t);
                c02.O();
            }
            c02.a(i7 - c02.f8293t);
            boolean F10 = c02.F();
            if (z14) {
                c02.J();
                c02.i();
                c02.J();
                c02.i();
            }
            G9 = F10;
        } else {
            G9 = c02.G(i7, s3);
            c02.H(f4, i13, i7 - 1);
        }
        if (G9) {
            AbstractC0508p.c("Unexpectedly removed anchors");
        }
        int i30 = c03.f8288o;
        int i31 = iArr[i15 + 1];
        c03.f8288o = i30 + ((1073741824 & i31) != 0 ? 1 : i31 & 67108863);
        if (z10) {
            c03.f8293t = i26;
            c03.f8284i = i16 + i13;
        }
        if (z13) {
            c03.S(i17);
        }
        return vVar;
    }

    public static C0487e0 o(Object obj) {
        return new C0487e0(obj, S.f8368f);
    }

    public static final Object p(InterfaceC0493h0 interfaceC0493h0, AbstractC0499k0 abstractC0499k0) {
        kotlin.jvm.internal.l.c(abstractC0499k0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = interfaceC0493h0.get(abstractC0499k0);
        if (obj == null) {
            obj = abstractC0499k0.b();
        }
        return ((U0) obj).a(interfaceC0493h0);
    }

    public static final C0502m q(C0506o c0506o) {
        c0506o.Q(206, AbstractC0508p.f8485e);
        if (c0506o.f8448O) {
            C0.x(c0506o.f8442H);
        }
        Object z8 = c0506o.z();
        C0500l c0500l = z8 instanceof C0500l ? (C0500l) z8 : null;
        if (c0500l == null) {
            c0500l = new C0500l(new C0502m(c0506o, c0506o.f8449P, c0506o.f8463p, c0506o.f8436B, c0506o.g.f8525F));
            c0506o.e0(c0500l);
        }
        InterfaceC0493h0 m10 = c0506o.m();
        C0502m c0502m = c0500l.f8411a;
        c0502m.f8423f.setValue(m10);
        c0506o.p(false);
        return c0502m;
    }

    public static final W r(Object obj, C0506o c0506o) {
        Object H10 = c0506o.H();
        if (H10 == C0498k.f8409a) {
            H10 = o(obj);
            c0506o.d0(H10);
        }
        W w10 = (W) H10;
        w10.setValue(obj);
        return w10;
    }

    public static final void s(C0506o c0506o, Rb.e eVar, Object obj) {
        if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), obj)) {
            c0506o.d0(obj);
            c0506o.c(obj, eVar);
        }
    }

    public static final int t(C2069w c2069w) {
        int b2;
        int i7 = c2069w.f24728b;
        int b10 = c2069w.b(0);
        while (c2069w.f24728b != 0 && c2069w.b(0) == b10) {
            int i10 = c2069w.f24728b;
            if (i10 == 0) {
                AbstractC2121a.e("IntList is empty.");
                throw null;
            }
            c2069w.d(0, c2069w.f24727a[i10 - 1]);
            c2069w.c(c2069w.f24728b - 1);
            int i11 = c2069w.f24728b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int b11 = c2069w.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int b12 = c2069w.b(i15);
                if (i14 >= i11 || (b2 = c2069w.b(i14)) <= b12) {
                    if (b12 > b11) {
                        c2069w.d(i13, b12);
                        c2069w.d(i15, b11);
                        i13 = i15;
                    }
                } else if (b2 > b11) {
                    c2069w.d(i13, b2);
                    c2069w.d(i14, b11);
                    i13 = i14;
                }
            }
        }
        return b10;
    }

    public static final int u(int i7) {
        int i10 = 306783378 & i7;
        int i11 = 613566756 & i7;
        return (i7 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    public static final Y.j v(C0501l0[] c0501l0Arr, InterfaceC0493h0 interfaceC0493h0, InterfaceC0493h0 interfaceC0493h02) {
        Y.i iVar = new Y.i(Y.j.f11053d);
        for (C0501l0 c0501l0 : c0501l0Arr) {
            AbstractC0499k0 abstractC0499k0 = c0501l0.f8412a;
            if (c0501l0.f8417f || !interfaceC0493h0.containsKey(abstractC0499k0)) {
                iVar.put(abstractC0499k0, abstractC0499k0.c(c0501l0, (U0) interfaceC0493h02.get(abstractC0499k0)));
            }
        }
        return iVar.a();
    }
}
