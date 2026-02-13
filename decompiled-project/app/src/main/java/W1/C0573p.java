package W1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import u.C2050c;
import u.C2052e;
import y1.AbstractC2352B;
import y7.u0;

/* renamed from: W1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573p {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f10540a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10541b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10542c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10543d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10544e;

    public C0573p(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        this.f10540a = container;
        this.f10541b = new ArrayList();
        this.f10542c = new ArrayList();
    }

    public static void f(C2052e c2052e, View view) {
        WeakHashMap weakHashMap = y1.K.f26642a;
        String f4 = AbstractC2352B.f(view);
        if (f4 != null) {
            c2052e.put(f4, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    f(c2052e, childAt);
                }
            }
        }
    }

    public static final C0573p j(ViewGroup container, U fragmentManager) {
        kotlin.jvm.internal.l.e(container, "container");
        kotlin.jvm.internal.l.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.l.d(fragmentManager.K(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0573p) {
            return (C0573p) tag;
        }
        C0573p c0573p = new C0573p(container);
        container.setTag(R.id.special_effects_controller_view_tag, c0573p);
        return c0573p;
    }

    public final void a(o0 operation) {
        kotlin.jvm.internal.l.e(operation, "operation");
        if (operation.f10538i) {
            A3.c.a(operation.f10531a, operation.f10533c.j0(), this.f10540a);
            operation.f10538i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r5v0, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [u.T, u.e] */
    public final void b(ArrayList arrayList, boolean z8) {
        Object obj;
        o0 o0Var;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str2;
        boolean z10 = z8;
        int i7 = 0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o0 o0Var2 = (o0) obj;
            View view = o0Var2.f10533c.f10277U;
            kotlin.jvm.internal.l.d(view, "operation.fragment.mView");
            if (u0.g(view) == 2 && o0Var2.f10531a != 2) {
                break;
            }
        }
        o0 o0Var3 = (o0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                o0Var = 0;
                break;
            }
            o0Var = listIterator.previous();
            o0 o0Var4 = (o0) o0Var;
            View view2 = o0Var4.f10533c.f10277U;
            kotlin.jvm.internal.l.d(view2, "operation.fragment.mView");
            if (u0.g(view2) != 2 && o0Var4.f10531a == 2) {
                break;
            }
        }
        o0 o0Var5 = o0Var;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + o0Var3 + " to " + o0Var5);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        C c10 = ((o0) Eb.o.e0(arrayList)).f10533c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0582z c0582z = ((o0) it2.next()).f10533c.f10280X;
            C0582z c0582z2 = c10.f10280X;
            c0582z.f10577b = c0582z2.f10577b;
            c0582z.f10578c = c0582z2.f10578c;
            c0582z.f10579d = c0582z2.f10579d;
            c0582z.f10580e = c0582z2.f10580e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o0 o0Var6 = (o0) it3.next();
            arrayList7.add(new C0564g(o0Var6, z10));
            arrayList8.add(new C0572o(o0Var6, z10, !z10 ? o0Var6 != o0Var5 : o0Var6 != o0Var3));
            o0Var6.f10534d.add(new RunnableC0561d(this, o0Var6, i7));
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0572o) next).t()) {
                arrayList9.add(next);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = arrayList9.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((C0572o) next2).K() != null) {
                arrayList10.add(next2);
            }
        }
        Iterator it6 = arrayList10.iterator();
        k0 k0Var = null;
        while (it6.hasNext()) {
            C0572o c0572o = (C0572o) it6.next();
            k0 K10 = c0572o.K();
            if (k0Var != null && K10 != k0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((o0) c0572o.f3094a).f10533c + " returned Transition " + c0572o.f10528b + " which uses a different Transition type than other Fragments.").toString());
            }
            k0Var = K10;
        }
        if (k0Var == null) {
            arrayList2 = arrayList7;
            str = "FragmentManager";
        } else {
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ?? t5 = new u.T(0);
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ?? t10 = new u.T(0);
            ?? t11 = new u.T(0);
            Iterator it7 = arrayList10.iterator();
            ArrayList arrayList15 = arrayList13;
            ArrayList arrayList16 = arrayList14;
            Object obj2 = null;
            while (it7.hasNext()) {
                Object obj3 = ((C0572o) it7.next()).f10530d;
                if (obj3 == null || o0Var3 == null || o0Var5 == null) {
                    k0Var = k0Var;
                    z10 = z8;
                    arrayList7 = arrayList7;
                    arrayList10 = arrayList10;
                    arrayList12 = arrayList12;
                } else {
                    obj2 = k0Var.y(k0Var.h(obj3));
                    C c11 = o0Var5.f10533c;
                    C0582z c0582z3 = c11.f10280X;
                    if (c0582z3 == null || (arrayList3 = c0582z3.g) == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList17 = arrayList7;
                    C c12 = o0Var3.f10533c;
                    C0582z c0582z4 = c12.f10280X;
                    if (c0582z4 == null || (arrayList4 = c0582z4.g) == null) {
                        arrayList4 = new ArrayList();
                    }
                    k0 k0Var2 = k0Var;
                    C0582z c0582z5 = c12.f10280X;
                    if (c0582z5 == null || (arrayList5 = c0582z5.f10582h) == null) {
                        arrayList5 = new ArrayList();
                    }
                    ArrayList arrayList18 = arrayList10;
                    int size = arrayList5.size();
                    ArrayList arrayList19 = arrayList12;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int indexOf = arrayList3.indexOf(arrayList5.get(i10));
                        ArrayList arrayList20 = arrayList5;
                        if (indexOf != -1) {
                            arrayList3.set(indexOf, arrayList4.get(i10));
                        }
                        i10++;
                        size = i11;
                        arrayList5 = arrayList20;
                    }
                    C0582z c0582z6 = c11.f10280X;
                    if (c0582z6 == null || (arrayList6 = c0582z6.f10582h) == null) {
                        arrayList6 = new ArrayList();
                    }
                    Db.j jVar = !z10 ? new Db.j(null, null) : new Db.j(null, null);
                    if (jVar.f3354a != null) {
                        throw new ClassCastException();
                    }
                    if (jVar.f3355b != null) {
                        throw new ClassCastException();
                    }
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj4 = arrayList3.get(i12);
                        int i13 = size2;
                        kotlin.jvm.internal.l.d(obj4, "exitingNames[i]");
                        Object obj5 = arrayList6.get(i12);
                        kotlin.jvm.internal.l.d(obj5, "enteringNames[i]");
                        t5.put((String) obj4, (String) obj5);
                        i12++;
                        size2 = i13;
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            Log.v("FragmentManager", "Name: " + ((String) it8.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            Log.v("FragmentManager", "Name: " + ((String) it9.next()));
                        }
                    }
                    View view3 = c12.f10277U;
                    kotlin.jvm.internal.l.d(view3, "firstOut.fragment.mView");
                    f(t10, view3);
                    t10.n(arrayList3);
                    t5.n(t10.keySet());
                    View view4 = c11.f10277U;
                    kotlin.jvm.internal.l.d(view4, "lastIn.fragment.mView");
                    f(t11, view4);
                    t11.n(arrayList6);
                    t11.n(t5.values());
                    i0 i0Var = d0.f10463a;
                    for (int i14 = t5.f24637c - 1; -1 < i14; i14--) {
                        if (!t11.containsKey((String) t5.k(i14))) {
                            t5.h(i14);
                        }
                    }
                    Set keySet = t5.keySet();
                    Set entrySet = t10.entrySet();
                    U.b bVar = new U.b(2, keySet);
                    Iterator it10 = ((androidx.datastore.preferences.protobuf.b0) entrySet).iterator();
                    while (true) {
                        C2050c c2050c = (C2050c) it10;
                        if (!c2050c.hasNext()) {
                            break;
                        }
                        c2050c.next();
                        if (!((Boolean) bVar.invoke(c2050c)).booleanValue()) {
                            c2050c.remove();
                        }
                    }
                    Collection values = t5.values();
                    Set entrySet2 = t11.entrySet();
                    U.b bVar2 = new U.b(2, values);
                    Iterator it11 = ((androidx.datastore.preferences.protobuf.b0) entrySet2).iterator();
                    while (true) {
                        C2050c c2050c2 = (C2050c) it11;
                        if (!c2050c2.hasNext()) {
                            break;
                        }
                        c2050c2.next();
                        if (!((Boolean) bVar2.invoke(c2050c2)).booleanValue()) {
                            c2050c2.remove();
                        }
                    }
                    if (t5.isEmpty()) {
                        Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + o0Var3 + " and " + o0Var5 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                        arrayList11.clear();
                        arrayList19.clear();
                        k0Var = k0Var2;
                        z10 = z8;
                        arrayList15 = arrayList6;
                        arrayList16 = arrayList3;
                        arrayList7 = arrayList17;
                        arrayList10 = arrayList18;
                        arrayList12 = arrayList19;
                        obj2 = null;
                    } else {
                        k0Var = k0Var2;
                        z10 = z8;
                        arrayList15 = arrayList6;
                        arrayList16 = arrayList3;
                        arrayList7 = arrayList17;
                        arrayList10 = arrayList18;
                        arrayList12 = arrayList19;
                    }
                }
            }
            k0 k0Var3 = k0Var;
            ArrayList arrayList21 = arrayList12;
            ArrayList arrayList22 = arrayList7;
            ArrayList arrayList23 = arrayList10;
            if (obj2 == null) {
                if (!arrayList23.isEmpty()) {
                    Iterator it12 = arrayList23.iterator();
                    while (it12.hasNext()) {
                        if (((C0572o) it12.next()).f10528b == null) {
                        }
                    }
                }
                str = "FragmentManager";
                arrayList2 = arrayList22;
            }
            arrayList2 = arrayList22;
            str = "FragmentManager";
            C0571n c0571n = new C0571n(arrayList23, o0Var3, o0Var5, k0Var3, obj2, arrayList11, arrayList21, t5, arrayList15, arrayList16, t10, t11, z8);
            Iterator it13 = arrayList23.iterator();
            while (it13.hasNext()) {
                ((o0) ((C0572o) it13.next()).f3094a).j.add(c0571n);
            }
        }
        ArrayList arrayList24 = new ArrayList();
        ArrayList arrayList25 = new ArrayList();
        Iterator it14 = arrayList2.iterator();
        while (it14.hasNext()) {
            Eb.o.U(arrayList25, ((o0) ((C0564g) it14.next()).f3094a).k);
        }
        boolean isEmpty = arrayList25.isEmpty();
        Iterator it15 = arrayList2.iterator();
        boolean z11 = false;
        while (it15.hasNext()) {
            C0564g c0564g = (C0564g) it15.next();
            Context context = this.f10540a.getContext();
            o0 o0Var7 = (o0) c0564g.f3094a;
            kotlin.jvm.internal.l.d(context, "context");
            q3.e K11 = c0564g.K(context);
            if (K11 != null) {
                if (((AnimatorSet) K11.f23377c) == null) {
                    arrayList24.add(c0564g);
                } else {
                    C c13 = o0Var7.f10533c;
                    if (o0Var7.k.isEmpty()) {
                        String str3 = str;
                        if (o0Var7.f10531a == 3) {
                            o0Var7.f10538i = false;
                        }
                        o0Var7.j.add(new C0566i(c0564g));
                        str = str3;
                        z11 = true;
                    } else {
                        str2 = str;
                        if (Log.isLoggable(str2, 2)) {
                            Log.v(str2, "Ignoring Animator set on " + c13 + " as this Fragment was involved in a Transition.");
                        }
                        str = str2;
                    }
                }
            }
            str2 = str;
            str = str2;
        }
        String str4 = str;
        Iterator it16 = arrayList24.iterator();
        while (it16.hasNext()) {
            C0564g c0564g2 = (C0564g) it16.next();
            o0 o0Var8 = (o0) c0564g2.f3094a;
            C c14 = o0Var8.f10533c;
            if (isEmpty) {
                if (!z11) {
                    o0Var8.j.add(new C0563f(c0564g2));
                } else if (Log.isLoggable(str4, 2)) {
                    Log.v(str4, "Ignoring Animation set on " + c14 + " as Animations cannot run alongside Animators.");
                }
            } else if (Log.isLoggable(str4, 2)) {
                Log.v(str4, "Ignoring Animation set on " + c14 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(ArrayList operations) {
        kotlin.jvm.internal.l.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            Eb.o.U(arrayList, ((o0) it.next()).k);
        }
        List s02 = Eb.o.s0(Eb.o.w0(arrayList));
        int size = s02.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((n0) s02.get(i7)).c(this.f10540a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((o0) operations.get(i10));
        }
        List s03 = Eb.o.s0(operations);
        int size3 = s03.size();
        for (int i11 = 0; i11 < size3; i11++) {
            o0 o0Var = (o0) s03.get(i11);
            if (o0Var.k.isEmpty()) {
                o0Var.b();
            }
        }
    }

    public final void d(int i7, int i10, a0 a0Var) {
        synchronized (this.f10541b) {
            try {
                C c10 = a0Var.f10427c;
                kotlin.jvm.internal.l.d(c10, "fragmentStateManager.fragment");
                o0 g = g(c10);
                if (g == null) {
                    C c11 = a0Var.f10427c;
                    g = c11.f10259B ? h(c11) : null;
                }
                if (g != null) {
                    g.d(i7, i10);
                    return;
                }
                o0 o0Var = new o0(i7, i10, a0Var);
                this.f10541b.add(o0Var);
                o0Var.f10534d.add(new RunnableC0561d(this, o0Var, 1));
                o0Var.f10534d.add(new RunnableC0561d(this, o0Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a0 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {all -> 0x005f, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0043, B:20:0x0062, B:23:0x0074, B:26:0x0078, B:30:0x0071, B:34:0x007e, B:35:0x008d, B:37:0x0094, B:39:0x00a2, B:40:0x00b8, B:43:0x00cf, B:46:0x00d3, B:51:0x00ca, B:52:0x00cc, B:54:0x00d9, B:58:0x00ea, B:60:0x00fc, B:61:0x0103, B:62:0x010e, B:64:0x0114, B:66:0x0122, B:68:0x0126, B:72:0x0147, B:78:0x012d, B:79:0x0131, B:81:0x0137, B:90:0x0152, B:91:0x015b, B:93:0x0161, B:95:0x016d, B:99:0x0177, B:100:0x0196, B:102:0x01a0, B:104:0x0180, B:106:0x018a), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:12:0x0017, B:14:0x0020, B:15:0x002f, B:17:0x0035, B:19:0x0043, B:20:0x0062, B:23:0x0074, B:26:0x0078, B:30:0x0071, B:34:0x007e, B:35:0x008d, B:37:0x0094, B:39:0x00a2, B:40:0x00b8, B:43:0x00cf, B:46:0x00d3, B:51:0x00ca, B:52:0x00cc, B:54:0x00d9, B:58:0x00ea, B:60:0x00fc, B:61:0x0103, B:62:0x010e, B:64:0x0114, B:66:0x0122, B:68:0x0126, B:72:0x0147, B:78:0x012d, B:79:0x0131, B:81:0x0137, B:90:0x0152, B:91:0x015b, B:93:0x0161, B:95:0x016d, B:99:0x0177, B:100:0x0196, B:102:0x01a0, B:104:0x0180, B:106:0x018a), top: B:11:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z8;
        boolean z10;
        if (this.f10544e) {
            return;
        }
        if (!this.f10540a.isAttachedToWindow()) {
            i();
            this.f10543d = false;
            return;
        }
        synchronized (this.f10541b) {
            try {
                if (this.f10541b.isEmpty()) {
                    ArrayList u02 = Eb.o.u0(this.f10542c);
                    this.f10542c.clear();
                    Iterator it = u02.iterator();
                    while (it.hasNext()) {
                        o0 o0Var = (o0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + o0Var + " with no incoming pendingOperations");
                        }
                        ViewGroup container = this.f10540a;
                        o0Var.getClass();
                        kotlin.jvm.internal.l.e(container, "container");
                        if (!o0Var.f10535e) {
                            o0Var.a(container);
                        }
                        if (!o0Var.f10536f) {
                            this.f10542c.add(o0Var);
                        }
                    }
                } else {
                    ArrayList u03 = Eb.o.u0(this.f10542c);
                    this.f10542c.clear();
                    Iterator it2 = u03.iterator();
                    while (true) {
                        z8 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        o0 o0Var2 = (o0) it2.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + o0Var2);
                        }
                        ViewGroup container2 = this.f10540a;
                        boolean z11 = o0Var2.f10533c.f10259B;
                        kotlin.jvm.internal.l.e(container2, "container");
                        if (!o0Var2.f10535e) {
                            if (z11) {
                                o0Var2.g = true;
                            }
                            o0Var2.a(container2);
                        }
                        if (!o0Var2.f10536f) {
                            this.f10542c.add(o0Var2);
                        }
                    }
                    l();
                    ArrayList u04 = Eb.o.u0(this.f10541b);
                    if (u04.isEmpty()) {
                        return;
                    }
                    this.f10541b.clear();
                    this.f10542c.addAll(u04);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(u04, this.f10543d);
                    Iterator it3 = u04.iterator();
                    boolean z12 = true;
                    boolean z13 = true;
                    while (it3.hasNext()) {
                        o0 o0Var3 = (o0) it3.next();
                        if (!o0Var3.k.isEmpty()) {
                            ArrayList arrayList = o0Var3.k;
                            if (arrayList == null || !arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (!((n0) it4.next()).a()) {
                                    }
                                }
                            }
                            z10 = true;
                            if (o0Var3.f10533c.f10259B) {
                                z12 = false;
                            }
                            z13 = z10;
                        }
                        z10 = false;
                        if (o0Var3.f10533c.f10259B) {
                        }
                        z13 = z10;
                    }
                    if (z13) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it5 = u04.iterator();
                        while (it5.hasNext()) {
                            Eb.o.U(arrayList2, ((o0) it5.next()).k);
                        }
                        if (!arrayList2.isEmpty()) {
                            if (z12) {
                                k(u04);
                                c(u04);
                            } else if (z8) {
                                k(u04);
                                int size = u04.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    a((o0) u04.get(i7));
                                }
                            }
                            this.f10543d = false;
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        }
                    }
                    z8 = false;
                    if (z12) {
                    }
                    this.f10543d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o0 g(C c10) {
        Object obj;
        Iterator it = this.f10541b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o0 o0Var = (o0) obj;
            if (kotlin.jvm.internal.l.a(o0Var.f10533c, c10) && !o0Var.f10535e) {
                break;
            }
        }
        return (o0) obj;
    }

    public final o0 h(C c10) {
        Object obj;
        Iterator it = this.f10542c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o0 o0Var = (o0) obj;
            if (kotlin.jvm.internal.l.a(o0Var.f10533c, c10) && !o0Var.f10535e) {
                break;
            }
        }
        return (o0) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f10540a.isAttachedToWindow();
        synchronized (this.f10541b) {
            try {
                l();
                k(this.f10541b);
                Iterator it = Eb.o.u0(this.f10542c).iterator();
                while (it.hasNext()) {
                    o0 o0Var = (o0) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f10540a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + o0Var);
                    }
                    o0Var.a(this.f10540a);
                }
                Iterator it2 = Eb.o.u0(this.f10541b).iterator();
                while (it2.hasNext()) {
                    o0 o0Var2 = (o0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f10540a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + o0Var2);
                    }
                    o0Var2.a(this.f10540a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            o0 o0Var = (o0) arrayList.get(i7);
            if (!o0Var.f10537h) {
                o0Var.f10537h = true;
                int i10 = o0Var.f10532b;
                a0 a0Var = o0Var.f10539l;
                if (i10 == 2) {
                    C c10 = a0Var.f10427c;
                    kotlin.jvm.internal.l.d(c10, "fragmentStateManager.fragment");
                    View findFocus = c10.f10277U.findFocus();
                    if (findFocus != null) {
                        c10.z().f10588p = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + c10);
                        }
                    }
                    View j02 = o0Var.f10533c.j0();
                    if (j02.getParent() == null) {
                        a0Var.b();
                        j02.setAlpha(0.0f);
                    }
                    if (j02.getAlpha() == 0.0f && j02.getVisibility() == 0) {
                        j02.setVisibility(4);
                    }
                    C0582z c0582z = c10.f10280X;
                    j02.setAlpha(c0582z == null ? 1.0f : c0582z.f10587o);
                } else if (i10 == 3) {
                    C c11 = a0Var.f10427c;
                    kotlin.jvm.internal.l.d(c11, "fragmentStateManager.fragment");
                    View j03 = c11.j0();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + j03.findFocus() + " on view " + j03 + " for Fragment " + c11);
                    }
                    j03.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Eb.o.U(arrayList2, ((o0) it.next()).k);
        }
        List s02 = Eb.o.s0(Eb.o.w0(arrayList2));
        int size2 = s02.size();
        for (int i11 = 0; i11 < size2; i11++) {
            n0 n0Var = (n0) s02.get(i11);
            n0Var.getClass();
            ViewGroup container = this.f10540a;
            kotlin.jvm.internal.l.e(container, "container");
            if (!n0Var.f10526a) {
                n0Var.e(container);
            }
            n0Var.f10526a = true;
        }
    }

    public final void l() {
        Iterator it = this.f10541b.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            int i7 = 2;
            if (o0Var.f10532b == 2) {
                int visibility = o0Var.f10533c.j0().getVisibility();
                if (visibility != 0) {
                    i7 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(h3.o.l(visibility, "Unknown visibility "));
                        }
                        i7 = 3;
                    }
                }
                o0Var.d(i7, 1);
            }
        }
    }
}
