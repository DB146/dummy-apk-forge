package androidx.compose.ui.viewinterop;

import A0.AbstractC0012d0;
import A0.C0021j;
import A0.InterfaceC0022k;
import A0.L;
import B0.AbstractC0207v0;
import B0.C0166a0;
import Q.C0480b;
import Q.C0498k;
import Q.C0502m;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q2.e;
import Rb.c;
import V0.l;
import Y.d;
import Y0.b;
import Y0.q;
import Z.j;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.m;
import c0.o;
import h0.C1229p;
import l2.InterfaceC1479x;
import m2.AbstractC1546a;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(c cVar, m mVar, c cVar2, C0506o c0506o, int i7) {
        c0506o.U(-1783766393);
        int i10 = (c0506o.i(cVar) ? 4 : 2) | i7 | (c0506o.i(cVar2) ? 256 : 128);
        if (c0506o.K(i10 & 1, (i10 & 147) != 146)) {
            b(cVar, mVar, cVar2, c0506o, ((i10 << 6) & 57344) | (i10 & 14) | 3120);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0166a0(cVar, mVar, cVar2, i7, 2);
        }
    }

    public static final void b(c cVar, m mVar, c cVar2, C0506o c0506o, int i7) {
        int i10;
        InterfaceC1479x interfaceC1479x;
        InterfaceC0493h0 interfaceC0493h0;
        e eVar;
        l lVar;
        Object obj;
        V0.c cVar3;
        m mVar2;
        Object obj2 = b.f11071e;
        c0506o.U(-180024211);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.i(cVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.g(mVar) ? 32 : 16;
        }
        int i11 = i10 | 384;
        if ((i7 & 3072) == 0) {
            i11 |= c0506o.i(obj2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= c0506o.i(cVar2) ? 16384 : 8192;
        }
        if (c0506o.K(i11 & 1, (i11 & 9363) != 9362)) {
            int i12 = c0506o.f8449P;
            m c10 = mVar.c(FocusGroupPropertiesElement.f13215a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC0012d0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // A0.AbstractC0012d0
                public final c0.l d() {
                    return new C1229p(0, null, 7);
                }

                @Override // A0.AbstractC0012d0
                public final /* bridge */ /* synthetic */ void e(c0.l lVar2) {
                }

                public final boolean equals(Object obj3) {
                    return obj3 == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }
            };
            m c11 = o.c(c0506o, c10.c(focusTargetNode$FocusTargetElement).c(FocusTargetPropertiesElement.f13216a).c(focusTargetNode$FocusTargetElement));
            V0.c cVar4 = (V0.c) c0506o.k(AbstractC0207v0.f1993h);
            l lVar2 = (l) c0506o.k(AbstractC0207v0.f1997n);
            InterfaceC0493h0 m10 = c0506o.m();
            InterfaceC1479x interfaceC1479x2 = (InterfaceC1479x) c0506o.k(AbstractC1546a.f19776a);
            e eVar2 = (e) c0506o.k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            c0506o.S(608635513);
            int i13 = i11 & 14;
            int i14 = c0506o.f8449P;
            Context context = (Context) c0506o.k(AndroidCompositionLocals_androidKt.f13207b);
            C0502m q10 = C0480b.q(c0506o);
            j jVar = (j) c0506o.k(Z.l.f12101a);
            View view = (View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f);
            boolean i15 = c0506o.i(context) | ((((i13 & 14) ^ 6) > 4 && c0506o.g(cVar)) || (i13 & 6) == 4) | c0506o.i(q10) | c0506o.i(jVar) | c0506o.e(i14) | c0506o.i(view);
            Object H10 = c0506o.H();
            if (i15 || H10 == C0498k.f8409a) {
                interfaceC1479x = interfaceC1479x2;
                interfaceC0493h0 = m10;
                eVar = eVar2;
                lVar = lVar2;
                obj = obj2;
                cVar3 = cVar4;
                mVar2 = c11;
                Object mVar3 = new Y0.m(context, cVar, q10, jVar, i14, view);
                c0506o.d0(mVar3);
                H10 = mVar3;
            } else {
                mVar2 = c11;
                interfaceC0493h0 = m10;
                eVar = eVar2;
                interfaceC1479x = interfaceC1479x2;
                lVar = lVar2;
                obj = obj2;
                cVar3 = cVar4;
            }
            Rb.a aVar = (Rb.a) H10;
            c0506o.O(null, 125, 1, null);
            c0506o.f8464q = true;
            if (c0506o.f8448O) {
                c0506o.l(aVar);
            } else {
                c0506o.g0();
            }
            InterfaceC0022k.g.getClass();
            C0480b.s(c0506o, C0021j.f243d, interfaceC0493h0);
            C0480b.s(c0506o, Y0.l.f11120d, mVar2);
            C0480b.s(c0506o, Y0.l.f11121e, cVar3);
            C0480b.s(c0506o, Y0.l.f11122f, interfaceC1479x);
            C0480b.s(c0506o, Y0.l.f11123u, eVar);
            C0480b.s(c0506o, Y0.l.f11124v, lVar);
            Rb.e eVar3 = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i12))) {
                c0506o.d0(Integer.valueOf(i12));
                c0506o.c(Integer.valueOf(i12), eVar3);
            }
            C0480b.s(c0506o, Y0.l.f11118b, cVar2);
            C0480b.s(c0506o, Y0.l.f11119c, obj);
            c0506o.p(true);
            c0506o.p(false);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new d(cVar, mVar, cVar2, i7, 1);
        }
    }

    public static final q c(L l10) {
        q qVar = l10.f45C;
        if (qVar != null) {
            return qVar;
        }
        throw X.c.c("Required value was null.");
    }
}
