package a3;

import A9.S2;
import W1.RunnableC0569l;
import W1.k0;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: a3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0735l extends k0 {
    @Override // W1.k0
    public final void a(View view, Object obj) {
        ((u) obj).b(view);
    }

    @Override // W1.k0
    public final void b(Object obj, ArrayList arrayList) {
        u uVar = (u) obj;
        if (uVar == null) {
            return;
        }
        int i7 = 0;
        if (uVar instanceof C0709A) {
            C0709A c0709a = (C0709A) uVar;
            int size = c0709a.f12492S.size();
            while (i7 < size) {
                b(c0709a.P(i7), arrayList);
                i7++;
            }
            return;
        }
        if (k0.k(uVar.f12591e) && k0.k(uVar.f12592f)) {
            int size2 = arrayList.size();
            while (i7 < size2) {
                uVar.b((View) arrayList.get(i7));
                i7++;
            }
        }
    }

    @Override // W1.k0
    public final void c(Object obj) {
        r rVar = (r) obj;
        rVar.g();
        rVar.f12562d.a((float) (rVar.g.L + 1));
    }

    @Override // W1.k0
    public final void d(Object obj, Aa.j jVar) {
        r rVar = (r) obj;
        rVar.f12564f = jVar;
        rVar.g();
        rVar.f12562d.a(0.0f);
    }

    @Override // W1.k0
    public final void e(ViewGroup viewGroup, Object obj) {
        y.a(viewGroup, (u) obj);
    }

    @Override // W1.k0
    public final boolean g(Object obj) {
        return obj instanceof u;
    }

    @Override // W1.k0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((u) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [a3.x, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // W1.k0
    public final Object i(ViewGroup viewGroup, Object obj) {
        u uVar = (u) obj;
        ArrayList arrayList = y.f12605c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!uVar.u()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        u clone = uVar.clone();
        C0709A c0709a = new C0709A();
        c0709a.O(clone);
        y.c(viewGroup, c0709a);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ?? obj2 = new Object();
        obj2.f12601a = c0709a;
        obj2.f12602b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj2);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
        viewGroup.invalidate();
        r rVar = new r(c0709a);
        c0709a.f12585M = rVar;
        c0709a.a(rVar);
        return c0709a.f12585M;
    }

    @Override // W1.k0
    public final boolean l() {
        return true;
    }

    @Override // W1.k0
    public final boolean m(Object obj) {
        boolean u3 = ((u) obj).u();
        if (!u3) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return u3;
    }

    @Override // W1.k0
    public final Object n(Object obj, Object obj2, Object obj3) {
        u uVar = (u) obj;
        u uVar2 = (u) obj2;
        u uVar3 = (u) obj3;
        if (uVar != null && uVar2 != null) {
            C0709A c0709a = new C0709A();
            c0709a.O(uVar);
            c0709a.O(uVar2);
            c0709a.f12493T = false;
            uVar = c0709a;
        } else if (uVar == null) {
            uVar = uVar2 != null ? uVar2 : null;
        }
        if (uVar3 == null) {
            return uVar;
        }
        C0709A c0709a2 = new C0709A();
        if (uVar != null) {
            c0709a2.O(uVar);
        }
        c0709a2.O(uVar3);
        return c0709a2;
    }

    @Override // W1.k0
    public final Object o(Object obj, Object obj2) {
        C0709A c0709a = new C0709A();
        if (obj != null) {
            c0709a.O((u) obj);
        }
        c0709a.O((u) obj2);
        return c0709a;
    }

    @Override // W1.k0
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((u) obj).a(new C0732i(view, arrayList));
    }

    @Override // W1.k0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((u) obj).a(new C0733j(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // W1.k0
    public final void r(float f4, Object obj) {
        r rVar = (r) obj;
        boolean z8 = rVar.f12560b;
        if (z8) {
            C0709A c0709a = rVar.g;
            long j = c0709a.L;
            long j10 = f4 * ((float) j);
            if (j10 == 0) {
                j10 = 1;
            }
            if (j10 == j) {
                j10 = j - 1;
            }
            if (rVar.f12562d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j11 = rVar.f12559a;
            if (j10 == j11 || !z8) {
                return;
            }
            if (!rVar.f12561c) {
                if (j10 == 0 && j11 > 0) {
                    j10 = -1;
                } else if (j10 == j && j11 < j) {
                    j10 = j + 1;
                }
                if (j10 != j11) {
                    c0709a.F(j10, j11);
                    rVar.f12559a = j10;
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            A4.s sVar = rVar.f12563e;
            int i7 = (sVar.f470a + 1) % 20;
            sVar.f470a = i7;
            ((long[]) sVar.f471b)[i7] = currentAnimationTimeMillis;
            ((float[]) sVar.f472c)[i7] = (float) j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Z9.x, java.lang.Object] */
    @Override // W1.k0
    public final void s(View view, Object obj) {
        if (view != null) {
            k0.j(new Rect(), view);
            ((u) obj).H(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Z9.x, java.lang.Object] */
    @Override // W1.k0
    public final void t(Object obj, Rect rect) {
        ((u) obj).H(new Object());
    }

    @Override // W1.k0
    public final void u(W1.C c10, Object obj, Q7.a aVar, RunnableC0569l runnableC0569l) {
        v(obj, aVar, null, runnableC0569l);
    }

    @Override // W1.k0
    public final void v(Object obj, Q7.a aVar, S2 s22, Runnable runnable) {
        u uVar = (u) obj;
        M9.e eVar = new M9.e(s22, uVar, runnable, 6);
        synchronized (aVar) {
            while (aVar.f8670b) {
                try {
                    try {
                        aVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((M9.e) aVar.f8671c) != eVar) {
                aVar.f8671c = eVar;
                if (aVar.f8669a) {
                    S2 s23 = (S2) eVar.f6855c;
                    if (s23 == null) {
                        ((u) eVar.f6856d).d();
                        ((Runnable) eVar.f6854b).run();
                    } else {
                        s23.run();
                    }
                }
            }
        }
        uVar.a(new C0734k(runnable));
    }

    @Override // W1.k0
    public final void w(Object obj, View view, ArrayList arrayList) {
        C0709A c0709a = (C0709A) obj;
        ArrayList arrayList2 = c0709a.f12592f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            k0.f(arrayList2, (View) arrayList.get(i7));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c0709a, arrayList);
    }

    @Override // W1.k0
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0709A c0709a = (C0709A) obj;
        if (c0709a != null) {
            ArrayList arrayList3 = c0709a.f12592f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(c0709a, arrayList, arrayList2);
        }
    }

    @Override // W1.k0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        C0709A c0709a = new C0709A();
        c0709a.O((u) obj);
        return c0709a;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        u uVar = (u) obj;
        int i7 = 0;
        if (uVar instanceof C0709A) {
            C0709A c0709a = (C0709A) uVar;
            int size = c0709a.f12492S.size();
            while (i7 < size) {
                z(c0709a.P(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (k0.k(uVar.f12591e)) {
            ArrayList arrayList3 = uVar.f12592f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i7 < size2) {
                    uVar.b((View) arrayList2.get(i7));
                    i7++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    uVar.C((View) arrayList.get(size3));
                }
            }
        }
    }
}
