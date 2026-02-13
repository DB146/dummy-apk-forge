package W1;

import android.util.Log;
import c.AbstractC0876t;
import c.C0857a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class K extends AbstractC0876t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Z0.a aVar) {
        super(true);
        this.f10327d = 1;
        this.f10328e = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, int i7) {
        super(false);
        this.f10327d = i7;
        this.f10328e = obj;
    }

    @Override // c.AbstractC0876t
    public void a() {
        switch (this.f10327d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                U u3 = (U) this.f10328e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + u3);
                }
                C0558a c0558a = u3.f10361h;
                if (c0558a != null) {
                    c0558a.f10423t = false;
                    c0558a.e(false);
                    u3.A(true);
                    u3.F();
                    Iterator it = u3.f10365n.iterator();
                    while (it.hasNext()) {
                        ((A9.L) it.next()).getClass();
                    }
                }
                u3.f10361h = null;
                return;
            default:
                return;
        }
    }

    @Override // c.AbstractC0876t
    public final void b() {
        switch (this.f10327d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                U u3 = (U) this.f10328e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + u3);
                }
                u3.A(true);
                C0558a c0558a = u3.f10361h;
                K k = u3.f10362i;
                if (c0558a == null) {
                    if (k.f14068a) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        u3.S();
                        return;
                    } else {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        u3.g.c();
                        return;
                    }
                }
                ArrayList arrayList = u3.f10365n;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet<C> linkedHashSet = new LinkedHashSet(U.G(u3.f10361h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A9.L l10 = (A9.L) it.next();
                        for (C c10 : linkedHashSet) {
                            l10.getClass();
                        }
                    }
                }
                Iterator it2 = u3.f10361h.f10409c.iterator();
                while (it2.hasNext()) {
                    C c11 = ((c0) it2.next()).f10453b;
                    if (c11 != null) {
                        c11.f10259B = false;
                    }
                }
                Iterator it3 = u3.f(new ArrayList(Collections.singletonList(u3.f10361h)), 0, 1).iterator();
                while (it3.hasNext()) {
                    C0573p c0573p = (C0573p) it3.next();
                    c0573p.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ArrayList arrayList2 = c0573p.f10542c;
                    c0573p.k(arrayList2);
                    c0573p.c(arrayList2);
                }
                u3.f10361h = null;
                u3.h0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + k.f14068a + " for  FragmentManager " + u3);
                    return;
                }
                return;
            case 1:
                ((Z0.a) this.f10328e).invoke(this);
                return;
            default:
                y2.f fVar = ((v2.u) this.f10328e).f25026b;
                if (fVar.f26770f.isEmpty()) {
                    return;
                }
                v2.q f4 = fVar.f();
                kotlin.jvm.internal.l.b(f4);
                if (fVar.k(f4.f25017b.f4638a, true, false)) {
                    fVar.b();
                    return;
                }
                return;
        }
    }

    @Override // c.AbstractC0876t
    public void c(C0857a backEvent) {
        switch (this.f10327d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                U u3 = (U) this.f10328e;
                if (isLoggable) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + u3);
                }
                if (u3.f10361h != null) {
                    Iterator it = u3.f(new ArrayList(Collections.singletonList(u3.f10361h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        C0573p c0573p = (C0573p) it.next();
                        c0573p.getClass();
                        kotlin.jvm.internal.l.e(backEvent, "backEvent");
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f14018c);
                        }
                        ArrayList arrayList = c0573p.f10542c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Eb.o.U(arrayList2, ((o0) it2.next()).k);
                        }
                        List s02 = Eb.o.s0(Eb.o.w0(arrayList2));
                        int size = s02.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((n0) s02.get(i7)).d(backEvent, c0573p.f10540a);
                        }
                    }
                    Iterator it3 = u3.f10365n.iterator();
                    while (it3.hasNext()) {
                        ((A9.L) it3.next()).getClass();
                    }
                    return;
                }
                return;
            default:
                super.c(backEvent);
                return;
        }
    }

    @Override // c.AbstractC0876t
    public void d(C0857a c0857a) {
        switch (this.f10327d) {
            case 0:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                U u3 = (U) this.f10328e;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + u3);
                }
                u3.x();
                u3.y(new T(u3), false);
                return;
            default:
                super.d(c0857a);
                return;
        }
    }
}
