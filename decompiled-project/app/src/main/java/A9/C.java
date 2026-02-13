package A9;

import android.transition.Transition;
import android.view.View;

/* loaded from: classes2.dex */
public final class C extends O5.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f774d;

    public /* synthetic */ C(Object obj, int i7) {
        this.f773c = i7;
        this.f774d = obj;
    }

    @Override // O5.b
    public final void A(Transition transition) {
        W1.C c10;
        View view;
        switch (this.f773c) {
            case 0:
                D d10 = (D) this.f774d;
                d10.f786F0 = null;
                d10.f785E0.g(d10.C0);
                return;
            case 1:
                W w10 = (W) this.f774d;
                w10.f1027o1 = null;
                Q q10 = w10.f999M0;
                if (q10 != null) {
                    q10.b();
                    if (!w10.f1011Y0 && (c10 = w10.f1000N0) != null && (view = c10.f10277U) != null && !view.hasFocus()) {
                        view.requestFocus();
                    }
                }
                w10.N0();
                return;
            case 2:
                ((C0084f1) this.f774d).f1154s = null;
                return;
            default:
                c2.p pVar = (c2.p) this.f774d;
                pVar.getClass();
                pVar.C0.h(pVar.f14170A0);
                return;
        }
    }
}
