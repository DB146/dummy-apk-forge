package W1;

import A9.S2;
import B0.c1;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c.C0857a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.C2052e;
import y1.AbstractC2352B;
import y1.ViewTreeObserverOnPreDrawListenerC2368p;

/* renamed from: W1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571n extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10515c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f10516d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f10517e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f10518f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10519h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10520i;
    public final C2052e j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10521l;

    /* renamed from: m, reason: collision with root package name */
    public final C2052e f10522m;

    /* renamed from: n, reason: collision with root package name */
    public final C2052e f10523n;

    /* renamed from: o, reason: collision with root package name */
    public final Q7.a f10524o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public Object f10525p;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Q7.a] */
    public C0571n(ArrayList arrayList, o0 o0Var, o0 o0Var2, k0 k0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, C2052e c2052e, ArrayList arrayList4, ArrayList arrayList5, C2052e c2052e2, C2052e c2052e3, boolean z8) {
        this.f10515c = arrayList;
        this.f10516d = o0Var;
        this.f10517e = o0Var2;
        this.f10518f = k0Var;
        this.g = obj;
        this.f10519h = arrayList2;
        this.f10520i = arrayList3;
        this.j = c2052e;
        this.k = arrayList4;
        this.f10521l = arrayList5;
        this.f10522m = c2052e2;
        this.f10523n = c2052e3;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i7 = y1.M.f26649a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // W1.n0
    public final boolean a() {
        Object obj;
        k0 k0Var = this.f10518f;
        if (k0Var.l()) {
            ArrayList arrayList = this.f10515c;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0572o c0572o = (C0572o) it.next();
                    if (Build.VERSION.SDK_INT < 34 || (obj = c0572o.f10528b) == null || !k0Var.m(obj)) {
                        break;
                    }
                }
            }
            Object obj2 = this.g;
            if (obj2 == null || k0Var.m(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // W1.n0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        Q7.a aVar = this.f10524o;
        synchronized (aVar) {
            try {
                if (aVar.f8669a) {
                    return;
                }
                aVar.f8669a = true;
                aVar.f8670b = true;
                M9.e eVar = (M9.e) aVar.f8671c;
                if (eVar != null) {
                    try {
                        S2 s22 = (S2) eVar.f6855c;
                        if (s22 == null) {
                            ((a3.u) eVar.f6856d).d();
                            ((Runnable) eVar.f6854b).run();
                        } else {
                            s22.run();
                        }
                    } catch (Throwable th) {
                        synchronized (aVar) {
                            aVar.f8670b = false;
                            aVar.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (aVar) {
                    aVar.f8670b = false;
                    aVar.notifyAll();
                }
            } finally {
            }
        }
    }

    @Override // W1.n0
    public final void c(ViewGroup container) {
        Object obj;
        kotlin.jvm.internal.l.e(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f10515c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0572o c0572o = (C0572o) it.next();
                o0 o0Var = (o0) c0572o.f3094a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + o0Var);
                }
                ((o0) c0572o.f3094a).c(this);
            }
            return;
        }
        Object obj2 = this.f10525p;
        k0 k0Var = this.f10518f;
        o0 o0Var2 = this.f10517e;
        o0 o0Var3 = this.f10516d;
        if (obj2 != null) {
            k0Var.c(obj2);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + o0Var3 + " to " + o0Var2);
                return;
            }
            return;
        }
        Db.j g = g(container, o0Var2, o0Var3);
        ArrayList arrayList2 = (ArrayList) g.f3354a;
        ArrayList arrayList3 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((o0) ((C0572o) it2.next()).f3094a);
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            obj = g.f3355b;
            if (!hasNext) {
                break;
            }
            o0 o0Var4 = (o0) it3.next();
            k0Var.u(o0Var4.f10533c, obj, this.f10524o, new RunnableC0569l(o0Var4, this, 1));
        }
        i(arrayList2, container, new c1(this, container, obj, 4));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + o0Var3 + " to " + o0Var2);
        }
    }

    @Override // W1.n0
    public final void d(C0857a backEvent, ViewGroup container) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        kotlin.jvm.internal.l.e(container, "container");
        Object obj = this.f10525p;
        if (obj != null) {
            this.f10518f.r(backEvent.f14018c, obj);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // W1.n0
    public final void e(ViewGroup container) {
        Object obj;
        kotlin.jvm.internal.l.e(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f10515c;
        if (!isLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o0 o0Var = (o0) ((C0572o) it.next()).f3094a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + o0Var);
                }
            }
            return;
        }
        boolean h10 = h();
        o0 o0Var2 = this.f10517e;
        o0 o0Var3 = this.f10516d;
        if (h10 && (obj = this.g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + o0Var3 + " and " + o0Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (!a() || !h()) {
            return;
        }
        ?? obj2 = new Object();
        Db.j g = g(container, o0Var2, o0Var3);
        ArrayList arrayList2 = (ArrayList) g.f3354a;
        ArrayList arrayList3 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((o0) ((C0572o) it2.next()).f3094a);
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            Object obj3 = g.f3355b;
            if (!hasNext) {
                i(arrayList2, container, new C0570m(this, container, obj3, obj2, 0));
                return;
            }
            o0 o0Var4 = (o0) it3.next();
            S2 s22 = new S2(obj2, 14);
            C c10 = o0Var4.f10533c;
            this.f10518f.v(obj3, this.f10524o, s22, new RunnableC0569l(o0Var4, this, 0));
        }
    }

    public final Db.j g(ViewGroup viewGroup, o0 o0Var, o0 o0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        k0 k0Var;
        Object obj;
        Iterator it;
        ViewGroup viewGroup2 = viewGroup;
        o0 o0Var3 = o0Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList3 = this.f10515c;
        Iterator it2 = arrayList3.iterator();
        View view2 = null;
        boolean z8 = false;
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = this.f10520i;
            arrayList2 = this.f10519h;
            k0Var = this.f10518f;
            obj = this.g;
            if (!hasNext) {
                break;
            }
            if (((C0572o) it2.next()).f10530d == null || o0Var2 == null || o0Var3 == null || this.j.isEmpty() || obj == null) {
                it = it2;
            } else {
                C2052e c2052e = this.f10522m;
                i0 i0Var = d0.f10463a;
                it = it2;
                C inFragment = o0Var3.f10533c;
                kotlin.jvm.internal.l.e(inFragment, "inFragment");
                C outFragment = o0Var2.f10533c;
                kotlin.jvm.internal.l.e(outFragment, "outFragment");
                ViewTreeObserverOnPreDrawListenerC2368p.a(viewGroup2, new P4.G(o0Var3, o0Var2, this, 2));
                arrayList2.addAll(c2052e.values());
                ArrayList arrayList4 = this.f10521l;
                if (!arrayList4.isEmpty()) {
                    Object obj2 = arrayList4.get(0);
                    kotlin.jvm.internal.l.d(obj2, "exitingNames[0]");
                    View view3 = (View) c2052e.get((String) obj2);
                    k0Var.s(view3, obj);
                    view2 = view3;
                }
                C2052e c2052e2 = this.f10523n;
                arrayList.addAll(c2052e2.values());
                ArrayList arrayList5 = this.k;
                if (!arrayList5.isEmpty()) {
                    Object obj3 = arrayList5.get(0);
                    kotlin.jvm.internal.l.d(obj3, "enteringNames[0]");
                    View view4 = (View) c2052e2.get((String) obj3);
                    if (view4 != null) {
                        ViewTreeObserverOnPreDrawListenerC2368p.a(viewGroup2, new Aa.j(k0Var, view4, rect));
                        z8 = true;
                    }
                }
                k0Var.w(obj, view, arrayList2);
                Object obj4 = this.g;
                k0Var.q(obj4, null, null, obj4, arrayList);
            }
            it2 = it;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        Object obj5 = null;
        Object obj6 = null;
        while (it3.hasNext()) {
            Iterator it4 = it3;
            C0572o c0572o = (C0572o) it3.next();
            Object obj7 = obj6;
            o0 o0Var4 = (o0) c0572o.f3094a;
            Object obj8 = obj5;
            Object h10 = k0Var.h(c0572o.f10528b);
            if (h10 != null) {
                ArrayList arrayList7 = new ArrayList();
                View view5 = view2;
                View view6 = o0Var4.f10533c.f10277U;
                kotlin.jvm.internal.l.d(view6, "operation.fragment.mView");
                f(view6, arrayList7);
                if (obj != null && (o0Var4 == o0Var2 || o0Var4 == o0Var3)) {
                    if (o0Var4 == o0Var2) {
                        arrayList7.removeAll(Eb.o.w0(arrayList2));
                    } else {
                        arrayList7.removeAll(Eb.o.w0(arrayList));
                    }
                }
                if (arrayList7.isEmpty()) {
                    k0Var.a(view, h10);
                } else {
                    k0Var.b(h10, arrayList7);
                    k0Var.q(h10, h10, arrayList7, null, null);
                    if (o0Var4.f10531a == 3) {
                        o0Var4.f10538i = false;
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        C c10 = o0Var4.f10533c;
                        arrayList8.remove(c10.f10277U);
                        k0Var.p(h10, c10.f10277U, arrayList8);
                        ViewTreeObserverOnPreDrawListenerC2368p.a(viewGroup2, new S2(arrayList7, 15));
                    }
                }
                if (o0Var4.f10531a == 2) {
                    arrayList6.addAll(arrayList7);
                    if (z8) {
                        k0Var.t(h10, rect);
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Entering Transition: " + h10);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            Object transitioningViews = it5.next();
                            kotlin.jvm.internal.l.d(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    k0Var.s(view5, h10);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view5 = view5;
                        Log.v("FragmentManager", "Exiting Transition: " + h10);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            Object transitioningViews2 = it6.next();
                            kotlin.jvm.internal.l.d(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    } else {
                        view5 = view5;
                    }
                }
                if (c0572o.f10529c) {
                    obj5 = k0Var.o(obj8, h10);
                    viewGroup2 = viewGroup;
                    o0Var3 = o0Var;
                    it3 = it4;
                    obj6 = obj7;
                    view2 = view5;
                } else {
                    obj6 = k0Var.o(obj7, h10);
                    o0Var3 = o0Var;
                    obj5 = obj8;
                    it3 = it4;
                    view2 = view5;
                    viewGroup2 = viewGroup;
                }
            } else {
                obj5 = obj8;
                obj6 = obj7;
                it3 = it4;
                viewGroup2 = viewGroup;
                o0Var3 = o0Var;
            }
        }
        Object n6 = k0Var.n(obj5, obj6, obj);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Final merged transition: " + n6);
        }
        return new Db.j(arrayList6, n6);
    }

    public final boolean h() {
        ArrayList arrayList = this.f10515c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((o0) ((C0572o) it.next()).f3094a).f10533c.f10259B) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Rb.a aVar) {
        d0.a(4, arrayList);
        k0 k0Var = this.f10518f;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f10520i;
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList3.get(i7);
            WeakHashMap weakHashMap = y1.K.f26642a;
            arrayList2.add(AbstractC2352B.f(view));
            AbstractC2352B.m(view, null);
        }
        boolean isLoggable = Log.isLoggable("FragmentManager", 2);
        ArrayList arrayList4 = this.f10519h;
        if (isLoggable) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object sharedElementFirstOutViews = it.next();
                kotlin.jvm.internal.l.d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = y1.K.f26642a;
                sb2.append(AbstractC2352B.f(view2));
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object sharedElementLastInViews = it2.next();
                kotlin.jvm.internal.l.d(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = y1.K.f26642a;
                sb3.append(AbstractC2352B.f(view3));
                Log.v("FragmentManager", sb3.toString());
            }
        }
        aVar.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i10 = 0; i10 < size2; i10++) {
            View view4 = (View) arrayList4.get(i10);
            WeakHashMap weakHashMap4 = y1.K.f26642a;
            String f4 = AbstractC2352B.f(view4);
            arrayList5.add(f4);
            if (f4 != null) {
                AbstractC2352B.m(view4, null);
                String str = (String) this.j.get(f4);
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i11))) {
                        AbstractC2352B.m((View) arrayList3.get(i11), f4);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC2368p.a(viewGroup, new j0(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        d0.a(0, arrayList);
        k0Var.x(this.g, arrayList4, arrayList3);
    }
}
