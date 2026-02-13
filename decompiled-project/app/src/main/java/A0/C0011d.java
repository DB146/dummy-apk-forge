package A0;

import F.C0261e;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import cc.C0944m;
import h0.InterfaceC1222i;
import h0.InterfaceC1225l;
import ia.C1358d;
import java.util.HashSet;
import u.C2042E;
import u.C2046I;
import u0.C2075e;
import u0.C2080j;
import u0.C2085o;
import u0.C2086p;
import u0.EnumC2076f;
import u0.EnumC2084n;
import w.C2183j;
import x0.AbstractC2256a;
import y.C2289K;
import y0.InterfaceC2317B;
import y0.InterfaceC2345m;
import z0.C2579a;
import z0.InterfaceC2581c;

/* renamed from: A0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011d extends c0.l implements InterfaceC0035y, InterfaceC0026o, A0, y0, InterfaceC2581c, w0, InterfaceC0034x, InterfaceC0027p, InterfaceC1225l, u0, InterfaceC0024m {

    /* renamed from: C, reason: collision with root package name */
    public c0.k f199C;

    /* renamed from: D, reason: collision with root package name */
    public HashSet f200D;

    @Override // A0.y0
    public final boolean E() {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C2086p) kVar).f24795d.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // A0.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(C2075e c2075e, EnumC2076f enumC2076f, long j) {
        boolean z8;
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l2.X x2 = ((C2086p) kVar).f24795d;
        x2.getClass();
        ?? r10 = c2075e.f24754a;
        C2086p c2086p = (C2086p) x2.f19196d;
        if (!c2086p.f24794c) {
            int size = r10.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2080j c2080j = (C2080j) r10.get(i7);
                if (!u0.u.a(c2080j) && !u0.u.b(c2080j)) {
                }
            }
            z8 = false;
            if (((EnumC2084n) x2.f19195c) != EnumC2084n.f24788c) {
                if (enumC2076f == EnumC2076f.f24757a && z8) {
                    x2.l(c2075e);
                }
                if (enumC2076f == EnumC2076f.f24759c && !z8) {
                    x2.l(c2075e);
                }
            }
            if (enumC2076f != EnumC2076f.f24759c) {
                int size2 = r10.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (!u0.u.b((C2080j) r10.get(i10))) {
                        return;
                    }
                }
                x2.f19195c = EnumC2084n.f24786a;
                c2086p.f24794c = false;
                return;
            }
            return;
        }
        z8 = true;
        if (((EnumC2084n) x2.f19195c) != EnumC2084n.f24788c) {
        }
        if (enumC2076f != EnumC2076f.f24759c) {
        }
    }

    @Override // A0.y0
    public final void L() {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        l2.X x2 = ((C2086p) kVar).f24795d;
        if (((EnumC2084n) x2.f19195c) == EnumC2084n.f24787b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C2086p c2086p = (C2086p) x2.f19196d;
            C2085o c2085o = new C2085o(c2086p, 1);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            c2085o.invoke(obtain);
            obtain.recycle();
            x2.f19195c = EnumC2084n.f24786a;
            c2086p.f24794c = false;
        }
    }

    @Override // A0.w0
    public final Object S(Object obj) {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C2183j) kVar;
    }

    @Override // A0.InterfaceC0034x
    public final void T(InterfaceC2345m interfaceC2345m) {
    }

    @Override // A0.InterfaceC0026o
    public final void U() {
        AbstractC0017g.k(this);
    }

    @Override // A0.y0
    public final void V() {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C2086p) kVar).f24795d.getClass();
    }

    @Override // A0.InterfaceC0024m, A0.y0
    public final void a() {
        if (this.f199C instanceof C2086p) {
            L();
        }
    }

    @Override // z0.InterfaceC2581c
    public final Q5.e c() {
        return C2579a.f28152d;
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        int i7;
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) kVar;
        H0.i iVar2 = new H0.i();
        iVar2.f4496c = appendedSemanticsElement.f13212a;
        appendedSemanticsElement.f13213b.invoke(iVar2);
        kotlin.jvm.internal.l.c(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (iVar2.f4496c) {
            iVar.f4496c = true;
        }
        if (iVar2.f4497d) {
            iVar.f4497d = true;
        }
        C2046I c2046i = iVar2.f4494a;
        Object[] objArr = c2046i.f24604b;
        Object[] objArr2 = c2046i.f24605c;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        H0.t tVar = (H0.t) obj;
                        C2046I c2046i2 = iVar.f4494a;
                        if (!c2046i2.b(tVar)) {
                            c2046i2.l(tVar, obj2);
                        } else if (obj2 instanceof H0.a) {
                            Object g = c2046i2.g(tVar);
                            kotlin.jvm.internal.l.c(g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            H0.a aVar = (H0.a) g;
                            String str = aVar.f4460a;
                            if (str == null) {
                                str = ((H0.a) obj2).f4460a;
                            }
                            Db.c cVar = aVar.f4461b;
                            if (cVar == null) {
                                cVar = ((H0.a) obj2).f4461b;
                            }
                            c2046i2.l(tVar, new H0.a(str, cVar));
                        }
                        i7 = 8;
                    } else {
                        i7 = i11;
                    }
                    j >>= i7;
                    i13++;
                    i11 = i7;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, y0.z zVar, long j) {
        kotlin.jvm.internal.l.c(this.f199C, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // c0.l
    public final void h0() {
        p0(true);
    }

    @Override // A0.InterfaceC0027p
    public final void i(n0 n0Var) {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0261e c0261e = (C0261e) kVar;
        if (c0261e.f3971a) {
            return;
        }
        c0261e.f3971a = true;
        C0944m c0944m = c0261e.f3972b;
        if (c0944m != null) {
            c0944m.resumeWith(Db.q.f3365a);
        }
        c0261e.f3972b = null;
    }

    @Override // c0.l
    public final void i0() {
        r0();
    }

    @Override // A0.InterfaceC0034x
    public final void l(long j) {
    }

    public final void p0(boolean z8) {
        if (!this.f14112B) {
            AbstractC2256a.b("initializeModifier called on unattached node");
        }
        c0.k kVar = this.f199C;
        if ((this.f14115c & 32) != 0 && (kVar instanceof C.v)) {
            C0009c c0009c = new C0009c(this, 0);
            C2042E c2042e = ((B0.D) AbstractC0017g.u(this)).f1591H0;
            if (c2042e.f(c0009c) < 0) {
                c2042e.a(c0009c);
            }
        }
        if ((this.f14115c & 4) != 0 && !z8) {
            AbstractC0017g.r(this, 2).A0();
        }
        if ((this.f14115c & 2) != 0) {
            B0 b02 = (B0) AbstractC0017g.t(this).f60S.f228e;
            kotlin.jvm.internal.l.c(b02, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (b02.f12C) {
                n0 n0Var = this.f14120v;
                kotlin.jvm.internal.l.b(n0Var);
                ((A) n0Var).P0(this);
                s0 s0Var = n0Var.f292T;
                if (s0Var != null) {
                    s0Var.invalidate();
                }
            }
            if (!z8) {
                AbstractC0017g.r(this, 2).A0();
                AbstractC0017g.t(this).C();
            }
        }
        if (kVar instanceof E.x) {
            ((E.x) kVar).f3507a.j = AbstractC0017g.t(this);
        }
        if ((this.f14115c & 256) != 0 && (kVar instanceof C0261e)) {
            B0 b03 = (B0) AbstractC0017g.t(this).f60S.f228e;
            kotlin.jvm.internal.l.c(b03, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (b03.f12C) {
                AbstractC0017g.t(this).C();
            }
        }
        int i7 = this.f14115c;
        if ((i7 & 16) != 0 && (kVar instanceof C2086p)) {
            ((C2086p) kVar).f24795d.f19194b = this.f14120v;
        }
        if ((i7 & 8) != 0) {
            ((B0.D) AbstractC0017g.u(this)).B();
        }
    }

    public final void q0() {
        c0.k kVar = this.f199C;
        AbstractC2256a.b("onFocusEvent called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }

    @Override // A0.u0
    public final boolean r() {
        return this.f14112B;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Rb.a, kotlin.jvm.internal.m] */
    public final void r0() {
        if (!this.f14112B) {
            AbstractC2256a.b("unInitializeModifier called on unattached node");
        }
        c0.k kVar = this.f199C;
        if ((this.f14115c & 32) != 0 && (kVar instanceof C.v)) {
            C.v vVar = (C.v) kVar;
            C0013e c0013e = AbstractC0017g.f222a;
            vVar.getClass();
            C1358d c1358d = C.T.f2390a;
            c0013e.getClass();
            C.O o10 = (C.O) ((kotlin.jvm.internal.m) c1358d.f18487b).invoke();
            if (!kotlin.jvm.internal.l.a(o10, vVar.f2441b)) {
                vVar.f2441b = o10;
                vVar.f2440a.invoke(o10);
            }
        }
        if ((this.f14115c & 8) != 0) {
            ((B0.D) AbstractC0017g.u(this)).B();
        }
    }

    public final void s0() {
        if (this.f14112B) {
            this.f200D.clear();
            ((B0.D) AbstractC0017g.u(this)).getSnapshotObserver().a(this, C0015f.f204b, new C0009c(this, 1));
        }
    }

    @Override // A0.InterfaceC0026o
    public final void t(N n6) {
        c0.k kVar = this.f199C;
        kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C2289K) kVar).f26414a.a(n6);
    }

    public final String toString() {
        return this.f199C.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // z0.InterfaceC2581c
    public final Object w(C1358d c1358d) {
        C0018g0 c0018g0;
        this.f200D.add(c1358d);
        if (!this.f14113a.f14112B) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar = this.f14113a.f14117e;
        L t5 = AbstractC0017g.t(this);
        while (t5 != null) {
            if ((((c0.l) t5.f60S.f229f).f14116d & 32) != 0) {
                while (lVar != null) {
                    if ((lVar.f14115c & 32) != 0) {
                        AbstractC0025n abstractC0025n = lVar;
                        ?? r42 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof InterfaceC2581c) {
                                InterfaceC2581c interfaceC2581c = (InterfaceC2581c) abstractC0025n;
                                if (interfaceC2581c.c().r(c1358d)) {
                                    return interfaceC2581c.c().w(c1358d);
                                }
                            } else if ((abstractC0025n.f14115c & 32) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar2 = abstractC0025n.f269D;
                                int i7 = 0;
                                abstractC0025n = abstractC0025n;
                                r42 = r42;
                                while (lVar2 != null) {
                                    if ((lVar2.f14115c & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            abstractC0025n = lVar2;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r42.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r42.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r42);
                        }
                    }
                    lVar = lVar.f14117e;
                }
            }
            t5 = t5.t();
            lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        return ((kotlin.jvm.internal.m) c1358d.f18487b).invoke();
    }

    @Override // h0.InterfaceC1225l
    public final void x(InterfaceC1222i interfaceC1222i) {
        c0.k kVar = this.f199C;
        AbstractC2256a.b("applyFocusProperties called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }
}
