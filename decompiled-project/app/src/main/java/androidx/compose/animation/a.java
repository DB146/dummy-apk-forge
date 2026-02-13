package androidx.compose.animation;

import A0.AbstractC0012d0;
import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.C0028q;
import A0.InterfaceC0022k;
import C9.h;
import Eb.n;
import N.s;
import Q.C0480b;
import Q.C0487e0;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q.W;
import Y.f;
import a0.C0691r;
import c0.e;
import c0.j;
import c0.m;
import c0.o;
import com.bumptech.glide.d;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import u.C2046I;
import u.Q;
import w.C2176c;
import w.C2177d;
import w.C2179f;
import w.C2181h;
import w.C2186m;
import w.C2187n;
import w.w;
import x.b0;
import x.i0;
import x.n0;
import x.p0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f13122a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13123b = 0;

    static {
        long j = Integer.MIN_VALUE;
        f13122a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(Boolean bool, m mVar, C2176c c2176c, e eVar, String str, C2176c c2176c2, Y.e eVar2, C0506o c0506o, int i7) {
        C2176c c2176c3;
        e eVar3;
        C2176c c2176c4;
        c0506o.U(2132720749);
        int i10 = i7 | (c0506o.g(bool) ? 4 : 2) | 200064;
        if (c0506o.K(i10 & 1, (599187 & i10) != 599186)) {
            C2176c c2176c5 = C2176c.f25548b;
            e eVar4 = c0.b.f14089a;
            C2176c c2176c6 = C2176c.f25549c;
            b(n0.b(bool, str, c0506o, (i10 & 14) | 48), mVar, c2176c5, eVar4, c2176c6, eVar2, c0506o, 224688);
            c2176c3 = c2176c5;
            eVar3 = eVar4;
            c2176c4 = c2176c6;
        } else {
            c0506o.N();
            c2176c3 = c2176c;
            eVar3 = eVar;
            c2176c4 = c2176c2;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C2177d(bool, mVar, c2176c3, eVar3, str, c2176c4, eVar2, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v3, types: [c0.m] */
    /* JADX WARN: Type inference failed for: r23v0, types: [Rb.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [Q.o, java.lang.Object] */
    public static final void b(i0 i0Var, m mVar, Rb.c cVar, e eVar, Rb.c cVar2, Y.e eVar2, C0506o c0506o, int i7) {
        int i10;
        C2187n c2187n;
        C2046I c2046i;
        C0691r c0691r;
        Object obj;
        C2187n c2187n2;
        ?? r13;
        j jVar;
        final b0 b0Var;
        int i11;
        c0506o.U(-114689412);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.g(i0Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.g(mVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0506o.i(cVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= c0506o.g(eVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= c0506o.i(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i10 |= c0506o.i(eVar2) ? 131072 : 65536;
        }
        if (c0506o.K(i10 & 1, (74899 & i10) != 74898)) {
            int i12 = i10 & 14;
            boolean z8 = i12 == 4;
            Object H10 = c0506o.H();
            Object obj2 = C0498k.f8409a;
            if (z8 || H10 == obj2) {
                H10 = new C2187n(i0Var, eVar);
                c0506o.d0(H10);
            }
            C2187n c2187n3 = (C2187n) H10;
            boolean z10 = i12 == 4;
            Object H11 = c0506o.H();
            Object obj3 = H11;
            if (z10 || H11 == obj2) {
                Object[] objArr = {i0Var.f26099a.l()};
                C0691r c0691r2 = new C0691r();
                c0691r2.addAll(n.e0(objArr));
                c0506o.d0(c0691r2);
                obj3 = c0691r2;
            }
            C0691r c0691r3 = (C0691r) obj3;
            boolean z11 = i12 == 4;
            Object H12 = c0506o.H();
            if (z11 || H12 == obj2) {
                long[] jArr = Q.f24633a;
                H12 = new C2046I();
                c0506o.d0(H12);
            }
            C2046I c2046i2 = (C2046I) H12;
            boolean contains = c0691r3.contains(i0Var.f26099a.l());
            h hVar = i0Var.f26099a;
            if (!contains) {
                c0691r3.clear();
                c0691r3.add(hVar.l());
            }
            Object l10 = hVar.l();
            C0487e0 c0487e0 = i0Var.f26102d;
            if (l.a(l10, c0487e0.getValue())) {
                if (c0691r3.size() != 1 || !l.a(c0691r3.get(0), hVar.l())) {
                    c0691r3.clear();
                    c0691r3.add(hVar.l());
                }
                if (c2046i2.f24607e != 1 || c2046i2.c(hVar.l())) {
                    c2046i2.a();
                }
                c2187n3.f25591b = eVar;
            }
            if (l.a(hVar.l(), c0487e0.getValue()) || c0691r3.contains(c0487e0.getValue())) {
                c2187n = c2187n3;
            } else {
                ListIterator listIterator = c0691r3.listIterator();
                int i13 = 0;
                while (true) {
                    C0028q c0028q = (C0028q) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!c0028q.hasNext()) {
                        c2187n = c2187n3;
                        i11 = -1;
                        i13 = -1;
                        break;
                    }
                    Object invoke = cVar2.invoke(c0028q.next());
                    c2187n = c2187n3;
                    if (l.a(invoke, cVar2.invoke(c0487e0.getValue()))) {
                        i11 = -1;
                        break;
                    } else {
                        i13++;
                        c2187n3 = c2187n;
                        listIterator = listIterator2;
                    }
                }
                if (i13 == i11) {
                    c0691r3.add(c0487e0.getValue());
                } else {
                    c0691r3.set(i13, c0487e0.getValue());
                }
            }
            if (c2046i2.c(c0487e0.getValue()) && c2046i2.c(hVar.l())) {
                c0506o.S(919489879);
                c0506o.p(false);
                c2046i = c2046i2;
                c0691r = c0691r3;
                obj = obj2;
                r13 = 0;
                c2187n2 = c2187n;
            } else {
                boolean z12 = false;
                c0506o.S(916905750);
                c2046i2.a();
                int size = c0691r3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj4 = c0691r3.get(i14);
                    C2046I c2046i3 = c2046i2;
                    C0691r c0691r4 = c0691r3;
                    C2187n c2187n4 = c2187n;
                    c2046i3.l(obj4, f.d(885640742, new C2179f(i0Var, obj4, cVar, c2187n4, c0691r4, eVar2), c0506o));
                    i14++;
                    c2046i2 = c2046i3;
                    obj2 = obj2;
                    z12 = z12;
                    c0691r3 = c0691r4;
                    c2187n = c2187n4;
                }
                c2046i = c2046i2;
                c0691r = c0691r3;
                obj = obj2;
                boolean z13 = z12;
                c2187n2 = c2187n;
                c0506o.p(z13);
                r13 = z13;
            }
            final C2187n c2187n5 = c2187n2;
            boolean g = c0506o.g(i0Var.f()) | c0506o.g(c2187n5);
            Object H13 = c0506o.H();
            if (g || H13 == obj) {
                H13 = (w) cVar.invoke(c2187n5);
                c0506o.d0(H13);
            }
            w wVar = (w) H13;
            c2187n5.getClass();
            boolean g2 = c0506o.g(c2187n5);
            Object H14 = c0506o.H();
            if (g2 || H14 == obj) {
                H14 = C0480b.o(Boolean.FALSE);
                c0506o.d0(H14);
            }
            W w10 = (W) H14;
            final W r10 = C0480b.r(wVar.f25624d, c0506o);
            i0 i0Var2 = c2187n5.f25590a;
            if (l.a(i0Var2.f26099a.l(), i0Var2.f26102d.getValue())) {
                w10.setValue(Boolean.FALSE);
            } else if (r10.getValue() != null) {
                w10.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) w10.getValue()).booleanValue();
            j jVar2 = j.f14110a;
            if (booleanValue) {
                c0506o.S(249676467);
                b0Var = n0.a(c2187n5.f25590a, p0.f26147h, null, c0506o, 0, 2);
                boolean g10 = c0506o.g(b0Var);
                Object H15 = c0506o.H();
                if (g10 || H15 == obj) {
                    H15 = d.d(jVar2);
                    c0506o.d0(H15);
                }
                c0506o.p(r13);
                jVar = (m) H15;
            } else {
                c0506o.S(249942509);
                c0506o.p(r13);
                jVar = jVar2;
                b0Var = null;
            }
            m c10 = mVar.c(jVar.c(new AbstractC0012d0(b0Var, r10, c2187n5) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* renamed from: a, reason: collision with root package name */
                public final b0 f13112a;

                /* renamed from: b, reason: collision with root package name */
                public final W f13113b;

                /* renamed from: c, reason: collision with root package name */
                public final C2187n f13114c;

                {
                    this.f13112a = b0Var;
                    this.f13113b = r10;
                    this.f13114c = c2187n5;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, w.m] */
                @Override // A0.AbstractC0012d0
                public final c0.l d() {
                    ?? lVar = new c0.l();
                    lVar.f25586C = this.f13112a;
                    lVar.f25587D = this.f13113b;
                    lVar.f25588E = this.f13114c;
                    lVar.f25589F = a.f13122a;
                    return lVar;
                }

                @Override // A0.AbstractC0012d0
                public final void e(c0.l lVar) {
                    C2186m c2186m = (C2186m) lVar;
                    c2186m.f25586C = this.f13112a;
                    c2186m.f25587D = this.f13113b;
                    c2186m.f25588E = this.f13114c;
                }

                public final boolean equals(Object obj5) {
                    if (obj5 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement) {
                        AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj5;
                        if (l.a(animatedContentTransitionScopeImpl$SizeModifierElement.f13112a, this.f13112a) && animatedContentTransitionScopeImpl$SizeModifierElement.f13113b.equals(this.f13113b)) {
                            return true;
                        }
                    }
                    return false;
                }

                public final int hashCode() {
                    int hashCode = this.f13114c.hashCode() * 31;
                    b0 b0Var2 = this.f13112a;
                    return this.f13113b.hashCode() + ((hashCode + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31);
                }
            }));
            Object H16 = c0506o.H();
            if (H16 == obj) {
                H16 = new C2181h(c2187n5);
                c0506o.d0(H16);
            }
            C2181h c2181h = (C2181h) H16;
            int i15 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            m c11 = o.c(c0506o, c10);
            InterfaceC0022k.g.getClass();
            C c12 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c12);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, c2181h);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !l.a(c0506o.H(), Integer.valueOf(i15))) {
                c0506o.d0(Integer.valueOf(i15));
                c0506o.c(Integer.valueOf(i15), c0020i);
            }
            C0480b.s(c0506o, C0021j.f242c, c11);
            c0506o.S(-1490874326);
            int size2 = c0691r.size();
            int i16 = r13;
            while (i16 < size2) {
                C0691r c0691r5 = c0691r;
                Object obj5 = c0691r5.get(i16);
                c0506o.O(cVar2.invoke(obj5), 1908442329, r13, null);
                Rb.e eVar3 = (Rb.e) c2046i.g(obj5);
                if (eVar3 == null) {
                    c0506o.S(-967793488);
                } else {
                    c0506o.S(1908443505);
                    eVar3.invoke(c0506o, Integer.valueOf((int) r13));
                }
                c0506o.p(r13);
                c0506o.p(r13);
                i16++;
                c0691r = c0691r5;
            }
            c0506o.p(r13);
            c0506o.p(true);
        } else {
            c0506o.N();
        }
        C0505n0 r11 = c0506o.r();
        if (r11 != null) {
            r11.f8432d = new s(i0Var, mVar, (Rb.c) cVar, eVar, cVar2, eVar2, i7);
        }
    }
}
