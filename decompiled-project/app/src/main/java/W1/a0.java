package W1;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l2.C1481z;
import l2.EnumC1474s;
import o2.C1779a;
import r2.C1916a;
import y1.AbstractC2377z;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final q3.l f10425a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.n f10426b;

    /* renamed from: c, reason: collision with root package name */
    public final C f10427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10428d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f10429e = -1;

    public a0(q3.l lVar, q3.n nVar, C c10) {
        this.f10425a = lVar;
        this.f10426b = nVar;
        this.f10427c = c10;
    }

    public a0(q3.l lVar, q3.n nVar, C c10, Bundle bundle) {
        this.f10425a = lVar;
        this.f10426b = nVar;
        this.f10427c = c10;
        c10.f10287c = null;
        c10.f10289d = null;
        c10.f10264G = 0;
        c10.f10261D = false;
        c10.f10305z = false;
        C c11 = c10.f10301v;
        c10.f10302w = c11 != null ? c11.f10293f : null;
        c10.f10301v = null;
        c10.f10285b = bundle;
        c10.f10300u = bundle.getBundle("arguments");
    }

    public a0(q3.l lVar, q3.n nVar, ClassLoader classLoader, M m10, Bundle bundle) {
        this.f10425a = lVar;
        this.f10426b = nVar;
        Z z8 = (Z) bundle.getParcelable("state");
        C a9 = m10.a(z8.f10395a);
        a9.f10293f = z8.f10396b;
        a9.f10260C = z8.f10397c;
        a9.f10262E = true;
        a9.L = z8.f10398d;
        a9.f10269M = z8.f10399e;
        a9.f10270N = z8.f10400f;
        a9.f10273Q = z8.f10401u;
        a9.f10258A = z8.f10402v;
        a9.f10272P = z8.f10403w;
        a9.f10271O = z8.f10404x;
        a9.f10286b0 = EnumC1474s.values()[z8.f10405y];
        a9.f10302w = z8.f10406z;
        a9.f10303x = z8.f10393A;
        a9.f10279W = z8.f10394B;
        this.f10427c = a9;
        a9.f10285b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a9.l0(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a9);
        }
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + c10);
        }
        Bundle bundle = c10.f10285b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        c10.f10267J.R();
        c10.f10283a = 3;
        c10.f10275S = false;
        c10.O();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + c10);
        }
        if (c10.f10277U != null) {
            Bundle bundle2 = c10.f10285b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = c10.f10287c;
            if (sparseArray != null) {
                c10.f10277U.restoreHierarchyState(sparseArray);
                c10.f10287c = null;
            }
            c10.f10275S = false;
            c10.e0(bundle3);
            if (!c10.f10275S) {
                throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onViewStateRestored()"));
            }
            if (c10.f10277U != null) {
                c10.f10290d0.c(l2.r.ON_CREATE);
            }
        }
        c10.f10285b = null;
        U u3 = c10.f10267J;
        u3.f10347H = false;
        u3.f10348I = false;
        u3.f10353O.f10392f = false;
        u3.u(4);
        this.f10425a.i(c10, false);
    }

    public final void b() {
        C c10;
        View view;
        View view2;
        int i7 = -1;
        C c11 = this.f10427c;
        View view3 = c11.f10276T;
        while (true) {
            c10 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            C c12 = tag instanceof C ? (C) tag : null;
            if (c12 != null) {
                c10 = c12;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        C c13 = c11.f10268K;
        if (c10 != null && !c10.equals(c13)) {
            int i10 = c11.f10269M;
            X1.c cVar = X1.d.f10910a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(c11);
            sb2.append(" within the view of parent fragment ");
            sb2.append(c10);
            sb2.append(" via container with ID ");
            X1.d.b(new X1.a(c11, A3.c.k(sb2, i10, " without using parent's childFragmentManager")));
            X1.d.a(c11).getClass();
        }
        q3.n nVar = this.f10426b;
        nVar.getClass();
        ViewGroup viewGroup = c11.f10276T;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) nVar.f23396b;
            int indexOf = arrayList.indexOf(c11);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        C c14 = (C) arrayList.get(indexOf);
                        if (c14.f10276T == viewGroup && (view = c14.f10277U) != null) {
                            i7 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C c15 = (C) arrayList.get(i11);
                    if (c15.f10276T == viewGroup && (view2 = c15.f10277U) != null) {
                        i7 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        c11.f10276T.addView(c11.f10277U, i7);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + c10);
        }
        C c11 = c10.f10301v;
        a0 a0Var = null;
        q3.n nVar = this.f10426b;
        if (c11 != null) {
            a0 a0Var2 = (a0) ((HashMap) nVar.f23397c).get(c11.f10293f);
            if (a0Var2 == null) {
                throw new IllegalStateException("Fragment " + c10 + " declared target fragment " + c10.f10301v + " that does not belong to this FragmentManager!");
            }
            c10.f10302w = c10.f10301v.f10293f;
            c10.f10301v = null;
            a0Var = a0Var2;
        } else {
            String str = c10.f10302w;
            if (str != null && (a0Var = (a0) ((HashMap) nVar.f23397c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(c10);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(h3.o.p(sb2, c10.f10302w, " that does not belong to this FragmentManager!"));
            }
        }
        if (a0Var != null) {
            a0Var.k();
        }
        U u3 = c10.f10265H;
        c10.f10266I = u3.f10374w;
        c10.f10268K = u3.f10376y;
        q3.l lVar = this.f10425a;
        lVar.p(c10, false);
        ArrayList arrayList = c10.f10298j0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a();
        }
        arrayList.clear();
        c10.f10267J.b(c10.f10266I, c10.x(), c10);
        c10.f10283a = 0;
        c10.f10275S = false;
        c10.R(c10.f10266I.f10311b);
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onAttach()"));
        }
        Iterator it2 = c10.f10265H.f10367p.iterator();
        while (it2.hasNext()) {
            ((Y) it2.next()).c();
        }
        U u10 = c10.f10267J;
        u10.f10347H = false;
        u10.f10348I = false;
        u10.f10353O.f10392f = false;
        u10.u(0);
        lVar.j(c10, false);
    }

    public final int d() {
        C c10 = this.f10427c;
        if (c10.f10265H == null) {
            return c10.f10283a;
        }
        int i7 = this.f10429e;
        int ordinal = c10.f10286b0.ordinal();
        if (ordinal == 1) {
            i7 = Math.min(i7, 0);
        } else if (ordinal == 2) {
            i7 = Math.min(i7, 1);
        } else if (ordinal == 3) {
            i7 = Math.min(i7, 5);
        } else if (ordinal != 4) {
            i7 = Math.min(i7, -1);
        }
        if (c10.f10260C) {
            if (c10.f10261D) {
                i7 = Math.max(this.f10429e, 2);
                View view = c10.f10277U;
                if (view != null && view.getParent() == null) {
                    i7 = Math.min(i7, 2);
                }
            } else {
                i7 = this.f10429e < 4 ? Math.min(i7, c10.f10283a) : Math.min(i7, 1);
            }
        }
        if (!c10.f10305z) {
            i7 = Math.min(i7, 1);
        }
        ViewGroup viewGroup = c10.f10276T;
        if (viewGroup != null) {
            C0573p j = C0573p.j(viewGroup, c10.E());
            j.getClass();
            o0 g = j.g(c10);
            int i10 = g != null ? g.f10532b : 0;
            o0 h10 = j.h(c10);
            r5 = h10 != null ? h10.f10532b : 0;
            int i11 = i10 == 0 ? -1 : p0.f10545a[P.c.b(i10)];
            if (i11 != -1 && i11 != 1) {
                r5 = i10;
            }
        }
        if (r5 == 2) {
            i7 = Math.min(i7, 6);
        } else if (r5 == 3) {
            i7 = Math.max(i7, 3);
        } else if (c10.f10258A) {
            i7 = c10.M() ? Math.min(i7, 1) : Math.min(i7, -1);
        }
        if (c10.f10278V && c10.f10283a < 5) {
            i7 = Math.min(i7, 4);
        }
        if (c10.f10259B && c10.f10276T != null) {
            i7 = Math.max(i7, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + c10);
        }
        return i7;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + c10);
        }
        Bundle bundle2 = c10.f10285b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (c10.f10282Z) {
            c10.f10283a = 1;
            Bundle bundle4 = c10.f10285b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            c10.f10267J.X(bundle);
            U u3 = c10.f10267J;
            u3.f10347H = false;
            u3.f10348I = false;
            u3.f10353O.f10392f = false;
            u3.u(1);
            return;
        }
        q3.l lVar = this.f10425a;
        lVar.q(c10, false);
        c10.f10267J.R();
        c10.f10283a = 1;
        c10.f10275S = false;
        c10.f10288c0.a(new Q2.b(c10, 1));
        c10.S(bundle3);
        c10.f10282Z = true;
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onCreate()"));
        }
        c10.f10288c0.d(l2.r.ON_CREATE);
        lVar.l(c10, false);
    }

    public final void f() {
        String str;
        C c10 = this.f10427c;
        if (c10.f10260C) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + c10);
        }
        Bundle bundle = c10.f10285b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater X10 = c10.X(bundle2);
        ViewGroup viewGroup = c10.f10276T;
        if (viewGroup == null) {
            int i7 = c10.f10269M;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException(A3.c.i("Cannot create fragment ", c10, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) c10.f10265H.f10375x.B(i7);
                if (viewGroup == null) {
                    if (!c10.f10262E) {
                        try {
                            str = c10.F().getResourceName(c10.f10269M);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(c10.f10269M) + " (" + str + ") for fragment " + c10);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    X1.c cVar = X1.d.f10910a;
                    X1.d.b(new X1.a(c10, "Attempting to add fragment " + c10 + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    X1.d.a(c10).getClass();
                }
            }
        }
        c10.f10276T = viewGroup;
        c10.f0(X10, viewGroup, bundle2);
        if (c10.f10277U != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + c10);
            }
            c10.f10277U.setSaveFromParentEnabled(false);
            c10.f10277U.setTag(R.id.fragment_container_view_tag, c10);
            if (viewGroup != null) {
                b();
            }
            if (c10.f10271O) {
                c10.f10277U.setVisibility(8);
            }
            if (c10.f10277U.isAttachedToWindow()) {
                View view = c10.f10277U;
                WeakHashMap weakHashMap = y1.K.f26642a;
                AbstractC2377z.c(view);
            } else {
                View view2 = c10.f10277U;
                view2.addOnAttachStateChangeListener(new B0.G(view2, 4));
            }
            Bundle bundle3 = c10.f10285b;
            c10.d0(c10.f10277U, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            c10.f10267J.u(2);
            this.f10425a.v(c10, c10.f10277U, false);
            int visibility = c10.f10277U.getVisibility();
            c10.z().f10587o = c10.f10277U.getAlpha();
            if (c10.f10276T != null && visibility == 0) {
                View findFocus = c10.f10277U.findFocus();
                if (findFocus != null) {
                    c10.z().f10588p = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + c10);
                    }
                }
                c10.f10277U.setAlpha(0.0f);
            }
        }
        c10.f10283a = 2;
    }

    public final void g() {
        C d10;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + c10);
        }
        boolean z8 = true;
        boolean z10 = c10.f10258A && !c10.M();
        q3.n nVar = this.f10426b;
        if (z10) {
            nVar.p(c10.f10293f, null);
        }
        if (!z10) {
            X x2 = (X) nVar.f23399e;
            if (!((x2.f10387a.containsKey(c10.f10293f) && x2.f10390d) ? x2.f10391e : true)) {
                String str = c10.f10302w;
                if (str != null && (d10 = nVar.d(str)) != null && d10.f10273Q) {
                    c10.f10301v = d10;
                }
                c10.f10283a = 0;
                return;
            }
        }
        F f4 = c10.f10266I;
        if (f4 != null) {
            z8 = ((X) nVar.f23399e).f10391e;
        } else {
            G g = f4.f10311b;
            if (g != null) {
                z8 = true ^ g.isChangingConfigurations();
            }
        }
        if (z10 || z8) {
            ((X) nVar.f23399e).a(c10, false);
        }
        c10.f10267J.l();
        c10.f10288c0.d(l2.r.ON_DESTROY);
        c10.f10283a = 0;
        c10.f10275S = false;
        c10.f10282Z = false;
        c10.U();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onDestroy()"));
        }
        this.f10425a.m(c10, false);
        Iterator it = nVar.f().iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (a0Var != null) {
                String str2 = c10.f10293f;
                C c11 = a0Var.f10427c;
                if (str2.equals(c11.f10302w)) {
                    c11.f10301v = c10;
                    c11.f10302w = null;
                }
            }
        }
        String str3 = c10.f10302w;
        if (str3 != null) {
            c10.f10301v = nVar.d(str3);
        }
        nVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + c10);
        }
        ViewGroup viewGroup = c10.f10276T;
        if (viewGroup != null && (view = c10.f10277U) != null) {
            viewGroup.removeView(view);
        }
        c10.f10267J.u(1);
        if (c10.f10277U != null) {
            l0 l0Var = c10.f10290d0;
            l0Var.d();
            if (l0Var.f10506e.f19242d.compareTo(EnumC1474s.f19229c) >= 0) {
                c10.f10290d0.c(l2.r.ON_DESTROY);
            }
        }
        c10.f10283a = 1;
        c10.f10275S = false;
        c10.V();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onDestroyView()"));
        }
        l2.d0 store = c10.s();
        W w10 = r2.c.f23651c;
        kotlin.jvm.internal.l.e(store, "store");
        u.U u3 = ((r2.c) new l2.c0(store, w10, C1779a.f21662b).a(kotlin.jvm.internal.w.a(r2.c.class))).f23652a;
        int f4 = u3.f();
        for (int i7 = 0; i7 < f4; i7++) {
            ((C1916a) u3.g(i7)).m();
        }
        c10.f10263F = false;
        this.f10425a.w(c10, false);
        c10.f10276T = null;
        c10.f10277U = null;
        c10.f10290d0 = null;
        c10.f10292e0.k(null);
        c10.f10261D = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + c10);
        }
        c10.f10283a = -1;
        c10.f10275S = false;
        c10.W();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onDetach()"));
        }
        U u3 = c10.f10267J;
        if (!u3.f10349J) {
            u3.l();
            c10.f10267J = new U();
        }
        this.f10425a.n(c10, false);
        c10.f10283a = -1;
        c10.f10266I = null;
        c10.f10268K = null;
        c10.f10265H = null;
        if (!c10.f10258A || c10.M()) {
            X x2 = (X) this.f10426b.f23399e;
            boolean z8 = true;
            if (x2.f10387a.containsKey(c10.f10293f) && x2.f10390d) {
                z8 = x2.f10391e;
            }
            if (!z8) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + c10);
        }
        c10.J();
    }

    public final void j() {
        C c10 = this.f10427c;
        if (c10.f10260C && c10.f10261D && !c10.f10263F) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + c10);
            }
            Bundle bundle = c10.f10285b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            c10.f0(c10.X(bundle2), null, bundle2);
            View view = c10.f10277U;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c10.f10277U.setTag(R.id.fragment_container_view_tag, c10);
                if (c10.f10271O) {
                    c10.f10277U.setVisibility(8);
                }
                Bundle bundle3 = c10.f10285b;
                c10.d0(c10.f10277U, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                c10.f10267J.u(2);
                this.f10425a.v(c10, c10.f10277U, false);
                c10.f10283a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        q3.n nVar = this.f10426b;
        boolean z8 = this.f10428d;
        C c10 = this.f10427c;
        if (z8) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + c10);
                return;
            }
            return;
        }
        try {
            this.f10428d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                int i7 = c10.f10283a;
                int i10 = 3;
                if (d10 == i7) {
                    if (!z10 && i7 == -1 && c10.f10258A && !c10.M()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + c10);
                        }
                        ((X) nVar.f23399e).a(c10, true);
                        nVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + c10);
                        }
                        c10.J();
                    }
                    if (c10.f10281Y) {
                        if (c10.f10277U != null && (viewGroup = c10.f10276T) != null) {
                            C0573p j = C0573p.j(viewGroup, c10.E());
                            if (c10.f10271O) {
                                j.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c10);
                                }
                                j.d(3, 1, this);
                            } else {
                                j.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c10);
                                }
                                j.d(2, 1, this);
                            }
                        }
                        U u3 = c10.f10265H;
                        if (u3 != null && c10.f10305z && U.M(c10)) {
                            u3.f10346G = true;
                        }
                        c10.f10281Y = false;
                        c10.f10267J.o();
                    }
                    this.f10428d = false;
                    return;
                }
                if (d10 <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            c10.f10283a = 1;
                            break;
                        case 2:
                            c10.f10261D = false;
                            c10.f10283a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + c10);
                            }
                            if (c10.f10277U != null && c10.f10287c == null) {
                                p();
                            }
                            if (c10.f10277U != null && (viewGroup2 = c10.f10276T) != null) {
                                C0573p j10 = C0573p.j(viewGroup2, c10.E());
                                j10.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c10);
                                }
                                j10.d(1, 3, this);
                            }
                            c10.f10283a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            c10.f10283a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (c10.f10277U != null && (viewGroup3 = c10.f10276T) != null) {
                                C0573p j11 = C0573p.j(viewGroup3, c10.E());
                                int visibility = c10.f10277U.getVisibility();
                                if (visibility == 0) {
                                    i10 = 2;
                                } else if (visibility == 4) {
                                    i10 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                j11.getClass();
                                h3.o.t(i10, "finalState");
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c10);
                                }
                                j11.d(i10, 2, this);
                            }
                            c10.f10283a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            c10.f10283a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f10428d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + c10);
        }
        c10.f10267J.u(5);
        if (c10.f10277U != null) {
            c10.f10290d0.c(l2.r.ON_PAUSE);
        }
        c10.f10288c0.d(l2.r.ON_PAUSE);
        c10.f10283a = 6;
        c10.f10275S = false;
        c10.Y();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onPause()"));
        }
        this.f10425a.o(c10, false);
    }

    public final void m(ClassLoader classLoader) {
        C c10 = this.f10427c;
        Bundle bundle = c10.f10285b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (c10.f10285b.getBundle("savedInstanceState") == null) {
            c10.f10285b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            c10.f10287c = c10.f10285b.getSparseParcelableArray("viewState");
            c10.f10289d = c10.f10285b.getBundle("viewRegistryState");
            Z z8 = (Z) c10.f10285b.getParcelable("state");
            if (z8 != null) {
                c10.f10302w = z8.f10406z;
                c10.f10303x = z8.f10393A;
                Boolean bool = c10.f10291e;
                if (bool != null) {
                    c10.f10279W = bool.booleanValue();
                    c10.f10291e = null;
                } else {
                    c10.f10279W = z8.f10394B;
                }
            }
            if (c10.f10279W) {
                return;
            }
            c10.f10278V = true;
        } catch (BadParcelableException e2) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + c10, e2);
        }
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + c10);
        }
        C0582z c0582z = c10.f10280X;
        View view = c0582z == null ? null : c0582z.f10588p;
        if (view != null) {
            if (view != c10.f10277U) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != c10.f10277U) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(view);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(c10);
                sb2.append(" resulting in focused view ");
                sb2.append(c10.f10277U.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        c10.z().f10588p = null;
        c10.f10267J.R();
        c10.f10267J.A(true);
        c10.f10283a = 7;
        c10.f10275S = false;
        c10.Z();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onResume()"));
        }
        C1481z c1481z = c10.f10288c0;
        l2.r rVar = l2.r.ON_RESUME;
        c1481z.d(rVar);
        if (c10.f10277U != null) {
            c10.f10290d0.f10506e.d(rVar);
        }
        U u3 = c10.f10267J;
        u3.f10347H = false;
        u3.f10348I = false;
        u3.f10353O.f10392f = false;
        u3.u(7);
        this.f10425a.r(c10, false);
        this.f10426b.p(c10.f10293f, null);
        c10.f10285b = null;
        c10.f10287c = null;
        c10.f10289d = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C c10 = this.f10427c;
        if (c10.f10283a == -1 && (bundle = c10.f10285b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new Z(c10));
        if (c10.f10283a > -1) {
            Bundle bundle3 = new Bundle();
            c10.a0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f10425a.s(c10, bundle3, false);
            Bundle bundle4 = new Bundle();
            c10.f10295g0.x(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle Y2 = c10.f10267J.Y();
            if (!Y2.isEmpty()) {
                bundle2.putBundle("childFragmentManager", Y2);
            }
            if (c10.f10277U != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = c10.f10287c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = c10.f10289d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = c10.f10300u;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        C c10 = this.f10427c;
        if (c10.f10277U == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + c10 + " with view " + c10.f10277U);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        c10.f10277U.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            c10.f10287c = sparseArray;
        }
        Bundle bundle = new Bundle();
        c10.f10290d0.f10507f.x(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        c10.f10289d = bundle;
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + c10);
        }
        c10.f10267J.R();
        c10.f10267J.A(true);
        c10.f10283a = 5;
        c10.f10275S = false;
        c10.b0();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onStart()"));
        }
        C1481z c1481z = c10.f10288c0;
        l2.r rVar = l2.r.ON_START;
        c1481z.d(rVar);
        if (c10.f10277U != null) {
            c10.f10290d0.f10506e.d(rVar);
        }
        U u3 = c10.f10267J;
        u3.f10347H = false;
        u3.f10348I = false;
        u3.f10353O.f10392f = false;
        u3.u(5);
        this.f10425a.t(c10, false);
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C c10 = this.f10427c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + c10);
        }
        U u3 = c10.f10267J;
        u3.f10348I = true;
        u3.f10353O.f10392f = true;
        u3.u(4);
        if (c10.f10277U != null) {
            c10.f10290d0.c(l2.r.ON_STOP);
        }
        c10.f10288c0.d(l2.r.ON_STOP);
        c10.f10283a = 4;
        c10.f10275S = false;
        c10.c0();
        if (!c10.f10275S) {
            throw new AndroidRuntimeException(A3.c.i("Fragment ", c10, " did not call through to super.onStop()"));
        }
        this.f10425a.u(c10, false);
    }
}
