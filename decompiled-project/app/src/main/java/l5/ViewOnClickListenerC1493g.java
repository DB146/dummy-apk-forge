package l5;

import android.view.View;
import android.widget.TextView;
import m4.C1549C;
import m4.L0;
import m4.u0;
import m4.v0;
import m4.x0;
import n5.AbstractC1705a;

/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1493g implements v0, M, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1496j f19464a;

    public ViewOnClickListenerC1493g(C1496j c1496j) {
        this.f19464a = c1496j;
    }

    @Override // l5.M
    public final void d(long j) {
        C1496j c1496j = this.f19464a;
        c1496j.f19490b0 = true;
        TextView textView = c1496j.f19465A;
        if (textView != null) {
            textView.setText(n5.D.B(c1496j.f19467C, c1496j.f19468D, j));
        }
    }

    @Override // l5.M
    public final void e(long j, boolean z8) {
        x0 x0Var;
        int U8;
        C1496j c1496j = this.f19464a;
        c1496j.f19490b0 = false;
        if (z8 || (x0Var = c1496j.f19484U) == null) {
            return;
        }
        C1549C c1549c = (C1549C) x0Var;
        L0 Y2 = c1549c.Y();
        if (c1496j.f19488a0 && !Y2.p()) {
            int o10 = Y2.o();
            U8 = 0;
            while (true) {
                long Z7 = n5.D.Z(Y2.m(U8, c1496j.f19470F, 0L).f20015B);
                if (j < Z7) {
                    break;
                }
                if (U8 == o10 - 1) {
                    j = Z7;
                    break;
                } else {
                    j -= Z7;
                    U8++;
                }
            }
        } else {
            U8 = c1549c.U();
        }
        c1549c.y(U8, j, false);
        c1496j.h();
    }

    @Override // l5.M
    public final void f(long j) {
        C1496j c1496j = this.f19464a;
        TextView textView = c1496j.f19465A;
        if (textView != null) {
            textView.setText(n5.D.B(c1496j.f19467C, c1496j.f19468D, j));
        }
    }

    @Override // m4.v0
    public final void h(C1549C c1549c, u0 u0Var) {
        boolean a9 = u0Var.a(4, 5);
        C1496j c1496j = this.f19464a;
        if (a9) {
            c1496j.g();
        }
        if (u0Var.a(4, 5, 7)) {
            c1496j.h();
        }
        n5.f fVar = u0Var.f20508a;
        if (fVar.f21175a.get(8)) {
            c1496j.i();
        }
        if (fVar.f21175a.get(9)) {
            c1496j.j();
        }
        if (u0Var.a(8, 9, 11, 0, 13)) {
            c1496j.f();
        }
        if (u0Var.a(11, 0)) {
            c1496j.k();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1496j c1496j = this.f19464a;
        x0 x0Var = c1496j.f19484U;
        if (x0Var == null) {
            return;
        }
        if (c1496j.f19493d == view) {
            ((C9.h) x0Var).A();
            return;
        }
        if (c1496j.f19491c == view) {
            ((C9.h) x0Var).C();
            return;
        }
        if (c1496j.f19510u == view) {
            if (((C1549C) x0Var).d0() != 4) {
                ((C9.h) x0Var).x();
                return;
            }
            return;
        }
        if (c1496j.f19511v == view) {
            ((C9.h) x0Var).w();
            return;
        }
        if (c1496j.f19495e == view) {
            n5.D.G(x0Var);
            return;
        }
        if (c1496j.f19497f == view) {
            n5.D.F(x0Var);
            return;
        }
        if (c1496j.f19512w == view) {
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            c1549c.r0(AbstractC1705a.z(c1549c.f19833R, c1496j.f19496e0));
        } else if (c1496j.f19513x == view) {
            C1549C c1549c2 = (C1549C) x0Var;
            c1549c2.E0();
            c1549c2.t0(!c1549c2.f19834S);
        }
    }
}
