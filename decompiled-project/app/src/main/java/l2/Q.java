package l2;

import Y5.C0656w;
import Y5.C0660y;
import Y5.C0662z;
import android.os.Bundle;
import android.view.View;
import cc.F0;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kc.C1441d;
import q2.C1884a;
import q2.C1886c;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0660y f19174a = new C0660y(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C0662z f19175b = new C0662z(12);

    /* renamed from: c, reason: collision with root package name */
    public static final Y5.A f19176c = new Y5.A(12);

    /* renamed from: d, reason: collision with root package name */
    public static final C1886c f19177d = new Object();

    public static final void a(Y y10, q3.s registry, C1481z lifecycle) {
        kotlin.jvm.internal.l.e(registry, "registry");
        kotlin.jvm.internal.l.e(lifecycle, "lifecycle");
        O o10 = (O) y10.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (o10 == null || o10.f19173c) {
            return;
        }
        o10.l(lifecycle, registry);
        EnumC1474s enumC1474s = lifecycle.f19242d;
        if (enumC1474s == EnumC1474s.f19228b || enumC1474s.compareTo(EnumC1474s.f19230d) >= 0) {
            registry.E();
        } else {
            lifecycle.a(new C1464h(lifecycle, registry));
        }
    }

    public static final N b(o2.c cVar) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        Q2.e eVar = (Q2.e) cVar.a(f19174a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        e0 e0Var = (e0) cVar.a(f19175b);
        if (e0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f19176c);
        String str = (String) cVar.a(c0.f19205b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Q2.d u3 = eVar.b().u();
        Bundle bundle2 = null;
        S s3 = u3 instanceof S ? (S) u3 : null;
        if (s3 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = g(e0Var).f19182a;
        N n6 = (N) linkedHashMap.get(str);
        if (n6 == null) {
            s3.b();
            Bundle bundle3 = s3.f19180c;
            if (bundle3 != null && bundle3.containsKey(str)) {
                Bundle bundle4 = bundle3.getBundle(str);
                if (bundle4 == null) {
                    bundle4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
                }
                bundle3.remove(str);
                if (bundle3.isEmpty()) {
                    s3.f19180c = null;
                }
                bundle2 = bundle4;
            }
            if (bundle2 != null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                n6 = new N();
            } else {
                ClassLoader classLoader = N.class.getClassLoader();
                kotlin.jvm.internal.l.b(classLoader);
                bundle.setClassLoader(classLoader);
                Fb.f fVar = new Fb.f(bundle.size());
                for (String str2 : bundle.keySet()) {
                    kotlin.jvm.internal.l.b(str2);
                    fVar.put(str2, bundle.get(str2));
                }
                n6 = new N(fVar.b());
            }
            linkedHashMap.put(str, n6);
        }
        return n6;
    }

    public static final void c(Q2.e eVar) {
        kotlin.jvm.internal.l.e(eVar, "<this>");
        EnumC1474s enumC1474s = eVar.w().f19242d;
        if (enumC1474s != EnumC1474s.f19228b && enumC1474s != EnumC1474s.f19229c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().u() == null) {
            S s3 = new S(eVar.b(), (e0) eVar);
            eVar.b().D("androidx.lifecycle.internal.SavedStateHandlesProvider", s3);
            eVar.w().a(new C1461e(s3, 1));
        }
    }

    public static final InterfaceC1479x d(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC1479x interfaceC1479x = tag instanceof InterfaceC1479x ? (InterfaceC1479x) tag : null;
            if (interfaceC1479x != null) {
                return interfaceC1479x;
            }
            Object q10 = android.support.v4.media.session.b.q(view);
            view = q10 instanceof View ? (View) q10 : null;
        }
        return null;
    }

    public static final e0 e(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            e0 e0Var = tag instanceof e0 ? (e0) tag : null;
            if (e0Var != null) {
                return e0Var;
            }
            Object q10 = android.support.v4.media.session.b.q(view);
            view = q10 instanceof View ? (View) q10 : null;
        }
        return null;
    }

    public static final C1476u f(InterfaceC1479x interfaceC1479x) {
        C1476u c1476u;
        kotlin.jvm.internal.l.e(interfaceC1479x, "<this>");
        C1481z w10 = interfaceC1479x.w();
        kotlin.jvm.internal.l.e(w10, "<this>");
        loop0: while (true) {
            c0 c0Var = w10.f19239a;
            c1476u = (C1476u) ((AtomicReference) c0Var.f19206a).get();
            if (c1476u == null) {
                F0 d10 = cc.F.d();
                C1441d c1441d = cc.P.f14498a;
                c1476u = new C1476u(w10, E6.b.w(d10, hc.o.f17967a.f16631f));
                AtomicReference atomicReference = (AtomicReference) c0Var.f19206a;
                while (!atomicReference.compareAndSet(null, c1476u)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                C1441d c1441d2 = cc.P.f14498a;
                cc.F.B(c1476u, hc.o.f17967a.f16631f, 0, new C1475t(c1476u, null), 2);
                break loop0;
            }
            break;
        }
        return c1476u;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l2.a0] */
    public static final T g(e0 e0Var) {
        kotlin.jvm.internal.l.e(e0Var, "<this>");
        c0 e2 = C0656w.e(e0Var, new Object(), 4);
        return (T) ((q3.n) e2.f19206a).l(kotlin.jvm.internal.w.a(T.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C1884a h(ta.c cVar) {
        C1884a c1884a;
        synchronized (f19177d) {
            c1884a = (C1884a) cVar.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c1884a == null) {
                Hb.i iVar = Hb.j.f4919a;
                try {
                    C1441d c1441d = cc.P.f14498a;
                    iVar = hc.o.f17967a.f16631f;
                } catch (Db.i | IllegalStateException unused) {
                }
                C1884a c1884a2 = new C1884a(iVar.plus(cc.F.d()));
                cVar.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c1884a2);
                c1884a = c1884a2;
            }
        }
        return c1884a;
    }

    public static final void i(View view, InterfaceC1479x interfaceC1479x) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1479x);
    }

    public static final void j(View view, e0 e0Var) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, e0Var);
    }
}
