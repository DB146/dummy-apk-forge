package A9;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class B implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W1.C f766c;

    public /* synthetic */ B(W1.C c10, View view, int i7) {
        this.f764a = i7;
        this.f766c = c10;
        this.f765b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f764a) {
            case 0:
                this.f765b.getViewTreeObserver().removeOnPreDrawListener(this);
                D d10 = (D) this.f766c;
                if (d10.C() == null || d10.f10277U == null) {
                    return true;
                }
                Object s02 = d10.s0();
                d10.f786F0 = s02;
                if (s02 != null) {
                    E6.b.c(s02, new C(d10, 0));
                }
                d10.x0();
                Object obj = d10.f786F0;
                if (obj != null) {
                    d10.y0(obj);
                } else {
                    d10.f785E0.g(d10.C0);
                }
                return false;
            default:
                this.f765b.getViewTreeObserver().removeOnPreDrawListener(this);
                c2.p pVar = (c2.p) this.f766c;
                if (pVar.C() == null || pVar.f10277U == null) {
                    return true;
                }
                Transition u3 = E6.b.u(pVar.C(), R.transition.lb_details_enter_transition);
                if (u3 != null) {
                    E6.b.c(u3, new C(pVar, 3));
                }
                throw null;
        }
    }
}
