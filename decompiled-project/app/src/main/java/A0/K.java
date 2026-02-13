package A0;

import A9.N2;
import B0.C0192n0;
import B0.I0;
import B0.V0;
import B0.X0;
import B0.c1;
import Q.C0517u;
import W1.C0571n;
import a.AbstractC0672a;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h0.C1229p;
import hc.C1277e;
import java.util.LinkedHashSet;
import java.util.UUID;
import kc.C1441d;
import l2.InterfaceC1470n;
import n3.AbstractC1698c;
import n3.C1696a;
import u.C2047J;
import y.C2281C;
import y.C2308p;
import y0.AbstractC2321F;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, Object obj, Object obj2) {
        super(0);
        this.f37a = i7;
        this.f38b = obj;
        this.f39c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(kotlin.jvm.internal.v vVar, c0.l lVar, int i7) {
        super(0);
        this.f37a = i7;
        this.f39c = vVar;
        this.f38b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [Db.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [S.e] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [S.e] */
    @Override // Rb.a
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        H0.n nVar;
        L l10;
        l2.a0 n6;
        i0.c cVar;
        int i7 = 7;
        switch (this.f37a) {
            case 0:
                C0018g0 c0018g0 = ((L) this.f38b).f60S;
                if ((((c0.l) c0018g0.f229f).f14116d & 8) != 0) {
                    for (c0.l lVar = (B0) c0018g0.f228e; lVar != null; lVar = lVar.f14117e) {
                        if ((lVar.f14115c & 8) != 0) {
                            AbstractC0025n abstractC0025n = lVar;
                            ?? r42 = 0;
                            while (abstractC0025n != 0) {
                                if (abstractC0025n instanceof A0) {
                                    A0 a02 = (A0) abstractC0025n;
                                    boolean M3 = a02.M();
                                    kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f39c;
                                    if (M3) {
                                        H0.i iVar = new H0.i();
                                        vVar.f19134a = iVar;
                                        iVar.f4497d = true;
                                    }
                                    if (a02.O()) {
                                        ((H0.i) vVar.f19134a).f4496c = true;
                                    }
                                    a02.c0((H0.i) vVar.f19134a);
                                } else if ((abstractC0025n.f14115c & 8) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                    c0.l lVar2 = abstractC0025n.f269D;
                                    int i10 = 0;
                                    abstractC0025n = abstractC0025n;
                                    r42 = r42;
                                    while (lVar2 != null) {
                                        if ((lVar2.f14115c & 8) != 0) {
                                            i10++;
                                            r42 = r42;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC0025n = AbstractC0017g.e(r42);
                            }
                        }
                    }
                }
                return Db.q.f3365a;
            case 1:
                Rb.c c10 = ((x0) this.f38b).f325a.c();
                if (c10 != null) {
                    T t5 = (T) this.f39c;
                    t5.getClass();
                    c10.invoke(new S(t5));
                }
                return Db.q.f3365a;
            case 2:
                Y y10 = (Y) this.f38b;
                P p10 = y10.f145f;
                p10.f99h = 0;
                S.e x2 = p10.f93a.x();
                Object[] objArr = x2.f8959a;
                int i11 = x2.f8961c;
                for (int i12 = 0; i12 < i11; i12++) {
                    Y y11 = ((L) objArr[i12]).f61T.f106q;
                    kotlin.jvm.internal.l.b(y11);
                    y11.f147v = y11.f148w;
                    y11.f148w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    if (y11.f149x == H.f31b) {
                        y11.f149x = H.f32c;
                    }
                }
                P p11 = y10.f145f;
                S.e x10 = p11.f93a.x();
                Object[] objArr2 = x10.f8959a;
                int i13 = x10.f8961c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Y y12 = ((L) objArr2[i14]).f61T.f106q;
                    kotlin.jvm.internal.l.b(y12);
                    y12.f138E.getClass();
                }
                C0030t c0030t = y10.i().f311Z;
                L l11 = p11.f93a;
                if (c0030t != null) {
                    boolean z8 = c0030t.f115v;
                    S.b bVar = (S.b) l11.n();
                    int i15 = bVar.f8953a.f8961c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        U r02 = ((n0) ((L) bVar.get(i16)).f60S.f227d).r0();
                        if (r02 != null) {
                            r02.f115v = z8;
                        }
                    }
                }
                ((C0030t) this.f39c).c0().b();
                if (y10.i().f311Z != null) {
                    S.b bVar2 = (S.b) l11.n();
                    int i17 = bVar2.f8953a.f8961c;
                    for (int i18 = 0; i18 < i17; i18++) {
                        U r03 = ((n0) ((L) bVar2.get(i18)).f60S.f227d).r0();
                        if (r03 != null) {
                            r03.f115v = false;
                        }
                    }
                }
                S.e x11 = l11.x();
                Object[] objArr3 = x11.f8959a;
                int i19 = x11.f8961c;
                for (int i20 = 0; i20 < i19; i20++) {
                    Y y13 = ((L) objArr3[i20]).f61T.f106q;
                    kotlin.jvm.internal.l.b(y13);
                    int i21 = y13.f147v;
                    int i22 = y13.f148w;
                    if (i21 != i22 && i22 == Integer.MAX_VALUE) {
                        y13.R(true);
                    }
                }
                S.e x12 = l11.x();
                Object[] objArr4 = x12.f8959a;
                int i23 = x12.f8961c;
                for (int i24 = 0; i24 < i23; i24++) {
                    Y y14 = ((L) objArr4[i24]).f61T.f106q;
                    kotlin.jvm.internal.l.b(y14);
                    M m10 = y14.f138E;
                    m10.getClass();
                    m10.f85c = false;
                }
                return Db.q.f3365a;
            case 3:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f39c);
                return Boolean.valueOf(dispatchKeyEvent);
            case 4:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) this.f39c);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 5:
                B0.D d10 = (B0.D) this.f38b;
                C0192n0 androidViewsHandler$ui_release = d10.getAndroidViewsHandler$ui_release();
                Y0.q qVar = (Y0.q) this.f39c;
                androidViewsHandler$ui_release.removeViewInLayout(qVar);
                d10.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(d10.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(qVar));
                qVar.setImportantForAccessibility(0);
                return Db.q.f3365a;
            case 6:
                V0 v02 = (V0) this.f38b;
                H0.g gVar = v02.f1802e;
                H0.g gVar2 = v02.f1803f;
                Float f4 = v02.f1800c;
                Float f10 = v02.f1801d;
                float floatValue = (gVar == null || f4 == null) ? 0.0f : ((Number) gVar.f4468a.invoke()).floatValue() - f4.floatValue();
                float floatValue2 = (gVar2 == null || f10 == null) ? 0.0f : ((Number) gVar2.f4468a.invoke()).floatValue() - f10.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int i25 = v02.f1798a;
                    B0.L l12 = (B0.L) this.f39c;
                    int z10 = l12.z(i25);
                    X0 x02 = (X0) l12.s().b(l12.f1735n);
                    if (x02 != null) {
                        try {
                            z1.e eVar = l12.f1737p;
                            if (eVar != null) {
                                eVar.f28173a.setBoundsInScreen(l12.k(x02));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    X0 x03 = (X0) l12.s().b(l12.f1736o);
                    if (x03 != null) {
                        try {
                            z1.e eVar2 = l12.f1738q;
                            if (eVar2 != null) {
                                eVar2.f28173a.setBoundsInScreen(l12.k(x03));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    l12.f1728d.invalidate();
                    X0 x04 = (X0) l12.s().b(z10);
                    if (x04 != null && (nVar = x04.f1809a) != null && (l10 = nVar.f4504c) != null) {
                        if (gVar != null) {
                            l12.f1740s.g(z10, gVar);
                        }
                        if (gVar2 != null) {
                            l12.f1741t.g(z10, gVar2);
                        }
                        l12.v(l10);
                    }
                }
                if (gVar != null) {
                    v02.f1800c = (Float) gVar.f4468a.invoke();
                }
                if (gVar2 != null) {
                    v02.f1801d = (Float) gVar2.f4468a.invoke();
                }
                return Db.q.f3365a;
            case 7:
                l2.e0 e0Var = (l2.e0) this.f39c.getValue();
                InterfaceC1470n interfaceC1470n = e0Var instanceof InterfaceC1470n ? (InterfaceC1470n) e0Var : null;
                return (interfaceC1470n == null || (n6 = interfaceC1470n.n()) == null) ? ((Ba.s) this.f38b).n() : n6;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                c1 c1Var = (c1) this.f38b;
                if (c1Var != null && (cVar = (i0.c) c1Var.invoke()) != null) {
                    return cVar;
                }
                n0 n0Var = (n0) this.f39c;
                if (!n0Var.t0().f14112B) {
                    n0Var = null;
                }
                if (n0Var != null) {
                    return android.support.v4.media.session.b.b(0L, AbstractC0672a.u(n0Var.f26556c));
                }
                return null;
            case 9:
                return new F.N((Z.j) this.f38b, Eb.w.f3892a, (Z.g) this.f39c);
            case 10:
                C2047J c2047j = (C2047J) this.f38b;
                Object[] objArr5 = c2047j.f24610b;
                long[] jArr = c2047j.f24609a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j = jArr[i26];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i27 = 8 - ((~(i26 - length)) >>> 31);
                            for (int i28 = 0; i28 < i27; i28++) {
                                if ((255 & j) < 128) {
                                    ((C0517u) this.f39c).z(objArr5[(i26 << 3) + i28]);
                                }
                                j >>= 8;
                            }
                            if (i27 != 8) {
                            }
                        }
                        if (i26 != length) {
                            i26++;
                        }
                    }
                }
                return Db.q.f3365a;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                C0571n c0571n = (C0571n) this.f38b;
                W1.k0 k0Var = c0571n.f10518f;
                Object obj = c0571n.f10525p;
                kotlin.jvm.internal.l.b(obj);
                k0Var.d(obj, new Aa.j(9, c0571n, (ViewGroup) this.f39c));
                return Db.q.f3365a;
            case 12:
                ((kotlin.jvm.internal.v) this.f39c).f19134a = ((C1229p) this.f38b).q0();
                return Db.q.f3365a;
            case 13:
                o3.e eVar3 = ((AbstractC1698c) this.f38b).f21064a;
                C1696a c1696a = (C1696a) this.f39c;
                eVar3.getClass();
                synchronized (eVar3.f21672c) {
                    if (((LinkedHashSet) eVar3.f21674e).remove(c1696a) && ((LinkedHashSet) eVar3.f21674e).isEmpty()) {
                        eVar3.f();
                    }
                }
                return Db.q.f3365a;
            case 14:
                i3.p pVar = (i3.p) this.f38b;
                WorkDatabase workDatabase = pVar.f18380d;
                kotlin.jvm.internal.l.d(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.u(new N2(new p5.j(6, pVar, (UUID) this.f39c), i7));
                i3.h.b(pVar.f18379c, pVar.f18380d, pVar.f18382f);
                return Db.q.f3365a;
            case 15:
                ((I0) this.f38b).f((c0.l) this.f39c);
                return Db.q.f3365a;
            case 16:
                C2308p c2308p = (C2308p) this.f38b;
                j0.D d11 = c2308p.f26500D;
                N n8 = (N) this.f39c;
                c2308p.f26505I = d11.d(n8.f90a.v(), n8.getLayoutDirection(), n8);
                return Db.q.f3365a;
            case 17:
                ((kotlin.jvm.internal.v) this.f39c).f19134a = AbstractC0017g.h((C2281C) this.f38b, AbstractC2321F.f26552a);
                return Db.q.f3365a;
            case 18:
                y3.p pVar2 = (y3.p) this.f38b;
                com.bumptech.glide.k kVar = pVar2.f26824C;
                if (kVar == null) {
                    kotlin.jvm.internal.l.j("requestBuilder");
                    throw null;
                }
                com.bumptech.glide.k kVar2 = (com.bumptech.glide.k) this.f39c;
                if (kVar.equals(kVar2)) {
                    W3.g.a("", pVar2.f26832K == null);
                    cc.E d02 = pVar2.d0();
                    C1441d c1441d = cc.P.f14498a;
                    pVar2.f26832K = cc.F.B(new C1277e(((C1277e) d02).l().plus(hc.o.f17967a.f16631f)), null, 0, new y3.m(pVar2, kVar2, null), 3);
                }
                return Db.q.f3365a;
            default:
                ((com.bumptech.glide.n) this.f38b).n((z3.c) this.f39c);
                return Db.q.f3365a;
        }
    }
}
