package androidx.compose.ui.platform;

import A0.C0005a;
import A0.j0;
import B0.A0;
import B0.AbstractC0207v0;
import B0.C0166a0;
import B0.C0170c0;
import B0.C0188l0;
import B0.C0195p;
import B0.C0209w0;
import B0.C0213y0;
import B0.C0215z0;
import B0.ComponentCallbacks2C0172d0;
import B0.ComponentCallbacks2C0174e0;
import B0.D;
import B0.Y;
import B0.r;
import Db.q;
import F0.a;
import F0.b;
import Q.AbstractC0499k0;
import Q.C0480b;
import Q.C0498k;
import Q.C0501l0;
import Q.C0505n0;
import Q.C0506o;
import Q.C0523z;
import Q.S0;
import Q.W;
import Rb.c;
import Y.e;
import Y.f;
import Z.j;
import Z.k;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import m2.AbstractC1546a;
import q0.InterfaceC1873a;
import q3.s;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final C0523z f13206a = new C0523z(Y.f1828b);

    /* renamed from: b, reason: collision with root package name */
    public static final S0 f13207b = new AbstractC0499k0(Y.f1829c);

    /* renamed from: c, reason: collision with root package name */
    public static final S0 f13208c = new AbstractC0499k0(Y.f1830d);

    /* renamed from: d, reason: collision with root package name */
    public static final S0 f13209d = new AbstractC0499k0(Y.f1831e);

    /* renamed from: e, reason: collision with root package name */
    public static final S0 f13210e = new AbstractC0499k0(Y.f1832f);

    /* renamed from: f, reason: collision with root package name */
    public static final S0 f13211f = new AbstractC0499k0(Y.f1833u);

    public static final void a(D d10, e eVar, C0506o c0506o, int i7) {
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z8;
        int i10 = 2;
        c0506o.U(1396852028);
        int i11 = (c0506o.i(d10) ? 4 : 2) | i7 | (c0506o.i(eVar) ? 32 : 16);
        if (c0506o.K(i11 & 1, (i11 & 19) != 18)) {
            Context context = d10.getContext();
            Object H10 = c0506o.H();
            Object obj = C0498k.f8409a;
            if (H10 == obj) {
                H10 = C0480b.o(new Configuration(context.getResources().getConfiguration()));
                c0506o.d0(H10);
            }
            W w10 = (W) H10;
            Object H11 = c0506o.H();
            if (H11 == obj) {
                H11 = new C0005a(w10, i10);
                c0506o.d0(H11);
            }
            d10.setConfigurationChangeObserver((c) H11);
            Object H12 = c0506o.H();
            if (H12 == obj) {
                H12 = new Object();
                c0506o.d0(H12);
            }
            C0188l0 c0188l0 = (C0188l0) H12;
            C0195p viewTreeOwners = d10.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object H13 = c0506o.H();
            Q2.e eVar2 = viewTreeOwners.f1944b;
            if (H13 == obj) {
                Object parent = d10.getParent();
                l.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = j.class.getSimpleName() + ':' + str;
                s b2 = eVar2.b();
                Bundle o10 = b2.o(str2);
                if (o10 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : o10.keySet()) {
                        ArrayList parcelableArrayList = o10.getParcelableArrayList(str3);
                        l.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        o10 = o10;
                    }
                } else {
                    linkedHashMap = null;
                }
                r rVar = r.f1964f;
                S0 s02 = Z.l.f12101a;
                k kVar = new k(linkedHashMap, rVar);
                try {
                    b2.D(str2, new C0215z0(kVar, 0));
                    z8 = true;
                } catch (IllegalArgumentException unused) {
                    z8 = false;
                }
                Object c0213y0 = new C0213y0(kVar, new A0(z8, b2, str2));
                c0506o.d0(c0213y0);
                H13 = c0213y0;
            }
            Object obj2 = (C0213y0) H13;
            q qVar = q.f3365a;
            boolean i12 = c0506o.i(obj2);
            Object H14 = c0506o.H();
            if (i12 || H14 == obj) {
                H14 = new C0005a(obj2, 3);
                c0506o.d0(H14);
            }
            C0480b.c(qVar, (c) H14, c0506o);
            Object H15 = c0506o.H();
            if (H15 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        H15 = new C0209w0(d10.getView());
                        c0506o.d0(H15);
                    }
                }
                H15 = new Object();
                c0506o.d0(H15);
            }
            InterfaceC1873a interfaceC1873a = (InterfaceC1873a) H15;
            Configuration configuration = (Configuration) w10.getValue();
            Object H16 = c0506o.H();
            if (H16 == obj) {
                H16 = new a();
                c0506o.d0(H16);
            }
            a aVar = (a) H16;
            Object H17 = c0506o.H();
            Object obj3 = H17;
            if (H17 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0506o.d0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object H18 = c0506o.H();
            if (H18 == obj) {
                H18 = new ComponentCallbacks2C0172d0(configuration3, aVar);
                c0506o.d0(H18);
            }
            ComponentCallbacks2C0172d0 componentCallbacks2C0172d0 = (ComponentCallbacks2C0172d0) H18;
            boolean i13 = c0506o.i(context);
            Object H19 = c0506o.H();
            if (i13 || H19 == obj) {
                H19 = new C0170c0(0, context, componentCallbacks2C0172d0);
                c0506o.d0(H19);
            }
            C0480b.c(aVar, (c) H19, c0506o);
            Object H20 = c0506o.H();
            if (H20 == obj) {
                H20 = new b();
                c0506o.d0(H20);
            }
            b bVar = (b) H20;
            Object H21 = c0506o.H();
            if (H21 == obj) {
                H21 = new ComponentCallbacks2C0174e0(bVar);
                c0506o.d0(H21);
            }
            ComponentCallbacks2C0174e0 componentCallbacks2C0174e0 = (ComponentCallbacks2C0174e0) H21;
            boolean i14 = c0506o.i(context);
            Object H22 = c0506o.H();
            if (i14 || H22 == obj) {
                H22 = new C0170c0(1, context, componentCallbacks2C0174e0);
                c0506o.d0(H22);
            }
            C0480b.c(bVar, (c) H22, c0506o);
            AbstractC0499k0 abstractC0499k0 = AbstractC0207v0.f2005v;
            C0480b.b(new C0501l0[]{f13206a.a((Configuration) w10.getValue()), f13207b.a(context), AbstractC1546a.f19776a.a(viewTreeOwners.f1943a), f13210e.a(eVar2), Z.l.f12101a.a(obj2), f13211f.a(d10.getView()), f13208c.a(aVar), f13209d.a(bVar), abstractC0499k0.a(Boolean.valueOf(((Boolean) c0506o.k(abstractC0499k0)).booleanValue() | d10.getScrollCaptureInProgress$ui_release())), AbstractC0207v0.f1995l.a(interfaceC1873a)}, f.d(1471621628, new C0166a0(d10, c0188l0, eVar, 0), c0506o), c0506o, 56);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new j0(d10, eVar, i7, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0499k0 getLocalLifecycleOwner() {
        return AbstractC1546a.f19776a;
    }

    public static final AbstractC0499k0 getLocalSavedStateRegistryOwner() {
        return f13210e;
    }
}
