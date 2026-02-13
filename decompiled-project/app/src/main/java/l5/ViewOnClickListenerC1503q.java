package l5;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import m4.C1549C;
import m4.L0;
import m4.u0;
import m4.v0;
import m4.x0;
import n5.AbstractC1705a;

/* renamed from: l5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1503q implements v0, M, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f19537a;

    public ViewOnClickListenerC1503q(B b2) {
        this.f19537a = b2;
    }

    @Override // l5.M
    public final void d(long j) {
        B b2 = this.f19537a;
        b2.f19264B0 = true;
        TextView textView = b2.f19287R;
        if (textView != null) {
            textView.setText(n5.D.B(b2.f19289T, b2.f19290U, j));
        }
        b2.f19293a.f();
    }

    @Override // l5.M
    public final void e(long j, boolean z8) {
        x0 x0Var;
        B b2 = this.f19537a;
        b2.f19264B0 = false;
        if (!z8 && (x0Var = b2.f19322v0) != null) {
            if (b2.f19262A0) {
                C9.h hVar = (C9.h) x0Var;
                if (hVar.o(17) && hVar.o(10)) {
                    L0 Y2 = ((C1549C) hVar).Y();
                    int o10 = Y2.o();
                    int i7 = 0;
                    while (true) {
                        long Z7 = n5.D.Z(Y2.m(i7, b2.f19292W, 0L).f20015B);
                        if (j < Z7) {
                            break;
                        }
                        if (i7 == o10 - 1) {
                            j = Z7;
                            break;
                        } else {
                            j -= Z7;
                            i7++;
                        }
                    }
                    hVar.y(i7, j, false);
                }
            } else {
                C9.h hVar2 = (C9.h) x0Var;
                if (hVar2.o(5)) {
                    hVar2.z(5, j);
                }
            }
            b2.o();
        }
        b2.f19293a.g();
    }

    @Override // l5.M
    public final void f(long j) {
        B b2 = this.f19537a;
        TextView textView = b2.f19287R;
        if (textView != null) {
            textView.setText(n5.D.B(b2.f19289T, b2.f19290U, j));
        }
    }

    @Override // m4.v0
    public final void h(C1549C c1549c, u0 u0Var) {
        boolean a9 = u0Var.a(4, 5, 13);
        B b2 = this.f19537a;
        if (a9) {
            b2.m();
        }
        if (u0Var.a(4, 5, 7, 13)) {
            b2.o();
        }
        if (u0Var.a(8, 13)) {
            b2.p();
        }
        if (u0Var.a(9, 13)) {
            b2.r();
        }
        if (u0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            b2.l();
        }
        if (u0Var.a(11, 0, 13)) {
            b2.s();
        }
        if (u0Var.a(12, 13)) {
            b2.n();
        }
        if (u0Var.a(2, 13)) {
            b2.t();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        B b2 = this.f19537a;
        x0 x0Var = b2.f19322v0;
        if (x0Var == null) {
            return;
        }
        G g = b2.f19293a;
        g.g();
        if (b2.f19263B == view) {
            C9.h hVar = (C9.h) x0Var;
            if (hVar.o(9)) {
                hVar.A();
                return;
            }
            return;
        }
        if (b2.f19261A == view) {
            C9.h hVar2 = (C9.h) x0Var;
            if (hVar2.o(7)) {
                hVar2.C();
                return;
            }
            return;
        }
        if (b2.f19266D == view) {
            if (((C1549C) x0Var).d0() != 4) {
                C9.h hVar3 = (C9.h) x0Var;
                if (hVar3.o(12)) {
                    hVar3.x();
                    return;
                }
                return;
            }
            return;
        }
        if (b2.f19268E == view) {
            C9.h hVar4 = (C9.h) x0Var;
            if (hVar4.o(11)) {
                hVar4.w();
                return;
            }
            return;
        }
        if (b2.f19265C == view) {
            if (n5.D.V(x0Var)) {
                n5.D.G(x0Var);
                return;
            } else {
                n5.D.F(x0Var);
                return;
            }
        }
        if (b2.f19274H == view) {
            if (((C9.h) x0Var).o(15)) {
                C1549C c1549c = (C1549C) x0Var;
                c1549c.E0();
                c1549c.r0(AbstractC1705a.z(c1549c.f19833R, b2.f19269E0));
                return;
            }
            return;
        }
        if (b2.f19276I == view) {
            if (((C9.h) x0Var).o(14)) {
                C1549C c1549c2 = (C1549C) x0Var;
                c1549c2.E0();
                c1549c2.t0(!c1549c2.f19834S);
                return;
            }
            return;
        }
        View view2 = b2.f19283N;
        if (view2 == view) {
            g.f();
            b2.e(b2.f19303f, view2);
            return;
        }
        View view3 = b2.f19284O;
        if (view3 == view) {
            g.f();
            b2.e(b2.f19319u, view3);
            return;
        }
        View view4 = b2.f19285P;
        if (view4 == view) {
            g.f();
            b2.e(b2.f19323w, view4);
            return;
        }
        ImageView imageView = b2.f19280K;
        if (imageView == view) {
            g.f();
            b2.e(b2.f19321v, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        B b2 = this.f19537a;
        if (b2.f19281K0) {
            b2.f19293a.g();
        }
    }
}
