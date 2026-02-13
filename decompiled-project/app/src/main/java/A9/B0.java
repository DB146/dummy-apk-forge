package A9;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class B0 extends C0135s1 {
    public final /* synthetic */ int j;
    public final C0152w2 k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0156x2 f767l;

    public /* synthetic */ B0(AbstractC0156x2 abstractC0156x2, C0152w2 c0152w2, int i7) {
        this.j = i7;
        this.f767l = abstractC0156x2;
        this.k = c0152w2;
    }

    @Override // A9.C0135s1
    public void m(AbstractC0113m2 abstractC0113m2, int i7) {
        switch (this.j) {
            case 1:
                H2.X recycledViewPool = ((C0147v1) this.k).f1433o.getRecycledViewPool();
                HashMap hashMap = ((C0151w1) this.f767l).k;
                int intValue = hashMap.containsKey(abstractC0113m2) ? ((Integer) hashMap.get(abstractC0113m2)).intValue() : 24;
                H2.W a9 = recycledViewPool.a(i7);
                a9.f4620b = intValue;
                ArrayList arrayList = a9.f4619a;
                while (arrayList.size() > intValue) {
                    arrayList.remove(arrayList.size() - 1);
                }
                return;
            default:
                return;
        }
    }

    @Override // A9.C0135s1
    public final void n(C0131r1 c0131r1) {
        switch (this.j) {
            case 0:
                E0 e02 = (E0) this.k;
                ViewOnLayoutChangeListenerC0062a viewOnLayoutChangeListenerC0062a = e02.f814y;
                View view = c0131r1.f4707a;
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0062a);
                view.addOnLayoutChangeListener(e02.f814y);
                return;
            default:
                C0147v1 c0147v1 = (C0147v1) this.k;
                C0151w1 c0151w1 = (C0151w1) this.f767l;
                View view2 = c0131r1.f4707a;
                c0151w1.y(c0147v1, view2);
                int i7 = c0147v1.f1462f;
                if (i7 == 1) {
                    view2.setActivated(true);
                    return;
                } else {
                    if (i7 == 2) {
                        view2.setActivated(false);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // A9.C0135s1
    public final void o(C0131r1 c0131r1) {
        switch (this.j) {
            case 0:
                if (((E0) this.k).f1467n == null) {
                    ((F0) this.f767l).getClass();
                    return;
                }
                A0 a02 = new A0(this, c0131r1, 0);
                c0131r1.f1354u.h(c0131r1.f1355v, a02);
                return;
            default:
                if (((C0147v1) this.k).f1467n != null) {
                    c0131r1.f1355v.f1271a.setOnClickListener(new A0(this, c0131r1, 2));
                    return;
                }
                return;
        }
    }

    @Override // A9.C0135s1
    public void p(C0131r1 c0131r1) {
        switch (this.j) {
            case 1:
                View view = c0131r1.f4707a;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).setTransitionGroup(true);
                }
                e3 e3Var = ((C0151w1) this.f767l).f1456l;
                if (e3Var != null) {
                    e3Var.a(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // A9.C0135s1
    public void q(C0131r1 c0131r1) {
        switch (this.j) {
            case 0:
                E0 e02 = (E0) this.k;
                c0131r1.f4707a.removeOnLayoutChangeListener(e02.f814y);
                e02.c();
                return;
            default:
                return;
        }
    }

    @Override // A9.C0135s1
    public final void r(C0131r1 c0131r1) {
        switch (this.j) {
            case 0:
                if (((E0) this.k).f1467n == null) {
                    ((F0) this.f767l).getClass();
                    return;
                } else {
                    c0131r1.f1354u.h(c0131r1.f1355v, null);
                    return;
                }
            default:
                if (((C0147v1) this.k).f1467n != null) {
                    c0131r1.f1355v.f1271a.setOnClickListener(null);
                    return;
                }
                return;
        }
    }
}
