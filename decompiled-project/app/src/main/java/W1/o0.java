package W1;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10531a;

    /* renamed from: b, reason: collision with root package name */
    public int f10532b;

    /* renamed from: c, reason: collision with root package name */
    public final C f10533c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10534d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10535e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10536f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10537h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10538i;
    public final ArrayList j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f10539l;

    public o0(int i7, int i10, a0 a0Var) {
        h3.o.t(i7, "finalState");
        h3.o.t(i10, "lifecycleImpact");
        C fragment = a0Var.f10427c;
        kotlin.jvm.internal.l.d(fragment, "fragmentStateManager.fragment");
        h3.o.t(i7, "finalState");
        h3.o.t(i10, "lifecycleImpact");
        kotlin.jvm.internal.l.e(fragment, "fragment");
        this.f10531a = i7;
        this.f10532b = i10;
        this.f10533c = fragment;
        this.f10534d = new ArrayList();
        this.f10538i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.f10539l = a0Var;
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        this.f10537h = false;
        if (this.f10535e) {
            return;
        }
        this.f10535e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (n0 n0Var : Eb.o.s0(this.k)) {
            n0Var.getClass();
            if (!n0Var.f10527b) {
                n0Var.b(container);
            }
            n0Var.f10527b = true;
        }
    }

    public final void b() {
        this.f10537h = false;
        if (!this.f10536f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f10536f = true;
            Iterator it = this.f10534d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f10533c.f10259B = false;
        this.f10539l.k();
    }

    public final void c(n0 effect) {
        kotlin.jvm.internal.l.e(effect, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i7, int i10) {
        h3.o.t(i7, "finalState");
        h3.o.t(i10, "lifecycleImpact");
        int b2 = P.c.b(i10);
        C c10 = this.f10533c;
        if (b2 == 0) {
            if (this.f10531a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c10 + " mFinalState = " + A3.c.w(this.f10531a) + " -> " + A3.c.w(i7) + '.');
                }
                this.f10531a = i7;
                return;
            }
            return;
        }
        if (b2 == 1) {
            if (this.f10531a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c10 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + A3.c.v(this.f10532b) + " to ADDING.");
                }
                this.f10531a = 2;
                this.f10532b = 2;
                this.f10538i = true;
                return;
            }
            return;
        }
        if (b2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c10 + " mFinalState = " + A3.c.w(this.f10531a) + " -> REMOVED. mLifecycleImpact  = " + A3.c.v(this.f10532b) + " to REMOVING.");
        }
        this.f10531a = 1;
        this.f10532b = 3;
        this.f10538i = true;
    }

    public final String toString() {
        StringBuilder n6 = X.c.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        n6.append(A3.c.w(this.f10531a));
        n6.append(" lifecycleImpact = ");
        n6.append(A3.c.v(this.f10532b));
        n6.append(" fragment = ");
        n6.append(this.f10533c);
        n6.append('}');
        return n6.toString();
    }
}
