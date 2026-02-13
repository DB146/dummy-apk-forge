package A9;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class s3 extends C0135s1 {
    public final /* synthetic */ u3 j;

    public s3(u3 u3Var) {
        this.j = u3Var;
    }

    @Override // A9.C0135s1
    public final void n(C0131r1 c0131r1) {
        c0131r1.f4707a.setActivated(true);
    }

    @Override // A9.C0135s1
    public final void o(C0131r1 c0131r1) {
        if (this.j.f1417f != null) {
            c0131r1.f1355v.f1271a.setOnClickListener(new A0(this, c0131r1, 3));
        }
    }

    @Override // A9.C0135s1
    public final void p(C0131r1 c0131r1) {
        View view = c0131r1.f4707a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        e3 e3Var = this.j.g;
        if (e3Var != null) {
            e3Var.a(view);
        }
    }

    @Override // A9.C0135s1
    public final void r(C0131r1 c0131r1) {
        if (this.j.f1417f != null) {
            c0131r1.f1355v.f1271a.setOnClickListener(null);
        }
    }
}
